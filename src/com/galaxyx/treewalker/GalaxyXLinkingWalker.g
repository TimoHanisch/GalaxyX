tree grammar GalaxyXLinkingWalker;

options {
  	language = Java;
  	tokenVocab = GalaxyXLinkingParser;
  	ASTLabelType = CommonTree;
} 

@header {
	package com.galaxyx.treewalker;
	
	import com.galaxyx.utils.SymbolTable;
	import com.galaxyx.utils.ErrorHandler;
	import com.galaxyx.utils.ErrorHandler.Error;
	import com.galaxyx.constructs.Namespace;
	import com.galaxyx.constructs.Class;
	import com.galaxyx.constructs.Method;
	import com.galaxyx.constructs.Field;
	import com.galaxyx.constructs.Local;
	import com.galaxyx.constructs.SightModifier;
	import com.galaxyx.constructs.Method.Constructor;
	import com.galaxyx.constructs.Method.Destructor;
	import com.galaxyx.semantic.Type;
} 

@members{
	private SymbolTable table;
	private ErrorHandler errHandler; 
	
	private Namespace currentNamespace;
	private Class currentClass;
	private Method currentMethod;
}

eval[SymbolTable table, ErrorHandler errHandler]
@init{
	this.table = table;
	this.errHandler = errHandler;
}
	:	namespace_decl* 
	; 
 
 
namespace_decl
	:	^(NAMESPACE id=IDENTIFIER 
	{
		currentNamespace = table.getNamespace($id.text);
	}
		class_decl* method_decl* field_decl*)
	{
		currentNamespace = null;
	}
	;
	
class_decl
	:	^(CLASS id=IDENTIFIER 
	{
		currentClass = currentNamespace.getClass($id.text);
	}
		field_decl* method_decl* constructor_decl* destructor_decl*)
	{
		currentClass = null;
	}
	;
	
field_decl
@init{
	int arrayCount = -1;
}
	:	^(FIELD m=modifier? s=STATIC? c=CONST? t=type (array {arrayCount++;})* id=IDENTIFIER
	{
		Field f = new Field($id.text,m != null?m:SightModifier.NAMESPACE,s != null, c != null, arrayCount != -1,arrayCount,t);
		if(currentClass == null){
			if(s == null){
				errHandler.reportError(new Error("Field $1 has to be static",id.token));
			}else{
				if(!currentNamespace.addField(f)){
					errHandler.reportError(new Error("Field $1 already exists within namespace "+currentNamespace,id.token));
				}
			}
		}else{
			if(!currentClass.addField(f)){
				errHandler.reportError(new Error("Field $1 already exists within class "+currentClass,id.token));
			}
		}
	}
		)
	;
	
method_decl
	:	^(FUNC t=type m=modifier? s=STATIC? id=IDENTIFIER p=parameter_list? 
	{
		Method method = new Method($id.text,m != null?m:SightModifier.NAMESPACE,s != null,t);
		if(currentClass == null){
			if(s == null){
				errHandler.reportError(new Error("Method $1 has to be static",id.token));
			}else{
				if(!currentNamespace.addMethod(method)){
					errHandler.reportError(new Error("Method $1 already exists within namespace "+currentNamespace,id.token));
				}
			}
		}else{
			if(!currentClass.addMethod(method)){
				errHandler.reportError(new Error("Method $1 already exists within class "+currentClass,id.token));
			}
		}
		currentMethod = method;
	}
		(l=local_decl
	{
		if(!currentMethod.addLocal(l)){
			errHandler.reportError(new Error("Local variable "+l+" already defined for method §1", id.token));
		}
	}
		)*
	{
		currentMethod = null;
	}
		)
	;
	
constructor_decl
	:	^(c=CONSTRUCTOR p=parameter_list? 
	{
		Local[] params = (p == null? null : new Local[p.size()]);
		Method.Constructor constr = new Method.Constructor(params);
		if(params != null){
			for(Local para : params){
				if(!constr.addLocal(para)){
					errHandler.reportError(new Error("Parameter "+para+" already defined for constructor"));
				}
			}
		}
		if(!currentClass.addConstructor(constr)){
			errHandler.reportError(new Error("Constructor $1 with same parameters already defined for class"+currentClass,c.token));
		}
		currentMethod = constr;
	}
		(l=local_decl
	{
		if(!currentMethod.addLocal(l)){
			errHandler.reportError(new Error("Local variable "+l+" already defined for constructor"));
		}
	}
		)*
	{
		currentMethod = null;
	}	
		)
	;
	
destructor_decl
	:	^(d=DESTRUCTOR p=parameter_list? 
	{
		Local[] params = (p == null? null : new Local[p.size()]);
		Method.Destructor destr = new Method.Destructor(params);
		if(params != null){
			for(Local para : params){
				if(!destr.addLocal(para)){
					errHandler.reportError(new Error("Parameter "+para+" already defined for destructor"));
				}
			}
		}
		if(!currentClass.addDestructor(destr)){
			errHandler.reportError(new Error("Destructor $1 with same parameters already defined for class "+currentClass,d.token));
		}
		currentMethod = destr;
	}
		(l=local_decl
	{
		if(!currentMethod.addLocal(l)){
			errHandler.reportError(new Error("Local variable "+l+" already defined for destructor"));
		}
	}
		)*
	{
		currentMethod = destr;
	}	
		)
	;
	
local_decl returns [Local l]
@init{
	int arrayCount = -1;
}
	:	^(LOCAL c=CONST? t=type (array {arrayCount++;})* i=IDENTIFIER
	{
		l = new Local($i.text,t,arrayCount != -1,arrayCount,c != null);
	}
		)
	;
	
modifier returns [SightModifier m]
	:	PUBLIC {m = SightModifier.PUBLIC;} 
	| 	PRIVATE {m = SightModifier.PRIVATE;}
	;
	
array
	:	^(ARRAY TMP)
	;	
	
parameter_list returns [List<Local> params]
@init{
	params = new ArrayList<Local>();
}
	:	^(PARAMETER_LIST p1=parameter 
	{
		params.add(p1);
	}
		(p2=parameter
	{
		params.add(p2);
	}		
		)*
		)
	;	
	
parameter returns [Local l]
	:	^(PARAMETER t=type i=IDENTIFIER
	{
		l = new Local($i.text,t,false,-1,false);
	}
		)
	;
	
type returns [Type t]
	:	^(NAMESPACE_TYPE namespace=IDENTIFIER id=IDENTIFIER
	{
		Namespace namespaceAccess = table.getNamespace($namespace.text);
		if(namespaceAccess == null){
			errHandler.reportError(new Error("Namespace $1 does not exist",namespace.token));
		}else{
			if(namespaceAccess.getClass($id.text) == null || namespaceAccess.getClass($id.text).getModifier() != SightModifier.PUBLIC){
				errHandler.reportError(new Error("Class $1 within namespace $2 is does not exist or is not public",id.token,namespace.token));
			}else{
				t = Type.getType(namespaceAccess + "_" + $id.text);
			}
		}
	}
		)
	|	^(TYPE id=IDENTIFIER
	{
		if((t = Type.getType($id.text)) == null && (t = Type.getType(currentNamespace + "_" + $id.text)) == null){
			errHandler.reportError(new Error("Type $1 could not be resolved to a native or class type",id.token));
		}
	}
		)
	;