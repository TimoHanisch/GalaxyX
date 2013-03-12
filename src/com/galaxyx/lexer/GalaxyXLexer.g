lexer grammar GalaxyXLexer;

options {
  	language = Java;
    backtrack=true;
    memoize=true; 
    k=2;
}

@lexer::header {
  	package com.galaxyx.lexer;
}

//Statement
IF : 'if';
ELSE : 'else';
ELIF: 'elif';
WHILE : 'while';
FOR : 'for';
END : 'end';
DO : 'do';

//Jumps
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';

//variable assigns
FALSE : 'false';
TRUE : 'true';
NULL : 'null';

//Language
STRUCT : 'struct';
FUNC : 'func';
CONSTRUCTOR : 'constructor';
DESTRUCTOR : 'destructor';
TYPEDEF : 'typedef';
NAMESPACE : 'namespace';
CLASS : 'class';
INTERFACE : 'interface';
IMPLEMENTS : 'implements';
EXTENDS : 'extends';
NEW : 'new';
DELETE : 'delete';
THIS : 'this';
SUPER : 'super';
NAMEOF : 'nameof';
INITIALIZER : 'initializer';

//Compiler-Flags
INLINE : 'inline';

//Memory
STATIC : 'static';
CONST : 'const';

//Visibilty-Modifiers
PRIVATE : 'private';
PUBLIC : 'public';

//Method Modifiers
NATIVE : 'native';

DEFINE : 'define';
UNDEF : 'undef';
INCLUDE : 'include';

PREFIX : '#';

//Punctuation
SEMI : ';';
COMMA : ',';
DOT : '.';
COLON : ':';

RETURNS : '->';
PLUS : '+';
SUB : '-';
DIV : '/';
TIMES : '*';
MODULO : '%';

AND : '&';
OR : '|';
XOR : '^';
BIT_NOT : '~';
NOT : '!';
LOR : '||';
LAND : '&&';
EQ : '==';
NEQ : '!=';
LT : '<';
LTEQ : '<=';
GT : '>';
GTEQ : '>=';
SHIFTL : '<<';
SHIFTR : '>>';

ASSGN : '=';
ASSGNP : '+=';
ASSGNS : '-=';
ASSGNT : '*=';
ASSGND : '/=';
ASSGNM : '%=';
ASSGNSHL : '<<=';
ASSGNSHR : '>>=';
ASSGNBITAND : '&=';
ASSGNBITOR : '|=';
ASSGNBITXOR : '^=';


LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';

NAMESPACE_ACCESS : '::';




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

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
    
MULTI_COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
