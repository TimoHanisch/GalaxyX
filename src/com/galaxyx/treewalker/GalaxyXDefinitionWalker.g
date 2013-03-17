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
	import com.galaxyx.constructs.SightModifier;
	import com.galaxyx.semantic.Type;
} 

@members{
	private SymbolTable table;
	private ErrorHandler errHandler; 
	
	private Namespace currentNamespace;
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
		if(currentNamespace == null){
			currentNamespace = table.addNamespace($id.text);
		}
	}
		class_decl*)
	{
		currentNamespace = null;
	}
	;
	
class_decl
	:	^(CLASS m=(PUBLIC | PRIVATE)? id=IDENTIFIER
	{
		SightModifier modifier = m == null? SightModifier.NAMESPACE : SightModifier.getModifier($m.text);
		Class c = new Class($id.text,modifier);
		if(!currentNamespace.addClass(c)){
			errHandler.reportError(new Error("Class $1 already defined within Namespace "+currentNamespace,id.token));
		}
	}
		)
	;
	
