parser grammar GalaxyXDefinitionParser;

options {
	tokenVocab = GalaxyXLexer;
	backtrack = true;
    memoize = true; 
    k = 2;
    output = AST;
    ASTLabelType = CommonTree; 
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
	TMP;
}

@header {
	package com.galaxyx.parser;
	
	import com.galaxyx.utils.ErrorHandler;
	import com.galaxyx.utils.ErrorHandler.Error;
} 

@members{
	private ErrorHandler eh;
	
	@Override
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        Token t = e.token;
        String msg = getErrorMessage(e, tokenNames);
		eh.reportError(new Error(msg,t));
    }
}

parse [ErrorHandler eh]
@init{
	this.eh = eh;
}
	:	namespace_decl*
	;

namespace_decl
	:	NAMESPACE IDENTIFIER COLON
			(class_decl | function_decl | field_decl | initializer)*
		END NAMESPACE
		->
		^(NAMESPACE IDENTIFIER class_decl*)
	;
	
class_decl
	:	modifier? CLASS IDENTIFIER (EXTENDS IDENTIFIER)? COLON
			(field_decl | function_decl | constructor_decl | destructor_decl)*
		END CLASS
		->
		^(CLASS modifier? IDENTIFIER)
	;
	
constructor_decl
	:	CONSTRUCTOR LPAREN parameter_list? RPAREN COLON
			local_var_decl*
			statement*
		END CONSTRUCTOR
		->
	;
	
destructor_decl
	:	DESTRUCTOR LPAREN parameter_list? RPAREN COLON
			local_var_decl*
			statement*
		END DESTRUCTOR
		->
	;
	
function_decl
	:	modifier? FUNC IDENTIFIER LPAREN parameter_list? RPAREN RETURNS type COLON
			local_var_decl*
			statement*
		END FUNC
		->
	;
	
parameter_list
	:	parameter (COMMA parameter)*
		->
	;
	
parameter
	:	type IDENTIFIER
		->
	;
	
local_var_decl
	:	CONST? type array* IDENTIFIER (ASSGN expression)? SEMI
		->
	;
	
field_decl
	:	modifier? STATIC? CONST? type array* IDENTIFIER (ASSGN expression)? SEMI
		->
	;
	
initializer
	:	INITIALIZER	COLON
			local_var_decl*
			statement*
		END INITIALIZER
		->
	;

array
	:	LBRACK RBRACK -> 
	;
	
type
	:	IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> 
	|	IDENTIFIER -> 
	;
	
modifier
	:	PUBLIC
	|	PRIVATE
	;

assignment_expression
	:	expression assignment_operator expression -> 
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
	:	logical_or_expression ->
	;
	
logical_or_expression
	:	logical_and_expression (LOR logical_and_expression)* ->
	;

logical_and_expression
	:	or_expression (LAND or_expression)* ->
	;
	
or_expression
	:	exclusive_or_expression (OR exclusive_or_expression)* ->
	;
	
exclusive_or_expression
	:	and_expression (XOR and_expression)* ->
	;
	
and_expression
	: 	equality_expression (AND equality_expression)* ->
	;
	
equality_expression
	: 	relational_expression ((EQ|NEQ) relational_expression)* ->
	;

relational_expression
	: 	shift_expression ((LT|GT|LTEQ|GTEQ) shift_expression)* ->
	;

shift_expression
	: 	additive_expression ((SHIFTL|SHIFTR) additive_expression)* ->
	;
	
additive_expression
	: 	multiplicative_expression ((PLUS | SUB) multiplicative_expression)* ->
	;

multiplicative_expression
	: 	modulo_expression ((TIMES | DIV) modulo_expression)* ->
	;
	
modulo_expression
	: 	unary_expression (MODULO unary_expression)* ->
	;
	
unary_expression
	: 	postfix_expression
	| 	unary_operator unary_expression ->
	;

postfix_expression
	:	primary_expression ->
	|	(IDENTIFIER | THIS) DOT postfix_expression -> 
	|	IDENTIFIER NAMESPACE_ACCESS postfix_expression -> 
	|	IDENTIFIER (LBRACK expression RBRACK)+ -> 
	|	IDENTIFIER LPAREN expression_list RPAREN -> 
	|	IDENTIFIER LPAREN RPAREN -> 
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
		
	;
	
while_statement
	:	WHILE LPAREN expression RPAREN COLON
			statement*
		END WHILE
		->
		
	;
	
for_statement
	:	FOR LPAREN assignment_expression? SEMI expression? SEMI expression? RPAREN COLON
			statement*
		END FOR
		->
		
	;
	
do_while_statement
	:	DO COLON
			statement*
			WHILE LPAREN expression RPAREN 
		END DO
		->
		
	;
	
jump_statement
	:	BREAK SEMI ->
	|	CONTINUE SEMI ->
	|	RETURN SEMI ->
	|	RETURN expression SEMI ->
	;
