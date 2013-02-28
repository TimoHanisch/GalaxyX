grammar GalaxyXHeader;

options {
    backtrack=true;
    memoize=true; 
    k=2;
    output = AST;
    ASTLabelType=CommonTree;
}
@header {
	package com.galaxyx.galaxyxparser;
	import com.galaxyx.galaxyxparser.typechecking.*;
}

@lexer::header {
  	package com.galaxyx.galaxyxparser;
}
rule
	: define*
	;


define
	: PREFIX! DEFINE^ IDENTIFIER (IDENTIFIER | INTEGER | FIXED_LITERAL | CHARACTER_LITERAL | STRING_LITERAL)
	;

//LEXER

DEFINE : 'define';
PREFIX : '#';

//----------
IDENTIFIER
	:	LETTER (LETTER|'0'..'9')*
	;
	
fragment
LETTER
	:	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

CHARACTER_LITERAL
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

INTEGER 
	: DIGIT+
	| HEX_LITERAL
	;
	
fragment
HEX_LITERAL : '0' ('x'|'X') HexDigit+;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

FIXED_LITERAL 
	:	DIGIT+ '.' DIGIT* 
	|	'.' DIGIT+
	;
	
fragment
DIGIT : '0'..'9';

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;


WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
    
MULTI_COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;