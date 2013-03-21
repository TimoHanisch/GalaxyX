// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g 2013-03-21 19:51:00

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
	import com.galaxyx.semantic.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXSemanticWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ELIF", "WHILE", "FOR", "END", "DO", "BREAK", "CONTINUE", "RETURN", "FALSE", "TRUE", "NULL", "STRUCT", "FUNC", "CONSTRUCTOR", "DESTRUCTOR", "TYPEDEF", "NAMESPACE", "CLASS", "INTERFACE", "IMPLEMENTS", "EXTENDS", "NEW", "DELETE", "THIS", "SUPER", "NAMEOF", "INITIALIZER", "INLINE", "STATIC", "CONST", "PRIVATE", "PUBLIC", "NATIVE", "DEFINE", "UNDEF", "INCLUDE", "PREFIX", "SEMI", "COMMA", "DOT", "COLON", "RETURNS", "PLUS", "SUB", "DIV", "TIMES", "MODULO", "AND", "OR", "XOR", "BIT_NOT", "NOT", "LOR", "LAND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "SHIFTL", "SHIFTR", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "NAMESPACE_ACCESS", "LETTER", "IDENTIFIER", "EscapeSequence", "CHARACTER_LITERAL", "STRING_LITERAL", "DIGIT", "HEX_LITERAL", "INTEGER", "HexDigit", "FIXED_LITERAL", "OctalEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT", "NAMESPACE_TYPE", "TYPE", "VARDEF", "ARRAY", "ARRAY_EXPRESSION", "NEGATION", "FUNCTION_EXPRESSION", "FIELD", "LOCAL", "PARAMETER", "PARAMETER_LIST", "TMP", "MOD", "FIXED"
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
    public static final int ARRAY_EXPRESSION=104;
    public static final int NEGATION=105;
    public static final int FUNCTION_EXPRESSION=106;
    public static final int FIELD=107;
    public static final int LOCAL=108;
    public static final int PARAMETER=109;
    public static final int PARAMETER_LIST=110;
    public static final int TMP=111;
    public static final int MOD=112;
    public static final int FIXED=113;

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


    	
    	private Stack dotStack;

    	private SymbolTable table;
    	private ErrorHandler errHandler; 
    	
    	private Namespace currentNamespace;
    	private Class currentClass;
    	private Method currentMethod;
    	
    	private Namespace namespaceAccess;
    	private Class dotClass;
    	private boolean dotStatic = false;
    	
    	private Error getLogicalError(Token t){
    		return new Error("Logical operators only except boolean expressions",t);
    	}	
    	
    	private Error getRelationError(Token t){
    		return new Error("Relation operators only except same type expressions",t);
    	}
    	
    	private Error getBitOpError(Token t){
    		return new Error("Bit operations only except integer expressions");
    	} 



    // $ANTLR start "eval"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:54:1: eval[SymbolTable table, ErrorHandler errHandler] : ( namespace_decl )* ;
    public final void eval(SymbolTable table, ErrorHandler errHandler) throws RecognitionException {

        	this.table = table;
        	this.errHandler = errHandler;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:59:2: ( ( namespace_decl )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:59:4: ( namespace_decl )*
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:59:4: ( namespace_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:59:4: namespace_decl
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:62:1: namespace_decl : ^( NAMESPACE id= IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* ) ;
    public final void namespace_decl() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:63:2: ( ^( NAMESPACE id= IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:63:4: ^( NAMESPACE id= IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* )
            {
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl76); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl80); 

            		currentNamespace = table.getNamespace((id!=null?id.getText():null));
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:67:3: ( class_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:67:3: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl88);
            	    class_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:67:15: ( function_decl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==FUNC) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:67:15: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_namespace_decl91);
            	    function_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:67:30: ( field_decl )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==FIELD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:67:30: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace_decl94);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:67:42: ( initializer )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==INITIALIZER) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:67:42: initializer
            	    {
            	    pushFollow(FOLLOW_initializer_in_namespace_decl97);
            	    initializer();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            		currentNamespace = null;
            	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:74:1: class_decl : ^( CLASS id= IDENTIFIER ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* ) ;
    public final void class_decl() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:75:2: ( ^( CLASS id= IDENTIFIER ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:75:4: ^( CLASS id= IDENTIFIER ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* )
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_decl119); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl123); 

            		currentClass = currentNamespace.getClass((id!=null?id.getText():null));
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:79:3: ( field_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==FIELD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:79:3: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl131);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:79:15: ( function_decl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==FUNC) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:79:15: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_class_decl134);
            	    function_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:79:30: ( constructor_decl )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CONSTRUCTOR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:79:30: constructor_decl
            	    {
            	    pushFollow(FOLLOW_constructor_decl_in_class_decl137);
            	    constructor_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:79:48: ( destructor_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DESTRUCTOR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:79:48: destructor_decl
            	    {
            	    pushFollow(FOLLOW_destructor_decl_in_class_decl140);
            	    destructor_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            		currentClass = null;
            	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:86:1: field_decl : ^( FIELD IDENTIFIER ( assign )? ) ;
    public final void field_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:87:2: ( ^( FIELD IDENTIFIER ( assign )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:87:4: ^( FIELD IDENTIFIER ( assign )? )
            {
            match(input,FIELD,FOLLOW_FIELD_in_field_decl162); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl164); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:87:23: ( assign )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASSGN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:87:23: assign
                    {
                    pushFollow(FOLLOW_assign_in_field_decl166);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:90:1: function_decl : ^( FUNC id= IDENTIFIER ( local_var_decl )* ( statement )* ) ;
    public final void function_decl() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:91:2: ( ^( FUNC id= IDENTIFIER ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:91:4: ^( FUNC id= IDENTIFIER ( local_var_decl )* ( statement )* )
            {
            match(input,FUNC,FOLLOW_FUNC_in_function_decl181); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_decl185); 

            		currentMethod = currentClass == null? currentNamespace.getMethod((id!=null?id.getText():null)) : currentClass.getMethod((id!=null?id.getText():null));
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:95:3: ( local_var_decl )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LOCAL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:95:3: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_function_decl193);
            	    local_var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:95:19: ( statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RETURN) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:95:19: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function_decl196);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            		currentMethod = null;
            	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:102:1: constructor_decl : ^( CONSTRUCTOR (list= parameter_list )? ( local_var_decl )* ( statement )* ) ;
    public final void constructor_decl() throws RecognitionException {
        List<Type> list = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:103:2: ( ^( CONSTRUCTOR (list= parameter_list )? ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:103:4: ^( CONSTRUCTOR (list= parameter_list )? ( local_var_decl )* ( statement )* )
            {
            match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl217); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:103:22: (list= parameter_list )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==PARAMETER_LIST) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:103:22: list= parameter_list
                        {
                        pushFollow(FOLLOW_parameter_list_in_constructor_decl221);
                        list=parameter_list();

                        state._fsp--;


                        }
                        break;

                }


                		if(!list.isEmpty()){
                			Type[] types = new Type[list.size()];
                			for(int i = 0; i < list.size(); i++){
                				types[i] = list.get(i);
                			}
                			currentMethod = currentClass.getConstructor(types);	
                		}else{
                			currentMethod = currentClass.getConstructor(null);	
                		}
                	
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:115:3: ( local_var_decl )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==LOCAL) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:115:3: local_var_decl
                	    {
                	    pushFollow(FOLLOW_local_var_decl_in_constructor_decl230);
                	    local_var_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop14;
                    }
                } while (true);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:115:19: ( statement )*
                loop15:
                do {
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RETURN) ) {
                        alt15=1;
                    }


                    switch (alt15) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:115:19: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_constructor_decl233);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop15;
                    }
                } while (true);


                		currentMethod = null;
                	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:122:1: destructor_decl : ^( DESTRUCTOR (list= parameter_list )? ( local_var_decl )* ( statement )* ) ;
    public final void destructor_decl() throws RecognitionException {
        List<Type> list = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:123:2: ( ^( DESTRUCTOR (list= parameter_list )? ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:123:4: ^( DESTRUCTOR (list= parameter_list )? ( local_var_decl )* ( statement )* )
            {
            match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl255); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:123:21: (list= parameter_list )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==PARAMETER_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:123:21: list= parameter_list
                        {
                        pushFollow(FOLLOW_parameter_list_in_destructor_decl259);
                        list=parameter_list();

                        state._fsp--;


                        }
                        break;

                }


                		if(list != null){
                			Type[] types = new Type[list.size()];
                			for(int i = 0; i < list.size(); i++){
                				types[i] = list.get(i);
                			}
                			currentMethod = currentClass.getDestructor(types);	
                		}else{
                			currentMethod = currentClass.getDestructor(null);	
                		}
                	
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:135:3: ( local_var_decl )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LOCAL) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:135:3: local_var_decl
                	    {
                	    pushFollow(FOLLOW_local_var_decl_in_destructor_decl268);
                	    local_var_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop17;
                    }
                } while (true);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:135:19: ( statement )*
                loop18:
                do {
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RETURN) ) {
                        alt18=1;
                    }


                    switch (alt18) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:135:19: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_destructor_decl271);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop18;
                    }
                } while (true);


                		currentMethod = null;
                	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:142:1: initializer : ^( INITIALIZER ( local_var_decl )* ( statement )* ) ;
    public final void initializer() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:143:2: ( ^( INITIALIZER ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:143:4: ^( INITIALIZER ( local_var_decl )* ( statement )* )
            {
            match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer292); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:143:18: ( local_var_decl )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==LOCAL) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:143:18: local_var_decl
                	    {
                	    pushFollow(FOLLOW_local_var_decl_in_initializer294);
                	    local_var_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop19;
                    }
                } while (true);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:143:34: ( statement )*
                loop20:
                do {
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RETURN) ) {
                        alt20=1;
                    }


                    switch (alt20) {
                	case 1 :
                	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:143:34: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_initializer297);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:146:1: local_var_decl : ^( LOCAL IDENTIFIER ( assign )? ) ;
    public final void local_var_decl() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:147:2: ( ^( LOCAL IDENTIFIER ( assign )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:147:4: ^( LOCAL IDENTIFIER ( assign )? )
            {
            match(input,LOCAL,FOLLOW_LOCAL_in_local_var_decl312); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var_decl314); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:147:23: ( assign )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ASSGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:147:23: assign
                    {
                    pushFollow(FOLLOW_assign_in_local_var_decl316);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:150:1: assign : ^( ASSGN expression ) ;
    public final void assign() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:151:2: ( ^( ASSGN expression ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:151:4: ^( ASSGN expression )
            {
            match(input,ASSGN,FOLLOW_ASSGN_in_assign331); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_assign333);
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
    // $ANTLR end "assign"


    // $ANTLR start "parameter_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:154:1: parameter_list returns [List<Type> params] : ^( PARAMETER_LIST p= parameter (p2= parameter )* ) ;
    public final List<Type> parameter_list() throws RecognitionException {
        List<Type> params = null;

        Type p = null;

        Type p2 = null;



        	params = new ArrayList<Type>();

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:158:2: ( ^( PARAMETER_LIST p= parameter (p2= parameter )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:158:4: ^( PARAMETER_LIST p= parameter (p2= parameter )* )
            {
            match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_parameter_list355); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_parameter_in_parameter_list359);
            p=parameter();

            state._fsp--;

            params.add(p);
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:159:3: (p2= parameter )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==PARAMETER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:159:4: p2= parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_parameter_list369);
            	    p2=parameter();

            	    state._fsp--;

            	    params.add(p2);

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
        return params;
    }
    // $ANTLR end "parameter_list"


    // $ANTLR start "parameter"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:162:1: parameter returns [Type t] : ^( PARAMETER t1= type ) ;
    public final Type parameter() throws RecognitionException {
        Type t = null;

        Type t1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:163:2: ( ^( PARAMETER t1= type ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:163:4: ^( PARAMETER t1= type )
            {
            match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter391); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_parameter395);
            t1=type();

            state._fsp--;

            t = t1;

            match(input, Token.UP, null); 

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
    // $ANTLR end "parameter"


    // $ANTLR start "statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:166:1: statement : ^(r= RETURN e1= expression ) ;
    public final void statement() throws RecognitionException {
        CommonTree r=null;
        Expr e1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:167:2: ( ^(r= RETURN e1= expression ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:167:4: ^(r= RETURN e1= expression )
            {
            r=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_statement412); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_statement418);
            e1=expression();

            state._fsp--;


            		if(currentMethod.getType() == null){
            			errHandler.reportError(new Error("No return expression allowed here",r.token));
            		}else{
            			if(e1.type != currentMethod.getType()){
            				errHandler.reportError(new Error("Wrong expression type returned",r.token));
            			}
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


    // $ANTLR start "expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:180:1: expression returns [Expr e] : ( ^( LOR a= expression b= expression ) | ^( LAND a= expression b= expression ) | ^(r= EQ a= expression b= expression ) | ^(r= NEQ a= expression b= expression ) | ^(r= LT a= expression b= expression ) | ^(r= LTEQ a= expression b= expression ) | ^(r= GT a= expression b= expression ) | ^(r= GTEQ a= expression b= expression ) | ^(o= SHIFTL a= expression b= expression ) | ^(o= SHIFTR a= expression b= expression ) | ^(o= PLUS a= expression b= expression ) | ^(o= SUB a= expression b= expression ) | ^(o= TIMES a= expression b= expression ) | ^(o= DIV a= expression b= expression ) | ^(o= MOD a= expression b= expression ) | ^(o= NOT a= expression ) | ^( NEGATION a= expression ) | ^(o= BIT_NOT a= expression ) | ^(o= OR a= expression b= expression ) | ^(o= XOR a= expression b= expression ) | ^(o= AND a= expression b= expression ) | ^(o= NEW (ns= namespace_access )? c1= IDENTIFIER (list= expression_list )? ) | ^(o= DELETE a= expression ) | ^( DOT id= IDENTIFIER e1= dot_expression ) | ^( NAMESPACE_ACCESS id= IDENTIFIER expression ) | e1= constant | id= IDENTIFIER | function_expression );
    public final Expr expression() throws RecognitionException {
        Expr e = null;

        CommonTree r=null;
        CommonTree o=null;
        CommonTree c1=null;
        CommonTree id=null;
        CommonTree LOR1=null;
        CommonTree LAND2=null;
        Expr a = null;

        Expr b = null;

        String ns = null;

        List<Expr> list = null;

        Expr e1 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:181:2: ( ^( LOR a= expression b= expression ) | ^( LAND a= expression b= expression ) | ^(r= EQ a= expression b= expression ) | ^(r= NEQ a= expression b= expression ) | ^(r= LT a= expression b= expression ) | ^(r= LTEQ a= expression b= expression ) | ^(r= GT a= expression b= expression ) | ^(r= GTEQ a= expression b= expression ) | ^(o= SHIFTL a= expression b= expression ) | ^(o= SHIFTR a= expression b= expression ) | ^(o= PLUS a= expression b= expression ) | ^(o= SUB a= expression b= expression ) | ^(o= TIMES a= expression b= expression ) | ^(o= DIV a= expression b= expression ) | ^(o= MOD a= expression b= expression ) | ^(o= NOT a= expression ) | ^( NEGATION a= expression ) | ^(o= BIT_NOT a= expression ) | ^(o= OR a= expression b= expression ) | ^(o= XOR a= expression b= expression ) | ^(o= AND a= expression b= expression ) | ^(o= NEW (ns= namespace_access )? c1= IDENTIFIER (list= expression_list )? ) | ^(o= DELETE a= expression ) | ^( DOT id= IDENTIFIER e1= dot_expression ) | ^( NAMESPACE_ACCESS id= IDENTIFIER expression ) | e1= constant | id= IDENTIFIER | function_expression )
            int alt25=28;
            switch ( input.LA(1) ) {
            case LOR:
                {
                alt25=1;
                }
                break;
            case LAND:
                {
                alt25=2;
                }
                break;
            case EQ:
                {
                alt25=3;
                }
                break;
            case NEQ:
                {
                alt25=4;
                }
                break;
            case LT:
                {
                alt25=5;
                }
                break;
            case LTEQ:
                {
                alt25=6;
                }
                break;
            case GT:
                {
                alt25=7;
                }
                break;
            case GTEQ:
                {
                alt25=8;
                }
                break;
            case SHIFTL:
                {
                alt25=9;
                }
                break;
            case SHIFTR:
                {
                alt25=10;
                }
                break;
            case PLUS:
                {
                alt25=11;
                }
                break;
            case SUB:
                {
                alt25=12;
                }
                break;
            case TIMES:
                {
                alt25=13;
                }
                break;
            case DIV:
                {
                alt25=14;
                }
                break;
            case MOD:
                {
                alt25=15;
                }
                break;
            case NOT:
                {
                alt25=16;
                }
                break;
            case NEGATION:
                {
                alt25=17;
                }
                break;
            case BIT_NOT:
                {
                alt25=18;
                }
                break;
            case OR:
                {
                alt25=19;
                }
                break;
            case XOR:
                {
                alt25=20;
                }
                break;
            case AND:
                {
                alt25=21;
                }
                break;
            case NEW:
                {
                alt25=22;
                }
                break;
            case DELETE:
                {
                alt25=23;
                }
                break;
            case DOT:
                {
                alt25=24;
                }
                break;
            case NAMESPACE_ACCESS:
                {
                alt25=25;
                }
                break;
            case FALSE:
            case TRUE:
            case NULL:
            case THIS:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
            case INTEGER:
            case FIXED:
                {
                alt25=26;
                }
                break;
            case IDENTIFIER:
                {
                alt25=27;
                }
                break;
            case FUNCTION_EXPRESSION:
                {
                alt25=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:181:4: ^( LOR a= expression b= expression )
                    {
                    LOR1=(CommonTree)match(input,LOR,FOLLOW_LOR_in_expression442); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression448);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression454);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Or(a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getLogicalError(LOR1.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:191:5: ^( LAND a= expression b= expression )
                    {
                    LAND2=(CommonTree)match(input,LAND,FOLLOW_LAND_in_expression469); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression475);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression481);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new And(a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getLogicalError(LAND2.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:201:5: ^(r= EQ a= expression b= expression )
                    {
                    r=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expression499); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression505);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression511);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Rel((r!=null?r.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getRelationError(r.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:211:5: ^(r= NEQ a= expression b= expression )
                    {
                    r=(CommonTree)match(input,NEQ,FOLLOW_NEQ_in_expression529); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression535);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression541);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Rel((r!=null?r.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getRelationError(r.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:221:5: ^(r= LT a= expression b= expression )
                    {
                    r=(CommonTree)match(input,LT,FOLLOW_LT_in_expression559); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression565);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression571);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Rel((r!=null?r.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getRelationError(r.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:231:5: ^(r= LTEQ a= expression b= expression )
                    {
                    r=(CommonTree)match(input,LTEQ,FOLLOW_LTEQ_in_expression589); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression595);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression601);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Rel((r!=null?r.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getRelationError(r.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:241:4: ^(r= GT a= expression b= expression )
                    {
                    r=(CommonTree)match(input,GT,FOLLOW_GT_in_expression618); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression624);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression630);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Rel((r!=null?r.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getRelationError(r.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:251:5: ^(r= GTEQ a= expression b= expression )
                    {
                    r=(CommonTree)match(input,GTEQ,FOLLOW_GTEQ_in_expression648); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression654);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression660);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Rel((r!=null?r.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getRelationError(r.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:261:5: ^(o= SHIFTL a= expression b= expression )
                    {
                    o=(CommonTree)match(input,SHIFTL,FOLLOW_SHIFTL_in_expression678); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression684);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression690);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new BitArith((o!=null?o.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getBitOpError(o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:271:5: ^(o= SHIFTR a= expression b= expression )
                    {
                    o=(CommonTree)match(input,SHIFTR,FOLLOW_SHIFTR_in_expression708); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression714);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression720);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new BitArith((o!=null?o.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getBitOpError(o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:281:5: ^(o= PLUS a= expression b= expression )
                    {
                    o=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression738); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression744);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression750);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Plus((o!=null?o.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(new Error("Plus operator can only be used for numerical and string expressions",o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:291:5: ^(o= SUB a= expression b= expression )
                    {
                    o=(CommonTree)match(input,SUB,FOLLOW_SUB_in_expression768); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression774);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression780);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Arith((o!=null?o.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(new Error("Substraction operator can only be used for numerical expressions",o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:301:5: ^(o= TIMES a= expression b= expression )
                    {
                    o=(CommonTree)match(input,TIMES,FOLLOW_TIMES_in_expression798); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression804);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression810);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Arith((o!=null?o.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(new Error("Times operator can only be used for numerical expressions",o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:311:5: ^(o= DIV a= expression b= expression )
                    {
                    o=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expression828); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression834);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression840);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Arith((o!=null?o.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(new Error("Division operator can only be used for numerical expressions",o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:321:5: ^(o= MOD a= expression b= expression )
                    {
                    o=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expression858); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression864);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression870);
                    b=expression();

                    state._fsp--;


                    		if(a != null && b != null){
                    			e = new Arith((o!=null?o.getText():null),a,b);
                    			if(e.type == null){
                    				errHandler.reportError(new Error("Modulo operator can only be used for numerical expressions",o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:331:5: ^(o= NOT a= expression )
                    {
                    o=(CommonTree)match(input,NOT,FOLLOW_NOT_in_expression888); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression894);
                    a=expression();

                    state._fsp--;


                    		if(a != null){
                    			e = new Not(a);
                    			if(e.type == null){
                    				errHandler.reportError(new Error("Not can only be applied to boolean expressions",o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:341:5: ^( NEGATION a= expression )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expression909); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression915);
                    a=expression();

                    state._fsp--;


                    		if(a != null){
                    			e = new Unary("-",a);
                    			if(e.type == null){
                    				errHandler.reportError(new Error("Negation can only be applied to numerical expressions",o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:351:5: ^(o= BIT_NOT a= expression )
                    {
                    o=(CommonTree)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_expression933); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression939);
                    a=expression();

                    state._fsp--;


                    		if(a != null){
                    			e = new BitNot("~",a);
                    			if(e.type == null){
                    				errHandler.reportError(getBitOpError(o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:361:4: ^(o= OR a= expression b= expression )
                    {
                    o=(CommonTree)match(input,OR,FOLLOW_OR_in_expression960); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression966);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression972);
                    b=expression();

                    state._fsp--;


                    		if(a != null){
                    			e = new BitArith("|",a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getBitOpError(o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:371:4: ^(o= XOR a= expression b= expression )
                    {
                    o=(CommonTree)match(input,XOR,FOLLOW_XOR_in_expression990); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression996);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1002);
                    b=expression();

                    state._fsp--;


                    		if(a != null){
                    			e = new BitArith("|",a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getBitOpError(o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 21 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:381:4: ^(o= AND a= expression b= expression )
                    {
                    o=(CommonTree)match(input,AND,FOLLOW_AND_in_expression1020); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1026);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1032);
                    b=expression();

                    state._fsp--;


                    		if(a != null){
                    			e = new BitArith("|",a,b);
                    			if(e.type == null){
                    				errHandler.reportError(getBitOpError(o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 22 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:391:4: ^(o= NEW (ns= namespace_access )? c1= IDENTIFIER (list= expression_list )? )
                    {
                    o=(CommonTree)match(input,NEW,FOLLOW_NEW_in_expression1050); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:391:16: (ns= namespace_access )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NAMESPACE_ACCESS) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:391:16: ns= namespace_access
                            {
                            pushFollow(FOLLOW_namespace_access_in_expression1054);
                            ns=namespace_access();

                            state._fsp--;


                            }
                            break;

                    }

                    c1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1059); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:391:54: (list= expression_list )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=FALSE && LA24_0<=NULL)||(LA24_0>=NEW && LA24_0<=THIS)||LA24_0==DOT||(LA24_0>=PLUS && LA24_0<=TIMES)||(LA24_0>=AND && LA24_0<=SHIFTR)||LA24_0==NAMESPACE_ACCESS||LA24_0==IDENTIFIER||(LA24_0>=CHARACTER_LITERAL && LA24_0<=STRING_LITERAL)||LA24_0==INTEGER||(LA24_0>=NEGATION && LA24_0<=FUNCTION_EXPRESSION)||(LA24_0>=MOD && LA24_0<=FIXED)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:391:54: list= expression_list
                            {
                            pushFollow(FOLLOW_expression_list_in_expression1065);
                            list=expression_list();

                            state._fsp--;


                            }
                            break;

                    }


                    		if(ns == null){
                    			Class constrClass = currentNamespace.getClass((c1!=null?c1.getText():null));
                    			if(constrClass != null){
                    				Constructor constr;
                    				if(a != null){
                    					Type[] types = new Type[list.size()];
                    					for(int i = 0; i < list.size(); i++){
                    						types[i] = list.get(i).type;
                    					}
                    					constr = constrClass.getConstructor(types);	
                    				}else{
                    					constr = constrClass.getConstructor(null);
                    				}
                    				if(constr == null){
                    					errHandler.reportError(new Error("Constructor does not exist for class $2",o.token,c1.token));
                    				}else{
                    					e = new ClassExpr("new",Type.getType(currentNamespace+"_"+constrClass));
                    				}
                    			}else{
                    				errHandler.reportError(new Error("Class $1 does not exist within namespace "+currentNamespace,c1.token));
                    			}
                    		}else{
                    			Namespace namespace = table.getNamespace(ns);
                    			if(namespace != null){
                    				Class constrClass = namespace.getClass((c1!=null?c1.getText():null));
                    				if(constrClass != null){
                    					Constructor constr;
                    					if(a != null){
                    						Type[] types = new Type[list.size()];
                    						for(int i = 0; i < list.size(); i++){
                    							types[i] = list.get(i).type;
                    						}
                    						constr = constrClass.getConstructor(types);	
                    					}else{
                    						constr = constrClass.getConstructor(null);
                    					}
                    					if(constr == null){
                    						errHandler.reportError(new Error("Constructor does not exist for class $2",o.token,c1.token));
                    					}else{
                    						e = new ClassExpr("new",Type.getType(namespace+"_"+constrClass));
                    					}
                    				}else{
                    					errHandler.reportError(new Error("Class $1 does not exist within namespace "+namespace,c1.token));
                    				}
                    			}else{
                    				errHandler.reportError(new Error("Namespace"+ns+"does not exist",o.token));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 23 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:443:4: ^(o= DELETE a= expression )
                    {
                    o=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_expression1083); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1089);
                    a=expression();

                    state._fsp--;



                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 24 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:448:4: ^( DOT id= IDENTIFIER e1= dot_expression )
                    {
                    match(input,DOT,FOLLOW_DOT_in_expression1102); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1106); 
                    pushFollow(FOLLOW_dot_expression_in_expression1112);
                    e1=dot_expression();

                    state._fsp--;

                    e = e1;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 25 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:449:4: ^( NAMESPACE_ACCESS id= IDENTIFIER expression )
                    {
                    match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_expression1121); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1125); 
                    pushFollow(FOLLOW_expression_in_expression1127);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 26 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:450:4: e1= constant
                    {
                    pushFollow(FOLLOW_constant_in_expression1137);
                    e1=constant();

                    state._fsp--;

                    e = e1;

                    }
                    break;
                case 27 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:451:4: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1146); 

                    		boolean found = true;
                    		if(currentMethod == null){
                    			if(currentClass == null){
                    				if(currentNamespace.getField((id!=null?id.getText():null)) == null){
                    					found = false;
                    				}else{
                    					e = new Constant((id!=null?id.getText():null),currentNamespace.getField((id!=null?id.getText():null)).getType());
                    				}
                    			}else{
                    				if(currentClass.getField((id!=null?id.getText():null)) == null){
                    					if(currentNamespace.getField((id!=null?id.getText():null)) == null){
                    						found = false;
                    					}else{
                    						e = new Constant((id!=null?id.getText():null),currentNamespace.getField((id!=null?id.getText():null)).getType());
                    					}
                    				}else{
                    					e = new Constant((id!=null?id.getText():null),currentClass.getField((id!=null?id.getText():null)).getType());
                    				}
                    			}
                    		}else{
                    			if(currentMethod.getLocal((id!=null?id.getText():null)) == null){
                    				if(currentClass.getField((id!=null?id.getText():null)) == null){
                    					if(currentNamespace.getField((id!=null?id.getText():null)) == null){
                    						found = false;
                    					}else{
                    						e = new Constant((id!=null?id.getText():null),currentNamespace.getField((id!=null?id.getText():null)).getType());
                    					}
                    				}else{
                    					e = new Constant((id!=null?id.getText():null),currentClass.getField((id!=null?id.getText():null)).getType());
                    				}
                    			}else{
                    				e = new Constant((id!=null?id.getText():null),currentMethod.getLocal((id!=null?id.getText():null)).getType());
                    			}
                    		}
                    		if(!found){
                    			errHandler.reportError(new Error("Could not find variable $1",id.token));
                    		}
                    	

                    }
                    break;
                case 28 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:491:4: function_expression
                    {
                    pushFollow(FOLLOW_function_expression_in_expression1154);
                    function_expression();

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
        return e;
    }
    // $ANTLR end "expression"


    // $ANTLR start "dot_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:494:1: dot_expression returns [Expr e] : ( ^( DOT IDENTIFIER dot_expression ) | IDENTIFIER | ^( ARRAY_EXPRESSION IDENTIFIER ( expression )+ ) | function_expression );
    public final Expr dot_expression() throws RecognitionException {
        Expr e = null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:495:2: ( ^( DOT IDENTIFIER dot_expression ) | IDENTIFIER | ^( ARRAY_EXPRESSION IDENTIFIER ( expression )+ ) | function_expression )
            int alt27=4;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt27=1;
                }
                break;
            case IDENTIFIER:
                {
                alt27=2;
                }
                break;
            case ARRAY_EXPRESSION:
                {
                alt27=3;
                }
                break;
            case FUNCTION_EXPRESSION:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:495:4: ^( DOT IDENTIFIER dot_expression )
                    {
                    match(input,DOT,FOLLOW_DOT_in_dot_expression1171); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dot_expression1173); 
                    pushFollow(FOLLOW_dot_expression_in_dot_expression1175);
                    dot_expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:496:4: IDENTIFIER
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dot_expression1181); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:497:4: ^( ARRAY_EXPRESSION IDENTIFIER ( expression )+ )
                    {
                    match(input,ARRAY_EXPRESSION,FOLLOW_ARRAY_EXPRESSION_in_dot_expression1187); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dot_expression1189); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:497:34: ( expression )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=FALSE && LA26_0<=NULL)||(LA26_0>=NEW && LA26_0<=THIS)||LA26_0==DOT||(LA26_0>=PLUS && LA26_0<=TIMES)||(LA26_0>=AND && LA26_0<=SHIFTR)||LA26_0==NAMESPACE_ACCESS||LA26_0==IDENTIFIER||(LA26_0>=CHARACTER_LITERAL && LA26_0<=STRING_LITERAL)||LA26_0==INTEGER||(LA26_0>=NEGATION && LA26_0<=FUNCTION_EXPRESSION)||(LA26_0>=MOD && LA26_0<=FIXED)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:497:34: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_dot_expression1191);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:498:4: function_expression
                    {
                    pushFollow(FOLLOW_function_expression_in_dot_expression1198);
                    function_expression();

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
        return e;
    }
    // $ANTLR end "dot_expression"


    // $ANTLR start "constant"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:501:1: constant returns [Expr e] : (c= INTEGER | c= FIXED | c= STRING_LITERAL | c= CHARACTER_LITERAL | TRUE | FALSE | NULL | THIS );
    public final Expr constant() throws RecognitionException {
        Expr e = null;

        CommonTree c=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:502:2: (c= INTEGER | c= FIXED | c= STRING_LITERAL | c= CHARACTER_LITERAL | TRUE | FALSE | NULL | THIS )
            int alt28=8;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt28=1;
                }
                break;
            case FIXED:
                {
                alt28=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt28=3;
                }
                break;
            case CHARACTER_LITERAL:
                {
                alt28=4;
                }
                break;
            case TRUE:
                {
                alt28=5;
                }
                break;
            case FALSE:
                {
                alt28=6;
                }
                break;
            case NULL:
                {
                alt28=7;
                }
                break;
            case THIS:
                {
                alt28=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:502:4: c= INTEGER
                    {
                    c=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_constant1217); 
                    e = new Constant((c!=null?c.getText():null),Type.Integer);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:503:5: c= FIXED
                    {
                    c=(CommonTree)match(input,FIXED,FOLLOW_FIXED_in_constant1229); 
                    e = new Constant((c!=null?c.getText():null),Type.Fixed);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:504:5: c= STRING_LITERAL
                    {
                    c=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant1241); 
                    e = new Constant((c!=null?c.getText():null),Type.String);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:505:5: c= CHARACTER_LITERAL
                    {
                    c=(CommonTree)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_constant1253); 
                    e = new Constant((c!=null?c.getText():null),Type.Char);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:506:5: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_constant1261); 
                    e = Constant.True;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:507:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_constant1269); 
                    e = Constant.False;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:508:5: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_constant1277); 
                    e = Constant.Null;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:509:4: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_constant1284); 
                    e = Constant.This;

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
    // $ANTLR end "constant"


    // $ANTLR start "function_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:512:1: function_expression returns [Expr e] : ^( FUNCTION_EXPRESSION IDENTIFIER ( expression_list )? ) ;
    public final Expr function_expression() throws RecognitionException {
        Expr e = null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:513:2: ( ^( FUNCTION_EXPRESSION IDENTIFIER ( expression_list )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:513:4: ^( FUNCTION_EXPRESSION IDENTIFIER ( expression_list )? )
            {
            match(input,FUNCTION_EXPRESSION,FOLLOW_FUNCTION_EXPRESSION_in_function_expression1303); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_expression1305); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:513:37: ( expression_list )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=FALSE && LA29_0<=NULL)||(LA29_0>=NEW && LA29_0<=THIS)||LA29_0==DOT||(LA29_0>=PLUS && LA29_0<=TIMES)||(LA29_0>=AND && LA29_0<=SHIFTR)||LA29_0==NAMESPACE_ACCESS||LA29_0==IDENTIFIER||(LA29_0>=CHARACTER_LITERAL && LA29_0<=STRING_LITERAL)||LA29_0==INTEGER||(LA29_0>=NEGATION && LA29_0<=FUNCTION_EXPRESSION)||(LA29_0>=MOD && LA29_0<=FIXED)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:513:37: expression_list
                    {
                    pushFollow(FOLLOW_expression_list_in_function_expression1307);
                    expression_list();

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
        return e;
    }
    // $ANTLR end "function_expression"


    // $ANTLR start "expression_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:516:1: expression_list returns [List<Expr> e] : (e1= expression )+ ;
    public final List<Expr> expression_list() throws RecognitionException {
        List<Expr> e = null;

        Expr e1 = null;



        	e = new ArrayList<Expr>();

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:520:2: ( (e1= expression )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:520:4: (e1= expression )+
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:520:4: (e1= expression )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=FALSE && LA30_0<=NULL)||(LA30_0>=NEW && LA30_0<=THIS)||LA30_0==DOT||(LA30_0>=PLUS && LA30_0<=TIMES)||(LA30_0>=AND && LA30_0<=SHIFTR)||LA30_0==NAMESPACE_ACCESS||LA30_0==IDENTIFIER||(LA30_0>=CHARACTER_LITERAL && LA30_0<=STRING_LITERAL)||LA30_0==INTEGER||(LA30_0>=NEGATION && LA30_0<=FUNCTION_EXPRESSION)||(LA30_0>=MOD && LA30_0<=FIXED)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:520:5: e1= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expression_list1333);
            	    e1=expression();

            	    state._fsp--;

            	    e.add(e1);

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


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
    // $ANTLR end "expression_list"


    // $ANTLR start "namespace_access"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:523:1: namespace_access returns [String s] : ^( NAMESPACE_ACCESS id= IDENTIFIER ) ;
    public final String namespace_access() throws RecognitionException {
        String s = null;

        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:524:2: ( ^( NAMESPACE_ACCESS id= IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:524:4: ^( NAMESPACE_ACCESS id= IDENTIFIER )
            {
            match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_namespace_access1353); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_access1357); 
            s = (id!=null?id.getText():null);

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "namespace_access"


    // $ANTLR start "type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:527:1: type returns [Type t] : ( ^( NAMESPACE_TYPE ns= IDENTIFIER id= IDENTIFIER ) | ^( TYPE id= IDENTIFIER ) );
    public final Type type() throws RecognitionException {
        Type t = null;

        CommonTree ns=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:528:2: ( ^( NAMESPACE_TYPE ns= IDENTIFIER id= IDENTIFIER ) | ^( TYPE id= IDENTIFIER ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==NAMESPACE_TYPE) ) {
                alt31=1;
            }
            else if ( (LA31_0==TYPE) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:528:4: ^( NAMESPACE_TYPE ns= IDENTIFIER id= IDENTIFIER )
                    {
                    match(input,NAMESPACE_TYPE,FOLLOW_NAMESPACE_TYPE_in_type1376); 

                    match(input, Token.DOWN, null); 
                    ns=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type1380); 
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type1384); 
                    t = Type.getType((ns!=null?ns.getText():null)+"_"+(id!=null?id.getText():null));

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXSemanticWalker.g:529:4: ^( TYPE id= IDENTIFIER )
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_type1392); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type1396); 

                    		t = Type.getType((id!=null?id.getText():null));
                    		if(t == null){
                    			t = Type.getType(currentNamespace+"_"+(id!=null?id.getText():null));
                    		}
                    	

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


 

    public static final BitSet FOLLOW_namespace_decl_in_eval62 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_decl80 = new BitSet(new long[]{0x0000000100840008L,0x0000080000000000L});
    public static final BitSet FOLLOW_class_decl_in_namespace_decl88 = new BitSet(new long[]{0x0000000100840008L,0x0000080000000000L});
    public static final BitSet FOLLOW_function_decl_in_namespace_decl91 = new BitSet(new long[]{0x0000000100040008L,0x0000080000000000L});
    public static final BitSet FOLLOW_field_decl_in_namespace_decl94 = new BitSet(new long[]{0x0000000100000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_initializer_in_namespace_decl97 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_CLASS_in_class_decl119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl123 = new BitSet(new long[]{0x00000000001C0008L,0x0000080000000000L});
    public static final BitSet FOLLOW_field_decl_in_class_decl131 = new BitSet(new long[]{0x00000000001C0008L,0x0000080000000000L});
    public static final BitSet FOLLOW_function_decl_in_class_decl134 = new BitSet(new long[]{0x00000000001C0008L});
    public static final BitSet FOLLOW_constructor_decl_in_class_decl137 = new BitSet(new long[]{0x0000000000180008L});
    public static final BitSet FOLLOW_destructor_decl_in_class_decl140 = new BitSet(new long[]{0x0000000000100008L});
    public static final BitSet FOLLOW_FIELD_in_field_decl162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl164 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_assign_in_field_decl166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_in_function_decl181 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_decl185 = new BitSet(new long[]{0x0000000000002008L,0x0000100000000000L});
    public static final BitSet FOLLOW_local_var_decl_in_function_decl193 = new BitSet(new long[]{0x0000000000002008L,0x0000100000000000L});
    public static final BitSet FOLLOW_statement_in_function_decl196 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_constructor_decl221 = new BitSet(new long[]{0x0000000000002008L,0x0000100000000000L});
    public static final BitSet FOLLOW_local_var_decl_in_constructor_decl230 = new BitSet(new long[]{0x0000000000002008L,0x0000100000000000L});
    public static final BitSet FOLLOW_statement_in_constructor_decl233 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_destructor_decl259 = new BitSet(new long[]{0x0000000000002008L,0x0000100000000000L});
    public static final BitSet FOLLOW_local_var_decl_in_destructor_decl268 = new BitSet(new long[]{0x0000000000002008L,0x0000100000000000L});
    public static final BitSet FOLLOW_statement_in_destructor_decl271 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_local_var_decl_in_initializer294 = new BitSet(new long[]{0x0000000000002008L,0x0000100000000000L});
    public static final BitSet FOLLOW_statement_in_initializer297 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_LOCAL_in_local_var_decl312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var_decl314 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_assign_in_local_var_decl316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSGN_in_assign331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_assign333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_LIST_in_parameter_list355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_parameter_list359 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list369 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L});
    public static final BitSet FOLLOW_PARAMETER_in_parameter391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOR_in_expression442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression448 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAND_in_expression469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression475 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_expression499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression505 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_expression529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression535 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression565 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEQ_in_expression589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression595 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expression618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression624 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEQ_in_expression648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression654 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTL_in_expression678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression684 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTR_in_expression708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression714 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression744 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUB_in_expression768 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression774 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_expression798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression804 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression810 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expression828 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression834 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expression858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression864 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expression909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression915 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_NOT_in_expression933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expression960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression966 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expression990 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression996 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression1002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression1020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1026 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression1032 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_expression1050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_namespace_access_in_expression1054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1059 = new BitSet(new long[]{0xFFEF20003801C008L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_list_in_expression1065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_expression1083 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1089 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_expression1102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1106 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003070026A0000FL});
    public static final BitSet FOLLOW_dot_expression_in_expression1112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_expression1121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1125 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_expression1127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_expression1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expression1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_expression_in_expression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dot_expression1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dot_expression1173 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003070026A0000FL});
    public static final BitSet FOLLOW_dot_expression_in_dot_expression1175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dot_expression1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_EXPRESSION_in_dot_expression1187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dot_expression1189 = new BitSet(new long[]{0xFFEF20003801C000L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_in_dot_expression1191 = new BitSet(new long[]{0xFFEF20003801C008L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_function_expression_in_dot_expression1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_in_constant1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_constant1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_constant1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_constant1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_constant1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_constant1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_EXPRESSION_in_function_expression1303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_expression1305 = new BitSet(new long[]{0xFFEF20003801C008L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_expression_list_in_function_expression1307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression_list1333 = new BitSet(new long[]{0xFFEF20003801C002L,0x0003060026A0000FL});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_namespace_access1353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_access1357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMESPACE_TYPE_in_type1376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type1384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_type1392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type1396 = new BitSet(new long[]{0x0000000000000008L});

}