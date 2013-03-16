parser grammar GalaxyXPreprocessorParser;


options {
	tokenVocab = GalaxyXLexer;
	backtrack = true;
    memoize = true; 
    k = 2;
    output = AST;
}

tokens{
	NEGATION;
}

@header {
	package com.galaxyx.parser;
	
	import com.galaxyx.Preprocessor; 
} 

@members{
	private Preprocessor p;
	
	@Override
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        Token t = e.token;
        String msg = getErrorMessage(e, tokenNames);
		p.reportError(msg,t);
    }
}

parse[Preprocessor p]
@init{
	this.p = p;
}
	:	(preprocessor | namespace_decl)* EOF
	;

namespace_decl
	:	NAMESPACE IDENTIFIER COLON
			(class_decl | function_decl | field_decl | initializer | preprocessor)*
		END NAMESPACE
	;
	
class_decl
	:	modifier? CLASS IDENTIFIER (EXTENDS IDENTIFIER)? COLON
			(field_decl | function_decl | constructor_decl | destructor_decl | preprocessor)*
		END CLASS 
	;
	
constructor_decl
	:	CONSTRUCTOR LPAREN parameter_list? RPAREN COLON
			(local_var_decl | preprocessor)*
			(statement | preprocessor)*
		END CONSTRUCTOR
	;
	
destructor_decl
	:	DESTRUCTOR LPAREN parameter_list? RPAREN COLON
			(local_var_decl | preprocessor)*
			(statement | preprocessor)*
		END DESTRUCTOR
	;
	
function_decl
	:	modifier? FUNC IDENTIFIER LPAREN parameter_list? RPAREN RETURNS type COLON
			(local_var_decl | preprocessor)*
			(statement | preprocessor)*
		END FUNC
	;
	
parameter_list
	:	parameter (COMMA parameter)*
	;
	
parameter
	:	type IDENTIFIER
	;
	
local_var_decl
	:	CONST? type array* IDENTIFIER (ASSGN expression)? SEMI
	;
	
field_decl
	:	modifier? STATIC? CONST? type array* IDENTIFIER (ASSGN expression)? SEMI
	;
	
initializer
	:	INITIALIZER	COLON
			local_var_decl*
			statement*
		END INITIALIZER
	;

array
	:	LBRACK RBRACK
	;
	
type
	:	IDENTIFIER NAMESPACE_ACCESS IDENTIFIER
	|	IDENTIFIER
	;
	
modifier
	:	PUBLIC
	|	PRIVATE
	;

assignment_expression
	:	expression assignment_operator expression
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
	|	(IDENTIFIER | THIS) DOT postfix_expression
	|	IDENTIFIER NAMESPACE_ACCESS postfix_expression
	|	IDENTIFIER (LBRACK expression RBRACK)+
	|	IDENTIFIER LPAREN expression_list RPAREN
	|	IDENTIFIER LPAREN RPAREN
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
	| 	SUB
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
	;
	
while_statement
	:	WHILE LPAREN expression RPAREN COLON
			statement*
		END WHILE
	;
	
for_statement
	:	FOR LPAREN assignment_expression? SEMI expression? SEMI expression? RPAREN COLON
			statement*
		END FOR
	;
	
do_while_statement
	:	DO COLON
			statement*
			WHILE LPAREN expression RPAREN 
		END DO
	;
	
jump_statement
	:	BREAK SEMI
	|	CONTINUE SEMI
	|	RETURN SEMI
	|	RETURN expression SEMI
	;

//Preprocessor

preprocessor
	:	PREFIX
		(include | define | undef)
	;
	
include
	:	INCLUDE path=STRING_LITERAL
	{
		p.processInclude(path);
	}
	;
	
define
@init{
	String definition = null;
}
	:	DEFINE id=IDENTIFIER (s=STRING_LITERAL {definition = $s.text;}| s=SUB? i=INTEGER {definition = s == null? $i.text : "-"+$i.text;}| s=SUB? f=FIXED_LITERAL {definition = s == null? $f.text : "-"+$f.text;})
	{
		if(!p.define($id.text,definition,$id.line)){
			p.reportError("Definition $1 already exists",id);
		}
	}
	;
	
undef
	:	UNDEF id=IDENTIFIER
	{
		if(!p.undef($id.text,$id.line)){
			p.reportError("Definition $1 does not exist",id);
		}
	}
	;
	