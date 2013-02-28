
tree grammar GalaxyXWalker;

options {
  language = Java;
  tokenVocab = GalaxyX;
  ASTLabelType = CommonTree;
}
@header {
	package de.timoh.galaxyxparser;
	import de.timoh.galaxyxparser.typechecking.*;
	import de.timoh.galaxyxparser.typechecking.Error;
	import de.timoh.galaxyxparser.structures.Class;
	import de.timoh.galaxyxparser.structures.*;
	import de.timoh.galaxyxparser.Main;
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
	  {if(!table.namespaceExists(i1.getText())){
	      curNS = new Namespace(i1.getText());
	      table.putNamespace(i1.getText(),curNS);
	   }else{
	      curNS = table.getNamespace(i1.getText());
	   }
	  }
	  (field_decl | function | class_decl)*)
	  {curNS = null;}
	;

class_decl
	: ^(CLASS (p1=PUBLIC | p1=PRIVATE)? i1=IDENTIFIER c=INTEGER? 
		{if(curNS.isClassInNamespace(i1.getText())){
		 	Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Class is allready defined within namespace.");
		 }else{
	        boolean isPrivate = false,isPublic = false;
	   	    if(p1 != null){
	     		if(p1.getText().equals("public")){
	     			isPublic = true;
	     		}else{
	     			isPrivate = true;
	     		}
	     	}
	     	if(c != null){
	     		int i = Integer.valueOf(c.getText());
	     		curCL = new Class(i1.getText(),isPublic,isPrivate,i,curNS);
	     		curNS.addClass(curCL);
	     	}else{
	     		curCL = new Class(i1.getText(),isPublic,isPrivate,curNS);
	     		curNS.addClass(curCL);
	     	}
	     	Main.createStandardClassFunctions(curCL);
	     	Main.addDefaultConstructor(curCL);
			Main.addDefaultDestructor(curCL);
		 }
		}
		(field_decl | function | constr_decl | destr_declr)*)
	;

constr_decl
	: ^(c1=CONSTRUCTOR (par=parameter_list)? 
	   {curFU = new Constructor(curCL);
		for(int i = 0; i < par.size();i++){
			if(!((Constructor)curFU).addArgument(par.get(i))){
				Error.printError(c1.getLine(),c1.getCharPositionInLine(),"Multiple parameters with same name.");
			}
		}
		if(curCL.isConstructorDefined(((Constructor)curFU).toString())){
			Error.printError(c1.getLine(),c1.getCharPositionInLine(),"Constructor with same parameters is allready defined!");
		}else{
			curCL.addConstructor((Constructor)curFU);
			Main.openConstructor((Constructor)curFU);
		}
	   }
	    COLON
		local_var*
		statement*
		{Main.closeConstructor();}
		)
	;
	
destr_declr
	: ^(d1=DESTRUCTOR (par=parameter_list)? COLON
	   {curFU = new Destructor(curCL);
		for(int i = 0; i < par.size();i++){
			if(!((Destructor)curFU).addArgument(par.get(i))){
				Error.printError(d1.getLine(),d1.getCharPositionInLine(),"Multiple parameters with same name.");
			}
		}
		if(curCL.isDestructorDefined(((Destructor)curFU).toString())){
			Error.printError(d1.getLine(),d1.getCharPositionInLine(),"Destructor with same parameters is allready defined!");
		}else{
			curCL.addDestructor((Destructor)curFU);
			Main.openDestructor((Destructor)curFU);
		}
	   }
		local_var*
		statement*
		{Main.closeDestructor(curCL);}
		)
	;

field_decl
@init{
	int array_dim_count = 0;
	List<String> dimExpr = new ArrayList<String>();
}
	:^(t1=type (p1=PUBLIC | p1=PRIVATE)? s1=STATIC? i1=IDENTIFIER ASSGN e1=expression)
	   {
	    if(Type.checkAssign(t1,e1.type)){
	     	Field f;
	     	String line = curNS+"_";
	     	if(curCL != null)line += curCL+"_";
	        boolean isStatic = false,isPrivate = false,isPublic = false;
	   	    if(p1 != null){
	     		if(p1.getText().equals("public")){
	     			isPublic = true;
	     			line += "pub_";
	     		}else{
	     			isPrivate = true;
	     			line += "pri_";
	     		}
	     	}
		    if(s1 != null){
		    	if(curCL == null){
		    		Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Fields within namespaces can't be static.");
		    	}else{
		    		isStatic = true;
	     			line += "sta_";
		    	}
		    }
		    f = new Field(i1.getText(),t1,isStatic,isPrivate,isPublic);
		   	if(curCL == null){
		       if(curNS.isFieldInNamespace(i1.getText())){
		          Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Field allready defined!");
		       }else{
		       	  curNS.addField(i1.getText(),f);
		       	  line += i1.getText();
	       	  	  Main.addVar(line,t1,e1.s);
		       }
		    }else{
		       if(curCL.containsField(i1.getText())){
		          Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Field allready defined!");
		       }else{
		       	  curCL.addField(i1.getText(),f);
		       	  line += i1.getText();
	       	  	  Main.addVar(line,t1,e1.s);
		       }
		    }
		}else{
			System.out.println(t1);
			System.out.println(e1.type);
	    	Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Incorrect type assignment.");
		}
	   }
	|^(t1=type (p1=PUBLIC | p1=PRIVATE)? s1=STATIC? (e1=array_expression{array_dim_count++;dimExpr.add(e1.s);})+ i1=IDENTIFIER)
	   {
     	Field f;
     	String line = curNS+"_";
     	if(curCL != null)line += curCL+"_";
        boolean isStatic = false,isPrivate = false,isPublic = false,isArray = true;
   	    if(p1 != null){
     		if(p1.getText().equals("public")){
     			isPublic = true;
     			line += "pub_";
     		}else{
     			isPrivate = true;
     			line += "pri_";
     		}
     	}
	    if(s1 != null){
	    	if(curCL == null){
	    		Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Fields within namespaces can't be static.");
	    	}else{
	    		isStatic = true;
     			line += "sta_";
	    	}
	    }
	    f = new Field(i1.getText(),t1,isStatic,isPrivate,isPublic,isArray,array_dim_count);
	   	if(curCL == null){
	       if(curNS.isFieldInNamespace(i1.getText())){
	          Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Field allready defined!");
	       }else{
	       	  curNS.addField(i1.getText(),f);
	       	  line += i1.getText();
	       	  Main.addArrayVar(line,t1,array_dim_count,dimExpr);
	       }
	    }else{
	       if(curCL.containsField(i1.getText())){
	          Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Field allready defined!");
	       }else{
	       	  curCL.addField(i1.getText(),f);
	       	  line += i1.getText();
	       	  Main.addArrayVar(line,t1,array_dim_count,dimExpr);
	       }
	    }
	   }
	|^(t1=type (p1=PUBLIC | p1=PRIVATE)? s1=STATIC? i1=IDENTIFIER)
	   {
     	Field f;
     	String line = curNS+"_";
     	if(curCL != null)line += curCL+"_";
        boolean isStatic = false,isPrivate = false,isPublic = false;
   	    if(p1 != null){
     		if(p1.getText().equals("public")){
     			isPublic = true;
     			line += "pub_";
     		}else{
     			isPrivate = true;
     			line += "pri_";
     		}
     	}
	    if(s1 != null){
	    	if(curCL == null){
	    		Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Fields within namespaces can't be static.");
	    	}else{
	    		isStatic = true;
     			line += "sta_";
	    	}
	    }
	    f = new Field(i1.getText(),t1,isStatic,isPrivate,isPublic);
	   	if(curCL == null){
	       if(curNS.isFieldInNamespace(i1.getText())){
	          Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Field allready defined!");
	       }else{
	       	  curNS.addField(i1.getText(),f);
	       	  line += i1.getText();
	       	  Main.addVar(line,t1,"");
	       }
	    }else{
	       if(curCL.containsField(i1.getText())){
	          Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Field allready defined!");
	       }else{
	       	  curCL.addField(i1.getText(),f);
	       	  line += i1.getText();
	       	  Main.addVar(line,t1,"");
	       }
	    }
	   }
	;
	
function
	: ^(FUNC (p1=PUBLIC | p1=PRIVATE)? s1=STATIC? i1=IDENTIFIER (par=parameter_list)? rt=type
		{boolean isStatic = false,isPrivate = false,isPublic = false;
   	     if(p1 != null){
     	 	 if(p1.getText().equals("public")){
     			 isPublic = true;
     		 }else{
     		   	 isPrivate = true;
     		 }
     	 }
	     if(s1 != null){
	    	 if(curCL == null){
	    		 Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Functions within namespaces can't be static.");
	    	 }else{
	    		 isStatic = true;
	    	 }
	     }
		 if(curCL == null){
		 	curFU = new Method(curNS,curCL,isStatic,isPublic,isPrivate,i1.getText(),rt);
		 	curNS.addMethod(curFU.getName(),curFU);
		 }else{
		 	curFU = new Method(curNS,curCL,isStatic,isPublic,isPrivate,i1.getText(),rt);
		 	curCL.addMethod(curFU.getName(),curFU);
		 }
		 Main.openFunction(curFU);
		 for(int i = 0; i < par.size();i++){
		 	if(!curFU.addParameter(par.get(i))){
	    		 Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Multiple parameters with same name defined.");
		 	}else{	
		 		if(i != par.size()-1){
		 			Main.addFunctionParameter(par.get(i),false);
		 		}else{
		 			Main.addFunctionParameter(par.get(i),true);
		 		}
		 	}
		 }
		 Main.endFunctionParameter();
		}
		local_var*
		
		END FUNC
		{Main.closeBlock();
		 curFU = null;}
		)
	;
	
parameter_list returns [List<LocalField> f]
@init{
	List<LocalField> list = new ArrayList<LocalField>();
}
	: ^(t1=type i1=IDENTIFIER {list.add(new LocalField(i1.getText(),t1));}(COMMA t2=type i2=IDENTIFIER{list.add(new LocalField(i2.getText(),t2));})* {f = list;})
	;
	
local_var
@init{
	int array_dim_count = 0;
	List<String> dimExpr = new ArrayList<String>();
}
	:^(t1=type i1=IDENTIFIER ASSGN e1=expression)
	   {
	    if(Type.checkAssign(t1,e1.type)){
	     	LocalField f;
		    if(!curFU.isLocalDefined(i1.getText())){
		    	f = new LocalField(i1.getText(),t1);
		    	Main.addLocalVar(f,e1.s);
		    }else{
	    		Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Local variable allready defined!");
		    }
		}else{
			System.out.println(t1);
			System.out.println(e1.type);
	    	Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Incorrect type assignment.");
		}
	   }
	|^(t1=type (e1=array_expression{array_dim_count++;dimExpr.add(e1.s);})+ i1=IDENTIFIER)
	   {
     	LocalField f;
	    if(!curFU.isLocalDefined(i1.getText())){
	    	f = new LocalField(i1.getText(),t1,true,array_dim_count);
	    	Main.addLocalArrayVar(f,dimExpr);
	    }else{
    		Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Local variable allready defined!");
	    }	   }
	|^(t1=type i1=IDENTIFIER)
	   {
     	LocalField f;
	    if(!curFU.isLocalDefined(i1.getText())){
	    	f = new LocalField(i1.getText(),t1);
	    	Main.addLocalVar(f,"");
	    }else{
    		Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Local variable allready defined!");
	    }
	   }
	;	
//TODO STATEMENT IMPLIMENTIEREN!!
statement
@init{
	String c = null;
	boolean isClass = false; //Member must be static?
}
	:  ^('=' i1=IDENTIFIER
		 {
		 if(curNS.isClassInNamespace(i1.getText())){
			c = curNS.getClass(i1.getText())+"";
		 	isClass = true;
		 }
		} 
	
	
		dot_statement[c,isClass, curNS]?
	
	
		/*(t3=dot_structs[tmp]{t1 = t3;})? (e1=expression[i1.getText(),t1,i1.getLine(),i1.getCharPositionInLine()] {if(t1 != null && e1 != null){if(Type.checkAssign(t1,e1.type)){
													if(!t1.isNullable() && e1.type == Type.Null){
														System.err.println("line " +i1.getLine()+":"+i1.getCharPositionInLine()+" variable \'"+i1.getText()+"\' can\'t be nullified");
													}else{
														System.err.println("line " +i1.getLine()+":"+i1.getCharPositionInLine()+" wrong expression assigned to \'"+i1.getText()+"\'");
													}	
												}}}
										  ))*/)
	;
	
dot_statement[String line, boolean isClass, Namespace ns] returns [Expr t]
	: (d=DOT 
	   {if(isClass){
	    
	    }else{
	    	if(!curFU.isLocalDefined(line)){
	    		if(!curCL.containsField(line)){
	    			if(!curNS.isFieldInNamespace(line)){
	    				if(ns != curNS){
	    					if(!ns.isFieldInNamespace(line)){
	    						Error.printError(d.getLine(),d.getCharPositionInLine(),"Variable not defined.");  
	    					}else{
	    					
	    					}
	    				}else{
	    					Error.printError(d.getLine(),d.getCharPositionInLine(),"Variable not defined.");  
	    				}
	    			}else{
	    			
	    			}
	    		}else{
	    		
	    		}
	    	}else{
	    		
	    	}
	    }
	   }
	  )+
	;
	
var_statement[String line, boolean isClass] returns[Expr e]
	: i1=IDENTIFIER 
	;

function_statement[String line, boolean isClass]
	: IDENTIFIER LPAREN RPAREN
	;

array_expression returns [Expr e]
	: l=LBRACK e1=expression RBRACK 
	  {if(e1.type != Type.Integer){
	      Error.printError(l.getLine(),l.getCharPositionInLine(),"Only Integer-Type allowed for array declaration!");  
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
	| ^(CALL a = expression)
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
	: i1=IDENTIFIER {if(Type.isCustomType(i1.getText())){
					 	t = Type.getCustomType(i1.getText());
					 }else{
					 	Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Type not defined!");
					 }
					}
	| i1=IDENTIFIER NAMESPACEACCESS i2=IDENTIFIER 
					{if(Type.isCustomType(i1.getText()+"::"+i2.getText())){
					 	t = Type.getCustomType(i1.getText()+"::"+i2.getText());
					 }else{
					 	Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Type not defined!");
					 }
					}
	;	
