/**********************************************
 * GalaxyX Grammar
 * Copyright (c) Timo Hanisch 2013
 * timohanisch@gmail.com
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
	
	@Override 
	public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        Error.printError(hdr + msg);
    }
}
translation_unit
	: namespace* 
	;

typedef_decl
	: modifier? TYPEDEF^ type IDENTIFIER SEMI! 
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
	  initializer? (function | class_decl | field_decl | typedef_decl)*
	  END! NAMESPACE!
	{
		namespace = null;
	}
	;

initializer
	:  	i1=INITIALIZER COLON!
	{
		if(Main.table.getInitializer() != null){
			Error.printError("An initializer is already defined",i1);
		}else{
			method = new Method(namespace,null,false,false,false,"Initializer",Type.Void,false);
		}
	}
	  	local=local_var_decl
	{
		if(!method.addLocal($local.local,false)){
			Error.printError("Variable "+$local.local+" already defined for initializer",i1);
		}
	}
	  	statement*
	  	END! INITIALIZER!
	{
		method = null;
	}
	;
	
function
	: (m=modifier?)! (s=STATIC?)! FUNC^ i=IDENTIFIER LPAREN! args=argument_list? RPAREN! RETURNS! t=type COLON!
	  {
	  	if(cl == null){
	  		if(s == null){
	  			Error.printError("Methods without a class have to be static",i);
	  		}else if(namespace.containsMethod($i.text)){
	  			Error.printError("$1 is already defined within namespace "+cl,i);
	  		}else{
	  			method = new Method(namespace,null,true,(m != null && $m.text.equals("public")),(m != null && $m.text.equals("private")),$i.text,$t.t,true);
	  			if(args != null){
	  				for(LocalField f:$args.args){
	  					if(!method.addLocal(f,true)){
	  						Error.printError("Variable "+f+" already defined for method $1",i);
	  					}
	  				}
	  			}
	  		}
	  	}else if(cl.containsMethod($i.text)){
	  		Error.printError("$1 is already defined within class "+cl,i);
	  	}else{
	  		method = new Method(namespace,cl,(s != null),(m != null && $m.text.equals("public")),(m != null && $m.text.equals("private")),$i.text,$t.t,true);
  			if(args != null){
  				for(LocalField f:$args.args){
  					if(!method.addLocal(f,true)){
  						Error.printError("Variable "+f+" already defined for method $1",i);
  					}
  				}
  			}
	  	}
	  }
	  (local=local_var_decl
	  {
		if(!method.addLocal($local.local,false)){
			Error.printError("Variable "+$local.local+" already defined for method $1",i);
		}
	  }
	  )*
	  statement*
	  {
	  	method = null;
	  }
	  END! FUNC!
	;
	
argument_list returns [List<LocalField> args]
@init{
	$args = new ArrayList<LocalField>();
}
	: t=type i1=IDENTIFIER^ 
	{
		$args.add(new LocalField($i1.text,$t.t));
	}
	  (COMMA t2=type i2=IDENTIFIER {$args.add(new LocalField($i2.text,$t2.t));})*
	;
	
class_decl
	: (m=modifier?)! CLASS^ c=IDENTIFIER (LBRACK! i=INTEGER! RBRACK!)? (EXTENDS IDENTIFIER)? COLON!
	{
		if(namespace.isClassInNamespace($c.text)){
			Error.printError($c.line,c.getCharPositionInLine() ,"Class is allready defined within namespace.");
		}else{
			boolean pub = m == null? false : $m.text.equals("public");
			boolean pri = m == null? false : $m.text.equals("private");
			int count = (i == null ? DefaultValues.DEFAULT_CLASS_COUNT : Integer.parseInt($i.text));
			cl = new Class($c.text,pub,pri,count,namespace);
		}
	}
	  (function | field_decl | typedef_decl | constr_decl | destr_decl)*
	  END! CLASS!
	{
		cl = null;
	}
	;
	
constr_decl
	: c=CONSTRUCTOR^ LPAREN! args=argument_list? RPAREN! COLON
	  {
	  	method = new Constructor(cl);
		if(args != null){
			for(LocalField f:$args.args){
				if(!method.addLocal(f,true)){
					Error.printError("Variable "+f+" already defined for method $1",c);
				}
			}
		}
		if(cl.isConstructorDefined(method.toString())){
			Error.printError("Constructor with same declaration header is already defined",c);
		}else{
			cl.addConstructor((Constructor)method);
		}
	  }
	  (local=local_var_decl
	  {
		if(!method.addLocal($local.local,false)){
			Error.printError("Variable "+$local.local+" already defined for method $1",c);
		}
	  }
	  )*
	  statement*
	  END! CONSTRUCTOR!
	;

destr_decl
	: d=DESTRUCTOR^ LPAREN! args=argument_list? RPAREN! COLON
	  {
	  	method = new Destructor(cl);
		if(args != null){
			for(LocalField f:$args.args){
				if(!method.addLocal(f,true)){
					Error.printError("Variable "+f+" already defined for method $1",d);
				}
			}
		}
		if(cl.isDestructorDefined(method.toString())){
			Error.printError("Constructor with same declaration header is already defined",d);
		}else{
			cl.addDestructor((Destructor)method);
		}
	  }
	  (local=local_var_decl 
	  {
		if(!method.addLocal($local.local,false)){
			Error.printError("Variable "+$local.local+" already defined for method $1",d);
		}
	  })*
	  statement*
	  END! DESTRUCTOR!
	;

modifier
	: PUBLIC | PRIVATE
	;
	
local_var_decl returns [LocalField local]
	: t=type array=array_decl? i=IDENTIFIER^ (ASSGN^ expression)? SEMI!
	{
		$local = new LocalField($i.text,$t.t,array != null,$array.i);
	}
	;
	
field_decl
	: (m=modifier!)? (s=STATIC!)? c=CONST? t=type^ array=array_decl? i=IDENTIFIER  (ASSGN expression)? SEMI!
	{
		boolean pub = m == null? false : $m.text.equals("public");
		boolean pri = m == null? false : $m.text.equals("private");
		Field f = new Field($i.text,$t.t,s == null,pri,pub,array != null,$array.i);
		if(cl == null){
			if(namespace.containsField(f.getName())){
				Error.printError("Field "+f.getName()+" already defined for namespace "+namespace,i);
			}else{
				namespace.addField(f.getName(),f);
			}
		}else{
			if(cl.containsField(f.getName())){
				Error.printError("Field "+f.getName()+" already defined for class "+cl.getName(),i);
			}else{
				namespace.addField(f.getName(),f);
			}
		}
	}
	;
	
array_decl returns [int i]
	: (LBRACK expression RBRACK {$i++;})+
	;

assignment_operator
	: ASSGN
	| ASSGNP
	| ASSGNS
	| ASSGNT
	| ASSGND
	| ASSGNM
	| ASSGNSHL
	| ASSGNSHR
	| ASSGNBITAND
	| ASSGNBITOR
	| ASSGNBITXOR
	;

type returns [Type t]
	:	(ns=IDENTIFIER NAMESPACE_ACCESS)? i=IDENTIFIER 
		{String prefix = ns == null ? namespace.toString() : $ns.text;
		 if(Type.customTypeExists(prefix + "_" + $i.text)){
			$t = Type.getCustomType(prefix + "_" + $i.text);
		 }else{
		 	$t = Type.TypeCustomTemplate(prefix + "_" + $i.text);
		 }
		}
	|	BOOLEAN {$t = Type.Boolean;}
	|	BYTE {$t = Type.Byte;}
	|	CHAR {$t = Type.Char;}
	|	FIXED {$t = Type.Fixed;}
	|	GAMELINK {$t = Type.Gamelink;}
	|	COLOR {$t = Type.Color;}
	|	INT {$t = Type.Integer;}
	|	POINT {$t = Type.Point;}
	|	STRING {$t = Type.String;}
	|	ABILCMD {$t = Type.Abilcmd;}
	|	ACTOR {$t = Type.Actor;}
	|	ACTORSCOPE {$t = Type.Actorscope;}
	|	BANK {$t = Type.Bank;}
	|	CAMERAINFO {$t = Type.Camerainfo;}
	|	MARKER {$t = Type.Marker;}
	|	ORDER {$t = Type.Order;}
	|	PLAYERGROUP {$t = Type.Playergroup;}
	|	REGION {$t = Type.Region;}
	|	REVEALER {$t = Type.Revealer;}
	|	SOUNDLINK {$t = Type.Soundlink;}
	|	TEXT {$t = Type.Text;}
	|	TIMER {$t = Type.Timer;}
	|	TRANSMISSIONSOURCE {$t = Type.Transmissionsource;}
	|	TRIGGER {$t = Type.Trigger;}
	|	UNITFILTER {$t = Type.Unitfilter;}
	|	UNITGROUP {$t = Type.Unitgroup;}
	|	UNITREF {$t = Type.Unitref;}
	|	UNIT {$t = Type.Unit;}
	|	WAVEINFO {$t = Type.Waveinfo;}
	|	WAVETARGET {$t = Type.Wavetarget;}
	|	DOODAD {$t = Type.Doodad;}
	|	AIFILTER {$t = Type.AIFilter;}
	|	SOUND {$t = Type.Sound;}
	|	WAVE {$t = Type.Wave;}
	| 	VOID {$t = Type.Void;}
	; 

//Expressions
argument_expression_list
	:   assignment_expression (COMMA assignment_expression)*
	;

additive_expression
	: (multiplicative_expression) (PLUS^ multiplicative_expression | SUB^ multiplicative_expression )*
	;

multiplicative_expression
	: modulo_expression (TIMES^ modulo_expression | DIV^ modulo_expression)*
	;
	
modulo_expression
	: unary_expression (MODULO^ unary_expression)*
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
        |   DOT postfix_expression
        |	NAMESPACE_ACCESS postfix_expression
        )*
	;

unary_operator
	: PLUS
	| SUB -> NEGATION
	| NOT
	| NEW
	| DELETE
	| BIT_NOT
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
COLON : ':';

EXTENDS : '<-';
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

PREFIX : '#';
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