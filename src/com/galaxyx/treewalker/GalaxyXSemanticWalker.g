tree grammar GalaxyXSemanticWalker;

options {
  language = Java;
  tokenVocab = GalaxyXSemanticParser;
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
	import com.galaxyx.semantic.*;
} 

@members{
	
	private Stack dotStack;

	private SymbolTable table;
	private ErrorHandler errHandler; 
	
	private Namespace currentNamespace;
	private Class currentClass;
	private Method currentMethod;
	
	private Namespace namespaceAccess;
	private Class dotClass;
	private boolean dotStatic = false;
	
	private Error getLogicalError(Token t){
		return new Error("Logical operators only except boolean expressions",t);
	}	
	
	private Error getRelationError(Token t){
		return new Error("Relation operators only except same type expressions",t);
	}
	
	private Error getBitOpError(Token t){
		return new Error("Bit operations only except integer expressions");
	} 
}

eval[SymbolTable table, ErrorHandler errHandler]
@init{
	this.table = table;
	this.errHandler = errHandler;
}
	: namespace_decl*
	;
	
namespace_decl
	:	^(NAMESPACE id=IDENTIFIER 
	{
		currentNamespace = table.getNamespace($id.text);
	}
		class_decl* function_decl* field_decl* initializer*
	{
		currentNamespace = null;
	}	
		)
	;
	
class_decl
	:	^(CLASS id=IDENTIFIER 
	{
		currentClass = currentNamespace.getClass($id.text);
	}
		field_decl* function_decl* constructor_decl* destructor_decl*
	{
		currentClass = null;
	}	
		)
	;
	
field_decl
	:	^(FIELD IDENTIFIER assign?)
	; 

function_decl
	:	^(FUNC id=IDENTIFIER 
	{
		currentMethod = currentClass == null? currentNamespace.getMethod($id.text) : currentClass.getMethod($id.text);
	}
		local_var_decl* statement*
	{
		currentMethod = null;
	}
		)
	;
	
constructor_decl
	:	^(CONSTRUCTOR list=parameter_list? 
	{
		if(!list.isEmpty()){
			Type[] types = new Type[list.size()];
			for(int i = 0; i < list.size(); i++){
				types[i] = list.get(i);
			}
			currentMethod = currentClass.getConstructor(types);	
		}else{
			currentMethod = currentClass.getConstructor(null);	
		}
	}
		local_var_decl* statement*
	{
		currentMethod = null;
	}	
		)
	;
	
destructor_decl
	:	^(DESTRUCTOR list=parameter_list? 
	{
		if(list != null){
			Type[] types = new Type[list.size()];
			for(int i = 0; i < list.size(); i++){
				types[i] = list.get(i);
			}
			currentMethod = currentClass.getDestructor(types);	
		}else{
			currentMethod = currentClass.getDestructor(null);	
		}
	}
		local_var_decl* statement*
	{
		currentMethod = null;
	}
		)
	;
	
initializer
	:	^(INITIALIZER local_var_decl* statement*)
	;
	
local_var_decl
	:	^(LOCAL IDENTIFIER assign?)
	;
	
assign
	:	^(ASSGN expression)
	;
	
parameter_list returns [List<Type> params]
@init{
	params = new ArrayList<Type>();
}
	:	^(PARAMETER_LIST p=parameter {params.add(p);} 
		(p2=parameter {params.add(p2);})*)
	;
	
parameter returns [Type t]
	:	^(PARAMETER t1=type{t = t1;})
	;
	
statement
	:	^(r=RETURN e1 = expression
	{
		if(currentMethod.getType() == null){
			errHandler.reportError(new Error("No return expression allowed here",r.token));
		}else{
			if(e1.type != currentMethod.getType()){
				errHandler.reportError(new Error("Wrong expression type returned",r.token));
			}
		}
	}
		)
	;
	
expression returns [Expr e]
	:	^(LOR a = expression b = expression 
	{
		if(a != null && b != null){
			e = new Or(a,b);
			if(e.type == null){
				errHandler.reportError(getLogicalError($LOR.token));
			}
		}
	}
		)
	| 	^(LAND a = expression b = expression
	{
		if(a != null && b != null){
			e = new And(a,b);
			if(e.type == null){
				errHandler.reportError(getLogicalError($LAND.token));
			}
		}
	}
		)
	| 	^(r = EQ a = expression b = expression
	{
		if(a != null && b != null){
			e = new Rel($r.text,a,b);
			if(e.type == null){
				errHandler.reportError(getRelationError($r.token));
			}
		}
	}
		)
	| 	^(r = NEQ a = expression b = expression
	{
		if(a != null && b != null){
			e = new Rel($r.text,a,b);
			if(e.type == null){
				errHandler.reportError(getRelationError($r.token));
			}
		}
	}
		)
	| 	^(r = LT a = expression b = expression
	{
		if(a != null && b != null){
			e = new Rel($r.text,a,b);
			if(e.type == null){
				errHandler.reportError(getRelationError($r.token));
			}
		}
	}
		)
	| 	^(r = LTEQ a = expression b = expression
	{
		if(a != null && b != null){
			e = new Rel($r.text,a,b);
			if(e.type == null){
				errHandler.reportError(getRelationError($r.token));
			}
		}
	}
		)
	|	^(r = GT a = expression b = expression
	{
		if(a != null && b != null){
			e = new Rel($r.text,a,b);
			if(e.type == null){
				errHandler.reportError(getRelationError($r.token));
			}
		}
	}
		)
	| 	^(r = GTEQ a = expression b = expression
	{
		if(a != null && b != null){
			e = new Rel($r.text,a,b);
			if(e.type == null){
				errHandler.reportError(getRelationError($r.token));
			}
		}
	}
		)
	| 	^(o = SHIFTL a = expression b = expression
	{
		if(a != null && b != null){
			e = new BitArith($o.text,a,b);
			if(e.type == null){
				errHandler.reportError(getBitOpError($o.token));
			}
		}
	}
		)
	| 	^(o = SHIFTR a = expression b = expression
	{
		if(a != null && b != null){
			e = new BitArith($o.text,a,b);
			if(e.type == null){
				errHandler.reportError(getBitOpError($o.token));
			}
		}
	}
		)
	| 	^(o = PLUS a = expression b = expression
	{
		if(a != null && b != null){
			e = new Plus($o.text,a,b);
			if(e.type == null){
				errHandler.reportError(new Error("Plus operator can only be used for numerical and string expressions",$o.token));
			}
		}
	}
		)
	| 	^(o = SUB a = expression b = expression
	{
		if(a != null && b != null){
			e = new Arith($o.text,a,b);
			if(e.type == null){
				errHandler.reportError(new Error("Substraction operator can only be used for numerical expressions",$o.token));
			}
		}
	}
		)
	| 	^(o = TIMES a = expression b = expression
	{
		if(a != null && b != null){
			e = new Arith($o.text,a,b);
			if(e.type == null){
				errHandler.reportError(new Error("Times operator can only be used for numerical expressions",$o.token));
			}
		}
	}
		)
	| 	^(o = DIV a = expression b = expression
	{
		if(a != null && b != null){
			e = new Arith($o.text,a,b);
			if(e.type == null){
				errHandler.reportError(new Error("Division operator can only be used for numerical expressions",$o.token));
			}
		}
	}
		)
	| 	^(o = MOD a = expression b = expression
	{
		if(a != null && b != null){
			e = new Arith($o.text,a,b);
			if(e.type == null){
				errHandler.reportError(new Error("Modulo operator can only be used for numerical expressions",$o.token));
			}
		}
	}
		)
	| 	^(o = NOT a = expression
	{
		if(a != null){
			e = new Not(a);
			if(e.type == null){
				errHandler.reportError(new Error("Not can only be applied to boolean expressions",$o.token));
			}
		}
	}	
		)
	| 	^(NEGATION a = expression
	{
		if(a != null){
			e = new Unary("-",a);
			if(e.type == null){
				errHandler.reportError(new Error("Negation can only be applied to numerical expressions",$o.token));
			}
		}
	}
		)
	| 	^(o = BIT_NOT a = expression
	{
		if(a != null){
			e = new BitNot("~",a);
			if(e.type == null){
				errHandler.reportError(getBitOpError($o.token));
			}
		}
	}
		)				
	|	^(o = OR a = expression b = expression
	{
		if(a != null){
			e = new BitArith("|",a,b);
			if(e.type == null){
				errHandler.reportError(getBitOpError($o.token));
			}
		}
	}
		)	
	|	^(o = XOR a = expression b = expression
	{
		if(a != null){
			e = new BitArith("|",a,b);
			if(e.type == null){
				errHandler.reportError(getBitOpError($o.token));
			}
		}
	}
		)	
	|	^(o = AND a = expression b = expression
	{
		if(a != null){
			e = new BitArith("|",a,b);
			if(e.type == null){
				errHandler.reportError(getBitOpError($o.token));
			}
		}
	}
		)	
	|	^(o = NEW ns=namespace_access? c1=IDENTIFIER list = expression_list?
	{
		if(ns == null){
			Class constrClass = currentNamespace.getClass($c1.text);
			if(constrClass != null){
				Constructor constr;
				if(a != null){
					Type[] types = new Type[list.size()];
					for(int i = 0; i < list.size(); i++){
						types[i] = list.get(i).type;
					}
					constr = constrClass.getConstructor(types);	
				}else{
					constr = constrClass.getConstructor(null);
				}
				if(constr == null){
					errHandler.reportError(new Error("Constructor does not exist for class $2",$o.token,$c1.token));
				}else{
					e = new ClassExpr("new",Type.getType(currentNamespace+"_"+constrClass));
				}
			}else{
				errHandler.reportError(new Error("Class $1 does not exist within namespace "+currentNamespace,$c1.token));
			}
		}else{
			Namespace namespace = table.getNamespace(ns);
			if(namespace != null){
				Class constrClass = namespace.getClass($c1.text);
				if(constrClass != null){
					Constructor constr;
					if(a != null){
						Type[] types = new Type[list.size()];
						for(int i = 0; i < list.size(); i++){
							types[i] = list.get(i).type;
						}
						constr = constrClass.getConstructor(types);	
					}else{
						constr = constrClass.getConstructor(null);
					}
					if(constr == null){
						errHandler.reportError(new Error("Constructor does not exist for class $2",$o.token,$c1.token));
					}else{
						e = new ClassExpr("new",Type.getType(namespace+"_"+constrClass));
					}
				}else{
					errHandler.reportError(new Error("Class $1 does not exist within namespace "+namespace,$c1.token));
				}
			}else{
				errHandler.reportError(new Error("Namespace"+ns+"does not exist",$o.token));
			}
		}
	}
		)
	|	^(o = DELETE a = expression
	{

	}
		)
	|	^(DOT id=IDENTIFIER e1 = dot_expression {e = e1;})
	|	^(NAMESPACE_ACCESS id=IDENTIFIER expression)
	|	e1 = constant {e = e1;}
	|	id=IDENTIFIER
	{
		boolean found = true;
		if(currentMethod == null){
			if(currentClass == null){
				if(currentNamespace.getField($id.text) == null){
					found = false;
				}else{
					e = new Constant($id.text,currentNamespace.getField($id.text).getType());
				}
			}else{
				if(currentClass.getField($id.text) == null){
					if(currentNamespace.getField($id.text) == null){
						found = false;
					}else{
						e = new Constant($id.text,currentNamespace.getField($id.text).getType());
					}
				}else{
					e = new Constant($id.text,currentClass.getField($id.text).getType());
				}
			}
		}else{
			if(currentMethod.getLocal($id.text) == null){
				if(currentClass.getField($id.text) == null){
					if(currentNamespace.getField($id.text) == null){
						found = false;
					}else{
						e = new Constant($id.text,currentNamespace.getField($id.text).getType());
					}
				}else{
					e = new Constant($id.text,currentClass.getField($id.text).getType());
				}
			}else{
				e = new Constant($id.text,currentMethod.getLocal($id.text).getType());
			}
		}
		if(!found){
			errHandler.reportError(new Error("Could not find variable $1",$id.token));
		}
	}
	|	function_expression
	;
	
dot_expression returns [Expr e]
	:	^(DOT IDENTIFIER dot_expression)
	|	IDENTIFIER
	|	^(ARRAY_EXPRESSION IDENTIFIER expression+)
	|	function_expression
	;

constant returns [Expr e]
	:	c = INTEGER {e = new Constant($c.text,Type.Integer);}
	| 	c = FIXED {e = new Constant($c.text,Type.Fixed);}
	| 	c = STRING_LITERAL {e = new Constant($c.text,Type.String);}
	| 	c = CHARACTER_LITERAL {e = new Constant($c.text,Type.Char);}
	| 	TRUE {e = Constant.True;}
	| 	FALSE {e = Constant.False;}
	| 	NULL {e = Constant.Null;}
	|	THIS {e = Constant.This;}
	;

function_expression returns [Expr e]	
	:	^(FUNCTION_EXPRESSION IDENTIFIER expression_list?)
	;

expression_list returns [List<Expr> e]
@init{
	e = new ArrayList<Expr>();
}
	: (e1 = expression {e.add(e1);})+
	;

namespace_access returns [String s]
	:	^(NAMESPACE_ACCESS id=IDENTIFIER {s = $id.text;})
	;

type returns [Type t]
	:	^(NAMESPACE_TYPE ns=IDENTIFIER id=IDENTIFIER{t = Type.getType($ns.text+"_"+$id.text);})
	|	^(TYPE id=IDENTIFIER 
	{
		t = Type.getType($id.text);
		if(t == null){
			t = Type.getType(currentNamespace+"_"+$id.text);
		}
	}
		)
	;