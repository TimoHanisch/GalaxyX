tree grammar GalaxyXGenerationWalker;

options {
  language = Java;
  tokenVocab = GalaxyXLexer;
  ASTLabelType = CommonTree;
}

@header {
	package com.galaxyx.treewalker;
} 

rule: ;
