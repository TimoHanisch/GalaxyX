// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g 2013-03-16 13:17:23

	package com.galaxyx.treewalker;
	
	import com.galaxyx.utils.SymbolTable;
	import com.galaxyx.utils.ErrorHandler;
	import com.galaxyx.utils.ErrorHandler.Error;
	import com.galaxyx.constructs.Namespace;
	import com.galaxyx.constructs.Class;
	import com.galaxyx.constructs.Method;
	import com.galaxyx.constructs.Field;
	import com.galaxyx.constructs.Local;
	import com.galaxyx.constructs.Method.Constructor;
	import com.galaxyx.constructs.Method.Destructor;
	import com.galaxyx.semantic.Type;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXDefinitionWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ELIF", "WHILE", "FOR", "END", "DO", "BREAK", "CONTINUE", "RETURN", "FALSE", "TRUE", "NULL", "STRUCT", "FUNC", "CONSTRUCTOR", "DESTRUCTOR", "TYPEDEF", "NAMESPACE", "CLASS", "INTERFACE", "IMPLEMENTS", "EXTENDS", "NEW", "DELETE", "THIS", "SUPER", "NAMEOF", "INITIALIZER", "INLINE", "STATIC", "CONST", "PRIVATE", "PUBLIC", "NATIVE", "DEFINE", "UNDEF", "INCLUDE", "PREFIX", "SEMI", "COMMA", "DOT", "COLON", "RETURNS", "PLUS", "SUB", "DIV", "TIMES", "MODULO", "AND", "OR", "XOR", "BIT_NOT", "NOT", "LOR", "LAND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "SHIFTL", "SHIFTR", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "NAMESPACE_ACCESS", "LETTER", "IDENTIFIER", "EscapeSequence", "CHARACTER_LITERAL", "STRING_LITERAL", "DIGIT", "HEX_LITERAL", "INTEGER", "HexDigit", "FIXED_LITERAL", "OctalEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT", "FIELD", "LOCAL", "ARRAY", "TMP", "PARAMETER_LIST", "PARAMETER", "NAMESPACE_TYPE", "TYPE"
    };
    public static final int EOF=-1;
    public static final int IF=4;
    public static final int ELSE=5;
    public static final int ELIF=6;
    public static final int WHILE=7;
    public static final int FOR=8;
    public static final int END=9;
    public static final int DO=10;
    public static final int BREAK=11;
    public static final int CONTINUE=12;
    public static final int RETURN=13;
    public static final int FALSE=14;
    public static final int TRUE=15;
    public static final int NULL=16;
    public static final int STRUCT=17;
    public static final int FUNC=18;
    public static final int CONSTRUCTOR=19;
    public static final int DESTRUCTOR=20;
    public static final int TYPEDEF=21;
    public static final int NAMESPACE=22;
    public static final int CLASS=23;
    public static final int INTERFACE=24;
    public static final int IMPLEMENTS=25;
    public static final int EXTENDS=26;
    public static final int NEW=27;
    public static final int DELETE=28;
    public static final int THIS=29;
    public static final int SUPER=30;
    public static final int NAMEOF=31;
    public static final int INITIALIZER=32;
    public static final int INLINE=33;
    public static final int STATIC=34;
    public static final int CONST=35;
    public static final int PRIVATE=36;
    public static final int PUBLIC=37;
    public static final int NATIVE=38;
    public static final int DEFINE=39;
    public static final int UNDEF=40;
    public static final int INCLUDE=41;
    public static final int PREFIX=42;
    public static final int SEMI=43;
    public static final int COMMA=44;
    public static final int DOT=45;
    public static final int COLON=46;
    public static final int RETURNS=47;
    public static final int PLUS=48;
    public static final int SUB=49;
    public static final int DIV=50;
    public static final int TIMES=51;
    public static final int MODULO=52;
    public static final int AND=53;
    public static final int OR=54;
    public static final int XOR=55;
    public static final int BIT_NOT=56;
    public static final int NOT=57;
    public static final int LOR=58;
    public static final int LAND=59;
    public static final int EQ=60;
    public static final int NEQ=61;
    public static final int LT=62;
    public static final int LTEQ=63;
    public static final int GT=64;
    public static final int GTEQ=65;
    public static final int SHIFTL=66;
    public static final int SHIFTR=67;
    public static final int ASSGN=68;
    public static final int ASSGNP=69;
    public static final int ASSGNS=70;
    public static final int ASSGNT=71;
    public static final int ASSGND=72;
    public static final int ASSGNM=73;
    public static final int ASSGNSHL=74;
    public static final int ASSGNSHR=75;
    public static final int ASSGNBITAND=76;
    public static final int ASSGNBITOR=77;
    public static final int ASSGNBITXOR=78;
    public static final int LPAREN=79;
    public static final int RPAREN=80;
    public static final int LBRACE=81;
    public static final int RBRACE=82;
    public static final int LBRACK=83;
    public static final int RBRACK=84;
    public static final int NAMESPACE_ACCESS=85;
    public static final int LETTER=86;
    public static final int IDENTIFIER=87;
    public static final int EscapeSequence=88;
    public static final int CHARACTER_LITERAL=89;
    public static final int STRING_LITERAL=90;
    public static final int DIGIT=91;
    public static final int HEX_LITERAL=92;
    public static final int INTEGER=93;
    public static final int HexDigit=94;
    public static final int FIXED_LITERAL=95;
    public static final int OctalEscape=96;
    public static final int WS=97;
    public static final int LINE_COMMENT=98;
    public static final int MULTI_COMMENT=99;
    public static final int FIELD=100;
    public static final int LOCAL=101;
    public static final int ARRAY=102;
    public static final int TMP=103;
    public static final int PARAMETER_LIST=104;
    public static final int PARAMETER=105;
    public static final int NAMESPACE_TYPE=106;
    public static final int TYPE=107;

    // delegates
    // delegators


        public GalaxyXDefinitionWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXDefinitionWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GalaxyXDefinitionWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g"; }


    	private SymbolTable table;
    	private ErrorHandler errHandler; 
    	
    	private Namespace currentNamespace;
    	private Class currentClass;
    	private Method currentMethod;



    // $ANTLR start "eval"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:34:1: eval[SymbolTable table, ErrorHandler errHandler] : ( namespace_decl )* ;
    public final void eval(SymbolTable table, ErrorHandler errHandler) throws RecognitionException {

        	this.table = table;
        	this.errHandler = errHandler;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:39:2: ( ( namespace_decl )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:39:4: ( namespace_decl )*
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:39:4: ( namespace_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ASSGN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:39:4: namespace_decl
            	    {
            	    pushFollow(FOLLOW_namespace_decl_in_eval65);
            	    namespace_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "eval"


    // $ANTLR start "namespace_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:43:1: namespace_decl : ^( ASSGN IDENTIFIER ( class_decl )* ( method_decl )* ( field_decl )* ) ;
    public final void namespace_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:44:2: ( ^( ASSGN IDENTIFIER ( class_decl )* ( method_decl )* ( field_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:44:4: ^( ASSGN IDENTIFIER ( class_decl )* ( method_decl )* ( field_decl )* )
            {
            match(input,ASSGN,FOLLOW_ASSGN_in_namespace_decl83); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl85); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:44:23: ( class_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:44:23: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl87);
            	    class_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:44:35: ( method_decl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==FUNC) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:44:35: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_namespace_decl90);
            	    method_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:44:48: ( field_decl )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==FIELD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:44:48: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace_decl93);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "namespace_decl"


    // $ANTLR start "class_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:47:1: class_decl : ^( CLASS ( modifier )? IDENTIFIER ( field_decl )* ( method_decl )* ( constructor_decl )* ( destructor_decl )* ) ;
    public final void class_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:2: ( ^( CLASS ( modifier )? IDENTIFIER ( field_decl )* ( method_decl )* ( constructor_decl )* ( destructor_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:4: ^( CLASS ( modifier )? IDENTIFIER ( field_decl )* ( method_decl )* ( constructor_decl )* ( destructor_decl )* )
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_decl108); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:12: ( modifier )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=PRIVATE && LA5_0<=PUBLIC)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:12: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_class_decl110);
                    modifier();

                    state._fsp--;


                    }
                    break;

            }

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl113); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:33: ( field_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==FIELD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:33: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl115);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:45: ( method_decl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==FUNC) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:45: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_decl118);
            	    method_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:58: ( constructor_decl )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CONSTRUCTOR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:58: constructor_decl
            	    {
            	    pushFollow(FOLLOW_constructor_decl_in_class_decl121);
            	    constructor_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:76: ( destructor_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DESTRUCTOR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:48:76: destructor_decl
            	    {
            	    pushFollow(FOLLOW_destructor_decl_in_class_decl124);
            	    destructor_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "field_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:51:1: field_decl : ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ) ;
    public final void field_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:2: ( ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:4: ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER )
            {
            match(input,FIELD,FOLLOW_FIELD_in_field_decl139); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:12: ( modifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=PRIVATE && LA10_0<=PUBLIC)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:12: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_field_decl141);
                    modifier();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:22: ( STATIC )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==STATIC) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:22: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_field_decl144); 

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:30: ( CONST )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CONST) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:30: CONST
                    {
                    match(input,CONST,FOLLOW_CONST_in_field_decl147); 

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_field_decl150);
            type();

            state._fsp--;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:42: ( array )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ARRAY) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:42: array
            	    {
            	    pushFollow(FOLLOW_array_in_field_decl152);
            	    array();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl155); 

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
    // $ANTLR end "field_decl"


    // $ANTLR start "method_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:55:1: method_decl : ^( FUNC type ( modifier )? ( parameter_list )? ( local_decl )* ) ;
    public final void method_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:56:2: ( ^( FUNC type ( modifier )? ( parameter_list )? ( local_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:56:4: ^( FUNC type ( modifier )? ( parameter_list )? ( local_decl )* )
            {
            match(input,FUNC,FOLLOW_FUNC_in_method_decl169); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_method_decl171);
            type();

            state._fsp--;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:56:16: ( modifier )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=PRIVATE && LA14_0<=PUBLIC)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:56:16: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_method_decl173);
                    modifier();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:56:26: ( parameter_list )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==PARAMETER_LIST) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:56:26: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_method_decl176);
                    parameter_list();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:56:42: ( local_decl )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LOCAL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:56:42: local_decl
            	    {
            	    pushFollow(FOLLOW_local_decl_in_method_decl179);
            	    local_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "method_decl"


    // $ANTLR start "constructor_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:59:1: constructor_decl : ^( CONSTRUCTOR ( parameter_list )? ( local_decl )* ) ;
    public final void constructor_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:60:2: ( ^( CONSTRUCTOR ( parameter_list )? ( local_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:60:4: ^( CONSTRUCTOR ( parameter_list )? ( local_decl )* )
            {
            match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl194); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:60:18: ( parameter_list )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==PARAMETER_LIST) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:60:18: parameter_list
                        {
                        pushFollow(FOLLOW_parameter_list_in_constructor_decl196);
                        parameter_list();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:60:34: ( local_decl )*
                loop18:
                do {
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==LOCAL) ) {
                        alt18=1;
                    }


                    switch (alt18) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:60:34: local_decl
                	    {
                	    pushFollow(FOLLOW_local_decl_in_constructor_decl199);
                	    local_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop18;
                    }
                } while (true);


                match(input, Token.UP, null); 
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
    // $ANTLR end "constructor_decl"


    // $ANTLR start "destructor_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:63:1: destructor_decl : ^( DESTRUCTOR ( parameter_list )? ( local_decl )* ) ;
    public final void destructor_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:64:2: ( ^( DESTRUCTOR ( parameter_list )? ( local_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:64:4: ^( DESTRUCTOR ( parameter_list )? ( local_decl )* )
            {
            match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl214); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:64:17: ( parameter_list )?
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==PARAMETER_LIST) ) {
                    alt19=1;
                }
                switch (alt19) {
                    case 1 :
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:64:17: parameter_list
                        {
                        pushFollow(FOLLOW_parameter_list_in_destructor_decl216);
                        parameter_list();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:64:33: ( local_decl )*
                loop20:
                do {
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==LOCAL) ) {
                        alt20=1;
                    }


                    switch (alt20) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:64:33: local_decl
                	    {
                	    pushFollow(FOLLOW_local_decl_in_destructor_decl219);
                	    local_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop20;
                    }
                } while (true);


                match(input, Token.UP, null); 
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
    // $ANTLR end "destructor_decl"


    // $ANTLR start "local_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:67:1: local_decl : ^( LOCAL ( CONST )? type ( array )* IDENTIFIER ) ;
    public final void local_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:68:2: ( ^( LOCAL ( CONST )? type ( array )* IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:68:4: ^( LOCAL ( CONST )? type ( array )* IDENTIFIER )
            {
            match(input,LOCAL,FOLLOW_LOCAL_in_local_decl235); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:68:12: ( CONST )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CONST) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:68:12: CONST
                    {
                    match(input,CONST,FOLLOW_CONST_in_local_decl237); 

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_local_decl240);
            type();

            state._fsp--;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:68:24: ( array )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ARRAY) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:68:24: array
            	    {
            	    pushFollow(FOLLOW_array_in_local_decl242);
            	    array();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_decl245); 

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
    // $ANTLR end "local_decl"


    // $ANTLR start "modifier"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:71:1: modifier : ( PUBLIC | PRIVATE );
    public final void modifier() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:72:2: ( PUBLIC | PRIVATE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:
            {
            if ( (input.LA(1)>=PRIVATE && input.LA(1)<=PUBLIC) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "modifier"


    // $ANTLR start "array"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:75:1: array : ^( ARRAY TMP ) ;
    public final void array() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:76:2: ( ^( ARRAY TMP ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:76:4: ^( ARRAY TMP )
            {
            match(input,ARRAY,FOLLOW_ARRAY_in_array275); 

            match(input, Token.DOWN, null); 
            match(input,TMP,FOLLOW_TMP_in_array277); 

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
    // $ANTLR end "array"


    // $ANTLR start "parameter_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:79:1: parameter_list returns [List<Local> params] : ^( PARAMETER_LIST parameter ( parameter )* ) ;
    public final List<Local> parameter_list() throws RecognitionException {
        List<Local> params = null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:80:2: ( ^( PARAMETER_LIST parameter ( parameter )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:80:4: ^( PARAMETER_LIST parameter ( parameter )* )
            {
            match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_parameter_list296); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_parameter_in_parameter_list298);
            parameter();

            state._fsp--;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:80:31: ( parameter )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==PARAMETER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:80:32: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_parameter_list301);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
        return params;
    }
    // $ANTLR end "parameter_list"


    // $ANTLR start "parameter"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:83:1: parameter : ^( PARAMETER type IDENTIFIER ) ;
    public final void parameter() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:84:2: ( ^( PARAMETER type IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:84:4: ^( PARAMETER type IDENTIFIER )
            {
            match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter318); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_parameter320);
            type();

            state._fsp--;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter322); 

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
    // $ANTLR end "parameter"


    // $ANTLR start "type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:87:1: type returns [Type t] : ( ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER ) | ^( TYPE IDENTIFIER ) );
    public final Type type() throws RecognitionException {
        Type t = null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:88:2: ( ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER ) | ^( TYPE IDENTIFIER ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NAMESPACE_TYPE) ) {
                alt24=1;
            }
            else if ( (LA24_0==TYPE) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:88:4: ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER )
                    {
                    match(input,NAMESPACE_TYPE,FOLLOW_NAMESPACE_TYPE_in_type340); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type342); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type344); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:89:4: ^( TYPE IDENTIFIER )
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_type351); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type353); 

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
        return t;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_namespace_decl_in_eval65 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSGN_in_namespace_decl83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_decl85 = new BitSet(new long[]{0x0000000000840008L,0x0000001000000000L});
    public static final BitSet FOLLOW_class_decl_in_namespace_decl87 = new BitSet(new long[]{0x0000000000840008L,0x0000001000000000L});
    public static final BitSet FOLLOW_method_decl_in_namespace_decl90 = new BitSet(new long[]{0x0000000000040008L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_decl_in_namespace_decl93 = new BitSet(new long[]{0x0000000000000008L,0x0000001000000000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_class_decl110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl113 = new BitSet(new long[]{0x00000000001C0008L,0x0000001000000000L});
    public static final BitSet FOLLOW_field_decl_in_class_decl115 = new BitSet(new long[]{0x00000000001C0008L,0x0000001000000000L});
    public static final BitSet FOLLOW_method_decl_in_class_decl118 = new BitSet(new long[]{0x00000000001C0008L});
    public static final BitSet FOLLOW_constructor_decl_in_class_decl121 = new BitSet(new long[]{0x0000000000180008L});
    public static final BitSet FOLLOW_destructor_decl_in_class_decl124 = new BitSet(new long[]{0x0000000000100008L});
    public static final BitSet FOLLOW_FIELD_in_field_decl139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_field_decl141 = new BitSet(new long[]{0x0000000C00000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_STATIC_in_field_decl144 = new BitSet(new long[]{0x0000000C00000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_CONST_in_field_decl147 = new BitSet(new long[]{0x0000000C00000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_type_in_field_decl150 = new BitSet(new long[]{0x0000000000000000L,0x0000004000800000L});
    public static final BitSet FOLLOW_array_in_field_decl152 = new BitSet(new long[]{0x0000000000000000L,0x0000004000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_in_method_decl169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_method_decl171 = new BitSet(new long[]{0x0000003000000008L,0x0000012000000000L});
    public static final BitSet FOLLOW_modifier_in_method_decl173 = new BitSet(new long[]{0x0000000000000008L,0x0000012000000000L});
    public static final BitSet FOLLOW_parameter_list_in_method_decl176 = new BitSet(new long[]{0x0000000000000008L,0x0000002000000000L});
    public static final BitSet FOLLOW_local_decl_in_method_decl179 = new BitSet(new long[]{0x0000000000000008L,0x0000002000000000L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_constructor_decl196 = new BitSet(new long[]{0x0000000000000008L,0x0000002000000000L});
    public static final BitSet FOLLOW_local_decl_in_constructor_decl199 = new BitSet(new long[]{0x0000000000000008L,0x0000002000000000L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_destructor_decl216 = new BitSet(new long[]{0x0000000000000008L,0x0000002000000000L});
    public static final BitSet FOLLOW_local_decl_in_destructor_decl219 = new BitSet(new long[]{0x0000000000000008L,0x0000002000000000L});
    public static final BitSet FOLLOW_LOCAL_in_local_decl235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONST_in_local_decl237 = new BitSet(new long[]{0x0000000C00000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_type_in_local_decl240 = new BitSet(new long[]{0x0000000000000000L,0x0000004000800000L});
    public static final BitSet FOLLOW_array_in_local_decl242 = new BitSet(new long[]{0x0000000000000000L,0x0000004000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_decl245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_array275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TMP_in_array277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_LIST_in_parameter_list296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_parameter_list298 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list301 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_PARAMETER_in_parameter318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMESPACE_TYPE_in_type340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_type351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type353 = new BitSet(new long[]{0x0000000000000008L});

}