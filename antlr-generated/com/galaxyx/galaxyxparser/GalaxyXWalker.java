// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g 2013-03-09 17:51:02

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "TYPEDEF", "IDENTIFIER", "SEMI", "NAMESPACE", "COLON", "END", "STATIC", "FUNC", "LPAREN", "RPAREN", "RETURNS", "COMMA", "CLASS", "LBRACK", "INTEGER", "RBRACK", "EXTENDS", "CONSTRUCTOR", "DESTRUCTOR", "PUBLIC", "PRIVATE", "ASSGN", "CONST", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "NAMESPACE_ACCESS", "BOOLEAN", "BYTE", "CHAR", "FIXED", "GAMELINK", "COLOR", "INT", "POINT", "STRING", "ABILCMD", "ACTOR", "ACTORSCOPE", "BANK", "CAMERAINFO", "MARKER", "ORDER", "PLAYERGROUP", "REGION", "REVEALER", "SOUNDLINK", "TEXT", "TIMER", "TRANSMISSIONSOURCE", "TRIGGER", "UNITFILTER", "UNITGROUP", "UNITREF", "UNIT", "WAVEINFO", "WAVETARGET", "DOODAD", "AIFILTER", "SOUND", "WAVE", "VOID", "PLUS", "SUB", "TIMES", "DIV", "MODULO", "DOT", "NOT", "NEW", "DELETE", "BIT_NOT", "CHARACTER_LITERAL", "STRING_LITERAL", "FIXED_LITERAL", "TRUE", "FALSE", "NULL", "THIS", "LOR", "LAND", "OR", "XOR", "AND", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "SHIFTL", "SHIFTR", "IF", "ELIF", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "RETURN", "INLINE", "NATIVE", "STRUCT", "INTERFACE", "IMPLEMENTS", "SUPER", "NAMEOF", "INITIALIZER", "DEFINE", "LBRACE", "RBRACE", "PREFIX", "LETTER", "EscapeSequence", "DIGIT", "HEX_LITERAL", "HexDigit", "Exponent", "FloatTypeSuffix", "OctalEscape", "UnicodeEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT", "MINUS"
    };
    public static final int EOF=-1;
    public static final int NEGATION=4;
    public static final int TYPEDEF=5;
    public static final int IDENTIFIER=6;
    public static final int SEMI=7;
    public static final int NAMESPACE=8;
    public static final int COLON=9;
    public static final int END=10;
    public static final int STATIC=11;
    public static final int FUNC=12;
    public static final int LPAREN=13;
    public static final int RPAREN=14;
    public static final int RETURNS=15;
    public static final int COMMA=16;
    public static final int CLASS=17;
    public static final int LBRACK=18;
    public static final int INTEGER=19;
    public static final int RBRACK=20;
    public static final int EXTENDS=21;
    public static final int CONSTRUCTOR=22;
    public static final int DESTRUCTOR=23;
    public static final int PUBLIC=24;
    public static final int PRIVATE=25;
    public static final int ASSGN=26;
    public static final int CONST=27;
    public static final int ASSGNP=28;
    public static final int ASSGNS=29;
    public static final int ASSGNT=30;
    public static final int ASSGND=31;
    public static final int ASSGNM=32;
    public static final int ASSGNSHL=33;
    public static final int ASSGNSHR=34;
    public static final int ASSGNBITAND=35;
    public static final int ASSGNBITOR=36;
    public static final int ASSGNBITXOR=37;
    public static final int NAMESPACE_ACCESS=38;
    public static final int BOOLEAN=39;
    public static final int BYTE=40;
    public static final int CHAR=41;
    public static final int FIXED=42;
    public static final int GAMELINK=43;
    public static final int COLOR=44;
    public static final int INT=45;
    public static final int POINT=46;
    public static final int STRING=47;
    public static final int ABILCMD=48;
    public static final int ACTOR=49;
    public static final int ACTORSCOPE=50;
    public static final int BANK=51;
    public static final int CAMERAINFO=52;
    public static final int MARKER=53;
    public static final int ORDER=54;
    public static final int PLAYERGROUP=55;
    public static final int REGION=56;
    public static final int REVEALER=57;
    public static final int SOUNDLINK=58;
    public static final int TEXT=59;
    public static final int TIMER=60;
    public static final int TRANSMISSIONSOURCE=61;
    public static final int TRIGGER=62;
    public static final int UNITFILTER=63;
    public static final int UNITGROUP=64;
    public static final int UNITREF=65;
    public static final int UNIT=66;
    public static final int WAVEINFO=67;
    public static final int WAVETARGET=68;
    public static final int DOODAD=69;
    public static final int AIFILTER=70;
    public static final int SOUND=71;
    public static final int WAVE=72;
    public static final int VOID=73;
    public static final int PLUS=74;
    public static final int SUB=75;
    public static final int TIMES=76;
    public static final int DIV=77;
    public static final int MODULO=78;
    public static final int DOT=79;
    public static final int NOT=80;
    public static final int NEW=81;
    public static final int DELETE=82;
    public static final int BIT_NOT=83;
    public static final int CHARACTER_LITERAL=84;
    public static final int STRING_LITERAL=85;
    public static final int FIXED_LITERAL=86;
    public static final int TRUE=87;
    public static final int FALSE=88;
    public static final int NULL=89;
    public static final int THIS=90;
    public static final int LOR=91;
    public static final int LAND=92;
    public static final int OR=93;
    public static final int XOR=94;
    public static final int AND=95;
    public static final int EQ=96;
    public static final int NEQ=97;
    public static final int LT=98;
    public static final int GT=99;
    public static final int LTEQ=100;
    public static final int GTEQ=101;
    public static final int SHIFTL=102;
    public static final int SHIFTR=103;
    public static final int IF=104;
    public static final int ELIF=105;
    public static final int ELSE=106;
    public static final int WHILE=107;
    public static final int FOR=108;
    public static final int BREAK=109;
    public static final int CONTINUE=110;
    public static final int RETURN=111;
    public static final int INLINE=112;
    public static final int NATIVE=113;
    public static final int STRUCT=114;
    public static final int INTERFACE=115;
    public static final int IMPLEMENTS=116;
    public static final int SUPER=117;
    public static final int NAMEOF=118;
    public static final int INITIALIZER=119;
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
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==DOWN) ) {
                        alt5=1;
                    }


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

                if ( (LA6_0==IDENTIFIER) ) {
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
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==DOWN) ) {
                        alt8=1;
                    }


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

                if ( (LA9_0==IDENTIFIER) ) {
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
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==DOWN) ) {
                        alt13=1;
                    }


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

                if ( (LA14_0==IDENTIFIER) ) {
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:150:1: namespace_statement : i1= IDENTIFIER NAMESPACE_ACCESS statement ;
    public final void namespace_statement() throws RecognitionException {
        CommonTree i1=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:151:2: (i1= IDENTIFIER NAMESPACE_ACCESS statement )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:151:6: i1= IDENTIFIER NAMESPACE_ACCESS statement
            {
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_statement479); 
            match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_namespace_statement481); 
            pushFollow(FOLLOW_statement_in_namespace_statement483);
            statement();

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


    // $ANTLR start "statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:159:1: statement : namespace_statement ;
    public final void statement() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:160:2: ( namespace_statement )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:160:4: namespace_statement
            {
            pushFollow(FOLLOW_namespace_statement_in_statement498);
            namespace_statement();

            state._fsp--;


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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:163:1: dot_statement[String line, boolean isClass, Namespace ns] returns [Expr t] : (d= DOT )+ ;
    public final Expr dot_statement(String line, boolean isClass, Namespace ns) throws RecognitionException {
        Expr t = null;

        CommonTree d=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:164:2: ( (d= DOT )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:164:4: (d= DOT )+
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:164:4: (d= DOT )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DOT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:164:5: d= DOT
            	    {
            	    d=(CommonTree)match(input,DOT,FOLLOW_DOT_in_dot_statement518); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:167:1: var_statement[String line, boolean isClass] returns [Expr e] : i1= IDENTIFIER ;
    public final Expr var_statement(String line, boolean isClass) throws RecognitionException {
        Expr e = null;

        CommonTree i1=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:168:2: (i1= IDENTIFIER )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:168:4: i1= IDENTIFIER
            {
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_statement539); 

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:171:1: function_statement[String line, boolean isClass] : IDENTIFIER LPAREN RPAREN ;
    public final void function_statement(String line, boolean isClass) throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:172:2: ( IDENTIFIER LPAREN RPAREN )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:172:4: IDENTIFIER LPAREN RPAREN
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_statement552); 
            match(input,LPAREN,FOLLOW_LPAREN_in_function_statement554); 
            match(input,RPAREN,FOLLOW_RPAREN_in_function_statement556); 

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:175:1: array_expression returns [Expr e] : l= LBRACK e1= expression RBRACK ;
    public final Expr array_expression() throws RecognitionException {
        Expr e = null;

        CommonTree l=null;
        Expr e1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:176:2: (l= LBRACK e1= expression RBRACK )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:176:4: l= LBRACK e1= expression RBRACK
            {
            l=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_array_expression573); 
            pushFollow(FOLLOW_expression_in_array_expression577);
            e1=expression();

            state._fsp--;

            match(input,RBRACK,FOLLOW_RBRACK_in_array_expression579); 

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:186:1: expression returns [Expr e] : ( ^( LOR a= expression b= expression ) | ^( LAND a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NEQ a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( PLUS a= expression b= expression ) | ^( MINUS a= expression b= expression ) | ^( TIMES a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( SHIFTR a= expression b= expression ) | ^( SHIFTL a= expression b= expression ) | ^( NOT a= expression ) | ^( NEGATION a= expression ) | ^( NEW a= expression ) | ^( DELETE a= expression ) | ^( NAMEOF a= expression ) | e1= INTEGER | e1= FIXED_LITERAL | e1= STRING_LITERAL | e1= CHARACTER_LITERAL | TRUE | FALSE | NULL );
    public final Expr expression() throws RecognitionException {
        Expr e = null;

        CommonTree e1=null;
        Expr a = null;

        Expr b = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:187:2: ( ^( LOR a= expression b= expression ) | ^( LAND a= expression b= expression ) | ^( EQ a= expression b= expression ) | ^( NEQ a= expression b= expression ) | ^( LT a= expression b= expression ) | ^( LTEQ a= expression b= expression ) | ^( GT a= expression b= expression ) | ^( GTEQ a= expression b= expression ) | ^( PLUS a= expression b= expression ) | ^( MINUS a= expression b= expression ) | ^( TIMES a= expression b= expression ) | ^( DIV a= expression b= expression ) | ^( SHIFTR a= expression b= expression ) | ^( SHIFTL a= expression b= expression ) | ^( NOT a= expression ) | ^( NEGATION a= expression ) | ^( NEW a= expression ) | ^( DELETE a= expression ) | ^( NAMEOF a= expression ) | e1= INTEGER | e1= FIXED_LITERAL | e1= STRING_LITERAL | e1= CHARACTER_LITERAL | TRUE | FALSE | NULL )
            int alt19=26;
            switch ( input.LA(1) ) {
            case LOR:
                {
                alt19=1;
                }
                break;
            case LAND:
                {
                alt19=2;
                }
                break;
            case EQ:
                {
                alt19=3;
                }
                break;
            case NEQ:
                {
                alt19=4;
                }
                break;
            case LT:
                {
                alt19=5;
                }
                break;
            case LTEQ:
                {
                alt19=6;
                }
                break;
            case GT:
                {
                alt19=7;
                }
                break;
            case GTEQ:
                {
                alt19=8;
                }
                break;
            case PLUS:
                {
                alt19=9;
                }
                break;
            case MINUS:
                {
                alt19=10;
                }
                break;
            case TIMES:
                {
                alt19=11;
                }
                break;
            case DIV:
                {
                alt19=12;
                }
                break;
            case SHIFTR:
                {
                alt19=13;
                }
                break;
            case SHIFTL:
                {
                alt19=14;
                }
                break;
            case NOT:
                {
                alt19=15;
                }
                break;
            case NEGATION:
                {
                alt19=16;
                }
                break;
            case NEW:
                {
                alt19=17;
                }
                break;
            case DELETE:
                {
                alt19=18;
                }
                break;
            case NAMEOF:
                {
                alt19=19;
                }
                break;
            case INTEGER:
                {
                alt19=20;
                }
                break;
            case FIXED_LITERAL:
                {
                alt19=21;
                }
                break;
            case STRING_LITERAL:
                {
                alt19=22;
                }
                break;
            case CHARACTER_LITERAL:
                {
                alt19=23;
                }
                break;
            case TRUE:
                {
                alt19=24;
                }
                break;
            case FALSE:
                {
                alt19=25;
                }
                break;
            case NULL:
                {
                alt19=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:187:4: ^( LOR a= expression b= expression )
                    {
                    match(input,LOR,FOLLOW_LOR_in_expression600); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression606);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression612);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Or(a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:188:4: ^( LAND a= expression b= expression )
                    {
                    match(input,LAND,FOLLOW_LAND_in_expression621); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression627);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression633);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new And(a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:189:4: ^( EQ a= expression b= expression )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expression642); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression648);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression654);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"=="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:190:4: ^( NEQ a= expression b= expression )
                    {
                    match(input,NEQ,FOLLOW_NEQ_in_expression663); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression669);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression675);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"!="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:191:4: ^( LT a= expression b= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression684); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression690);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression696);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"<"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:192:4: ^( LTEQ a= expression b= expression )
                    {
                    match(input,LTEQ,FOLLOW_LTEQ_in_expression705); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression711);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression717);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+"<="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:193:4: ^( GT a= expression b= expression )
                    {
                    match(input,GT,FOLLOW_GT_in_expression726); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression732);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression738);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+">"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:194:4: ^( GTEQ a= expression b= expression )
                    {
                    match(input,GTEQ,FOLLOW_GTEQ_in_expression747); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression753);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression759);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Rel(a.s+">="+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:195:4: ^( PLUS a= expression b= expression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression768); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression774);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression780);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"+"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:196:4: ^( MINUS a= expression b= expression )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expression789); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression795);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression801);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"-"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:197:4: ^( TIMES a= expression b= expression )
                    {
                    match(input,TIMES,FOLLOW_TIMES_in_expression810); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression816);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression822);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"*"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:198:4: ^( DIV a= expression b= expression )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expression831); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression837);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression843);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"+"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:199:4: ^( SHIFTR a= expression b= expression )
                    {
                    match(input,SHIFTR,FOLLOW_SHIFTR_in_expression852); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression858);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression864);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+">>"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:200:4: ^( SHIFTL a= expression b= expression )
                    {
                    match(input,SHIFTL,FOLLOW_SHIFTL_in_expression873); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression879);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression885);
                    b=expression();

                    state._fsp--;

                    if( a != null && b != null){e = new Arith(a.s+"<<"+b.s,a,b);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:201:4: ^( NOT a= expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression894); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression900);
                    a=expression();

                    state._fsp--;

                    if( a != null){e = new Not(a.s,a);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:202:4: ^( NEGATION a= expression )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expression909); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression915);
                    a=expression();

                    state._fsp--;

                    if( a != null){e = new Unary("-"+a.s,a);}

                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:203:4: ^( NEW a= expression )
                    {
                    match(input,NEW,FOLLOW_NEW_in_expression924); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression930);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:204:4: ^( DELETE a= expression )
                    {
                    match(input,DELETE,FOLLOW_DELETE_in_expression937); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression943);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:205:4: ^( NAMEOF a= expression )
                    {
                    match(input,NAMEOF,FOLLOW_NAMEOF_in_expression950); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression956);
                    a=expression();

                    state._fsp--;

                    if(a != null)e = new Unary(a.s,a);

                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:206:4: e1= INTEGER
                    {
                    e1=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expression966); 
                    e = new Constant(e1.getText(),Type.Integer);

                    }
                    break;
                case 21 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:207:4: e1= FIXED_LITERAL
                    {
                    e1=(CommonTree)match(input,FIXED_LITERAL,FOLLOW_FIXED_LITERAL_in_expression975); 
                    e = new Constant(e1.getText(),Type.Fixed);

                    }
                    break;
                case 22 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:208:4: e1= STRING_LITERAL
                    {
                    e1=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_expression984); 
                    e = new Constant(e1.getText(),Type.String);

                    }
                    break;
                case 23 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:209:4: e1= CHARACTER_LITERAL
                    {
                    e1=(CommonTree)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_expression993); 
                    e = new Constant(e1.getText(),Type.Char);

                    }
                    break;
                case 24 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:210:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_expression1000); 
                    e = Constant.True;

                    }
                    break;
                case 25 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:211:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_expression1007); 
                    e = Constant.False;

                    }
                    break;
                case 26 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:212:4: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_expression1014); 
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:215:1: type returns [Type t] : ( BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | t1= custom_type );
    public final Type type() throws RecognitionException {
        Type t = null;

        Type t1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:216:2: ( BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | t1= custom_type )
            int alt20=35;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt20=1;
                }
                break;
            case BYTE:
                {
                alt20=2;
                }
                break;
            case CHAR:
                {
                alt20=3;
                }
                break;
            case FIXED:
                {
                alt20=4;
                }
                break;
            case GAMELINK:
                {
                alt20=5;
                }
                break;
            case COLOR:
                {
                alt20=6;
                }
                break;
            case INT:
                {
                alt20=7;
                }
                break;
            case POINT:
                {
                alt20=8;
                }
                break;
            case STRING:
                {
                alt20=9;
                }
                break;
            case ABILCMD:
                {
                alt20=10;
                }
                break;
            case ACTOR:
                {
                alt20=11;
                }
                break;
            case ACTORSCOPE:
                {
                alt20=12;
                }
                break;
            case BANK:
                {
                alt20=13;
                }
                break;
            case CAMERAINFO:
                {
                alt20=14;
                }
                break;
            case MARKER:
                {
                alt20=15;
                }
                break;
            case ORDER:
                {
                alt20=16;
                }
                break;
            case PLAYERGROUP:
                {
                alt20=17;
                }
                break;
            case REGION:
                {
                alt20=18;
                }
                break;
            case REVEALER:
                {
                alt20=19;
                }
                break;
            case SOUNDLINK:
                {
                alt20=20;
                }
                break;
            case TEXT:
                {
                alt20=21;
                }
                break;
            case TIMER:
                {
                alt20=22;
                }
                break;
            case TRANSMISSIONSOURCE:
                {
                alt20=23;
                }
                break;
            case TRIGGER:
                {
                alt20=24;
                }
                break;
            case UNITFILTER:
                {
                alt20=25;
                }
                break;
            case UNITGROUP:
                {
                alt20=26;
                }
                break;
            case UNITREF:
                {
                alt20=27;
                }
                break;
            case UNIT:
                {
                alt20=28;
                }
                break;
            case WAVEINFO:
                {
                alt20=29;
                }
                break;
            case WAVETARGET:
                {
                alt20=30;
                }
                break;
            case DOODAD:
                {
                alt20=31;
                }
                break;
            case AIFILTER:
                {
                alt20=32;
                }
                break;
            case SOUND:
                {
                alt20=33;
                }
                break;
            case WAVE:
                {
                alt20=34;
                }
                break;
            case IDENTIFIER:
                {
                alt20=35;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:216:4: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1032); 
                    t = Type.Boolean;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:217:4: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_type1039); 
                    t = Type.Byte;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:218:4: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_type1046); 
                    t = Type.Char;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:219:4: FIXED
                    {
                    match(input,FIXED,FOLLOW_FIXED_in_type1053); 
                    t = Type.Fixed;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:220:4: GAMELINK
                    {
                    match(input,GAMELINK,FOLLOW_GAMELINK_in_type1060); 
                    t = Type.Gamelink;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:221:4: COLOR
                    {
                    match(input,COLOR,FOLLOW_COLOR_in_type1067); 
                    t = Type.Color;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:222:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_type1074); 
                    t = Type.Integer;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:223:4: POINT
                    {
                    match(input,POINT,FOLLOW_POINT_in_type1081); 
                    t = Type.Point;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:224:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_type1088); 
                    t = Type.String;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:225:4: ABILCMD
                    {
                    match(input,ABILCMD,FOLLOW_ABILCMD_in_type1095); 
                    t = Type.Abilcmd;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:226:4: ACTOR
                    {
                    match(input,ACTOR,FOLLOW_ACTOR_in_type1102); 
                    t = Type.Actor;

                    }
                    break;
                case 12 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:227:4: ACTORSCOPE
                    {
                    match(input,ACTORSCOPE,FOLLOW_ACTORSCOPE_in_type1109); 
                    t = Type.Actorscope;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:228:4: BANK
                    {
                    match(input,BANK,FOLLOW_BANK_in_type1116); 
                    t = Type.Bank;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:229:4: CAMERAINFO
                    {
                    match(input,CAMERAINFO,FOLLOW_CAMERAINFO_in_type1123); 
                    t = Type.Camerainfo;

                    }
                    break;
                case 15 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:230:4: MARKER
                    {
                    match(input,MARKER,FOLLOW_MARKER_in_type1130); 
                    t = Type.Marker;

                    }
                    break;
                case 16 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:231:4: ORDER
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_type1137); 
                    t = Type.Order;

                    }
                    break;
                case 17 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:232:4: PLAYERGROUP
                    {
                    match(input,PLAYERGROUP,FOLLOW_PLAYERGROUP_in_type1144); 
                    t = Type.Playergroup;

                    }
                    break;
                case 18 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:233:4: REGION
                    {
                    match(input,REGION,FOLLOW_REGION_in_type1151); 
                    t = Type.Region;

                    }
                    break;
                case 19 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:234:4: REVEALER
                    {
                    match(input,REVEALER,FOLLOW_REVEALER_in_type1158); 
                    t = Type.Revealer;

                    }
                    break;
                case 20 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:235:4: SOUNDLINK
                    {
                    match(input,SOUNDLINK,FOLLOW_SOUNDLINK_in_type1165); 
                    t = Type.Soundlink;

                    }
                    break;
                case 21 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:236:4: TEXT
                    {
                    match(input,TEXT,FOLLOW_TEXT_in_type1172); 
                    t = Type.Text;

                    }
                    break;
                case 22 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:237:4: TIMER
                    {
                    match(input,TIMER,FOLLOW_TIMER_in_type1179); 
                    t = Type.Timer;

                    }
                    break;
                case 23 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:238:4: TRANSMISSIONSOURCE
                    {
                    match(input,TRANSMISSIONSOURCE,FOLLOW_TRANSMISSIONSOURCE_in_type1186); 
                    t = Type.Transmissionsource;

                    }
                    break;
                case 24 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:239:4: TRIGGER
                    {
                    match(input,TRIGGER,FOLLOW_TRIGGER_in_type1193); 
                    t = Type.Trigger;

                    }
                    break;
                case 25 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:240:4: UNITFILTER
                    {
                    match(input,UNITFILTER,FOLLOW_UNITFILTER_in_type1200); 
                    t = Type.Unitfilter;

                    }
                    break;
                case 26 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:241:4: UNITGROUP
                    {
                    match(input,UNITGROUP,FOLLOW_UNITGROUP_in_type1207); 
                    t = Type.Unitgroup;

                    }
                    break;
                case 27 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:242:4: UNITREF
                    {
                    match(input,UNITREF,FOLLOW_UNITREF_in_type1214); 
                    t = Type.Unitref;

                    }
                    break;
                case 28 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:243:4: UNIT
                    {
                    match(input,UNIT,FOLLOW_UNIT_in_type1221); 
                    t = Type.Unit;

                    }
                    break;
                case 29 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:244:4: WAVEINFO
                    {
                    match(input,WAVEINFO,FOLLOW_WAVEINFO_in_type1228); 
                    t = Type.Waveinfo;

                    }
                    break;
                case 30 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:245:4: WAVETARGET
                    {
                    match(input,WAVETARGET,FOLLOW_WAVETARGET_in_type1235); 
                    t = Type.Wavetarget;

                    }
                    break;
                case 31 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:246:4: DOODAD
                    {
                    match(input,DOODAD,FOLLOW_DOODAD_in_type1242); 
                    t = Type.Doodad;

                    }
                    break;
                case 32 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:247:4: AIFILTER
                    {
                    match(input,AIFILTER,FOLLOW_AIFILTER_in_type1249); 
                    t = Type.AIFilter;

                    }
                    break;
                case 33 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:248:4: SOUND
                    {
                    match(input,SOUND,FOLLOW_SOUND_in_type1256); 
                    t = Type.Sound;

                    }
                    break;
                case 34 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:249:4: WAVE
                    {
                    match(input,WAVE,FOLLOW_WAVE_in_type1263); 
                    t = Type.Wave;

                    }
                    break;
                case 35 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:250:5: t1= custom_type
                    {
                    pushFollow(FOLLOW_custom_type_in_type1273);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:253:1: custom_type returns [Type t] : (i1= IDENTIFIER | i1= IDENTIFIER NAMESPACE_ACCESS i2= IDENTIFIER );
    public final Type custom_type() throws RecognitionException {
        Type t = null;

        CommonTree i1=null;
        CommonTree i2=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:254:2: (i1= IDENTIFIER | i1= IDENTIFIER NAMESPACE_ACCESS i2= IDENTIFIER )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENTIFIER) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==NAMESPACE_ACCESS) ) {
                    alt21=2;
                }
                else if ( ((LA21_1>=DOWN && LA21_1<=UP)||LA21_1==IDENTIFIER||LA21_1==COMMA||LA21_1==LBRACK||LA21_1==ASSGN) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:254:4: i1= IDENTIFIER
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_custom_type1293); 

                    		if(Type.isCustomType(curNS+"_"+(i1!=null?i1.getText():null))){
                    	 		t = Type.getCustomType(curNS+"_"+(i1!=null?i1.getText():null));
                    	 	}else{
                    	 		Error.printError("Type $1 not defined for namespace "+curNS,i1.token);
                    	 	}
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXWalker.g:262:4: i1= IDENTIFIER NAMESPACE_ACCESS i2= IDENTIFIER
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_custom_type1304); 
                    match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_custom_type1306); 
                    i2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_custom_type1310); 

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
        "\1\110\42\2\1\46\1\22\1\6\1\32\1\uffff\1\2\2\uffff";
    static final String DFA11_acceptS =
        "\47\uffff\1\2\1\uffff\1\1\1\3";
    static final String DFA11_specialS =
        "\53\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\43\40\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
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
            "\1\44\43\uffff\1\45",
            "\1\46\13\uffff\1\47",
            "\1\50",
            "\1\52\26\uffff\1\51",
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
        "\1\6\1\2\1\110\42\32\1\46\3\uffff\1\6\1\32";
    static final String DFA17_acceptS =
        "\46\uffff\1\1\1\2\1\3\2\uffff";
    static final String DFA17_specialS =
        "\53\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\1\2",
            "\1\45\40\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46",
            "\1\50\16\uffff\1\47\7\uffff\1\46\13\uffff\1\51",
            "",
            "",
            "",
            "\1\52",
            "\1\50\16\uffff\1\47\7\uffff\1\46"
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
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace73 = new BitSet(new long[]{0xFFFFFF8000021048L,0x00000000000001FFL});
    public static final BitSet FOLLOW_field_decl_in_namespace83 = new BitSet(new long[]{0xFFFFFF8000021048L,0x00000000000001FFL});
    public static final BitSet FOLLOW_function_in_namespace87 = new BitSet(new long[]{0xFFFFFF8000021048L,0x00000000000001FFL});
    public static final BitSet FOLLOW_class_decl_in_namespace91 = new BitSet(new long[]{0xFFFFFF8000021048L,0x00000000000001FFL});
    public static final BitSet FOLLOW_CLASS_in_class_decl113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl117 = new BitSet(new long[]{0xFFFFFF8000C01048L,0x00000000000001FFL});
    public static final BitSet FOLLOW_field_decl_in_class_decl125 = new BitSet(new long[]{0xFFFFFF8000C01048L,0x00000000000001FFL});
    public static final BitSet FOLLOW_function_in_class_decl129 = new BitSet(new long[]{0xFFFFFF8000C01048L,0x00000000000001FFL});
    public static final BitSet FOLLOW_constr_decl_in_class_decl133 = new BitSet(new long[]{0xFFFFFF8000C01048L,0x00000000000001FFL});
    public static final BitSet FOLLOW_destr_declr_in_class_decl137 = new BitSet(new long[]{0xFFFFFF8000C01048L,0x00000000000001FFL});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constr_decl160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_constr_decl165 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_constr_decl169 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_local_var_in_constr_decl176 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_statement_in_constr_decl181 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destr_declr204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_destr_declr209 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_destr_declr213 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_local_var_in_destr_declr220 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_statement_in_destr_declr225 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_type_in_field_decl246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl250 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSGN_in_field_decl252 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_field_decl256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_field_decl267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_array_expression_in_field_decl272 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_field_decl289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_in_function310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function314 = new BitSet(new long[]{0xFFFFFF8000000040L,0x00000000000001FFL});
    public static final BitSet FOLLOW_parameter_list_in_function325 = new BitSet(new long[]{0xFFFFFF8000000040L,0x00000000000001FFL});
    public static final BitSet FOLLOW_type_in_function331 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_local_var_in_function335 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_statement_in_function340 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_list371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter_list375 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list384 = new BitSet(new long[]{0xFFFFFF8000000040L,0x00000000000001FFL});
    public static final BitSet FOLLOW_type_in_parameter_list388 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter_list392 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_local_var416 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ASSGN_in_local_var419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_local_var423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_local_var440 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_array_expression_in_local_var445 = new BitSet(new long[]{0x0000000000040048L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_local_var462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_statement479 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_namespace_statement481 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_namespace_statement483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_statement_in_statement498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dot_statement518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_var_statement539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_statement552 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LPAREN_in_function_statement554 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAREN_in_function_statement556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_expression573 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_array_expression577 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACK_in_array_expression579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOR_in_expression600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression606 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAND_in_expression621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression627 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_expression642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression648 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression654 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_expression663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression669 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression690 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEQ_in_expression705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression711 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expression726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression732 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression738 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEQ_in_expression747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression753 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression768 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression774 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression789 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression795 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression801 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_expression810 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression816 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression837 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTR_in_expression852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression858 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression864 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTL_in_expression873 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression879 = new BitSet(new long[]{0x0000000000080010L,0x004000FF1BF73400L,0x0000000000000100L});
    public static final BitSet FOLLOW_expression_in_expression885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expression909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression915 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression924 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_expression937 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression943 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMEOF_in_expression950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_expression966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_LITERAL_in_expression975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_expression984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_expression993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expression1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expression1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_expression1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_type1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_in_type1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GAMELINK_in_type1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_in_type1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_type1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_type1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABILCMD_in_type1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTOR_in_type1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTORSCOPE_in_type1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANK_in_type1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERAINFO_in_type1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARKER_in_type1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_type1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYERGROUP_in_type1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGION_in_type1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REVEALER_in_type1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUNDLINK_in_type1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_type1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMER_in_type1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSMISSIONSOURCE_in_type1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIGGER_in_type1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITFILTER_in_type1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITGROUP_in_type1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITREF_in_type1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIT_in_type1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVEINFO_in_type1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVETARGET_in_type1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOODAD_in_type1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AIFILTER_in_type1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUND_in_type1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVE_in_type1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_custom_type_in_type1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_custom_type1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_custom_type1304 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_custom_type1306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_custom_type1310 = new BitSet(new long[]{0x0000000000000002L});

}