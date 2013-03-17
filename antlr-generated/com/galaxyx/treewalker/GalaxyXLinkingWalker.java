// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g 2013-03-17 20:55:15

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

public class GalaxyXLinkingWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ELIF", "WHILE", "FOR", "END", "DO", "BREAK", "CONTINUE", "RETURN", "FALSE", "TRUE", "NULL", "STRUCT", "FUNC", "CONSTRUCTOR", "DESTRUCTOR", "TYPEDEF", "NAMESPACE", "CLASS", "INTERFACE", "IMPLEMENTS", "EXTENDS", "NEW", "DELETE", "THIS", "SUPER", "NAMEOF", "INITIALIZER", "INLINE", "STATIC", "CONST", "PRIVATE", "PUBLIC", "NATIVE", "DEFINE", "UNDEF", "INCLUDE", "PREFIX", "SEMI", "COMMA", "DOT", "COLON", "RETURNS", "PLUS", "SUB", "DIV", "TIMES", "MODULO", "AND", "OR", "XOR", "BIT_NOT", "NOT", "LOR", "LAND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "SHIFTL", "SHIFTR", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "NAMESPACE_ACCESS", "LETTER", "IDENTIFIER", "EscapeSequence", "CHARACTER_LITERAL", "STRING_LITERAL", "DIGIT", "HEX_LITERAL", "INTEGER", "HexDigit", "FIXED_LITERAL", "OctalEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT", "NAMESPACE_TYPE", "TYPE", "VARDEF", "ARRAY", "NEGATION", "FUNCTION_EXPRESSION", "FIELD", "LOCAL", "PARAMETER", "PARAMETER_LIST", "TMP"
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
    public static final int TMP=110;

    // delegates
    // delegators


        public GalaxyXLinkingWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXLinkingWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GalaxyXLinkingWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g"; }


    	private SymbolTable table;
    	private ErrorHandler errHandler; 
    	
    	private Namespace currentNamespace;
    	private Class currentClass;
    	private Method currentMethod;



    // $ANTLR start "eval"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:35:1: eval[SymbolTable table, ErrorHandler errHandler] : ( namespace_decl )* ;
    public final void eval(SymbolTable table, ErrorHandler errHandler) throws RecognitionException {

        	this.table = table;
        	this.errHandler = errHandler;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:40:2: ( ( namespace_decl )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:40:4: ( namespace_decl )*
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:40:4: ( namespace_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:40:4: namespace_decl
            	    {
            	    pushFollow(FOLLOW_namespace_decl_in_eval66);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:44:1: namespace_decl : ^( NAMESPACE id= IDENTIFIER ( class_decl )* ( method_decl )* ( field_decl )* ) ;
    public final void namespace_decl() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:45:2: ( ^( NAMESPACE id= IDENTIFIER ( class_decl )* ( method_decl )* ( field_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:45:4: ^( NAMESPACE id= IDENTIFIER ( class_decl )* ( method_decl )* ( field_decl )* )
            {
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl84); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl88); 

            		currentNamespace = table.getNamespace((id!=null?id.getText():null));
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:49:3: ( class_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:49:3: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl96);
            	    class_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:49:15: ( method_decl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==FUNC) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:49:15: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_namespace_decl99);
            	    method_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:49:28: ( field_decl )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==FIELD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:49:28: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace_decl102);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); 

            		currentNamespace = null;
            	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:55:1: class_decl : ^( CLASS id= IDENTIFIER ( field_decl )* ( method_decl )* ( constructor_decl )* ( destructor_decl )* ) ;
    public final void class_decl() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:56:2: ( ^( CLASS id= IDENTIFIER ( field_decl )* ( method_decl )* ( constructor_decl )* ( destructor_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:56:4: ^( CLASS id= IDENTIFIER ( field_decl )* ( method_decl )* ( constructor_decl )* ( destructor_decl )* )
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_decl120); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl124); 

            		currentClass = currentNamespace.getClass((id!=null?id.getText():null));
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:60:3: ( field_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==FIELD) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:60:3: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl132);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:60:15: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==FUNC) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:60:15: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_decl135);
            	    method_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:60:28: ( constructor_decl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CONSTRUCTOR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:60:28: constructor_decl
            	    {
            	    pushFollow(FOLLOW_constructor_decl_in_class_decl138);
            	    constructor_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:60:46: ( destructor_decl )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DESTRUCTOR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:60:46: destructor_decl
            	    {
            	    pushFollow(FOLLOW_destructor_decl_in_class_decl141);
            	    destructor_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input, Token.UP, null); 

            		currentClass = null;
            	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:66:1: field_decl : ^( FIELD (m= modifier )? (s= STATIC )? (c= CONST )? t= type ( array )* id= IDENTIFIER ) ;
    public final void field_decl() throws RecognitionException {
        CommonTree s=null;
        CommonTree c=null;
        CommonTree id=null;
        SightModifier m = null;

        Type t = null;



        	int arrayCount = -1;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:2: ( ^( FIELD (m= modifier )? (s= STATIC )? (c= CONST )? t= type ( array )* id= IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:4: ^( FIELD (m= modifier )? (s= STATIC )? (c= CONST )? t= type ( array )* id= IDENTIFIER )
            {
            match(input,FIELD,FOLLOW_FIELD_in_field_decl163); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:13: (m= modifier )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=PRIVATE && LA9_0<=PUBLIC)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:13: m= modifier
                    {
                    pushFollow(FOLLOW_modifier_in_field_decl167);
                    m=modifier();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:25: (s= STATIC )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==STATIC) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:25: s= STATIC
                    {
                    s=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_field_decl172); 

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:35: (c= CONST )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CONST) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:35: c= CONST
                    {
                    c=(CommonTree)match(input,CONST,FOLLOW_CONST_in_field_decl177); 

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_field_decl182);
            t=type();

            state._fsp--;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:50: ( array )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ARRAY) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:70:51: array
            	    {
            	    pushFollow(FOLLOW_array_in_field_decl185);
            	    array();

            	    state._fsp--;

            	    arrayCount++;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl193); 

            		Field f = new Field((id!=null?id.getText():null),m != null?m:SightModifier.NAMESPACE,s != null, c != null, arrayCount != -1,arrayCount,t);
            		if(currentClass == null){
            			if(s == null){
            				errHandler.reportError(new Error("Field $1 has to be static",id.token));
            			}else{
            				if(!currentNamespace.addField(f)){
            					errHandler.reportError(new Error("Field $1 already exists within namespace "+currentNamespace,id.token));
            				}
            			}
            		}else{
            			if(!currentClass.addField(f)){
            				errHandler.reportError(new Error("Field $1 already exists within class "+currentClass,id.token));
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
    // $ANTLR end "field_decl"


    // $ANTLR start "method_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:90:1: method_decl : ^( FUNC t= type (m= modifier )? (s= STATIC )? id= IDENTIFIER (p= parameter_list )? (l= local_decl )* ) ;
    public final void method_decl() throws RecognitionException {
        CommonTree s=null;
        CommonTree id=null;
        Type t = null;

        SightModifier m = null;

        List<Local> p = null;

        Local l = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:91:2: ( ^( FUNC t= type (m= modifier )? (s= STATIC )? id= IDENTIFIER (p= parameter_list )? (l= local_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:91:4: ^( FUNC t= type (m= modifier )? (s= STATIC )? id= IDENTIFIER (p= parameter_list )? (l= local_decl )* )
            {
            match(input,FUNC,FOLLOW_FUNC_in_method_decl213); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_method_decl217);
            t=type();

            state._fsp--;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:91:19: (m= modifier )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=PRIVATE && LA13_0<=PUBLIC)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:91:19: m= modifier
                    {
                    pushFollow(FOLLOW_modifier_in_method_decl221);
                    m=modifier();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:91:31: (s= STATIC )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==STATIC) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:91:31: s= STATIC
                    {
                    s=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_method_decl226); 

                    }
                    break;

            }

            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_method_decl231); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:91:55: (p= parameter_list )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==PARAMETER_LIST) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:91:55: p= parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_method_decl235);
                    p=parameter_list();

                    state._fsp--;


                    }
                    break;

            }


            		Method method = new Method((id!=null?id.getText():null),m != null?m:SightModifier.NAMESPACE,s != null,t);
            		if(currentClass == null){
            			if(s == null){
            				errHandler.reportError(new Error("Method $1 has to be static",id.token));
            			}else{
            				if(!currentNamespace.addMethod(method)){
            					errHandler.reportError(new Error("Method $1 already exists within namespace "+currentNamespace,id.token));
            				}
            			}
            		}else{
            			if(!currentClass.addMethod(method)){
            				errHandler.reportError(new Error("Method $1 already exists within class "+currentClass,id.token));
            			}
            		}
            		currentMethod = method;
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:109:3: (l= local_decl )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LOCAL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:109:4: l= local_decl
            	    {
            	    pushFollow(FOLLOW_local_decl_in_method_decl247);
            	    l=local_decl();

            	    state._fsp--;


            	    		if(!currentMethod.addLocal(l)){
            	    			errHandler.reportError(new Error("Local variable "+l+" already defined for method §1", id.token));
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "method_decl"


    // $ANTLR start "constructor_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:122:1: constructor_decl : ^(c= CONSTRUCTOR TMP (p= parameter_list )? (l= local_decl )* ) ;
    public final void constructor_decl() throws RecognitionException {
        CommonTree c=null;
        List<Local> p = null;

        Local l = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:123:2: ( ^(c= CONSTRUCTOR TMP (p= parameter_list )? (l= local_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:123:4: ^(c= CONSTRUCTOR TMP (p= parameter_list )? (l= local_decl )* )
            {
            c=(CommonTree)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl277); 

            match(input, Token.DOWN, null); 
            match(input,TMP,FOLLOW_TMP_in_constructor_decl279); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:123:25: (p= parameter_list )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==PARAMETER_LIST) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:123:25: p= parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_constructor_decl283);
                    p=parameter_list();

                    state._fsp--;


                    }
                    break;

            }


            		Local[] params = (p == null || p.isEmpty()? null : p.toArray(new Local[p.size()]));
            		Method.Constructor constr = new Method.Constructor(params);
            		if(params != null){
            			for(Local para : params){
            				if(!constr.addLocal(para)){
            					errHandler.reportError(new Error("Parameter "+para+" already defined for constructor"));
            				}
            			}
            		}
            		if(!currentClass.addConstructor(constr)){
            			errHandler.reportError(new Error("Constructor with same parameters already defined for class"+currentClass,c.token));
            		}
            		currentMethod = constr;
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:139:3: (l= local_decl )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LOCAL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:139:4: l= local_decl
            	    {
            	    pushFollow(FOLLOW_local_decl_in_constructor_decl295);
            	    l=local_decl();

            	    state._fsp--;


            	    		if(!currentMethod.addLocal(l)){
            	    			errHandler.reportError(new Error("Local variable "+l+" already defined for constructor"));
            	    		}
            	    	

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:152:1: destructor_decl : ^(d= DESTRUCTOR TMP (p= parameter_list )? (l= local_decl )* ) ;
    public final void destructor_decl() throws RecognitionException {
        CommonTree d=null;
        List<Local> p = null;

        Local l = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:153:2: ( ^(d= DESTRUCTOR TMP (p= parameter_list )? (l= local_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:153:4: ^(d= DESTRUCTOR TMP (p= parameter_list )? (l= local_decl )* )
            {
            d=(CommonTree)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl326); 

            match(input, Token.DOWN, null); 
            match(input,TMP,FOLLOW_TMP_in_destructor_decl328); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:153:24: (p= parameter_list )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==PARAMETER_LIST) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:153:24: p= parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_destructor_decl332);
                    p=parameter_list();

                    state._fsp--;


                    }
                    break;

            }


            		Local[] params = (p == null? null : new Local[p.size()]);
            		Method.Destructor destr = new Method.Destructor(params);
            		if(params != null){
            			for(Local para : params){
            				if(!destr.addLocal(para)){
            					errHandler.reportError(new Error("Parameter "+para+" already defined for destructor"));
            				}
            			}
            		}
            		if(!currentClass.addDestructor(destr)){
            			errHandler.reportError(new Error("Destructor with same parameters already defined for class "+currentClass,d.token));
            		}
            		currentMethod = destr;
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:169:3: (l= local_decl )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==LOCAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:169:4: l= local_decl
            	    {
            	    pushFollow(FOLLOW_local_decl_in_destructor_decl344);
            	    l=local_decl();

            	    state._fsp--;


            	    		if(!currentMethod.addLocal(l)){
            	    			errHandler.reportError(new Error("Local variable "+l+" already defined for destructor"));
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            		currentMethod = destr;
            	

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
    // $ANTLR end "destructor_decl"


    // $ANTLR start "local_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:182:1: local_decl returns [Local l] : ^( LOCAL (c= CONST )? t= type ( array )* i= IDENTIFIER ) ;
    public final Local local_decl() throws RecognitionException {
        Local l = null;

        CommonTree c=null;
        CommonTree i=null;
        Type t = null;



        	int arrayCount = -1;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:186:2: ( ^( LOCAL (c= CONST )? t= type ( array )* i= IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:186:4: ^( LOCAL (c= CONST )? t= type ( array )* i= IDENTIFIER )
            {
            match(input,LOCAL,FOLLOW_LOCAL_in_local_decl381); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:186:13: (c= CONST )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CONST) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:186:13: c= CONST
                    {
                    c=(CommonTree)match(input,CONST,FOLLOW_CONST_in_local_decl385); 

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_local_decl390);
            t=type();

            state._fsp--;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:186:28: ( array )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ARRAY) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:186:29: array
            	    {
            	    pushFollow(FOLLOW_array_in_local_decl393);
            	    array();

            	    state._fsp--;

            	    arrayCount++;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_decl401); 

            		l = new Local((i!=null?i.getText():null),t,arrayCount != -1,arrayCount,c != null);
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "local_decl"


    // $ANTLR start "modifier"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:193:1: modifier returns [SightModifier m] : ( PUBLIC | PRIVATE );
    public final SightModifier modifier() throws RecognitionException {
        SightModifier m = null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:194:2: ( PUBLIC | PRIVATE )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==PUBLIC) ) {
                alt23=1;
            }
            else if ( (LA23_0==PRIVATE) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:194:4: PUBLIC
                    {
                    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier424); 
                    m = SightModifier.PUBLIC;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:195:5: PRIVATE
                    {
                    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier433); 
                    m = SightModifier.PRIVATE;

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
        return m;
    }
    // $ANTLR end "modifier"


    // $ANTLR start "array"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:198:1: array : ^( ARRAY TMP ) ;
    public final void array() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:199:2: ( ^( ARRAY TMP ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:199:4: ^( ARRAY TMP )
            {
            match(input,ARRAY,FOLLOW_ARRAY_in_array448); 

            match(input, Token.DOWN, null); 
            match(input,TMP,FOLLOW_TMP_in_array450); 

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:202:1: parameter_list returns [List<Local> params] : ^( PARAMETER_LIST p1= parameter (p2= parameter )* ) ;
    public final List<Local> parameter_list() throws RecognitionException {
        List<Local> params = null;

        Local p1 = null;

        Local p2 = null;



        	params = new ArrayList<Local>();

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:206:2: ( ^( PARAMETER_LIST p1= parameter (p2= parameter )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:206:4: ^( PARAMETER_LIST p1= parameter (p2= parameter )* )
            {
            match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_parameter_list473); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_parameter_in_parameter_list477);
            p1=parameter();

            state._fsp--;


            		params.add(p1);
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:210:3: (p2= parameter )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==PARAMETER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:210:4: p2= parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_parameter_list488);
            	    p2=parameter();

            	    state._fsp--;


            	    		params.add(p2);
            	    	

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:218:1: parameter returns [Local l] : ^( PARAMETER t= type i= IDENTIFIER ) ;
    public final Local parameter() throws RecognitionException {
        Local l = null;

        CommonTree i=null;
        Type t = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:219:2: ( ^( PARAMETER t= type i= IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:219:4: ^( PARAMETER t= type i= IDENTIFIER )
            {
            match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter520); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_parameter524);
            t=type();

            state._fsp--;

            i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter528); 

            		l = new Local((i!=null?i.getText():null),t,false,-1,false);
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "parameter"


    // $ANTLR start "type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:226:1: type returns [Type t] : ( ^( NAMESPACE_TYPE namespace= IDENTIFIER id= IDENTIFIER ) | ^( TYPE id= IDENTIFIER ) );
    public final Type type() throws RecognitionException {
        Type t = null;

        CommonTree namespace=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:227:2: ( ^( NAMESPACE_TYPE namespace= IDENTIFIER id= IDENTIFIER ) | ^( TYPE id= IDENTIFIER ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NAMESPACE_TYPE) ) {
                alt25=1;
            }
            else if ( (LA25_0==TYPE) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:227:4: ^( NAMESPACE_TYPE namespace= IDENTIFIER id= IDENTIFIER )
                    {
                    match(input,NAMESPACE_TYPE,FOLLOW_NAMESPACE_TYPE_in_type552); 

                    match(input, Token.DOWN, null); 
                    namespace=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type556); 
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type560); 

                    		Namespace namespaceAccess = table.getNamespace((namespace!=null?namespace.getText():null));
                    		if(namespaceAccess == null){
                    			errHandler.reportError(new Error("Namespace $1 does not exist",namespace.token));
                    		}else{
                    			if(namespaceAccess.getClass((id!=null?id.getText():null)) == null || namespaceAccess.getClass((id!=null?id.getText():null)).getModifier() != SightModifier.PUBLIC){
                    				errHandler.reportError(new Error("Class $1 within namespace $2 is does not exist or is not public",id.token,namespace.token));
                    			}else{
                    				t = Type.getType(namespaceAccess + "_" + (id!=null?id.getText():null));
                    			}
                    		}
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:241:4: ^( TYPE id= IDENTIFIER )
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_type573); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type577); 

                    		if((t = Type.getType((id!=null?id.getText():null))) == null && (t = Type.getType(currentNamespace + "_" + (id!=null?id.getText():null))) == null){
                    			errHandler.reportError(new Error("Type $1 could not be resolved to a native or class type",id.token));
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


 

    public static final BitSet FOLLOW_namespace_decl_in_eval66 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_decl88 = new BitSet(new long[]{0x0000000000840008L,0x0000040000000000L});
    public static final BitSet FOLLOW_class_decl_in_namespace_decl96 = new BitSet(new long[]{0x0000000000840008L,0x0000040000000000L});
    public static final BitSet FOLLOW_method_decl_in_namespace_decl99 = new BitSet(new long[]{0x0000000000040008L,0x0000040000000000L});
    public static final BitSet FOLLOW_field_decl_in_namespace_decl102 = new BitSet(new long[]{0x0000000000000008L,0x0000040000000000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl124 = new BitSet(new long[]{0x00000000001C0008L,0x0000040000000000L});
    public static final BitSet FOLLOW_field_decl_in_class_decl132 = new BitSet(new long[]{0x00000000001C0008L,0x0000040000000000L});
    public static final BitSet FOLLOW_method_decl_in_class_decl135 = new BitSet(new long[]{0x00000000001C0008L});
    public static final BitSet FOLLOW_constructor_decl_in_class_decl138 = new BitSet(new long[]{0x0000000000180008L});
    public static final BitSet FOLLOW_destructor_decl_in_class_decl141 = new BitSet(new long[]{0x0000000000100008L});
    public static final BitSet FOLLOW_FIELD_in_field_decl163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_field_decl167 = new BitSet(new long[]{0x0000000C00000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_STATIC_in_field_decl172 = new BitSet(new long[]{0x0000000C00000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_CONST_in_field_decl177 = new BitSet(new long[]{0x0000000C00000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_type_in_field_decl182 = new BitSet(new long[]{0x0000000000000000L,0x0000008000800000L});
    public static final BitSet FOLLOW_array_in_field_decl185 = new BitSet(new long[]{0x0000000000000000L,0x0000008000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_in_method_decl213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_method_decl217 = new BitSet(new long[]{0x0000003400000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_modifier_in_method_decl221 = new BitSet(new long[]{0x0000000400000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STATIC_in_method_decl226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_method_decl231 = new BitSet(new long[]{0x0000000000000008L,0x0000280000000000L});
    public static final BitSet FOLLOW_parameter_list_in_method_decl235 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_local_decl_in_method_decl247 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TMP_in_constructor_decl279 = new BitSet(new long[]{0x0000000000000008L,0x0000280000000000L});
    public static final BitSet FOLLOW_parameter_list_in_constructor_decl283 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_local_decl_in_constructor_decl295 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TMP_in_destructor_decl328 = new BitSet(new long[]{0x0000000000000008L,0x0000280000000000L});
    public static final BitSet FOLLOW_parameter_list_in_destructor_decl332 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_local_decl_in_destructor_decl344 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L});
    public static final BitSet FOLLOW_LOCAL_in_local_decl381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONST_in_local_decl385 = new BitSet(new long[]{0x0000000C00000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_type_in_local_decl390 = new BitSet(new long[]{0x0000000000000000L,0x0000008000800000L});
    public static final BitSet FOLLOW_array_in_local_decl393 = new BitSet(new long[]{0x0000000000000000L,0x0000008000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_decl401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_array448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TMP_in_array450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_LIST_in_parameter_list473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_parameter_list477 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list488 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
    public static final BitSet FOLLOW_PARAMETER_in_parameter520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter528 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMESPACE_TYPE_in_type552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_type573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type577 = new BitSet(new long[]{0x0000000000000008L});

}