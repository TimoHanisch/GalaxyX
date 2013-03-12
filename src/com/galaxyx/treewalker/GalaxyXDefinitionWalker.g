tree grammar GalaxyXDefinitionWalker;

options {
  language = Java;
  tokenVocab = GalaxyXLexer;
  ASTLabelType = CommonTree;
}

@header {
	package com.galaxyx.treewalker;
} 

rule: ; 
