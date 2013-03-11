grammar GalaxyXNew;

options {
    backtrack=true;
    memoize=true; 
    k=2;
    output = AST;
    ASTLabelType=CommonTree; 
}

tokens{
	NAMESPACE_TYPE;
	TYPE;
	VARDEF;
	ARRAY;
	NEGATION;
	FUNCTION_EXPRESSION;
	FIELD;
	LOCAL;
	PARAMETER;
	PARAMETER_LIST;
}

@header {
	package com.galaxyx.galaxyxparser;
}

@lexer::header {
  	package com.galaxyx.galaxyxparser;
}



start
	:	namespace_decl*
	;

namespace_decl
	:	NAMESPACE IDENTIFIER COLON
			(class_decl | function_decl | field_decl | initializer)*
		END NAMESPACE
		->
		^(NAMESPACE IDENTIFIER class_decl* function_decl* field_decl* initializer*)
	;
	
class_decl
	:	modifier? CLASS IDENTIFIER (EXTENDS IDENTIFIER)? COLON
			(field_decl | function_decl | constructor_decl | destructor_decl)*
		END CLASS
		->
		^(CLASS modifier? IDENTIFIER (EXTENDS IDENTIFIER)? field_decl* function_decl* constructor_decl* destructor_decl*)
	;
	
constructor_decl
	:	CONSTRUCTOR LPAREN parameter_list? RPAREN COLON
			local_var_decl*
			statement*
		END CONSTRUCTOR
		->
		^(CONSTRUCTOR parameter_list? local_var_decl* statement*)
	;
	
destructor_decl
	:	DESTRUCTOR LPAREN parameter_list? RPAREN COLON
			local_var_decl*
			statement*
		END DESTRUCTOR
		->
		^(DESTRUCTOR parameter_list? local_var_decl* statement*)
	;
	
function_decl
	:	modifier? FUNC IDENTIFIER LPAREN parameter_list? RPAREN RETURNS type COLON
			local_var_decl*
			statement*
		END FUNC
		->
		^(FUNC modifier IDENTIFIER parameter_list? ^(RETURNS type) local_var_decl* statement*)
	;
	
parameter_list
	:	parameter (COMMA parameter)*
		->
		^(PARAMETER_LIST parameter (parameter)*)
	;
	
parameter
	:	type IDENTIFIER
		->
		^(PARAMETER type IDENTIFIER)
	;
	
local_var_decl
	:	type array* IDENTIFIER (ASSGN expression)? SEMI
		->
		^(LOCAL type array* IDENTIFIER (ASSGN expression)?)
	;
	
field_decl
	:	modifier? STATIC? CONST? type array* IDENTIFIER (ASSGN expression)? SEMI
		->
		^(FIELD modifier? STATIC? CONST? type array* IDENTIFIER (ASSGN expression)?)
	;
	
initializer
	:	INITIALIZER	COLON
			local_var_decl*
			statement*
		END INITIALIZER
		->
		^(INITIALIZER local_var_decl* statement*)
	;

array
	:	LBRACK expression RBRACK -> ^(ARRAY expression)
	;
	
type
	:	IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> ^(NAMESPACE_TYPE IDENTIFIER IDENTIFIER)
	|	IDENTIFIER -> ^(TYPE IDENTIFIER)
	;
	
modifier
	:	PUBLIC
	|	PRIVATE
	;

assignment_expression
	:	expression assignment_operator expression -> ^(assignment_operator expression expression)
	;

assignment_operator
	:	ASSGN
	|	ASSGNP
	|	ASSGNS
	|	ASSGNT
	|	ASSGND
	|	ASSGNM
	|	ASSGNSHL
	|	ASSGNSHR
	|	ASSGNBITAND
	|	ASSGNBITOR
	|	ASSGNBITXOR
	;

expression
	:	logical_or_expression
	;
	
logical_or_expression
	:	logical_and_expression (LOR^ logical_and_expression)*
	;

logical_and_expression
	:	or_expression (LAND^ or_expression)*
	;
	
or_expression
	:	exclusive_or_expression (OR^ exclusive_or_expression)*
	;
	
exclusive_or_expression
	:	and_expression (XOR^ and_expression)*
	;
	
and_expression
	: 	equality_expression (AND^ equality_expression)*
	;
	
equality_expression
	: 	relational_expression ((EQ|NEQ)^ relational_expression)*
	;

relational_expression
	: 	shift_expression ((LT|GT|LTEQ|GTEQ)^ shift_expression)*
	;

shift_expression
	: 	additive_expression ((SHIFTL|SHIFTR)^ additive_expression)*
	;
	
additive_expression
	: 	multiplicative_expression ((PLUS | SUB)^ multiplicative_expression)*
	;

multiplicative_expression
	: 	modulo_expression ((TIMES | DIV)^ modulo_expression)*
	;
	
modulo_expression
	: 	unary_expression (MODULO^ unary_expression)*
	;
	
unary_expression
	: 	postfix_expression
	| 	unary_operator^ unary_expression
	;

postfix_expression
	:	primary_expression
	|	(IDENTIFIER | THIS) DOT postfix_expression -> ^(DOT IDENTIFIER postfix_expression)
	|	IDENTIFIER NAMESPACE_ACCESS postfix_expression -> ^(NAMESPACE_ACCESS IDENTIFIER postfix_expression)
	|	IDENTIFIER (LBRACK expression RBRACK)+ -> IDENTIFIER expression+
	|	IDENTIFIER LPAREN expression_list RPAREN -> IDENTIFIER expression_list
	|	IDENTIFIER LPAREN RPAREN -> ^(FUNCTION_EXPRESSION IDENTIFIER)
	;

expression_list
	:	expression (COMMA! expression)*
	;

primary_expression
	:	IDENTIFIER
	|	LPAREN! expression RPAREN!
	|	constant
	;

constant
    :   INTEGER
    |	CHARACTER_LITERAL
	|	STRING_LITERAL
    |   FIXED_LITERAL
    |	TRUE
    |	FALSE
    |	NULL
    | 	THIS
    ;

unary_operator
	: 	PLUS
	| 	SUB -> NEGATION
	| 	NOT
	| 	NEW
	| 	DELETE
	|	BIT_NOT
	;
	
statement
	:	assignment_statement
	|	expression_statement
	|	if_statement
	|	while_statement
	|	do_while_statement
	|	for_statement
	|	jump_statement
	;
	
assignment_statement
	:	assignment_expression SEMI!
	;
	
expression_statement
	:	SEMI!
	|	expression SEMI!
	;
	
if_statement
	:	IF	LPAREN expression RPAREN COLON
			statement*
		(ELIF LPAREN expression RPAREN COLON
			statement*)*
		(ELSE COLON 
			statement*)?
		END IF
		->
		^(IF expression statement* ^(ELIF expression statement*)* ^(ELSE statement*)?)
	;
	
while_statement
	:	WHILE LPAREN expression RPAREN COLON
			statement*
		END WHILE
		->
		^(WHILE expression statement*)
	;
	
for_statement
	:	FOR LPAREN assignment_expression? SEMI expression? SEMI expression? RPAREN COLON
			statement*
		END FOR
		->
		^(FOR assignment_expression? expression? expression? statement*)
	;
	
do_while_statement
	:	DO COLON
			statement*
			WHILE LPAREN expression RPAREN 
		END DO
		->
		^(WHILE expression statement*)
	;
	
jump_statement
	:	BREAK SEMI
	|	CONTINUE SEMI
	|	RETURN SEMI
	|	RETURN expression SEMI
	;
	
//LEXER

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