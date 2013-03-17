// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g 2013-03-17 22:20:03

	package com.galaxyx.treewalker;
	
	import com.galaxyx.utils.SymbolTable;
	import com.galaxyx.utils.ErrorHandler;
	import com.galaxyx.utils.ErrorHandler.Error;
	import com.galaxyx.constructs.Namespace;
	import com.galaxyx.constructs.Class;
	import com.galaxyx.constructs.Method;
	import com.galaxyx.constructs.Field;
	import com.galaxyx.constructs.Local;
	import com.galaxyx.constructs.SightModifier;
	import com.galaxyx.constructs.Method.Constructor;
	import com.galaxyx.constructs.Method.Destructor;
	import com.galaxyx.semantic.Type;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXSemanticWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ELIF", "WHILE", "FOR", "END", "DO", "BREAK", "CONTINUE", "RETURN", "FALSE", "TRUE", "NULL", "STRUCT", "FUNC", "CONSTRUCTOR", "DESTRUCTOR", "TYPEDEF", "NAMESPACE", "CLASS", "INTERFACE", "IMPLEMENTS", "EXTENDS", "NEW", "DELETE", "THIS", "SUPER", "NAMEOF", "INITIALIZER", "INLINE", "STATIC", "CONST", "PRIVATE", "PUBLIC", "NATIVE", "DEFINE", "UNDEF", "INCLUDE", "PREFIX", "SEMI", "COMMA", "DOT", "COLON", "RETURNS", "PLUS", "SUB", "DIV", "TIMES", "MODULO", "AND", "OR", "XOR", "BIT_NOT", "NOT", "LOR", "LAND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "SHIFTL", "SHIFTR", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "NAMESPACE_ACCESS", "LETTER", "IDENTIFIER", "EscapeSequence", "CHARACTER_LITERAL", "STRING_LITERAL", "DIGIT", "HEX_LITERAL", "INTEGER", "HexDigit", "FIXED_LITERAL", "OctalEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT", "NAMESPACE_TYPE", "TYPE", "VARDEF", "ARRAY", "NEGATION", "FUNCTION_EXPRESSION", "FIELD", "LOCAL", "PARAMETER", "PARAMETER_LIST"
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
    public static final int NAMESPACE_TYPE=100;
    public static final int TYPE=101;
    public static final int VARDEF=102;
    public static final int ARRAY=103;
    public static final int NEGATION=104;
    public static final int FUNCTION_EXPRESSION=105;
    public static final int FIELD=106;
    public static final int LOCAL=107;
    public static final int PARAMETER=108;
    public static final int PARAMETER_LIST=109;

    // delegates
    // delegators


        public GalaxyXSemanticWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXSemanticWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GalaxyXSemanticWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g"; }


    	private SymbolTable table;
    	private ErrorHandler errHandler; 
    	
    	private Namespace currentNamespace;
    	private Class currentClass;
    	private Method currentMethod;



    // $ANTLR start "eval"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:35:1: eval[SymbolTable table, ErrorHandler errHandler] : ( namespace_decl )* ;
    public final void eval(SymbolTable table, ErrorHandler errHandler) throws RecognitionException {

        	this.table = table;
        	this.errHandler = errHandler;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:40:2: ( ( namespace_decl )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:40:4: ( namespace_decl )*
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:40:4: ( namespace_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:40:4: namespace_decl
            	    {
            	    pushFollow(FOLLOW_namespace_decl_in_eval62);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:43:1: namespace_decl : ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* ) ;
    public final void namespace_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:2: ( ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:4: ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* )
            {
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl76); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl78); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:27: ( class_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:27: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl80);
            	    class_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:39: ( function_decl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==FUNC) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:39: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_namespace_decl83);
            	    function_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:54: ( field_decl )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==FIELD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:54: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace_decl86);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:66: ( initializer )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==INITIALIZER) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:44:66: initializer
            	    {
            	    pushFollow(FOLLOW_initializer_in_namespace_decl89);
            	    initializer();

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
    // $ANTLR end "namespace_decl"


    // $ANTLR start "class_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:47:1: class_decl : ^( CLASS IDENTIFIER ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* ) ;
    public final void class_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:2: ( ^( CLASS IDENTIFIER ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:4: ^( CLASS IDENTIFIER ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* )
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_decl104); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl106); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:23: ( field_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==FIELD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:23: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl108);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:35: ( function_decl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==FUNC) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:35: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_class_decl111);
            	    function_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:50: ( constructor_decl )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CONSTRUCTOR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:50: constructor_decl
            	    {
            	    pushFollow(FOLLOW_constructor_decl_in_class_decl114);
            	    constructor_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:68: ( destructor_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DESTRUCTOR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:48:68: destructor_decl
            	    {
            	    pushFollow(FOLLOW_destructor_decl_in_class_decl117);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:51:1: field_decl : ^( FIELD IDENTIFIER ( assign )? ) ;
    public final void field_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:52:2: ( ^( FIELD IDENTIFIER ( assign )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:52:4: ^( FIELD IDENTIFIER ( assign )? )
            {
            match(input,FIELD,FOLLOW_FIELD_in_field_decl132); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl134); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:52:23: ( assign )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASSGN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:52:23: assign
                    {
                    pushFollow(FOLLOW_assign_in_field_decl136);
                    assign();

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
    // $ANTLR end "field_decl"


    // $ANTLR start "function_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:55:1: function_decl : ^( FUNC IDENTIFIER ( local_var_decl )* ( statement )* ) ;
    public final void function_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:56:2: ( ^( FUNC IDENTIFIER ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:56:4: ^( FUNC IDENTIFIER ( local_var_decl )* ( statement )* )
            {
            match(input,FUNC,FOLLOW_FUNC_in_function_decl151); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_decl153); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:56:22: ( local_var_decl )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LOCAL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:56:22: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_function_decl155);
            	    local_var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:56:38: ( statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==DO) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:56:38: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function_decl158);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "function_decl"


    // $ANTLR start "constructor_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:59:1: constructor_decl : ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) ;
    public final void constructor_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:60:2: ( ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:60:4: ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
            {
            match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl173); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:60:18: ( parameter_list )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==PARAMETER_LIST) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:60:18: parameter_list
                        {
                        pushFollow(FOLLOW_parameter_list_in_constructor_decl175);
                        parameter_list();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:60:34: ( local_var_decl )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==LOCAL) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:60:34: local_var_decl
                	    {
                	    pushFollow(FOLLOW_local_var_decl_in_constructor_decl178);
                	    local_var_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop14;
                    }
                } while (true);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:60:50: ( statement )*
                loop15:
                do {
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==DO) ) {
                        alt15=1;
                    }


                    switch (alt15) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:60:50: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_constructor_decl181);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop15;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:63:1: destructor_decl : ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) ;
    public final void destructor_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:64:2: ( ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:64:4: ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
            {
            match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl196); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:64:17: ( parameter_list )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==PARAMETER_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:64:17: parameter_list
                        {
                        pushFollow(FOLLOW_parameter_list_in_destructor_decl198);
                        parameter_list();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:64:33: ( local_var_decl )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LOCAL) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:64:33: local_var_decl
                	    {
                	    pushFollow(FOLLOW_local_var_decl_in_destructor_decl201);
                	    local_var_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop17;
                    }
                } while (true);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:64:49: ( statement )*
                loop18:
                do {
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DO) ) {
                        alt18=1;
                    }


                    switch (alt18) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:64:49: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_destructor_decl204);
                	    statement();

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
    // $ANTLR end "destructor_decl"


    // $ANTLR start "initializer"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:67:1: initializer : ^( INITIALIZER ( local_var_decl )* ( statement )* ) ;
    public final void initializer() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:68:2: ( ^( INITIALIZER ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:68:4: ^( INITIALIZER ( local_var_decl )* ( statement )* )
            {
            match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer219); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:68:18: ( local_var_decl )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==LOCAL) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:68:18: local_var_decl
                	    {
                	    pushFollow(FOLLOW_local_var_decl_in_initializer221);
                	    local_var_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop19;
                    }
                } while (true);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:68:34: ( statement )*
                loop20:
                do {
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==DO) ) {
                        alt20=1;
                    }


                    switch (alt20) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:68:34: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_initializer224);
                	    statement();

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
    // $ANTLR end "initializer"


    // $ANTLR start "local_var_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:71:1: local_var_decl : ^( LOCAL IDENTIFIER ( assign )? ) ;
    public final void local_var_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:72:2: ( ^( LOCAL IDENTIFIER ( assign )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:72:4: ^( LOCAL IDENTIFIER ( assign )? )
            {
            match(input,LOCAL,FOLLOW_LOCAL_in_local_var_decl239); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var_decl241); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:72:23: ( assign )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ASSGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:72:23: assign
                    {
                    pushFollow(FOLLOW_assign_in_local_var_decl243);
                    assign();

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
    // $ANTLR end "local_var_decl"


    // $ANTLR start "assign"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:75:1: assign : ^( ASSGN expression ) ;
    public final void assign() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:76:2: ( ^( ASSGN expression ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:76:4: ^( ASSGN expression )
            {
            match(input,ASSGN,FOLLOW_ASSGN_in_assign258); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_expression_in_assign260);
                expression();

                state._fsp--;


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
    // $ANTLR end "assign"


    // $ANTLR start "parameter_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:79:1: parameter_list : ^( PARAMETER_LIST parameter ( parameter )* ) ;
    public final void parameter_list() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:80:2: ( ^( PARAMETER_LIST parameter ( parameter )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:80:4: ^( PARAMETER_LIST parameter ( parameter )* )
            {
            match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_parameter_list274); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_parameter_in_parameter_list276);
            parameter();

            state._fsp--;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:80:31: ( parameter )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==PARAMETER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:80:32: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_parameter_list279);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "parameter_list"


    // $ANTLR start "parameter"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:83:1: parameter : ^( PARAMETER type ) ;
    public final void parameter() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:84:2: ( ^( PARAMETER type ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:84:4: ^( PARAMETER type )
            {
            match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter295); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_parameter297);
            type();

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
    // $ANTLR end "parameter"


    // $ANTLR start "statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:87:1: statement : ^( DO expression ) ;
    public final void statement() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:88:2: ( ^( DO expression ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:88:4: ^( DO expression )
            {
            match(input,DO,FOLLOW_DO_in_statement311); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_expression_in_statement313);
                expression();

                state._fsp--;


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
    // $ANTLR end "statement"


    // $ANTLR start "expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:91:1: expression : ;
    public final void expression() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:92:2: ()
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:93:2: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:95:1: type : ( ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER ) | ^( TYPE IDENTIFIER ) );
    public final void type() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:96:2: ( ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER ) | ^( TYPE IDENTIFIER ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==NAMESPACE_TYPE) ) {
                alt23=1;
            }
            else if ( (LA23_0==TYPE) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:96:4: ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER )
                    {
                    match(input,NAMESPACE_TYPE,FOLLOW_NAMESPACE_TYPE_in_type339); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type341); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type343); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:97:4: ^( TYPE IDENTIFIER )
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_type350); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type352); 

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
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_namespace_decl_in_eval62 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_decl78 = new BitSet(new long[]{0x0000000100840008L,0x0000040000000000L});
    public static final BitSet FOLLOW_class_decl_in_namespace_decl80 = new BitSet(new long[]{0x0000000100840008L,0x0000040000000000L});
    public static final BitSet FOLLOW_function_decl_in_namespace_decl83 = new BitSet(new long[]{0x0000000100040008L,0x0000040000000000L});
    public static final BitSet FOLLOW_field_decl_in_namespace_decl86 = new BitSet(new long[]{0x0000000100000008L,0x0000040000000000L});
    public static final BitSet FOLLOW_initializer_in_namespace_decl89 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_CLASS_in_class_decl104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl106 = new BitSet(new long[]{0x00000000001C0008L,0x0000040000000000L});
    public static final BitSet FOLLOW_field_decl_in_class_decl108 = new BitSet(new long[]{0x00000000001C0008L,0x0000040000000000L});
    public static final BitSet FOLLOW_function_decl_in_class_decl111 = new BitSet(new long[]{0x00000000001C0008L});
    public static final BitSet FOLLOW_constructor_decl_in_class_decl114 = new BitSet(new long[]{0x0000000000180008L});
    public static final BitSet FOLLOW_destructor_decl_in_class_decl117 = new BitSet(new long[]{0x0000000000100008L});
    public static final BitSet FOLLOW_FIELD_in_field_decl132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl134 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_assign_in_field_decl136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_in_function_decl151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_decl153 = new BitSet(new long[]{0x0000000000000408L,0x0000080000000000L});
    public static final BitSet FOLLOW_local_var_decl_in_function_decl155 = new BitSet(new long[]{0x0000000000000408L,0x0000080000000000L});
    public static final BitSet FOLLOW_statement_in_function_decl158 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_constructor_decl175 = new BitSet(new long[]{0x0000000000000408L,0x0000080000000000L});
    public static final BitSet FOLLOW_local_var_decl_in_constructor_decl178 = new BitSet(new long[]{0x0000000000000408L,0x0000080000000000L});
    public static final BitSet FOLLOW_statement_in_constructor_decl181 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_destructor_decl198 = new BitSet(new long[]{0x0000000000000408L,0x0000080000000000L});
    public static final BitSet FOLLOW_local_var_decl_in_destructor_decl201 = new BitSet(new long[]{0x0000000000000408L,0x0000080000000000L});
    public static final BitSet FOLLOW_statement_in_destructor_decl204 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_local_var_decl_in_initializer221 = new BitSet(new long[]{0x0000000000000408L,0x0000080000000000L});
    public static final BitSet FOLLOW_statement_in_initializer224 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_LOCAL_in_local_var_decl239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var_decl241 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_assign_in_local_var_decl243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSGN_in_assign258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_assign260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_LIST_in_parameter_list274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_parameter_list276 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list279 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
    public static final BitSet FOLLOW_PARAMETER_in_parameter295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter297 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMESPACE_TYPE_in_type339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type343 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_type350 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type352 = new BitSet(new long[]{0x0000000000000008L});

}