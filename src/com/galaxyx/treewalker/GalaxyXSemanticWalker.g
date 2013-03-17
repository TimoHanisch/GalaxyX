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
	
expression
	:	
	;
	
type
	:	^(NAMESPACE_TYPE IDENTIFIER IDENTIFIER)
	|	^(TYPE IDENTIFIER)
	;