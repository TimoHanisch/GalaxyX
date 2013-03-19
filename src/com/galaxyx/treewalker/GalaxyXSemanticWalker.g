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
	private SymbolTable table;
	private ErrorHandler errHandler; 
	
	private Namespace currentNamespace;
	private Class currentClass;
	private Method currentMethod;
	
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
	:	^(NAMESPACE IDENTIFIER class_decl* function_decl* field_decl* initializer*)
	;
	
class_decl
	:	^(CLASS IDENTIFIER field_decl* function_decl* constructor_decl* destructor_decl*)
	;
	
field_decl
	:	^(FIELD IDENTIFIER assign?)
	; 

function_decl
	:	^(FUNC IDENTIFIER local_var_decl* statement*)
	;
	
constructor_decl
	:	^(CONSTRUCTOR parameter_list? local_var_decl* statement*)
	;
	
destructor_decl
	:	^(DESTRUCTOR parameter_list? local_var_decl* statement*)
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
	
parameter_list
	:	^(PARAMETER_LIST parameter (parameter)*)
	;
	
parameter
	:	^(PARAMETER type)
	;
	
statement
	:	^(DO expression) //PLATZHALTER
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
	|	^(o = NEW ns = IDENTIFIER? c1=IDENTIFIER list = expression_list?
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
			Namespace namespace = table.getNamespace($ns.text);
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
				errHandler.reportError(new Error("Namespace $1 does not exist",$ns.token));
			}
		}
	}
		)
	|	^(o = DELETE a = expression
	{

	}
		)
	|	c = INTEGER {e = new Constant($c.text,Type.Integer);}
	| 	c = FIXED {e = new Constant($c.text,Type.Fixed);}
	| 	c = STRING_LITERAL {e = new Constant($c.text,Type.String);}
	| 	c = CHARACTER_LITERAL {e = new Constant($c.text,Type.Char);}
	| 	TRUE {e = Constant.True;}
	| 	FALSE {e = Constant.False;}
	| 	NULL {e = Constant.Null;}
	|	THIS {e = Constant.This;}
	;

expression_list returns [List<Expr> e]
@init{
	e = new ArrayList<Expr>();
}
	: (e1 = expression {e.add(e1);})+
	;

type
	:	^(NAMESPACE_TYPE IDENTIFIER IDENTIFIER)
	|	^(TYPE IDENTIFIER)
	;