// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g 2013-03-17 12:45:36

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
            this.state.ruleMemo = new HashMap[148+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GalaxyXDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g"; }


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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:45:1: parse[ErrorHandler eh] : ( namespace_decl )* ;
    public final GalaxyXDefinitionParser.parse_return parse(ErrorHandler eh) throws RecognitionException {
        GalaxyXDefinitionParser.parse_return retval = new GalaxyXDefinitionParser.parse_return();
        retval.start = input.LT(1);
        int parse_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.namespace_decl_return namespace_decl1 = null;




        	this.eh = eh;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:49:2: ( ( namespace_decl )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:49:4: ( namespace_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:49:4: ( namespace_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: namespace_decl
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:52:1: namespace_decl : NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE -> ^( NAMESPACE IDENTIFIER ( class_decl )* ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:53:2: ( NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE -> ^( NAMESPACE IDENTIFIER ( class_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:53:4: NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE
            {
            NAMESPACE2=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl160); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE2);

            IDENTIFIER3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl162); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER3);

            COLON4=(Token)match(input,COLON,FOLLOW_COLON_in_namespace_decl164); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON4);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:4: ( class_decl | function_decl | field_decl | initializer )*
            loop2:
            do {
                int alt2=5;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:5: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl170);
            	    class_decl5=class_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_class_decl.add(class_decl5.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_namespace_decl174);
            	    function_decl6=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_decl.add(function_decl6.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:34: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace_decl178);
            	    field_decl7=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_decl.add(field_decl7.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:54:47: initializer
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
            // elements: class_decl, IDENTIFIER, NAMESPACE
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
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:57:3: ^( NAMESPACE IDENTIFIER ( class_decl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_NAMESPACE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:57:26: ( class_decl )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:60:1: class_decl : ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS -> ^( CLASS ( modifier )? IDENTIFIER ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:2: ( ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS -> ^( CLASS ( modifier )? IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:4: ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:4: ( modifier )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=PRIVATE && LA3_0<=PUBLIC)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: modifier
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:31: ( EXTENDS IDENTIFIER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:32: EXTENDS IDENTIFIER
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:4: ( field_decl | function_decl | constructor_decl | destructor_decl )*
            loop5:
            do {
                int alt5=5;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:5: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl237);
            	    field_decl17=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_decl.add(field_decl17.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_class_decl241);
            	    function_decl18=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_decl.add(function_decl18.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:34: constructor_decl
            	    {
            	    pushFollow(FOLLOW_constructor_decl_in_class_decl245);
            	    constructor_decl19=constructor_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_constructor_decl.add(constructor_decl19.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:62:53: destructor_decl
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
            // elements: modifier, CLASS, IDENTIFIER
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
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:65:3: ^( CLASS ( modifier )? IDENTIFIER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CLASS.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:65:11: ( modifier )?
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:68:1: constructor_decl : CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR ->;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:69:2: ( CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:69:4: CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR
            {
            CONSTRUCTOR23=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTRUCTOR.add(CONSTRUCTOR23);

            LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constructor_decl286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN24);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:69:23: ( parameter_list )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: parameter_list
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:70:4: ( local_var_decl )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:71:4: ( statement )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:76:1: destructor_decl : DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR ->;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:2: ( DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:4: DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR
            {
            DESTRUCTOR32=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTRUCTOR.add(DESTRUCTOR32);

            LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_destructor_decl329); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN33);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:22: ( parameter_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: parameter_list
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:78:4: ( local_var_decl )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:79:4: ( statement )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:84:1: function_decl : ( modifier )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC ->;
    public final GalaxyXDefinitionParser.function_decl_return function_decl() throws RecognitionException {
        GalaxyXDefinitionParser.function_decl_return retval = new GalaxyXDefinitionParser.function_decl_return();
        retval.start = input.LT(1);
        int function_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token FUNC42=null;
        Token IDENTIFIER43=null;
        Token LPAREN44=null;
        Token RPAREN46=null;
        Token RETURNS47=null;
        Token COLON49=null;
        Token END52=null;
        Token FUNC53=null;
        GalaxyXDefinitionParser.modifier_return modifier41 = null;

        GalaxyXDefinitionParser.parameter_list_return parameter_list45 = null;

        GalaxyXDefinitionParser.type_return type48 = null;

        GalaxyXDefinitionParser.local_var_decl_return local_var_decl50 = null;

        GalaxyXDefinitionParser.statement_return statement51 = null;


        CommonTree FUNC42_tree=null;
        CommonTree IDENTIFIER43_tree=null;
        CommonTree LPAREN44_tree=null;
        CommonTree RPAREN46_tree=null;
        CommonTree RETURNS47_tree=null;
        CommonTree COLON49_tree=null;
        CommonTree END52_tree=null;
        CommonTree FUNC53_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:2: ( ( modifier )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:4: ( modifier )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:4: ( modifier )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=PRIVATE && LA12_0<=PUBLIC)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_function_decl370);
                    modifier41=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier41.getTree());

                    }
                    break;

            }

            FUNC42=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNC.add(FUNC42);

            IDENTIFIER43=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_decl375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER43);

            LPAREN44=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_decl377); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN44);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:37: ( parameter_list )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function_decl379);
                    parameter_list45=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list45.getTree());

                    }
                    break;

            }

            RPAREN46=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_decl382); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN46);

            RETURNS47=(Token)match(input,RETURNS,FOLLOW_RETURNS_in_function_decl384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURNS.add(RETURNS47);

            pushFollow(FOLLOW_type_in_function_decl386);
            type48=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type48.getTree());
            COLON49=(Token)match(input,COLON,FOLLOW_COLON_in_function_decl388); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON49);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:86:4: ( local_var_decl )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_function_decl393);
            	    local_var_decl50=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_local_var_decl.add(local_var_decl50.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:87:4: ( statement )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function_decl399);
            	    statement51=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement51.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            END52=(Token)match(input,END,FOLLOW_END_in_function_decl404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END52);

            FUNC53=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNC.add(FUNC53);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:92:1: parameter_list : parameter ( COMMA parameter )* ->;
    public final GalaxyXDefinitionParser.parameter_list_return parameter_list() throws RecognitionException {
        GalaxyXDefinitionParser.parameter_list_return retval = new GalaxyXDefinitionParser.parameter_list_return();
        retval.start = input.LT(1);
        int parameter_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA55=null;
        GalaxyXDefinitionParser.parameter_return parameter54 = null;

        GalaxyXDefinitionParser.parameter_return parameter56 = null;


        CommonTree COMMA55_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:93:2: ( parameter ( COMMA parameter )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:93:4: parameter ( COMMA parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameter_list422);
            parameter54=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter54.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:93:14: ( COMMA parameter )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:93:15: COMMA parameter
            	    {
            	    COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list425); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA55);

            	    pushFollow(FOLLOW_parameter_in_parameter_list427);
            	    parameter56=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter56.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:97:1: parameter : type IDENTIFIER ->;
    public final GalaxyXDefinitionParser.parameter_return parameter() throws RecognitionException {
        GalaxyXDefinitionParser.parameter_return retval = new GalaxyXDefinitionParser.parameter_return();
        retval.start = input.LT(1);
        int parameter_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER58=null;
        GalaxyXDefinitionParser.type_return type57 = null;


        CommonTree IDENTIFIER58_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:98:2: ( type IDENTIFIER ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:98:4: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_parameter445);
            type57=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type57.getTree());
            IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter447); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER58);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:102:1: local_var_decl : ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ->;
    public final GalaxyXDefinitionParser.local_var_decl_return local_var_decl() throws RecognitionException {
        GalaxyXDefinitionParser.local_var_decl_return retval = new GalaxyXDefinitionParser.local_var_decl_return();
        retval.start = input.LT(1);
        int local_var_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token CONST59=null;
        Token IDENTIFIER62=null;
        Token ASSGN63=null;
        Token SEMI65=null;
        GalaxyXDefinitionParser.type_return type60 = null;

        GalaxyXDefinitionParser.array_return array61 = null;

        GalaxyXDefinitionParser.expression_return expression64 = null;


        CommonTree CONST59_tree=null;
        CommonTree IDENTIFIER62_tree=null;
        CommonTree ASSGN63_tree=null;
        CommonTree SEMI65_tree=null;
        RewriteRuleTokenStream stream_ASSGN=new RewriteRuleTokenStream(adaptor,"token ASSGN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_array=new RewriteRuleSubtreeStream(adaptor,"rule array");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:2: ( ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:4: ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:4: ( CONST )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CONST) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: CONST
                    {
                    CONST59=(Token)match(input,CONST,FOLLOW_CONST_in_local_var_decl463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST.add(CONST59);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_local_var_decl466);
            type60=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type60.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:16: ( array )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LBRACK) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_local_var_decl468);
            	    array61=array();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array.add(array61.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var_decl471); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER62);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:34: ( ASSGN expression )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ASSGN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:35: ASSGN expression
                    {
                    ASSGN63=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_local_var_decl474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSGN.add(ASSGN63);

                    pushFollow(FOLLOW_expression_in_local_var_decl476);
                    expression64=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression64.getTree());

                    }
                    break;

            }

            SEMI65=(Token)match(input,SEMI,FOLLOW_SEMI_in_local_var_decl480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI65);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:107:1: field_decl : ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ->;
    public final GalaxyXDefinitionParser.field_decl_return field_decl() throws RecognitionException {
        GalaxyXDefinitionParser.field_decl_return retval = new GalaxyXDefinitionParser.field_decl_return();
        retval.start = input.LT(1);
        int field_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token STATIC67=null;
        Token CONST68=null;
        Token IDENTIFIER71=null;
        Token ASSGN72=null;
        Token SEMI74=null;
        GalaxyXDefinitionParser.modifier_return modifier66 = null;

        GalaxyXDefinitionParser.type_return type69 = null;

        GalaxyXDefinitionParser.array_return array70 = null;

        GalaxyXDefinitionParser.expression_return expression73 = null;


        CommonTree STATIC67_tree=null;
        CommonTree CONST68_tree=null;
        CommonTree IDENTIFIER71_tree=null;
        CommonTree ASSGN72_tree=null;
        CommonTree SEMI74_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:2: ( ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:4: ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:4: ( modifier )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=PRIVATE && LA20_0<=PUBLIC)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_field_decl496);
                    modifier66=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier66.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:14: ( STATIC )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==STATIC) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: STATIC
                    {
                    STATIC67=(Token)match(input,STATIC,FOLLOW_STATIC_in_field_decl499); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STATIC.add(STATIC67);


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:22: ( CONST )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CONST) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: CONST
                    {
                    CONST68=(Token)match(input,CONST,FOLLOW_CONST_in_field_decl502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST.add(CONST68);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_field_decl505);
            type69=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type69.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:34: ( array )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==LBRACK) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_field_decl507);
            	    array70=array();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array.add(array70.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            IDENTIFIER71=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER71);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:52: ( ASSGN expression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ASSGN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:108:53: ASSGN expression
                    {
                    ASSGN72=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_field_decl513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSGN.add(ASSGN72);

                    pushFollow(FOLLOW_expression_in_field_decl515);
                    expression73=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression73.getTree());

                    }
                    break;

            }

            SEMI74=(Token)match(input,SEMI,FOLLOW_SEMI_in_field_decl519); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI74);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:112:1: initializer : INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER ->;
    public final GalaxyXDefinitionParser.initializer_return initializer() throws RecognitionException {
        GalaxyXDefinitionParser.initializer_return retval = new GalaxyXDefinitionParser.initializer_return();
        retval.start = input.LT(1);
        int initializer_StartIndex = input.index();
        CommonTree root_0 = null;

        Token INITIALIZER75=null;
        Token COLON76=null;
        Token END79=null;
        Token INITIALIZER80=null;
        GalaxyXDefinitionParser.local_var_decl_return local_var_decl77 = null;

        GalaxyXDefinitionParser.statement_return statement78 = null;


        CommonTree INITIALIZER75_tree=null;
        CommonTree COLON76_tree=null;
        CommonTree END79_tree=null;
        CommonTree INITIALIZER80_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_INITIALIZER=new RewriteRuleTokenStream(adaptor,"token INITIALIZER");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_local_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule local_var_decl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:113:2: ( INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:113:4: INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER
            {
            INITIALIZER75=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INITIALIZER.add(INITIALIZER75);

            COLON76=(Token)match(input,COLON,FOLLOW_COLON_in_initializer537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON76);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:114:4: ( local_var_decl )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_initializer542);
            	    local_var_decl77=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_local_var_decl.add(local_var_decl77.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:115:4: ( statement )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_initializer548);
            	    statement78=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement78.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            END79=(Token)match(input,END,FOLLOW_END_in_initializer553); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END79);

            INITIALIZER80=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INITIALIZER.add(INITIALIZER80);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:120:1: array : LBRACK RBRACK ->;
    public final GalaxyXDefinitionParser.array_return array() throws RecognitionException {
        GalaxyXDefinitionParser.array_return retval = new GalaxyXDefinitionParser.array_return();
        retval.start = input.LT(1);
        int array_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LBRACK81=null;
        Token RBRACK82=null;

        CommonTree LBRACK81_tree=null;
        CommonTree RBRACK82_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:121:2: ( LBRACK RBRACK ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:121:4: LBRACK RBRACK
            {
            LBRACK81=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK81);

            RBRACK82=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK82);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:124:1: type : ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> | IDENTIFIER ->);
    public final GalaxyXDefinitionParser.type_return type() throws RecognitionException {
        GalaxyXDefinitionParser.type_return retval = new GalaxyXDefinitionParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER83=null;
        Token NAMESPACE_ACCESS84=null;
        Token IDENTIFIER85=null;
        Token IDENTIFIER86=null;

        CommonTree IDENTIFIER83_tree=null;
        CommonTree NAMESPACE_ACCESS84_tree=null;
        CommonTree IDENTIFIER85_tree=null;
        CommonTree IDENTIFIER86_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_NAMESPACE_ACCESS=new RewriteRuleTokenStream(adaptor,"token NAMESPACE_ACCESS");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:125:2: ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> | IDENTIFIER ->)
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IDENTIFIER) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==NAMESPACE_ACCESS) ) {
                    alt27=1;
                }
                else if ( (LA27_1==COLON||LA27_1==LBRACK||LA27_1==IDENTIFIER) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:125:4: IDENTIFIER NAMESPACE_ACCESS IDENTIFIER
                    {
                    IDENTIFIER83=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER83);

                    NAMESPACE_ACCESS84=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_type589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE_ACCESS.add(NAMESPACE_ACCESS84);

                    IDENTIFIER85=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER85);



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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:126:4: IDENTIFIER
                    {
                    IDENTIFIER86=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type599); if (state.failed) return retval; 
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:129:1: modifier : ( PUBLIC | PRIVATE );
    public final GalaxyXDefinitionParser.modifier_return modifier() throws RecognitionException {
        GalaxyXDefinitionParser.modifier_return retval = new GalaxyXDefinitionParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set87=null;

        CommonTree set87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:130:2: ( PUBLIC | PRIVATE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set87=(Token)input.LT(1);
            if ( (input.LA(1)>=PRIVATE && input.LA(1)<=PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set87));
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:134:1: assignment_expression : expression assignment_operator expression ->;
    public final GalaxyXDefinitionParser.assignment_expression_return assignment_expression() throws RecognitionException {
        GalaxyXDefinitionParser.assignment_expression_return retval = new GalaxyXDefinitionParser.assignment_expression_return();
        retval.start = input.LT(1);
        int assignment_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.expression_return expression88 = null;

        GalaxyXDefinitionParser.assignment_operator_return assignment_operator89 = null;

        GalaxyXDefinitionParser.expression_return expression90 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_assignment_operator=new RewriteRuleSubtreeStream(adaptor,"rule assignment_operator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:135:2: ( expression assignment_operator expression ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:135:4: expression assignment_operator expression
            {
            pushFollow(FOLLOW_expression_in_assignment_expression630);
            expression88=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression88.getTree());
            pushFollow(FOLLOW_assignment_operator_in_assignment_expression632);
            assignment_operator89=assignment_operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_operator.add(assignment_operator89.getTree());
            pushFollow(FOLLOW_expression_in_assignment_expression634);
            expression90=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression90.getTree());


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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:138:1: assignment_operator : ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR );
    public final GalaxyXDefinitionParser.assignment_operator_return assignment_operator() throws RecognitionException {
        GalaxyXDefinitionParser.assignment_operator_return retval = new GalaxyXDefinitionParser.assignment_operator_return();
        retval.start = input.LT(1);
        int assignment_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set91=null;

        CommonTree set91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:139:2: ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set91=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSGN && input.LA(1)<=ASSGNBITXOR) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set91));
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:152:1: expression : logical_or_expression ->;
    public final GalaxyXDefinitionParser.expression_return expression() throws RecognitionException {
        GalaxyXDefinitionParser.expression_return retval = new GalaxyXDefinitionParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.logical_or_expression_return logical_or_expression92 = null;


        RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:153:2: ( logical_or_expression ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:153:4: logical_or_expression
            {
            pushFollow(FOLLOW_logical_or_expression_in_expression709);
            logical_or_expression92=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logical_or_expression.add(logical_or_expression92.getTree());


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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:156:1: logical_or_expression : logical_and_expression ( LOR logical_and_expression )* ->;
    public final GalaxyXDefinitionParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        GalaxyXDefinitionParser.logical_or_expression_return retval = new GalaxyXDefinitionParser.logical_or_expression_return();
        retval.start = input.LT(1);
        int logical_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LOR94=null;
        GalaxyXDefinitionParser.logical_and_expression_return logical_and_expression93 = null;

        GalaxyXDefinitionParser.logical_and_expression_return logical_and_expression95 = null;


        CommonTree LOR94_tree=null;
        RewriteRuleTokenStream stream_LOR=new RewriteRuleTokenStream(adaptor,"token LOR");
        RewriteRuleSubtreeStream stream_logical_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_and_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:157:2: ( logical_and_expression ( LOR logical_and_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:157:4: logical_and_expression ( LOR logical_and_expression )*
            {
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression723);
            logical_and_expression93=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logical_and_expression.add(logical_and_expression93.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:157:27: ( LOR logical_and_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==LOR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:157:28: LOR logical_and_expression
            	    {
            	    LOR94=(Token)match(input,LOR,FOLLOW_LOR_in_logical_or_expression726); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LOR.add(LOR94);

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression728);
            	    logical_and_expression95=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_logical_and_expression.add(logical_and_expression95.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:160:1: logical_and_expression : or_expression ( LAND or_expression )* ->;
    public final GalaxyXDefinitionParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        GalaxyXDefinitionParser.logical_and_expression_return retval = new GalaxyXDefinitionParser.logical_and_expression_return();
        retval.start = input.LT(1);
        int logical_and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LAND97=null;
        GalaxyXDefinitionParser.or_expression_return or_expression96 = null;

        GalaxyXDefinitionParser.or_expression_return or_expression98 = null;


        CommonTree LAND97_tree=null;
        RewriteRuleTokenStream stream_LAND=new RewriteRuleTokenStream(adaptor,"token LAND");
        RewriteRuleSubtreeStream stream_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule or_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:161:2: ( or_expression ( LAND or_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:161:4: or_expression ( LAND or_expression )*
            {
            pushFollow(FOLLOW_or_expression_in_logical_and_expression743);
            or_expression96=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_or_expression.add(or_expression96.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:161:18: ( LAND or_expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==LAND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:161:19: LAND or_expression
            	    {
            	    LAND97=(Token)match(input,LAND,FOLLOW_LAND_in_logical_and_expression746); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LAND.add(LAND97);

            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression748);
            	    or_expression98=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_or_expression.add(or_expression98.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:164:1: or_expression : exclusive_or_expression ( OR exclusive_or_expression )* ->;
    public final GalaxyXDefinitionParser.or_expression_return or_expression() throws RecognitionException {
        GalaxyXDefinitionParser.or_expression_return retval = new GalaxyXDefinitionParser.or_expression_return();
        retval.start = input.LT(1);
        int or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OR100=null;
        GalaxyXDefinitionParser.exclusive_or_expression_return exclusive_or_expression99 = null;

        GalaxyXDefinitionParser.exclusive_or_expression_return exclusive_or_expression101 = null;


        CommonTree OR100_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_exclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule exclusive_or_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:165:2: ( exclusive_or_expression ( OR exclusive_or_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:165:4: exclusive_or_expression ( OR exclusive_or_expression )*
            {
            pushFollow(FOLLOW_exclusive_or_expression_in_or_expression764);
            exclusive_or_expression99=exclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression99.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:165:28: ( OR exclusive_or_expression )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:165:29: OR exclusive_or_expression
            	    {
            	    OR100=(Token)match(input,OR,FOLLOW_OR_in_or_expression767); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OR.add(OR100);

            	    pushFollow(FOLLOW_exclusive_or_expression_in_or_expression769);
            	    exclusive_or_expression101=exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression101.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:168:1: exclusive_or_expression : and_expression ( XOR and_expression )* ->;
    public final GalaxyXDefinitionParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
        GalaxyXDefinitionParser.exclusive_or_expression_return retval = new GalaxyXDefinitionParser.exclusive_or_expression_return();
        retval.start = input.LT(1);
        int exclusive_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token XOR103=null;
        GalaxyXDefinitionParser.and_expression_return and_expression102 = null;

        GalaxyXDefinitionParser.and_expression_return and_expression104 = null;


        CommonTree XOR103_tree=null;
        RewriteRuleTokenStream stream_XOR=new RewriteRuleTokenStream(adaptor,"token XOR");
        RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:169:2: ( and_expression ( XOR and_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:169:4: and_expression ( XOR and_expression )*
            {
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression785);
            and_expression102=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_and_expression.add(and_expression102.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:169:19: ( XOR and_expression )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:169:20: XOR and_expression
            	    {
            	    XOR103=(Token)match(input,XOR,FOLLOW_XOR_in_exclusive_or_expression788); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_XOR.add(XOR103);

            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression790);
            	    and_expression104=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_and_expression.add(and_expression104.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:172:1: and_expression : equality_expression ( AND equality_expression )* ->;
    public final GalaxyXDefinitionParser.and_expression_return and_expression() throws RecognitionException {
        GalaxyXDefinitionParser.and_expression_return retval = new GalaxyXDefinitionParser.and_expression_return();
        retval.start = input.LT(1);
        int and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token AND106=null;
        GalaxyXDefinitionParser.equality_expression_return equality_expression105 = null;

        GalaxyXDefinitionParser.equality_expression_return equality_expression107 = null;


        CommonTree AND106_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_equality_expression=new RewriteRuleSubtreeStream(adaptor,"rule equality_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:173:2: ( equality_expression ( AND equality_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:173:5: equality_expression ( AND equality_expression )*
            {
            pushFollow(FOLLOW_equality_expression_in_and_expression807);
            equality_expression105=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_equality_expression.add(equality_expression105.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:173:25: ( AND equality_expression )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:173:26: AND equality_expression
            	    {
            	    AND106=(Token)match(input,AND,FOLLOW_AND_in_and_expression810); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND106);

            	    pushFollow(FOLLOW_equality_expression_in_and_expression812);
            	    equality_expression107=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_equality_expression.add(equality_expression107.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:176:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ->;
    public final GalaxyXDefinitionParser.equality_expression_return equality_expression() throws RecognitionException {
        GalaxyXDefinitionParser.equality_expression_return retval = new GalaxyXDefinitionParser.equality_expression_return();
        retval.start = input.LT(1);
        int equality_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token EQ109=null;
        Token NEQ110=null;
        GalaxyXDefinitionParser.relational_expression_return relational_expression108 = null;

        GalaxyXDefinitionParser.relational_expression_return relational_expression111 = null;


        CommonTree EQ109_tree=null;
        CommonTree NEQ110_tree=null;
        RewriteRuleTokenStream stream_NEQ=new RewriteRuleTokenStream(adaptor,"token NEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_relational_expression=new RewriteRuleSubtreeStream(adaptor,"rule relational_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:5: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            pushFollow(FOLLOW_relational_expression_in_equality_expression829);
            relational_expression108=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression108.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:27: ( ( EQ | NEQ ) relational_expression )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:28: ( EQ | NEQ ) relational_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:28: ( EQ | NEQ )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==EQ) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==NEQ) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:29: EQ
            	            {
            	            EQ109=(Token)match(input,EQ,FOLLOW_EQ_in_equality_expression833); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_EQ.add(EQ109);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:32: NEQ
            	            {
            	            NEQ110=(Token)match(input,NEQ,FOLLOW_NEQ_in_equality_expression835); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NEQ.add(NEQ110);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression838);
            	    relational_expression111=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression111.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:180:1: relational_expression : shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* ->;
    public final GalaxyXDefinitionParser.relational_expression_return relational_expression() throws RecognitionException {
        GalaxyXDefinitionParser.relational_expression_return retval = new GalaxyXDefinitionParser.relational_expression_return();
        retval.start = input.LT(1);
        int relational_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LT113=null;
        Token GT114=null;
        Token LTEQ115=null;
        Token GTEQ116=null;
        GalaxyXDefinitionParser.shift_expression_return shift_expression112 = null;

        GalaxyXDefinitionParser.shift_expression_return shift_expression117 = null;


        CommonTree LT113_tree=null;
        CommonTree GT114_tree=null;
        CommonTree LTEQ115_tree=null;
        CommonTree GTEQ116_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_GTEQ=new RewriteRuleTokenStream(adaptor,"token GTEQ");
        RewriteRuleTokenStream stream_LTEQ=new RewriteRuleTokenStream(adaptor,"token LTEQ");
        RewriteRuleSubtreeStream stream_shift_expression=new RewriteRuleSubtreeStream(adaptor,"rule shift_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:2: ( shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:5: shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            {
            pushFollow(FOLLOW_shift_expression_in_relational_expression854);
            shift_expression112=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_shift_expression.add(shift_expression112.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:23: ( LT | GT | LTEQ | GTEQ ) shift_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:23: ( LT | GT | LTEQ | GTEQ )
            	    int alt35=4;
            	    switch ( input.LA(1) ) {
            	    case LT:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt35=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:24: LT
            	            {
            	            LT113=(Token)match(input,LT,FOLLOW_LT_in_relational_expression858); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_LT.add(LT113);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:27: GT
            	            {
            	            GT114=(Token)match(input,GT,FOLLOW_GT_in_relational_expression860); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_GT.add(GT114);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:30: LTEQ
            	            {
            	            LTEQ115=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_relational_expression862); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_LTEQ.add(LTEQ115);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:35: GTEQ
            	            {
            	            GTEQ116=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_relational_expression864); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_GTEQ.add(GTEQ116);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression867);
            	    shift_expression117=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_shift_expression.add(shift_expression117.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:184:1: shift_expression : additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* ->;
    public final GalaxyXDefinitionParser.shift_expression_return shift_expression() throws RecognitionException {
        GalaxyXDefinitionParser.shift_expression_return retval = new GalaxyXDefinitionParser.shift_expression_return();
        retval.start = input.LT(1);
        int shift_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SHIFTL119=null;
        Token SHIFTR120=null;
        GalaxyXDefinitionParser.additive_expression_return additive_expression118 = null;

        GalaxyXDefinitionParser.additive_expression_return additive_expression121 = null;


        CommonTree SHIFTL119_tree=null;
        CommonTree SHIFTR120_tree=null;
        RewriteRuleTokenStream stream_SHIFTR=new RewriteRuleTokenStream(adaptor,"token SHIFTR");
        RewriteRuleTokenStream stream_SHIFTL=new RewriteRuleTokenStream(adaptor,"token SHIFTL");
        RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:2: ( additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:5: additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )*
            {
            pushFollow(FOLLOW_additive_expression_in_shift_expression883);
            additive_expression118=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_additive_expression.add(additive_expression118.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:25: ( ( SHIFTL | SHIFTR ) additive_expression )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:26: ( SHIFTL | SHIFTR ) additive_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:26: ( SHIFTL | SHIFTR )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==SHIFTL) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==SHIFTR) ) {
            	        alt37=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:27: SHIFTL
            	            {
            	            SHIFTL119=(Token)match(input,SHIFTL,FOLLOW_SHIFTL_in_shift_expression887); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_SHIFTL.add(SHIFTL119);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:34: SHIFTR
            	            {
            	            SHIFTR120=(Token)match(input,SHIFTR,FOLLOW_SHIFTR_in_shift_expression889); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_SHIFTR.add(SHIFTR120);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression892);
            	    additive_expression121=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_additive_expression.add(additive_expression121.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:188:1: additive_expression : multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* ->;
    public final GalaxyXDefinitionParser.additive_expression_return additive_expression() throws RecognitionException {
        GalaxyXDefinitionParser.additive_expression_return retval = new GalaxyXDefinitionParser.additive_expression_return();
        retval.start = input.LT(1);
        int additive_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS123=null;
        Token SUB124=null;
        GalaxyXDefinitionParser.multiplicative_expression_return multiplicative_expression122 = null;

        GalaxyXDefinitionParser.multiplicative_expression_return multiplicative_expression125 = null;


        CommonTree PLUS123_tree=null;
        CommonTree SUB124_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
        RewriteRuleSubtreeStream stream_multiplicative_expression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:2: ( multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:5: multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )*
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression909);
            multiplicative_expression122=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multiplicative_expression.add(multiplicative_expression122.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:31: ( ( PLUS | SUB ) multiplicative_expression )*
            loop40:
            do {
                int alt40=2;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:32: ( PLUS | SUB ) multiplicative_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:32: ( PLUS | SUB )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==PLUS) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==SUB) ) {
            	        alt39=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:33: PLUS
            	            {
            	            PLUS123=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression913); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_PLUS.add(PLUS123);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:40: SUB
            	            {
            	            SUB124=(Token)match(input,SUB,FOLLOW_SUB_in_additive_expression917); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_SUB.add(SUB124);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression920);
            	    multiplicative_expression125=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multiplicative_expression.add(multiplicative_expression125.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:192:1: multiplicative_expression : modulo_expression ( ( TIMES | DIV ) modulo_expression )* ->;
    public final GalaxyXDefinitionParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        GalaxyXDefinitionParser.multiplicative_expression_return retval = new GalaxyXDefinitionParser.multiplicative_expression_return();
        retval.start = input.LT(1);
        int multiplicative_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token TIMES127=null;
        Token DIV128=null;
        GalaxyXDefinitionParser.modulo_expression_return modulo_expression126 = null;

        GalaxyXDefinitionParser.modulo_expression_return modulo_expression129 = null;


        CommonTree TIMES127_tree=null;
        CommonTree DIV128_tree=null;
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_modulo_expression=new RewriteRuleSubtreeStream(adaptor,"rule modulo_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:2: ( modulo_expression ( ( TIMES | DIV ) modulo_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:5: modulo_expression ( ( TIMES | DIV ) modulo_expression )*
            {
            pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression936);
            modulo_expression126=modulo_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_modulo_expression.add(modulo_expression126.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:23: ( ( TIMES | DIV ) modulo_expression )*
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:24: ( TIMES | DIV ) modulo_expression
            	    {
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:24: ( TIMES | DIV )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==TIMES) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==DIV) ) {
            	        alt41=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:25: TIMES
            	            {
            	            TIMES127=(Token)match(input,TIMES,FOLLOW_TIMES_in_multiplicative_expression940); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_TIMES.add(TIMES127);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:193:33: DIV
            	            {
            	            DIV128=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicative_expression944); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_DIV.add(DIV128);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression947);
            	    modulo_expression129=modulo_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_modulo_expression.add(modulo_expression129.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:196:1: modulo_expression : unary_expression ( MODULO unary_expression )* ->;
    public final GalaxyXDefinitionParser.modulo_expression_return modulo_expression() throws RecognitionException {
        GalaxyXDefinitionParser.modulo_expression_return retval = new GalaxyXDefinitionParser.modulo_expression_return();
        retval.start = input.LT(1);
        int modulo_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token MODULO131=null;
        GalaxyXDefinitionParser.unary_expression_return unary_expression130 = null;

        GalaxyXDefinitionParser.unary_expression_return unary_expression132 = null;


        CommonTree MODULO131_tree=null;
        RewriteRuleTokenStream stream_MODULO=new RewriteRuleTokenStream(adaptor,"token MODULO");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:2: ( unary_expression ( MODULO unary_expression )* ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:5: unary_expression ( MODULO unary_expression )*
            {
            pushFollow(FOLLOW_unary_expression_in_modulo_expression964);
            unary_expression130=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression130.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:22: ( MODULO unary_expression )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:23: MODULO unary_expression
            	    {
            	    MODULO131=(Token)match(input,MODULO,FOLLOW_MODULO_in_modulo_expression967); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MODULO.add(MODULO131);

            	    pushFollow(FOLLOW_unary_expression_in_modulo_expression969);
            	    unary_expression132=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression132.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:200:1: unary_expression : ( postfix_expression | unary_operator unary_expression ->);
    public final GalaxyXDefinitionParser.unary_expression_return unary_expression() throws RecognitionException {
        GalaxyXDefinitionParser.unary_expression_return retval = new GalaxyXDefinitionParser.unary_expression_return();
        retval.start = input.LT(1);
        int unary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.postfix_expression_return postfix_expression133 = null;

        GalaxyXDefinitionParser.unary_operator_return unary_operator134 = null;

        GalaxyXDefinitionParser.unary_expression_return unary_expression135 = null;


        RewriteRuleSubtreeStream stream_unary_operator=new RewriteRuleSubtreeStream(adaptor,"rule unary_operator");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:201:2: ( postfix_expression | unary_operator unary_expression ->)
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:201:5: postfix_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression986);
                    postfix_expression133=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression133.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:202:5: unary_operator unary_expression
                    {
                    pushFollow(FOLLOW_unary_operator_in_unary_expression992);
                    unary_operator134=unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_operator.add(unary_operator134.getTree());
                    pushFollow(FOLLOW_unary_expression_in_unary_expression994);
                    unary_expression135=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression135.getTree());


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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:205:1: postfix_expression : ( primary_expression -> | ( IDENTIFIER | THIS ) DOT postfix_expression -> | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> | IDENTIFIER ( LBRACK expression RBRACK )+ -> | IDENTIFIER LPAREN expression_list RPAREN -> | IDENTIFIER LPAREN RPAREN ->);
    public final GalaxyXDefinitionParser.postfix_expression_return postfix_expression() throws RecognitionException {
        GalaxyXDefinitionParser.postfix_expression_return retval = new GalaxyXDefinitionParser.postfix_expression_return();
        retval.start = input.LT(1);
        int postfix_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER137=null;
        Token THIS138=null;
        Token DOT139=null;
        Token IDENTIFIER141=null;
        Token NAMESPACE_ACCESS142=null;
        Token IDENTIFIER144=null;
        Token LBRACK145=null;
        Token RBRACK147=null;
        Token IDENTIFIER148=null;
        Token LPAREN149=null;
        Token RPAREN151=null;
        Token IDENTIFIER152=null;
        Token LPAREN153=null;
        Token RPAREN154=null;
        GalaxyXDefinitionParser.primary_expression_return primary_expression136 = null;

        GalaxyXDefinitionParser.postfix_expression_return postfix_expression140 = null;

        GalaxyXDefinitionParser.postfix_expression_return postfix_expression143 = null;

        GalaxyXDefinitionParser.expression_return expression146 = null;

        GalaxyXDefinitionParser.expression_list_return expression_list150 = null;


        CommonTree IDENTIFIER137_tree=null;
        CommonTree THIS138_tree=null;
        CommonTree DOT139_tree=null;
        CommonTree IDENTIFIER141_tree=null;
        CommonTree NAMESPACE_ACCESS142_tree=null;
        CommonTree IDENTIFIER144_tree=null;
        CommonTree LBRACK145_tree=null;
        CommonTree RBRACK147_tree=null;
        CommonTree IDENTIFIER148_tree=null;
        CommonTree LPAREN149_tree=null;
        CommonTree RPAREN151_tree=null;
        CommonTree IDENTIFIER152_tree=null;
        CommonTree LPAREN153_tree=null;
        CommonTree RPAREN154_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:206:2: ( primary_expression -> | ( IDENTIFIER | THIS ) DOT postfix_expression -> | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> | IDENTIFIER ( LBRACK expression RBRACK )+ -> | IDENTIFIER LPAREN expression_list RPAREN -> | IDENTIFIER LPAREN RPAREN ->)
            int alt47=6;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:206:4: primary_expression
                    {
                    pushFollow(FOLLOW_primary_expression_in_postfix_expression1007);
                    primary_expression136=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression136.getTree());


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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:207:4: ( IDENTIFIER | THIS ) DOT postfix_expression
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:207:4: ( IDENTIFIER | THIS )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==IDENTIFIER) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==THIS) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:207:5: IDENTIFIER
                            {
                            IDENTIFIER137=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1015); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER137);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:207:18: THIS
                            {
                            THIS138=(Token)match(input,THIS,FOLLOW_THIS_in_postfix_expression1019); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS138);


                            }
                            break;

                    }

                    DOT139=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression1022); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT139);

                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1024);
                    postfix_expression140=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression140.getTree());


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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:208:4: IDENTIFIER NAMESPACE_ACCESS postfix_expression
                    {
                    IDENTIFIER141=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1032); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER141);

                    NAMESPACE_ACCESS142=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE_ACCESS.add(NAMESPACE_ACCESS142);

                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1036);
                    postfix_expression143=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression143.getTree());


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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:209:4: IDENTIFIER ( LBRACK expression RBRACK )+
                    {
                    IDENTIFIER144=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER144);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:209:15: ( LBRACK expression RBRACK )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        alt46 = dfa46.predict(input);
                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:209:16: LBRACK expression RBRACK
                    	    {
                    	    LBRACK145=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix_expression1047); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK145);

                    	    pushFollow(FOLLOW_expression_in_postfix_expression1049);
                    	    expression146=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression146.getTree());
                    	    RBRACK147=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix_expression1051); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK147);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:210:4: IDENTIFIER LPAREN expression_list RPAREN
                    {
                    IDENTIFIER148=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER148);

                    LPAREN149=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN149);

                    pushFollow(FOLLOW_expression_list_in_postfix_expression1065);
                    expression_list150=expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression_list.add(expression_list150.getTree());
                    RPAREN151=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN151);



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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:211:4: IDENTIFIER LPAREN RPAREN
                    {
                    IDENTIFIER152=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER152);

                    LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN153);

                    RPAREN154=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN154);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:214:1: expression_list : expression ( COMMA expression )* ;
    public final GalaxyXDefinitionParser.expression_list_return expression_list() throws RecognitionException {
        GalaxyXDefinitionParser.expression_list_return retval = new GalaxyXDefinitionParser.expression_list_return();
        retval.start = input.LT(1);
        int expression_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA156=null;
        GalaxyXDefinitionParser.expression_return expression155 = null;

        GalaxyXDefinitionParser.expression_return expression157 = null;


        CommonTree COMMA156_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:215:2: ( expression ( COMMA expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:215:4: expression ( COMMA expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expression_list1093);
            expression155=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression155.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:215:15: ( COMMA expression )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:215:16: COMMA expression
            	    {
            	    COMMA156=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression_list1096); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression_list1099);
            	    expression157=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression157.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:218:1: primary_expression : ( IDENTIFIER | LPAREN expression RPAREN | constant );
    public final GalaxyXDefinitionParser.primary_expression_return primary_expression() throws RecognitionException {
        GalaxyXDefinitionParser.primary_expression_return retval = new GalaxyXDefinitionParser.primary_expression_return();
        retval.start = input.LT(1);
        int primary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER158=null;
        Token LPAREN159=null;
        Token RPAREN161=null;
        GalaxyXDefinitionParser.expression_return expression160 = null;

        GalaxyXDefinitionParser.constant_return constant162 = null;


        CommonTree IDENTIFIER158_tree=null;
        CommonTree LPAREN159_tree=null;
        CommonTree RPAREN161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:219:2: ( IDENTIFIER | LPAREN expression RPAREN | constant )
            int alt49=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt49=1;
                }
                break;
            case LPAREN:
                {
                alt49=2;
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
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:219:4: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENTIFIER158=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1112); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER158_tree = (CommonTree)adaptor.create(IDENTIFIER158);
                    adaptor.addChild(root_0, IDENTIFIER158_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:220:4: LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN159=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression1117); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primary_expression1120);
                    expression160=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression160.getTree());
                    RPAREN161=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression1122); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:221:4: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression1128);
                    constant162=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant162.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:224:1: constant : ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS );
    public final GalaxyXDefinitionParser.constant_return constant() throws RecognitionException {
        GalaxyXDefinitionParser.constant_return retval = new GalaxyXDefinitionParser.constant_return();
        retval.start = input.LT(1);
        int constant_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set163=null;

        CommonTree set163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:225:5: ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set163=(Token)input.LT(1);
            if ( (input.LA(1)>=FALSE && input.LA(1)<=NULL)||input.LA(1)==THIS||(input.LA(1)>=CHARACTER_LITERAL && input.LA(1)<=STRING_LITERAL)||input.LA(1)==INTEGER||input.LA(1)==FIXED_LITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set163));
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:235:1: unary_operator : ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT );
    public final GalaxyXDefinitionParser.unary_operator_return unary_operator() throws RecognitionException {
        GalaxyXDefinitionParser.unary_operator_return retval = new GalaxyXDefinitionParser.unary_operator_return();
        retval.start = input.LT(1);
        int unary_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS164=null;
        Token SUB165=null;
        Token NOT166=null;
        Token NEW167=null;
        Token DELETE168=null;
        Token BIT_NOT169=null;

        CommonTree PLUS164_tree=null;
        CommonTree SUB165_tree=null;
        CommonTree NOT166_tree=null;
        CommonTree NEW167_tree=null;
        CommonTree DELETE168_tree=null;
        CommonTree BIT_NOT169_tree=null;
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:236:2: ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT )
            int alt50=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt50=1;
                }
                break;
            case SUB:
                {
                alt50=2;
                }
                break;
            case NOT:
                {
                alt50=3;
                }
                break;
            case NEW:
                {
                alt50=4;
                }
                break;
            case DELETE:
                {
                alt50=5;
                }
                break;
            case BIT_NOT:
                {
                alt50=6;
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:236:5: PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS164=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_operator1215); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS164_tree = (CommonTree)adaptor.create(PLUS164);
                    adaptor.addChild(root_0, PLUS164_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:237:5: SUB
                    {
                    SUB165=(Token)match(input,SUB,FOLLOW_SUB_in_unary_operator1221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUB.add(SUB165);



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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:238:5: NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT166=(Token)match(input,NOT,FOLLOW_NOT_in_unary_operator1231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT166_tree = (CommonTree)adaptor.create(NOT166);
                    adaptor.addChild(root_0, NOT166_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:239:5: NEW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEW167=(Token)match(input,NEW,FOLLOW_NEW_in_unary_operator1237); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW167_tree = (CommonTree)adaptor.create(NEW167);
                    adaptor.addChild(root_0, NEW167_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:240:5: DELETE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DELETE168=(Token)match(input,DELETE,FOLLOW_DELETE_in_unary_operator1243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DELETE168_tree = (CommonTree)adaptor.create(DELETE168);
                    adaptor.addChild(root_0, DELETE168_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:241:4: BIT_NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BIT_NOT169=(Token)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_unary_operator1248); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIT_NOT169_tree = (CommonTree)adaptor.create(BIT_NOT169);
                    adaptor.addChild(root_0, BIT_NOT169_tree);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:244:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );
    public final GalaxyXDefinitionParser.statement_return statement() throws RecognitionException {
        GalaxyXDefinitionParser.statement_return retval = new GalaxyXDefinitionParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.assignment_statement_return assignment_statement170 = null;

        GalaxyXDefinitionParser.expression_statement_return expression_statement171 = null;

        GalaxyXDefinitionParser.if_statement_return if_statement172 = null;

        GalaxyXDefinitionParser.while_statement_return while_statement173 = null;

        GalaxyXDefinitionParser.do_while_statement_return do_while_statement174 = null;

        GalaxyXDefinitionParser.for_statement_return for_statement175 = null;

        GalaxyXDefinitionParser.jump_statement_return jump_statement176 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:245:2: ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement )
            int alt51=7;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:245:4: assignment_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_statement_in_statement1260);
                    assignment_statement170=assignment_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement170.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:246:4: expression_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_statement_in_statement1265);
                    expression_statement171=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement171.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:247:4: if_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement1270);
                    if_statement172=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement172.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:248:4: while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement1275);
                    while_statement173=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement173.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:249:4: do_while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_do_while_statement_in_statement1280);
                    do_while_statement174=do_while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, do_while_statement174.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:250:4: for_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_statement_in_statement1285);
                    for_statement175=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement175.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:251:4: jump_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_jump_statement_in_statement1290);
                    jump_statement176=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement176.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:254:1: assignment_statement : assignment_expression SEMI ;
    public final GalaxyXDefinitionParser.assignment_statement_return assignment_statement() throws RecognitionException {
        GalaxyXDefinitionParser.assignment_statement_return retval = new GalaxyXDefinitionParser.assignment_statement_return();
        retval.start = input.LT(1);
        int assignment_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI178=null;
        GalaxyXDefinitionParser.assignment_expression_return assignment_expression177 = null;


        CommonTree SEMI178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:255:2: ( assignment_expression SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:255:4: assignment_expression SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_assignment_statement1302);
            assignment_expression177=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression177.getTree());
            SEMI178=(Token)match(input,SEMI,FOLLOW_SEMI_in_assignment_statement1304); if (state.failed) return retval;

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:258:1: expression_statement : ( SEMI | expression SEMI );
    public final GalaxyXDefinitionParser.expression_statement_return expression_statement() throws RecognitionException {
        GalaxyXDefinitionParser.expression_statement_return retval = new GalaxyXDefinitionParser.expression_statement_return();
        retval.start = input.LT(1);
        int expression_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI179=null;
        Token SEMI181=null;
        GalaxyXDefinitionParser.expression_return expression180 = null;


        CommonTree SEMI179_tree=null;
        CommonTree SEMI181_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:259:2: ( SEMI | expression SEMI )
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:259:4: SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEMI179=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1317); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:260:4: expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_expression_statement1323);
                    expression180=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression180.getTree());
                    SEMI181=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1325); if (state.failed) return retval;

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:263:1: if_statement : IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF ->;
    public final GalaxyXDefinitionParser.if_statement_return if_statement() throws RecognitionException {
        GalaxyXDefinitionParser.if_statement_return retval = new GalaxyXDefinitionParser.if_statement_return();
        retval.start = input.LT(1);
        int if_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IF182=null;
        Token LPAREN183=null;
        Token RPAREN185=null;
        Token COLON186=null;
        Token ELIF188=null;
        Token LPAREN189=null;
        Token RPAREN191=null;
        Token COLON192=null;
        Token ELSE194=null;
        Token COLON195=null;
        Token END197=null;
        Token IF198=null;
        GalaxyXDefinitionParser.expression_return expression184 = null;

        GalaxyXDefinitionParser.statement_return statement187 = null;

        GalaxyXDefinitionParser.expression_return expression190 = null;

        GalaxyXDefinitionParser.statement_return statement193 = null;

        GalaxyXDefinitionParser.statement_return statement196 = null;


        CommonTree IF182_tree=null;
        CommonTree LPAREN183_tree=null;
        CommonTree RPAREN185_tree=null;
        CommonTree COLON186_tree=null;
        CommonTree ELIF188_tree=null;
        CommonTree LPAREN189_tree=null;
        CommonTree RPAREN191_tree=null;
        CommonTree COLON192_tree=null;
        CommonTree ELSE194_tree=null;
        CommonTree COLON195_tree=null;
        CommonTree END197_tree=null;
        CommonTree IF198_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:264:2: ( IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:264:4: IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF
            {
            IF182=(Token)match(input,IF,FOLLOW_IF_in_if_statement1338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF182);

            LPAREN183=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN183);

            pushFollow(FOLLOW_expression_in_if_statement1342);
            expression184=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression184.getTree());
            RPAREN185=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1344); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN185);

            COLON186=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON186);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:265:4: ( statement )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement1351);
            	    statement187=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement187.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:266:3: ( ELIF LPAREN expression RPAREN COLON ( statement )* )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==ELIF) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:266:4: ELIF LPAREN expression RPAREN COLON ( statement )*
            	    {
            	    ELIF188=(Token)match(input,ELIF,FOLLOW_ELIF_in_if_statement1357); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ELIF.add(ELIF188);

            	    LPAREN189=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1359); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN189);

            	    pushFollow(FOLLOW_expression_in_if_statement1361);
            	    expression190=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression190.getTree());
            	    RPAREN191=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1363); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN191);

            	    COLON192=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1365); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON192);

            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:267:4: ( statement )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        alt54 = dfa54.predict(input);
            	        switch (alt54) {
            	    	case 1 :
            	    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement1370);
            	    	    statement193=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) stream_statement.add(statement193.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:268:3: ( ELSE COLON ( statement )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ELSE) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:268:4: ELSE COLON ( statement )*
                    {
                    ELSE194=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE194);

                    COLON195=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON195);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:269:4: ( statement )*
                    loop56:
                    do {
                        int alt56=2;
                        alt56 = dfa56.predict(input);
                        switch (alt56) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement1386);
                    	    statement196=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement196.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            END197=(Token)match(input,END,FOLLOW_END_in_if_statement1393); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END197);

            IF198=(Token)match(input,IF,FOLLOW_IF_in_if_statement1395); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF198);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:275:1: while_statement : WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE ->;
    public final GalaxyXDefinitionParser.while_statement_return while_statement() throws RecognitionException {
        GalaxyXDefinitionParser.while_statement_return retval = new GalaxyXDefinitionParser.while_statement_return();
        retval.start = input.LT(1);
        int while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token WHILE199=null;
        Token LPAREN200=null;
        Token RPAREN202=null;
        Token COLON203=null;
        Token END205=null;
        Token WHILE206=null;
        GalaxyXDefinitionParser.expression_return expression201 = null;

        GalaxyXDefinitionParser.statement_return statement204 = null;


        CommonTree WHILE199_tree=null;
        CommonTree LPAREN200_tree=null;
        CommonTree RPAREN202_tree=null;
        CommonTree COLON203_tree=null;
        CommonTree END205_tree=null;
        CommonTree WHILE206_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:276:2: ( WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:276:4: WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE
            {
            WHILE199=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1414); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE199);

            LPAREN200=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN200);

            pushFollow(FOLLOW_expression_in_while_statement1418);
            expression201=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression201.getTree());
            RPAREN202=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1420); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN202);

            COLON203=(Token)match(input,COLON,FOLLOW_COLON_in_while_statement1422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON203);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:277:4: ( statement )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement1427);
            	    statement204=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement204.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            END205=(Token)match(input,END,FOLLOW_END_in_while_statement1432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END205);

            WHILE206=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE206);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:283:1: for_statement : FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR ->;
    public final GalaxyXDefinitionParser.for_statement_return for_statement() throws RecognitionException {
        GalaxyXDefinitionParser.for_statement_return retval = new GalaxyXDefinitionParser.for_statement_return();
        retval.start = input.LT(1);
        int for_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token FOR207=null;
        Token LPAREN208=null;
        Token SEMI210=null;
        Token SEMI212=null;
        Token RPAREN214=null;
        Token COLON215=null;
        Token END217=null;
        Token FOR218=null;
        GalaxyXDefinitionParser.assignment_expression_return assignment_expression209 = null;

        GalaxyXDefinitionParser.expression_return expression211 = null;

        GalaxyXDefinitionParser.expression_return expression213 = null;

        GalaxyXDefinitionParser.statement_return statement216 = null;


        CommonTree FOR207_tree=null;
        CommonTree LPAREN208_tree=null;
        CommonTree SEMI210_tree=null;
        CommonTree SEMI212_tree=null;
        CommonTree RPAREN214_tree=null;
        CommonTree COLON215_tree=null;
        CommonTree END217_tree=null;
        CommonTree FOR218_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:2: ( FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:4: FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR
            {
            FOR207=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1453); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR207);

            LPAREN208=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_for_statement1455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN208);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:15: ( assignment_expression )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: assignment_expression
                    {
                    pushFollow(FOLLOW_assignment_expression_in_for_statement1457);
                    assignment_expression209=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression209.getTree());

                    }
                    break;

            }

            SEMI210=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI210);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:43: ( expression )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1462);
                    expression211=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression211.getTree());

                    }
                    break;

            }

            SEMI212=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1465); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI212);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:284:60: ( expression )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1467);
                    expression213=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression213.getTree());

                    }
                    break;

            }

            RPAREN214=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_for_statement1470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN214);

            COLON215=(Token)match(input,COLON,FOLLOW_COLON_in_for_statement1472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON215);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:285:4: ( statement )*
            loop62:
            do {
                int alt62=2;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_for_statement1477);
            	    statement216=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement216.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            END217=(Token)match(input,END,FOLLOW_END_in_for_statement1482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END217);

            FOR218=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1484); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR218);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:291:1: do_while_statement : DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO ->;
    public final GalaxyXDefinitionParser.do_while_statement_return do_while_statement() throws RecognitionException {
        GalaxyXDefinitionParser.do_while_statement_return retval = new GalaxyXDefinitionParser.do_while_statement_return();
        retval.start = input.LT(1);
        int do_while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DO219=null;
        Token COLON220=null;
        Token WHILE222=null;
        Token LPAREN223=null;
        Token RPAREN225=null;
        Token END226=null;
        Token DO227=null;
        GalaxyXDefinitionParser.statement_return statement221 = null;

        GalaxyXDefinitionParser.expression_return expression224 = null;


        CommonTree DO219_tree=null;
        CommonTree COLON220_tree=null;
        CommonTree WHILE222_tree=null;
        CommonTree LPAREN223_tree=null;
        CommonTree RPAREN225_tree=null;
        CommonTree END226_tree=null;
        CommonTree DO227_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:292:2: ( DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO ->)
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:292:4: DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO
            {
            DO219=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO219);

            COLON220=(Token)match(input,COLON,FOLLOW_COLON_in_do_while_statement1505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON220);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:293:4: ( statement )*
            loop63:
            do {
                int alt63=2;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_do_while_statement1510);
            	    statement221=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement221.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            WHILE222=(Token)match(input,WHILE,FOLLOW_WHILE_in_do_while_statement1516); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE222);

            LPAREN223=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_do_while_statement1518); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN223);

            pushFollow(FOLLOW_expression_in_do_while_statement1520);
            expression224=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression224.getTree());
            RPAREN225=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_do_while_statement1522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN225);

            END226=(Token)match(input,END,FOLLOW_END_in_do_while_statement1527); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END226);

            DO227=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1529); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO227);



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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:300:1: jump_statement : ( BREAK SEMI -> | CONTINUE SEMI -> | RETURN SEMI -> | RETURN expression SEMI ->);
    public final GalaxyXDefinitionParser.jump_statement_return jump_statement() throws RecognitionException {
        GalaxyXDefinitionParser.jump_statement_return retval = new GalaxyXDefinitionParser.jump_statement_return();
        retval.start = input.LT(1);
        int jump_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BREAK228=null;
        Token SEMI229=null;
        Token CONTINUE230=null;
        Token SEMI231=null;
        Token RETURN232=null;
        Token SEMI233=null;
        Token RETURN234=null;
        Token SEMI236=null;
        GalaxyXDefinitionParser.expression_return expression235 = null;


        CommonTree BREAK228_tree=null;
        CommonTree SEMI229_tree=null;
        CommonTree CONTINUE230_tree=null;
        CommonTree SEMI231_tree=null;
        CommonTree RETURN232_tree=null;
        CommonTree SEMI233_tree=null;
        CommonTree RETURN234_tree=null;
        CommonTree SEMI236_tree=null;
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:301:2: ( BREAK SEMI -> | CONTINUE SEMI -> | RETURN SEMI -> | RETURN expression SEMI ->)
            int alt64=4;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:301:4: BREAK SEMI
                    {
                    BREAK228=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement1548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK228);

                    SEMI229=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI229);



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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:302:4: CONTINUE SEMI
                    {
                    CONTINUE230=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE230);

                    SEMI231=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI231);



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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:303:4: RETURN SEMI
                    {
                    RETURN232=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1566); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN232);

                    SEMI233=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI233);



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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:304:4: RETURN expression SEMI
                    {
                    RETURN234=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN234);

                    pushFollow(FOLLOW_expression_in_jump_statement1577);
                    expression235=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression235.getTree());
                    SEMI236=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI236);



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

    // $ANTLR start synpred13_GalaxyXDefinitionParser
    public final void synpred13_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:70:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:70:4: local_var_decl
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
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:78:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:78:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred16_GalaxyXDefinitionParser341);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_GalaxyXDefinitionParser

    // $ANTLR start synpred20_GalaxyXDefinitionParser
    public final void synpred20_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:86:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:86:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred20_GalaxyXDefinitionParser393);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_GalaxyXDefinitionParser

    // $ANTLR start synpred31_GalaxyXDefinitionParser
    public final void synpred31_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:114:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:114:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred31_GalaxyXDefinitionParser542);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_GalaxyXDefinitionParser

    // $ANTLR start synpred70_GalaxyXDefinitionParser
    public final void synpred70_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:210:4: ( IDENTIFIER LPAREN expression_list RPAREN )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:210:4: IDENTIFIER LPAREN expression_list RPAREN
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred70_GalaxyXDefinitionParser1061); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred70_GalaxyXDefinitionParser1063); if (state.failed) return ;
        pushFollow(FOLLOW_expression_list_in_synpred70_GalaxyXDefinitionParser1065);
        expression_list();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred70_GalaxyXDefinitionParser1067); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_GalaxyXDefinitionParser

    // $ANTLR start synpred86_GalaxyXDefinitionParser
    public final void synpred86_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:245:4: ( assignment_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:245:4: assignment_statement
        {
        pushFollow(FOLLOW_assignment_statement_in_synpred86_GalaxyXDefinitionParser1260);
        assignment_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_GalaxyXDefinitionParser

    // $ANTLR start synpred87_GalaxyXDefinitionParser
    public final void synpred87_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:246:4: ( expression_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:246:4: expression_statement
        {
        pushFollow(FOLLOW_expression_statement_in_synpred87_GalaxyXDefinitionParser1265);
        expression_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_GalaxyXDefinitionParser

    // $ANTLR start synpred103_GalaxyXDefinitionParser
    public final void synpred103_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:293:4: ( statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:293:4: statement
        {
        pushFollow(FOLLOW_statement_in_synpred103_GalaxyXDefinitionParser1510);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_GalaxyXDefinitionParser

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
    public final boolean synpred70_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_GalaxyXDefinitionParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_GalaxyXDefinitionParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_GalaxyXDefinitionParser_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\11\1\uffff\1\22\13\uffff";
    static final String DFA2_maxS =
        "\1\127\1\uffff\1\127\13\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\2\1\3\2\uffff\1\4\5\uffff";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\10\uffff\1\4\4\uffff\1\3\10\uffff\1\10\1\uffff\2\5\2\2"+
            "\61\uffff\1\5",
            "",
            "\1\4\4\uffff\1\3\12\uffff\2\5\63\uffff\1\5",
            "",
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
    }
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\1\11\1\uffff\1\22\12\uffff";
    static final String DFA5_maxS =
        "\1\127\1\uffff\1\127\12\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\2\uffff\1\2\1\3\1\4\4\uffff";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\10\uffff\1\6\1\7\1\10\15\uffff\2\3\2\2\61\uffff\1\3",
            "",
            "\1\6\17\uffff\2\3\63\uffff\1\3",
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
    static final String DFA14_eotS =
        "\56\uffff";
    static final String DFA14_eofS =
        "\56\uffff";
    static final String DFA14_minS =
        "\1\4\1\53\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA14_maxS =
        "\1\137\1\127\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\31\uffff";
    static final String DFA14_specialS =
        "\25\uffff\1\0\25\uffff\1\1\2\uffff}>";
    static final String[] DFA14_transitionS = {
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 86:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_21 = input.LA(1);

                         
                        int index14_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_43 = input.LA(1);

                         
                        int index14_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_43);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\24\uffff";
    static final String DFA15_eofS =
        "\24\uffff";
    static final String DFA15_minS =
        "\1\4\23\uffff";
    static final String DFA15_maxS =
        "\1\137\23\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA15_specialS =
        "\24\uffff}>";
    static final String[] DFA15_transitionS = {
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
            return "()* loopback of 87:4: ( statement )*";
        }
    }
    static final String DFA25_eotS =
        "\56\uffff";
    static final String DFA25_eofS =
        "\56\uffff";
    static final String DFA25_minS =
        "\1\4\1\53\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA25_maxS =
        "\1\137\1\127\23\uffff\1\0\25\uffff\1\0\2\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\31\uffff";
    static final String DFA25_specialS =
        "\25\uffff\1\0\25\uffff\1\1\2\uffff}>";
    static final String[] DFA25_transitionS = {
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

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 114:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_21 = input.LA(1);

                         
                        int index25_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index25_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_43 = input.LA(1);

                         
                        int index25_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index25_43);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\24\uffff";
    static final String DFA26_eofS =
        "\24\uffff";
    static final String DFA26_minS =
        "\1\4\23\uffff";
    static final String DFA26_maxS =
        "\1\137\23\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA26_specialS =
        "\24\uffff}>";
    static final String[] DFA26_transitionS = {
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
            return "()* loopback of 115:4: ( statement )*";
        }
    }
    static final String DFA30_eotS =
        "\12\uffff";
    static final String DFA30_eofS =
        "\1\1\11\uffff";
    static final String DFA30_minS =
        "\1\53\11\uffff";
    static final String DFA30_maxS =
        "\1\124\11\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA30_specialS =
        "\12\uffff}>";
    static final String[] DFA30_transitionS = {
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()* loopback of 165:28: ( OR exclusive_or_expression )*";
        }
    }
    static final String DFA31_eotS =
        "\13\uffff";
    static final String DFA31_eofS =
        "\1\1\12\uffff";
    static final String DFA31_minS =
        "\1\53\12\uffff";
    static final String DFA31_maxS =
        "\1\124\12\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA31_specialS =
        "\13\uffff}>";
    static final String[] DFA31_transitionS = {
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
            return "()* loopback of 169:19: ( XOR and_expression )*";
        }
    }
    static final String DFA32_eotS =
        "\14\uffff";
    static final String DFA32_eofS =
        "\1\1\13\uffff";
    static final String DFA32_minS =
        "\1\53\13\uffff";
    static final String DFA32_maxS =
        "\1\124\13\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA32_specialS =
        "\14\uffff}>";
    static final String[] DFA32_transitionS = {
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
            return "()* loopback of 173:25: ( AND equality_expression )*";
        }
    }
    static final String DFA34_eotS =
        "\16\uffff";
    static final String DFA34_eofS =
        "\1\1\15\uffff";
    static final String DFA34_minS =
        "\1\53\15\uffff";
    static final String DFA34_maxS =
        "\1\124\15\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\2\12\uffff\1\1\1\uffff";
    static final String DFA34_specialS =
        "\16\uffff}>";
    static final String[] DFA34_transitionS = {
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()* loopback of 177:27: ( ( EQ | NEQ ) relational_expression )*";
        }
    }
    static final String DFA36_eotS =
        "\22\uffff";
    static final String DFA36_eofS =
        "\1\1\21\uffff";
    static final String DFA36_minS =
        "\1\53\21\uffff";
    static final String DFA36_maxS =
        "\1\124\21\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\2\14\uffff\1\1\3\uffff";
    static final String DFA36_specialS =
        "\22\uffff}>";
    static final String[] DFA36_transitionS = {
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "()* loopback of 181:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*";
        }
    }
    static final String DFA38_eotS =
        "\24\uffff";
    static final String DFA38_eofS =
        "\1\1\23\uffff";
    static final String DFA38_minS =
        "\1\53\23\uffff";
    static final String DFA38_maxS =
        "\1\124\23\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\20\uffff\1\1\1\uffff";
    static final String DFA38_specialS =
        "\24\uffff}>";
    static final String[] DFA38_transitionS = {
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 185:25: ( ( SHIFTL | SHIFTR ) additive_expression )*";
        }
    }
    static final String DFA40_eotS =
        "\26\uffff";
    static final String DFA40_eofS =
        "\1\1\25\uffff";
    static final String DFA40_minS =
        "\1\53\25\uffff";
    static final String DFA40_maxS =
        "\1\124\25\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\2\22\uffff\1\1\1\uffff";
    static final String DFA40_specialS =
        "\26\uffff}>";
    static final String[] DFA40_transitionS = {
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "()* loopback of 189:31: ( ( PLUS | SUB ) multiplicative_expression )*";
        }
    }
    static final String DFA42_eotS =
        "\30\uffff";
    static final String DFA42_eofS =
        "\1\1\27\uffff";
    static final String DFA42_minS =
        "\1\53\27\uffff";
    static final String DFA42_maxS =
        "\1\124\27\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\2\24\uffff\1\1\1\uffff";
    static final String DFA42_specialS =
        "\30\uffff}>";
    static final String[] DFA42_transitionS = {
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "()* loopback of 193:23: ( ( TIMES | DIV ) modulo_expression )*";
        }
    }
    static final String DFA43_eotS =
        "\31\uffff";
    static final String DFA43_eofS =
        "\1\1\30\uffff";
    static final String DFA43_minS =
        "\1\53\30\uffff";
    static final String DFA43_maxS =
        "\1\124\30\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\2\26\uffff\1\1";
    static final String DFA43_specialS =
        "\31\uffff}>";
    static final String[] DFA43_transitionS = {
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
            return "()* loopback of 197:22: ( MODULO unary_expression )*";
        }
    }
    static final String DFA44_eotS =
        "\13\uffff";
    static final String DFA44_eofS =
        "\13\uffff";
    static final String DFA44_minS =
        "\1\16\12\uffff";
    static final String DFA44_maxS =
        "\1\137\12\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\5\uffff";
    static final String DFA44_specialS =
        "\13\uffff}>";
    static final String[] DFA44_transitionS = {
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
            return "200:1: unary_expression : ( postfix_expression | unary_operator unary_expression ->);";
        }
    }
    static final String DFA47_eotS =
        "\74\uffff";
    static final String DFA47_eofS =
        "\1\uffff\1\2\1\uffff\1\2\70\uffff";
    static final String DFA47_minS =
        "\1\16\1\53\1\uffff\1\53\2\uffff\1\0\65\uffff";
    static final String DFA47_maxS =
        "\1\137\1\125\1\uffff\1\124\2\uffff\1\0\65\uffff";
    static final String DFA47_acceptS =
        "\2\uffff\1\1\2\uffff\1\3\31\uffff\1\2\1\4\31\uffff\1\5\1\6";
    static final String DFA47_specialS =
        "\6\uffff\1\0\65\uffff}>";
    static final String[] DFA47_transitionS = {
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
            return "205:1: postfix_expression : ( primary_expression -> | ( IDENTIFIER | THIS ) DOT postfix_expression -> | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> | IDENTIFIER ( LBRACK expression RBRACK )+ -> | IDENTIFIER LPAREN expression_list RPAREN -> | IDENTIFIER LPAREN RPAREN ->);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_6 = input.LA(1);

                         
                        int index47_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_GalaxyXDefinitionParser()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index47_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\32\uffff";
    static final String DFA46_eofS =
        "\1\1\31\uffff";
    static final String DFA46_minS =
        "\1\53\31\uffff";
    static final String DFA46_maxS =
        "\1\124\31\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\2\27\uffff\1\1";
    static final String DFA46_specialS =
        "\32\uffff}>";
    static final String[] DFA46_transitionS = {
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

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "()+ loopback of 209:15: ( LBRACK expression RBRACK )+";
        }
    }
    static final String DFA51_eotS =
        "\u009a\uffff";
    static final String DFA51_eofS =
        "\u009a\uffff";
    static final String DFA51_minS =
        "\1\4\1\53\1\16\2\53\6\16\10\uffff\24\0\1\uffff\2\0\1\uffff\34\0"+
        "\1\uffff\1\0\1\uffff\22\0\2\uffff\74\0";
    static final String DFA51_maxS =
        "\1\137\1\125\1\137\2\116\6\137\10\uffff\24\0\1\uffff\2\0\1\uffff"+
        "\34\0\1\uffff\1\0\1\uffff\22\0\2\uffff\74\0";
    static final String DFA51_acceptS =
        "\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\26\uffff\1\1\162\uffff";
    static final String DFA51_specialS =
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
    static final String[] DFA51_transitionS = {
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "244:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_19 = input.LA(1);

                         
                        int index51_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_20 = input.LA(1);

                         
                        int index51_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_21 = input.LA(1);

                         
                        int index51_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_22 = input.LA(1);

                         
                        int index51_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_22);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_23 = input.LA(1);

                         
                        int index51_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_24 = input.LA(1);

                         
                        int index51_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_25 = input.LA(1);

                         
                        int index51_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_26 = input.LA(1);

                         
                        int index51_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA51_27 = input.LA(1);

                         
                        int index51_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA51_28 = input.LA(1);

                         
                        int index51_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA51_29 = input.LA(1);

                         
                        int index51_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_29);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA51_30 = input.LA(1);

                         
                        int index51_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA51_31 = input.LA(1);

                         
                        int index51_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA51_32 = input.LA(1);

                         
                        int index51_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA51_33 = input.LA(1);

                         
                        int index51_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_33);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA51_34 = input.LA(1);

                         
                        int index51_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_34);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA51_35 = input.LA(1);

                         
                        int index51_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_35);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA51_36 = input.LA(1);

                         
                        int index51_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_36);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA51_37 = input.LA(1);

                         
                        int index51_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_37);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA51_38 = input.LA(1);

                         
                        int index51_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_38);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA51_40 = input.LA(1);

                         
                        int index51_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_40);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA51_41 = input.LA(1);

                         
                        int index51_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_41);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA51_43 = input.LA(1);

                         
                        int index51_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_43);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA51_44 = input.LA(1);

                         
                        int index51_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_44);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA51_45 = input.LA(1);

                         
                        int index51_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_45);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA51_46 = input.LA(1);

                         
                        int index51_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_46);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA51_47 = input.LA(1);

                         
                        int index51_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_47);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA51_48 = input.LA(1);

                         
                        int index51_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_48);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA51_49 = input.LA(1);

                         
                        int index51_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_49);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA51_50 = input.LA(1);

                         
                        int index51_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_50);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA51_51 = input.LA(1);

                         
                        int index51_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_51);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA51_52 = input.LA(1);

                         
                        int index51_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_52);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA51_53 = input.LA(1);

                         
                        int index51_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_53);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA51_54 = input.LA(1);

                         
                        int index51_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_54);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA51_55 = input.LA(1);

                         
                        int index51_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_55);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA51_56 = input.LA(1);

                         
                        int index51_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_56);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA51_57 = input.LA(1);

                         
                        int index51_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_57);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA51_58 = input.LA(1);

                         
                        int index51_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_58);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA51_59 = input.LA(1);

                         
                        int index51_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_59);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA51_60 = input.LA(1);

                         
                        int index51_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_60);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA51_61 = input.LA(1);

                         
                        int index51_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_61);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA51_62 = input.LA(1);

                         
                        int index51_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_62);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA51_63 = input.LA(1);

                         
                        int index51_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_63);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA51_64 = input.LA(1);

                         
                        int index51_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_64);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA51_65 = input.LA(1);

                         
                        int index51_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_65);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA51_66 = input.LA(1);

                         
                        int index51_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_66);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA51_67 = input.LA(1);

                         
                        int index51_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_67);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA51_68 = input.LA(1);

                         
                        int index51_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_68);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA51_69 = input.LA(1);

                         
                        int index51_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_69);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA51_70 = input.LA(1);

                         
                        int index51_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_70);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA51_72 = input.LA(1);

                         
                        int index51_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_72);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA51_74 = input.LA(1);

                         
                        int index51_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_74);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA51_75 = input.LA(1);

                         
                        int index51_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_75);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA51_76 = input.LA(1);

                         
                        int index51_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_76);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA51_77 = input.LA(1);

                         
                        int index51_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_77);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA51_78 = input.LA(1);

                         
                        int index51_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_78);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA51_79 = input.LA(1);

                         
                        int index51_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_79);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA51_80 = input.LA(1);

                         
                        int index51_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_80);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA51_81 = input.LA(1);

                         
                        int index51_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_81);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA51_82 = input.LA(1);

                         
                        int index51_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_82);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA51_83 = input.LA(1);

                         
                        int index51_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_83);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA51_84 = input.LA(1);

                         
                        int index51_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_84);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA51_85 = input.LA(1);

                         
                        int index51_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_85);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA51_86 = input.LA(1);

                         
                        int index51_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_86);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA51_87 = input.LA(1);

                         
                        int index51_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_87);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA51_88 = input.LA(1);

                         
                        int index51_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_88);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA51_89 = input.LA(1);

                         
                        int index51_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_89);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA51_90 = input.LA(1);

                         
                        int index51_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_90);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA51_91 = input.LA(1);

                         
                        int index51_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_91);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA51_94 = input.LA(1);

                         
                        int index51_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_94);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA51_95 = input.LA(1);

                         
                        int index51_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_95);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA51_96 = input.LA(1);

                         
                        int index51_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_96);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA51_97 = input.LA(1);

                         
                        int index51_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_97);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA51_98 = input.LA(1);

                         
                        int index51_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_98);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA51_99 = input.LA(1);

                         
                        int index51_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_99);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA51_100 = input.LA(1);

                         
                        int index51_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_100);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA51_101 = input.LA(1);

                         
                        int index51_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_101);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA51_102 = input.LA(1);

                         
                        int index51_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_102);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA51_103 = input.LA(1);

                         
                        int index51_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_103);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA51_104 = input.LA(1);

                         
                        int index51_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_104);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA51_105 = input.LA(1);

                         
                        int index51_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_105);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA51_106 = input.LA(1);

                         
                        int index51_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_106);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA51_107 = input.LA(1);

                         
                        int index51_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_107);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA51_108 = input.LA(1);

                         
                        int index51_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_108);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA51_109 = input.LA(1);

                         
                        int index51_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_109);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA51_110 = input.LA(1);

                         
                        int index51_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_110);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA51_111 = input.LA(1);

                         
                        int index51_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_111);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA51_112 = input.LA(1);

                         
                        int index51_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_112);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA51_113 = input.LA(1);

                         
                        int index51_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_113);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA51_114 = input.LA(1);

                         
                        int index51_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_114);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA51_115 = input.LA(1);

                         
                        int index51_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_115);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA51_116 = input.LA(1);

                         
                        int index51_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_116);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA51_117 = input.LA(1);

                         
                        int index51_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_117);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA51_118 = input.LA(1);

                         
                        int index51_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_118);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA51_119 = input.LA(1);

                         
                        int index51_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_119);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA51_120 = input.LA(1);

                         
                        int index51_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_120);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA51_121 = input.LA(1);

                         
                        int index51_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_121);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA51_122 = input.LA(1);

                         
                        int index51_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_122);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA51_123 = input.LA(1);

                         
                        int index51_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_123);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA51_124 = input.LA(1);

                         
                        int index51_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_124);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA51_125 = input.LA(1);

                         
                        int index51_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_125);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA51_126 = input.LA(1);

                         
                        int index51_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_126);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA51_127 = input.LA(1);

                         
                        int index51_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_127);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA51_128 = input.LA(1);

                         
                        int index51_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_128);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA51_129 = input.LA(1);

                         
                        int index51_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_129);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA51_130 = input.LA(1);

                         
                        int index51_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_130);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA51_131 = input.LA(1);

                         
                        int index51_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_131);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA51_132 = input.LA(1);

                         
                        int index51_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_132);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA51_133 = input.LA(1);

                         
                        int index51_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_133);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA51_134 = input.LA(1);

                         
                        int index51_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_134);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA51_135 = input.LA(1);

                         
                        int index51_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_135);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA51_136 = input.LA(1);

                         
                        int index51_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_136);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA51_137 = input.LA(1);

                         
                        int index51_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_137);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA51_138 = input.LA(1);

                         
                        int index51_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_138);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA51_139 = input.LA(1);

                         
                        int index51_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_139);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA51_140 = input.LA(1);

                         
                        int index51_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_140);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA51_141 = input.LA(1);

                         
                        int index51_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_141);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA51_142 = input.LA(1);

                         
                        int index51_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_142);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA51_143 = input.LA(1);

                         
                        int index51_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_143);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA51_144 = input.LA(1);

                         
                        int index51_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_144);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA51_145 = input.LA(1);

                         
                        int index51_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_145);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA51_146 = input.LA(1);

                         
                        int index51_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_146);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA51_147 = input.LA(1);

                         
                        int index51_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_147);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA51_148 = input.LA(1);

                         
                        int index51_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_148);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA51_149 = input.LA(1);

                         
                        int index51_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_149);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA51_150 = input.LA(1);

                         
                        int index51_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_150);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA51_151 = input.LA(1);

                         
                        int index51_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_151);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA51_152 = input.LA(1);

                         
                        int index51_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_152);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA51_153 = input.LA(1);

                         
                        int index51_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 39;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index51_153);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\14\uffff";
    static final String DFA52_eofS =
        "\14\uffff";
    static final String DFA52_minS =
        "\1\16\13\uffff";
    static final String DFA52_maxS =
        "\1\137\13\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA52_specialS =
        "\14\uffff}>";
    static final String[] DFA52_transitionS = {
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
            return "258:1: expression_statement : ( SEMI | expression SEMI );";
        }
    }
    static final String DFA53_eotS =
        "\26\uffff";
    static final String DFA53_eofS =
        "\26\uffff";
    static final String DFA53_minS =
        "\1\4\25\uffff";
    static final String DFA53_maxS =
        "\1\137\25\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\21\uffff";
    static final String DFA53_specialS =
        "\26\uffff}>";
    static final String[] DFA53_transitionS = {
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
            return "()* loopback of 265:4: ( statement )*";
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
            return "()* loopback of 267:4: ( statement )*";
        }
    }
    static final String DFA56_eotS =
        "\24\uffff";
    static final String DFA56_eofS =
        "\24\uffff";
    static final String DFA56_minS =
        "\1\4\23\uffff";
    static final String DFA56_maxS =
        "\1\137\23\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA56_specialS =
        "\24\uffff}>";
    static final String[] DFA56_transitionS = {
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "()* loopback of 269:4: ( statement )*";
        }
    }
    static final String DFA58_eotS =
        "\24\uffff";
    static final String DFA58_eofS =
        "\24\uffff";
    static final String DFA58_minS =
        "\1\4\23\uffff";
    static final String DFA58_maxS =
        "\1\137\23\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA58_specialS =
        "\24\uffff}>";
    static final String[] DFA58_transitionS = {
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

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "()* loopback of 277:4: ( statement )*";
        }
    }
    static final String DFA59_eotS =
        "\14\uffff";
    static final String DFA59_eofS =
        "\14\uffff";
    static final String DFA59_minS =
        "\1\16\13\uffff";
    static final String DFA59_maxS =
        "\1\137\13\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA59_specialS =
        "\14\uffff}>";
    static final String[] DFA59_transitionS = {
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
            return "284:15: ( assignment_expression )?";
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
            return "284:43: ( expression )?";
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
            return "284:60: ( expression )?";
        }
    }
    static final String DFA62_eotS =
        "\24\uffff";
    static final String DFA62_eofS =
        "\24\uffff";
    static final String DFA62_minS =
        "\1\4\23\uffff";
    static final String DFA62_maxS =
        "\1\137\23\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA62_specialS =
        "\24\uffff}>";
    static final String[] DFA62_transitionS = {
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
            return "()* loopback of 285:4: ( statement )*";
        }
    }
    static final String DFA63_eotS =
        "\25\uffff";
    static final String DFA63_eofS =
        "\25\uffff";
    static final String DFA63_minS =
        "\1\4\1\117\21\uffff\1\0\1\uffff";
    static final String DFA63_maxS =
        "\1\137\1\117\21\uffff\1\0\1\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA63_specialS =
        "\23\uffff\1\0\1\uffff}>";
    static final String[] DFA63_transitionS = {
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
            return "()* loopback of 293:4: ( statement )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_19 = input.LA(1);

                         
                        int index63_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_GalaxyXDefinitionParser()) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index63_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\17\uffff";
    static final String DFA64_eofS =
        "\17\uffff";
    static final String DFA64_minS =
        "\1\13\2\uffff\1\16\13\uffff";
    static final String DFA64_maxS =
        "\1\15\2\uffff\1\137\13\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\11\uffff";
    static final String DFA64_specialS =
        "\17\uffff}>";
    static final String[] DFA64_transitionS = {
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
    public static final BitSet FOLLOW_modifier_in_function_decl370 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_decl375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_function_decl377 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_function_decl379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_function_decl382 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RETURNS_in_function_decl384 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_function_decl386 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_function_decl388 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_function_decl393 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_function_decl399 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_function_decl404 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameter_list422 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list425 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list427 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_type_in_parameter445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_local_var_decl463 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_local_var_decl466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_array_in_local_var_decl468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var_decl471 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSGN_in_local_var_decl474 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_local_var_decl476 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_local_var_decl480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_field_decl496 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STATIC_in_field_decl499 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CONST_in_field_decl502 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_field_decl505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_array_in_field_decl507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl510 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSGN_in_field_decl513 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_field_decl515 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_field_decl519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer535 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_initializer537 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_initializer542 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_initializer548 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_initializer553 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACK_in_array572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_type589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_assignment_expression630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007FF0L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression632 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_assignment_expression634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression723 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_LOR_in_logical_or_expression726 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression728 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression743 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_LAND_in_logical_and_expression746 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression748 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression764 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OR_in_or_expression767 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression769 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression785 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_XOR_in_exclusive_or_expression788 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression790 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression807 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_AND_in_and_expression810 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression812 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression829 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_EQ_in_equality_expression833 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_NEQ_in_equality_expression835 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression838 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression854 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_LT_in_relational_expression858 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_GT_in_relational_expression860 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_LTEQ_in_relational_expression862 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_GTEQ_in_relational_expression864 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression867 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression883 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_SHIFTL_in_shift_expression887 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_SHIFTR_in_shift_expression889 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression892 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression909 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression913 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_SUB_in_additive_expression917 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression920 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression936 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_TIMES_in_multiplicative_expression940 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_DIV_in_multiplicative_expression944 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression947 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression964 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_MODULO_in_modulo_expression967 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression969 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression992 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1015 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_THIS_in_postfix_expression1019 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1022 = new BitSet(new long[]{0x000000002001C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1034 = new BitSet(new long[]{0x000000002001C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACK_in_postfix_expression1047 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix_expression1051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1063 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_list_in_postfix_expression1065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1093 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list1096 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_expression_list1099 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary_expression1117 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_primary_expression1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_primary_expression1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_operator1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unary_operator1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_operator1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unary_operator1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unary_operator1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_unary_operator1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_statement1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_statement_in_statement1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_statement1302 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_assignment_statement1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement1323 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1340 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_if_statement1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1344 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1346 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1351 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_ELIF_in_if_statement1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1359 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_if_statement1361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1363 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1365 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1370 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_ELSE_in_if_statement1378 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1380 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1386 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_if_statement1393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IF_in_if_statement1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_while_statement1416 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_while_statement1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_while_statement1420 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_while_statement1422 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_while_statement1427 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_while_statement1432 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_for_statement1455 = new BitSet(new long[]{0x030308003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_assignment_expression_in_for_statement1457 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1460 = new BitSet(new long[]{0x030308003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_for_statement1462 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1465 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6818000L});
    public static final BitSet FOLLOW_expression_in_for_statement1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_for_statement1470 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_for_statement1472 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_for_statement1477 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_for_statement1482 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FOR_in_for_statement1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1503 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_do_while_statement1505 = new BitSet(new long[]{0x030308003801FD90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_do_while_statement1510 = new BitSet(new long[]{0x030308003801FD90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_WHILE_in_do_while_statement1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_do_while_statement1518 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_do_while_statement1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_do_while_statement1522 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_do_while_statement1527 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement1548 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement1557 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1566 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1575 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_jump_statement1577 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred13_GalaxyXDefinitionParser298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred16_GalaxyXDefinitionParser341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred20_GalaxyXDefinitionParser393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred31_GalaxyXDefinitionParser542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred70_GalaxyXDefinitionParser1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred70_GalaxyXDefinitionParser1063 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_list_in_synpred70_GalaxyXDefinitionParser1065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred70_GalaxyXDefinitionParser1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_synpred86_GalaxyXDefinitionParser1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_synpred87_GalaxyXDefinitionParser1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred103_GalaxyXDefinitionParser1510 = new BitSet(new long[]{0x0000000000000002L});

}