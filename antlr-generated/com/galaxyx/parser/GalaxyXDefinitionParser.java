// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g 2013-03-19 18:32:44

	package com.galaxyx.parser;
	
	import com.galaxyx.utils.ErrorHandler;
	import com.galaxyx.utils.ErrorHandler.Error;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class GalaxyXDefinitionParser extends Parser {
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


        public GalaxyXDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[149+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GalaxyXDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g"; }


    	private ErrorHandler eh;
    	
    	@Override
        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            Token t = e.token;
            String msg = getErrorMessage(e, tokenNames);
    		eh.reportError(new Error(msg,t));
        }


    public static class parse_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parse"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:45:1: parse[ErrorHandler eh] : ( namespace_decl )* ;
    public final GalaxyXDefinitionParser.parse_return parse(ErrorHandler eh) throws RecognitionException {
        GalaxyXDefinitionParser.parse_return retval = new GalaxyXDefinitionParser.parse_return();
        retval.start = input.LT(1);
        int parse_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.namespace_decl_return namespace_decl1 = null;




        	this.eh = eh;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:49:2: ( ( namespace_decl )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:49:4: ( namespace_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:49:4: ( namespace_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: namespace_decl
            	    {
            	    pushFollow(FOLLOW_namespace_decl_in_parse148);
            	    namespace_decl1=namespace_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, parse_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parse"

    public static class namespace_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:52:1: namespace_decl : NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE -> ^( NAMESPACE IDENTIFIER ( class_decl )* ) ;
    public final GalaxyXDefinitionParser.namespace_decl_return namespace_decl() throws RecognitionException {
        GalaxyXDefinitionParser.namespace_decl_return retval = new GalaxyXDefinitionParser.namespace_decl_return();
        retval.start = input.LT(1);
        int namespace_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token NAMESPACE2=null;
        Token IDENTIFIER3=null;
        Token COLON4=null;
        Token END9=null;
        Token NAMESPACE10=null;
        GalaxyXDefinitionParser.class_decl_return class_decl5 = null;

        GalaxyXDefinitionParser.function_decl_return function_decl6 = null;

        GalaxyXDefinitionParser.field_decl_return field_decl7 = null;

        GalaxyXDefinitionParser.initializer_return initializer8 = null;


        CommonTree NAMESPACE2_tree=null;
        CommonTree IDENTIFIER3_tree=null;
        CommonTree COLON4_tree=null;
        CommonTree END9_tree=null;
        CommonTree NAMESPACE10_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleSubtreeStream stream_class_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_decl");
        RewriteRuleSubtreeStream stream_function_decl=new RewriteRuleSubtreeStream(adaptor,"rule function_decl");
        RewriteRuleSubtreeStream stream_field_decl=new RewriteRuleSubtreeStream(adaptor,"rule field_decl");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:53:2: ( NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE -> ^( NAMESPACE IDENTIFIER ( class_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:53:4: NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE
            {
            NAMESPACE2=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl160); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE2);

            IDENTIFIER3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl162); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER3);

            COLON4=(Token)match(input,COLON,FOLLOW_COLON_in_namespace_decl164); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON4);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:4: ( class_decl | function_decl | field_decl | initializer )*
            loop2:
            do {
                int alt2=5;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:5: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl170);
            	    class_decl5=class_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_class_decl.add(class_decl5.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_namespace_decl174);
            	    function_decl6=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_decl.add(function_decl6.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:34: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace_decl178);
            	    field_decl7=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_decl.add(field_decl7.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:47: initializer
            	    {
            	    pushFollow(FOLLOW_initializer_in_namespace_decl182);
            	    initializer8=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer8.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            END9=(Token)match(input,END,FOLLOW_END_in_namespace_decl188); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END9);

            NAMESPACE10=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl190); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE10);



            // AST REWRITE
            // elements: IDENTIFIER, NAMESPACE, class_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 56:3: -> ^( NAMESPACE IDENTIFIER ( class_decl )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:57:3: ^( NAMESPACE IDENTIFIER ( class_decl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_NAMESPACE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:57:26: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, namespace_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namespace_decl"

    public static class class_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:60:1: class_decl : ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS -> ^( CLASS ( modifier )? IDENTIFIER ) ;
    public final GalaxyXDefinitionParser.class_decl_return class_decl() throws RecognitionException {
        GalaxyXDefinitionParser.class_decl_return retval = new GalaxyXDefinitionParser.class_decl_return();
        retval.start = input.LT(1);
        int class_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token CLASS12=null;
        Token IDENTIFIER13=null;
        Token EXTENDS14=null;
        Token IDENTIFIER15=null;
        Token COLON16=null;
        Token END21=null;
        Token CLASS22=null;
        GalaxyXDefinitionParser.modifier_return modifier11 = null;

        GalaxyXDefinitionParser.field_decl_return field_decl17 = null;

        GalaxyXDefinitionParser.function_decl_return function_decl18 = null;

        GalaxyXDefinitionParser.constructor_decl_return constructor_decl19 = null;

        GalaxyXDefinitionParser.destructor_decl_return destructor_decl20 = null;


        CommonTree CLASS12_tree=null;
        CommonTree IDENTIFIER13_tree=null;
        CommonTree EXTENDS14_tree=null;
        CommonTree IDENTIFIER15_tree=null;
        CommonTree COLON16_tree=null;
        CommonTree END21_tree=null;
        CommonTree CLASS22_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_destructor_decl=new RewriteRuleSubtreeStream(adaptor,"rule destructor_decl");
        RewriteRuleSubtreeStream stream_constructor_decl=new RewriteRuleSubtreeStream(adaptor,"rule constructor_decl");
        RewriteRuleSubtreeStream stream_field_decl=new RewriteRuleSubtreeStream(adaptor,"rule field_decl");
        RewriteRuleSubtreeStream stream_function_decl=new RewriteRuleSubtreeStream(adaptor,"rule function_decl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:2: ( ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS -> ^( CLASS ( modifier )? IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:4: ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:4: ( modifier )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=PRIVATE && LA3_0<=PUBLIC)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_class_decl217);
                    modifier11=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier11.getTree());

                    }
                    break;

            }

            CLASS12=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl220); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS12);

            IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl222); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER13);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:31: ( EXTENDS IDENTIFIER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:32: EXTENDS IDENTIFIER
                    {
                    EXTENDS14=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_class_decl225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS14);

                    IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER15);


                    }
                    break;

            }

            COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_class_decl231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON16);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:4: ( field_decl | function_decl | constructor_decl | destructor_decl )*
            loop5:
            do {
                int alt5=5;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:5: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl237);
            	    field_decl17=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_decl.add(field_decl17.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_class_decl241);
            	    function_decl18=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_decl.add(function_decl18.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:34: constructor_decl
            	    {
            	    pushFollow(FOLLOW_constructor_decl_in_class_decl245);
            	    constructor_decl19=constructor_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_constructor_decl.add(constructor_decl19.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:53: destructor_decl
            	    {
            	    pushFollow(FOLLOW_destructor_decl_in_class_decl249);
            	    destructor_decl20=destructor_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_destructor_decl.add(destructor_decl20.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            END21=(Token)match(input,END,FOLLOW_END_in_class_decl255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END21);

            CLASS22=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS22);



            // AST REWRITE
            // elements: CLASS, modifier, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 64:3: -> ^( CLASS ( modifier )? IDENTIFIER )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:65:3: ^( CLASS ( modifier )? IDENTIFIER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CLASS.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:65:11: ( modifier )?
                if ( stream_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, class_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class constructor_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructor_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:68:1: constructor_decl : CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR ->;
    public final GalaxyXDefinitionParser.constructor_decl_return constructor_decl() throws RecognitionException {
        GalaxyXDefinitionParser.constructor_decl_return retval = new GalaxyXDefinitionParser.constructor_decl_return();
        retval.start = input.LT(1);
        int constructor_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token CONSTRUCTOR23=null;
        Token LPAREN24=null;
        Token RPAREN26=null;
        Token COLON27=null;
        Token END30=null;
        Token CONSTRUCTOR31=null;
        GalaxyXDefinitionParser.parameter_list_return parameter_list25 = null;

        GalaxyXDefinitionParser.local_var_decl_return local_var_decl28 = null;

        GalaxyXDefinitionParser.statement_return statement29 = null;


        CommonTree CONSTRUCTOR23_tree=null;
        CommonTree LPAREN24_tree=null;
        CommonTree RPAREN26_tree=null;
        CommonTree COLON27_tree=null;
        CommonTree END30_tree=null;
        CommonTree CONSTRUCTOR31_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_CONSTRUCTOR=new RewriteRuleTokenStream(adaptor,"token CONSTRUCTOR");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_local_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule local_var_decl");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:69:2: ( CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:69:4: CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR
            {
            CONSTRUCTOR23=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTRUCTOR.add(CONSTRUCTOR23);

            LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constructor_decl286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN24);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:69:23: ( parameter_list )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_constructor_decl288);
                    parameter_list25=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list25.getTree());

                    }
                    break;

            }

            RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constructor_decl291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN26);

            COLON27=(Token)match(input,COLON,FOLLOW_COLON_in_constructor_decl293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON27);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:70:4: ( local_var_decl )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_constructor_decl298);
            	    local_var_decl28=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_local_var_decl.add(local_var_decl28.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:71:4: ( statement )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor_decl304);
            	    statement29=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement29.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            END30=(Token)match(input,END,FOLLOW_END_in_constructor_decl309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END30);

            CONSTRUCTOR31=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTRUCTOR.add(CONSTRUCTOR31);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, constructor_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constructor_decl"

    public static class destructor_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "destructor_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:76:1: destructor_decl : DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR ->;
    public final GalaxyXDefinitionParser.destructor_decl_return destructor_decl() throws RecognitionException {
        GalaxyXDefinitionParser.destructor_decl_return retval = new GalaxyXDefinitionParser.destructor_decl_return();
        retval.start = input.LT(1);
        int destructor_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DESTRUCTOR32=null;
        Token LPAREN33=null;
        Token RPAREN35=null;
        Token COLON36=null;
        Token END39=null;
        Token DESTRUCTOR40=null;
        GalaxyXDefinitionParser.parameter_list_return parameter_list34 = null;

        GalaxyXDefinitionParser.local_var_decl_return local_var_decl37 = null;

        GalaxyXDefinitionParser.statement_return statement38 = null;


        CommonTree DESTRUCTOR32_tree=null;
        CommonTree LPAREN33_tree=null;
        CommonTree RPAREN35_tree=null;
        CommonTree COLON36_tree=null;
        CommonTree END39_tree=null;
        CommonTree DESTRUCTOR40_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DESTRUCTOR=new RewriteRuleTokenStream(adaptor,"token DESTRUCTOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_local_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule local_var_decl");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:2: ( DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:4: DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR
            {
            DESTRUCTOR32=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTRUCTOR.add(DESTRUCTOR32);

            LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_destructor_decl329); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN33);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:22: ( parameter_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_destructor_decl331);
                    parameter_list34=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list34.getTree());

                    }
                    break;

            }

            RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_destructor_decl334); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN35);

            COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_destructor_decl336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON36);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:78:4: ( local_var_decl )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_destructor_decl341);
            	    local_var_decl37=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_local_var_decl.add(local_var_decl37.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:79:4: ( statement )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_destructor_decl347);
            	    statement38=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement38.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            END39=(Token)match(input,END,FOLLOW_END_in_destructor_decl352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END39);

            DESTRUCTOR40=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl354); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTRUCTOR.add(DESTRUCTOR40);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 81:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, destructor_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "destructor_decl"

    public static class function_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:84:1: function_decl : ( modifier )? ( STATIC )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC ->;
    public final GalaxyXDefinitionParser.function_decl_return function_decl() throws RecognitionException {
        GalaxyXDefinitionParser.function_decl_return retval = new GalaxyXDefinitionParser.function_decl_return();
        retval.start = input.LT(1);
        int function_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token STATIC42=null;
        Token FUNC43=null;
        Token IDENTIFIER44=null;
        Token LPAREN45=null;
        Token RPAREN47=null;
        Token RETURNS48=null;
        Token COLON50=null;
        Token END53=null;
        Token FUNC54=null;
        GalaxyXDefinitionParser.modifier_return modifier41 = null;

        GalaxyXDefinitionParser.parameter_list_return parameter_list46 = null;

        GalaxyXDefinitionParser.type_return type49 = null;

        GalaxyXDefinitionParser.local_var_decl_return local_var_decl51 = null;

        GalaxyXDefinitionParser.statement_return statement52 = null;


        CommonTree STATIC42_tree=null;
        CommonTree FUNC43_tree=null;
        CommonTree IDENTIFIER44_tree=null;
        CommonTree LPAREN45_tree=null;
        CommonTree RPAREN47_tree=null;
        CommonTree RETURNS48_tree=null;
        CommonTree COLON50_tree=null;
        CommonTree END53_tree=null;
        CommonTree FUNC54_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleTokenStream stream_FUNC=new RewriteRuleTokenStream(adaptor,"token FUNC");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RETURNS=new RewriteRuleTokenStream(adaptor,"token RETURNS");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_local_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule local_var_decl");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:2: ( ( modifier )? ( STATIC )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:4: ( modifier )? ( STATIC )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:4: ( modifier )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=PRIVATE && LA12_0<=PUBLIC)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_function_decl370);
                    modifier41=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier41.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:14: ( STATIC )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==STATIC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: STATIC
                    {
                    STATIC42=(Token)match(input,STATIC,FOLLOW_STATIC_in_function_decl373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STATIC.add(STATIC42);


                    }
                    break;

            }

            FUNC43=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl376); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNC.add(FUNC43);

            IDENTIFIER44=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_decl378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER44);

            LPAREN45=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_decl380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN45);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:45: ( parameter_list )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IDENTIFIER) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function_decl382);
                    parameter_list46=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list46.getTree());

                    }
                    break;

            }

            RPAREN47=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_decl385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN47);

            RETURNS48=(Token)match(input,RETURNS,FOLLOW_RETURNS_in_function_decl387); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURNS.add(RETURNS48);

            pushFollow(FOLLOW_type_in_function_decl389);
            type49=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type49.getTree());
            COLON50=(Token)match(input,COLON,FOLLOW_COLON_in_function_decl391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON50);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:86:4: ( local_var_decl )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_function_decl396);
            	    local_var_decl51=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_local_var_decl.add(local_var_decl51.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:87:4: ( statement )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function_decl402);
            	    statement52=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement52.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            END53=(Token)match(input,END,FOLLOW_END_in_function_decl407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END53);

            FUNC54=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl409); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNC.add(FUNC54);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 89:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, function_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "function_decl"

    public static class parameter_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:92:1: parameter_list : parameter ( COMMA parameter )* ->;
    public final GalaxyXDefinitionParser.parameter_list_return parameter_list() throws RecognitionException {
        GalaxyXDefinitionParser.parameter_list_return retval = new GalaxyXDefinitionParser.parameter_list_return();
        retval.start = input.LT(1);
        int parameter_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA56=null;
        GalaxyXDefinitionParser.parameter_return parameter55 = null;

        GalaxyXDefinitionParser.parameter_return parameter57 = null;


        CommonTree COMMA56_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:93:2: ( parameter ( COMMA parameter )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:93:4: parameter ( COMMA parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameter_list425);
            parameter55=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter55.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:93:14: ( COMMA parameter )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:93:15: COMMA parameter
            	    {
            	    COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list428); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA56);

            	    pushFollow(FOLLOW_parameter_in_parameter_list430);
            	    parameter57=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter57.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 94:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parameter_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parameter_list"

    public static class parameter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:97:1: parameter : type IDENTIFIER ->;
    public final GalaxyXDefinitionParser.parameter_return parameter() throws RecognitionException {
        GalaxyXDefinitionParser.parameter_return retval = new GalaxyXDefinitionParser.parameter_return();
        retval.start = input.LT(1);
        int parameter_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER59=null;
        GalaxyXDefinitionParser.type_return type58 = null;


        CommonTree IDENTIFIER59_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:98:2: ( type IDENTIFIER ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:98:4: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_parameter448);
            type58=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type58.getTree());
            IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter450); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER59);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 99:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class local_var_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "local_var_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:102:1: local_var_decl : ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ->;
    public final GalaxyXDefinitionParser.local_var_decl_return local_var_decl() throws RecognitionException {
        GalaxyXDefinitionParser.local_var_decl_return retval = new GalaxyXDefinitionParser.local_var_decl_return();
        retval.start = input.LT(1);
        int local_var_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token CONST60=null;
        Token IDENTIFIER63=null;
        Token ASSGN64=null;
        Token SEMI66=null;
        GalaxyXDefinitionParser.type_return type61 = null;

        GalaxyXDefinitionParser.array_return array62 = null;

        GalaxyXDefinitionParser.expression_return expression65 = null;


        CommonTree CONST60_tree=null;
        CommonTree IDENTIFIER63_tree=null;
        CommonTree ASSGN64_tree=null;
        CommonTree SEMI66_tree=null;
        RewriteRuleTokenStream stream_ASSGN=new RewriteRuleTokenStream(adaptor,"token ASSGN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_array=new RewriteRuleSubtreeStream(adaptor,"rule array");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:2: ( ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:4: ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:4: ( CONST )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==CONST) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: CONST
                    {
                    CONST60=(Token)match(input,CONST,FOLLOW_CONST_in_local_var_decl466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST.add(CONST60);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_local_var_decl469);
            type61=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type61.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:16: ( array )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LBRACK) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_local_var_decl471);
            	    array62=array();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array.add(array62.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var_decl474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER63);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:34: ( ASSGN expression )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ASSGN) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:35: ASSGN expression
                    {
                    ASSGN64=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_local_var_decl477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSGN.add(ASSGN64);

                    pushFollow(FOLLOW_expression_in_local_var_decl479);
                    expression65=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression65.getTree());

                    }
                    break;

            }

            SEMI66=(Token)match(input,SEMI,FOLLOW_SEMI_in_local_var_decl483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI66);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, local_var_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "local_var_decl"

    public static class field_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:107:1: field_decl : ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ->;
    public final GalaxyXDefinitionParser.field_decl_return field_decl() throws RecognitionException {
        GalaxyXDefinitionParser.field_decl_return retval = new GalaxyXDefinitionParser.field_decl_return();
        retval.start = input.LT(1);
        int field_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token STATIC68=null;
        Token CONST69=null;
        Token IDENTIFIER72=null;
        Token ASSGN73=null;
        Token SEMI75=null;
        GalaxyXDefinitionParser.modifier_return modifier67 = null;

        GalaxyXDefinitionParser.type_return type70 = null;

        GalaxyXDefinitionParser.array_return array71 = null;

        GalaxyXDefinitionParser.expression_return expression74 = null;


        CommonTree STATIC68_tree=null;
        CommonTree CONST69_tree=null;
        CommonTree IDENTIFIER72_tree=null;
        CommonTree ASSGN73_tree=null;
        CommonTree SEMI75_tree=null;
        RewriteRuleTokenStream stream_ASSGN=new RewriteRuleTokenStream(adaptor,"token ASSGN");
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_array=new RewriteRuleSubtreeStream(adaptor,"rule array");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:2: ( ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:4: ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:4: ( modifier )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=PRIVATE && LA21_0<=PUBLIC)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_field_decl499);
                    modifier67=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier67.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:14: ( STATIC )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==STATIC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: STATIC
                    {
                    STATIC68=(Token)match(input,STATIC,FOLLOW_STATIC_in_field_decl502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STATIC.add(STATIC68);


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:22: ( CONST )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==CONST) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: CONST
                    {
                    CONST69=(Token)match(input,CONST,FOLLOW_CONST_in_field_decl505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST.add(CONST69);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_field_decl508);
            type70=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type70.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:34: ( array )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LBRACK) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_field_decl510);
            	    array71=array();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array.add(array71.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            IDENTIFIER72=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl513); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER72);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:52: ( ASSGN expression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ASSGN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:53: ASSGN expression
                    {
                    ASSGN73=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_field_decl516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSGN.add(ASSGN73);

                    pushFollow(FOLLOW_expression_in_field_decl518);
                    expression74=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression74.getTree());

                    }
                    break;

            }

            SEMI75=(Token)match(input,SEMI,FOLLOW_SEMI_in_field_decl522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI75);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, field_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field_decl"

    public static class initializer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initializer"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:112:1: initializer : INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER ->;
    public final GalaxyXDefinitionParser.initializer_return initializer() throws RecognitionException {
        GalaxyXDefinitionParser.initializer_return retval = new GalaxyXDefinitionParser.initializer_return();
        retval.start = input.LT(1);
        int initializer_StartIndex = input.index();
        CommonTree root_0 = null;

        Token INITIALIZER76=null;
        Token COLON77=null;
        Token END80=null;
        Token INITIALIZER81=null;
        GalaxyXDefinitionParser.local_var_decl_return local_var_decl78 = null;

        GalaxyXDefinitionParser.statement_return statement79 = null;


        CommonTree INITIALIZER76_tree=null;
        CommonTree COLON77_tree=null;
        CommonTree END80_tree=null;
        CommonTree INITIALIZER81_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_INITIALIZER=new RewriteRuleTokenStream(adaptor,"token INITIALIZER");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_local_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule local_var_decl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:113:2: ( INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:113:4: INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER
            {
            INITIALIZER76=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer538); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INITIALIZER.add(INITIALIZER76);

            COLON77=(Token)match(input,COLON,FOLLOW_COLON_in_initializer540); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON77);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:114:4: ( local_var_decl )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_initializer545);
            	    local_var_decl78=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_local_var_decl.add(local_var_decl78.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:115:4: ( statement )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_initializer551);
            	    statement79=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement79.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            END80=(Token)match(input,END,FOLLOW_END_in_initializer556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END80);

            INITIALIZER81=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INITIALIZER.add(INITIALIZER81);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 117:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, initializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "initializer"

    public static class array_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:120:1: array : LBRACK RBRACK ->;
    public final GalaxyXDefinitionParser.array_return array() throws RecognitionException {
        GalaxyXDefinitionParser.array_return retval = new GalaxyXDefinitionParser.array_return();
        retval.start = input.LT(1);
        int array_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LBRACK82=null;
        Token RBRACK83=null;

        CommonTree LBRACK82_tree=null;
        CommonTree RBRACK83_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:121:2: ( LBRACK RBRACK ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:121:4: LBRACK RBRACK
            {
            LBRACK82=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array573); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK82);

            RBRACK83=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK83);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 121:18: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, array_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:124:1: type : ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> | IDENTIFIER ->);
    public final GalaxyXDefinitionParser.type_return type() throws RecognitionException {
        GalaxyXDefinitionParser.type_return retval = new GalaxyXDefinitionParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER84=null;
        Token NAMESPACE_ACCESS85=null;
        Token IDENTIFIER86=null;
        Token IDENTIFIER87=null;

        CommonTree IDENTIFIER84_tree=null;
        CommonTree NAMESPACE_ACCESS85_tree=null;
        CommonTree IDENTIFIER86_tree=null;
        CommonTree IDENTIFIER87_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_NAMESPACE_ACCESS=new RewriteRuleTokenStream(adaptor,"token NAMESPACE_ACCESS");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:125:2: ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> | IDENTIFIER ->)
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IDENTIFIER) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==NAMESPACE_ACCESS) ) {
                    alt28=1;
                }
                else if ( (LA28_1==COLON||LA28_1==LBRACK||LA28_1==IDENTIFIER) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:125:4: IDENTIFIER NAMESPACE_ACCESS IDENTIFIER
                    {
                    IDENTIFIER84=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER84);

                    NAMESPACE_ACCESS85=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_type592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE_ACCESS.add(NAMESPACE_ACCESS85);

                    IDENTIFIER86=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER86);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 125:43: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:126:4: IDENTIFIER
                    {
                    IDENTIFIER87=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 126:15: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class modifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:129:1: modifier : ( PUBLIC | PRIVATE );
    public final GalaxyXDefinitionParser.modifier_return modifier() throws RecognitionException {
        GalaxyXDefinitionParser.modifier_return retval = new GalaxyXDefinitionParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set88=null;

        CommonTree set88_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:130:2: ( PUBLIC | PRIVATE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set88=(Token)input.LT(1);
            if ( (input.LA(1)>=PRIVATE && input.LA(1)<=PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set88));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, modifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class assignment_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:134:1: assignment_expression : expression assignment_operator expression ->;
    public final GalaxyXDefinitionParser.assignment_expression_return assignment_expression() throws RecognitionException {
        GalaxyXDefinitionParser.assignment_expression_return retval = new GalaxyXDefinitionParser.assignment_expression_return();
        retval.start = input.LT(1);
        int assignment_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.expression_return expression89 = null;

        GalaxyXDefinitionParser.assignment_operator_return assignment_operator90 = null;

        GalaxyXDefinitionParser.expression_return expression91 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_assignment_operator=new RewriteRuleSubtreeStream(adaptor,"rule assignment_operator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:135:2: ( expression assignment_operator expression ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:135:4: expression assignment_operator expression
            {
            pushFollow(FOLLOW_expression_in_assignment_expression633);
            expression89=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression89.getTree());
            pushFollow(FOLLOW_assignment_operator_in_assignment_expression635);
            assignment_operator90=assignment_operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_operator.add(assignment_operator90.getTree());
            pushFollow(FOLLOW_expression_in_assignment_expression637);
            expression91=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression91.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 135:46: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, assignment_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment_expression"

    public static class assignment_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_operator"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:138:1: assignment_operator : ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR );
    public final GalaxyXDefinitionParser.assignment_operator_return assignment_operator() throws RecognitionException {
        GalaxyXDefinitionParser.assignment_operator_return retval = new GalaxyXDefinitionParser.assignment_operator_return();
        retval.start = input.LT(1);
        int assignment_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set92=null;

        CommonTree set92_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:139:2: ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set92=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSGN && input.LA(1)<=ASSGNBITXOR) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set92));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, assignment_operator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment_operator"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:152:1: expression : logical_or_expression ->;
    public final GalaxyXDefinitionParser.expression_return expression() throws RecognitionException {
        GalaxyXDefinitionParser.expression_return retval = new GalaxyXDefinitionParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.logical_or_expression_return logical_or_expression93 = null;


        RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:153:2: ( logical_or_expression ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:153:4: logical_or_expression
            {
            pushFollow(FOLLOW_logical_or_expression_in_expression712);
            logical_or_expression93=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logical_or_expression.add(logical_or_expression93.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:26: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class logical_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:156:1: logical_or_expression : logical_and_expression ( LOR logical_and_expression )* ->;
    public final GalaxyXDefinitionParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        GalaxyXDefinitionParser.logical_or_expression_return retval = new GalaxyXDefinitionParser.logical_or_expression_return();
        retval.start = input.LT(1);
        int logical_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LOR95=null;
        GalaxyXDefinitionParser.logical_and_expression_return logical_and_expression94 = null;

        GalaxyXDefinitionParser.logical_and_expression_return logical_and_expression96 = null;


        CommonTree LOR95_tree=null;
        RewriteRuleTokenStream stream_LOR=new RewriteRuleTokenStream(adaptor,"token LOR");
        RewriteRuleSubtreeStream stream_logical_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_and_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:157:2: ( logical_and_expression ( LOR logical_and_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:157:4: logical_and_expression ( LOR logical_and_expression )*
            {
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression726);
            logical_and_expression94=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logical_and_expression.add(logical_and_expression94.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:157:27: ( LOR logical_and_expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==LOR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:157:28: LOR logical_and_expression
            	    {
            	    LOR95=(Token)match(input,LOR,FOLLOW_LOR_in_logical_or_expression729); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LOR.add(LOR95);

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression731);
            	    logical_and_expression96=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_logical_and_expression.add(logical_and_expression96.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 157:57: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, logical_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"

    public static class logical_and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_and_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:160:1: logical_and_expression : or_expression ( LAND or_expression )* ->;
    public final GalaxyXDefinitionParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        GalaxyXDefinitionParser.logical_and_expression_return retval = new GalaxyXDefinitionParser.logical_and_expression_return();
        retval.start = input.LT(1);
        int logical_and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LAND98=null;
        GalaxyXDefinitionParser.or_expression_return or_expression97 = null;

        GalaxyXDefinitionParser.or_expression_return or_expression99 = null;


        CommonTree LAND98_tree=null;
        RewriteRuleTokenStream stream_LAND=new RewriteRuleTokenStream(adaptor,"token LAND");
        RewriteRuleSubtreeStream stream_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule or_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:161:2: ( or_expression ( LAND or_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:161:4: or_expression ( LAND or_expression )*
            {
            pushFollow(FOLLOW_or_expression_in_logical_and_expression746);
            or_expression97=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_or_expression.add(or_expression97.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:161:18: ( LAND or_expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==LAND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:161:19: LAND or_expression
            	    {
            	    LAND98=(Token)match(input,LAND,FOLLOW_LAND_in_logical_and_expression749); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LAND.add(LAND98);

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression751);
            	    or_expression99=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_or_expression.add(or_expression99.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 161:40: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, logical_and_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"

    public static class or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:164:1: or_expression : exclusive_or_expression ( OR exclusive_or_expression )* ->;
    public final GalaxyXDefinitionParser.or_expression_return or_expression() throws RecognitionException {
        GalaxyXDefinitionParser.or_expression_return retval = new GalaxyXDefinitionParser.or_expression_return();
        retval.start = input.LT(1);
        int or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OR101=null;
        GalaxyXDefinitionParser.exclusive_or_expression_return exclusive_or_expression100 = null;

        GalaxyXDefinitionParser.exclusive_or_expression_return exclusive_or_expression102 = null;


        CommonTree OR101_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_exclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule exclusive_or_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:165:2: ( exclusive_or_expression ( OR exclusive_or_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:165:4: exclusive_or_expression ( OR exclusive_or_expression )*
            {
            pushFollow(FOLLOW_exclusive_or_expression_in_or_expression767);
            exclusive_or_expression100=exclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression100.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:165:28: ( OR exclusive_or_expression )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:165:29: OR exclusive_or_expression
            	    {
            	    OR101=(Token)match(input,OR,FOLLOW_OR_in_or_expression770); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OR.add(OR101);

            	    pushFollow(FOLLOW_exclusive_or_expression_in_or_expression772);
            	    exclusive_or_expression102=exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression102.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 165:58: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "or_expression"

    public static class exclusive_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exclusive_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:168:1: exclusive_or_expression : and_expression ( XOR and_expression )* ->;
    public final GalaxyXDefinitionParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
        GalaxyXDefinitionParser.exclusive_or_expression_return retval = new GalaxyXDefinitionParser.exclusive_or_expression_return();
        retval.start = input.LT(1);
        int exclusive_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token XOR104=null;
        GalaxyXDefinitionParser.and_expression_return and_expression103 = null;

        GalaxyXDefinitionParser.and_expression_return and_expression105 = null;


        CommonTree XOR104_tree=null;
        RewriteRuleTokenStream stream_XOR=new RewriteRuleTokenStream(adaptor,"token XOR");
        RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:169:2: ( and_expression ( XOR and_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:169:4: and_expression ( XOR and_expression )*
            {
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression788);
            and_expression103=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_and_expression.add(and_expression103.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:169:19: ( XOR and_expression )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:169:20: XOR and_expression
            	    {
            	    XOR104=(Token)match(input,XOR,FOLLOW_XOR_in_exclusive_or_expression791); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_XOR.add(XOR104);

            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression793);
            	    and_expression105=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_and_expression.add(and_expression105.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 169:41: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, exclusive_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exclusive_or_expression"

    public static class and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:172:1: and_expression : equality_expression ( AND equality_expression )* ->;
    public final GalaxyXDefinitionParser.and_expression_return and_expression() throws RecognitionException {
        GalaxyXDefinitionParser.and_expression_return retval = new GalaxyXDefinitionParser.and_expression_return();
        retval.start = input.LT(1);
        int and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token AND107=null;
        GalaxyXDefinitionParser.equality_expression_return equality_expression106 = null;

        GalaxyXDefinitionParser.equality_expression_return equality_expression108 = null;


        CommonTree AND107_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_equality_expression=new RewriteRuleSubtreeStream(adaptor,"rule equality_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:173:2: ( equality_expression ( AND equality_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:173:5: equality_expression ( AND equality_expression )*
            {
            pushFollow(FOLLOW_equality_expression_in_and_expression810);
            equality_expression106=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_equality_expression.add(equality_expression106.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:173:25: ( AND equality_expression )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:173:26: AND equality_expression
            	    {
            	    AND107=(Token)match(input,AND,FOLLOW_AND_in_and_expression813); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND107);

            	    pushFollow(FOLLOW_equality_expression_in_and_expression815);
            	    equality_expression108=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_equality_expression.add(equality_expression108.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 173:52: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, and_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "and_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:176:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ->;
    public final GalaxyXDefinitionParser.equality_expression_return equality_expression() throws RecognitionException {
        GalaxyXDefinitionParser.equality_expression_return retval = new GalaxyXDefinitionParser.equality_expression_return();
        retval.start = input.LT(1);
        int equality_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token EQ110=null;
        Token NEQ111=null;
        GalaxyXDefinitionParser.relational_expression_return relational_expression109 = null;

        GalaxyXDefinitionParser.relational_expression_return relational_expression112 = null;


        CommonTree EQ110_tree=null;
        CommonTree NEQ111_tree=null;
        RewriteRuleTokenStream stream_NEQ=new RewriteRuleTokenStream(adaptor,"token NEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_relational_expression=new RewriteRuleSubtreeStream(adaptor,"rule relational_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:5: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            pushFollow(FOLLOW_relational_expression_in_equality_expression832);
            relational_expression109=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression109.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:27: ( ( EQ | NEQ ) relational_expression )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:28: ( EQ | NEQ ) relational_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:28: ( EQ | NEQ )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==EQ) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==NEQ) ) {
            	        alt34=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:29: EQ
            	            {
            	            EQ110=(Token)match(input,EQ,FOLLOW_EQ_in_equality_expression836); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_EQ.add(EQ110);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:32: NEQ
            	            {
            	            NEQ111=(Token)match(input,NEQ,FOLLOW_NEQ_in_equality_expression838); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NEQ.add(NEQ111);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression841);
            	    relational_expression112=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression112.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:61: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, equality_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:180:1: relational_expression : shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* ->;
    public final GalaxyXDefinitionParser.relational_expression_return relational_expression() throws RecognitionException {
        GalaxyXDefinitionParser.relational_expression_return retval = new GalaxyXDefinitionParser.relational_expression_return();
        retval.start = input.LT(1);
        int relational_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LT114=null;
        Token GT115=null;
        Token LTEQ116=null;
        Token GTEQ117=null;
        GalaxyXDefinitionParser.shift_expression_return shift_expression113 = null;

        GalaxyXDefinitionParser.shift_expression_return shift_expression118 = null;


        CommonTree LT114_tree=null;
        CommonTree GT115_tree=null;
        CommonTree LTEQ116_tree=null;
        CommonTree GTEQ117_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_GTEQ=new RewriteRuleTokenStream(adaptor,"token GTEQ");
        RewriteRuleTokenStream stream_LTEQ=new RewriteRuleTokenStream(adaptor,"token LTEQ");
        RewriteRuleSubtreeStream stream_shift_expression=new RewriteRuleSubtreeStream(adaptor,"rule shift_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:2: ( shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:5: shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            {
            pushFollow(FOLLOW_shift_expression_in_relational_expression857);
            shift_expression113=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_shift_expression.add(shift_expression113.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:23: ( LT | GT | LTEQ | GTEQ ) shift_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:23: ( LT | GT | LTEQ | GTEQ )
            	    int alt36=4;
            	    switch ( input.LA(1) ) {
            	    case LT:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt36=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:24: LT
            	            {
            	            LT114=(Token)match(input,LT,FOLLOW_LT_in_relational_expression861); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_LT.add(LT114);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:27: GT
            	            {
            	            GT115=(Token)match(input,GT,FOLLOW_GT_in_relational_expression863); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_GT.add(GT115);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:30: LTEQ
            	            {
            	            LTEQ116=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_relational_expression865); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_LTEQ.add(LTEQ116);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:35: GTEQ
            	            {
            	            GTEQ117=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_relational_expression867); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_GTEQ.add(GTEQ117);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression870);
            	    shift_expression118=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_shift_expression.add(shift_expression118.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 181:60: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, relational_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relational_expression"

    public static class shift_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shift_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:184:1: shift_expression : additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* ->;
    public final GalaxyXDefinitionParser.shift_expression_return shift_expression() throws RecognitionException {
        GalaxyXDefinitionParser.shift_expression_return retval = new GalaxyXDefinitionParser.shift_expression_return();
        retval.start = input.LT(1);
        int shift_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SHIFTL120=null;
        Token SHIFTR121=null;
        GalaxyXDefinitionParser.additive_expression_return additive_expression119 = null;

        GalaxyXDefinitionParser.additive_expression_return additive_expression122 = null;


        CommonTree SHIFTL120_tree=null;
        CommonTree SHIFTR121_tree=null;
        RewriteRuleTokenStream stream_SHIFTR=new RewriteRuleTokenStream(adaptor,"token SHIFTR");
        RewriteRuleTokenStream stream_SHIFTL=new RewriteRuleTokenStream(adaptor,"token SHIFTL");
        RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:2: ( additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:5: additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )*
            {
            pushFollow(FOLLOW_additive_expression_in_shift_expression886);
            additive_expression119=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_additive_expression.add(additive_expression119.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:25: ( ( SHIFTL | SHIFTR ) additive_expression )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:26: ( SHIFTL | SHIFTR ) additive_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:26: ( SHIFTL | SHIFTR )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==SHIFTL) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==SHIFTR) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:27: SHIFTL
            	            {
            	            SHIFTL120=(Token)match(input,SHIFTL,FOLLOW_SHIFTL_in_shift_expression890); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_SHIFTL.add(SHIFTL120);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:34: SHIFTR
            	            {
            	            SHIFTR121=(Token)match(input,SHIFTR,FOLLOW_SHIFTR_in_shift_expression892); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_SHIFTR.add(SHIFTR121);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression895);
            	    additive_expression122=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_additive_expression.add(additive_expression122.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 185:64: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, shift_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shift_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:188:1: additive_expression : multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* ->;
    public final GalaxyXDefinitionParser.additive_expression_return additive_expression() throws RecognitionException {
        GalaxyXDefinitionParser.additive_expression_return retval = new GalaxyXDefinitionParser.additive_expression_return();
        retval.start = input.LT(1);
        int additive_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS124=null;
        Token SUB125=null;
        GalaxyXDefinitionParser.multiplicative_expression_return multiplicative_expression123 = null;

        GalaxyXDefinitionParser.multiplicative_expression_return multiplicative_expression126 = null;


        CommonTree PLUS124_tree=null;
        CommonTree SUB125_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
        RewriteRuleSubtreeStream stream_multiplicative_expression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:2: ( multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:5: multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )*
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression912);
            multiplicative_expression123=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multiplicative_expression.add(multiplicative_expression123.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:31: ( ( PLUS | SUB ) multiplicative_expression )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:32: ( PLUS | SUB ) multiplicative_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:32: ( PLUS | SUB )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==PLUS) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==SUB) ) {
            	        alt40=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:33: PLUS
            	            {
            	            PLUS124=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression916); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_PLUS.add(PLUS124);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:40: SUB
            	            {
            	            SUB125=(Token)match(input,SUB,FOLLOW_SUB_in_additive_expression920); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_SUB.add(SUB125);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression923);
            	    multiplicative_expression126=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multiplicative_expression.add(multiplicative_expression126.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 189:73: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, additive_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:192:1: multiplicative_expression : modulo_expression ( ( TIMES | DIV ) modulo_expression )* ->;
    public final GalaxyXDefinitionParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        GalaxyXDefinitionParser.multiplicative_expression_return retval = new GalaxyXDefinitionParser.multiplicative_expression_return();
        retval.start = input.LT(1);
        int multiplicative_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token TIMES128=null;
        Token DIV129=null;
        GalaxyXDefinitionParser.modulo_expression_return modulo_expression127 = null;

        GalaxyXDefinitionParser.modulo_expression_return modulo_expression130 = null;


        CommonTree TIMES128_tree=null;
        CommonTree DIV129_tree=null;
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_modulo_expression=new RewriteRuleSubtreeStream(adaptor,"rule modulo_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:2: ( modulo_expression ( ( TIMES | DIV ) modulo_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:5: modulo_expression ( ( TIMES | DIV ) modulo_expression )*
            {
            pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression939);
            modulo_expression127=modulo_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_modulo_expression.add(modulo_expression127.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:23: ( ( TIMES | DIV ) modulo_expression )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:24: ( TIMES | DIV ) modulo_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:24: ( TIMES | DIV )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==TIMES) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==DIV) ) {
            	        alt42=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:25: TIMES
            	            {
            	            TIMES128=(Token)match(input,TIMES,FOLLOW_TIMES_in_multiplicative_expression943); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_TIMES.add(TIMES128);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:33: DIV
            	            {
            	            DIV129=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicative_expression947); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_DIV.add(DIV129);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression950);
            	    modulo_expression130=modulo_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_modulo_expression.add(modulo_expression130.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 193:58: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, multiplicative_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class modulo_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modulo_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:196:1: modulo_expression : unary_expression ( MODULO unary_expression )* ->;
    public final GalaxyXDefinitionParser.modulo_expression_return modulo_expression() throws RecognitionException {
        GalaxyXDefinitionParser.modulo_expression_return retval = new GalaxyXDefinitionParser.modulo_expression_return();
        retval.start = input.LT(1);
        int modulo_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token MODULO132=null;
        GalaxyXDefinitionParser.unary_expression_return unary_expression131 = null;

        GalaxyXDefinitionParser.unary_expression_return unary_expression133 = null;


        CommonTree MODULO132_tree=null;
        RewriteRuleTokenStream stream_MODULO=new RewriteRuleTokenStream(adaptor,"token MODULO");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:2: ( unary_expression ( MODULO unary_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:5: unary_expression ( MODULO unary_expression )*
            {
            pushFollow(FOLLOW_unary_expression_in_modulo_expression967);
            unary_expression131=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression131.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:22: ( MODULO unary_expression )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:23: MODULO unary_expression
            	    {
            	    MODULO132=(Token)match(input,MODULO,FOLLOW_MODULO_in_modulo_expression970); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MODULO.add(MODULO132);

            	    pushFollow(FOLLOW_unary_expression_in_modulo_expression972);
            	    unary_expression133=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression133.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 197:49: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, modulo_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modulo_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:200:1: unary_expression : ( postfix_expression | unary_operator unary_expression ->);
    public final GalaxyXDefinitionParser.unary_expression_return unary_expression() throws RecognitionException {
        GalaxyXDefinitionParser.unary_expression_return retval = new GalaxyXDefinitionParser.unary_expression_return();
        retval.start = input.LT(1);
        int unary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.postfix_expression_return postfix_expression134 = null;

        GalaxyXDefinitionParser.unary_operator_return unary_operator135 = null;

        GalaxyXDefinitionParser.unary_expression_return unary_expression136 = null;


        RewriteRuleSubtreeStream stream_unary_operator=new RewriteRuleSubtreeStream(adaptor,"rule unary_operator");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:201:2: ( postfix_expression | unary_operator unary_expression ->)
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:201:5: postfix_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression989);
                    postfix_expression134=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression134.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:202:5: unary_operator unary_expression
                    {
                    pushFollow(FOLLOW_unary_operator_in_unary_expression995);
                    unary_operator135=unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_operator.add(unary_operator135.getTree());
                    pushFollow(FOLLOW_unary_expression_in_unary_expression997);
                    unary_expression136=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression136.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 202:37: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, unary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class postfix_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfix_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:205:1: postfix_expression : ( primary_expression -> | ( IDENTIFIER | THIS ) DOT postfix_expression -> | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> | IDENTIFIER ( LBRACK expression RBRACK )+ -> | IDENTIFIER LPAREN expression_list RPAREN -> | IDENTIFIER LPAREN RPAREN ->);
    public final GalaxyXDefinitionParser.postfix_expression_return postfix_expression() throws RecognitionException {
        GalaxyXDefinitionParser.postfix_expression_return retval = new GalaxyXDefinitionParser.postfix_expression_return();
        retval.start = input.LT(1);
        int postfix_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER138=null;
        Token THIS139=null;
        Token DOT140=null;
        Token IDENTIFIER142=null;
        Token NAMESPACE_ACCESS143=null;
        Token IDENTIFIER145=null;
        Token LBRACK146=null;
        Token RBRACK148=null;
        Token IDENTIFIER149=null;
        Token LPAREN150=null;
        Token RPAREN152=null;
        Token IDENTIFIER153=null;
        Token LPAREN154=null;
        Token RPAREN155=null;
        GalaxyXDefinitionParser.primary_expression_return primary_expression137 = null;

        GalaxyXDefinitionParser.postfix_expression_return postfix_expression141 = null;

        GalaxyXDefinitionParser.postfix_expression_return postfix_expression144 = null;

        GalaxyXDefinitionParser.expression_return expression147 = null;

        GalaxyXDefinitionParser.expression_list_return expression_list151 = null;


        CommonTree IDENTIFIER138_tree=null;
        CommonTree THIS139_tree=null;
        CommonTree DOT140_tree=null;
        CommonTree IDENTIFIER142_tree=null;
        CommonTree NAMESPACE_ACCESS143_tree=null;
        CommonTree IDENTIFIER145_tree=null;
        CommonTree LBRACK146_tree=null;
        CommonTree RBRACK148_tree=null;
        CommonTree IDENTIFIER149_tree=null;
        CommonTree LPAREN150_tree=null;
        CommonTree RPAREN152_tree=null;
        CommonTree IDENTIFIER153_tree=null;
        CommonTree LPAREN154_tree=null;
        CommonTree RPAREN155_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_NAMESPACE_ACCESS=new RewriteRuleTokenStream(adaptor,"token NAMESPACE_ACCESS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
        RewriteRuleSubtreeStream stream_postfix_expression=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:206:2: ( primary_expression -> | ( IDENTIFIER | THIS ) DOT postfix_expression -> | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> | IDENTIFIER ( LBRACK expression RBRACK )+ -> | IDENTIFIER LPAREN expression_list RPAREN -> | IDENTIFIER LPAREN RPAREN ->)
            int alt48=6;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:206:4: primary_expression
                    {
                    pushFollow(FOLLOW_primary_expression_in_postfix_expression1010);
                    primary_expression137=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression137.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:23: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:207:4: ( IDENTIFIER | THIS ) DOT postfix_expression
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:207:4: ( IDENTIFIER | THIS )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==IDENTIFIER) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==THIS) ) {
                        alt46=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:207:5: IDENTIFIER
                            {
                            IDENTIFIER138=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1018); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER138);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:207:18: THIS
                            {
                            THIS139=(Token)match(input,THIS,FOLLOW_THIS_in_postfix_expression1022); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS139);


                            }
                            break;

                    }

                    DOT140=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression1025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT140);

                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1027);
                    postfix_expression141=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression141.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 207:47: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:208:4: IDENTIFIER NAMESPACE_ACCESS postfix_expression
                    {
                    IDENTIFIER142=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER142);

                    NAMESPACE_ACCESS143=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE_ACCESS.add(NAMESPACE_ACCESS143);

                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1039);
                    postfix_expression144=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression144.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 208:51: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:209:4: IDENTIFIER ( LBRACK expression RBRACK )+
                    {
                    IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER145);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:209:15: ( LBRACK expression RBRACK )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        alt47 = dfa47.predict(input);
                        switch (alt47) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:209:16: LBRACK expression RBRACK
                    	    {
                    	    LBRACK146=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix_expression1050); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK146);

                    	    pushFollow(FOLLOW_expression_in_postfix_expression1052);
                    	    expression147=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression147.getTree());
                    	    RBRACK148=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix_expression1054); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK148);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 209:43: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:210:4: IDENTIFIER LPAREN expression_list RPAREN
                    {
                    IDENTIFIER149=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER149);

                    LPAREN150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN150);

                    pushFollow(FOLLOW_expression_list_in_postfix_expression1068);
                    expression_list151=expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression_list.add(expression_list151.getTree());
                    RPAREN152=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1070); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN152);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:45: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:211:4: IDENTIFIER LPAREN RPAREN
                    {
                    IDENTIFIER153=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER153);

                    LPAREN154=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1080); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN154);

                    RPAREN155=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1082); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN155);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:29: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, postfix_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"

    public static class expression_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:214:1: expression_list : expression ( COMMA expression )* ;
    public final GalaxyXDefinitionParser.expression_list_return expression_list() throws RecognitionException {
        GalaxyXDefinitionParser.expression_list_return retval = new GalaxyXDefinitionParser.expression_list_return();
        retval.start = input.LT(1);
        int expression_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA157=null;
        GalaxyXDefinitionParser.expression_return expression156 = null;

        GalaxyXDefinitionParser.expression_return expression158 = null;


        CommonTree COMMA157_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:215:2: ( expression ( COMMA expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:215:4: expression ( COMMA expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expression_list1096);
            expression156=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression156.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:215:15: ( COMMA expression )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:215:16: COMMA expression
            	    {
            	    COMMA157=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression_list1099); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression_list1102);
            	    expression158=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression158.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, expression_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression_list"

    public static class primary_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:218:1: primary_expression : ( IDENTIFIER | LPAREN expression RPAREN | constant );
    public final GalaxyXDefinitionParser.primary_expression_return primary_expression() throws RecognitionException {
        GalaxyXDefinitionParser.primary_expression_return retval = new GalaxyXDefinitionParser.primary_expression_return();
        retval.start = input.LT(1);
        int primary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER159=null;
        Token LPAREN160=null;
        Token RPAREN162=null;
        GalaxyXDefinitionParser.expression_return expression161 = null;

        GalaxyXDefinitionParser.constant_return constant163 = null;


        CommonTree IDENTIFIER159_tree=null;
        CommonTree LPAREN160_tree=null;
        CommonTree RPAREN162_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:219:2: ( IDENTIFIER | LPAREN expression RPAREN | constant )
            int alt50=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt50=1;
                }
                break;
            case LPAREN:
                {
                alt50=2;
                }
                break;
            case FALSE:
            case TRUE:
            case NULL:
            case THIS:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
            case INTEGER:
            case FIXED_LITERAL:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:219:4: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENTIFIER159=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1115); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER159_tree = (CommonTree)adaptor.create(IDENTIFIER159);
                    adaptor.addChild(root_0, IDENTIFIER159_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:220:4: LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN160=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression1120); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primary_expression1123);
                    expression161=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression161.getTree());
                    RPAREN162=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression1125); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:221:4: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression1131);
                    constant163=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant163.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, primary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primary_expression"

    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:224:1: constant : ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS );
    public final GalaxyXDefinitionParser.constant_return constant() throws RecognitionException {
        GalaxyXDefinitionParser.constant_return retval = new GalaxyXDefinitionParser.constant_return();
        retval.start = input.LT(1);
        int constant_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set164=null;

        CommonTree set164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:225:5: ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set164=(Token)input.LT(1);
            if ( (input.LA(1)>=FALSE && input.LA(1)<=NULL)||input.LA(1)==THIS||(input.LA(1)>=CHARACTER_LITERAL && input.LA(1)<=STRING_LITERAL)||input.LA(1)==INTEGER||input.LA(1)==FIXED_LITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set164));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, constant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class unary_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_operator"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:235:1: unary_operator : ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT );
    public final GalaxyXDefinitionParser.unary_operator_return unary_operator() throws RecognitionException {
        GalaxyXDefinitionParser.unary_operator_return retval = new GalaxyXDefinitionParser.unary_operator_return();
        retval.start = input.LT(1);
        int unary_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS165=null;
        Token SUB166=null;
        Token NOT167=null;
        Token NEW168=null;
        Token DELETE169=null;
        Token BIT_NOT170=null;

        CommonTree PLUS165_tree=null;
        CommonTree SUB166_tree=null;
        CommonTree NOT167_tree=null;
        CommonTree NEW168_tree=null;
        CommonTree DELETE169_tree=null;
        CommonTree BIT_NOT170_tree=null;
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:236:2: ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT )
            int alt51=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt51=1;
                }
                break;
            case SUB:
                {
                alt51=2;
                }
                break;
            case NOT:
                {
                alt51=3;
                }
                break;
            case NEW:
                {
                alt51=4;
                }
                break;
            case DELETE:
                {
                alt51=5;
                }
                break;
            case BIT_NOT:
                {
                alt51=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:236:5: PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS165=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_operator1218); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS165_tree = (CommonTree)adaptor.create(PLUS165);
                    adaptor.addChild(root_0, PLUS165_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:237:5: SUB
                    {
                    SUB166=(Token)match(input,SUB,FOLLOW_SUB_in_unary_operator1224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUB.add(SUB166);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 237:9: -> NEGATION
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:238:5: NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT167=(Token)match(input,NOT,FOLLOW_NOT_in_unary_operator1234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT167_tree = (CommonTree)adaptor.create(NOT167);
                    adaptor.addChild(root_0, NOT167_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:239:5: NEW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEW168=(Token)match(input,NEW,FOLLOW_NEW_in_unary_operator1240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW168_tree = (CommonTree)adaptor.create(NEW168);
                    adaptor.addChild(root_0, NEW168_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:240:5: DELETE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DELETE169=(Token)match(input,DELETE,FOLLOW_DELETE_in_unary_operator1246); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DELETE169_tree = (CommonTree)adaptor.create(DELETE169);
                    adaptor.addChild(root_0, DELETE169_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:241:4: BIT_NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BIT_NOT170=(Token)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_unary_operator1251); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIT_NOT170_tree = (CommonTree)adaptor.create(BIT_NOT170);
                    adaptor.addChild(root_0, BIT_NOT170_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, unary_operator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_operator"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:244:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );
    public final GalaxyXDefinitionParser.statement_return statement() throws RecognitionException {
        GalaxyXDefinitionParser.statement_return retval = new GalaxyXDefinitionParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.assignment_statement_return assignment_statement171 = null;

        GalaxyXDefinitionParser.expression_statement_return expression_statement172 = null;

        GalaxyXDefinitionParser.if_statement_return if_statement173 = null;

        GalaxyXDefinitionParser.while_statement_return while_statement174 = null;

        GalaxyXDefinitionParser.do_while_statement_return do_while_statement175 = null;

        GalaxyXDefinitionParser.for_statement_return for_statement176 = null;

        GalaxyXDefinitionParser.jump_statement_return jump_statement177 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:245:2: ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement )
            int alt52=7;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:245:4: assignment_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_statement_in_statement1263);
                    assignment_statement171=assignment_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement171.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:246:4: expression_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_statement_in_statement1268);
                    expression_statement172=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement172.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:247:4: if_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement1273);
                    if_statement173=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement173.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:248:4: while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement1278);
                    while_statement174=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement174.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:249:4: do_while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_do_while_statement_in_statement1283);
                    do_while_statement175=do_while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, do_while_statement175.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:250:4: for_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_statement_in_statement1288);
                    for_statement176=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement176.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:251:4: jump_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_jump_statement_in_statement1293);
                    jump_statement177=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement177.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class assignment_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:254:1: assignment_statement : assignment_expression SEMI ;
    public final GalaxyXDefinitionParser.assignment_statement_return assignment_statement() throws RecognitionException {
        GalaxyXDefinitionParser.assignment_statement_return retval = new GalaxyXDefinitionParser.assignment_statement_return();
        retval.start = input.LT(1);
        int assignment_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI179=null;
        GalaxyXDefinitionParser.assignment_expression_return assignment_expression178 = null;


        CommonTree SEMI179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:255:2: ( assignment_expression SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:255:4: assignment_expression SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_assignment_statement1305);
            assignment_expression178=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression178.getTree());
            SEMI179=(Token)match(input,SEMI,FOLLOW_SEMI_in_assignment_statement1307); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, assignment_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment_statement"

    public static class expression_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:258:1: expression_statement : ( SEMI | expression SEMI );
    public final GalaxyXDefinitionParser.expression_statement_return expression_statement() throws RecognitionException {
        GalaxyXDefinitionParser.expression_statement_return retval = new GalaxyXDefinitionParser.expression_statement_return();
        retval.start = input.LT(1);
        int expression_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI180=null;
        Token SEMI182=null;
        GalaxyXDefinitionParser.expression_return expression181 = null;


        CommonTree SEMI180_tree=null;
        CommonTree SEMI182_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:259:2: ( SEMI | expression SEMI )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:259:4: SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEMI180=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1320); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:260:4: expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_expression_statement1326);
                    expression181=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression181.getTree());
                    SEMI182=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1328); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, expression_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression_statement"

    public static class if_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:263:1: if_statement : IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF ->;
    public final GalaxyXDefinitionParser.if_statement_return if_statement() throws RecognitionException {
        GalaxyXDefinitionParser.if_statement_return retval = new GalaxyXDefinitionParser.if_statement_return();
        retval.start = input.LT(1);
        int if_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IF183=null;
        Token LPAREN184=null;
        Token RPAREN186=null;
        Token COLON187=null;
        Token ELIF189=null;
        Token LPAREN190=null;
        Token RPAREN192=null;
        Token COLON193=null;
        Token ELSE195=null;
        Token COLON196=null;
        Token END198=null;
        Token IF199=null;
        GalaxyXDefinitionParser.expression_return expression185 = null;

        GalaxyXDefinitionParser.statement_return statement188 = null;

        GalaxyXDefinitionParser.expression_return expression191 = null;

        GalaxyXDefinitionParser.statement_return statement194 = null;

        GalaxyXDefinitionParser.statement_return statement197 = null;


        CommonTree IF183_tree=null;
        CommonTree LPAREN184_tree=null;
        CommonTree RPAREN186_tree=null;
        CommonTree COLON187_tree=null;
        CommonTree ELIF189_tree=null;
        CommonTree LPAREN190_tree=null;
        CommonTree RPAREN192_tree=null;
        CommonTree COLON193_tree=null;
        CommonTree ELSE195_tree=null;
        CommonTree COLON196_tree=null;
        CommonTree END198_tree=null;
        CommonTree IF199_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:264:2: ( IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:264:4: IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF
            {
            IF183=(Token)match(input,IF,FOLLOW_IF_in_if_statement1341); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF183);

            LPAREN184=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1343); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN184);

            pushFollow(FOLLOW_expression_in_if_statement1345);
            expression185=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression185.getTree());
            RPAREN186=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN186);

            COLON187=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON187);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:265:4: ( statement )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement1354);
            	    statement188=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement188.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:266:3: ( ELIF LPAREN expression RPAREN COLON ( statement )* )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==ELIF) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:266:4: ELIF LPAREN expression RPAREN COLON ( statement )*
            	    {
            	    ELIF189=(Token)match(input,ELIF,FOLLOW_ELIF_in_if_statement1360); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ELIF.add(ELIF189);

            	    LPAREN190=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1362); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN190);

            	    pushFollow(FOLLOW_expression_in_if_statement1364);
            	    expression191=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression191.getTree());
            	    RPAREN192=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1366); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN192);

            	    COLON193=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1368); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON193);

            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:267:4: ( statement )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        alt55 = dfa55.predict(input);
            	        switch (alt55) {
            	    	case 1 :
            	    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement1373);
            	    	    statement194=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) stream_statement.add(statement194.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop55;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:268:3: ( ELSE COLON ( statement )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ELSE) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:268:4: ELSE COLON ( statement )*
                    {
                    ELSE195=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE195);

                    COLON196=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON196);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:269:4: ( statement )*
                    loop57:
                    do {
                        int alt57=2;
                        alt57 = dfa57.predict(input);
                        switch (alt57) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement1389);
                    	    statement197=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement197.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            END198=(Token)match(input,END,FOLLOW_END_in_if_statement1396); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END198);

            IF199=(Token)match(input,IF,FOLLOW_IF_in_if_statement1398); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF199);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 271:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, if_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class while_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:275:1: while_statement : WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE ->;
    public final GalaxyXDefinitionParser.while_statement_return while_statement() throws RecognitionException {
        GalaxyXDefinitionParser.while_statement_return retval = new GalaxyXDefinitionParser.while_statement_return();
        retval.start = input.LT(1);
        int while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token WHILE200=null;
        Token LPAREN201=null;
        Token RPAREN203=null;
        Token COLON204=null;
        Token END206=null;
        Token WHILE207=null;
        GalaxyXDefinitionParser.expression_return expression202 = null;

        GalaxyXDefinitionParser.statement_return statement205 = null;


        CommonTree WHILE200_tree=null;
        CommonTree LPAREN201_tree=null;
        CommonTree RPAREN203_tree=null;
        CommonTree COLON204_tree=null;
        CommonTree END206_tree=null;
        CommonTree WHILE207_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:276:2: ( WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:276:4: WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE
            {
            WHILE200=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE200);

            LPAREN201=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN201);

            pushFollow(FOLLOW_expression_in_while_statement1421);
            expression202=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression202.getTree());
            RPAREN203=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN203);

            COLON204=(Token)match(input,COLON,FOLLOW_COLON_in_while_statement1425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON204);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:277:4: ( statement )*
            loop59:
            do {
                int alt59=2;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement1430);
            	    statement205=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement205.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            END206=(Token)match(input,END,FOLLOW_END_in_while_statement1435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END206);

            WHILE207=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1437); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE207);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 279:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, while_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "while_statement"

    public static class for_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:283:1: for_statement : FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR ->;
    public final GalaxyXDefinitionParser.for_statement_return for_statement() throws RecognitionException {
        GalaxyXDefinitionParser.for_statement_return retval = new GalaxyXDefinitionParser.for_statement_return();
        retval.start = input.LT(1);
        int for_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token FOR208=null;
        Token LPAREN209=null;
        Token SEMI211=null;
        Token SEMI213=null;
        Token RPAREN215=null;
        Token COLON216=null;
        Token END218=null;
        Token FOR219=null;
        GalaxyXDefinitionParser.assignment_expression_return assignment_expression210 = null;

        GalaxyXDefinitionParser.expression_return expression212 = null;

        GalaxyXDefinitionParser.expression_return expression214 = null;

        GalaxyXDefinitionParser.statement_return statement217 = null;


        CommonTree FOR208_tree=null;
        CommonTree LPAREN209_tree=null;
        CommonTree SEMI211_tree=null;
        CommonTree SEMI213_tree=null;
        CommonTree RPAREN215_tree=null;
        CommonTree COLON216_tree=null;
        CommonTree END218_tree=null;
        CommonTree FOR219_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:2: ( FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:4: FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR
            {
            FOR208=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR208);

            LPAREN209=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_for_statement1458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN209);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:15: ( assignment_expression )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: assignment_expression
                    {
                    pushFollow(FOLLOW_assignment_expression_in_for_statement1460);
                    assignment_expression210=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression210.getTree());

                    }
                    break;

            }

            SEMI211=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1463); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI211);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:43: ( expression )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1465);
                    expression212=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression212.getTree());

                    }
                    break;

            }

            SEMI213=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI213);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:60: ( expression )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1470);
                    expression214=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression214.getTree());

                    }
                    break;

            }

            RPAREN215=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_for_statement1473); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN215);

            COLON216=(Token)match(input,COLON,FOLLOW_COLON_in_for_statement1475); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON216);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:285:4: ( statement )*
            loop63:
            do {
                int alt63=2;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_for_statement1480);
            	    statement217=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement217.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            END218=(Token)match(input,END,FOLLOW_END_in_for_statement1485); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END218);

            FOR219=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1487); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR219);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 287:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, for_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "for_statement"

    public static class do_while_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "do_while_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:291:1: do_while_statement : DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO ->;
    public final GalaxyXDefinitionParser.do_while_statement_return do_while_statement() throws RecognitionException {
        GalaxyXDefinitionParser.do_while_statement_return retval = new GalaxyXDefinitionParser.do_while_statement_return();
        retval.start = input.LT(1);
        int do_while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DO220=null;
        Token COLON221=null;
        Token WHILE223=null;
        Token LPAREN224=null;
        Token RPAREN226=null;
        Token END227=null;
        Token DO228=null;
        GalaxyXDefinitionParser.statement_return statement222 = null;

        GalaxyXDefinitionParser.expression_return expression225 = null;


        CommonTree DO220_tree=null;
        CommonTree COLON221_tree=null;
        CommonTree WHILE223_tree=null;
        CommonTree LPAREN224_tree=null;
        CommonTree RPAREN226_tree=null;
        CommonTree END227_tree=null;
        CommonTree DO228_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:292:2: ( DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:292:4: DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO
            {
            DO220=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1506); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO220);

            COLON221=(Token)match(input,COLON,FOLLOW_COLON_in_do_while_statement1508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON221);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:293:4: ( statement )*
            loop64:
            do {
                int alt64=2;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_do_while_statement1513);
            	    statement222=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement222.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            WHILE223=(Token)match(input,WHILE,FOLLOW_WHILE_in_do_while_statement1519); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE223);

            LPAREN224=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_do_while_statement1521); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN224);

            pushFollow(FOLLOW_expression_in_do_while_statement1523);
            expression225=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression225.getTree());
            RPAREN226=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_do_while_statement1525); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN226);

            END227=(Token)match(input,END,FOLLOW_END_in_do_while_statement1530); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END227);

            DO228=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO228);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 296:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, do_while_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "do_while_statement"

    public static class jump_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jump_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:300:1: jump_statement : ( BREAK SEMI -> | CONTINUE SEMI -> | RETURN SEMI -> | RETURN expression SEMI ->);
    public final GalaxyXDefinitionParser.jump_statement_return jump_statement() throws RecognitionException {
        GalaxyXDefinitionParser.jump_statement_return retval = new GalaxyXDefinitionParser.jump_statement_return();
        retval.start = input.LT(1);
        int jump_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BREAK229=null;
        Token SEMI230=null;
        Token CONTINUE231=null;
        Token SEMI232=null;
        Token RETURN233=null;
        Token SEMI234=null;
        Token RETURN235=null;
        Token SEMI237=null;
        GalaxyXDefinitionParser.expression_return expression236 = null;


        CommonTree BREAK229_tree=null;
        CommonTree SEMI230_tree=null;
        CommonTree CONTINUE231_tree=null;
        CommonTree SEMI232_tree=null;
        CommonTree RETURN233_tree=null;
        CommonTree SEMI234_tree=null;
        CommonTree RETURN235_tree=null;
        CommonTree SEMI237_tree=null;
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:301:2: ( BREAK SEMI -> | CONTINUE SEMI -> | RETURN SEMI -> | RETURN expression SEMI ->)
            int alt65=4;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:301:4: BREAK SEMI
                    {
                    BREAK229=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement1551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK229);

                    SEMI230=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI230);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 301:15: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:302:4: CONTINUE SEMI
                    {
                    CONTINUE231=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE231);

                    SEMI232=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI232);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 302:18: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:303:4: RETURN SEMI
                    {
                    RETURN233=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN233);

                    SEMI234=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI234);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 303:16: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:304:4: RETURN expression SEMI
                    {
                    RETURN235=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN235);

                    pushFollow(FOLLOW_expression_in_jump_statement1580);
                    expression236=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression236.getTree());
                    SEMI237=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI237);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 304:27: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, jump_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "jump_statement"

    // $ANTLR start synpred3_GalaxyXDefinitionParser
    public final void synpred3_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:18: ( function_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:18: function_decl
        {
        pushFollow(FOLLOW_function_decl_in_synpred3_GalaxyXDefinitionParser174);
        function_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_GalaxyXDefinitionParser

    // $ANTLR start synpred4_GalaxyXDefinitionParser
    public final void synpred4_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:34: ( field_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:34: field_decl
        {
        pushFollow(FOLLOW_field_decl_in_synpred4_GalaxyXDefinitionParser178);
        field_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_GalaxyXDefinitionParser

    // $ANTLR start synpred8_GalaxyXDefinitionParser
    public final void synpred8_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:5: ( field_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:5: field_decl
        {
        pushFollow(FOLLOW_field_decl_in_synpred8_GalaxyXDefinitionParser237);
        field_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_GalaxyXDefinitionParser

    // $ANTLR start synpred9_GalaxyXDefinitionParser
    public final void synpred9_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:18: ( function_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:18: function_decl
        {
        pushFollow(FOLLOW_function_decl_in_synpred9_GalaxyXDefinitionParser241);
        function_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_GalaxyXDefinitionParser

    // $ANTLR start synpred13_GalaxyXDefinitionParser
    public final void synpred13_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:70:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:70:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred13_GalaxyXDefinitionParser298);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_GalaxyXDefinitionParser

    // $ANTLR start synpred16_GalaxyXDefinitionParser
    public final void synpred16_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:78:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:78:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred16_GalaxyXDefinitionParser341);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_GalaxyXDefinitionParser

    // $ANTLR start synpred21_GalaxyXDefinitionParser
    public final void synpred21_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:86:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:86:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred21_GalaxyXDefinitionParser396);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_GalaxyXDefinitionParser

    // $ANTLR start synpred32_GalaxyXDefinitionParser
    public final void synpred32_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:114:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:114:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred32_GalaxyXDefinitionParser545);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_GalaxyXDefinitionParser

    // $ANTLR start synpred71_GalaxyXDefinitionParser
    public final void synpred71_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:210:4: ( IDENTIFIER LPAREN expression_list RPAREN )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:210:4: IDENTIFIER LPAREN expression_list RPAREN
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred71_GalaxyXDefinitionParser1064); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred71_GalaxyXDefinitionParser1066); if (state.failed) return ;
        pushFollow(FOLLOW_expression_list_in_synpred71_GalaxyXDefinitionParser1068);
        expression_list();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred71_GalaxyXDefinitionParser1070); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_GalaxyXDefinitionParser

    // $ANTLR start synpred87_GalaxyXDefinitionParser
    public final void synpred87_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:245:4: ( assignment_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:245:4: assignment_statement
        {
        pushFollow(FOLLOW_assignment_statement_in_synpred87_GalaxyXDefinitionParser1263);
        assignment_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_GalaxyXDefinitionParser

    // $ANTLR start synpred88_GalaxyXDefinitionParser
    public final void synpred88_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:246:4: ( expression_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:246:4: expression_statement
        {
        pushFollow(FOLLOW_expression_statement_in_synpred88_GalaxyXDefinitionParser1268);
        expression_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_GalaxyXDefinitionParser

    // $ANTLR start synpred104_GalaxyXDefinitionParser
    public final void synpred104_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:293:4: ( statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:293:4: statement
        {
        pushFollow(FOLLOW_statement_in_synpred104_GalaxyXDefinitionParser1513);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_GalaxyXDefinitionParser

    // Delegated rules

    public final boolean synpred87_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA2_eotS =
        "\21\uffff";
    static final String DFA2_eofS =
        "\21\uffff";
    static final String DFA2_minS =
        "\1\11\1\uffff\1\22\1\uffff\1\22\5\uffff\1\0\6\uffff";
    static final String DFA2_maxS =
        "\1\127\1\uffff\1\127\1\uffff\1\127\5\uffff\1\0\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\10\uffff";
    static final String DFA2_specialS =
        "\12\uffff\1\0\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\10\uffff\1\5\4\uffff\1\3\10\uffff\1\10\1\uffff\1\4\1\6"+
            "\2\2\61\uffff\1\6",
            "",
            "\1\5\4\uffff\1\3\12\uffff\1\12\1\6\63\uffff\1\6",
            "",
            "\1\5\20\uffff\1\6\63\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 54:4: ( class_decl | function_decl | field_decl | initializer )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_GalaxyXDefinitionParser()) ) {s = 5;}

                        else if ( (synpred4_GalaxyXDefinitionParser()) ) {s = 6;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA5_eotS =
        "\20\uffff";
    static final String DFA5_eofS =
        "\20\uffff";
    static final String DFA5_minS =
        "\1\11\1\uffff\2\22\5\uffff\1\0\6\uffff";
    static final String DFA5_maxS =
        "\1\127\1\uffff\2\127\5\uffff\1\0\6\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\5\2\uffff\1\1\1\uffff\1\2\1\3\1\4\7\uffff";
    static final String DFA5_specialS =
        "\11\uffff\1\0\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\10\uffff\1\6\1\7\1\10\15\uffff\1\3\1\4\2\2\61\uffff\1"+
            "\4",
            "",
            "\1\6\17\uffff\1\11\1\4\63\uffff\1\4",
            "\1\6\20\uffff\1\4\63\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 62:4: ( field_decl | function_decl | constructor_decl | destructor_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_9 = input.LA(1);

                         
                        int index5_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_GalaxyXDefinitionParser()) ) {s = 4;}

                        else if ( (synpred9_GalaxyXDefinitionParser()) ) {s = 6;}

                         
                        input.seek(index5_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\56\uffff";
    static final String DFA7_eofS =
        "\56\uffff";
    static final String DFA7_minS =
        "\1\4\1\53\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA7_maxS =
        "\1\137\1\127\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\31\uffff";
    static final String DFA7_specialS =
        "\25\uffff\1\0\25\uffff\1\1\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\24\7\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\53\1"+
            "\uffff\1\25\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 70:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_21 = input.LA(1);

                         
                        int index7_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_43 = input.LA(1);

                         
                        int index7_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_43);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\24\uffff";
    static final String DFA8_eofS =
        "\24\uffff";
    static final String DFA8_minS =
        "\1\4\23\uffff";
    static final String DFA8_maxS =
        "\1\137\23\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA8_specialS =
        "\24\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\15\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 71:4: ( statement )*";
        }
    }
    static final String DFA10_eotS =
        "\56\uffff";
    static final String DFA10_eofS =
        "\56\uffff";
    static final String DFA10_minS =
        "\1\4\1\53\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA10_maxS =
        "\1\137\1\127\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\31\uffff";
    static final String DFA10_specialS =
        "\25\uffff\1\0\25\uffff\1\1\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\24\7\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\53\1"+
            "\uffff\1\25\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 78:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_21 = input.LA(1);

                         
                        int index10_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_43 = input.LA(1);

                         
                        int index10_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_43);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\24\uffff";
    static final String DFA11_eofS =
        "\24\uffff";
    static final String DFA11_minS =
        "\1\4\23\uffff";
    static final String DFA11_maxS =
        "\1\137\23\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA11_specialS =
        "\24\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\15\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 79:4: ( statement )*";
        }
    }
    static final String DFA15_eotS =
        "\56\uffff";
    static final String DFA15_eofS =
        "\56\uffff";
    static final String DFA15_minS =
        "\1\4\1\53\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA15_maxS =
        "\1\137\1\127\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\31\uffff";
    static final String DFA15_specialS =
        "\25\uffff\1\0\25\uffff\1\1\2\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\24\7\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\53\1"+
            "\uffff\1\25\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 86:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_21 = input.LA(1);

                         
                        int index15_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_43 = input.LA(1);

                         
                        int index15_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_43);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\24\uffff";
    static final String DFA16_eofS =
        "\24\uffff";
    static final String DFA16_minS =
        "\1\4\23\uffff";
    static final String DFA16_maxS =
        "\1\137\23\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA16_specialS =
        "\24\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\15\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 87:4: ( statement )*";
        }
    }
    static final String DFA26_eotS =
        "\56\uffff";
    static final String DFA26_eofS =
        "\56\uffff";
    static final String DFA26_minS =
        "\1\4\1\53\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA26_maxS =
        "\1\137\1\127\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\31\uffff";
    static final String DFA26_specialS =
        "\25\uffff\1\0\25\uffff\1\1\2\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\24\7\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\53\1"+
            "\uffff\1\25\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            return "()* loopback of 114:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_21 = input.LA(1);

                         
                        int index26_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_43 = input.LA(1);

                         
                        int index26_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_43);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\24\uffff";
    static final String DFA27_eofS =
        "\24\uffff";
    static final String DFA27_minS =
        "\1\4\23\uffff";
    static final String DFA27_maxS =
        "\1\137\23\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA27_specialS =
        "\24\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\15\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 115:4: ( statement )*";
        }
    }
    static final String DFA31_eotS =
        "\12\uffff";
    static final String DFA31_eofS =
        "\1\1\11\uffff";
    static final String DFA31_minS =
        "\1\53\11\uffff";
    static final String DFA31_maxS =
        "\1\124\11\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA31_specialS =
        "\12\uffff}>";
    static final String[] DFA31_transitionS = {
            "\2\1\11\uffff\1\11\3\uffff\2\1\10\uffff\13\1\1\uffff\1\1\3"+
            "\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 165:28: ( OR exclusive_or_expression )*";
        }
    }
    static final String DFA32_eotS =
        "\13\uffff";
    static final String DFA32_eofS =
        "\1\1\12\uffff";
    static final String DFA32_minS =
        "\1\53\12\uffff";
    static final String DFA32_maxS =
        "\1\124\12\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA32_specialS =
        "\13\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\1\11\uffff\1\1\1\12\2\uffff\2\1\10\uffff\13\1\1\uffff\1"+
            "\1\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 169:19: ( XOR and_expression )*";
        }
    }
    static final String DFA33_eotS =
        "\14\uffff";
    static final String DFA33_eofS =
        "\1\1\13\uffff";
    static final String DFA33_minS =
        "\1\53\13\uffff";
    static final String DFA33_maxS =
        "\1\124\13\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA33_specialS =
        "\14\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\1\10\uffff\1\13\2\1\2\uffff\2\1\10\uffff\13\1\1\uffff\1"+
            "\1\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 173:25: ( AND equality_expression )*";
        }
    }
    static final String DFA35_eotS =
        "\16\uffff";
    static final String DFA35_eofS =
        "\1\1\15\uffff";
    static final String DFA35_minS =
        "\1\53\15\uffff";
    static final String DFA35_maxS =
        "\1\124\15\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\2\12\uffff\1\1\1\uffff";
    static final String DFA35_specialS =
        "\16\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\1\10\uffff\3\1\2\uffff\2\1\2\14\6\uffff\13\1\1\uffff\1\1"+
            "\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 177:27: ( ( EQ | NEQ ) relational_expression )*";
        }
    }
    static final String DFA37_eotS =
        "\22\uffff";
    static final String DFA37_eofS =
        "\1\1\21\uffff";
    static final String DFA37_minS =
        "\1\53\21\uffff";
    static final String DFA37_maxS =
        "\1\124\21\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\2\14\uffff\1\1\3\uffff";
    static final String DFA37_specialS =
        "\22\uffff}>";
    static final String[] DFA37_transitionS = {
            "\2\1\10\uffff\3\1\2\uffff\4\1\4\16\2\uffff\13\1\1\uffff\1\1"+
            "\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 181:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*";
        }
    }
    static final String DFA39_eotS =
        "\24\uffff";
    static final String DFA39_eofS =
        "\1\1\23\uffff";
    static final String DFA39_minS =
        "\1\53\23\uffff";
    static final String DFA39_maxS =
        "\1\124\23\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\2\20\uffff\1\1\1\uffff";
    static final String DFA39_specialS =
        "\24\uffff}>";
    static final String[] DFA39_transitionS = {
            "\2\1\10\uffff\3\1\2\uffff\10\1\2\22\13\1\1\uffff\1\1\3\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "()* loopback of 185:25: ( ( SHIFTL | SHIFTR ) additive_expression )*";
        }
    }
    static final String DFA41_eotS =
        "\26\uffff";
    static final String DFA41_eofS =
        "\1\1\25\uffff";
    static final String DFA41_minS =
        "\1\53\25\uffff";
    static final String DFA41_maxS =
        "\1\124\25\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\22\uffff\1\1\1\uffff";
    static final String DFA41_specialS =
        "\26\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\1\3\uffff\2\24\3\uffff\3\1\2\uffff\25\1\1\uffff\1\1\3\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 189:31: ( ( PLUS | SUB ) multiplicative_expression )*";
        }
    }
    static final String DFA43_eotS =
        "\30\uffff";
    static final String DFA43_eofS =
        "\1\1\27\uffff";
    static final String DFA43_minS =
        "\1\53\27\uffff";
    static final String DFA43_maxS =
        "\1\124\27\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\2\24\uffff\1\1\1\uffff";
    static final String DFA43_specialS =
        "\30\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\1\3\uffff\2\1\2\26\1\uffff\3\1\2\uffff\25\1\1\uffff\1\1"+
            "\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 193:23: ( ( TIMES | DIV ) modulo_expression )*";
        }
    }
    static final String DFA44_eotS =
        "\31\uffff";
    static final String DFA44_eofS =
        "\1\1\30\uffff";
    static final String DFA44_minS =
        "\1\53\30\uffff";
    static final String DFA44_maxS =
        "\1\124\30\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\2\26\uffff\1\1";
    static final String DFA44_specialS =
        "\31\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\1\3\uffff\4\1\1\30\3\1\2\uffff\25\1\1\uffff\1\1\3\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "()* loopback of 197:22: ( MODULO unary_expression )*";
        }
    }
    static final String DFA45_eotS =
        "\13\uffff";
    static final String DFA45_eofS =
        "\13\uffff";
    static final String DFA45_minS =
        "\1\16\12\uffff";
    static final String DFA45_maxS =
        "\1\137\12\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\5\uffff";
    static final String DFA45_specialS =
        "\13\uffff}>";
    static final String[] DFA45_transitionS = {
            "\3\1\12\uffff\2\5\1\1\22\uffff\2\5\6\uffff\2\5\25\uffff\1\1"+
            "\7\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "200:1: unary_expression : ( postfix_expression | unary_operator unary_expression ->);";
        }
    }
    static final String DFA48_eotS =
        "\74\uffff";
    static final String DFA48_eofS =
        "\1\uffff\1\2\1\uffff\1\2\70\uffff";
    static final String DFA48_minS =
        "\1\16\1\53\1\uffff\1\53\2\uffff\1\0\65\uffff";
    static final String DFA48_maxS =
        "\1\137\1\125\1\uffff\1\124\2\uffff\1\0\65\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\1\2\uffff\1\3\31\uffff\1\2\1\4\31\uffff\1\5\1\6";
    static final String DFA48_specialS =
        "\6\uffff\1\0\65\uffff}>";
    static final String[] DFA48_transitionS = {
            "\3\2\14\uffff\1\3\61\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\2\2\1\37\2\uffff\10\2\2\uffff\25\2\1\6\1\2\2\uffff\1\40\1"+
            "\2\1\5",
            "",
            "\2\2\1\37\2\uffff\10\2\2\uffff\25\2\1\uffff\1\2\3\uffff\1"+
            "\2",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "205:1: postfix_expression : ( primary_expression -> | ( IDENTIFIER | THIS ) DOT postfix_expression -> | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> | IDENTIFIER ( LBRACK expression RBRACK )+ -> | IDENTIFIER LPAREN expression_list RPAREN -> | IDENTIFIER LPAREN RPAREN ->);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_6 = input.LA(1);

                         
                        int index48_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_GalaxyXDefinitionParser()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index48_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\32\uffff";
    static final String DFA47_eofS =
        "\1\1\31\uffff";
    static final String DFA47_minS =
        "\1\53\31\uffff";
    static final String DFA47_maxS =
        "\1\124\31\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\27\uffff\1\1";
    static final String DFA47_specialS =
        "\32\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\1\3\uffff\10\1\2\uffff\25\1\1\uffff\1\1\2\uffff\1\31\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "()+ loopback of 209:15: ( LBRACK expression RBRACK )+";
        }
    }
    static final String DFA52_eotS =
        "\u009a\uffff";
    static final String DFA52_eofS =
        "\u009a\uffff";
    static final String DFA52_minS =
        "\1\4\1\53\1\16\2\53\6\16\10\uffff\24\0\1\uffff\2\0\1\uffff\34\0"+
        "\1\uffff\1\0\1\uffff\22\0\2\uffff\74\0";
    static final String DFA52_maxS =
        "\1\137\1\125\1\137\2\116\6\137\10\uffff\24\0\1\uffff\2\0\1\uffff"+
        "\34\0\1\uffff\1\0\1\uffff\22\0\2\uffff\74\0";
    static final String DFA52_acceptS =
        "\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\26\uffff\1\1\162\uffff";
    static final String DFA52_specialS =
        "\23\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\uffff\1\24\1\25\1\uffff"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
        "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
        "\1\60\1\61\1\uffff\1\62\1\uffff\1\63\1\64\1\65\1\66\1\67\1\70\1"+
        "\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104"+
        "\2\uffff\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1"+
        "\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130"+
        "\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143"+
        "\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
        "\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171"+
        "\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080}>";
    static final String[] DFA52_transitionS = {
            "\1\14\2\uffff\1\15\1\17\1\uffff\1\16\3\20\3\4\12\uffff\1\10"+
            "\1\11\1\3\15\uffff\1\13\4\uffff\1\5\1\6\6\uffff\1\12\1\7\25"+
            "\uffff\1\2\7\uffff\1\1\1\uffff\2\4\2\uffff\1\4\1\uffff\1\4",
            "\1\13\1\uffff\1\50\2\uffff\1\30\1\31\1\27\1\26\1\25\1\42\1"+
            "\44\1\43\2\uffff\1\46\1\45\1\40\1\41\1\34\1\36\1\35\1\37\1\32"+
            "\1\33\13\47\1\24\3\uffff\1\51\1\uffff\1\23",
            "\3\56\12\uffff\1\62\1\63\1\55\22\uffff\1\57\1\60\6\uffff\1"+
            "\64\1\61\25\uffff\1\54\7\uffff\1\53\1\uffff\2\56\2\uffff\1\56"+
            "\1\uffff\1\56",
            "\1\13\1\uffff\1\110\2\uffff\1\70\1\71\1\67\1\66\1\65\1\102"+
            "\1\104\1\103\2\uffff\1\106\1\105\1\100\1\101\1\74\1\76\1\75"+
            "\1\77\1\72\1\73\13\47",
            "\1\13\4\uffff\1\115\1\116\1\114\1\113\1\112\1\127\1\131\1"+
            "\130\2\uffff\1\133\1\132\1\125\1\126\1\121\1\123\1\122\1\124"+
            "\1\117\1\120\13\47",
            "\3\141\12\uffff\1\145\1\146\1\140\22\uffff\1\142\1\143\6\uffff"+
            "\1\147\1\144\25\uffff\1\137\7\uffff\1\136\1\uffff\2\141\2\uffff"+
            "\1\141\1\uffff\1\141",
            "\3\153\12\uffff\1\157\1\160\1\152\22\uffff\1\154\1\155\6\uffff"+
            "\1\161\1\156\25\uffff\1\151\7\uffff\1\150\1\uffff\2\153\2\uffff"+
            "\1\153\1\uffff\1\153",
            "\3\165\12\uffff\1\171\1\172\1\164\22\uffff\1\166\1\167\6\uffff"+
            "\1\173\1\170\25\uffff\1\163\7\uffff\1\162\1\uffff\2\165\2\uffff"+
            "\1\165\1\uffff\1\165",
            "\3\177\12\uffff\1\u0083\1\u0084\1\176\22\uffff\1\u0080\1\u0081"+
            "\6\uffff\1\u0085\1\u0082\25\uffff\1\175\7\uffff\1\174\1\uffff"+
            "\2\177\2\uffff\1\177\1\uffff\1\177",
            "\3\u0089\12\uffff\1\u008d\1\u008e\1\u0088\22\uffff\1\u008a"+
            "\1\u008b\6\uffff\1\u008f\1\u008c\25\uffff\1\u0087\7\uffff\1"+
            "\u0086\1\uffff\2\u0089\2\uffff\1\u0089\1\uffff\1\u0089",
            "\3\u0093\12\uffff\1\u0097\1\u0098\1\u0092\22\uffff\1\u0094"+
            "\1\u0095\6\uffff\1\u0099\1\u0096\25\uffff\1\u0091\7\uffff\1"+
            "\u0090\1\uffff\2\u0093\2\uffff\1\u0093\1\uffff\1\u0093",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "244:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_19 = input.LA(1);

                         
                        int index52_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_20 = input.LA(1);

                         
                        int index52_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_21 = input.LA(1);

                         
                        int index52_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA52_22 = input.LA(1);

                         
                        int index52_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_22);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA52_23 = input.LA(1);

                         
                        int index52_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA52_24 = input.LA(1);

                         
                        int index52_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA52_25 = input.LA(1);

                         
                        int index52_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA52_26 = input.LA(1);

                         
                        int index52_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA52_27 = input.LA(1);

                         
                        int index52_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA52_28 = input.LA(1);

                         
                        int index52_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA52_29 = input.LA(1);

                         
                        int index52_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_29);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA52_30 = input.LA(1);

                         
                        int index52_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA52_31 = input.LA(1);

                         
                        int index52_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA52_32 = input.LA(1);

                         
                        int index52_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA52_33 = input.LA(1);

                         
                        int index52_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_33);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA52_34 = input.LA(1);

                         
                        int index52_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_34);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA52_35 = input.LA(1);

                         
                        int index52_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_35);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA52_36 = input.LA(1);

                         
                        int index52_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_36);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA52_37 = input.LA(1);

                         
                        int index52_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_37);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA52_38 = input.LA(1);

                         
                        int index52_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_38);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA52_40 = input.LA(1);

                         
                        int index52_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_40);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA52_41 = input.LA(1);

                         
                        int index52_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_41);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA52_43 = input.LA(1);

                         
                        int index52_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_43);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA52_44 = input.LA(1);

                         
                        int index52_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_44);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA52_45 = input.LA(1);

                         
                        int index52_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_45);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA52_46 = input.LA(1);

                         
                        int index52_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_46);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA52_47 = input.LA(1);

                         
                        int index52_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_47);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA52_48 = input.LA(1);

                         
                        int index52_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_48);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA52_49 = input.LA(1);

                         
                        int index52_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_49);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA52_50 = input.LA(1);

                         
                        int index52_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_50);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA52_51 = input.LA(1);

                         
                        int index52_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_51);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA52_52 = input.LA(1);

                         
                        int index52_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_52);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA52_53 = input.LA(1);

                         
                        int index52_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_53);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA52_54 = input.LA(1);

                         
                        int index52_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_54);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA52_55 = input.LA(1);

                         
                        int index52_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_55);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA52_56 = input.LA(1);

                         
                        int index52_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_56);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA52_57 = input.LA(1);

                         
                        int index52_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_57);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA52_58 = input.LA(1);

                         
                        int index52_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_58);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA52_59 = input.LA(1);

                         
                        int index52_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_59);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA52_60 = input.LA(1);

                         
                        int index52_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_60);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA52_61 = input.LA(1);

                         
                        int index52_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_61);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA52_62 = input.LA(1);

                         
                        int index52_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_62);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA52_63 = input.LA(1);

                         
                        int index52_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_63);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA52_64 = input.LA(1);

                         
                        int index52_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_64);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA52_65 = input.LA(1);

                         
                        int index52_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_65);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA52_66 = input.LA(1);

                         
                        int index52_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_66);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA52_67 = input.LA(1);

                         
                        int index52_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_67);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA52_68 = input.LA(1);

                         
                        int index52_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_68);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA52_69 = input.LA(1);

                         
                        int index52_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_69);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA52_70 = input.LA(1);

                         
                        int index52_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_70);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA52_72 = input.LA(1);

                         
                        int index52_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_72);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA52_74 = input.LA(1);

                         
                        int index52_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_74);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA52_75 = input.LA(1);

                         
                        int index52_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_75);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA52_76 = input.LA(1);

                         
                        int index52_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_76);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA52_77 = input.LA(1);

                         
                        int index52_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_77);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA52_78 = input.LA(1);

                         
                        int index52_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_78);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA52_79 = input.LA(1);

                         
                        int index52_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_79);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA52_80 = input.LA(1);

                         
                        int index52_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_80);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA52_81 = input.LA(1);

                         
                        int index52_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_81);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA52_82 = input.LA(1);

                         
                        int index52_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_82);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA52_83 = input.LA(1);

                         
                        int index52_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_83);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA52_84 = input.LA(1);

                         
                        int index52_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_84);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA52_85 = input.LA(1);

                         
                        int index52_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_85);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA52_86 = input.LA(1);

                         
                        int index52_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_86);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA52_87 = input.LA(1);

                         
                        int index52_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_87);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA52_88 = input.LA(1);

                         
                        int index52_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_88);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA52_89 = input.LA(1);

                         
                        int index52_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_89);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA52_90 = input.LA(1);

                         
                        int index52_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_90);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA52_91 = input.LA(1);

                         
                        int index52_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_91);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA52_94 = input.LA(1);

                         
                        int index52_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_94);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA52_95 = input.LA(1);

                         
                        int index52_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_95);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA52_96 = input.LA(1);

                         
                        int index52_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_96);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA52_97 = input.LA(1);

                         
                        int index52_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_97);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA52_98 = input.LA(1);

                         
                        int index52_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_98);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA52_99 = input.LA(1);

                         
                        int index52_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_99);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA52_100 = input.LA(1);

                         
                        int index52_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_100);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA52_101 = input.LA(1);

                         
                        int index52_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_101);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA52_102 = input.LA(1);

                         
                        int index52_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_102);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA52_103 = input.LA(1);

                         
                        int index52_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_103);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA52_104 = input.LA(1);

                         
                        int index52_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_104);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA52_105 = input.LA(1);

                         
                        int index52_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_105);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA52_106 = input.LA(1);

                         
                        int index52_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_106);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA52_107 = input.LA(1);

                         
                        int index52_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_107);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA52_108 = input.LA(1);

                         
                        int index52_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_108);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA52_109 = input.LA(1);

                         
                        int index52_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_109);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA52_110 = input.LA(1);

                         
                        int index52_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_110);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA52_111 = input.LA(1);

                         
                        int index52_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_111);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA52_112 = input.LA(1);

                         
                        int index52_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_112);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA52_113 = input.LA(1);

                         
                        int index52_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_113);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA52_114 = input.LA(1);

                         
                        int index52_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_114);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA52_115 = input.LA(1);

                         
                        int index52_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_115);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA52_116 = input.LA(1);

                         
                        int index52_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_116);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA52_117 = input.LA(1);

                         
                        int index52_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_117);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA52_118 = input.LA(1);

                         
                        int index52_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_118);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA52_119 = input.LA(1);

                         
                        int index52_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_119);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA52_120 = input.LA(1);

                         
                        int index52_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_120);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA52_121 = input.LA(1);

                         
                        int index52_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_121);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA52_122 = input.LA(1);

                         
                        int index52_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_122);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA52_123 = input.LA(1);

                         
                        int index52_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_123);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA52_124 = input.LA(1);

                         
                        int index52_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_124);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA52_125 = input.LA(1);

                         
                        int index52_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_125);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA52_126 = input.LA(1);

                         
                        int index52_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_126);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA52_127 = input.LA(1);

                         
                        int index52_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_127);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA52_128 = input.LA(1);

                         
                        int index52_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_128);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA52_129 = input.LA(1);

                         
                        int index52_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_129);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA52_130 = input.LA(1);

                         
                        int index52_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_130);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA52_131 = input.LA(1);

                         
                        int index52_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_131);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA52_132 = input.LA(1);

                         
                        int index52_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_132);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA52_133 = input.LA(1);

                         
                        int index52_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_133);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA52_134 = input.LA(1);

                         
                        int index52_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_134);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA52_135 = input.LA(1);

                         
                        int index52_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_135);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA52_136 = input.LA(1);

                         
                        int index52_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_136);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA52_137 = input.LA(1);

                         
                        int index52_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_137);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA52_138 = input.LA(1);

                         
                        int index52_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_138);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA52_139 = input.LA(1);

                         
                        int index52_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_139);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA52_140 = input.LA(1);

                         
                        int index52_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_140);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA52_141 = input.LA(1);

                         
                        int index52_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_141);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA52_142 = input.LA(1);

                         
                        int index52_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_142);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA52_143 = input.LA(1);

                         
                        int index52_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_143);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA52_144 = input.LA(1);

                         
                        int index52_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_144);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA52_145 = input.LA(1);

                         
                        int index52_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_145);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA52_146 = input.LA(1);

                         
                        int index52_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_146);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA52_147 = input.LA(1);

                         
                        int index52_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_147);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA52_148 = input.LA(1);

                         
                        int index52_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_148);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA52_149 = input.LA(1);

                         
                        int index52_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_149);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA52_150 = input.LA(1);

                         
                        int index52_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_150);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA52_151 = input.LA(1);

                         
                        int index52_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_151);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA52_152 = input.LA(1);

                         
                        int index52_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_152);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA52_153 = input.LA(1);

                         
                        int index52_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred88_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index52_153);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\14\uffff";
    static final String DFA53_eofS =
        "\14\uffff";
    static final String DFA53_minS =
        "\1\16\13\uffff";
    static final String DFA53_maxS =
        "\1\137\13\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA53_specialS =
        "\14\uffff}>";
    static final String[] DFA53_transitionS = {
            "\3\2\12\uffff\3\2\15\uffff\1\1\4\uffff\2\2\6\uffff\2\2\25\uffff"+
            "\1\2\7\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "258:1: expression_statement : ( SEMI | expression SEMI );";
        }
    }
    static final String DFA54_eotS =
        "\26\uffff";
    static final String DFA54_eofS =
        "\26\uffff";
    static final String DFA54_minS =
        "\1\4\25\uffff";
    static final String DFA54_maxS =
        "\1\137\25\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\21\uffff";
    static final String DFA54_specialS =
        "\26\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\4\2\1\2\4\1\1\7\4\12\uffff\3\4\15\uffff\1\4\4\uffff\2\4"+
            "\6\uffff\2\4\25\uffff\1\4\7\uffff\1\4\1\uffff\2\4\2\uffff\1"+
            "\4\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "()* loopback of 265:4: ( statement )*";
        }
    }
    static final String DFA55_eotS =
        "\26\uffff";
    static final String DFA55_eofS =
        "\26\uffff";
    static final String DFA55_minS =
        "\1\4\25\uffff";
    static final String DFA55_maxS =
        "\1\137\25\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\21\uffff";
    static final String DFA55_specialS =
        "\26\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\4\2\1\2\4\1\1\7\4\12\uffff\3\4\15\uffff\1\4\4\uffff\2\4"+
            "\6\uffff\2\4\25\uffff\1\4\7\uffff\1\4\1\uffff\2\4\2\uffff\1"+
            "\4\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "()* loopback of 267:4: ( statement )*";
        }
    }
    static final String DFA57_eotS =
        "\24\uffff";
    static final String DFA57_eofS =
        "\24\uffff";
    static final String DFA57_minS =
        "\1\4\23\uffff";
    static final String DFA57_maxS =
        "\1\137\23\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA57_specialS =
        "\24\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\15\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "()* loopback of 269:4: ( statement )*";
        }
    }
    static final String DFA59_eotS =
        "\24\uffff";
    static final String DFA59_eofS =
        "\24\uffff";
    static final String DFA59_minS =
        "\1\4\23\uffff";
    static final String DFA59_maxS =
        "\1\137\23\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA59_specialS =
        "\24\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\15\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "()* loopback of 277:4: ( statement )*";
        }
    }
    static final String DFA60_eotS =
        "\14\uffff";
    static final String DFA60_eofS =
        "\14\uffff";
    static final String DFA60_minS =
        "\1\16\13\uffff";
    static final String DFA60_maxS =
        "\1\137\13\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA60_specialS =
        "\14\uffff}>";
    static final String[] DFA60_transitionS = {
            "\3\1\12\uffff\3\1\15\uffff\1\13\4\uffff\2\1\6\uffff\2\1\25"+
            "\uffff\1\1\7\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "284:15: ( assignment_expression )?";
        }
    }
    static final String DFA61_eotS =
        "\14\uffff";
    static final String DFA61_eofS =
        "\14\uffff";
    static final String DFA61_minS =
        "\1\16\13\uffff";
    static final String DFA61_maxS =
        "\1\137\13\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA61_specialS =
        "\14\uffff}>";
    static final String[] DFA61_transitionS = {
            "\3\1\12\uffff\3\1\15\uffff\1\13\4\uffff\2\1\6\uffff\2\1\25"+
            "\uffff\1\1\7\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "284:43: ( expression )?";
        }
    }
    static final String DFA62_eotS =
        "\14\uffff";
    static final String DFA62_eofS =
        "\14\uffff";
    static final String DFA62_minS =
        "\1\16\13\uffff";
    static final String DFA62_maxS =
        "\1\137\13\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA62_specialS =
        "\14\uffff}>";
    static final String[] DFA62_transitionS = {
            "\3\1\12\uffff\3\1\22\uffff\2\1\6\uffff\2\1\25\uffff\1\1\1\13"+
            "\6\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "284:60: ( expression )?";
        }
    }
    static final String DFA63_eotS =
        "\24\uffff";
    static final String DFA63_eofS =
        "\24\uffff";
    static final String DFA63_minS =
        "\1\4\23\uffff";
    static final String DFA63_maxS =
        "\1\137\23\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA63_specialS =
        "\24\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\15\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "()* loopback of 285:4: ( statement )*";
        }
    }
    static final String DFA64_eotS =
        "\25\uffff";
    static final String DFA64_eofS =
        "\25\uffff";
    static final String DFA64_minS =
        "\1\4\1\117\21\uffff\1\0\1\uffff";
    static final String DFA64_maxS =
        "\1\137\1\117\21\uffff\1\0\1\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA64_specialS =
        "\23\uffff\1\0\1\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\2\2\uffff\1\1\1\2\1\uffff\7\2\12\uffff\3\2\15\uffff\1\2"+
            "\4\uffff\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\2\1\uffff\2"+
            "\2\2\uffff\1\2\1\uffff\1\2",
            "\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "()* loopback of 293:4: ( statement )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_19 = input.LA(1);

                         
                        int index64_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_GalaxyXDefinitionParser()) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index64_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\17\uffff";
    static final String DFA65_eofS =
        "\17\uffff";
    static final String DFA65_minS =
        "\1\13\2\uffff\1\16\13\uffff";
    static final String DFA65_maxS =
        "\1\15\2\uffff\1\137\13\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\11\uffff";
    static final String DFA65_specialS =
        "\17\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\1\2\1\3",
            "",
            "",
            "\3\5\12\uffff\3\5\15\uffff\1\4\4\uffff\2\5\6\uffff\2\5\25"+
            "\uffff\1\5\7\uffff\1\5\1\uffff\2\5\2\uffff\1\5\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "300:1: jump_statement : ( BREAK SEMI -> | CONTINUE SEMI -> | RETURN SEMI -> | RETURN expression SEMI ->);";
        }
    }
 

    public static final BitSet FOLLOW_namespace_decl_in_parse148 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_decl162 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_namespace_decl164 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_class_decl_in_namespace_decl170 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_function_decl_in_namespace_decl174 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_field_decl_in_namespace_decl178 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_initializer_in_namespace_decl182 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_END_in_namespace_decl188 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_class_decl217 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl222 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_EXTENDS_in_class_decl225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl227 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_class_decl231 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_field_decl_in_class_decl237 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_function_decl_in_class_decl241 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_constructor_decl_in_class_decl245 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_destructor_decl_in_class_decl249 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_END_in_class_decl255 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_constructor_decl286 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_constructor_decl288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_constructor_decl291 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_constructor_decl293 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_constructor_decl298 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_constructor_decl304 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_constructor_decl309 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_destructor_decl329 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_destructor_decl331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_destructor_decl334 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_destructor_decl336 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_destructor_decl341 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_destructor_decl347 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_destructor_decl352 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_function_decl370 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_STATIC_in_function_decl373 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_decl378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_function_decl380 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_function_decl382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_function_decl385 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RETURNS_in_function_decl387 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_function_decl389 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_function_decl391 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_function_decl396 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_function_decl402 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_function_decl407 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameter_list425 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list428 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list430 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_type_in_parameter448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_local_var_decl466 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_local_var_decl469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_array_in_local_var_decl471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var_decl474 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSGN_in_local_var_decl477 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_local_var_decl479 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_local_var_decl483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_field_decl499 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STATIC_in_field_decl502 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CONST_in_field_decl505 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_field_decl508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_array_in_field_decl510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl513 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSGN_in_field_decl516 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_field_decl518 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_field_decl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer538 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_initializer540 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_initializer545 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_initializer551 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_initializer556 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACK_in_array575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_type592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_assignment_expression633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007FF0L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression635 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_assignment_expression637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression726 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_LOR_in_logical_or_expression729 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression731 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression746 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_LAND_in_logical_and_expression749 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression751 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression767 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OR_in_or_expression770 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression772 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression788 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_XOR_in_exclusive_or_expression791 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression793 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression810 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_AND_in_and_expression813 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression815 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression832 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_EQ_in_equality_expression836 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_NEQ_in_equality_expression838 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression841 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression857 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_LT_in_relational_expression861 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_GT_in_relational_expression863 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_LTEQ_in_relational_expression865 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_GTEQ_in_relational_expression867 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression870 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression886 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_SHIFTL_in_shift_expression890 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_SHIFTR_in_shift_expression892 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression895 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression912 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression916 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_SUB_in_additive_expression920 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression923 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression939 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_TIMES_in_multiplicative_expression943 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_DIV_in_multiplicative_expression947 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression950 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression967 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_MODULO_in_modulo_expression970 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression972 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression995 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1018 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_THIS_in_postfix_expression1022 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1025 = new BitSet(new long[]{0x000000002001C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1037 = new BitSet(new long[]{0x000000002001C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACK_in_postfix_expression1050 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix_expression1054 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1066 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_list_in_postfix_expression1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1096 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list1099 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_expression_list1102 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary_expression1120 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_primary_expression1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_primary_expression1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_operator1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unary_operator1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_operator1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unary_operator1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unary_operator1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_unary_operator1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_statement1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_statement_in_statement1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_statement1305 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_assignment_statement1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement1326 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1343 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_if_statement1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1347 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1349 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1354 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_ELIF_in_if_statement1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1362 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_if_statement1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1366 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1368 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1373 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_ELSE_in_if_statement1381 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1383 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1389 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_if_statement1396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IF_in_if_statement1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_while_statement1419 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_while_statement1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_while_statement1423 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_while_statement1425 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_while_statement1430 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_while_statement1435 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement1456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_for_statement1458 = new BitSet(new long[]{0x030308003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_assignment_expression_in_for_statement1460 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1463 = new BitSet(new long[]{0x030308003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_for_statement1465 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1468 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6818000L});
    public static final BitSet FOLLOW_expression_in_for_statement1470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_for_statement1473 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_for_statement1475 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_for_statement1480 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_for_statement1485 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FOR_in_for_statement1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1506 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_do_while_statement1508 = new BitSet(new long[]{0x030308003801FD90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_do_while_statement1513 = new BitSet(new long[]{0x030308003801FD90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_WHILE_in_do_while_statement1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_do_while_statement1521 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_do_while_statement1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_do_while_statement1525 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_do_while_statement1530 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement1551 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement1560 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1569 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1578 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_jump_statement1580 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_decl_in_synpred3_GalaxyXDefinitionParser174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_decl_in_synpred4_GalaxyXDefinitionParser178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_decl_in_synpred8_GalaxyXDefinitionParser237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_decl_in_synpred9_GalaxyXDefinitionParser241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred13_GalaxyXDefinitionParser298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred16_GalaxyXDefinitionParser341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred21_GalaxyXDefinitionParser396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred32_GalaxyXDefinitionParser545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred71_GalaxyXDefinitionParser1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred71_GalaxyXDefinitionParser1066 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_list_in_synpred71_GalaxyXDefinitionParser1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred71_GalaxyXDefinitionParser1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_synpred87_GalaxyXDefinitionParser1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_synpred88_GalaxyXDefinitionParser1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred104_GalaxyXDefinitionParser1513 = new BitSet(new long[]{0x0000000000000002L});

}