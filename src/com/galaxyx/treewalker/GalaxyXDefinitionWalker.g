tree grammar GalaxyXDefinitionWalker;

options {
  	language = Java;
  	tokenVocab = GalaxyXLexer;
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
	:	^(ASSGN IDENTIFIER class_decl* method_decl* field_decl*)
	;
	
class_decl
	:	^(CLASS modifier? IDENTIFIER field_decl* method_decl* constructor_decl* destructor_decl*)
	;
	
field_decl
	:	^(FIELD modifier? STATIC? CONST? type array* IDENTIFIER)
	;
	
method_decl
	:	^(FUNC type modifier? parameter_list? local_decl*)
	;
	
constructor_decl
	:	^(CONSTRUCTOR parameter_list? local_decl*)
	;
	
destructor_decl
	:	^(DESTRUCTOR parameter_list? local_decl*)
	;
	
local_decl 
	:	^(LOCAL CONST? type array* IDENTIFIER)
	;
	
modifier
	:	PUBLIC | PRIVATE
	;
	
array
	:	^(ARRAY TMP)
	;	
	
parameter_list returns [List<Local> params]
	:	^(PARAMETER_LIST parameter (parameter)*)
	;	
	
parameter
	:	^(PARAMETER type IDENTIFIER)
	;
	
type returns [Type t]
	:	^(NAMESPACE_TYPE IDENTIFIER IDENTIFIER)
	|	^(TYPE IDENTIFIER)
	;