tree grammar GalaxyXHeaderWalker;

options {
  language = Java;
  tokenVocab = GalaxyXHeader;
  ASTLabelType = CommonTree;
}

@header {
  package de.timoh.galaxyxparser;
}
rule: define* EOF;

define
	: ^(DEFINE i1=IDENTIFIER i2=basic {Main.table.putDefine(i1.getText(),i2);})
	;
	
basic returns [String s]
	: (i1 = IDENTIFIER 
	| i1 = INTEGER 
	| i1 = FIXED_LITERAL
	| i1 = CHARACTER_LITERAL
	| i1 = STRING_LITERAL)
	{s = i1.getText();}
	;