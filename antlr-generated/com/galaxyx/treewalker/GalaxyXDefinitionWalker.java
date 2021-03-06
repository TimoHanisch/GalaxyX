// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g 2013-03-17 16:50:35

	package com.galaxyx.treewalker;
	
	import com.galaxyx.utils.SymbolTable;
	import com.galaxyx.utils.ErrorHandler;
	import com.galaxyx.utils.ErrorHandler.Error;
	import com.galaxyx.constructs.Namespace;
	import com.galaxyx.constructs.Class;
	import com.galaxyx.constructs.SightModifier;
	import com.galaxyx.semantic.Type;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXDefinitionWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ELIF", "WHILE", "FOR", "END", "DO", "BREAK", "CONTINUE", "RETURN", "FALSE", "TRUE", "NULL", "STRUCT", "FUNC", "CONSTRUCTOR", "DESTRUCTOR", "TYPEDEF", "NAMESPACE", "CLASS", "INTERFACE", "IMPLEMENTS", "EXTENDS", "NEW", "DELETE", "THIS", "SUPER", "NAMEOF", "INITIALIZER", "INLINE", "STATIC", "CONST", "PRIVATE", "PUBLIC", "NATIVE", "DEFINE", "UNDEF", "INCLUDE", "PREFIX", "SEMI", "COMMA", "DOT", "COLON", "RETURNS", "PLUS", "SUB", "DIV", "TIMES", "MODULO", "AND", "OR", "XOR", "BIT_NOT", "NOT", "LOR", "LAND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "SHIFTL", "SHIFTR", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "NAMESPACE_ACCESS", "LETTER", "IDENTIFIER", "EscapeSequence", "CHARACTER_LITERAL", "STRING_LITERAL", "DIGIT", "HEX_LITERAL", "INTEGER", "HexDigit", "FIXED_LITERAL", "OctalEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT"
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

    // delegates
    // delegators


        public GalaxyXDefinitionWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXDefinitionWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GalaxyXDefinitionWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g"; }


    	private SymbolTable table;
    	private ErrorHandler errHandler; 
    	
    	private Namespace currentNamespace;



    // $ANTLR start "eval"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:28:1: eval[SymbolTable table, ErrorHandler errHandler] : ( namespace_decl )* ;
    public final void eval(SymbolTable table, ErrorHandler errHandler) throws RecognitionException {

        	this.table = table;
        	this.errHandler = errHandler;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:33:2: ( ( namespace_decl )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:33:4: ( namespace_decl )*
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:33:4: ( namespace_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:33:4: namespace_decl
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:37:1: namespace_decl : ^( NAMESPACE id= IDENTIFIER ( class_decl )* ) ;
    public final void namespace_decl() throws RecognitionException {
        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:38:2: ( ^( NAMESPACE id= IDENTIFIER ( class_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:38:4: ^( NAMESPACE id= IDENTIFIER ( class_decl )* )
            {
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl83); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl87); 

            		currentNamespace = table.getNamespace((id!=null?id.getText():null));
            		if(currentNamespace == null){
            			currentNamespace = table.addNamespace((id!=null?id.getText():null));
            		}
            	
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:45:3: ( class_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:45:3: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl95);
            	    class_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:51:1: class_decl : ^( CLASS (m= ( PUBLIC | PRIVATE ) )? id= IDENTIFIER ) ;
    public final void class_decl() throws RecognitionException {
        CommonTree m=null;
        CommonTree id=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:2: ( ^( CLASS (m= ( PUBLIC | PRIVATE ) )? id= IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:4: ^( CLASS (m= ( PUBLIC | PRIVATE ) )? id= IDENTIFIER )
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_decl113); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:13: (m= ( PUBLIC | PRIVATE ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=PRIVATE && LA3_0<=PUBLIC)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\treewalker\\GalaxyXDefinitionWalker.g:52:13: m= ( PUBLIC | PRIVATE )
                    {
                    m=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=PRIVATE && input.LA(1)<=PUBLIC) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl128); 

            		SightModifier modifier = m == null? SightModifier.NAMESPACE : SightModifier.getModifier((m!=null?m.getText():null));
            		Class c = new Class((id!=null?id.getText():null),modifier);
            		if(!currentNamespace.addClass(c)){
            			errHandler.reportError(new Error("Class $1 already defined within Namespace "+currentNamespace,id.token));
            		}else{
            			Type newType = new Type(currentNamespace+"_"+(id!=null?id.getText():null),Type.CUSTOM);
            			if(!Type.addCustomType(newType)){
            				errHandler.reportError(new Error("Unknown error, adding new type",id.token));
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
    // $ANTLR end "class_decl"

    // Delegated rules


 

    public static final BitSet FOLLOW_namespace_decl_in_eval65 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_decl87 = new BitSet(new long[]{0x0000000000800008L});
    public static final BitSet FOLLOW_class_decl_in_namespace_decl95 = new BitSet(new long[]{0x0000000000800008L});
    public static final BitSet FOLLOW_CLASS_in_class_decl113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_class_decl117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl128 = new BitSet(new long[]{0x0000000000000008L});

}