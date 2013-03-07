
tree grammar GalaxyXWalker;

options {
  language = Java;
  tokenVocab = GalaxyX;
  ASTLabelType = CommonTree;
}
@header {
	package com.galaxyx.galaxyxparser;
	import com.galaxyx.galaxyxparser.typechecking.*;
	import com.galaxyx.galaxyxparser.typechecking.Error;
	import com.galaxyx.galaxyxparser.structures.Class;
	import com.galaxyx.galaxyxparser.structures.*;
	import com.galaxyx.galaxyxparser.Main;
    import java.util.ArrayList;
    import java.util.List;
}
@members{
	private boolean isLocal = false;
	private Namespace curNS;
	private Class curCL;
	private Method curFU;
	private boolean isPrivate = false;
	private boolean isPublic = false;
	private SymbolTable table = new SymbolTable();
}

evaluator
	: namespace* EOF
	;

namespace
	:^(NAMESPACE i1=IDENTIFIER 
	{
		curNS = Main.table.getNamespace($i1.text);
	}
	  (field_decl | function | class_decl)*
	  )
	{
		curNS = null;
	}
	;

class_decl
	: ^(CLASS i1=IDENTIFIER
	{
		curCL = curNS.getClass($i1.text);
		//TODO CODE GENERATION
	}
		(field_decl | function | constr_decl | destr_declr)*
		)
	{
		curCL = null;
		//TODO CODE GENERATION
	}
	;

constr_decl
	: ^(c1=CONSTRUCTOR (par=parameter_list)? COLON
	{
		curFU = curCL.getConstructor(par);
		//TODO CODE GENERATION
	}
		local_var*
		statement*
		)
	{
		curFU = null;
		//TODO CODE GENERATION
	}
	;
	
destr_declr
	: ^(d1=DESTRUCTOR (par=parameter_list)? COLON
	{
		curFU = curCL.getDestructor(par);
		//TODO CODE GENERATION
	}
		local_var*
		statement*
		)
	{
		curFU = null;
		//TODO CODE GENERATION
	}
	;

field_decl
	:^(t1=type i1=IDENTIFIER ASSGN e1=expression)
	{
		if(Type.checkAssign(t1,e1.type)){
			//TODO CODE GENERATION
		}else{
			Error.printError("Incompatible type for assignment of field $1",i1.token);
		}
	}
	|^(t1=type (e1=array_expression)+ i1=IDENTIFIER)
	{
		//TODO CODE GENERATION
	}
	|^(t1=type i1=IDENTIFIER)
	{
		//TODO CODE GENERATION
	}
	;
	
function
	: ^(FUNC i1=IDENTIFIER 
	{
		if(curCL == null){
			curFU = curNS.getMethod($i1.text);
		}else{
			curFU = curCL.getMethod($i1.text);
		}
	}
		(par=parameter_list)? rt=type
		local_var*
		statement*
		)
	{
		curFU = null;
	}
	;
	
parameter_list returns [List<LocalField> f]
@init{
	f = new ArrayList<LocalField>();
}
	: ^(t1=type i1=IDENTIFIER 
	{
		f.add(new LocalField($i1.text,t1));
	}
	(COMMA t2=type i2=IDENTIFIER {f.add(new LocalField($i2.text,t2));})*)
	;
	
local_var
	:^(t1=type i1=IDENTIFIER ASSGN e1=expression)
	{
		if(Type.checkAssign(t1,e1.type)){
			//TODO CODE GENERATION
		}else{
			Error.printError("Incompatible type for assignment of local variable $1",i1.token);
		}
	}
	|^(t1=type (e1=array_expression)+ i1=IDENTIFIER)
	|^(t1=type i1=IDENTIFIER)
	;	

statement
	:  i1=IDENTIFIER statement //TODO 
	;
	
dot_statement[String line, boolean isClass, Namespace ns] returns [Expr t]
	: (d=DOT )+
	;
	
var_statement[String line, boolean isClass] returns[Expr e]
	: i1=IDENTIFIER 
	;

function_statement[String line, boolean isClass]
	: IDENTIFIER LPAREN RPAREN
	;

array_expression returns [Expr e]
	: l=LBRACK e1=expression RBRACK 
	{
		if(e1.type != Type.Integer){
		    Error.printError("Only Integer-Type allowed for array declaration", l.token);  
		}else{
			e = e1;
		}
	}
	;
	
expression returns [Expr e]
	: ^(LOR a = expression b = expression {if( a != null && b != null){e = new Or(a,b);}})
	| ^(LAND a = expression b = expression {if( a != null && b != null){e = new And(a,b);}})
	| ^(EQ a = expression b = expression {if( a != null && b != null){e = new Rel(a.s+"=="+b.s,a,b);}})
	| ^(NEQ a = expression b = expression {if( a != null && b != null){e = new Rel(a.s+"!="+b.s,a,b);}})
	| ^(LT a = expression b = expression {if( a != null && b != null){e = new Rel(a.s+"<"+b.s,a,b);}})
	| ^(LTEQ a = expression b = expression {if( a != null && b != null){e = new Rel(a.s+"<="+b.s,a,b);}})
	| ^(GT a = expression b = expression {if( a != null && b != null){e = new Rel(a.s+">"+b.s,a,b);}})
	| ^(GTEQ a = expression b = expression {if( a != null && b != null){e = new Rel(a.s+">="+b.s,a,b);}})
	| ^(PLUS a = expression b = expression {if( a != null && b != null){e = new Arith(a.s+"+"+b.s,a,b);}})
	| ^(MINUS a = expression b = expression {if( a != null && b != null){e = new Arith(a.s+"-"+b.s,a,b);}})
	| ^(TIMES a = expression b = expression {if( a != null && b != null){e = new Arith(a.s+"*"+b.s,a,b);}})
	| ^(DIV a = expression b = expression {if( a != null && b != null){e = new Arith(a.s+"+"+b.s,a,b);}})
	| ^(SHIFTR a = expression b = expression {if( a != null && b != null){e = new Arith(a.s+">>"+b.s,a,b);}})
	| ^(SHIFTL a = expression b = expression {if( a != null && b != null){e = new Arith(a.s+"<<"+b.s,a,b);}})
	| ^(NOT a = expression {if( a != null){e = new Not(a.s,a);}})
	| ^(NEGATION a = expression {if( a != null){e = new Unary("-"+a.s,a);}})
	| ^(NEW a = expression)
	| ^(DELETE a = expression)
	| ^(NAMEOF a = expression {if(a != null)e = new Unary(a.s,a);})
	| e1=INTEGER {e = new Constant(e1.getText(),Type.Integer);}
	| e1=FIXED_LITERAL {e = new Constant(e1.getText(),Type.Fixed);}
	| e1=STRING_LITERAL {e = new Constant(e1.getText(),Type.String);}
	| e1=CHARACTER_LITERAL {e = new Constant(e1.getText(),Type.Char);}
	| TRUE {e = Constant.True;}
	| FALSE {e = Constant.False;}
	| NULL {e = Constant.Null;}
	;
	
type returns [Type t]
	:	BOOLEAN {t = Type.Boolean;}
	|	BYTE {t = Type.Byte;}
	|	CHAR {t = Type.Char;}
	|	FIXED {t = Type.Fixed;}
	|	GAMELINK {t = Type.Gamelink;}
	|	COLOR {t = Type.Color;}
	|	INT {t = Type.Integer;}
	|	POINT {t = Type.Point;}
	|	STRING {t = Type.String;}
	|	ABILCMD {t = Type.Abilcmd;}
	|	ACTOR {t = Type.Actor;}
	|	ACTORSCOPE {t = Type.Actorscope;}
	|	BANK {t = Type.Bank;}
	|	CAMERAINFO {t = Type.Camerainfo;}
	|	MARKER {t = Type.Marker;}
	|	ORDER {t = Type.Order;}
	|	PLAYERGROUP {t = Type.Playergroup;}
	|	REGION {t = Type.Region;}
	|	REVEALER {t = Type.Revealer;}
	|	SOUNDLINK {t = Type.Soundlink;}
	|	TEXT {t = Type.Text;}
	|	TIMER {t = Type.Timer;}
	|	TRANSMISSIONSOURCE {t = Type.Transmissionsource;}
	|	TRIGGER {t = Type.Trigger;}
	|	UNITFILTER {t = Type.Unitfilter;}
	|	UNITGROUP {t = Type.Unitgroup;}
	|	UNITREF {t = Type.Unitref;}
	|	UNIT {t = Type.Unit;}
	|	WAVEINFO {t = Type.Waveinfo;}
	|	WAVETARGET {t = Type.Wavetarget;}
	|	DOODAD {t = Type.Doodad;}
	|	AIFILTER {t = Type.AIFilter;}
	|	SOUND {t = Type.Sound;}
	|	WAVE {t = Type.Wave;}
	| 	t1=custom_type {t = t1;}
	;
	
custom_type returns [Type t]
	: i1=IDENTIFIER 
	{
		if(Type.isCustomType(curNS+"_"+$i1.text)){
	 		t = Type.getCustomType(curNS+"_"+$i1.text);
	 	}else{
	 		Error.printError("Type $1 not defined for namespace "+curNS,i1.token);
	 	}
	}
	| i1=IDENTIFIER NAMESPACEACCESS i2=IDENTIFIER 
	{
		if(Main.table.namespaceExists($i1.text)){
			if(Type.isCustomType($i1.text+"_"+$i2.text)){
		 		t = Type.getCustomType($i1.text+"_"+$i2.text);
		 	}else{
		 		Error.printError("Type $1 not defined for namespace $2",i2.token, i1.token);
		 	}
		}else{
			Error.printError("Namespace $1 not defined",i1.token);
		}
	}
	;	
