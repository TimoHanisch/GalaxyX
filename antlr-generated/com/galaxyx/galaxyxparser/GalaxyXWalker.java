// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g 2013-03-10 17:59:43

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "TYPEDEF", "IDENTIFIER", "SEMI", "NAMESPACE", "COLON", "END", "INITIALIZER", "STATIC", "FUNC", "LPAREN", "RPAREN", "RETURNS", "COMMA", "CLASS", "LBRACK", "INTEGER", "RBRACK", "EXTENDS", "CONSTRUCTOR", "DESTRUCTOR", "PUBLIC", "PRIVATE", "ASSGN", "CONST", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "NAMESPACE_ACCESS", "BOOLEAN", "BYTE", "CHAR", "FIXED", "GAMELINK", "COLOR", "INT", "POINT", "STRING", "ABILCMD", "ACTOR", "ACTORSCOPE", "BANK", "CAMERAINFO", "MARKER", "ORDER", "PLAYERGROUP", "REGION", "REVEALER", "SOUNDLINK", "TEXT", "TIMER", "TRANSMISSIONSOURCE", "TRIGGER", "UNITFILTER", "UNITGROUP", "UNITREF", "UNIT", "WAVEINFO", "WAVETARGET", "DOODAD", "AIFILTER", "SOUND", "WAVE", "VOID", "PLUS", "SUB", "TIMES", "DIV", "MODULO", "DOT", "NOT", "NEW", "DELETE", "BIT_NOT", "CHARACTER_LITERAL", "STRING_LITERAL", "FIXED_LITERAL", "TRUE", "FALSE", "NULL", "THIS", "LOR", "LAND", "OR", "XOR", "AND", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "SHIFTL", "SHIFTR", "IF", "ELIF", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "RETURN", "INLINE", "NATIVE", "STRUCT", "INTERFACE", "IMPLEMENTS", "SUPER", "NAMEOF", "DEFINE", "LBRACE", "RBRACE", "PREFIX", "LETTER", "EscapeSequence", "DIGIT", "HEX_LITERAL", "HexDigit", "Exponent", "FloatTypeSuffix", "OctalEscape", "UnicodeEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT", "MINUS"
    };
    public static final int EOF=-1;
    public static final int NEGATION=4;
    public static final int TYPEDEF=5;
    public static final int IDENTIFIER=6;
    public static final int SEMI=7;
    public static final int NAMESPACE=8;
    public static final int COLON=9;
    public static final int END=10;
    public static final int INITIALIZER=11;
    public static final int STATIC=12;
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
    public static final int ASSGN=27;
    public static final int CONST=28;
    public static final int ASSGNP=29;
    public static final int ASSGNS=30;
    public static final int ASSGNT=31;
    public static final int ASSGND=32;
    public static final int ASSGNM=33;
    public static final int ASSGNSHL=34;
    public static final int ASSGNSHR=35;
    public static final int ASSGNBITAND=36;
    public static final int ASSGNBITOR=37;
    public static final int ASSGNBITXOR=38;
    public static final int NAMESPACE_ACCESS=39;
    public static final int BOOLEAN=40;
    public static final int BYTE=41;
    public static final int CHAR=42;
    public static final int FIXED=43;
    public static final int GAMELINK=44;
    public static final int COLOR=45;
    public static final int INT=46;
    public static final int POINT=47;
    public static final int STRING=48;
    public static final int ABILCMD=49;
    public static final int ACTOR=50;
    public static final int ACTORSCOPE=51;
    public static final int BANK=52;
    public static final int CAMERAINFO=53;
    public static final int MARKER=54;
    public static final int ORDER=55;
    public static final int PLAYERGROUP=56;
    public static final int REGION=57;
    public static final int REVEALER=58;
    public static final int SOUNDLINK=59;
    public static final int TEXT=60;
    public static final int TIMER=61;
    public static final int TRANSMISSIONSOURCE=62;
    public static final int TRIGGER=63;
    public static final int UNITFILTER=64;
    public static final int UNITGROUP=65;
    public static final int UNITREF=66;
    public static final int UNIT=67;
    public static final int WAVEINFO=68;
    public static final int WAVETARGET=69;
    public static final int DOODAD=70;
    public static final int AIFILTER=71;
    public static final int SOUND=72;
    public static final int WAVE=73;
    public static final int VOID=74;
    public static final int PLUS=75;
    public static final int SUB=76;
    public static final int TIMES=77;
    public static final int DIV=78;
    public static final int MODULO=79;
    public static final int DOT=80;
    public static final int NOT=81;
    public static final int NEW=82;
    public static final int DELETE=83;
    public static final int BIT_NOT=84;
    public static final int CHARACTER_LITERAL=85;
    public static final int STRING_LITERAL=86;
    public static final int FIXED_LITERAL=87;
    public static final int TRUE=88;
    public static final int FALSE=89;
    public static final int NULL=90;
    public static final int THIS=91;
    public static final int LOR=92;
    public static final int LAND=93;
    public static final int OR=94;
    public static final int XOR=95;
    public static final int AND=96;
    public static final int EQ=97;
    public static final int NEQ=98;
    public static final int LT=99;
    public static final int GT=100;
    public static final int LTEQ=101;
    public static final int GTEQ=102;
    public static final int SHIFTL=103;
    public static final int SHIFTR=104;
    public static final int IF=105;
    public static final int ELIF=106;
    public static final int ELSE=107;
    public static final int WHILE=108;
    public static final int FOR=109;
    public static final int BREAK=110;
    public static final int CONTINUE=111;
    public static final int RETURN=112;
    public static final int INLINE=113;
    public static final int NATIVE=114;
    public static final int STRUCT=115;
    public static final int INTERFACE=116;
    public static final int IMPLEMENTS=117;
    public static final int SUPER=118;
    public static final int NAMEOF=119;
    public static final int DEFINE=120;
    public static final int LBRACE=121;
    public static final int RBRACE=122;
    public static final int PREFIX=123;
    public static final int LETTER=124;
    public static final int EscapeSequence=125;
    public static final int DIGIT=126;
    public static final int HEX_LITERAL=127;
    public static final int HexDigit=128;
    public static final int Exponent=129;
    public static final int FloatTypeSuffix=130;
    public static final int OctalEscape=131;
    public static final int UnicodeEscape=132;
    public static final int WS=133;
    public static final int LINE_COMMENT=134;
    public static final int MULTI_COMMENT=135;
    public static final int MINUS=136;

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

            		curNS = Main.table.getNamespace((i1!=null?i1.getText():null));
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:38:4: ( field_decl | function | class_decl )*
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:38:5: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace83);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:38:18: function
            	    {
            	    pushFollow(FOLLOW_function_in_namespace87);
            	    function();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:38:29: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace91);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:45:1: class_decl : ^( CLASS i1= IDENTIFIER ( field_decl | function | constr_decl | destr_declr )* ) ;
    public final void class_decl() throws RecognitionException {
        CommonTree i1=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:46:2: ( ^( CLASS i1= IDENTIFIER ( field_decl | function | constr_decl | destr_declr )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:46:4: ^( CLASS i1= IDENTIFIER ( field_decl | function | constr_decl | destr_declr )* )
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_decl113); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl117); 

            		curCL = curNS.getClass((i1!=null?i1.getText():null));
            		//TODO CODE GENERATION
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:51:3: ( field_decl | function | constr_decl | destr_declr )*
            loop3:
            do {
                int alt3=5;
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
                    alt3=1;
                    }
                    break;
                case FUNC:
                    {
                    alt3=2;
                    }
                    break;
                case CONSTRUCTOR:
                    {
                    alt3=3;
                    }
                    break;
                case DESTRUCTOR:
                    {
                    alt3=4;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:51:4: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl125);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:51:17: function
            	    {
            	    pushFollow(FOLLOW_function_in_class_decl129);
            	    function();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:51:28: constr_decl
            	    {
            	    pushFollow(FOLLOW_constr_decl_in_class_decl133);
            	    constr_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:51:42: destr_declr
            	    {
            	    pushFollow(FOLLOW_destr_declr_in_class_decl137);
            	    destr_declr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input, Token.UP, null); 

            		curCL = null;
            		//TODO CODE GENERATION
            	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:59:1: constr_decl : ^(c1= CONSTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* ) ;
    public final void constr_decl() throws RecognitionException {
        CommonTree c1=null;
        List<LocalField> par = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:60:2: ( ^(c1= CONSTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:60:4: ^(c1= CONSTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* )
            {
            c1=(CommonTree)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constr_decl160); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:60:21: (par= parameter_list )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENTIFIER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:60:22: par= parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_constr_decl165);
                    par=parameter_list();

                    state._fsp--;


                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_constr_decl169); 

            		curFU = curCL.getConstructor(par);
            		//TODO CODE GENERATION
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:65:3: ( local_var )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENTIFIER) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:65:3: local_var
            	    {
            	    pushFollow(FOLLOW_local_var_in_constr_decl176);
            	    local_var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:66:3: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ASSGN) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:66:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constr_decl181);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input, Token.UP, null); 

            		curFU = null;
            		//TODO CODE GENERATION
            	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:74:1: destr_declr : ^(d1= DESTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* ) ;
    public final void destr_declr() throws RecognitionException {
        CommonTree d1=null;
        List<LocalField> par = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:75:2: ( ^(d1= DESTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:75:4: ^(d1= DESTRUCTOR (par= parameter_list )? COLON ( local_var )* ( statement )* )
            {
            d1=(CommonTree)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destr_declr204); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:75:20: (par= parameter_list )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENTIFIER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:75:21: par= parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_destr_declr209);
                    par=parameter_list();

                    state._fsp--;


                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_destr_declr213); 

            		curFU = curCL.getDestructor(par);
            		//TODO CODE GENERATION
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:80:3: ( local_var )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENTIFIER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:80:3: local_var
            	    {
            	    pushFollow(FOLLOW_local_var_in_destr_declr220);
            	    local_var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:81:3: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ASSGN) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:81:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_destr_declr225);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input, Token.UP, null); 

            		curFU = null;
            		//TODO CODE GENERATION
            	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:89:1: field_decl : ( ^(t1= type i1= IDENTIFIER ASSGN e1= expression ) | ^(t1= type (e1= array_expression )+ i1= IDENTIFIER ) | ^(t1= type i1= IDENTIFIER ) );
    public final void field_decl() throws RecognitionException {
        CommonTree i1=null;
        Type t1 = null;

        Expr e1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:90:2: ( ^(t1= type i1= IDENTIFIER ASSGN e1= expression ) | ^(t1= type (e1= array_expression )+ i1= IDENTIFIER ) | ^(t1= type i1= IDENTIFIER ) )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:90:3: ^(t1= type i1= IDENTIFIER ASSGN e1= expression )
                    {
                    pushFollow(FOLLOW_type_in_field_decl246);
                    t1=type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl250); 
                    match(input,ASSGN,FOLLOW_ASSGN_in_field_decl252); 
                    pushFollow(FOLLOW_expression_in_field_decl256);
                    e1=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		if(Type.checkAssign(t1,e1.type)){
                    			//TODO CODE GENERATION
                    		}else{
                    			Error.printError("Incompatible type for assignment of field $1",i1.token);
                    		}
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:98:3: ^(t1= type (e1= array_expression )+ i1= IDENTIFIER )
                    {
                    pushFollow(FOLLOW_type_in_field_decl267);
                    t1=type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:98:13: (e1= array_expression )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==LBRACK) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:98:14: e1= array_expression
                    	    {
                    	    pushFollow(FOLLOW_array_expression_in_field_decl272);
                    	    e1=array_expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl278); 

                    match(input, Token.UP, null); 

                    		//TODO CODE GENERATION
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:102:3: ^(t1= type i1= IDENTIFIER )
                    {
                    pushFollow(FOLLOW_type_in_field_decl289);
                    t1=type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl293); 

                    match(input, Token.UP, null); 

                    		//TODO CODE GENERATION
                    	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:108:1: function : ^( FUNC i1= IDENTIFIER (par= parameter_list )? rt= type ( local_var )* ( statement )* ) ;
    public final void function() throws RecognitionException {
        CommonTree i1=null;
        List<LocalField> par = null;

        Type rt = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:109:2: ( ^( FUNC i1= IDENTIFIER (par= parameter_list )? rt= type ( local_var )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:109:4: ^( FUNC i1= IDENTIFIER (par= parameter_list )? rt= type ( local_var )* ( statement )* )
            {
            match(input,FUNC,FOLLOW_FUNC_in_function310); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function314); 

            		if(curCL == null){
            			curFU = curNS.getMethod((i1!=null?i1.getText():null));
            		}else{
            			curFU = curCL.getMethod((i1!=null?i1.getText():null));
            		}
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:117:3: (par= parameter_list )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENTIFIER) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==DOWN) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:117:4: par= parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function325);
                    par=parameter_list();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_function331);
            rt=type();

            state._fsp--;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:118:3: ( local_var )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==IDENTIFIER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:118:3: local_var
            	    {
            	    pushFollow(FOLLOW_local_var_in_function335);
            	    local_var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:119:3: ( statement )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ASSGN) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:119:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function340);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match(input, Token.UP, null); 

            		curFU = null;
            	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:126:1: parameter_list returns [List<LocalField> f] : ^(i1= IDENTIFIER t1= type ( COMMA t2= type i2= IDENTIFIER )* ) ;
    public final List<LocalField> parameter_list() throws RecognitionException {
        List<LocalField> f = null;

        CommonTree i1=null;
        CommonTree i2=null;
        Type t1 = null;

        Type t2 = null;



        	f = new ArrayList<LocalField>();

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:130:2: ( ^(i1= IDENTIFIER t1= type ( COMMA t2= type i2= IDENTIFIER )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:130:4: ^(i1= IDENTIFIER t1= type ( COMMA t2= type i2= IDENTIFIER )* )
            {
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_list371); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_parameter_list375);
            t1=type();

            state._fsp--;


            		f.add(new LocalField((i1!=null?i1.getText():null),t1));
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:134:2: ( COMMA t2= type i2= IDENTIFIER )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:134:3: COMMA t2= type i2= IDENTIFIER
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_parameter_list384); 
            	    pushFollow(FOLLOW_type_in_parameter_list388);
            	    t2=type();

            	    state._fsp--;

            	    i2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter_list392); 
            	    f.add(new LocalField((i2!=null?i2.getText():null),t2));

            	    }
            	    break;

            	default :
            	    break loop15;
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
        return f;
    }
    // $ANTLR end "parameter_list"


    // $ANTLR start "local_var"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:137:1: local_var : ( ^(i1= IDENTIFIER t1= type ^( ASSGN e1= expression ) ) | ^(i1= IDENTIFIER t1= type (e1= array_expression )+ ) | ^(i1= IDENTIFIER t1= type ) );
    public final void local_var() throws RecognitionException {
        CommonTree i1=null;
        Type t1 = null;

        Expr e1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:138:2: ( ^(i1= IDENTIFIER t1= type ^( ASSGN e1= expression ) ) | ^(i1= IDENTIFIER t1= type (e1= array_expression )+ ) | ^(i1= IDENTIFIER t1= type ) )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:138:4: ^(i1= IDENTIFIER t1= type ^( ASSGN e1= expression ) )
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var412); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_local_var416);
                    t1=type();

                    state._fsp--;

                    match(input,ASSGN,FOLLOW_ASSGN_in_local_var419); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_local_var423);
                    e1=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    		if(Type.checkAssign(t1,e1.type)){
                    			//TODO CODE GENERATION
                    		}else{
                    			Error.printError("Incompatible type for assignment of local variable $1",i1.token);
                    		}
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:146:4: ^(i1= IDENTIFIER t1= type (e1= array_expression )+ )
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var436); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_local_var440);
                    t1=type();

                    state._fsp--;

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:146:28: (e1= array_expression )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:146:29: e1= array_expression
                    	    {
                    	    pushFollow(FOLLOW_array_expression_in_local_var445);
                    	    e1=array_expression();

                    	    state._fsp--;


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


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:147:4: ^(i1= IDENTIFIER t1= type )
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var458); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_local_var462);
                    t1=type();

                    state._fsp--;


                    match(input, Token.UP, null); 

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


    // $ANTLR start "namespace_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:150:1: namespace_statement : i1= IDENTIFIER NAMESPACE_ACCESS primary_statement[Main.table.getNamespace($i1.text),null,true] ;
    public final void namespace_statement() throws RecognitionException {
        CommonTree i1=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:151:2: (i1= IDENTIFIER NAMESPACE_ACCESS primary_statement[Main.table.getNamespace($i1.text),null,true] )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:151:6: i1= IDENTIFIER NAMESPACE_ACCESS primary_statement[Main.table.getNamespace($i1.text),null,true]
            {
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_statement479); 
            match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_namespace_statement481); 
            pushFollow(FOLLOW_primary_statement_in_namespace_statement483);
            primary_statement(Main.table.getNamespace((i1!=null?i1.getText():null)), null, true);

            state._fsp--;


            		if(!Main.table.namespaceExists((i1!=null?i1.getText():null))){
            			Error.printError("Namespace $1 does not exists",i1.token);
            		}
            	

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
    // $ANTLR end "namespace_statement"


    // $ANTLR start "primary_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:159:1: primary_statement[Namespace ns, Class cs,boolean sta] : ( var_statement[ns,cs,sta] | function_statement[ns,cs,sta] | namespace_statement );
    public final void primary_statement(Namespace ns, Class cs, boolean sta) throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:160:2: ( var_statement[ns,cs,sta] | function_statement[ns,cs,sta] | namespace_statement )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER) ) {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    alt18=2;
                    }
                    break;
                case NAMESPACE_ACCESS:
                    {
                    alt18=3;
                    }
                    break;
                case NEGATION:
                case LBRACK:
                case INTEGER:
                case PLUS:
                case TIMES:
                case DIV:
                case DOT:
                case NOT:
                case NEW:
                case DELETE:
                case CHARACTER_LITERAL:
                case STRING_LITERAL:
                case FIXED_LITERAL:
                case TRUE:
                case FALSE:
                case NULL:
                case LOR:
                case LAND:
                case EQ:
                case NEQ:
                case LT:
                case GT:
                case LTEQ:
                case GTEQ:
                case SHIFTL:
                case SHIFTR:
                case NAMEOF:
                case MINUS:
                    {
                    alt18=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:160:4: var_statement[ns,cs,sta]
                    {
                    pushFollow(FOLLOW_var_statement_in_primary_statement501);
                    var_statement(ns, cs, sta);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:161:4: function_statement[ns,cs,sta]
                    {
                    pushFollow(FOLLOW_function_statement_in_primary_statement507);
                    function_statement(ns, cs, sta);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:162:4: namespace_statement
                    {
                    pushFollow(FOLLOW_namespace_statement_in_primary_statement513);
                    namespace_statement();

                    state._fsp--;


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
    // $ANTLR end "primary_statement"


    // $ANTLR start "statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:165:1: statement : ^( ASSGN ( primary_statement[null, null,curCL == null?true:false] ) expression ) ;
    public final void statement() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:166:2: ( ^( ASSGN ( primary_statement[null, null,curCL == null?true:false] ) expression ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:166:5: ^( ASSGN ( primary_statement[null, null,curCL == null?true:false] ) expression )
            {
            match(input,ASSGN,FOLLOW_ASSGN_in_statement527); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:166:13: ( primary_statement[null, null,curCL == null?true:false] )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:166:14: primary_statement[null, null,curCL == null?true:false]
            {
            pushFollow(FOLLOW_primary_statement_in_statement530);
            primary_statement(null, null, curCL == null?true:false);

            state._fsp--;


            }

            pushFollow(FOLLOW_expression_in_statement534);
            expression();

            state._fsp--;


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


    // $ANTLR start "var_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:169:1: var_statement[Namespace ns, Class cs, boolean sta] : i1= IDENTIFIER ( array_expression )* ( DOT primary_statement[ns,cs,sta] )? ;
    public final void var_statement(Namespace ns, Class cs, boolean sta) throws RecognitionException {
        CommonTree i1=null;


        	boolean dot = false;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:173:2: (i1= IDENTIFIER ( array_expression )* ( DOT primary_statement[ns,cs,sta] )? )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:173:4: i1= IDENTIFIER ( array_expression )* ( DOT primary_statement[ns,cs,sta] )?
            {
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_statement555); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:173:18: ( array_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LBRACK) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:173:18: array_expression
            	    {
            	    pushFollow(FOLLOW_array_expression_in_var_statement557);
            	    array_expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:174:2: ( DOT primary_statement[ns,cs,sta] )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==DOT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:174:3: DOT primary_statement[ns,cs,sta]
                    {
                    match(input,DOT,FOLLOW_DOT_in_var_statement562); 
                    pushFollow(FOLLOW_primary_statement_in_var_statement564);
                    primary_statement(ns, cs, sta);

                    state._fsp--;

                    dot = true;

                    }
                    break;

            }


            		if(ns == null && cs == null && !dot){
            			if(!curFU.isLocalDefined((i1!=null?i1.getText():null))){
            				if(curCL == null || !curCL.containsField((i1!=null?i1.getText():null)) || curCL.containsField((i1!=null?i1.getText():null)) && curCL.getField((i1!=null?i1.getText():null)).isStatic() == sta){
            					if(!curNS.containsField((i1!=null?i1.getText():null))){
            						Error.printError("Variable $1 not defined",i1.token);
            					}
            				}
            			}
            		}else if(ns != null && cs == null && !dot){
            			if(!ns.containsField((i1!=null?i1.getText():null))){
            				Error.printError("Variable $1 not defined",i1.token);
            			}
            		}else if(ns != null && cs != null && !dot){
            			if(sta){
            				if(!cs.containsField((i1!=null?i1.getText():null))){
            					Error.printError("Variable $1 not defined",i1.token);
            				}else{
            					if(cs.getField((i1!=null?i1.getText():null)).isStatic() != sta){
            						Error.printError("Variable $1 is not static",i1.token);
            					}
            				}
            			}else{
            				if(!cs.containsField((i1!=null?i1.getText():null))){
            					Error.printError("Variable $1 not defined",i1.token);
            				}
            			}
            		}
            	

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
    // $ANTLR end "var_statement"


    // $ANTLR start "function_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:206:1: function_statement[Namespace ns, Class cs, boolean sta] : IDENTIFIER LPAREN RPAREN ( DOT primary_statement[ns,cs,sta] )? ;
    public final void function_statement(Namespace ns, Class cs, boolean sta) throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:207:2: ( IDENTIFIER LPAREN RPAREN ( DOT primary_statement[ns,cs,sta] )? )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:207:4: IDENTIFIER LPAREN RPAREN ( DOT primary_statement[ns,cs,sta] )?
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_statement585); 
            match(input,LPAREN,FOLLOW_LPAREN_in_function_statement587); 
            match(input,RPAREN,FOLLOW_RPAREN_in_function_statement589); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:207:29: ( DOT primary_statement[ns,cs,sta] )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:207:30: DOT primary_statement[ns,cs,sta]
                    {
                    match(input,DOT,FOLLOW_DOT_in_function_statement592); 
                    pushFollow(FOLLOW_primary_statement_in_function_statement594);
                    primary_statement(ns, cs, sta);

                    state._fsp--;


                    }
                    break;

            }


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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:210:1: array_expression returns [Expr e] : l= LBRACK e1= expression RBRACK ;
    public final Expr array_expression() throws RecognitionException {
        Expr e = null;

        CommonTree l=null;
        Expr e1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:211:2: (l= LBRACK e1= expression RBRACK )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:211:4: l= LBRACK e1= expression RBRACK
            {
            l=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_array_expression614); 
            pushFollow(FOLLOW_expression_in_array_expression618);
            e1=expression();

            state._fsp--;

            match(input,RBRACK,FOLLOW_RBRACK_in_array_expression620); 

            		if(e1.type != Type.Integer){
            		    Error.printError("Only Integer-Type allowed for array declaration", l.token);  
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:221:1: expression returns [Expr e] : ( ^( LOR a= expression b= expression ) | ^( LAND a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NEQ a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( PLUS a= expression b= expression ) | ^( MINUS a= expression b= expression ) | ^( TIMES a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( SHIFTR a= expression b= expression ) | ^( SHIFTL a= expression b= expression ) | ^( NOT a= expression ) | ^( NEGATION a= expression ) | ^( NEW a= expression ) | ^( DELETE a= expression ) | ^( NAMEOF a= expression ) | e1= INTEGER | e1= FIXED_LITERAL | e1= STRING_LITERAL | e1= CHARACTER_LITERAL | TRUE | FALSE | NULL );
    public final Expr expression() throws RecognitionException {
        Expr e = null;

        CommonTree e1=null;
        Expr a = null;

        Expr b = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:222:2: ( ^( LOR a= expression b= expression ) | ^( LAND a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NEQ a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( PLUS a= expression b= expression ) | ^( MINUS a= expression b= expression ) | ^( TIMES a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( SHIFTR a= expression b= expression ) | ^( SHIFTL a= expression b= expression ) | ^( NOT a= expression ) | ^( NEGATION a= expression ) | ^( NEW a= expression ) | ^( DELETE a= expression ) | ^( NAMEOF a= expression ) | e1= INTEGER | e1= FIXED_LITERAL | e1= STRING_LITERAL | e1= CHARACTER_LITERAL | TRUE | FALSE | NULL )
            int alt22=26;
            switch ( input.LA(1) ) {
            case LOR:
                {
                alt22=1;
                }
                break;
            case LAND:
                {
                alt22=2;
                }
                break;
            case EQ:
                {
                alt22=3;
                }
                break;
            case NEQ:
                {
                alt22=4;
                }
                break;
            case LT:
                {
                alt22=5;
                }
                break;
            case LTEQ:
                {
                alt22=6;
                }
                break;
            case GT:
                {
                alt22=7;
                }
                break;
            case GTEQ:
                {
                alt22=8;
                }
                break;
            case PLUS:
                {
                alt22=9;
                }
                break;
            case MINUS:
                {
                alt22=10;
                }
                break;
            case TIMES:
                {
                alt22=11;
                }
                break;
            case DIV:
                {
                alt22=12;
                }
                break;
            case SHIFTR:
                {
                alt22=13;
                }
                break;
            case SHIFTL:
                {
                alt22=14;
                }
                break;
            case NOT:
                {
                alt22=15;
                }
                break;
            case NEGATION:
                {
                alt22=16;
                }
                break;
            case NEW:
                {
                alt22=17;
                }
                break;
            case DELETE:
                {
                alt22=18;
                }
                break;
            case NAMEOF:
                {
                alt22=19;
                }
                break;
            case INTEGER:
                {
                alt22=20;
                }
                break;
            case FIXED_LITERAL:
                {
                alt22=21;
                }
                break;
            case STRING_LITERAL:
                {
                alt22=22;
                }
                break;
            case CHARACTER_LITERAL:
                {
                alt22=23;
                }
                break;
            case TRUE:
                {
                alt22=24;
                }
                break;
            case FALSE:
                {
                alt22=25;
                }
                break;
            case NULL:
                {
                alt22=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:222:4: ^( LOR a= expression b= expression )
                    {
                    match(input,LOR,FOLLOW_LOR_in_expression641); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression647);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression653);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Or(a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:223:4: ^( LAND a= expression b= expression )
                    {
                    match(input,LAND,FOLLOW_LAND_in_expression662); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression668);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression674);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new And(a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:224:4: ^( EQ a= expression b= expression )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expression683); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression689);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression695);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"=="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:225:4: ^( NEQ a= expression b= expression )
                    {
                    match(input,NEQ,FOLLOW_NEQ_in_expression704); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression710);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression716);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"!="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:226:4: ^( LT a= expression b= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression725); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression731);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression737);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"<"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:227:4: ^( LTEQ a= expression b= expression )
                    {
                    match(input,LTEQ,FOLLOW_LTEQ_in_expression746); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression752);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression758);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"<="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:228:4: ^( GT a= expression b= expression )
                    {
                    match(input,GT,FOLLOW_GT_in_expression767); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression773);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression779);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+">"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:229:4: ^( GTEQ a= expression b= expression )
                    {
                    match(input,GTEQ,FOLLOW_GTEQ_in_expression788); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression794);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression800);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+">="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:230:4: ^( PLUS a= expression b= expression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression809); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression815);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression821);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"+"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:231:4: ^( MINUS a= expression b= expression )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expression830); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression836);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression842);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"-"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:232:4: ^( TIMES a= expression b= expression )
                    {
                    match(input,TIMES,FOLLOW_TIMES_in_expression851); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression857);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression863);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"*"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:233:4: ^( DIV a= expression b= expression )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expression872); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression878);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression884);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"+"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:234:4: ^( SHIFTR a= expression b= expression )
                    {
                    match(input,SHIFTR,FOLLOW_SHIFTR_in_expression893); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression899);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression905);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+">>"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:235:4: ^( SHIFTL a= expression b= expression )
                    {
                    match(input,SHIFTL,FOLLOW_SHIFTL_in_expression914); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression920);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression926);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"<<"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:236:4: ^( NOT a= expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression935); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression941);
                    a=expression();

                    state._fsp--;

                    if( a != null){e = new Not(a.s,a);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:237:4: ^( NEGATION a= expression )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expression950); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression956);
                    a=expression();

                    state._fsp--;

                    if( a != null){e = new Unary("-"+a.s,a);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:238:4: ^( NEW a= expression )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression965); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression971);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:239:4: ^( DELETE a= expression )
                    {
                    match(input,DELETE,FOLLOW_DELETE_in_expression978); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression984);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:240:4: ^( NAMEOF a= expression )
                    {
                    match(input,NAMEOF,FOLLOW_NAMEOF_in_expression991); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression997);
                    a=expression();

                    state._fsp--;

                    if(a != null)e = new Unary(a.s,a);

                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:241:4: e1= INTEGER
                    {
                    e1=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expression1007); 
                    e = new Constant(e1.getText(),Type.Integer);

                    }
                    break;
                case 21 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:242:4: e1= FIXED_LITERAL
                    {
                    e1=(CommonTree)match(input,FIXED_LITERAL,FOLLOW_FIXED_LITERAL_in_expression1016); 
                    e = new Constant(e1.getText(),Type.Fixed);

                    }
                    break;
                case 22 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:243:4: e1= STRING_LITERAL
                    {
                    e1=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_expression1025); 
                    e = new Constant(e1.getText(),Type.String);

                    }
                    break;
                case 23 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:244:4: e1= CHARACTER_LITERAL
                    {
                    e1=(CommonTree)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_expression1034); 
                    e = new Constant(e1.getText(),Type.Char);

                    }
                    break;
                case 24 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:245:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_expression1041); 
                    e = Constant.True;

                    }
                    break;
                case 25 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:246:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_expression1048); 
                    e = Constant.False;

                    }
                    break;
                case 26 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:247:4: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_expression1055); 
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:250:1: type returns [Type t] : ( BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | t1= custom_type );
    public final Type type() throws RecognitionException {
        Type t = null;

        Type t1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:251:2: ( BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | t1= custom_type )
            int alt23=35;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt23=1;
                }
                break;
            case BYTE:
                {
                alt23=2;
                }
                break;
            case CHAR:
                {
                alt23=3;
                }
                break;
            case FIXED:
                {
                alt23=4;
                }
                break;
            case GAMELINK:
                {
                alt23=5;
                }
                break;
            case COLOR:
                {
                alt23=6;
                }
                break;
            case INT:
                {
                alt23=7;
                }
                break;
            case POINT:
                {
                alt23=8;
                }
                break;
            case STRING:
                {
                alt23=9;
                }
                break;
            case ABILCMD:
                {
                alt23=10;
                }
                break;
            case ACTOR:
                {
                alt23=11;
                }
                break;
            case ACTORSCOPE:
                {
                alt23=12;
                }
                break;
            case BANK:
                {
                alt23=13;
                }
                break;
            case CAMERAINFO:
                {
                alt23=14;
                }
                break;
            case MARKER:
                {
                alt23=15;
                }
                break;
            case ORDER:
                {
                alt23=16;
                }
                break;
            case PLAYERGROUP:
                {
                alt23=17;
                }
                break;
            case REGION:
                {
                alt23=18;
                }
                break;
            case REVEALER:
                {
                alt23=19;
                }
                break;
            case SOUNDLINK:
                {
                alt23=20;
                }
                break;
            case TEXT:
                {
                alt23=21;
                }
                break;
            case TIMER:
                {
                alt23=22;
                }
                break;
            case TRANSMISSIONSOURCE:
                {
                alt23=23;
                }
                break;
            case TRIGGER:
                {
                alt23=24;
                }
                break;
            case UNITFILTER:
                {
                alt23=25;
                }
                break;
            case UNITGROUP:
                {
                alt23=26;
                }
                break;
            case UNITREF:
                {
                alt23=27;
                }
                break;
            case UNIT:
                {
                alt23=28;
                }
                break;
            case WAVEINFO:
                {
                alt23=29;
                }
                break;
            case WAVETARGET:
                {
                alt23=30;
                }
                break;
            case DOODAD:
                {
                alt23=31;
                }
                break;
            case AIFILTER:
                {
                alt23=32;
                }
                break;
            case SOUND:
                {
                alt23=33;
                }
                break;
            case WAVE:
                {
                alt23=34;
                }
                break;
            case IDENTIFIER:
                {
                alt23=35;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:251:4: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1073); 
                    t = Type.Boolean;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:252:4: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_type1080); 
                    t = Type.Byte;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:253:4: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_type1087); 
                    t = Type.Char;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:254:4: FIXED
                    {
                    match(input,FIXED,FOLLOW_FIXED_in_type1094); 
                    t = Type.Fixed;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:255:4: GAMELINK
                    {
                    match(input,GAMELINK,FOLLOW_GAMELINK_in_type1101); 
                    t = Type.Gamelink;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:256:4: COLOR
                    {
                    match(input,COLOR,FOLLOW_COLOR_in_type1108); 
                    t = Type.Color;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:257:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_type1115); 
                    t = Type.Integer;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:258:4: POINT
                    {
                    match(input,POINT,FOLLOW_POINT_in_type1122); 
                    t = Type.Point;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:259:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_type1129); 
                    t = Type.String;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:260:4: ABILCMD
                    {
                    match(input,ABILCMD,FOLLOW_ABILCMD_in_type1136); 
                    t = Type.Abilcmd;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:261:4: ACTOR
                    {
                    match(input,ACTOR,FOLLOW_ACTOR_in_type1143); 
                    t = Type.Actor;

                    }
                    break;
                case 12 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:262:4: ACTORSCOPE
                    {
                    match(input,ACTORSCOPE,FOLLOW_ACTORSCOPE_in_type1150); 
                    t = Type.Actorscope;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:263:4: BANK
                    {
                    match(input,BANK,FOLLOW_BANK_in_type1157); 
                    t = Type.Bank;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:264:4: CAMERAINFO
                    {
                    match(input,CAMERAINFO,FOLLOW_CAMERAINFO_in_type1164); 
                    t = Type.Camerainfo;

                    }
                    break;
                case 15 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:265:4: MARKER
                    {
                    match(input,MARKER,FOLLOW_MARKER_in_type1171); 
                    t = Type.Marker;

                    }
                    break;
                case 16 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:266:4: ORDER
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_type1178); 
                    t = Type.Order;

                    }
                    break;
                case 17 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:267:4: PLAYERGROUP
                    {
                    match(input,PLAYERGROUP,FOLLOW_PLAYERGROUP_in_type1185); 
                    t = Type.Playergroup;

                    }
                    break;
                case 18 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:268:4: REGION
                    {
                    match(input,REGION,FOLLOW_REGION_in_type1192); 
                    t = Type.Region;

                    }
                    break;
                case 19 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:269:4: REVEALER
                    {
                    match(input,REVEALER,FOLLOW_REVEALER_in_type1199); 
                    t = Type.Revealer;

                    }
                    break;
                case 20 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:270:4: SOUNDLINK
                    {
                    match(input,SOUNDLINK,FOLLOW_SOUNDLINK_in_type1206); 
                    t = Type.Soundlink;

                    }
                    break;
                case 21 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:271:4: TEXT
                    {
                    match(input,TEXT,FOLLOW_TEXT_in_type1213); 
                    t = Type.Text;

                    }
                    break;
                case 22 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:272:4: TIMER
                    {
                    match(input,TIMER,FOLLOW_TIMER_in_type1220); 
                    t = Type.Timer;

                    }
                    break;
                case 23 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:273:4: TRANSMISSIONSOURCE
                    {
                    match(input,TRANSMISSIONSOURCE,FOLLOW_TRANSMISSIONSOURCE_in_type1227); 
                    t = Type.Transmissionsource;

                    }
                    break;
                case 24 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:274:4: TRIGGER
                    {
                    match(input,TRIGGER,FOLLOW_TRIGGER_in_type1234); 
                    t = Type.Trigger;

                    }
                    break;
                case 25 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:275:4: UNITFILTER
                    {
                    match(input,UNITFILTER,FOLLOW_UNITFILTER_in_type1241); 
                    t = Type.Unitfilter;

                    }
                    break;
                case 26 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:276:4: UNITGROUP
                    {
                    match(input,UNITGROUP,FOLLOW_UNITGROUP_in_type1248); 
                    t = Type.Unitgroup;

                    }
                    break;
                case 27 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:277:4: UNITREF
                    {
                    match(input,UNITREF,FOLLOW_UNITREF_in_type1255); 
                    t = Type.Unitref;

                    }
                    break;
                case 28 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:278:4: UNIT
                    {
                    match(input,UNIT,FOLLOW_UNIT_in_type1262); 
                    t = Type.Unit;

                    }
                    break;
                case 29 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:279:4: WAVEINFO
                    {
                    match(input,WAVEINFO,FOLLOW_WAVEINFO_in_type1269); 
                    t = Type.Waveinfo;

                    }
                    break;
                case 30 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:280:4: WAVETARGET
                    {
                    match(input,WAVETARGET,FOLLOW_WAVETARGET_in_type1276); 
                    t = Type.Wavetarget;

                    }
                    break;
                case 31 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:281:4: DOODAD
                    {
                    match(input,DOODAD,FOLLOW_DOODAD_in_type1283); 
                    t = Type.Doodad;

                    }
                    break;
                case 32 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:282:4: AIFILTER
                    {
                    match(input,AIFILTER,FOLLOW_AIFILTER_in_type1290); 
                    t = Type.AIFilter;

                    }
                    break;
                case 33 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:283:4: SOUND
                    {
                    match(input,SOUND,FOLLOW_SOUND_in_type1297); 
                    t = Type.Sound;

                    }
                    break;
                case 34 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:284:4: WAVE
                    {
                    match(input,WAVE,FOLLOW_WAVE_in_type1304); 
                    t = Type.Wave;

                    }
                    break;
                case 35 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:285:5: t1= custom_type
                    {
                    pushFollow(FOLLOW_custom_type_in_type1314);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:288:1: custom_type returns [Type t] : (i1= IDENTIFIER | i1= IDENTIFIER NAMESPACE_ACCESS i2= IDENTIFIER );
    public final Type custom_type() throws RecognitionException {
        Type t = null;

        CommonTree i1=null;
        CommonTree i2=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:289:2: (i1= IDENTIFIER | i1= IDENTIFIER NAMESPACE_ACCESS i2= IDENTIFIER )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENTIFIER) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==NAMESPACE_ACCESS) ) {
                    alt24=2;
                }
                else if ( ((LA24_1>=DOWN && LA24_1<=UP)||LA24_1==IDENTIFIER||LA24_1==COMMA||LA24_1==LBRACK||LA24_1==ASSGN) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:289:4: i1= IDENTIFIER
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_custom_type1334); 

                    		if(Type.isCustomType(curNS+"_"+(i1!=null?i1.getText():null))){
                    	 		t = Type.getCustomType(curNS+"_"+(i1!=null?i1.getText():null));
                    	 	}else{
                    	 		Error.printError("Type $1 not defined for namespace "+curNS,i1.token);
                    	 	}
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:297:4: i1= IDENTIFIER NAMESPACE_ACCESS i2= IDENTIFIER
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_custom_type1345); 
                    match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_custom_type1347); 
                    i2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_custom_type1351); 

                    		if(Main.table.namespaceExists((i1!=null?i1.getText():null))){
                    			if(Type.isCustomType((i1!=null?i1.getText():null)+"_"+(i2!=null?i2.getText():null))){
                    		 		t = Type.getCustomType((i1!=null?i1.getText():null)+"_"+(i2!=null?i2.getText():null));
                    		 	}else{
                    		 		Error.printError("Type $1 not defined for namespace $2",i2.token, i1.token);
                    		 	}
                    		}else{
                    			Error.printError("Namespace $1 not defined",i1.token);
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


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA11_eotS =
        "\53\uffff";
    static final String DFA11_eofS =
        "\53\uffff";
    static final String DFA11_minS =
        "\1\6\43\2\2\6\1\3\1\uffff\1\2\2\uffff";
    static final String DFA11_maxS =
        "\1\111\42\2\1\47\1\23\1\6\1\33\1\uffff\1\2\2\uffff";
    static final String DFA11_acceptS =
        "\47\uffff\1\2\1\uffff\1\1\1\3";
    static final String DFA11_specialS =
        "\53\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\43\41\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
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
            "\1\44\44\uffff\1\45",
            "\1\46\14\uffff\1\47",
            "\1\50",
            "\1\52\27\uffff\1\51",
            "",
            "\1\44",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "89:1: field_decl : ( ^(t1= type i1= IDENTIFIER ASSGN e1= expression ) | ^(t1= type (e1= array_expression )+ i1= IDENTIFIER ) | ^(t1= type i1= IDENTIFIER ) );";
        }
    }
    static final String DFA17_eotS =
        "\53\uffff";
    static final String DFA17_eofS =
        "\53\uffff";
    static final String DFA17_minS =
        "\1\6\1\2\1\6\43\3\3\uffff\1\6\1\3";
    static final String DFA17_maxS =
        "\1\6\1\2\1\111\42\33\1\47\3\uffff\1\6\1\33";
    static final String DFA17_acceptS =
        "\46\uffff\1\1\1\2\1\3\2\uffff";
    static final String DFA17_specialS =
        "\53\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\1\2",
            "\1\45\41\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46",
            "\1\50\17\uffff\1\47\7\uffff\1\46\13\uffff\1\51",
            "",
            "",
            "",
            "\1\52",
            "\1\50\17\uffff\1\47\7\uffff\1\46"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "137:1: local_var : ( ^(i1= IDENTIFIER t1= type ^( ASSGN e1= expression ) ) | ^(i1= IDENTIFIER t1= type (e1= array_expression )+ ) | ^(i1= IDENTIFIER t1= type ) );";
        }
    }
 

    public static final BitSet FOLLOW_namespace_in_evaluator55 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOF_in_evaluator58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace73 = new BitSet(new long[]{0xFFFFFF0000042048L,0x00000000000003FFL});
    public static final BitSet FOLLOW_field_decl_in_namespace83 = new BitSet(new long[]{0xFFFFFF0000042048L,0x00000000000003FFL});
    public static final BitSet FOLLOW_function_in_namespace87 = new BitSet(new long[]{0xFFFFFF0000042048L,0x00000000000003FFL});
    public static final BitSet FOLLOW_class_decl_in_namespace91 = new BitSet(new long[]{0xFFFFFF0000042048L,0x00000000000003FFL});
    public static final BitSet FOLLOW_CLASS_in_class_decl113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl117 = new BitSet(new long[]{0xFFFFFF0001802048L,0x00000000000003FFL});
    public static final BitSet FOLLOW_field_decl_in_class_decl125 = new BitSet(new long[]{0xFFFFFF0001802048L,0x00000000000003FFL});
    public static final BitSet FOLLOW_function_in_class_decl129 = new BitSet(new long[]{0xFFFFFF0001802048L,0x00000000000003FFL});
    public static final BitSet FOLLOW_constr_decl_in_class_decl133 = new BitSet(new long[]{0xFFFFFF0001802048L,0x00000000000003FFL});
    public static final BitSet FOLLOW_destr_declr_in_class_decl137 = new BitSet(new long[]{0xFFFFFF0001802048L,0x00000000000003FFL});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constr_decl160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_constr_decl165 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_constr_decl169 = new BitSet(new long[]{0x0000000008000048L});
    public static final BitSet FOLLOW_local_var_in_constr_decl176 = new BitSet(new long[]{0x0000000008000048L});
    public static final BitSet FOLLOW_statement_in_constr_decl181 = new BitSet(new long[]{0x0000000008000008L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destr_declr204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_destr_declr209 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_destr_declr213 = new BitSet(new long[]{0x0000000008000048L});
    public static final BitSet FOLLOW_local_var_in_destr_declr220 = new BitSet(new long[]{0x0000000008000048L});
    public static final BitSet FOLLOW_statement_in_destr_declr225 = new BitSet(new long[]{0x0000000008000008L});
    public static final BitSet FOLLOW_type_in_field_decl246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl250 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ASSGN_in_field_decl252 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_field_decl256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_field_decl267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_array_expression_in_field_decl272 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_field_decl289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_in_function310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function314 = new BitSet(new long[]{0xFFFFFF0000000040L,0x00000000000003FFL});
    public static final BitSet FOLLOW_parameter_list_in_function325 = new BitSet(new long[]{0xFFFFFF0000000040L,0x00000000000003FFL});
    public static final BitSet FOLLOW_type_in_function331 = new BitSet(new long[]{0x0000000008000048L});
    public static final BitSet FOLLOW_local_var_in_function335 = new BitSet(new long[]{0x0000000008000048L});
    public static final BitSet FOLLOW_statement_in_function340 = new BitSet(new long[]{0x0000000008000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_list371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter_list375 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list384 = new BitSet(new long[]{0xFFFFFF0000000040L,0x00000000000003FFL});
    public static final BitSet FOLLOW_type_in_parameter_list388 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_list392 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_local_var416 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ASSGN_in_local_var419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_local_var423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_local_var440 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_array_expression_in_local_var445 = new BitSet(new long[]{0x0000000000080048L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_local_var462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_statement479 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_namespace_statement481 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_primary_statement_in_namespace_statement483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_statement_in_primary_statement501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_statement_in_primary_statement507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_statement_in_primary_statement513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSGN_in_statement527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primary_statement_in_statement530 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_statement534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_var_statement555 = new BitSet(new long[]{0x0000000000080042L,0x0000000000010000L});
    public static final BitSet FOLLOW_array_expression_in_var_statement557 = new BitSet(new long[]{0x0000000000080042L,0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_var_statement562 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_primary_statement_in_var_statement564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_statement585 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_function_statement587 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_function_statement589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_function_statement592 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_primary_statement_in_function_statement594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_expression614 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_array_expression618 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_array_expression620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOR_in_expression641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression647 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAND_in_expression662 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression668 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_expression683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression689 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_expression704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression710 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression731 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEQ_in_expression746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression752 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expression767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression773 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEQ_in_expression788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression794 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression800 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression815 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression836 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression842 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_expression851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression857 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression863 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression872 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression878 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression884 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTR_in_expression893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression899 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTL_in_expression914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression920 = new BitSet(new long[]{0x0000000000100010L,0x008001FE37EE6800L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression926 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression935 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expression950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression965 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_expression978 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression984 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMEOF_in_expression991 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression997 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_expression1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_LITERAL_in_expression1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_expression1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_expression1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_expression1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_type1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_in_type1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GAMELINK_in_type1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_in_type1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_type1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_type1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABILCMD_in_type1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTOR_in_type1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTORSCOPE_in_type1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANK_in_type1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERAINFO_in_type1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARKER_in_type1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_type1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYERGROUP_in_type1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGION_in_type1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REVEALER_in_type1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUNDLINK_in_type1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_type1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMER_in_type1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSMISSIONSOURCE_in_type1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIGGER_in_type1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITFILTER_in_type1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITGROUP_in_type1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITREF_in_type1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIT_in_type1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVEINFO_in_type1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVETARGET_in_type1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOODAD_in_type1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AIFILTER_in_type1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUND_in_type1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVE_in_type1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_custom_type_in_type1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_custom_type1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_custom_type1345 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_custom_type1347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_custom_type1351 = new BitSet(new long[]{0x0000000000000002L});

}