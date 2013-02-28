// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g 2013-02-28 12:10:06

	package com.galaxyx.galaxyxparser;
	import com.galaxyx.galaxyxparser.typechecking.*;
	import com.galaxyx.galaxyxparser.typechecking.Error;
	import com.galaxyx.galaxyxparser.structures.Class;
	import com.galaxyx.galaxyxparser.structures.*;
	import com.galaxyx.galaxyxparser.Main;
    import java.util.ArrayList;
    import java.util.List;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "STATIC", "TYPEDEF", "IDENTIFIER", "SEMI", "NAMESPACE", "COLON", "END", "INLINE", "FUNC", "LPAREN", "RPAREN", "RETURNS", "COMMA", "CLASS", "LBRACK", "INTEGER", "RBRACK", "EXTENDS", "CONSTRUCTOR", "DESTRUCTOR", "PUBLIC", "PRIVATE", "CONST", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "BOOLEAN", "BYTE", "CHAR", "FIXED", "GAMELINK", "COLOR", "INT", "POINT", "STRING", "ABILCMD", "ACTOR", "ACTORSCOPE", "BANK", "CAMERAINFO", "MARKER", "ORDER", "PLAYERGROUP", "REGION", "REVEALER", "SOUNDLINK", "TEXT", "TIMER", "TRANSMISSIONSOURCE", "TRIGGER", "UNITFILTER", "UNITGROUP", "UNITREF", "UNIT", "WAVEINFO", "WAVETARGET", "DOODAD", "AIFILTER", "SOUND", "WAVE", "VOID", "PLUS", "SUB", "TIMES", "DIV", "DOT", "NOT", "NEW", "DELETE", "NAMEOF", "NATIVE", "CHARACTER_LITERAL", "STRING_LITERAL", "FIXED_LITERAL", "TRUE", "FALSE", "NULL", "THIS", "LOR", "LAND", "OR", "XOR", "AND", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "SHIFTL", "SHIFTR", "IF", "ELIF", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "RETURN", "STRUCT", "INTERFACE", "IMPLEMENTS", "SUPER", "INITIALIZER", "DEFINE", "TILDE", "INC", "DEC", "LBRACE", "RBRACE", "PREFIX", "LETTER", "EscapeSequence", "DIGIT", "HEX_LITERAL", "HexDigit", "Exponent", "FloatTypeSuffix", "OctalEscape", "UnicodeEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT", "MINUS", "CALL", "NAMESPACEACCESS", "'='"
    };
    public static final int EOF=-1;
    public static final int NEGATION=4;
    public static final int STATIC=5;
    public static final int TYPEDEF=6;
    public static final int IDENTIFIER=7;
    public static final int SEMI=8;
    public static final int NAMESPACE=9;
    public static final int COLON=10;
    public static final int END=11;
    public static final int INLINE=12;
    public static final int FUNC=13;
    public static final int LPAREN=14;
    public static final int RPAREN=15;
    public static final int RETURNS=16;
    public static final int COMMA=17;
    public static final int CLASS=18;
    public static final int LBRACK=19;
    public static final int INTEGER=20;
    public static final int RBRACK=21;
    public static final int EXTENDS=22;
    public static final int CONSTRUCTOR=23;
    public static final int DESTRUCTOR=24;
    public static final int PUBLIC=25;
    public static final int PRIVATE=26;
    public static final int CONST=27;
    public static final int ASSGN=28;
    public static final int ASSGNP=29;
    public static final int ASSGNS=30;
    public static final int ASSGNT=31;
    public static final int ASSGND=32;
    public static final int BOOLEAN=33;
    public static final int BYTE=34;
    public static final int CHAR=35;
    public static final int FIXED=36;
    public static final int GAMELINK=37;
    public static final int COLOR=38;
    public static final int INT=39;
    public static final int POINT=40;
    public static final int STRING=41;
    public static final int ABILCMD=42;
    public static final int ACTOR=43;
    public static final int ACTORSCOPE=44;
    public static final int BANK=45;
    public static final int CAMERAINFO=46;
    public static final int MARKER=47;
    public static final int ORDER=48;
    public static final int PLAYERGROUP=49;
    public static final int REGION=50;
    public static final int REVEALER=51;
    public static final int SOUNDLINK=52;
    public static final int TEXT=53;
    public static final int TIMER=54;
    public static final int TRANSMISSIONSOURCE=55;
    public static final int TRIGGER=56;
    public static final int UNITFILTER=57;
    public static final int UNITGROUP=58;
    public static final int UNITREF=59;
    public static final int UNIT=60;
    public static final int WAVEINFO=61;
    public static final int WAVETARGET=62;
    public static final int DOODAD=63;
    public static final int AIFILTER=64;
    public static final int SOUND=65;
    public static final int WAVE=66;
    public static final int VOID=67;
    public static final int PLUS=68;
    public static final int SUB=69;
    public static final int TIMES=70;
    public static final int DIV=71;
    public static final int DOT=72;
    public static final int NOT=73;
    public static final int NEW=74;
    public static final int DELETE=75;
    public static final int NAMEOF=76;
    public static final int NATIVE=77;
    public static final int CHARACTER_LITERAL=78;
    public static final int STRING_LITERAL=79;
    public static final int FIXED_LITERAL=80;
    public static final int TRUE=81;
    public static final int FALSE=82;
    public static final int NULL=83;
    public static final int THIS=84;
    public static final int LOR=85;
    public static final int LAND=86;
    public static final int OR=87;
    public static final int XOR=88;
    public static final int AND=89;
    public static final int EQ=90;
    public static final int NEQ=91;
    public static final int LT=92;
    public static final int GT=93;
    public static final int LTEQ=94;
    public static final int GTEQ=95;
    public static final int SHIFTL=96;
    public static final int SHIFTR=97;
    public static final int IF=98;
    public static final int ELIF=99;
    public static final int ELSE=100;
    public static final int WHILE=101;
    public static final int FOR=102;
    public static final int BREAK=103;
    public static final int CONTINUE=104;
    public static final int RETURN=105;
    public static final int STRUCT=106;
    public static final int INTERFACE=107;
    public static final int IMPLEMENTS=108;
    public static final int SUPER=109;
    public static final int INITIALIZER=110;
    public static final int DEFINE=111;
    public static final int TILDE=112;
    public static final int INC=113;
    public static final int DEC=114;
    public static final int LBRACE=115;
    public static final int RBRACE=116;
    public static final int PREFIX=117;
    public static final int LETTER=118;
    public static final int EscapeSequence=119;
    public static final int DIGIT=120;
    public static final int HEX_LITERAL=121;
    public static final int HexDigit=122;
    public static final int Exponent=123;
    public static final int FloatTypeSuffix=124;
    public static final int OctalEscape=125;
    public static final int UnicodeEscape=126;
    public static final int WS=127;
    public static final int LINE_COMMENT=128;
    public static final int MULTI_COMMENT=129;
    public static final int T__133=133;
    public static final int MINUS=130;
    public static final int CALL=131;
    public static final int NAMESPACEACCESS=132;

    // delegates
    // delegators


        public GalaxyXWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GalaxyXWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g"; }


    	private boolean isLocal = false;
    	private Namespace curNS;
    	private Class curCL;
    	private Method curFU;
    	private boolean isPrivate = false;
    	private boolean isPublic = false;
    	private SymbolTable table = new SymbolTable();



    // $ANTLR start "evaluator"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:29:1: evaluator : ( namespace )* EOF ;
    public final void evaluator() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:30:2: ( ( namespace )* EOF )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:30:4: ( namespace )* EOF
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:30:4: ( namespace )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:30:4: namespace
            	    {
            	    pushFollow(FOLLOW_namespace_in_evaluator55);
            	    namespace();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_evaluator58); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "evaluator"


    // $ANTLR start "namespace"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:33:1: namespace : ^( NAMESPACE i1= IDENTIFIER ( field_decl | function | class_decl )* ) ;
    public final void namespace() throws RecognitionException {
        CommonTree i1=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:34:2: ( ^( NAMESPACE i1= IDENTIFIER ( field_decl | function | class_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:34:3: ^( NAMESPACE i1= IDENTIFIER ( field_decl | function | class_decl )* )
            {
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace69); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace73); 
            if(!table.namespaceExists(i1.getText())){
            	      curNS = new Namespace(i1.getText());
            	      table.putNamespace(i1.getText(),curNS);
            	   }else{
            	      curNS = table.getNamespace(i1.getText());
            	   }
            	  
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:42:4: ( field_decl | function | class_decl )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case IDENTIFIER:
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case FIXED:
                case GAMELINK:
                case COLOR:
                case INT:
                case POINT:
                case STRING:
                case ABILCMD:
                case ACTOR:
                case ACTORSCOPE:
                case BANK:
                case CAMERAINFO:
                case MARKER:
                case ORDER:
                case PLAYERGROUP:
                case REGION:
                case REVEALER:
                case SOUNDLINK:
                case TEXT:
                case TIMER:
                case TRANSMISSIONSOURCE:
                case TRIGGER:
                case UNITFILTER:
                case UNITGROUP:
                case UNITREF:
                case UNIT:
                case WAVEINFO:
                case WAVETARGET:
                case DOODAD:
                case AIFILTER:
                case SOUND:
                case WAVE:
                    {
                    alt2=1;
                    }
                    break;
                case FUNC:
                    {
                    alt2=2;
                    }
                    break;
                case CLASS:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:42:5: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace85);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:42:18: function
            	    {
            	    pushFollow(FOLLOW_function_in_namespace89);
            	    function();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:42:29: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace93);
            	    class_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input, Token.UP, null); 
            curNS = null;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "namespace"


    // $ANTLR start "class_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:46:1: class_decl : ^( CLASS (p1= PUBLIC | p1= PRIVATE )? i1= IDENTIFIER (c= INTEGER )? ( field_decl | function | constr_decl | destr_declr )* ) ;
    public final void class_decl() throws RecognitionException {
        CommonTree p1=null;
        CommonTree i1=null;
        CommonTree c=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:47:2: ( ^( CLASS (p1= PUBLIC | p1= PRIVATE )? i1= IDENTIFIER (c= INTEGER )? ( field_decl | function | constr_decl | destr_declr )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:47:4: ^( CLASS (p1= PUBLIC | p1= PRIVATE )? i1= IDENTIFIER (c= INTEGER )? ( field_decl | function | constr_decl | destr_declr )* )
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_decl113); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:47:12: (p1= PUBLIC | p1= PRIVATE )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==PUBLIC) ) {
                alt3=1;
            }
            else if ( (LA3_0==PRIVATE) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:47:13: p1= PUBLIC
                    {
                    p1=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_decl118); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:47:25: p1= PRIVATE
                    {
                    p1=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_class_decl124); 

                    }
                    break;

            }

            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl130); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:47:53: (c= INTEGER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INTEGER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:47:53: c= INTEGER
                    {
                    c=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_class_decl134); 

                    }
                    break;

            }

            if(curNS.isClassInNamespace(i1.getText())){
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
            		
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:72:3: ( field_decl | function | constr_decl | destr_declr )*
            loop5:
            do {
                int alt5=5;
                switch ( input.LA(1) ) {
                case IDENTIFIER:
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case FIXED:
                case GAMELINK:
                case COLOR:
                case INT:
                case POINT:
                case STRING:
                case ABILCMD:
                case ACTOR:
                case ACTORSCOPE:
                case BANK:
                case CAMERAINFO:
                case MARKER:
                case ORDER:
                case PLAYERGROUP:
                case REGION:
                case REVEALER:
                case SOUNDLINK:
                case TEXT:
                case TIMER:
                case TRANSMISSIONSOURCE:
                case TRIGGER:
                case UNITFILTER:
                case UNITGROUP:
                case UNITREF:
                case UNIT:
                case WAVEINFO:
                case WAVETARGET:
                case DOODAD:
                case AIFILTER:
                case SOUND:
                case WAVE:
                    {
                    alt5=1;
                    }
                    break;
                case FUNC:
                    {
                    alt5=2;
                    }
                    break;
                case CONSTRUCTOR:
                    {
                    alt5=3;
                    }
                    break;
                case DESTRUCTOR:
                    {
                    alt5=4;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:72:4: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl145);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:72:17: function
            	    {
            	    pushFollow(FOLLOW_function_in_class_decl149);
            	    function();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:72:28: constr_decl
            	    {
            	    pushFollow(FOLLOW_constr_decl_in_class_decl153);
            	    constr_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:72:42: destr_declr
            	    {
            	    pushFollow(FOLLOW_destr_declr_in_class_decl157);
            	    destr_declr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "class_decl"


    // $ANTLR start "constr_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:75:1: constr_decl : ^(c1= CONSTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* ) ;
    public final void constr_decl() throws RecognitionException {
        CommonTree c1=null;
        List<LocalField> par = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:76:2: ( ^(c1= CONSTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:76:4: ^(c1= CONSTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* )
            {
            c1=(CommonTree)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constr_decl174); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:76:21: (par= parameter_list )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER||(LA6_0>=BOOLEAN && LA6_0<=WAVE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:76:22: par= parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_constr_decl179);
                    par=parameter_list();

                    state._fsp--;


                    }
                    break;

            }

            curFU = new Constructor(curCL);
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
            	   
            match(input,COLON,FOLLOW_COLON_in_constr_decl195); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:91:3: ( local_var )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENTIFIER||(LA7_0>=BOOLEAN && LA7_0<=WAVE)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:91:3: local_var
            	    {
            	    pushFollow(FOLLOW_local_var_in_constr_decl199);
            	    local_var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:92:3: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==133) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:92:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constr_decl204);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            Main.closeConstructor();

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constr_decl"


    // $ANTLR start "destr_declr"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:97:1: destr_declr : ^(d1= DESTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* ) ;
    public final void destr_declr() throws RecognitionException {
        CommonTree d1=null;
        List<LocalField> par = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:98:2: ( ^(d1= DESTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:98:4: ^(d1= DESTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* )
            {
            d1=(CommonTree)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destr_declr228); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:98:20: (par= parameter_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER||(LA9_0>=BOOLEAN && LA9_0<=WAVE)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:98:21: par= parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_destr_declr233);
                    par=parameter_list();

                    state._fsp--;


                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_destr_declr237); 
            curFU = new Destructor(curCL);
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
            	   
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:112:3: ( local_var )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDENTIFIER||(LA10_0>=BOOLEAN && LA10_0<=WAVE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:112:3: local_var
            	    {
            	    pushFollow(FOLLOW_local_var_in_destr_declr247);
            	    local_var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:113:3: ( statement )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==133) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:113:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_destr_declr252);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            Main.closeDestructor(curCL);

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "destr_declr"


    // $ANTLR start "field_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:118:1: field_decl : ( ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER ASSGN e1= expression ) | ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? (e1= array_expression )+ i1= IDENTIFIER ) | ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER ) );
    public final void field_decl() throws RecognitionException {
        CommonTree p1=null;
        CommonTree s1=null;
        CommonTree i1=null;
        Type t1 = null;

        Expr e1 = null;



        	int array_dim_count = 0;
        	List<String> dimExpr = new ArrayList<String>();

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:123:2: ( ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER ASSGN e1= expression ) | ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? (e1= array_expression )+ i1= IDENTIFIER ) | ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER ) )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:123:3: ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER ASSGN e1= expression )
                    {
                    pushFollow(FOLLOW_type_in_field_decl278);
                    t1=type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:123:13: (p1= PUBLIC | p1= PRIVATE )?
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==PUBLIC) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==PRIVATE) ) {
                        alt12=2;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:123:14: p1= PUBLIC
                            {
                            p1=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_field_decl283); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:123:26: p1= PRIVATE
                            {
                            p1=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_field_decl289); 

                            }
                            break;

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:123:41: (s1= STATIC )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==STATIC) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:123:41: s1= STATIC
                            {
                            s1=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_field_decl295); 

                            }
                            break;

                    }

                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl300); 
                    match(input,ASSGN,FOLLOW_ASSGN_in_field_decl302); 
                    pushFollow(FOLLOW_expression_in_field_decl306);
                    e1=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

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
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:171:3: ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? (e1= array_expression )+ i1= IDENTIFIER )
                    {
                    pushFollow(FOLLOW_type_in_field_decl320);
                    t1=type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:171:13: (p1= PUBLIC | p1= PRIVATE )?
                    int alt14=3;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==PUBLIC) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==PRIVATE) ) {
                        alt14=2;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:171:14: p1= PUBLIC
                            {
                            p1=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_field_decl325); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:171:26: p1= PRIVATE
                            {
                            p1=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_field_decl331); 

                            }
                            break;

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:171:41: (s1= STATIC )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==STATIC) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:171:41: s1= STATIC
                            {
                            s1=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_field_decl337); 

                            }
                            break;

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:171:50: (e1= array_expression )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LBRACK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:171:51: e1= array_expression
                    	    {
                    	    pushFollow(FOLLOW_array_expression_in_field_decl343);
                    	    e1=array_expression();

                    	    state._fsp--;

                    	    array_dim_count++;dimExpr.add(e1.s);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl350); 

                    match(input, Token.UP, null); 

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
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:213:3: ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER )
                    {
                    pushFollow(FOLLOW_type_in_field_decl364);
                    t1=type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:213:13: (p1= PUBLIC | p1= PRIVATE )?
                    int alt17=3;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==PUBLIC) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==PRIVATE) ) {
                        alt17=2;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:213:14: p1= PUBLIC
                            {
                            p1=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_field_decl369); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:213:26: p1= PRIVATE
                            {
                            p1=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_field_decl375); 

                            }
                            break;

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:213:41: (s1= STATIC )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==STATIC) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:213:41: s1= STATIC
                            {
                            s1=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_field_decl381); 

                            }
                            break;

                    }

                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl386); 

                    match(input, Token.UP, null); 

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
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "field_decl"


    // $ANTLR start "function"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:257:1: function : ^( FUNC (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER (par= parameter_list )? rt= type ( local_var )* END FUNC ) ;
    public final void function() throws RecognitionException {
        CommonTree p1=null;
        CommonTree s1=null;
        CommonTree i1=null;
        List<LocalField> par = null;

        Type rt = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:2: ( ^( FUNC (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER (par= parameter_list )? rt= type ( local_var )* END FUNC ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:4: ^( FUNC (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER (par= parameter_list )? rt= type ( local_var )* END FUNC )
            {
            match(input,FUNC,FOLLOW_FUNC_in_function406); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:11: (p1= PUBLIC | p1= PRIVATE )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==PUBLIC) ) {
                alt20=1;
            }
            else if ( (LA20_0==PRIVATE) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:12: p1= PUBLIC
                    {
                    p1=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_function411); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:24: p1= PRIVATE
                    {
                    p1=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_function417); 

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:39: (s1= STATIC )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==STATIC) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:39: s1= STATIC
                    {
                    s1=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_function423); 

                    }
                    break;

            }

            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function428); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:62: (par= parameter_list )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:63: par= parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function433);
                    par=parameter_list();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_function439);
            rt=type();

            state._fsp--;

            boolean isStatic = false,isPrivate = false,isPublic = false;
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
            		
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:295:3: ( local_var )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==IDENTIFIER||(LA23_0>=BOOLEAN && LA23_0<=WAVE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:295:3: local_var
            	    {
            	    pushFollow(FOLLOW_local_var_in_function447);
            	    local_var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_function455); 
            match(input,FUNC,FOLLOW_FUNC_in_function457); 
            Main.closeBlock();
            		 curFU = null;

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function"


    // $ANTLR start "parameter_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:303:1: parameter_list returns [List<LocalField> f] : ^(t1= type i1= IDENTIFIER ( COMMA t2= type i2= IDENTIFIER )* ) ;
    public final List<LocalField> parameter_list() throws RecognitionException {
        List<LocalField> f = null;

        CommonTree i1=null;
        CommonTree i2=null;
        Type t1 = null;

        Type t2 = null;



        	List<LocalField> list = new ArrayList<LocalField>();

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:307:2: ( ^(t1= type i1= IDENTIFIER ( COMMA t2= type i2= IDENTIFIER )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:307:4: ^(t1= type i1= IDENTIFIER ( COMMA t2= type i2= IDENTIFIER )* )
            {
            pushFollow(FOLLOW_type_in_parameter_list488);
            t1=type();

            state._fsp--;


            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_list492); 
            list.add(new LocalField(i1.getText(),t1));
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:307:72: ( COMMA t2= type i2= IDENTIFIER )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:307:73: COMMA t2= type i2= IDENTIFIER
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_parameter_list496); 
            	    pushFollow(FOLLOW_type_in_parameter_list500);
            	    t2=type();

            	    state._fsp--;

            	    i2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_list504); 
            	    list.add(new LocalField(i2.getText(),t2));

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            f = list;

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return f;
    }
    // $ANTLR end "parameter_list"


    // $ANTLR start "local_var"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:310:1: local_var : ( ^(t1= type i1= IDENTIFIER ASSGN e1= expression ) | ^(t1= type (e1= array_expression )+ i1= IDENTIFIER ) | ^(t1= type i1= IDENTIFIER ) );
    public final void local_var() throws RecognitionException {
        CommonTree i1=null;
        Type t1 = null;

        Expr e1 = null;



        	int array_dim_count = 0;
        	List<String> dimExpr = new ArrayList<String>();

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:315:2: ( ^(t1= type i1= IDENTIFIER ASSGN e1= expression ) | ^(t1= type (e1= array_expression )+ i1= IDENTIFIER ) | ^(t1= type i1= IDENTIFIER ) )
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:315:3: ^(t1= type i1= IDENTIFIER ASSGN e1= expression )
                    {
                    pushFollow(FOLLOW_type_in_local_var528);
                    t1=type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var532); 
                    match(input,ASSGN,FOLLOW_ASSGN_in_local_var534); 
                    pushFollow(FOLLOW_expression_in_local_var538);
                    e1=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

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
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:331:3: ^(t1= type (e1= array_expression )+ i1= IDENTIFIER )
                    {
                    pushFollow(FOLLOW_type_in_local_var552);
                    t1=type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:331:13: (e1= array_expression )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==LBRACK) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:331:14: e1= array_expression
                    	    {
                    	    pushFollow(FOLLOW_array_expression_in_local_var557);
                    	    e1=array_expression();

                    	    state._fsp--;

                    	    array_dim_count++;dimExpr.add(e1.s);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);

                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var564); 

                    match(input, Token.UP, null); 

                         	LocalField f;
                    	    if(!curFU.isLocalDefined(i1.getText())){
                    	    	f = new LocalField(i1.getText(),t1,true,array_dim_count);
                    	    	Main.addLocalArrayVar(f,dimExpr);
                    	    }else{
                        		Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Local variable allready defined!");
                    	    }	   

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:340:3: ^(t1= type i1= IDENTIFIER )
                    {
                    pushFollow(FOLLOW_type_in_local_var578);
                    t1=type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var582); 

                    match(input, Token.UP, null); 

                         	LocalField f;
                    	    if(!curFU.isLocalDefined(i1.getText())){
                    	    	f = new LocalField(i1.getText(),t1);
                    	    	Main.addLocalVar(f,"");
                    	    }else{
                        		Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Local variable allready defined!");
                    	    }
                    	   

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "local_var"


    // $ANTLR start "statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:352:1: statement : ^( '=' i1= IDENTIFIER ( dot_statement[c,isClass, curNS] )? ) ;
    public final void statement() throws RecognitionException {
        CommonTree i1=null;


        	String c = null;
        	boolean isClass = false; //Member must be static?

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:357:2: ( ^( '=' i1= IDENTIFIER ( dot_statement[c,isClass, curNS] )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:357:5: ^( '=' i1= IDENTIFIER ( dot_statement[c,isClass, curNS] )? )
            {
            match(input,133,FOLLOW_133_in_statement607); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement611); 

            		 if(curNS.isClassInNamespace(i1.getText())){
            			c = curNS.getClass(i1.getText())+"";
            		 	isClass = true;
            		 }
            		
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:366:3: ( dot_statement[c,isClass, curNS] )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DOT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:366:3: dot_statement[c,isClass, curNS]
                    {
                    pushFollow(FOLLOW_dot_statement_in_statement625);
                    dot_statement(c, isClass, curNS);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "dot_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:379:1: dot_statement[String line, boolean isClass, Namespace ns] returns [Expr t] : (d= DOT )+ ;
    public final Expr dot_statement(String line, boolean isClass, Namespace ns) throws RecognitionException {
        Expr t = null;

        CommonTree d=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:380:2: ( (d= DOT )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:380:4: (d= DOT )+
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:380:4: (d= DOT )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==DOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:380:5: d= DOT
            	    {
            	    d=(CommonTree)match(input,DOT,FOLLOW_DOT_in_dot_statement656); 
            	    if(isClass){
            	    	    
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
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "dot_statement"


    // $ANTLR start "var_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:410:1: var_statement[String line, boolean isClass] returns [Expr e] : i1= IDENTIFIER ;
    public final Expr var_statement(String line, boolean isClass) throws RecognitionException {
        Expr e = null;

        CommonTree i1=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:411:2: (i1= IDENTIFIER )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:411:4: i1= IDENTIFIER
            {
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_statement687); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "var_statement"


    // $ANTLR start "function_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:414:1: function_statement[String line, boolean isClass] : IDENTIFIER LPAREN RPAREN ;
    public final void function_statement(String line, boolean isClass) throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:415:2: ( IDENTIFIER LPAREN RPAREN )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:415:4: IDENTIFIER LPAREN RPAREN
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_statement700); 
            match(input,LPAREN,FOLLOW_LPAREN_in_function_statement702); 
            match(input,RPAREN,FOLLOW_RPAREN_in_function_statement704); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function_statement"


    // $ANTLR start "array_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:418:1: array_expression returns [Expr e] : l= LBRACK e1= expression RBRACK ;
    public final Expr array_expression() throws RecognitionException {
        Expr e = null;

        CommonTree l=null;
        Expr e1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:419:2: (l= LBRACK e1= expression RBRACK )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:419:4: l= LBRACK e1= expression RBRACK
            {
            l=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_array_expression721); 
            pushFollow(FOLLOW_expression_in_array_expression725);
            e1=expression();

            state._fsp--;

            match(input,RBRACK,FOLLOW_RBRACK_in_array_expression727); 
            if(e1.type != Type.Integer){
            	      Error.printError(l.getLine(),l.getCharPositionInLine(),"Only Integer-Type allowed for array declaration!");  
            	   }else{
            	   	  e = e1;
            	   }
            	  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "array_expression"


    // $ANTLR start "expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:428:1: expression returns [Expr e] : ( ^( LOR a= expression b= expression ) | ^( LAND a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NEQ a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( PLUS a= expression b= expression ) | ^( MINUS a= expression b= expression ) | ^( TIMES a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( SHIFTR a= expression b= expression ) | ^( SHIFTL a= expression b= expression ) | ^( NOT a= expression ) | ^( NEGATION a= expression ) | ^( NEW a= expression ) | ^( DELETE a= expression ) | ^( CALL a= expression ) | ^( NAMEOF a= expression ) | e1= INTEGER | e1= FIXED_LITERAL | e1= STRING_LITERAL | e1= CHARACTER_LITERAL | TRUE | FALSE | NULL );
    public final Expr expression() throws RecognitionException {
        Expr e = null;

        CommonTree e1=null;
        Expr a = null;

        Expr b = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:429:2: ( ^( LOR a= expression b= expression ) | ^( LAND a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NEQ a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( PLUS a= expression b= expression ) | ^( MINUS a= expression b= expression ) | ^( TIMES a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( SHIFTR a= expression b= expression ) | ^( SHIFTL a= expression b= expression ) | ^( NOT a= expression ) | ^( NEGATION a= expression ) | ^( NEW a= expression ) | ^( DELETE a= expression ) | ^( CALL a= expression ) | ^( NAMEOF a= expression ) | e1= INTEGER | e1= FIXED_LITERAL | e1= STRING_LITERAL | e1= CHARACTER_LITERAL | TRUE | FALSE | NULL )
            int alt29=27;
            switch ( input.LA(1) ) {
            case LOR:
                {
                alt29=1;
                }
                break;
            case LAND:
                {
                alt29=2;
                }
                break;
            case EQ:
                {
                alt29=3;
                }
                break;
            case NEQ:
                {
                alt29=4;
                }
                break;
            case LT:
                {
                alt29=5;
                }
                break;
            case LTEQ:
                {
                alt29=6;
                }
                break;
            case GT:
                {
                alt29=7;
                }
                break;
            case GTEQ:
                {
                alt29=8;
                }
                break;
            case PLUS:
                {
                alt29=9;
                }
                break;
            case MINUS:
                {
                alt29=10;
                }
                break;
            case TIMES:
                {
                alt29=11;
                }
                break;
            case DIV:
                {
                alt29=12;
                }
                break;
            case SHIFTR:
                {
                alt29=13;
                }
                break;
            case SHIFTL:
                {
                alt29=14;
                }
                break;
            case NOT:
                {
                alt29=15;
                }
                break;
            case NEGATION:
                {
                alt29=16;
                }
                break;
            case NEW:
                {
                alt29=17;
                }
                break;
            case DELETE:
                {
                alt29=18;
                }
                break;
            case CALL:
                {
                alt29=19;
                }
                break;
            case NAMEOF:
                {
                alt29=20;
                }
                break;
            case INTEGER:
                {
                alt29=21;
                }
                break;
            case FIXED_LITERAL:
                {
                alt29=22;
                }
                break;
            case STRING_LITERAL:
                {
                alt29=23;
                }
                break;
            case CHARACTER_LITERAL:
                {
                alt29=24;
                }
                break;
            case TRUE:
                {
                alt29=25;
                }
                break;
            case FALSE:
                {
                alt29=26;
                }
                break;
            case NULL:
                {
                alt29=27;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:429:4: ^( LOR a= expression b= expression )
                    {
                    match(input,LOR,FOLLOW_LOR_in_expression750); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression756);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression762);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Or(a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:430:4: ^( LAND a= expression b= expression )
                    {
                    match(input,LAND,FOLLOW_LAND_in_expression771); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression777);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression783);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new And(a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:431:4: ^( EQ a= expression b= expression )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expression792); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression798);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression804);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"=="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:432:4: ^( NEQ a= expression b= expression )
                    {
                    match(input,NEQ,FOLLOW_NEQ_in_expression813); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression819);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression825);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"!="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:433:4: ^( LT a= expression b= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression834); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression840);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression846);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"<"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:434:4: ^( LTEQ a= expression b= expression )
                    {
                    match(input,LTEQ,FOLLOW_LTEQ_in_expression855); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression861);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression867);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"<="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:435:4: ^( GT a= expression b= expression )
                    {
                    match(input,GT,FOLLOW_GT_in_expression876); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression882);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression888);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+">"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:436:4: ^( GTEQ a= expression b= expression )
                    {
                    match(input,GTEQ,FOLLOW_GTEQ_in_expression897); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression903);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression909);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+">="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:437:4: ^( PLUS a= expression b= expression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression918); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression924);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression930);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"+"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:438:4: ^( MINUS a= expression b= expression )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expression939); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression945);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression951);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"-"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:439:4: ^( TIMES a= expression b= expression )
                    {
                    match(input,TIMES,FOLLOW_TIMES_in_expression960); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression966);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression972);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"*"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:440:4: ^( DIV a= expression b= expression )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expression981); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression987);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression993);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"+"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:441:4: ^( SHIFTR a= expression b= expression )
                    {
                    match(input,SHIFTR,FOLLOW_SHIFTR_in_expression1002); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1008);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1014);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+">>"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:442:4: ^( SHIFTL a= expression b= expression )
                    {
                    match(input,SHIFTL,FOLLOW_SHIFTL_in_expression1023); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1029);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1035);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"<<"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:443:4: ^( NOT a= expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression1044); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1050);
                    a=expression();

                    state._fsp--;

                    if( a != null){e = new Not(a.s,a);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:444:4: ^( NEGATION a= expression )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expression1059); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1065);
                    a=expression();

                    state._fsp--;

                    if( a != null){e = new Unary("-"+a.s,a);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:445:4: ^( NEW a= expression )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression1074); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1080);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:446:4: ^( DELETE a= expression )
                    {
                    match(input,DELETE,FOLLOW_DELETE_in_expression1087); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1093);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:447:4: ^( CALL a= expression )
                    {
                    match(input,CALL,FOLLOW_CALL_in_expression1100); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1106);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:448:4: ^( NAMEOF a= expression )
                    {
                    match(input,NAMEOF,FOLLOW_NAMEOF_in_expression1113); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1119);
                    a=expression();

                    state._fsp--;

                    if(a != null)e = new Unary(a.s,a);

                    match(input, Token.UP, null); 

                    }
                    break;
                case 21 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:449:4: e1= INTEGER
                    {
                    e1=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expression1129); 
                    e = new Constant(e1.getText(),Type.Integer);

                    }
                    break;
                case 22 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:450:4: e1= FIXED_LITERAL
                    {
                    e1=(CommonTree)match(input,FIXED_LITERAL,FOLLOW_FIXED_LITERAL_in_expression1138); 
                    e = new Constant(e1.getText(),Type.Fixed);

                    }
                    break;
                case 23 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:451:4: e1= STRING_LITERAL
                    {
                    e1=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_expression1147); 
                    e = new Constant(e1.getText(),Type.String);

                    }
                    break;
                case 24 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:452:4: e1= CHARACTER_LITERAL
                    {
                    e1=(CommonTree)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_expression1156); 
                    e = new Constant(e1.getText(),Type.Char);

                    }
                    break;
                case 25 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:453:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_expression1163); 
                    e = Constant.True;

                    }
                    break;
                case 26 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:454:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_expression1170); 
                    e = Constant.False;

                    }
                    break;
                case 27 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:455:4: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_expression1177); 
                    e = Constant.Null;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "expression"


    // $ANTLR start "type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:458:1: type returns [Type t] : ( BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | t1= custom_type );
    public final Type type() throws RecognitionException {
        Type t = null;

        Type t1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:459:2: ( BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | t1= custom_type )
            int alt30=35;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt30=1;
                }
                break;
            case BYTE:
                {
                alt30=2;
                }
                break;
            case CHAR:
                {
                alt30=3;
                }
                break;
            case FIXED:
                {
                alt30=4;
                }
                break;
            case GAMELINK:
                {
                alt30=5;
                }
                break;
            case COLOR:
                {
                alt30=6;
                }
                break;
            case INT:
                {
                alt30=7;
                }
                break;
            case POINT:
                {
                alt30=8;
                }
                break;
            case STRING:
                {
                alt30=9;
                }
                break;
            case ABILCMD:
                {
                alt30=10;
                }
                break;
            case ACTOR:
                {
                alt30=11;
                }
                break;
            case ACTORSCOPE:
                {
                alt30=12;
                }
                break;
            case BANK:
                {
                alt30=13;
                }
                break;
            case CAMERAINFO:
                {
                alt30=14;
                }
                break;
            case MARKER:
                {
                alt30=15;
                }
                break;
            case ORDER:
                {
                alt30=16;
                }
                break;
            case PLAYERGROUP:
                {
                alt30=17;
                }
                break;
            case REGION:
                {
                alt30=18;
                }
                break;
            case REVEALER:
                {
                alt30=19;
                }
                break;
            case SOUNDLINK:
                {
                alt30=20;
                }
                break;
            case TEXT:
                {
                alt30=21;
                }
                break;
            case TIMER:
                {
                alt30=22;
                }
                break;
            case TRANSMISSIONSOURCE:
                {
                alt30=23;
                }
                break;
            case TRIGGER:
                {
                alt30=24;
                }
                break;
            case UNITFILTER:
                {
                alt30=25;
                }
                break;
            case UNITGROUP:
                {
                alt30=26;
                }
                break;
            case UNITREF:
                {
                alt30=27;
                }
                break;
            case UNIT:
                {
                alt30=28;
                }
                break;
            case WAVEINFO:
                {
                alt30=29;
                }
                break;
            case WAVETARGET:
                {
                alt30=30;
                }
                break;
            case DOODAD:
                {
                alt30=31;
                }
                break;
            case AIFILTER:
                {
                alt30=32;
                }
                break;
            case SOUND:
                {
                alt30=33;
                }
                break;
            case WAVE:
                {
                alt30=34;
                }
                break;
            case IDENTIFIER:
                {
                alt30=35;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:459:4: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1195); 
                    t = Type.Boolean;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:460:4: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_type1202); 
                    t = Type.Byte;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:461:4: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_type1209); 
                    t = Type.Char;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:462:4: FIXED
                    {
                    match(input,FIXED,FOLLOW_FIXED_in_type1216); 
                    t = Type.Fixed;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:463:4: GAMELINK
                    {
                    match(input,GAMELINK,FOLLOW_GAMELINK_in_type1223); 
                    t = Type.Gamelink;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:464:4: COLOR
                    {
                    match(input,COLOR,FOLLOW_COLOR_in_type1230); 
                    t = Type.Color;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:465:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_type1237); 
                    t = Type.Integer;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:466:4: POINT
                    {
                    match(input,POINT,FOLLOW_POINT_in_type1244); 
                    t = Type.Point;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:467:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_type1251); 
                    t = Type.String;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:468:4: ABILCMD
                    {
                    match(input,ABILCMD,FOLLOW_ABILCMD_in_type1258); 
                    t = Type.Abilcmd;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:469:4: ACTOR
                    {
                    match(input,ACTOR,FOLLOW_ACTOR_in_type1265); 
                    t = Type.Actor;

                    }
                    break;
                case 12 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:470:4: ACTORSCOPE
                    {
                    match(input,ACTORSCOPE,FOLLOW_ACTORSCOPE_in_type1272); 
                    t = Type.Actorscope;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:471:4: BANK
                    {
                    match(input,BANK,FOLLOW_BANK_in_type1279); 
                    t = Type.Bank;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:472:4: CAMERAINFO
                    {
                    match(input,CAMERAINFO,FOLLOW_CAMERAINFO_in_type1286); 
                    t = Type.Camerainfo;

                    }
                    break;
                case 15 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:473:4: MARKER
                    {
                    match(input,MARKER,FOLLOW_MARKER_in_type1293); 
                    t = Type.Marker;

                    }
                    break;
                case 16 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:474:4: ORDER
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_type1300); 
                    t = Type.Order;

                    }
                    break;
                case 17 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:475:4: PLAYERGROUP
                    {
                    match(input,PLAYERGROUP,FOLLOW_PLAYERGROUP_in_type1307); 
                    t = Type.Playergroup;

                    }
                    break;
                case 18 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:476:4: REGION
                    {
                    match(input,REGION,FOLLOW_REGION_in_type1314); 
                    t = Type.Region;

                    }
                    break;
                case 19 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:477:4: REVEALER
                    {
                    match(input,REVEALER,FOLLOW_REVEALER_in_type1321); 
                    t = Type.Revealer;

                    }
                    break;
                case 20 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:478:4: SOUNDLINK
                    {
                    match(input,SOUNDLINK,FOLLOW_SOUNDLINK_in_type1328); 
                    t = Type.Soundlink;

                    }
                    break;
                case 21 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:479:4: TEXT
                    {
                    match(input,TEXT,FOLLOW_TEXT_in_type1335); 
                    t = Type.Text;

                    }
                    break;
                case 22 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:480:4: TIMER
                    {
                    match(input,TIMER,FOLLOW_TIMER_in_type1342); 
                    t = Type.Timer;

                    }
                    break;
                case 23 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:481:4: TRANSMISSIONSOURCE
                    {
                    match(input,TRANSMISSIONSOURCE,FOLLOW_TRANSMISSIONSOURCE_in_type1349); 
                    t = Type.Transmissionsource;

                    }
                    break;
                case 24 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:482:4: TRIGGER
                    {
                    match(input,TRIGGER,FOLLOW_TRIGGER_in_type1356); 
                    t = Type.Trigger;

                    }
                    break;
                case 25 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:483:4: UNITFILTER
                    {
                    match(input,UNITFILTER,FOLLOW_UNITFILTER_in_type1363); 
                    t = Type.Unitfilter;

                    }
                    break;
                case 26 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:484:4: UNITGROUP
                    {
                    match(input,UNITGROUP,FOLLOW_UNITGROUP_in_type1370); 
                    t = Type.Unitgroup;

                    }
                    break;
                case 27 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:485:4: UNITREF
                    {
                    match(input,UNITREF,FOLLOW_UNITREF_in_type1377); 
                    t = Type.Unitref;

                    }
                    break;
                case 28 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:486:4: UNIT
                    {
                    match(input,UNIT,FOLLOW_UNIT_in_type1384); 
                    t = Type.Unit;

                    }
                    break;
                case 29 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:487:4: WAVEINFO
                    {
                    match(input,WAVEINFO,FOLLOW_WAVEINFO_in_type1391); 
                    t = Type.Waveinfo;

                    }
                    break;
                case 30 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:488:4: WAVETARGET
                    {
                    match(input,WAVETARGET,FOLLOW_WAVETARGET_in_type1398); 
                    t = Type.Wavetarget;

                    }
                    break;
                case 31 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:489:4: DOODAD
                    {
                    match(input,DOODAD,FOLLOW_DOODAD_in_type1405); 
                    t = Type.Doodad;

                    }
                    break;
                case 32 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:490:4: AIFILTER
                    {
                    match(input,AIFILTER,FOLLOW_AIFILTER_in_type1412); 
                    t = Type.AIFilter;

                    }
                    break;
                case 33 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:491:4: SOUND
                    {
                    match(input,SOUND,FOLLOW_SOUND_in_type1419); 
                    t = Type.Sound;

                    }
                    break;
                case 34 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:492:4: WAVE
                    {
                    match(input,WAVE,FOLLOW_WAVE_in_type1426); 
                    t = Type.Wave;

                    }
                    break;
                case 35 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:493:5: t1= custom_type
                    {
                    pushFollow(FOLLOW_custom_type_in_type1436);
                    t1=custom_type();

                    state._fsp--;

                    t = t1;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "type"


    // $ANTLR start "custom_type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:496:1: custom_type returns [Type t] : (i1= IDENTIFIER | i1= IDENTIFIER NAMESPACEACCESS i2= IDENTIFIER );
    public final Type custom_type() throws RecognitionException {
        Type t = null;

        CommonTree i1=null;
        CommonTree i2=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:497:2: (i1= IDENTIFIER | i1= IDENTIFIER NAMESPACEACCESS i2= IDENTIFIER )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENTIFIER) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==NAMESPACEACCESS) ) {
                    alt31=2;
                }
                else if ( (LA31_1==DOWN||LA31_1==IDENTIFIER||LA31_1==END||(LA31_1>=BOOLEAN && LA31_1<=WAVE)) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:497:4: i1= IDENTIFIER
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_custom_type1456); 
                    if(Type.isCustomType(i1.getText())){
                    					 	t = Type.getCustomType(i1.getText());
                    					 }else{
                    					 	Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Type not defined!");
                    					 }
                    					

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:503:4: i1= IDENTIFIER NAMESPACEACCESS i2= IDENTIFIER
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_custom_type1465); 
                    match(input,NAMESPACEACCESS,FOLLOW_NAMESPACEACCESS_in_custom_type1467); 
                    i2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_custom_type1471); 
                    if(Type.isCustomType(i1.getText()+"::"+i2.getText())){
                    					 	t = Type.getCustomType(i1.getText()+"::"+i2.getText());
                    					 }else{
                    					 	Error.printError(i1.getLine(),i1.getCharPositionInLine(),"Type not defined!");
                    					 }
                    					

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "custom_type"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA19_eotS =
        "\56\uffff";
    static final String DFA19_eofS =
        "\56\uffff";
    static final String DFA19_minS =
        "\1\7\43\2\1\5\1\7\2\5\1\7\1\3\1\uffff\1\2\2\uffff";
    static final String DFA19_maxS =
        "\1\102\42\2\1\u0084\1\32\1\7\3\23\1\34\1\uffff\1\2\2\uffff";
    static final String DFA19_acceptS =
        "\52\uffff\1\2\1\uffff\1\1\1\3";
    static final String DFA19_specialS =
        "\56\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\43\31\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44\u0081\uffff\1\45",
            "\1\50\1\uffff\1\51\13\uffff\1\52\5\uffff\1\46\1\47",
            "\1\53",
            "\1\50\1\uffff\1\51\13\uffff\1\52",
            "\1\50\1\uffff\1\51\13\uffff\1\52",
            "\1\51\13\uffff\1\52",
            "\1\55\30\uffff\1\54",
            "",
            "\1\44",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "118:1: field_decl : ( ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER ASSGN e1= expression ) | ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? (e1= array_expression )+ i1= IDENTIFIER ) | ^(t1= type (p1= PUBLIC | p1= PRIVATE )? (s1= STATIC )? i1= IDENTIFIER ) );";
        }
    }
    static final String DFA22_eotS =
        "\50\uffff";
    static final String DFA22_eofS =
        "\50\uffff";
    static final String DFA22_minS =
        "\1\7\43\2\2\uffff\1\7\1\2";
    static final String DFA22_maxS =
        "\43\102\1\u0084\2\uffff\1\7\1\102";
    static final String DFA22_acceptS =
        "\44\uffff\1\1\1\2\2\uffff";
    static final String DFA22_specialS =
        "\50\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\43\31\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45\101\uffff\1"+
            "\46",
            "",
            "",
            "\1\47",
            "\1\44\4\uffff\1\45\3\uffff\1\45\25\uffff\42\45"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "258:62: (par= parameter_list )?";
        }
    }
    static final String DFA26_eotS =
        "\53\uffff";
    static final String DFA26_eofS =
        "\53\uffff";
    static final String DFA26_minS =
        "\1\7\43\2\2\7\1\3\1\uffff\1\2\2\uffff";
    static final String DFA26_maxS =
        "\1\102\42\2\1\u0084\1\23\1\7\1\34\1\uffff\1\2\2\uffff";
    static final String DFA26_acceptS =
        "\47\uffff\1\2\1\uffff\1\1\1\3";
    static final String DFA26_specialS =
        "\53\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\43\31\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44\u0081\uffff\1\45",
            "\1\46\13\uffff\1\47",
            "\1\50",
            "\1\52\30\uffff\1\51",
            "",
            "\1\44",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "310:1: local_var : ( ^(t1= type i1= IDENTIFIER ASSGN e1= expression ) | ^(t1= type (e1= array_expression )+ i1= IDENTIFIER ) | ^(t1= type i1= IDENTIFIER ) );";
        }
    }
 

    public static final BitSet FOLLOW_namespace_in_evaluator55 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EOF_in_evaluator58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace73 = new BitSet(new long[]{0xFFFFFFFE00042088L,0x0000000000000007L});
    public static final BitSet FOLLOW_field_decl_in_namespace85 = new BitSet(new long[]{0xFFFFFFFE00042088L,0x0000000000000007L});
    public static final BitSet FOLLOW_function_in_namespace89 = new BitSet(new long[]{0xFFFFFFFE00042088L,0x0000000000000007L});
    public static final BitSet FOLLOW_class_decl_in_namespace93 = new BitSet(new long[]{0xFFFFFFFE00042088L,0x0000000000000007L});
    public static final BitSet FOLLOW_CLASS_in_class_decl113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PUBLIC_in_class_decl118 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_PRIVATE_in_class_decl124 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl130 = new BitSet(new long[]{0xFFFFFFFE01902088L,0x0000000000000007L});
    public static final BitSet FOLLOW_INTEGER_in_class_decl134 = new BitSet(new long[]{0xFFFFFFFE01802088L,0x0000000000000007L});
    public static final BitSet FOLLOW_field_decl_in_class_decl145 = new BitSet(new long[]{0xFFFFFFFE01802088L,0x0000000000000007L});
    public static final BitSet FOLLOW_function_in_class_decl149 = new BitSet(new long[]{0xFFFFFFFE01802088L,0x0000000000000007L});
    public static final BitSet FOLLOW_constr_decl_in_class_decl153 = new BitSet(new long[]{0xFFFFFFFE01802088L,0x0000000000000007L});
    public static final BitSet FOLLOW_destr_declr_in_class_decl157 = new BitSet(new long[]{0xFFFFFFFE01802088L,0x0000000000000007L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constr_decl174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_constr_decl179 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_constr_decl195 = new BitSet(new long[]{0xFFFFFFFE00000088L,0x0000000000000007L,0x0000000000000020L});
    public static final BitSet FOLLOW_local_var_in_constr_decl199 = new BitSet(new long[]{0xFFFFFFFE00000088L,0x0000000000000007L,0x0000000000000020L});
    public static final BitSet FOLLOW_statement_in_constr_decl204 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destr_declr228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_destr_declr233 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_destr_declr237 = new BitSet(new long[]{0xFFFFFFFE00000088L,0x0000000000000007L,0x0000000000000020L});
    public static final BitSet FOLLOW_local_var_in_destr_declr247 = new BitSet(new long[]{0xFFFFFFFE00000088L,0x0000000000000007L,0x0000000000000020L});
    public static final BitSet FOLLOW_statement_in_destr_declr252 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_field_decl278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PUBLIC_in_field_decl283 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_PRIVATE_in_field_decl289 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_STATIC_in_field_decl295 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl300 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSGN_in_field_decl302 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_field_decl306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_field_decl320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PUBLIC_in_field_decl325 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_PRIVATE_in_field_decl331 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_STATIC_in_field_decl337 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_array_expression_in_field_decl343 = new BitSet(new long[]{0x00000000000800A0L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_field_decl364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PUBLIC_in_field_decl369 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_PRIVATE_in_field_decl375 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_STATIC_in_field_decl381 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_in_function406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PUBLIC_in_function411 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_PRIVATE_in_function417 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_STATIC_in_function423 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function428 = new BitSet(new long[]{0xFFFFFFFE00000080L,0x0000000000000007L});
    public static final BitSet FOLLOW_parameter_list_in_function433 = new BitSet(new long[]{0xFFFFFFFE00000080L,0x0000000000000007L});
    public static final BitSet FOLLOW_type_in_function439 = new BitSet(new long[]{0xFFFFFFFE00000880L,0x0000000000000007L});
    public static final BitSet FOLLOW_local_var_in_function447 = new BitSet(new long[]{0xFFFFFFFE00000880L,0x0000000000000007L});
    public static final BitSet FOLLOW_END_in_function455 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_FUNC_in_function457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_parameter_list488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_list492 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list496 = new BitSet(new long[]{0xFFFFFFFE00000080L,0x0000000000000007L});
    public static final BitSet FOLLOW_type_in_parameter_list500 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_list504 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_type_in_local_var528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var532 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSGN_in_local_var534 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_local_var538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_local_var552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_array_expression_in_local_var557 = new BitSet(new long[]{0x00000000000800A0L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var564 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_local_var578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_133_in_statement607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement611 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_dot_statement_in_statement625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_dot_statement656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_var_statement687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_statement700 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_function_statement702 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_function_statement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_expression721 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_array_expression725 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_array_expression727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOR_in_expression750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression756 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAND_in_expression771 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression777 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_expression792 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression798 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression804 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_expression813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression819 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression840 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression846 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEQ_in_expression855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression861 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression867 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expression876 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression882 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression888 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEQ_in_expression897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression903 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression924 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression945 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_expression960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression966 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression981 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression987 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTR_in_expression1002 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1008 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression1014 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTL_in_expression1023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1029 = new BitSet(new long[]{0x0000000000100010L,0x00000003FC6FDED0L,0x000000000000000CL});
    public static final BitSet FOLLOW_expression_in_expression1035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression1044 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expression1059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression1074 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1080 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_expression1087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1093 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_expression1100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMEOF_in_expression1113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_expression1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_LITERAL_in_expression1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_expression1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_expression1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_expression1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_type1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_in_type1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GAMELINK_in_type1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_in_type1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_type1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_type1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABILCMD_in_type1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTOR_in_type1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTORSCOPE_in_type1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANK_in_type1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERAINFO_in_type1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARKER_in_type1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_type1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYERGROUP_in_type1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGION_in_type1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REVEALER_in_type1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUNDLINK_in_type1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_type1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMER_in_type1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSMISSIONSOURCE_in_type1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIGGER_in_type1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITFILTER_in_type1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITGROUP_in_type1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITREF_in_type1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIT_in_type1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVEINFO_in_type1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVETARGET_in_type1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOODAD_in_type1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AIFILTER_in_type1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUND_in_type1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVE_in_type1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_custom_type_in_type1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_custom_type1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_custom_type1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NAMESPACEACCESS_in_custom_type1467 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_custom_type1471 = new BitSet(new long[]{0x0000000000000002L});

}