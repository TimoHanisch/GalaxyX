/**********************************************
 * GalaxyX Grammar
 * Copyright (c) Timo Hanisch 2011
 * timohanisch@gmx.de
 *
 * Namespaces/Classes/Methods/Global Vars get
 * registered here!
 **********************************************/

grammar GalaxyX;

options {
    backtrack=true;
    memoize=true; 
    k=2;
    output = AST;
    ASTLabelType=CommonTree; 
}

tokens{
	NEGATION;
}
@header {
	package com.galaxyx.galaxyxparser;
	import com.galaxyx.galaxyxparser.typechecking.*;
	import com.galaxyx.galaxyxparser.typechecking.Error;
	import com.galaxyx.galaxyxparser.structures.*;
	import com.galaxyx.galaxyxparser.structures.Class;
}

@lexer::header {
  	package com.galaxyx.galaxyxparser;
}

@members{
	private Namespace namespace = null;
	private Class cl = null;
	private Method method = null;
	private Constructor constr = null;
	private Destructor destr = null;
}
translation_unit
	: namespace*
	;

typedef_decl
	: modifier? STATIC? TYPEDEF^ type IDENTIFIER SEMI! 
	;
	 
namespace
	: NAMESPACE^ i1=IDENTIFIER COLON! 
	{
		if(Main.table.namespaceExists(i1.getText())){
			namespace = Main.table.getNamespace($i1.text);
		}else{
			namespace = new Namespace($i1.text);
			Main.table.putNamespace($i1.text,namespace);
		}
	}
	  (function | class_decl | field_decl | typedef_decl)*
	  END! NAMESPACE!
	{
		namespace = null;
	}
	;
	
function
	: modifier? STATIC? INLINE? FUNC^ IDENTIFIER LPAREN! argument_list? RPAREN! RETURNS! type COLON!
	  local_var_decl*
	  statement*
	  END FUNC
	;
	
argument_list
	: type^ IDENTIFIER (COMMA type IDENTIFIER)*
	;
	
class_decl
	: m=modifier? CLASS^ c=IDENTIFIER (LBRACK! i=INTEGER RBRACK!)? (EXTENDS IDENTIFIER)? COLON!
	{
		if(namespace.isClassInNamespace($c.text)){
			Error.printError($c.line,c.getCharPositionInLine() ,"Class is allready defined within namespace.");
		}else{
			boolean pub = m == null? false : $m.text.equals("public");
			boolean pri = m == null? false : $m.text.equals("private");
			cl = new Class($c.text,pub,pri,Integer.parseInt($i.text),namespace);
		}
	}
	  (function | field_decl | typedef_decl | constr_decl | destr_decl)*
	  END! CLASS!
	{
		cl = null;
	}
	;
	
constr_decl
	: CONSTRUCTOR^ LPAREN! argument_list? RPAREN! COLON!
	  local_var_decl*
	  statement*
	  END! CONSTRUCTOR!
	;

destr_decl
	: DESTRUCTOR^ LPAREN! argument_list? RPAREN! COLON!
	  local_var_decl*
	  statement*
	  END! DESTRUCTOR!
	;

modifier
	: PUBLIC | PRIVATE
	;
	
local_var_decl
	: type^ array_decl? IDENTIFIER assgn_decl? SEMI!
	;
	
field_decl
	: modifier? STATIC? CONST? type^ array_decl? IDENTIFIER  assgn_decl? SEMI!
	;
	
array_decl
	: (LBRACK expression RBRACK)+
	;
	
assgn_decl
	: assignment_operator expression
	;

assignment_operator
	: ASSGN
	| ASSGNP
	| ASSGNS
	| ASSGNT
	| ASSGND
	;

type
	:	IDENTIFIER
	|	BOOLEAN
	|	BYTE
	|	CHAR
	|	FIXED
	|	GAMELINK
	|	COLOR
	|	INT
	|	POINT
	|	STRING
	|	ABILCMD
	|	ACTOR
	|	ACTORSCOPE
	|	BANK
	|	CAMERAINFO
	|	MARKER
	|	ORDER
	|	PLAYERGROUP
	|	REGION
	|	REVEALER
	|	SOUNDLINK
	|	TEXT
	|	TIMER
	|	TRANSMISSIONSOURCE
	|	TRIGGER
	|	UNITFILTER
	|	UNITGROUP
	|	UNITREF
	|	UNIT
	|	WAVEINFO
	|	WAVETARGET
	|	DOODAD
	|	AIFILTER
	|	SOUND
	|	WAVE
	| 	VOID
	;

//Expressions
argument_expression_list
	:   assignment_expression (COMMA assignment_expression)*
	;

additive_expression
	: (multiplicative_expression) (PLUS^ multiplicative_expression | SUB^ multiplicative_expression )*
	;

multiplicative_expression
	: unary_expression (TIMES^ unary_expression | DIV^ unary_expression)*
	;

unary_expression
	: postfix_expression
	| unary_operator^ unary_expression
	;

postfix_expression
	:   primary_expression
        (   LBRACK! expression RBRACK!
        |   LPAREN! RPAREN!
        |   LPAREN! argument_expression_list RPAREN!
        |   DOT IDENTIFIER ((LBRACK expression RBRACK)* | LPAREN argument_expression_list RPAREN | LPAREN expression RPAREN)
        )*
	;

unary_operator
	: PLUS
	| SUB -> NEGATION
	| NOT
	| NEW
	| DELETE
	| NAMEOF
	| NATIVE
	;

primary_expression
	: IDENTIFIER
	| constant
	| LPAREN! expression RPAREN!
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
    //| 	SUPER
    ;

/////

expression
	: assignment_expression
	;

constant_expression
	: logical_or_expression
	;

assignment_expression
	: logical_or_expression
	| lvalue assignment_operator^ assignment_expression
	;
	
lvalue
	:	unary_expression
	;

logical_or_expression
	: logical_and_expression (LOR^ logical_and_expression)* 
	;

logical_and_expression
	: inclusive_or_expression (LAND^ inclusive_or_expression)*
	;

inclusive_or_expression
	: exclusive_or_expression (OR^ exclusive_or_expression)*
	;

exclusive_or_expression
	: and_expression (XOR^ and_expression)*
	;

and_expression
	: equality_expression (AND^ equality_expression)*
	;
equality_expression
	: relational_expression ((EQ|NEQ)^ relational_expression)*
	;

relational_expression
	: shift_expression ((LT|GT|LTEQ|GTEQ)^ shift_expression)*
	;

shift_expression
	: additive_expression ((SHIFTL|SHIFTR)^ additive_expression)*
	;
	
//Statements

statement
	: expression_statement
	| selection_statement
	| while_statement
	| for_statement
	| jump_statement
	;	
	
expression_statement
	: SEMI!
	| expression SEMI!
	;

selection_statement
	: IF LPAREN! expression RPAREN! COLON! statement*
	  (ELIF LPAREN! expression RPAREN! COLON! statement*)*
	  (ELSE COLON! statement*)?
	  END IF
	;
	
while_statement
	: WHILE LPAREN! expression RPAREN! COLON! statement*
	  END WHILE
	;
	
for_statement
	: FOR LPAREN! expression SEMI! expression SEMI! expression RPAREN! COLON!
	  statement*
	  END FOR
	;
	
jump_statement
	: BREAK SEMI!
	| CONTINUE SEMI!
	| RETURN SEMI!
	| RETURN expression SEMI !
	;
	
	
//LEXER

//primitive types
BOOLEAN : 'bool';
BYTE : 'byte';
CHAR : 'char';
FIXED : 'fixed';
INT : 'int';
VOID : 'void';
GAMELINK : 'gamelink';
COLOR : 'color';
POINT : 'point';
STRING : 'string';

//further types
ABILCMD : 'abilcmd';
ACTOR : 'actor';
ACTORSCOPE : 'actorscope';
AIFILTER : 'aifilter';
BANK : 'bank';
CAMERAINFO : 'camerainfo';
MARKER : 'marker';
ORDER : 'order';
PLAYERGROUP : 'playergroup';
REGION : 'region';
REVEALER : 'revealer';
SOUNDLINK : 'soundlink';
TEXT : 'text';
TIMER : 'timer';
TRIGGER : 'trigger';
TRANSMISSIONSOURCE : 'transmissionsource';
UNITFILTER : 'unitfilter';
UNITGROUP : 'unitgroup';
UNITREF: 'unitref';
UNIT : 'unit';
WAVEINFO : 'waveinfo';
WAVETARGET : 'wavetarget';
DOODAD : 'doodad';
SOUND : 'sound';
WAVE : 'wave';

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
END : 'end';
FOR : 'for';


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
NEW : 'new';
DELETE : 'delete';
THIS : 'this';
SUPER : 'super';
NAMEOF : 'nameof';
INITIALIZER : 'initializer';
DEFINE : 'define';

//Punctuation
SEMI : ';';
COMMA : ',';
DOT : '.';
TILDE : '~';
COLON : ':';

EXTENDS : '<-';
RETURNS : '->';
PLUS : '+';
SUB : '-';
DIV : '/';
TIMES : '*';
INC : '++';
DEC : '--';
ASSGN : '=';
ASSGNP : '+=';
ASSGNS : '-=';
ASSGNT : '*=';
ASSGND : '/=';

AND : '&';
OR : '|';
XOR : '^';
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

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';

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