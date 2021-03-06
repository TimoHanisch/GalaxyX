parser grammar GalaxyXSemanticParser;

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
	ARRAY_EXPRESSION;
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
		^(NAMESPACE IDENTIFIER class_decl* function_decl* field_decl* initializer*)
	;
	
class_decl
	:	modifier? CLASS IDENTIFIER (EXTENDS IDENTIFIER)? COLON
			(field_decl | function_decl | constructor_decl | destructor_decl)*
		END CLASS
		->
		^(CLASS IDENTIFIER field_decl* function_decl* constructor_decl* destructor_decl*)
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
	:	modifier? STATIC? FUNC IDENTIFIER LPAREN parameter_list? RPAREN RETURNS type COLON
			local_var_decl*
			statement*
		END FUNC
		->
		^(FUNC IDENTIFIER local_var_decl* statement*)
	;
	
parameter_list
	:	parameter (COMMA parameter)*
		->
		^(PARAMETER_LIST parameter (parameter)*)
	;
	
parameter
	:	type IDENTIFIER
		->
		^(PARAMETER type)
	;
	
local_var_decl
	:	CONST? type array* IDENTIFIER (ASSGN expression)? SEMI
		->
		^(LOCAL IDENTIFIER ^(ASSGN expression)?)
	;
	
field_decl
	:	modifier? STATIC? CONST? type array* IDENTIFIER (ASSGN expression)? SEMI
		->
		^(FIELD IDENTIFIER ^(ASSGN expression)?)
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
	:	LBRACK RBRACK ->
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
	|	IDENTIFIER (LBRACK expression RBRACK)+ -> ^(ARRAY_EXPRESSION IDENTIFIER expression+)
	|	IDENTIFIER LPAREN expression_list? RPAREN -> ^(FUNCTION_EXPRESSION IDENTIFIER expression_list?)
	|	NEW namespace_access? IDENTIFIER LPAREN expression_list? RPAREN -> ^(NEW namespace_access? IDENTIFIER expression_list?)
	|	DELETE postfix_expression -> ^(DELETE postfix_expression)
	;
	
namespace_access
	:	IDENTIFIER NAMESPACE_ACCESS -> ^(NAMESPACE_ACCESS IDENTIFIER)
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
		^(DO expression statement*)
	;
	
jump_statement
	:	BREAK SEMI	-> ^(BREAK TMP)
	|	CONTINUE SEMI -> ^(CONTINUE TMP)
	|	RETURN SEMI -> ^(RETURN TMP)
	|	RETURN expression SEMI -> ^(RETURN expression)
	;