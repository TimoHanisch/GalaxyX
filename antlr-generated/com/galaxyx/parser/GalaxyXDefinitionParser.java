// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g 2013-03-13 14:28:14

	package com.galaxyx.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class GalaxyXDefinitionParser extends Parser {
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
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g"; }


    public static class parse_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parse"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:29:1: parse : ( namespace_decl )* ;
    public final GalaxyXDefinitionParser.parse_return parse() throws RecognitionException {
        GalaxyXDefinitionParser.parse_return retval = new GalaxyXDefinitionParser.parse_return();
        retval.start = input.LT(1);
        int parse_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.namespace_decl_return namespace_decl1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:30:2: ( ( namespace_decl )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:30:4: ( namespace_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:30:4: ( namespace_decl )*
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
            	    pushFollow(FOLLOW_namespace_decl_in_parse133);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:33:1: namespace_decl : NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE -> ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:34:2: ( NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE -> ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:34:4: NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE
            {
            NAMESPACE2=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl145); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE2);

            IDENTIFIER3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl147); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER3);

            COLON4=(Token)match(input,COLON,FOLLOW_COLON_in_namespace_decl149); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON4);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:35:4: ( class_decl | function_decl | field_decl | initializer )*
            loop2:
            do {
                int alt2=5;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:35:5: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl155);
            	    class_decl5=class_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_class_decl.add(class_decl5.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:35:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_namespace_decl159);
            	    function_decl6=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_decl.add(function_decl6.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:35:34: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace_decl163);
            	    field_decl7=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_decl.add(field_decl7.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:35:47: initializer
            	    {
            	    pushFollow(FOLLOW_initializer_in_namespace_decl167);
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

            END9=(Token)match(input,END,FOLLOW_END_in_namespace_decl173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END9);

            NAMESPACE10=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl175); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE10);



            // AST REWRITE
            // elements: function_decl, field_decl, initializer, NAMESPACE, class_decl, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 37:3: -> ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:38:3: ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_NAMESPACE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:38:26: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:38:38: ( function_decl )*
                while ( stream_function_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_decl.nextTree());

                }
                stream_function_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:38:53: ( field_decl )*
                while ( stream_field_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_decl.nextTree());

                }
                stream_field_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:38:65: ( initializer )*
                while ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializer.nextTree());

                }
                stream_initializer.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:41:1: class_decl : ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS -> ^( CLASS ( modifier )? IDENTIFIER ( EXTENDS IDENTIFIER )? ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:42:2: ( ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS -> ^( CLASS ( modifier )? IDENTIFIER ( EXTENDS IDENTIFIER )? ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:42:4: ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:42:4: ( modifier )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=PRIVATE && LA3_0<=PUBLIC)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_class_decl211);
                    modifier11=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier11.getTree());

                    }
                    break;

            }

            CLASS12=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS12);

            IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl216); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER13);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:42:31: ( EXTENDS IDENTIFIER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:42:32: EXTENDS IDENTIFIER
                    {
                    EXTENDS14=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_class_decl219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS14);

                    IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER15);


                    }
                    break;

            }

            COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_class_decl225); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON16);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:43:4: ( field_decl | function_decl | constructor_decl | destructor_decl )*
            loop5:
            do {
                int alt5=5;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:43:5: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl231);
            	    field_decl17=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_decl.add(field_decl17.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:43:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_class_decl235);
            	    function_decl18=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_decl.add(function_decl18.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:43:34: constructor_decl
            	    {
            	    pushFollow(FOLLOW_constructor_decl_in_class_decl239);
            	    constructor_decl19=constructor_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_constructor_decl.add(constructor_decl19.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:43:53: destructor_decl
            	    {
            	    pushFollow(FOLLOW_destructor_decl_in_class_decl243);
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

            END21=(Token)match(input,END,FOLLOW_END_in_class_decl249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END21);

            CLASS22=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS22);



            // AST REWRITE
            // elements: field_decl, IDENTIFIER, modifier, IDENTIFIER, destructor_decl, constructor_decl, EXTENDS, CLASS, function_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 45:3: -> ^( CLASS ( modifier )? IDENTIFIER ( EXTENDS IDENTIFIER )? ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:46:3: ^( CLASS ( modifier )? IDENTIFIER ( EXTENDS IDENTIFIER )? ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CLASS.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:46:11: ( modifier )?
                if ( stream_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:46:32: ( EXTENDS IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext()||stream_EXTENDS.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXTENDS.nextNode());
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                stream_EXTENDS.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:46:54: ( field_decl )*
                while ( stream_field_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_decl.nextTree());

                }
                stream_field_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:46:66: ( function_decl )*
                while ( stream_function_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_decl.nextTree());

                }
                stream_function_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:46:81: ( constructor_decl )*
                while ( stream_constructor_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_constructor_decl.nextTree());

                }
                stream_constructor_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:46:99: ( destructor_decl )*
                while ( stream_destructor_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_destructor_decl.nextTree());

                }
                stream_destructor_decl.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:49:1: constructor_decl : CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR -> ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:50:2: ( CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR -> ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:50:4: CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR
            {
            CONSTRUCTOR23=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTRUCTOR.add(CONSTRUCTOR23);

            LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constructor_decl299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN24);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:50:23: ( parameter_list )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_constructor_decl301);
                    parameter_list25=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list25.getTree());

                    }
                    break;

            }

            RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constructor_decl304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN26);

            COLON27=(Token)match(input,COLON,FOLLOW_COLON_in_constructor_decl306); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON27);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:51:4: ( local_var_decl )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_constructor_decl311);
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:52:4: ( statement )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor_decl317);
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

            END30=(Token)match(input,END,FOLLOW_END_in_constructor_decl322); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END30);

            CONSTRUCTOR31=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl324); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTRUCTOR.add(CONSTRUCTOR31);



            // AST REWRITE
            // elements: parameter_list, local_var_decl, CONSTRUCTOR, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 54:3: -> ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:55:3: ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CONSTRUCTOR.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:55:17: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:55:33: ( local_var_decl )*
                while ( stream_local_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_local_var_decl.nextTree());

                }
                stream_local_var_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:55:49: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:58:1: destructor_decl : DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR -> ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:59:2: ( DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR -> ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:59:4: DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR
            {
            DESTRUCTOR32=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTRUCTOR.add(DESTRUCTOR32);

            LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_destructor_decl357); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN33);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:59:22: ( parameter_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_destructor_decl359);
                    parameter_list34=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list34.getTree());

                    }
                    break;

            }

            RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_destructor_decl362); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN35);

            COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_destructor_decl364); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON36);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:60:4: ( local_var_decl )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_destructor_decl369);
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:61:4: ( statement )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_destructor_decl375);
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

            END39=(Token)match(input,END,FOLLOW_END_in_destructor_decl380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END39);

            DESTRUCTOR40=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl382); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTRUCTOR.add(DESTRUCTOR40);



            // AST REWRITE
            // elements: DESTRUCTOR, statement, parameter_list, local_var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 63:3: -> ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:64:3: ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_DESTRUCTOR.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:64:16: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:64:32: ( local_var_decl )*
                while ( stream_local_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_local_var_decl.nextTree());

                }
                stream_local_var_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:64:48: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:67:1: function_decl : ( modifier )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC -> ^( FUNC modifier IDENTIFIER ( parameter_list )? ^( RETURNS type ) ( local_var_decl )* ( statement )* ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:68:2: ( ( modifier )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC -> ^( FUNC modifier IDENTIFIER ( parameter_list )? ^( RETURNS type ) ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:68:4: ( modifier )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:68:4: ( modifier )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=PRIVATE && LA12_0<=PUBLIC)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_function_decl413);
                    modifier41=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier41.getTree());

                    }
                    break;

            }

            FUNC42=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNC.add(FUNC42);

            IDENTIFIER43=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_decl418); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER43);

            LPAREN44=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_decl420); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN44);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:68:37: ( parameter_list )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function_decl422);
                    parameter_list45=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list45.getTree());

                    }
                    break;

            }

            RPAREN46=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_decl425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN46);

            RETURNS47=(Token)match(input,RETURNS,FOLLOW_RETURNS_in_function_decl427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURNS.add(RETURNS47);

            pushFollow(FOLLOW_type_in_function_decl429);
            type48=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type48.getTree());
            COLON49=(Token)match(input,COLON,FOLLOW_COLON_in_function_decl431); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON49);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:69:4: ( local_var_decl )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_function_decl436);
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:70:4: ( statement )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function_decl442);
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

            END52=(Token)match(input,END,FOLLOW_END_in_function_decl447); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END52);

            FUNC53=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl449); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNC.add(FUNC53);



            // AST REWRITE
            // elements: modifier, statement, RETURNS, parameter_list, FUNC, local_var_decl, type, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 72:3: -> ^( FUNC modifier IDENTIFIER ( parameter_list )? ^( RETURNS type ) ( local_var_decl )* ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:73:3: ^( FUNC modifier IDENTIFIER ( parameter_list )? ^( RETURNS type ) ( local_var_decl )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FUNC.nextNode(), root_1);

                adaptor.addChild(root_1, stream_modifier.nextTree());
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:73:30: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:73:46: ^( RETURNS type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_RETURNS.nextNode(), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:73:62: ( local_var_decl )*
                while ( stream_local_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_local_var_decl.nextTree());

                }
                stream_local_var_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:73:78: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:76:1: parameter_list : parameter ( COMMA parameter )* -> ^( PARAMETER_LIST parameter ( parameter )* ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:2: ( parameter ( COMMA parameter )* -> ^( PARAMETER_LIST parameter ( parameter )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:4: parameter ( COMMA parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameter_list490);
            parameter54=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter54.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:14: ( COMMA parameter )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:77:15: COMMA parameter
            	    {
            	    COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list493); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA55);

            	    pushFollow(FOLLOW_parameter_in_parameter_list495);
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
            // elements: parameter, parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 78:3: -> ^( PARAMETER_LIST parameter ( parameter )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:79:3: ^( PARAMETER_LIST parameter ( parameter )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_LIST, "PARAMETER_LIST"), root_1);

                adaptor.addChild(root_1, stream_parameter.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:79:30: ( parameter )*
                while ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:82:1: parameter : type IDENTIFIER -> ^( PARAMETER type IDENTIFIER ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:83:2: ( type IDENTIFIER -> ^( PARAMETER type IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:83:4: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_parameter526);
            type57=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type57.getTree());
            IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter528); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER58);



            // AST REWRITE
            // elements: type, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 84:3: -> ^( PARAMETER type IDENTIFIER )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:85:3: ^( PARAMETER type IDENTIFIER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER, "PARAMETER"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:88:1: local_var_decl : ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI -> ^( LOCAL ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:89:2: ( ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI -> ^( LOCAL ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:89:4: ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:89:4: ( CONST )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CONST) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: CONST
                    {
                    CONST59=(Token)match(input,CONST,FOLLOW_CONST_in_local_var_decl554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST.add(CONST59);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_local_var_decl557);
            type60=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type60.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:89:16: ( array )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LBRACK) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_local_var_decl559);
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

            IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var_decl562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER62);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:89:34: ( ASSGN expression )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ASSGN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:89:35: ASSGN expression
                    {
                    ASSGN63=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_local_var_decl565); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSGN.add(ASSGN63);

                    pushFollow(FOLLOW_expression_in_local_var_decl567);
                    expression64=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression64.getTree());

                    }
                    break;

            }

            SEMI65=(Token)match(input,SEMI,FOLLOW_SEMI_in_local_var_decl571); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI65);



            // AST REWRITE
            // elements: CONST, expression, ASSGN, type, IDENTIFIER, array
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 90:3: -> ^( LOCAL ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:91:3: ^( LOCAL ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCAL, "LOCAL"), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:91:11: ( CONST )?
                if ( stream_CONST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CONST.nextNode());

                }
                stream_CONST.reset();
                adaptor.addChild(root_1, stream_type.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:91:23: ( array )*
                while ( stream_array.hasNext() ) {
                    adaptor.addChild(root_1, stream_array.nextTree());

                }
                stream_array.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:91:41: ( ASSGN expression )?
                if ( stream_expression.hasNext()||stream_ASSGN.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASSGN.nextNode());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();
                stream_ASSGN.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:94:1: field_decl : ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI -> ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:95:2: ( ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI -> ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:95:4: ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:95:4: ( modifier )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=PRIVATE && LA20_0<=PUBLIC)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_field_decl610);
                    modifier66=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier66.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:95:14: ( STATIC )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==STATIC) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: STATIC
                    {
                    STATIC67=(Token)match(input,STATIC,FOLLOW_STATIC_in_field_decl613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STATIC.add(STATIC67);


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:95:22: ( CONST )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CONST) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: CONST
                    {
                    CONST68=(Token)match(input,CONST,FOLLOW_CONST_in_field_decl616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST.add(CONST68);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_field_decl619);
            type69=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type69.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:95:34: ( array )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==LBRACK) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_field_decl621);
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

            IDENTIFIER71=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER71);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:95:52: ( ASSGN expression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ASSGN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:95:53: ASSGN expression
                    {
                    ASSGN72=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_field_decl627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSGN.add(ASSGN72);

                    pushFollow(FOLLOW_expression_in_field_decl629);
                    expression73=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression73.getTree());

                    }
                    break;

            }

            SEMI74=(Token)match(input,SEMI,FOLLOW_SEMI_in_field_decl633); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI74);



            // AST REWRITE
            // elements: type, IDENTIFIER, expression, ASSGN, STATIC, array, CONST, modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 96:3: -> ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:97:3: ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD, "FIELD"), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:97:11: ( modifier )?
                if ( stream_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:97:21: ( STATIC )?
                if ( stream_STATIC.hasNext() ) {
                    adaptor.addChild(root_1, stream_STATIC.nextNode());

                }
                stream_STATIC.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:97:29: ( CONST )?
                if ( stream_CONST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CONST.nextNode());

                }
                stream_CONST.reset();
                adaptor.addChild(root_1, stream_type.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:97:41: ( array )*
                while ( stream_array.hasNext() ) {
                    adaptor.addChild(root_1, stream_array.nextTree());

                }
                stream_array.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:97:59: ( ASSGN expression )?
                if ( stream_expression.hasNext()||stream_ASSGN.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASSGN.nextNode());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();
                stream_ASSGN.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:100:1: initializer : INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER -> ^( INITIALIZER ( local_var_decl )* ( statement )* ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:101:2: ( INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER -> ^( INITIALIZER ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:101:4: INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER
            {
            INITIALIZER75=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer678); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INITIALIZER.add(INITIALIZER75);

            COLON76=(Token)match(input,COLON,FOLLOW_COLON_in_initializer680); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON76);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:102:4: ( local_var_decl )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_initializer685);
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:103:4: ( statement )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_initializer691);
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

            END79=(Token)match(input,END,FOLLOW_END_in_initializer696); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END79);

            INITIALIZER80=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INITIALIZER.add(INITIALIZER80);



            // AST REWRITE
            // elements: local_var_decl, statement, INITIALIZER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 105:3: -> ^( INITIALIZER ( local_var_decl )* ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:106:3: ^( INITIALIZER ( local_var_decl )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_INITIALIZER.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:106:17: ( local_var_decl )*
                while ( stream_local_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_local_var_decl.nextTree());

                }
                stream_local_var_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:106:33: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:109:1: array : LBRACK expression RBRACK -> ^( ARRAY expression ) ;
    public final GalaxyXDefinitionParser.array_return array() throws RecognitionException {
        GalaxyXDefinitionParser.array_return retval = new GalaxyXDefinitionParser.array_return();
        retval.start = input.LT(1);
        int array_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LBRACK81=null;
        Token RBRACK83=null;
        GalaxyXDefinitionParser.expression_return expression82 = null;


        CommonTree LBRACK81_tree=null;
        CommonTree RBRACK83_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:110:2: ( LBRACK expression RBRACK -> ^( ARRAY expression ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:110:4: LBRACK expression RBRACK
            {
            LBRACK81=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array725); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK81);

            pushFollow(FOLLOW_expression_in_array727);
            expression82=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression82.getTree());
            RBRACK83=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array729); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK83);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:29: -> ^( ARRAY expression )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:110:32: ^( ARRAY expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:113:1: type : ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER ) | IDENTIFIER -> ^( TYPE IDENTIFIER ) );
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:114:2: ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER ) | IDENTIFIER -> ^( TYPE IDENTIFIER ) )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:114:4: IDENTIFIER NAMESPACE_ACCESS IDENTIFIER
                    {
                    IDENTIFIER84=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER84);

                    NAMESPACE_ACCESS85=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_type751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE_ACCESS.add(NAMESPACE_ACCESS85);

                    IDENTIFIER86=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER86);



                    // AST REWRITE
                    // elements: IDENTIFIER, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 114:43: -> ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:114:46: ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMESPACE_TYPE, "NAMESPACE_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:115:4: IDENTIFIER
                    {
                    IDENTIFIER87=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER87);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:15: -> ^( TYPE IDENTIFIER )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:115:18: ^( TYPE IDENTIFIER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:118:1: modifier : ( PUBLIC | PRIVATE );
    public final GalaxyXDefinitionParser.modifier_return modifier() throws RecognitionException {
        GalaxyXDefinitionParser.modifier_return retval = new GalaxyXDefinitionParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set88=null;

        CommonTree set88_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:119:2: ( PUBLIC | PRIVATE )
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:123:1: assignment_expression : expression assignment_operator expression -> ^( assignment_operator expression expression ) ;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:124:2: ( expression assignment_operator expression -> ^( assignment_operator expression expression ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:124:4: expression assignment_operator expression
            {
            pushFollow(FOLLOW_expression_in_assignment_expression804);
            expression89=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression89.getTree());
            pushFollow(FOLLOW_assignment_operator_in_assignment_expression806);
            assignment_operator90=assignment_operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_operator.add(assignment_operator90.getTree());
            pushFollow(FOLLOW_expression_in_assignment_expression808);
            expression91=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression91.getTree());


            // AST REWRITE
            // elements: expression, expression, assignment_operator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 124:46: -> ^( assignment_operator expression expression )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:124:49: ^( assignment_operator expression expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_assignment_operator.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:127:1: assignment_operator : ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR );
    public final GalaxyXDefinitionParser.assignment_operator_return assignment_operator() throws RecognitionException {
        GalaxyXDefinitionParser.assignment_operator_return retval = new GalaxyXDefinitionParser.assignment_operator_return();
        retval.start = input.LT(1);
        int assignment_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set92=null;

        CommonTree set92_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:128:2: ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR )
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:141:1: expression : logical_or_expression ;
    public final GalaxyXDefinitionParser.expression_return expression() throws RecognitionException {
        GalaxyXDefinitionParser.expression_return retval = new GalaxyXDefinitionParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.logical_or_expression_return logical_or_expression93 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:142:2: ( logical_or_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:142:4: logical_or_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logical_or_expression_in_expression890);
            logical_or_expression93=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression93.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:145:1: logical_or_expression : logical_and_expression ( LOR logical_and_expression )* ;
    public final GalaxyXDefinitionParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        GalaxyXDefinitionParser.logical_or_expression_return retval = new GalaxyXDefinitionParser.logical_or_expression_return();
        retval.start = input.LT(1);
        int logical_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LOR95=null;
        GalaxyXDefinitionParser.logical_and_expression_return logical_and_expression94 = null;

        GalaxyXDefinitionParser.logical_and_expression_return logical_and_expression96 = null;


        CommonTree LOR95_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:146:2: ( logical_and_expression ( LOR logical_and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:146:4: logical_and_expression ( LOR logical_and_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression902);
            logical_and_expression94=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression94.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:146:27: ( LOR logical_and_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==LOR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:146:28: LOR logical_and_expression
            	    {
            	    LOR95=(Token)match(input,LOR,FOLLOW_LOR_in_logical_or_expression905); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOR95_tree = (CommonTree)adaptor.create(LOR95);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LOR95_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression908);
            	    logical_and_expression96=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression96.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:149:1: logical_and_expression : or_expression ( LAND or_expression )* ;
    public final GalaxyXDefinitionParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        GalaxyXDefinitionParser.logical_and_expression_return retval = new GalaxyXDefinitionParser.logical_and_expression_return();
        retval.start = input.LT(1);
        int logical_and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LAND98=null;
        GalaxyXDefinitionParser.or_expression_return or_expression97 = null;

        GalaxyXDefinitionParser.or_expression_return or_expression99 = null;


        CommonTree LAND98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:150:2: ( or_expression ( LAND or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:150:4: or_expression ( LAND or_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_or_expression_in_logical_and_expression921);
            or_expression97=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression97.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:150:18: ( LAND or_expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==LAND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:150:19: LAND or_expression
            	    {
            	    LAND98=(Token)match(input,LAND,FOLLOW_LAND_in_logical_and_expression924); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LAND98_tree = (CommonTree)adaptor.create(LAND98);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LAND98_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression927);
            	    or_expression99=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression99.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:153:1: or_expression : exclusive_or_expression ( OR exclusive_or_expression )* ;
    public final GalaxyXDefinitionParser.or_expression_return or_expression() throws RecognitionException {
        GalaxyXDefinitionParser.or_expression_return retval = new GalaxyXDefinitionParser.or_expression_return();
        retval.start = input.LT(1);
        int or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OR101=null;
        GalaxyXDefinitionParser.exclusive_or_expression_return exclusive_or_expression100 = null;

        GalaxyXDefinitionParser.exclusive_or_expression_return exclusive_or_expression102 = null;


        CommonTree OR101_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:154:2: ( exclusive_or_expression ( OR exclusive_or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:154:4: exclusive_or_expression ( OR exclusive_or_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_exclusive_or_expression_in_or_expression941);
            exclusive_or_expression100=exclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression100.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:154:28: ( OR exclusive_or_expression )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:154:29: OR exclusive_or_expression
            	    {
            	    OR101=(Token)match(input,OR,FOLLOW_OR_in_or_expression944); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR101_tree = (CommonTree)adaptor.create(OR101);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR101_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_exclusive_or_expression_in_or_expression947);
            	    exclusive_or_expression102=exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression102.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:157:1: exclusive_or_expression : and_expression ( XOR and_expression )* ;
    public final GalaxyXDefinitionParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
        GalaxyXDefinitionParser.exclusive_or_expression_return retval = new GalaxyXDefinitionParser.exclusive_or_expression_return();
        retval.start = input.LT(1);
        int exclusive_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token XOR104=null;
        GalaxyXDefinitionParser.and_expression_return and_expression103 = null;

        GalaxyXDefinitionParser.and_expression_return and_expression105 = null;


        CommonTree XOR104_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:158:2: ( and_expression ( XOR and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:158:4: and_expression ( XOR and_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression961);
            and_expression103=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression103.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:158:19: ( XOR and_expression )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:158:20: XOR and_expression
            	    {
            	    XOR104=(Token)match(input,XOR,FOLLOW_XOR_in_exclusive_or_expression964); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    XOR104_tree = (CommonTree)adaptor.create(XOR104);
            	    root_0 = (CommonTree)adaptor.becomeRoot(XOR104_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression967);
            	    and_expression105=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression105.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:161:1: and_expression : equality_expression ( AND equality_expression )* ;
    public final GalaxyXDefinitionParser.and_expression_return and_expression() throws RecognitionException {
        GalaxyXDefinitionParser.and_expression_return retval = new GalaxyXDefinitionParser.and_expression_return();
        retval.start = input.LT(1);
        int and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token AND107=null;
        GalaxyXDefinitionParser.equality_expression_return equality_expression106 = null;

        GalaxyXDefinitionParser.equality_expression_return equality_expression108 = null;


        CommonTree AND107_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:162:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:162:5: equality_expression ( AND equality_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_and_expression982);
            equality_expression106=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression106.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:162:25: ( AND equality_expression )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:162:26: AND equality_expression
            	    {
            	    AND107=(Token)match(input,AND,FOLLOW_AND_in_and_expression985); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND107_tree = (CommonTree)adaptor.create(AND107);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND107_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_and_expression988);
            	    equality_expression108=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression108.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:165:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final GalaxyXDefinitionParser.equality_expression_return equality_expression() throws RecognitionException {
        GalaxyXDefinitionParser.equality_expression_return retval = new GalaxyXDefinitionParser.equality_expression_return();
        retval.start = input.LT(1);
        int equality_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set110=null;
        GalaxyXDefinitionParser.relational_expression_return relational_expression109 = null;

        GalaxyXDefinitionParser.relational_expression_return relational_expression111 = null;


        CommonTree set110_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:166:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:166:5: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression1003);
            relational_expression109=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression109.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:166:27: ( ( EQ | NEQ ) relational_expression )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:166:28: ( EQ | NEQ ) relational_expression
            	    {
            	    set110=(Token)input.LT(1);
            	    set110=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set110), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1013);
            	    relational_expression111=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression111.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:169:1: relational_expression : shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* ;
    public final GalaxyXDefinitionParser.relational_expression_return relational_expression() throws RecognitionException {
        GalaxyXDefinitionParser.relational_expression_return retval = new GalaxyXDefinitionParser.relational_expression_return();
        retval.start = input.LT(1);
        int relational_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set113=null;
        GalaxyXDefinitionParser.shift_expression_return shift_expression112 = null;

        GalaxyXDefinitionParser.shift_expression_return shift_expression114 = null;


        CommonTree set113_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:170:2: ( shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:170:5: shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shift_expression_in_relational_expression1027);
            shift_expression112=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression112.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:170:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:170:23: ( LT | GT | LTEQ | GTEQ ) shift_expression
            	    {
            	    set113=(Token)input.LT(1);
            	    set113=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set113), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1041);
            	    shift_expression114=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression114.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:173:1: shift_expression : additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* ;
    public final GalaxyXDefinitionParser.shift_expression_return shift_expression() throws RecognitionException {
        GalaxyXDefinitionParser.shift_expression_return retval = new GalaxyXDefinitionParser.shift_expression_return();
        retval.start = input.LT(1);
        int shift_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set116=null;
        GalaxyXDefinitionParser.additive_expression_return additive_expression115 = null;

        GalaxyXDefinitionParser.additive_expression_return additive_expression117 = null;


        CommonTree set116_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:174:2: ( additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:174:5: additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_shift_expression1055);
            additive_expression115=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression115.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:174:25: ( ( SHIFTL | SHIFTR ) additive_expression )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:174:26: ( SHIFTL | SHIFTR ) additive_expression
            	    {
            	    set116=(Token)input.LT(1);
            	    set116=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFTL && input.LA(1)<=SHIFTR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set116), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1065);
            	    additive_expression117=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression117.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:177:1: additive_expression : multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* ;
    public final GalaxyXDefinitionParser.additive_expression_return additive_expression() throws RecognitionException {
        GalaxyXDefinitionParser.additive_expression_return retval = new GalaxyXDefinitionParser.additive_expression_return();
        retval.start = input.LT(1);
        int additive_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set119=null;
        GalaxyXDefinitionParser.multiplicative_expression_return multiplicative_expression118 = null;

        GalaxyXDefinitionParser.multiplicative_expression_return multiplicative_expression120 = null;


        CommonTree set119_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:178:2: ( multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:178:5: multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1080);
            multiplicative_expression118=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression118.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:178:31: ( ( PLUS | SUB ) multiplicative_expression )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:178:32: ( PLUS | SUB ) multiplicative_expression
            	    {
            	    set119=(Token)input.LT(1);
            	    set119=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set119), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1092);
            	    multiplicative_expression120=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression120.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:181:1: multiplicative_expression : modulo_expression ( ( TIMES | DIV ) modulo_expression )* ;
    public final GalaxyXDefinitionParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        GalaxyXDefinitionParser.multiplicative_expression_return retval = new GalaxyXDefinitionParser.multiplicative_expression_return();
        retval.start = input.LT(1);
        int multiplicative_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set122=null;
        GalaxyXDefinitionParser.modulo_expression_return modulo_expression121 = null;

        GalaxyXDefinitionParser.modulo_expression_return modulo_expression123 = null;


        CommonTree set122_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:182:2: ( modulo_expression ( ( TIMES | DIV ) modulo_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:182:5: modulo_expression ( ( TIMES | DIV ) modulo_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression1106);
            modulo_expression121=modulo_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression121.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:182:23: ( ( TIMES | DIV ) modulo_expression )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:182:24: ( TIMES | DIV ) modulo_expression
            	    {
            	    set122=(Token)input.LT(1);
            	    set122=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DIV && input.LA(1)<=TIMES) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set122), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression1118);
            	    modulo_expression123=modulo_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression123.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:185:1: modulo_expression : unary_expression ( MODULO unary_expression )* ;
    public final GalaxyXDefinitionParser.modulo_expression_return modulo_expression() throws RecognitionException {
        GalaxyXDefinitionParser.modulo_expression_return retval = new GalaxyXDefinitionParser.modulo_expression_return();
        retval.start = input.LT(1);
        int modulo_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token MODULO125=null;
        GalaxyXDefinitionParser.unary_expression_return unary_expression124 = null;

        GalaxyXDefinitionParser.unary_expression_return unary_expression126 = null;


        CommonTree MODULO125_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:186:2: ( unary_expression ( MODULO unary_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:186:5: unary_expression ( MODULO unary_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_modulo_expression1133);
            unary_expression124=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression124.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:186:22: ( MODULO unary_expression )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:186:23: MODULO unary_expression
            	    {
            	    MODULO125=(Token)match(input,MODULO,FOLLOW_MODULO_in_modulo_expression1136); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MODULO125_tree = (CommonTree)adaptor.create(MODULO125);
            	    root_0 = (CommonTree)adaptor.becomeRoot(MODULO125_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_modulo_expression1139);
            	    unary_expression126=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression126.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:189:1: unary_expression : ( postfix_expression | unary_operator unary_expression );
    public final GalaxyXDefinitionParser.unary_expression_return unary_expression() throws RecognitionException {
        GalaxyXDefinitionParser.unary_expression_return retval = new GalaxyXDefinitionParser.unary_expression_return();
        retval.start = input.LT(1);
        int unary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.postfix_expression_return postfix_expression127 = null;

        GalaxyXDefinitionParser.unary_operator_return unary_operator128 = null;

        GalaxyXDefinitionParser.unary_expression_return unary_expression129 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:190:2: ( postfix_expression | unary_operator unary_expression )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:190:5: postfix_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1154);
                    postfix_expression127=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression127.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:191:5: unary_operator unary_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unary_operator_in_unary_expression1160);
                    unary_operator128=unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(unary_operator128.getTree(), root_0);
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1163);
                    unary_expression129=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression129.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:194:1: postfix_expression : ( primary_expression | ( IDENTIFIER | THIS ) DOT postfix_expression -> ^( DOT IDENTIFIER postfix_expression ) | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression ) | IDENTIFIER ( LBRACK expression RBRACK )+ -> IDENTIFIER ( expression )+ | IDENTIFIER LPAREN expression_list RPAREN -> IDENTIFIER expression_list | IDENTIFIER LPAREN RPAREN -> ^( FUNCTION_EXPRESSION IDENTIFIER ) );
    public final GalaxyXDefinitionParser.postfix_expression_return postfix_expression() throws RecognitionException {
        GalaxyXDefinitionParser.postfix_expression_return retval = new GalaxyXDefinitionParser.postfix_expression_return();
        retval.start = input.LT(1);
        int postfix_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER131=null;
        Token THIS132=null;
        Token DOT133=null;
        Token IDENTIFIER135=null;
        Token NAMESPACE_ACCESS136=null;
        Token IDENTIFIER138=null;
        Token LBRACK139=null;
        Token RBRACK141=null;
        Token IDENTIFIER142=null;
        Token LPAREN143=null;
        Token RPAREN145=null;
        Token IDENTIFIER146=null;
        Token LPAREN147=null;
        Token RPAREN148=null;
        GalaxyXDefinitionParser.primary_expression_return primary_expression130 = null;

        GalaxyXDefinitionParser.postfix_expression_return postfix_expression134 = null;

        GalaxyXDefinitionParser.postfix_expression_return postfix_expression137 = null;

        GalaxyXDefinitionParser.expression_return expression140 = null;

        GalaxyXDefinitionParser.expression_list_return expression_list144 = null;


        CommonTree IDENTIFIER131_tree=null;
        CommonTree THIS132_tree=null;
        CommonTree DOT133_tree=null;
        CommonTree IDENTIFIER135_tree=null;
        CommonTree NAMESPACE_ACCESS136_tree=null;
        CommonTree IDENTIFIER138_tree=null;
        CommonTree LBRACK139_tree=null;
        CommonTree RBRACK141_tree=null;
        CommonTree IDENTIFIER142_tree=null;
        CommonTree LPAREN143_tree=null;
        CommonTree RPAREN145_tree=null;
        CommonTree IDENTIFIER146_tree=null;
        CommonTree LPAREN147_tree=null;
        CommonTree RPAREN148_tree=null;
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
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:195:2: ( primary_expression | ( IDENTIFIER | THIS ) DOT postfix_expression -> ^( DOT IDENTIFIER postfix_expression ) | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression ) | IDENTIFIER ( LBRACK expression RBRACK )+ -> IDENTIFIER ( expression )+ | IDENTIFIER LPAREN expression_list RPAREN -> IDENTIFIER expression_list | IDENTIFIER LPAREN RPAREN -> ^( FUNCTION_EXPRESSION IDENTIFIER ) )
            int alt42=6;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:195:4: primary_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primary_expression_in_postfix_expression1174);
                    primary_expression130=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression130.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:196:4: ( IDENTIFIER | THIS ) DOT postfix_expression
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:196:4: ( IDENTIFIER | THIS )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==IDENTIFIER) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==THIS) ) {
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
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:196:5: IDENTIFIER
                            {
                            IDENTIFIER131=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1180); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER131);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:196:18: THIS
                            {
                            THIS132=(Token)match(input,THIS,FOLLOW_THIS_in_postfix_expression1184); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS132);


                            }
                            break;

                    }

                    DOT133=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression1187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT133);

                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1189);
                    postfix_expression134=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression134.getTree());


                    // AST REWRITE
                    // elements: DOT, postfix_expression, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 196:47: -> ^( DOT IDENTIFIER postfix_expression )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:196:50: ^( DOT IDENTIFIER postfix_expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_postfix_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:4: IDENTIFIER NAMESPACE_ACCESS postfix_expression
                    {
                    IDENTIFIER135=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER135);

                    NAMESPACE_ACCESS136=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE_ACCESS.add(NAMESPACE_ACCESS136);

                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1208);
                    postfix_expression137=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression137.getTree());


                    // AST REWRITE
                    // elements: postfix_expression, NAMESPACE_ACCESS, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 197:51: -> ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:197:54: ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_NAMESPACE_ACCESS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_postfix_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:198:4: IDENTIFIER ( LBRACK expression RBRACK )+
                    {
                    IDENTIFIER138=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1223); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER138);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:198:15: ( LBRACK expression RBRACK )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        alt41 = dfa41.predict(input);
                        switch (alt41) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:198:16: LBRACK expression RBRACK
                    	    {
                    	    LBRACK139=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix_expression1226); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK139);

                    	    pushFollow(FOLLOW_expression_in_postfix_expression1228);
                    	    expression140=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression140.getTree());
                    	    RBRACK141=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix_expression1230); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK141);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);



                    // AST REWRITE
                    // elements: IDENTIFIER, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:43: -> IDENTIFIER ( expression )+
                    {
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());
                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_0, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:199:4: IDENTIFIER LPAREN expression_list RPAREN
                    {
                    IDENTIFIER142=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER142);

                    LPAREN143=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN143);

                    pushFollow(FOLLOW_expression_list_in_postfix_expression1248);
                    expression_list144=expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression_list.add(expression_list144.getTree());
                    RPAREN145=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN145);



                    // AST REWRITE
                    // elements: expression_list, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 199:45: -> IDENTIFIER expression_list
                    {
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_0, stream_expression_list.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:200:4: IDENTIFIER LPAREN RPAREN
                    {
                    IDENTIFIER146=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER146);

                    LPAREN147=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN147);

                    RPAREN148=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN148);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:29: -> ^( FUNCTION_EXPRESSION IDENTIFIER )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:200:32: ^( FUNCTION_EXPRESSION IDENTIFIER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_EXPRESSION, "FUNCTION_EXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:203:1: expression_list : expression ( COMMA expression )* ;
    public final GalaxyXDefinitionParser.expression_list_return expression_list() throws RecognitionException {
        GalaxyXDefinitionParser.expression_list_return retval = new GalaxyXDefinitionParser.expression_list_return();
        retval.start = input.LT(1);
        int expression_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA150=null;
        GalaxyXDefinitionParser.expression_return expression149 = null;

        GalaxyXDefinitionParser.expression_return expression151 = null;


        CommonTree COMMA150_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:204:2: ( expression ( COMMA expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:204:4: expression ( COMMA expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expression_list1284);
            expression149=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression149.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:204:15: ( COMMA expression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:204:16: COMMA expression
            	    {
            	    COMMA150=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression_list1287); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression_list1290);
            	    expression151=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression151.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:207:1: primary_expression : ( IDENTIFIER | LPAREN expression RPAREN | constant );
    public final GalaxyXDefinitionParser.primary_expression_return primary_expression() throws RecognitionException {
        GalaxyXDefinitionParser.primary_expression_return retval = new GalaxyXDefinitionParser.primary_expression_return();
        retval.start = input.LT(1);
        int primary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER152=null;
        Token LPAREN153=null;
        Token RPAREN155=null;
        GalaxyXDefinitionParser.expression_return expression154 = null;

        GalaxyXDefinitionParser.constant_return constant156 = null;


        CommonTree IDENTIFIER152_tree=null;
        CommonTree LPAREN153_tree=null;
        CommonTree RPAREN155_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:208:2: ( IDENTIFIER | LPAREN expression RPAREN | constant )
            int alt44=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt44=1;
                }
                break;
            case LPAREN:
                {
                alt44=2;
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
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:208:4: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENTIFIER152=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER152_tree = (CommonTree)adaptor.create(IDENTIFIER152);
                    adaptor.addChild(root_0, IDENTIFIER152_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:209:4: LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression1308); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primary_expression1311);
                    expression154=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression154.getTree());
                    RPAREN155=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression1313); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:210:4: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression1319);
                    constant156=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant156.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:213:1: constant : ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS );
    public final GalaxyXDefinitionParser.constant_return constant() throws RecognitionException {
        GalaxyXDefinitionParser.constant_return retval = new GalaxyXDefinitionParser.constant_return();
        retval.start = input.LT(1);
        int constant_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set157=null;

        CommonTree set157_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:214:5: ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set157=(Token)input.LT(1);
            if ( (input.LA(1)>=FALSE && input.LA(1)<=NULL)||input.LA(1)==THIS||(input.LA(1)>=CHARACTER_LITERAL && input.LA(1)<=STRING_LITERAL)||input.LA(1)==INTEGER||input.LA(1)==FIXED_LITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set157));
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:224:1: unary_operator : ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT );
    public final GalaxyXDefinitionParser.unary_operator_return unary_operator() throws RecognitionException {
        GalaxyXDefinitionParser.unary_operator_return retval = new GalaxyXDefinitionParser.unary_operator_return();
        retval.start = input.LT(1);
        int unary_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS158=null;
        Token SUB159=null;
        Token NOT160=null;
        Token NEW161=null;
        Token DELETE162=null;
        Token BIT_NOT163=null;

        CommonTree PLUS158_tree=null;
        CommonTree SUB159_tree=null;
        CommonTree NOT160_tree=null;
        CommonTree NEW161_tree=null;
        CommonTree DELETE162_tree=null;
        CommonTree BIT_NOT163_tree=null;
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:225:2: ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT )
            int alt45=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt45=1;
                }
                break;
            case SUB:
                {
                alt45=2;
                }
                break;
            case NOT:
                {
                alt45=3;
                }
                break;
            case NEW:
                {
                alt45=4;
                }
                break;
            case DELETE:
                {
                alt45=5;
                }
                break;
            case BIT_NOT:
                {
                alt45=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:225:5: PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS158=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_operator1406); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS158_tree = (CommonTree)adaptor.create(PLUS158);
                    adaptor.addChild(root_0, PLUS158_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:226:5: SUB
                    {
                    SUB159=(Token)match(input,SUB,FOLLOW_SUB_in_unary_operator1412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUB.add(SUB159);



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
                    // 226:9: -> NEGATION
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:227:5: NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT160=(Token)match(input,NOT,FOLLOW_NOT_in_unary_operator1422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT160_tree = (CommonTree)adaptor.create(NOT160);
                    adaptor.addChild(root_0, NOT160_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:228:5: NEW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEW161=(Token)match(input,NEW,FOLLOW_NEW_in_unary_operator1428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW161_tree = (CommonTree)adaptor.create(NEW161);
                    adaptor.addChild(root_0, NEW161_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:229:5: DELETE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DELETE162=(Token)match(input,DELETE,FOLLOW_DELETE_in_unary_operator1434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DELETE162_tree = (CommonTree)adaptor.create(DELETE162);
                    adaptor.addChild(root_0, DELETE162_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:230:4: BIT_NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BIT_NOT163=(Token)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_unary_operator1439); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIT_NOT163_tree = (CommonTree)adaptor.create(BIT_NOT163);
                    adaptor.addChild(root_0, BIT_NOT163_tree);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:233:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );
    public final GalaxyXDefinitionParser.statement_return statement() throws RecognitionException {
        GalaxyXDefinitionParser.statement_return retval = new GalaxyXDefinitionParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXDefinitionParser.assignment_statement_return assignment_statement164 = null;

        GalaxyXDefinitionParser.expression_statement_return expression_statement165 = null;

        GalaxyXDefinitionParser.if_statement_return if_statement166 = null;

        GalaxyXDefinitionParser.while_statement_return while_statement167 = null;

        GalaxyXDefinitionParser.do_while_statement_return do_while_statement168 = null;

        GalaxyXDefinitionParser.for_statement_return for_statement169 = null;

        GalaxyXDefinitionParser.jump_statement_return jump_statement170 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:234:2: ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement )
            int alt46=7;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:234:4: assignment_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_statement_in_statement1451);
                    assignment_statement164=assignment_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement164.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:235:4: expression_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_statement_in_statement1456);
                    expression_statement165=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement165.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:236:4: if_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement1461);
                    if_statement166=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement166.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:237:4: while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement1466);
                    while_statement167=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement167.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:238:4: do_while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_do_while_statement_in_statement1471);
                    do_while_statement168=do_while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, do_while_statement168.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:239:4: for_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_statement_in_statement1476);
                    for_statement169=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement169.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:240:4: jump_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_jump_statement_in_statement1481);
                    jump_statement170=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement170.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:243:1: assignment_statement : assignment_expression SEMI ;
    public final GalaxyXDefinitionParser.assignment_statement_return assignment_statement() throws RecognitionException {
        GalaxyXDefinitionParser.assignment_statement_return retval = new GalaxyXDefinitionParser.assignment_statement_return();
        retval.start = input.LT(1);
        int assignment_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI172=null;
        GalaxyXDefinitionParser.assignment_expression_return assignment_expression171 = null;


        CommonTree SEMI172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:244:2: ( assignment_expression SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:244:4: assignment_expression SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_assignment_statement1493);
            assignment_expression171=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression171.getTree());
            SEMI172=(Token)match(input,SEMI,FOLLOW_SEMI_in_assignment_statement1495); if (state.failed) return retval;

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:247:1: expression_statement : ( SEMI | expression SEMI );
    public final GalaxyXDefinitionParser.expression_statement_return expression_statement() throws RecognitionException {
        GalaxyXDefinitionParser.expression_statement_return retval = new GalaxyXDefinitionParser.expression_statement_return();
        retval.start = input.LT(1);
        int expression_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI173=null;
        Token SEMI175=null;
        GalaxyXDefinitionParser.expression_return expression174 = null;


        CommonTree SEMI173_tree=null;
        CommonTree SEMI175_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:248:2: ( SEMI | expression SEMI )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:248:4: SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEMI173=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1508); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:249:4: expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_expression_statement1514);
                    expression174=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression174.getTree());
                    SEMI175=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1516); if (state.failed) return retval;

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:252:1: if_statement : IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF -> ^( IF expression ( statement )* ( ^( ELIF expression ( statement )* ) )* ( ^( ELSE ( statement )* ) )? ) ;
    public final GalaxyXDefinitionParser.if_statement_return if_statement() throws RecognitionException {
        GalaxyXDefinitionParser.if_statement_return retval = new GalaxyXDefinitionParser.if_statement_return();
        retval.start = input.LT(1);
        int if_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IF176=null;
        Token LPAREN177=null;
        Token RPAREN179=null;
        Token COLON180=null;
        Token ELIF182=null;
        Token LPAREN183=null;
        Token RPAREN185=null;
        Token COLON186=null;
        Token ELSE188=null;
        Token COLON189=null;
        Token END191=null;
        Token IF192=null;
        GalaxyXDefinitionParser.expression_return expression178 = null;

        GalaxyXDefinitionParser.statement_return statement181 = null;

        GalaxyXDefinitionParser.expression_return expression184 = null;

        GalaxyXDefinitionParser.statement_return statement187 = null;

        GalaxyXDefinitionParser.statement_return statement190 = null;


        CommonTree IF176_tree=null;
        CommonTree LPAREN177_tree=null;
        CommonTree RPAREN179_tree=null;
        CommonTree COLON180_tree=null;
        CommonTree ELIF182_tree=null;
        CommonTree LPAREN183_tree=null;
        CommonTree RPAREN185_tree=null;
        CommonTree COLON186_tree=null;
        CommonTree ELSE188_tree=null;
        CommonTree COLON189_tree=null;
        CommonTree END191_tree=null;
        CommonTree IF192_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:253:2: ( IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF -> ^( IF expression ( statement )* ( ^( ELIF expression ( statement )* ) )* ( ^( ELSE ( statement )* ) )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:253:4: IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF
            {
            IF176=(Token)match(input,IF,FOLLOW_IF_in_if_statement1529); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF176);

            LPAREN177=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1531); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN177);

            pushFollow(FOLLOW_expression_in_if_statement1533);
            expression178=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression178.getTree());
            RPAREN179=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN179);

            COLON180=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON180);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:254:4: ( statement )*
            loop48:
            do {
                int alt48=2;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement1542);
            	    statement181=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement181.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:255:3: ( ELIF LPAREN expression RPAREN COLON ( statement )* )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==ELIF) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:255:4: ELIF LPAREN expression RPAREN COLON ( statement )*
            	    {
            	    ELIF182=(Token)match(input,ELIF,FOLLOW_ELIF_in_if_statement1548); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ELIF.add(ELIF182);

            	    LPAREN183=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1550); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN183);

            	    pushFollow(FOLLOW_expression_in_if_statement1552);
            	    expression184=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression184.getTree());
            	    RPAREN185=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1554); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN185);

            	    COLON186=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1556); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON186);

            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:256:4: ( statement )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        alt49 = dfa49.predict(input);
            	        switch (alt49) {
            	    	case 1 :
            	    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement1561);
            	    	    statement187=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) stream_statement.add(statement187.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:257:3: ( ELSE COLON ( statement )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ELSE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:257:4: ELSE COLON ( statement )*
                    {
                    ELSE188=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE188);

                    COLON189=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON189);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:258:4: ( statement )*
                    loop51:
                    do {
                        int alt51=2;
                        alt51 = dfa51.predict(input);
                        switch (alt51) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement1577);
                    	    statement190=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement190.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            END191=(Token)match(input,END,FOLLOW_END_in_if_statement1584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END191);

            IF192=(Token)match(input,IF,FOLLOW_IF_in_if_statement1586); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF192);



            // AST REWRITE
            // elements: expression, statement, ELSE, expression, statement, ELIF, statement, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 260:3: -> ^( IF expression ( statement )* ( ^( ELIF expression ( statement )* ) )* ( ^( ELSE ( statement )* ) )? )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:261:3: ^( IF expression ( statement )* ( ^( ELIF expression ( statement )* ) )* ( ^( ELSE ( statement )* ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:261:19: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:261:30: ( ^( ELIF expression ( statement )* ) )*
                while ( stream_expression.hasNext()||stream_ELIF.hasNext() ) {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:261:30: ^( ELIF expression ( statement )* )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_ELIF.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_expression.nextTree());
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:261:48: ( statement )*
                    while ( stream_statement.hasNext() ) {
                        adaptor.addChild(root_2, stream_statement.nextTree());

                    }
                    stream_statement.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_expression.reset();
                stream_ELIF.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:261:61: ( ^( ELSE ( statement )* ) )?
                if ( stream_ELSE.hasNext()||stream_statement.hasNext() ) {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:261:61: ^( ELSE ( statement )* )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:261:68: ( statement )*
                    while ( stream_statement.hasNext() ) {
                        adaptor.addChild(root_2, stream_statement.nextTree());

                    }
                    stream_statement.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ELSE.reset();
                stream_statement.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:264:1: while_statement : WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE -> ^( WHILE expression ( statement )* ) ;
    public final GalaxyXDefinitionParser.while_statement_return while_statement() throws RecognitionException {
        GalaxyXDefinitionParser.while_statement_return retval = new GalaxyXDefinitionParser.while_statement_return();
        retval.start = input.LT(1);
        int while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token WHILE193=null;
        Token LPAREN194=null;
        Token RPAREN196=null;
        Token COLON197=null;
        Token END199=null;
        Token WHILE200=null;
        GalaxyXDefinitionParser.expression_return expression195 = null;

        GalaxyXDefinitionParser.statement_return statement198 = null;


        CommonTree WHILE193_tree=null;
        CommonTree LPAREN194_tree=null;
        CommonTree RPAREN196_tree=null;
        CommonTree COLON197_tree=null;
        CommonTree END199_tree=null;
        CommonTree WHILE200_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:265:2: ( WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE -> ^( WHILE expression ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:265:4: WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE
            {
            WHILE193=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1631); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE193);

            LPAREN194=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1633); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN194);

            pushFollow(FOLLOW_expression_in_while_statement1635);
            expression195=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression195.getTree());
            RPAREN196=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1637); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN196);

            COLON197=(Token)match(input,COLON,FOLLOW_COLON_in_while_statement1639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON197);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:266:4: ( statement )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement1644);
            	    statement198=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement198.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            END199=(Token)match(input,END,FOLLOW_END_in_while_statement1649); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END199);

            WHILE200=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE200);



            // AST REWRITE
            // elements: expression, WHILE, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 268:3: -> ^( WHILE expression ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:269:3: ^( WHILE expression ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:269:22: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:272:1: for_statement : FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR -> ^( FOR ( assignment_expression )? ( expression )? ( expression )? ( statement )* ) ;
    public final GalaxyXDefinitionParser.for_statement_return for_statement() throws RecognitionException {
        GalaxyXDefinitionParser.for_statement_return retval = new GalaxyXDefinitionParser.for_statement_return();
        retval.start = input.LT(1);
        int for_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token FOR201=null;
        Token LPAREN202=null;
        Token SEMI204=null;
        Token SEMI206=null;
        Token RPAREN208=null;
        Token COLON209=null;
        Token END211=null;
        Token FOR212=null;
        GalaxyXDefinitionParser.assignment_expression_return assignment_expression203 = null;

        GalaxyXDefinitionParser.expression_return expression205 = null;

        GalaxyXDefinitionParser.expression_return expression207 = null;

        GalaxyXDefinitionParser.statement_return statement210 = null;


        CommonTree FOR201_tree=null;
        CommonTree LPAREN202_tree=null;
        CommonTree SEMI204_tree=null;
        CommonTree SEMI206_tree=null;
        CommonTree RPAREN208_tree=null;
        CommonTree COLON209_tree=null;
        CommonTree END211_tree=null;
        CommonTree FOR212_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:273:2: ( FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR -> ^( FOR ( assignment_expression )? ( expression )? ( expression )? ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:273:4: FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR
            {
            FOR201=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1678); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR201);

            LPAREN202=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_for_statement1680); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN202);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:273:15: ( assignment_expression )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: assignment_expression
                    {
                    pushFollow(FOLLOW_assignment_expression_in_for_statement1682);
                    assignment_expression203=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression203.getTree());

                    }
                    break;

            }

            SEMI204=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1685); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI204);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:273:43: ( expression )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1687);
                    expression205=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression205.getTree());

                    }
                    break;

            }

            SEMI206=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1690); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI206);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:273:60: ( expression )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1692);
                    expression207=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression207.getTree());

                    }
                    break;

            }

            RPAREN208=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_for_statement1695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN208);

            COLON209=(Token)match(input,COLON,FOLLOW_COLON_in_for_statement1697); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON209);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:274:4: ( statement )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_for_statement1702);
            	    statement210=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement210.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            END211=(Token)match(input,END,FOLLOW_END_in_for_statement1707); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END211);

            FOR212=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1709); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR212);



            // AST REWRITE
            // elements: expression, assignment_expression, FOR, statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 276:3: -> ^( FOR ( assignment_expression )? ( expression )? ( expression )? ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:277:3: ^( FOR ( assignment_expression )? ( expression )? ( expression )? ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:277:9: ( assignment_expression )?
                if ( stream_assignment_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignment_expression.nextTree());

                }
                stream_assignment_expression.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:277:32: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:277:44: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:277:56: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:280:1: do_while_statement : DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO -> ^( WHILE expression ( statement )* ) ;
    public final GalaxyXDefinitionParser.do_while_statement_return do_while_statement() throws RecognitionException {
        GalaxyXDefinitionParser.do_while_statement_return retval = new GalaxyXDefinitionParser.do_while_statement_return();
        retval.start = input.LT(1);
        int do_while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DO213=null;
        Token COLON214=null;
        Token WHILE216=null;
        Token LPAREN217=null;
        Token RPAREN219=null;
        Token END220=null;
        Token DO221=null;
        GalaxyXDefinitionParser.statement_return statement215 = null;

        GalaxyXDefinitionParser.expression_return expression218 = null;


        CommonTree DO213_tree=null;
        CommonTree COLON214_tree=null;
        CommonTree WHILE216_tree=null;
        CommonTree LPAREN217_tree=null;
        CommonTree RPAREN219_tree=null;
        CommonTree END220_tree=null;
        CommonTree DO221_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:281:2: ( DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO -> ^( WHILE expression ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:281:4: DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO
            {
            DO213=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1743); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO213);

            COLON214=(Token)match(input,COLON,FOLLOW_COLON_in_do_while_statement1745); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON214);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:282:4: ( statement )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_do_while_statement1750);
            	    statement215=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement215.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            WHILE216=(Token)match(input,WHILE,FOLLOW_WHILE_in_do_while_statement1756); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE216);

            LPAREN217=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_do_while_statement1758); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN217);

            pushFollow(FOLLOW_expression_in_do_while_statement1760);
            expression218=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression218.getTree());
            RPAREN219=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_do_while_statement1762); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN219);

            END220=(Token)match(input,END,FOLLOW_END_in_do_while_statement1767); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END220);

            DO221=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO221);



            // AST REWRITE
            // elements: expression, statement, WHILE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 285:3: -> ^( WHILE expression ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:286:3: ^( WHILE expression ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:286:22: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:289:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );
    public final GalaxyXDefinitionParser.jump_statement_return jump_statement() throws RecognitionException {
        GalaxyXDefinitionParser.jump_statement_return retval = new GalaxyXDefinitionParser.jump_statement_return();
        retval.start = input.LT(1);
        int jump_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BREAK222=null;
        Token SEMI223=null;
        Token CONTINUE224=null;
        Token SEMI225=null;
        Token RETURN226=null;
        Token SEMI227=null;
        Token RETURN228=null;
        Token SEMI230=null;
        GalaxyXDefinitionParser.expression_return expression229 = null;


        CommonTree BREAK222_tree=null;
        CommonTree SEMI223_tree=null;
        CommonTree CONTINUE224_tree=null;
        CommonTree SEMI225_tree=null;
        CommonTree RETURN226_tree=null;
        CommonTree SEMI227_tree=null;
        CommonTree RETURN228_tree=null;
        CommonTree SEMI230_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:290:2: ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI )
            int alt59=4;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:290:4: BREAK SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BREAK222=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement1796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK222_tree = (CommonTree)adaptor.create(BREAK222);
                    adaptor.addChild(root_0, BREAK222_tree);
                    }
                    SEMI223=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI223_tree = (CommonTree)adaptor.create(SEMI223);
                    adaptor.addChild(root_0, SEMI223_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:291:4: CONTINUE SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CONTINUE224=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1803); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTINUE224_tree = (CommonTree)adaptor.create(CONTINUE224);
                    adaptor.addChild(root_0, CONTINUE224_tree);
                    }
                    SEMI225=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI225_tree = (CommonTree)adaptor.create(SEMI225);
                    adaptor.addChild(root_0, SEMI225_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:292:4: RETURN SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RETURN226=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1810); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN226_tree = (CommonTree)adaptor.create(RETURN226);
                    adaptor.addChild(root_0, RETURN226_tree);
                    }
                    SEMI227=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI227_tree = (CommonTree)adaptor.create(SEMI227);
                    adaptor.addChild(root_0, SEMI227_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:293:4: RETURN expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RETURN228=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN228_tree = (CommonTree)adaptor.create(RETURN228);
                    adaptor.addChild(root_0, RETURN228_tree);
                    }
                    pushFollow(FOLLOW_expression_in_jump_statement1819);
                    expression229=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression229.getTree());
                    SEMI230=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1821); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI230_tree = (CommonTree)adaptor.create(SEMI230);
                    adaptor.addChild(root_0, SEMI230_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 42, jump_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "jump_statement"

    // $ANTLR start synpred13_GalaxyXDefinitionParser
    public final void synpred13_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:51:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:51:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred13_GalaxyXDefinitionParser311);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_GalaxyXDefinitionParser

    // $ANTLR start synpred16_GalaxyXDefinitionParser
    public final void synpred16_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:60:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:60:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred16_GalaxyXDefinitionParser369);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_GalaxyXDefinitionParser

    // $ANTLR start synpred20_GalaxyXDefinitionParser
    public final void synpred20_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:69:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:69:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred20_GalaxyXDefinitionParser436);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_GalaxyXDefinitionParser

    // $ANTLR start synpred31_GalaxyXDefinitionParser
    public final void synpred31_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:102:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:102:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred31_GalaxyXDefinitionParser685);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_GalaxyXDefinitionParser

    // $ANTLR start synpred70_GalaxyXDefinitionParser
    public final void synpred70_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:199:4: ( IDENTIFIER LPAREN expression_list RPAREN )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:199:4: IDENTIFIER LPAREN expression_list RPAREN
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred70_GalaxyXDefinitionParser1244); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred70_GalaxyXDefinitionParser1246); if (state.failed) return ;
        pushFollow(FOLLOW_expression_list_in_synpred70_GalaxyXDefinitionParser1248);
        expression_list();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred70_GalaxyXDefinitionParser1250); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_GalaxyXDefinitionParser

    // $ANTLR start synpred86_GalaxyXDefinitionParser
    public final void synpred86_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:234:4: ( assignment_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:234:4: assignment_statement
        {
        pushFollow(FOLLOW_assignment_statement_in_synpred86_GalaxyXDefinitionParser1451);
        assignment_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_GalaxyXDefinitionParser

    // $ANTLR start synpred87_GalaxyXDefinitionParser
    public final void synpred87_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:235:4: ( expression_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:235:4: expression_statement
        {
        pushFollow(FOLLOW_expression_statement_in_synpred87_GalaxyXDefinitionParser1456);
        expression_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_GalaxyXDefinitionParser

    // $ANTLR start synpred103_GalaxyXDefinitionParser
    public final void synpred103_GalaxyXDefinitionParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:282:4: ( statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\parser\\GalaxyXDefinitionParser.g:282:4: statement
        {
        pushFollow(FOLLOW_statement_in_synpred103_GalaxyXDefinitionParser1750);
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
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
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
            return "()* loopback of 35:4: ( class_decl | function_decl | field_decl | initializer )*";
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
            return "()* loopback of 43:4: ( field_decl | function_decl | constructor_decl | destructor_decl )*";
        }
    }
    static final String DFA7_eotS =
        "\47\uffff";
    static final String DFA7_eofS =
        "\47\uffff";
    static final String DFA7_minS =
        "\1\4\1\53\23\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA7_maxS =
        "\1\137\1\127\23\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\22\uffff";
    static final String DFA7_specialS =
        "\25\uffff\1\0\16\uffff\1\1\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\24\7\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\44\1"+
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
            return "()* loopback of 51:4: ( local_var_decl )*";
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
                        int LA7_36 = input.LA(1);

                         
                        int index7_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_36);
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
            return "()* loopback of 52:4: ( statement )*";
        }
    }
    static final String DFA10_eotS =
        "\47\uffff";
    static final String DFA10_eofS =
        "\47\uffff";
    static final String DFA10_minS =
        "\1\4\1\53\23\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA10_maxS =
        "\1\137\1\127\23\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\22\uffff";
    static final String DFA10_specialS =
        "\25\uffff\1\0\16\uffff\1\1\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\24\7\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\44\1"+
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
            return "()* loopback of 60:4: ( local_var_decl )*";
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
                        int LA10_36 = input.LA(1);

                         
                        int index10_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_36);
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
            return "()* loopback of 61:4: ( statement )*";
        }
    }
    static final String DFA14_eotS =
        "\47\uffff";
    static final String DFA14_eofS =
        "\47\uffff";
    static final String DFA14_minS =
        "\1\4\1\53\23\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA14_maxS =
        "\1\137\1\127\23\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\22\uffff";
    static final String DFA14_specialS =
        "\25\uffff\1\0\16\uffff\1\1\2\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\24\7\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\44\1"+
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
            return "()* loopback of 69:4: ( local_var_decl )*";
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
                        int LA14_36 = input.LA(1);

                         
                        int index14_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_36);
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
            return "()* loopback of 70:4: ( statement )*";
        }
    }
    static final String DFA25_eotS =
        "\47\uffff";
    static final String DFA25_eofS =
        "\47\uffff";
    static final String DFA25_minS =
        "\1\4\1\53\23\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA25_maxS =
        "\1\137\1\127\23\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\21\uffff\1\1\22\uffff";
    static final String DFA25_specialS =
        "\25\uffff\1\0\16\uffff\1\1\2\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\24\7\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\44\1"+
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
            return "()* loopback of 102:4: ( local_var_decl )*";
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
                        int LA25_36 = input.LA(1);

                         
                        int index25_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_GalaxyXDefinitionParser()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index25_36);
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
            return "()* loopback of 103:4: ( statement )*";
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
            return "()* loopback of 154:28: ( OR exclusive_or_expression )*";
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
            return "()* loopback of 158:19: ( XOR and_expression )*";
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
            return "()* loopback of 162:25: ( AND equality_expression )*";
        }
    }
    static final String DFA33_eotS =
        "\15\uffff";
    static final String DFA33_eofS =
        "\1\1\14\uffff";
    static final String DFA33_minS =
        "\1\53\14\uffff";
    static final String DFA33_maxS =
        "\1\124\14\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\2\12\uffff\1\1";
    static final String DFA33_specialS =
        "\15\uffff}>";
    static final String[] DFA33_transitionS = {
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
            return "()* loopback of 166:27: ( ( EQ | NEQ ) relational_expression )*";
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
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA34_specialS =
        "\16\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\1\10\uffff\3\1\2\uffff\4\1\4\15\2\uffff\13\1\1\uffff\1\1"+
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
            return "()* loopback of 170:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*";
        }
    }
    static final String DFA35_eotS =
        "\17\uffff";
    static final String DFA35_eofS =
        "\1\1\16\uffff";
    static final String DFA35_minS =
        "\1\53\16\uffff";
    static final String DFA35_maxS =
        "\1\124\16\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\2\14\uffff\1\1";
    static final String DFA35_specialS =
        "\17\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\1\10\uffff\3\1\2\uffff\10\1\2\16\13\1\1\uffff\1\1\3\uffff"+
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
            return "()* loopback of 174:25: ( ( SHIFTL | SHIFTR ) additive_expression )*";
        }
    }
    static final String DFA36_eotS =
        "\20\uffff";
    static final String DFA36_eofS =
        "\1\1\17\uffff";
    static final String DFA36_minS =
        "\1\53\17\uffff";
    static final String DFA36_maxS =
        "\1\124\17\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA36_specialS =
        "\20\uffff}>";
    static final String[] DFA36_transitionS = {
            "\2\1\3\uffff\2\17\3\uffff\3\1\2\uffff\25\1\1\uffff\1\1\3\uffff"+
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
            return "()* loopback of 178:31: ( ( PLUS | SUB ) multiplicative_expression )*";
        }
    }
    static final String DFA37_eotS =
        "\21\uffff";
    static final String DFA37_eofS =
        "\1\1\20\uffff";
    static final String DFA37_minS =
        "\1\53\20\uffff";
    static final String DFA37_maxS =
        "\1\124\20\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA37_specialS =
        "\21\uffff}>";
    static final String[] DFA37_transitionS = {
            "\2\1\3\uffff\2\1\2\20\1\uffff\3\1\2\uffff\25\1\1\uffff\1\1"+
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
            return "()* loopback of 182:23: ( ( TIMES | DIV ) modulo_expression )*";
        }
    }
    static final String DFA38_eotS =
        "\22\uffff";
    static final String DFA38_eofS =
        "\1\1\21\uffff";
    static final String DFA38_minS =
        "\1\53\21\uffff";
    static final String DFA38_maxS =
        "\1\124\21\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\17\uffff\1\1";
    static final String DFA38_specialS =
        "\22\uffff}>";
    static final String[] DFA38_transitionS = {
            "\2\1\3\uffff\4\1\1\21\3\1\2\uffff\25\1\1\uffff\1\1\3\uffff"+
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
            return "()* loopback of 186:22: ( MODULO unary_expression )*";
        }
    }
    static final String DFA39_eotS =
        "\13\uffff";
    static final String DFA39_eofS =
        "\13\uffff";
    static final String DFA39_minS =
        "\1\16\12\uffff";
    static final String DFA39_maxS =
        "\1\137\12\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\5\uffff";
    static final String DFA39_specialS =
        "\13\uffff}>";
    static final String[] DFA39_transitionS = {
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
            return "189:1: unary_expression : ( postfix_expression | unary_operator unary_expression );";
        }
    }
    static final String DFA42_eotS =
        "\56\uffff";
    static final String DFA42_eofS =
        "\1\uffff\1\2\1\uffff\1\2\52\uffff";
    static final String DFA42_minS =
        "\1\16\1\53\1\uffff\1\53\2\uffff\1\0\47\uffff";
    static final String DFA42_maxS =
        "\1\137\1\125\1\uffff\1\124\2\uffff\1\0\47\uffff";
    static final String DFA42_acceptS =
        "\2\uffff\1\1\2\uffff\1\3\22\uffff\1\2\1\4\22\uffff\1\5\1\6";
    static final String DFA42_specialS =
        "\6\uffff\1\0\47\uffff}>";
    static final String[] DFA42_transitionS = {
            "\3\2\14\uffff\1\3\61\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\2\2\1\30\2\uffff\10\2\2\uffff\25\2\1\6\1\2\2\uffff\1\31\1"+
            "\2\1\5",
            "",
            "\2\2\1\30\2\uffff\10\2\2\uffff\25\2\1\uffff\1\2\3\uffff\1"+
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
            return "194:1: postfix_expression : ( primary_expression | ( IDENTIFIER | THIS ) DOT postfix_expression -> ^( DOT IDENTIFIER postfix_expression ) | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression ) | IDENTIFIER ( LBRACK expression RBRACK )+ -> IDENTIFIER ( expression )+ | IDENTIFIER LPAREN expression_list RPAREN -> IDENTIFIER expression_list | IDENTIFIER LPAREN RPAREN -> ^( FUNCTION_EXPRESSION IDENTIFIER ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_GalaxyXDefinitionParser()) ) {s = 44;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\23\uffff";
    static final String DFA41_eofS =
        "\1\1\22\uffff";
    static final String DFA41_minS =
        "\1\53\22\uffff";
    static final String DFA41_maxS =
        "\1\124\22\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\20\uffff\1\1";
    static final String DFA41_specialS =
        "\23\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\1\3\uffff\10\1\2\uffff\25\1\1\uffff\1\1\2\uffff\1\22\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()+ loopback of 198:15: ( LBRACK expression RBRACK )+";
        }
    }
    static final String DFA46_eotS =
        "\u0085\uffff";
    static final String DFA46_eofS =
        "\u0085\uffff";
    static final String DFA46_minS =
        "\1\4\1\53\1\16\2\53\6\16\10\uffff\15\0\1\uffff\2\0\1\uffff\25\0"+
        "\1\uffff\1\0\1\uffff\13\0\2\uffff\74\0";
    static final String DFA46_maxS =
        "\1\137\1\125\1\137\2\116\6\137\10\uffff\15\0\1\uffff\2\0\1\uffff"+
        "\25\0\1\uffff\1\0\1\uffff\13\0\2\uffff\74\0";
    static final String DFA46_acceptS =
        "\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\17\uffff\1\1\144\uffff";
    static final String DFA46_specialS =
        "\23\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\uffff\1\15\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
        "\1\43\1\uffff\1\44\1\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1"+
        "\54\1\55\1\56\1\57\2\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1"+
        "\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1"+
        "\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115"+
        "\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130"+
        "\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143"+
        "\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153}>";
    static final String[] DFA46_transitionS = {
            "\1\14\2\uffff\1\15\1\17\1\uffff\1\16\3\20\3\4\12\uffff\1\10"+
            "\1\11\1\3\15\uffff\1\13\4\uffff\1\5\1\6\6\uffff\1\12\1\7\25"+
            "\uffff\1\2\7\uffff\1\1\1\uffff\2\4\2\uffff\1\4\1\uffff\1\4",
            "\1\13\1\uffff\1\41\2\uffff\2\27\2\26\1\25\1\33\1\35\1\34\2"+
            "\uffff\1\37\1\36\2\32\4\31\2\30\13\40\1\24\3\uffff\1\42\1\uffff"+
            "\1\23",
            "\3\47\12\uffff\1\53\1\54\1\46\22\uffff\1\50\1\51\6\uffff\1"+
            "\55\1\52\25\uffff\1\45\7\uffff\1\44\1\uffff\2\47\2\uffff\1\47"+
            "\1\uffff\1\47",
            "\1\13\1\uffff\1\72\2\uffff\2\60\2\57\1\56\1\64\1\66\1\65\2"+
            "\uffff\1\70\1\67\2\63\4\62\2\61\13\40",
            "\1\13\4\uffff\2\76\2\75\1\74\1\102\1\104\1\103\2\uffff\1\106"+
            "\1\105\2\101\4\100\2\77\13\40",
            "\3\114\12\uffff\1\120\1\121\1\113\22\uffff\1\115\1\116\6\uffff"+
            "\1\122\1\117\25\uffff\1\112\7\uffff\1\111\1\uffff\2\114\2\uffff"+
            "\1\114\1\uffff\1\114",
            "\3\126\12\uffff\1\132\1\133\1\125\22\uffff\1\127\1\130\6\uffff"+
            "\1\134\1\131\25\uffff\1\124\7\uffff\1\123\1\uffff\2\126\2\uffff"+
            "\1\126\1\uffff\1\126",
            "\3\140\12\uffff\1\144\1\145\1\137\22\uffff\1\141\1\142\6\uffff"+
            "\1\146\1\143\25\uffff\1\136\7\uffff\1\135\1\uffff\2\140\2\uffff"+
            "\1\140\1\uffff\1\140",
            "\3\152\12\uffff\1\156\1\157\1\151\22\uffff\1\153\1\154\6\uffff"+
            "\1\160\1\155\25\uffff\1\150\7\uffff\1\147\1\uffff\2\152\2\uffff"+
            "\1\152\1\uffff\1\152",
            "\3\164\12\uffff\1\170\1\171\1\163\22\uffff\1\165\1\166\6\uffff"+
            "\1\172\1\167\25\uffff\1\162\7\uffff\1\161\1\uffff\2\164\2\uffff"+
            "\1\164\1\uffff\1\164",
            "\3\176\12\uffff\1\u0082\1\u0083\1\175\22\uffff\1\177\1\u0080"+
            "\6\uffff\1\u0084\1\u0081\25\uffff\1\174\7\uffff\1\173\1\uffff"+
            "\2\176\2\uffff\1\176\1\uffff\1\176",
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
            return "233:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_19 = input.LA(1);

                         
                        int index46_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_20 = input.LA(1);

                         
                        int index46_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_21 = input.LA(1);

                         
                        int index46_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_22 = input.LA(1);

                         
                        int index46_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_22);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_23 = input.LA(1);

                         
                        int index46_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_24 = input.LA(1);

                         
                        int index46_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_25 = input.LA(1);

                         
                        int index46_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA46_26 = input.LA(1);

                         
                        int index46_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA46_27 = input.LA(1);

                         
                        int index46_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA46_28 = input.LA(1);

                         
                        int index46_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA46_29 = input.LA(1);

                         
                        int index46_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_29);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA46_30 = input.LA(1);

                         
                        int index46_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA46_31 = input.LA(1);

                         
                        int index46_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA46_33 = input.LA(1);

                         
                        int index46_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_33);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA46_34 = input.LA(1);

                         
                        int index46_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_34);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA46_36 = input.LA(1);

                         
                        int index46_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_36);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA46_37 = input.LA(1);

                         
                        int index46_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_37);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA46_38 = input.LA(1);

                         
                        int index46_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_38);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA46_39 = input.LA(1);

                         
                        int index46_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_39);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA46_40 = input.LA(1);

                         
                        int index46_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_40);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA46_41 = input.LA(1);

                         
                        int index46_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_41);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA46_42 = input.LA(1);

                         
                        int index46_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_42);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA46_43 = input.LA(1);

                         
                        int index46_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_43);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA46_44 = input.LA(1);

                         
                        int index46_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_44);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA46_45 = input.LA(1);

                         
                        int index46_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_45);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA46_46 = input.LA(1);

                         
                        int index46_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_46);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA46_47 = input.LA(1);

                         
                        int index46_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_47);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA46_48 = input.LA(1);

                         
                        int index46_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_48);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA46_49 = input.LA(1);

                         
                        int index46_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_49);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA46_50 = input.LA(1);

                         
                        int index46_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_50);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA46_51 = input.LA(1);

                         
                        int index46_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_51);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA46_52 = input.LA(1);

                         
                        int index46_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_52);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA46_53 = input.LA(1);

                         
                        int index46_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_53);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA46_54 = input.LA(1);

                         
                        int index46_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_54);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA46_55 = input.LA(1);

                         
                        int index46_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_55);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA46_56 = input.LA(1);

                         
                        int index46_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_56);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA46_58 = input.LA(1);

                         
                        int index46_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_58);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA46_60 = input.LA(1);

                         
                        int index46_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_60);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA46_61 = input.LA(1);

                         
                        int index46_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_61);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA46_62 = input.LA(1);

                         
                        int index46_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_62);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA46_63 = input.LA(1);

                         
                        int index46_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_63);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA46_64 = input.LA(1);

                         
                        int index46_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_64);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA46_65 = input.LA(1);

                         
                        int index46_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_65);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA46_66 = input.LA(1);

                         
                        int index46_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_66);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA46_67 = input.LA(1);

                         
                        int index46_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_67);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA46_68 = input.LA(1);

                         
                        int index46_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_68);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA46_69 = input.LA(1);

                         
                        int index46_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_69);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA46_70 = input.LA(1);

                         
                        int index46_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_70);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA46_73 = input.LA(1);

                         
                        int index46_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_73);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA46_74 = input.LA(1);

                         
                        int index46_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_74);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA46_75 = input.LA(1);

                         
                        int index46_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_75);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA46_76 = input.LA(1);

                         
                        int index46_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_76);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA46_77 = input.LA(1);

                         
                        int index46_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_77);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA46_78 = input.LA(1);

                         
                        int index46_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_78);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA46_79 = input.LA(1);

                         
                        int index46_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_79);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA46_80 = input.LA(1);

                         
                        int index46_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_80);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA46_81 = input.LA(1);

                         
                        int index46_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_81);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA46_82 = input.LA(1);

                         
                        int index46_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_82);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA46_83 = input.LA(1);

                         
                        int index46_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_83);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA46_84 = input.LA(1);

                         
                        int index46_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_84);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA46_85 = input.LA(1);

                         
                        int index46_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_85);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA46_86 = input.LA(1);

                         
                        int index46_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_86);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA46_87 = input.LA(1);

                         
                        int index46_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_87);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA46_88 = input.LA(1);

                         
                        int index46_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_88);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA46_89 = input.LA(1);

                         
                        int index46_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_89);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA46_90 = input.LA(1);

                         
                        int index46_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_90);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA46_91 = input.LA(1);

                         
                        int index46_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_91);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA46_92 = input.LA(1);

                         
                        int index46_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_92);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA46_93 = input.LA(1);

                         
                        int index46_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_93);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA46_94 = input.LA(1);

                         
                        int index46_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_94);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA46_95 = input.LA(1);

                         
                        int index46_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_95);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA46_96 = input.LA(1);

                         
                        int index46_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_96);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA46_97 = input.LA(1);

                         
                        int index46_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_97);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA46_98 = input.LA(1);

                         
                        int index46_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_98);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA46_99 = input.LA(1);

                         
                        int index46_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_99);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA46_100 = input.LA(1);

                         
                        int index46_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_100);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA46_101 = input.LA(1);

                         
                        int index46_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_101);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA46_102 = input.LA(1);

                         
                        int index46_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_102);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA46_103 = input.LA(1);

                         
                        int index46_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_103);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA46_104 = input.LA(1);

                         
                        int index46_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_104);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA46_105 = input.LA(1);

                         
                        int index46_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_105);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA46_106 = input.LA(1);

                         
                        int index46_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_106);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA46_107 = input.LA(1);

                         
                        int index46_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_107);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA46_108 = input.LA(1);

                         
                        int index46_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_108);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA46_109 = input.LA(1);

                         
                        int index46_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_109);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA46_110 = input.LA(1);

                         
                        int index46_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_110);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA46_111 = input.LA(1);

                         
                        int index46_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_111);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA46_112 = input.LA(1);

                         
                        int index46_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_112);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA46_113 = input.LA(1);

                         
                        int index46_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_113);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA46_114 = input.LA(1);

                         
                        int index46_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_114);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA46_115 = input.LA(1);

                         
                        int index46_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_115);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA46_116 = input.LA(1);

                         
                        int index46_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_116);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA46_117 = input.LA(1);

                         
                        int index46_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_117);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA46_118 = input.LA(1);

                         
                        int index46_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_118);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA46_119 = input.LA(1);

                         
                        int index46_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_119);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA46_120 = input.LA(1);

                         
                        int index46_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_120);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA46_121 = input.LA(1);

                         
                        int index46_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_121);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA46_122 = input.LA(1);

                         
                        int index46_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_122);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA46_123 = input.LA(1);

                         
                        int index46_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_123);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA46_124 = input.LA(1);

                         
                        int index46_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_124);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA46_125 = input.LA(1);

                         
                        int index46_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_125);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA46_126 = input.LA(1);

                         
                        int index46_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_126);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA46_127 = input.LA(1);

                         
                        int index46_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_127);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA46_128 = input.LA(1);

                         
                        int index46_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_128);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA46_129 = input.LA(1);

                         
                        int index46_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_129);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA46_130 = input.LA(1);

                         
                        int index46_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_130);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA46_131 = input.LA(1);

                         
                        int index46_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_131);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA46_132 = input.LA(1);

                         
                        int index46_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyXDefinitionParser()) ) {s = 32;}

                        else if ( (synpred87_GalaxyXDefinitionParser()) ) {s = 11;}

                         
                        input.seek(index46_132);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\14\uffff";
    static final String DFA47_eofS =
        "\14\uffff";
    static final String DFA47_minS =
        "\1\16\13\uffff";
    static final String DFA47_maxS =
        "\1\137\13\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA47_specialS =
        "\14\uffff}>";
    static final String[] DFA47_transitionS = {
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
            return "247:1: expression_statement : ( SEMI | expression SEMI );";
        }
    }
    static final String DFA48_eotS =
        "\26\uffff";
    static final String DFA48_eofS =
        "\26\uffff";
    static final String DFA48_minS =
        "\1\4\25\uffff";
    static final String DFA48_maxS =
        "\1\137\25\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\21\uffff";
    static final String DFA48_specialS =
        "\26\uffff}>";
    static final String[] DFA48_transitionS = {
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
            return "()* loopback of 254:4: ( statement )*";
        }
    }
    static final String DFA49_eotS =
        "\26\uffff";
    static final String DFA49_eofS =
        "\26\uffff";
    static final String DFA49_minS =
        "\1\4\25\uffff";
    static final String DFA49_maxS =
        "\1\137\25\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\21\uffff";
    static final String DFA49_specialS =
        "\26\uffff}>";
    static final String[] DFA49_transitionS = {
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

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "()* loopback of 256:4: ( statement )*";
        }
    }
    static final String DFA51_eotS =
        "\24\uffff";
    static final String DFA51_eofS =
        "\24\uffff";
    static final String DFA51_minS =
        "\1\4\23\uffff";
    static final String DFA51_maxS =
        "\1\137\23\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA51_specialS =
        "\24\uffff}>";
    static final String[] DFA51_transitionS = {
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
            return "()* loopback of 258:4: ( statement )*";
        }
    }
    static final String DFA53_eotS =
        "\24\uffff";
    static final String DFA53_eofS =
        "\24\uffff";
    static final String DFA53_minS =
        "\1\4\23\uffff";
    static final String DFA53_maxS =
        "\1\137\23\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA53_specialS =
        "\24\uffff}>";
    static final String[] DFA53_transitionS = {
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
            return "()* loopback of 266:4: ( statement )*";
        }
    }
    static final String DFA54_eotS =
        "\14\uffff";
    static final String DFA54_eofS =
        "\14\uffff";
    static final String DFA54_minS =
        "\1\16\13\uffff";
    static final String DFA54_maxS =
        "\1\137\13\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA54_specialS =
        "\14\uffff}>";
    static final String[] DFA54_transitionS = {
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
            return "273:15: ( assignment_expression )?";
        }
    }
    static final String DFA55_eotS =
        "\14\uffff";
    static final String DFA55_eofS =
        "\14\uffff";
    static final String DFA55_minS =
        "\1\16\13\uffff";
    static final String DFA55_maxS =
        "\1\137\13\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA55_specialS =
        "\14\uffff}>";
    static final String[] DFA55_transitionS = {
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
            return "273:43: ( expression )?";
        }
    }
    static final String DFA56_eotS =
        "\14\uffff";
    static final String DFA56_eofS =
        "\14\uffff";
    static final String DFA56_minS =
        "\1\16\13\uffff";
    static final String DFA56_maxS =
        "\1\137\13\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA56_specialS =
        "\14\uffff}>";
    static final String[] DFA56_transitionS = {
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
            return "273:60: ( expression )?";
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
            return "()* loopback of 274:4: ( statement )*";
        }
    }
    static final String DFA58_eotS =
        "\25\uffff";
    static final String DFA58_eofS =
        "\25\uffff";
    static final String DFA58_minS =
        "\1\4\1\117\21\uffff\1\0\1\uffff";
    static final String DFA58_maxS =
        "\1\137\1\117\21\uffff\1\0\1\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA58_specialS =
        "\23\uffff\1\0\1\uffff}>";
    static final String[] DFA58_transitionS = {
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
            return "()* loopback of 282:4: ( statement )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_19 = input.LA(1);

                         
                        int index58_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_GalaxyXDefinitionParser()) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index58_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\17\uffff";
    static final String DFA59_eofS =
        "\17\uffff";
    static final String DFA59_minS =
        "\1\13\2\uffff\1\16\13\uffff";
    static final String DFA59_maxS =
        "\1\15\2\uffff\1\137\13\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\11\uffff";
    static final String DFA59_specialS =
        "\17\uffff}>";
    static final String[] DFA59_transitionS = {
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
            return "289:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );";
        }
    }
 

    public static final BitSet FOLLOW_namespace_decl_in_parse133 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_decl147 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_namespace_decl149 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_class_decl_in_namespace_decl155 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_function_decl_in_namespace_decl159 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_field_decl_in_namespace_decl163 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_initializer_in_namespace_decl167 = new BitSet(new long[]{0x0000003D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_END_in_namespace_decl173 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_class_decl211 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl216 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_EXTENDS_in_class_decl219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl221 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_class_decl225 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_field_decl_in_class_decl231 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_function_decl_in_class_decl235 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_constructor_decl_in_class_decl239 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_destructor_decl_in_class_decl243 = new BitSet(new long[]{0x0000003C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_END_in_class_decl249 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_constructor_decl299 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_constructor_decl301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_constructor_decl304 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_constructor_decl306 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_constructor_decl311 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_constructor_decl317 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_constructor_decl322 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_destructor_decl357 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_destructor_decl359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_destructor_decl362 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_destructor_decl364 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_destructor_decl369 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_destructor_decl375 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_destructor_decl380 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_function_decl413 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_decl418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_function_decl420 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_function_decl422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_function_decl425 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RETURNS_in_function_decl427 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_function_decl429 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_function_decl431 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_function_decl436 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_function_decl442 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_function_decl447 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameter_list490 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list493 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list495 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_type_in_parameter526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_local_var_decl554 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_local_var_decl557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_array_in_local_var_decl559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var_decl562 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSGN_in_local_var_decl565 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_local_var_decl567 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_local_var_decl571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_field_decl610 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STATIC_in_field_decl613 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CONST_in_field_decl616 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_field_decl619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_array_in_field_decl621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl624 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSGN_in_field_decl627 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_field_decl629 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_field_decl633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer678 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_initializer680 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_initializer685 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_initializer691 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_initializer696 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array725 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_array727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACK_in_array729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_type751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_assignment_expression804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007FF0L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression806 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_assignment_expression808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression902 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_LOR_in_logical_or_expression905 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression908 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression921 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_LAND_in_logical_and_expression924 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression927 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression941 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OR_in_or_expression944 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression947 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression961 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_XOR_in_exclusive_or_expression964 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression967 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression982 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_AND_in_and_expression985 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression988 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1003 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_set_in_equality_expression1006 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1013 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1027 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_relational_expression1030 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1041 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1055 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_shift_expression1058 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1065 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1080 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_set_in_additive_expression1083 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1092 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression1106 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression1109 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression1118 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression1133 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_MODULO_in_modulo_expression1136 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression1139 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression1160 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1180 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_THIS_in_postfix_expression1184 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1187 = new BitSet(new long[]{0x000000002001C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1206 = new BitSet(new long[]{0x000000002001C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACK_in_postfix_expression1226 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix_expression1230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1246 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_list_in_postfix_expression1248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1284 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list1287 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_expression_list1290 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary_expression1308 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_primary_expression1311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_primary_expression1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_operator1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unary_operator1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_operator1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unary_operator1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unary_operator1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_unary_operator1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_statement1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_statement_in_statement1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_statement1493 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_assignment_statement1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement1514 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1531 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_if_statement1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1535 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1537 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1542 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_ELIF_in_if_statement1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1550 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_if_statement1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1554 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1556 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1561 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_ELSE_in_if_statement1569 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1571 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1577 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_if_statement1584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IF_in_if_statement1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_while_statement1633 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_while_statement1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_while_statement1637 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_while_statement1639 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_while_statement1644 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_while_statement1649 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_for_statement1680 = new BitSet(new long[]{0x030308003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_assignment_expression_in_for_statement1682 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1685 = new BitSet(new long[]{0x030308003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_for_statement1687 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1690 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6818000L});
    public static final BitSet FOLLOW_expression_in_for_statement1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_for_statement1695 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_for_statement1697 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_for_statement1702 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_for_statement1707 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FOR_in_for_statement1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1743 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_do_while_statement1745 = new BitSet(new long[]{0x030308003801FD90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_do_while_statement1750 = new BitSet(new long[]{0x030308003801FD90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_WHILE_in_do_while_statement1756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_do_while_statement1758 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_do_while_statement1760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_do_while_statement1762 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_do_while_statement1767 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement1796 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement1803 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1810 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1817 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_jump_statement1819 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred13_GalaxyXDefinitionParser311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred16_GalaxyXDefinitionParser369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred20_GalaxyXDefinitionParser436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred31_GalaxyXDefinitionParser685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred70_GalaxyXDefinitionParser1244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred70_GalaxyXDefinitionParser1246 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_list_in_synpred70_GalaxyXDefinitionParser1248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred70_GalaxyXDefinitionParser1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_synpred86_GalaxyXDefinitionParser1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_synpred87_GalaxyXDefinitionParser1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred103_GalaxyXDefinitionParser1750 = new BitSet(new long[]{0x0000000000000002L});

}