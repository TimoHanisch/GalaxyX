// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g 2013-03-11 22:11:48

	package com.galaxyx.galaxyxparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class GalaxyXNewParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAMESPACE_TYPE", "TYPE", "VARDEF", "ARRAY", "NEGATION", "FUNCTION_EXPRESSION", "FIELD", "LOCAL", "PARAMETER", "PARAMETER_LIST", "NAMESPACE", "IDENTIFIER", "COLON", "END", "CLASS", "EXTENDS", "CONSTRUCTOR", "LPAREN", "RPAREN", "DESTRUCTOR", "FUNC", "RETURNS", "COMMA", "ASSGN", "SEMI", "STATIC", "CONST", "INITIALIZER", "LBRACK", "RBRACK", "NAMESPACE_ACCESS", "PUBLIC", "PRIVATE", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "LOR", "LAND", "OR", "XOR", "AND", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "SHIFTL", "SHIFTR", "PLUS", "SUB", "TIMES", "DIV", "MODULO", "THIS", "DOT", "INTEGER", "CHARACTER_LITERAL", "STRING_LITERAL", "FIXED_LITERAL", "TRUE", "FALSE", "NULL", "NOT", "NEW", "DELETE", "BIT_NOT", "IF", "ELIF", "ELSE", "WHILE", "FOR", "DO", "BREAK", "CONTINUE", "RETURN", "INLINE", "NATIVE", "STRUCT", "TYPEDEF", "INTERFACE", "IMPLEMENTS", "SUPER", "NAMEOF", "LBRACE", "RBRACE", "LETTER", "EscapeSequence", "DIGIT", "HEX_LITERAL", "HexDigit", "OctalEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT"
    };
    public static final int EOF=-1;
    public static final int NAMESPACE_TYPE=4;
    public static final int TYPE=5;
    public static final int VARDEF=6;
    public static final int ARRAY=7;
    public static final int NEGATION=8;
    public static final int FUNCTION_EXPRESSION=9;
    public static final int FIELD=10;
    public static final int LOCAL=11;
    public static final int PARAMETER=12;
    public static final int PARAMETER_LIST=13;
    public static final int NAMESPACE=14;
    public static final int IDENTIFIER=15;
    public static final int COLON=16;
    public static final int END=17;
    public static final int CLASS=18;
    public static final int EXTENDS=19;
    public static final int CONSTRUCTOR=20;
    public static final int LPAREN=21;
    public static final int RPAREN=22;
    public static final int DESTRUCTOR=23;
    public static final int FUNC=24;
    public static final int RETURNS=25;
    public static final int COMMA=26;
    public static final int ASSGN=27;
    public static final int SEMI=28;
    public static final int STATIC=29;
    public static final int CONST=30;
    public static final int INITIALIZER=31;
    public static final int LBRACK=32;
    public static final int RBRACK=33;
    public static final int NAMESPACE_ACCESS=34;
    public static final int PUBLIC=35;
    public static final int PRIVATE=36;
    public static final int ASSGNP=37;
    public static final int ASSGNS=38;
    public static final int ASSGNT=39;
    public static final int ASSGND=40;
    public static final int ASSGNM=41;
    public static final int ASSGNSHL=42;
    public static final int ASSGNSHR=43;
    public static final int ASSGNBITAND=44;
    public static final int ASSGNBITOR=45;
    public static final int ASSGNBITXOR=46;
    public static final int LOR=47;
    public static final int LAND=48;
    public static final int OR=49;
    public static final int XOR=50;
    public static final int AND=51;
    public static final int EQ=52;
    public static final int NEQ=53;
    public static final int LT=54;
    public static final int GT=55;
    public static final int LTEQ=56;
    public static final int GTEQ=57;
    public static final int SHIFTL=58;
    public static final int SHIFTR=59;
    public static final int PLUS=60;
    public static final int SUB=61;
    public static final int TIMES=62;
    public static final int DIV=63;
    public static final int MODULO=64;
    public static final int THIS=65;
    public static final int DOT=66;
    public static final int INTEGER=67;
    public static final int CHARACTER_LITERAL=68;
    public static final int STRING_LITERAL=69;
    public static final int FIXED_LITERAL=70;
    public static final int TRUE=71;
    public static final int FALSE=72;
    public static final int NULL=73;
    public static final int NOT=74;
    public static final int NEW=75;
    public static final int DELETE=76;
    public static final int BIT_NOT=77;
    public static final int IF=78;
    public static final int ELIF=79;
    public static final int ELSE=80;
    public static final int WHILE=81;
    public static final int FOR=82;
    public static final int DO=83;
    public static final int BREAK=84;
    public static final int CONTINUE=85;
    public static final int RETURN=86;
    public static final int INLINE=87;
    public static final int NATIVE=88;
    public static final int STRUCT=89;
    public static final int TYPEDEF=90;
    public static final int INTERFACE=91;
    public static final int IMPLEMENTS=92;
    public static final int SUPER=93;
    public static final int NAMEOF=94;
    public static final int LBRACE=95;
    public static final int RBRACE=96;
    public static final int LETTER=97;
    public static final int EscapeSequence=98;
    public static final int DIGIT=99;
    public static final int HEX_LITERAL=100;
    public static final int HexDigit=101;
    public static final int OctalEscape=102;
    public static final int WS=103;
    public static final int LINE_COMMENT=104;
    public static final int MULTI_COMMENT=105;

    // delegates
    // delegators


        public GalaxyXNewParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXNewParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[147+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GalaxyXNewParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:34:1: start : ( namespace_decl )* ;
    public final GalaxyXNewParser.start_return start() throws RecognitionException {
        GalaxyXNewParser.start_return retval = new GalaxyXNewParser.start_return();
        retval.start = input.LT(1);
        int start_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXNewParser.namespace_decl_return namespace_decl1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:35:2: ( ( namespace_decl )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:35:4: ( namespace_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:35:4: ( namespace_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: namespace_decl
            	    {
            	    pushFollow(FOLLOW_namespace_decl_in_start127);
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
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class namespace_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:38:1: namespace_decl : NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE -> ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* ) ;
    public final GalaxyXNewParser.namespace_decl_return namespace_decl() throws RecognitionException {
        GalaxyXNewParser.namespace_decl_return retval = new GalaxyXNewParser.namespace_decl_return();
        retval.start = input.LT(1);
        int namespace_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token NAMESPACE2=null;
        Token IDENTIFIER3=null;
        Token COLON4=null;
        Token END9=null;
        Token NAMESPACE10=null;
        GalaxyXNewParser.class_decl_return class_decl5 = null;

        GalaxyXNewParser.function_decl_return function_decl6 = null;

        GalaxyXNewParser.field_decl_return field_decl7 = null;

        GalaxyXNewParser.initializer_return initializer8 = null;


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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:39:2: ( NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE -> ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:39:4: NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer )* END NAMESPACE
            {
            NAMESPACE2=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl139); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE2);

            IDENTIFIER3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl141); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER3);

            COLON4=(Token)match(input,COLON,FOLLOW_COLON_in_namespace_decl143); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON4);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:40:4: ( class_decl | function_decl | field_decl | initializer )*
            loop2:
            do {
                int alt2=5;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:40:5: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl149);
            	    class_decl5=class_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_class_decl.add(class_decl5.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:40:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_namespace_decl153);
            	    function_decl6=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_decl.add(function_decl6.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:40:34: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace_decl157);
            	    field_decl7=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_decl.add(field_decl7.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:40:47: initializer
            	    {
            	    pushFollow(FOLLOW_initializer_in_namespace_decl161);
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

            END9=(Token)match(input,END,FOLLOW_END_in_namespace_decl167); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END9);

            NAMESPACE10=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl169); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE10);



            // AST REWRITE
            // elements: function_decl, initializer, IDENTIFIER, NAMESPACE, field_decl, class_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 42:3: -> ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:43:3: ^( NAMESPACE IDENTIFIER ( class_decl )* ( function_decl )* ( field_decl )* ( initializer )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_NAMESPACE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:43:26: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:43:38: ( function_decl )*
                while ( stream_function_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_decl.nextTree());

                }
                stream_function_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:43:53: ( field_decl )*
                while ( stream_field_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_decl.nextTree());

                }
                stream_field_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:43:65: ( initializer )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:46:1: class_decl : ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS -> ^( CLASS ( modifier )? IDENTIFIER ( EXTENDS IDENTIFIER )? ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* ) ;
    public final GalaxyXNewParser.class_decl_return class_decl() throws RecognitionException {
        GalaxyXNewParser.class_decl_return retval = new GalaxyXNewParser.class_decl_return();
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
        GalaxyXNewParser.modifier_return modifier11 = null;

        GalaxyXNewParser.field_decl_return field_decl17 = null;

        GalaxyXNewParser.function_decl_return function_decl18 = null;

        GalaxyXNewParser.constructor_decl_return constructor_decl19 = null;

        GalaxyXNewParser.destructor_decl_return destructor_decl20 = null;


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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:47:2: ( ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS -> ^( CLASS ( modifier )? IDENTIFIER ( EXTENDS IDENTIFIER )? ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:47:4: ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl )* END CLASS
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:47:4: ( modifier )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=PUBLIC && LA3_0<=PRIVATE)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_class_decl205);
                    modifier11=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier11.getTree());

                    }
                    break;

            }

            CLASS12=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS12);

            IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER13);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:47:31: ( EXTENDS IDENTIFIER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:47:32: EXTENDS IDENTIFIER
                    {
                    EXTENDS14=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_class_decl213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS14);

                    IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER15);


                    }
                    break;

            }

            COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_class_decl219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON16);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:48:4: ( field_decl | function_decl | constructor_decl | destructor_decl )*
            loop5:
            do {
                int alt5=5;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:48:5: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl225);
            	    field_decl17=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field_decl.add(field_decl17.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:48:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_class_decl229);
            	    function_decl18=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_decl.add(function_decl18.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:48:34: constructor_decl
            	    {
            	    pushFollow(FOLLOW_constructor_decl_in_class_decl233);
            	    constructor_decl19=constructor_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_constructor_decl.add(constructor_decl19.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:48:53: destructor_decl
            	    {
            	    pushFollow(FOLLOW_destructor_decl_in_class_decl237);
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

            END21=(Token)match(input,END,FOLLOW_END_in_class_decl243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END21);

            CLASS22=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl245); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS22);



            // AST REWRITE
            // elements: constructor_decl, destructor_decl, function_decl, EXTENDS, IDENTIFIER, IDENTIFIER, modifier, field_decl, CLASS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 50:3: -> ^( CLASS ( modifier )? IDENTIFIER ( EXTENDS IDENTIFIER )? ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:51:3: ^( CLASS ( modifier )? IDENTIFIER ( EXTENDS IDENTIFIER )? ( field_decl )* ( function_decl )* ( constructor_decl )* ( destructor_decl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CLASS.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:51:11: ( modifier )?
                if ( stream_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:51:32: ( EXTENDS IDENTIFIER )?
                if ( stream_EXTENDS.hasNext()||stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXTENDS.nextNode());
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_EXTENDS.reset();
                stream_IDENTIFIER.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:51:54: ( field_decl )*
                while ( stream_field_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_decl.nextTree());

                }
                stream_field_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:51:66: ( function_decl )*
                while ( stream_function_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_decl.nextTree());

                }
                stream_function_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:51:81: ( constructor_decl )*
                while ( stream_constructor_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_constructor_decl.nextTree());

                }
                stream_constructor_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:51:99: ( destructor_decl )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:54:1: constructor_decl : CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR -> ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) ;
    public final GalaxyXNewParser.constructor_decl_return constructor_decl() throws RecognitionException {
        GalaxyXNewParser.constructor_decl_return retval = new GalaxyXNewParser.constructor_decl_return();
        retval.start = input.LT(1);
        int constructor_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token CONSTRUCTOR23=null;
        Token LPAREN24=null;
        Token RPAREN26=null;
        Token COLON27=null;
        Token END30=null;
        Token CONSTRUCTOR31=null;
        GalaxyXNewParser.parameter_list_return parameter_list25 = null;

        GalaxyXNewParser.local_var_decl_return local_var_decl28 = null;

        GalaxyXNewParser.statement_return statement29 = null;


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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:55:2: ( CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR -> ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:55:4: CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR
            {
            CONSTRUCTOR23=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTRUCTOR.add(CONSTRUCTOR23);

            LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constructor_decl293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN24);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:55:23: ( parameter_list )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_constructor_decl295);
                    parameter_list25=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list25.getTree());

                    }
                    break;

            }

            RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constructor_decl298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN26);

            COLON27=(Token)match(input,COLON,FOLLOW_COLON_in_constructor_decl300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON27);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:56:4: ( local_var_decl )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_constructor_decl305);
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:57:4: ( statement )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor_decl311);
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

            END30=(Token)match(input,END,FOLLOW_END_in_constructor_decl316); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END30);

            CONSTRUCTOR31=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl318); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSTRUCTOR.add(CONSTRUCTOR31);



            // AST REWRITE
            // elements: CONSTRUCTOR, local_var_decl, parameter_list, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:3: -> ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:60:3: ^( CONSTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CONSTRUCTOR.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:60:17: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:60:33: ( local_var_decl )*
                while ( stream_local_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_local_var_decl.nextTree());

                }
                stream_local_var_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:60:49: ( statement )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:63:1: destructor_decl : DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR -> ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) ;
    public final GalaxyXNewParser.destructor_decl_return destructor_decl() throws RecognitionException {
        GalaxyXNewParser.destructor_decl_return retval = new GalaxyXNewParser.destructor_decl_return();
        retval.start = input.LT(1);
        int destructor_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DESTRUCTOR32=null;
        Token LPAREN33=null;
        Token RPAREN35=null;
        Token COLON36=null;
        Token END39=null;
        Token DESTRUCTOR40=null;
        GalaxyXNewParser.parameter_list_return parameter_list34 = null;

        GalaxyXNewParser.local_var_decl_return local_var_decl37 = null;

        GalaxyXNewParser.statement_return statement38 = null;


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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:64:2: ( DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR -> ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:64:4: DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR
            {
            DESTRUCTOR32=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTRUCTOR.add(DESTRUCTOR32);

            LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_destructor_decl351); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN33);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:64:22: ( parameter_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_destructor_decl353);
                    parameter_list34=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list34.getTree());

                    }
                    break;

            }

            RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_destructor_decl356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN35);

            COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_destructor_decl358); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON36);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:65:4: ( local_var_decl )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_destructor_decl363);
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:66:4: ( statement )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_destructor_decl369);
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

            END39=(Token)match(input,END,FOLLOW_END_in_destructor_decl374); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END39);

            DESTRUCTOR40=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl376); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTRUCTOR.add(DESTRUCTOR40);



            // AST REWRITE
            // elements: parameter_list, DESTRUCTOR, statement, local_var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 68:3: -> ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:69:3: ^( DESTRUCTOR ( parameter_list )? ( local_var_decl )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_DESTRUCTOR.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:69:16: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:69:32: ( local_var_decl )*
                while ( stream_local_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_local_var_decl.nextTree());

                }
                stream_local_var_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:69:48: ( statement )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:72:1: function_decl : ( modifier )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC -> ^( FUNC modifier IDENTIFIER ( parameter_list )? ^( RETURNS type ) ( local_var_decl )* ( statement )* ) ;
    public final GalaxyXNewParser.function_decl_return function_decl() throws RecognitionException {
        GalaxyXNewParser.function_decl_return retval = new GalaxyXNewParser.function_decl_return();
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
        GalaxyXNewParser.modifier_return modifier41 = null;

        GalaxyXNewParser.parameter_list_return parameter_list45 = null;

        GalaxyXNewParser.type_return type48 = null;

        GalaxyXNewParser.local_var_decl_return local_var_decl50 = null;

        GalaxyXNewParser.statement_return statement51 = null;


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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:73:2: ( ( modifier )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC -> ^( FUNC modifier IDENTIFIER ( parameter_list )? ^( RETURNS type ) ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:73:4: ( modifier )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:73:4: ( modifier )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=PUBLIC && LA12_0<=PRIVATE)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_function_decl407);
                    modifier41=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier41.getTree());

                    }
                    break;

            }

            FUNC42=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl410); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNC.add(FUNC42);

            IDENTIFIER43=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_decl412); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER43);

            LPAREN44=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_decl414); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN44);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:73:37: ( parameter_list )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function_decl416);
                    parameter_list45=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list45.getTree());

                    }
                    break;

            }

            RPAREN46=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_decl419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN46);

            RETURNS47=(Token)match(input,RETURNS,FOLLOW_RETURNS_in_function_decl421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURNS.add(RETURNS47);

            pushFollow(FOLLOW_type_in_function_decl423);
            type48=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type48.getTree());
            COLON49=(Token)match(input,COLON,FOLLOW_COLON_in_function_decl425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON49);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:74:4: ( local_var_decl )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_function_decl430);
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:75:4: ( statement )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function_decl436);
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

            END52=(Token)match(input,END,FOLLOW_END_in_function_decl441); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END52);

            FUNC53=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNC.add(FUNC53);



            // AST REWRITE
            // elements: local_var_decl, IDENTIFIER, modifier, parameter_list, FUNC, RETURNS, statement, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:3: -> ^( FUNC modifier IDENTIFIER ( parameter_list )? ^( RETURNS type ) ( local_var_decl )* ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:78:3: ^( FUNC modifier IDENTIFIER ( parameter_list )? ^( RETURNS type ) ( local_var_decl )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FUNC.nextNode(), root_1);

                adaptor.addChild(root_1, stream_modifier.nextTree());
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:78:30: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:78:46: ^( RETURNS type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_RETURNS.nextNode(), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:78:62: ( local_var_decl )*
                while ( stream_local_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_local_var_decl.nextTree());

                }
                stream_local_var_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:78:78: ( statement )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:81:1: parameter_list : parameter ( COMMA parameter )* -> ^( PARAMETER_LIST parameter ( parameter )* ) ;
    public final GalaxyXNewParser.parameter_list_return parameter_list() throws RecognitionException {
        GalaxyXNewParser.parameter_list_return retval = new GalaxyXNewParser.parameter_list_return();
        retval.start = input.LT(1);
        int parameter_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA55=null;
        GalaxyXNewParser.parameter_return parameter54 = null;

        GalaxyXNewParser.parameter_return parameter56 = null;


        CommonTree COMMA55_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:82:2: ( parameter ( COMMA parameter )* -> ^( PARAMETER_LIST parameter ( parameter )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:82:4: parameter ( COMMA parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameter_list484);
            parameter54=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter54.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:82:14: ( COMMA parameter )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:82:15: COMMA parameter
            	    {
            	    COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list487); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA55);

            	    pushFollow(FOLLOW_parameter_in_parameter_list489);
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
            // 83:3: -> ^( PARAMETER_LIST parameter ( parameter )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:84:3: ^( PARAMETER_LIST parameter ( parameter )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_LIST, "PARAMETER_LIST"), root_1);

                adaptor.addChild(root_1, stream_parameter.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:84:30: ( parameter )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:87:1: parameter : type IDENTIFIER -> ^( PARAMETER type IDENTIFIER ) ;
    public final GalaxyXNewParser.parameter_return parameter() throws RecognitionException {
        GalaxyXNewParser.parameter_return retval = new GalaxyXNewParser.parameter_return();
        retval.start = input.LT(1);
        int parameter_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER58=null;
        GalaxyXNewParser.type_return type57 = null;


        CommonTree IDENTIFIER58_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:88:2: ( type IDENTIFIER -> ^( PARAMETER type IDENTIFIER ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:88:4: type IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_parameter520);
            type57=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type57.getTree());
            IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter522); if (state.failed) return retval; 
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
            // 89:3: -> ^( PARAMETER type IDENTIFIER )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:90:3: ^( PARAMETER type IDENTIFIER )
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:93:1: local_var_decl : type ( array )* IDENTIFIER ( ASSGN expression )? SEMI -> ^( LOCAL type ( array )* IDENTIFIER ( ASSGN expression )? ) ;
    public final GalaxyXNewParser.local_var_decl_return local_var_decl() throws RecognitionException {
        GalaxyXNewParser.local_var_decl_return retval = new GalaxyXNewParser.local_var_decl_return();
        retval.start = input.LT(1);
        int local_var_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER61=null;
        Token ASSGN62=null;
        Token SEMI64=null;
        GalaxyXNewParser.type_return type59 = null;

        GalaxyXNewParser.array_return array60 = null;

        GalaxyXNewParser.expression_return expression63 = null;


        CommonTree IDENTIFIER61_tree=null;
        CommonTree ASSGN62_tree=null;
        CommonTree SEMI64_tree=null;
        RewriteRuleTokenStream stream_ASSGN=new RewriteRuleTokenStream(adaptor,"token ASSGN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_array=new RewriteRuleSubtreeStream(adaptor,"rule array");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:94:2: ( type ( array )* IDENTIFIER ( ASSGN expression )? SEMI -> ^( LOCAL type ( array )* IDENTIFIER ( ASSGN expression )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:94:4: type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            pushFollow(FOLLOW_type_in_local_var_decl548);
            type59=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type59.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:94:9: ( array )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==LBRACK) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_local_var_decl550);
            	    array60=array();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array.add(array60.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            IDENTIFIER61=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var_decl553); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER61);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:94:27: ( ASSGN expression )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ASSGN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:94:28: ASSGN expression
                    {
                    ASSGN62=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_local_var_decl556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSGN.add(ASSGN62);

                    pushFollow(FOLLOW_expression_in_local_var_decl558);
                    expression63=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression63.getTree());

                    }
                    break;

            }

            SEMI64=(Token)match(input,SEMI,FOLLOW_SEMI_in_local_var_decl562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI64);



            // AST REWRITE
            // elements: type, IDENTIFIER, expression, ASSGN, array
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 95:3: -> ^( LOCAL type ( array )* IDENTIFIER ( ASSGN expression )? )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:96:3: ^( LOCAL type ( array )* IDENTIFIER ( ASSGN expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCAL, "LOCAL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:96:16: ( array )*
                while ( stream_array.hasNext() ) {
                    adaptor.addChild(root_1, stream_array.nextTree());

                }
                stream_array.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:96:34: ( ASSGN expression )?
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:99:1: field_decl : ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI -> ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? ) ;
    public final GalaxyXNewParser.field_decl_return field_decl() throws RecognitionException {
        GalaxyXNewParser.field_decl_return retval = new GalaxyXNewParser.field_decl_return();
        retval.start = input.LT(1);
        int field_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token STATIC66=null;
        Token CONST67=null;
        Token IDENTIFIER70=null;
        Token ASSGN71=null;
        Token SEMI73=null;
        GalaxyXNewParser.modifier_return modifier65 = null;

        GalaxyXNewParser.type_return type68 = null;

        GalaxyXNewParser.array_return array69 = null;

        GalaxyXNewParser.expression_return expression72 = null;


        CommonTree STATIC66_tree=null;
        CommonTree CONST67_tree=null;
        CommonTree IDENTIFIER70_tree=null;
        CommonTree ASSGN71_tree=null;
        CommonTree SEMI73_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:100:2: ( ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI -> ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:100:4: ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:100:4: ( modifier )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=PUBLIC && LA19_0<=PRIVATE)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_field_decl598);
                    modifier65=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifier.add(modifier65.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:100:14: ( STATIC )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==STATIC) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: STATIC
                    {
                    STATIC66=(Token)match(input,STATIC,FOLLOW_STATIC_in_field_decl601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STATIC.add(STATIC66);


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:100:22: ( CONST )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CONST) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: CONST
                    {
                    CONST67=(Token)match(input,CONST,FOLLOW_CONST_in_field_decl604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST.add(CONST67);


                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_field_decl607);
            type68=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type68.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:100:34: ( array )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LBRACK) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_field_decl609);
            	    array69=array();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array.add(array69.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            IDENTIFIER70=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl612); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER70);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:100:52: ( ASSGN expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ASSGN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:100:53: ASSGN expression
                    {
                    ASSGN71=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_field_decl615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSGN.add(ASSGN71);

                    pushFollow(FOLLOW_expression_in_field_decl617);
                    expression72=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression72.getTree());

                    }
                    break;

            }

            SEMI73=(Token)match(input,SEMI,FOLLOW_SEMI_in_field_decl621); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI73);



            // AST REWRITE
            // elements: expression, IDENTIFIER, ASSGN, STATIC, type, CONST, modifier, array
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 101:3: -> ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:102:3: ^( FIELD ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD, "FIELD"), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:102:11: ( modifier )?
                if ( stream_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:102:21: ( STATIC )?
                if ( stream_STATIC.hasNext() ) {
                    adaptor.addChild(root_1, stream_STATIC.nextNode());

                }
                stream_STATIC.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:102:29: ( CONST )?
                if ( stream_CONST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CONST.nextNode());

                }
                stream_CONST.reset();
                adaptor.addChild(root_1, stream_type.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:102:41: ( array )*
                while ( stream_array.hasNext() ) {
                    adaptor.addChild(root_1, stream_array.nextTree());

                }
                stream_array.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:102:59: ( ASSGN expression )?
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:105:1: initializer : INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER -> ^( INITIALIZER ( local_var_decl )* ( statement )* ) ;
    public final GalaxyXNewParser.initializer_return initializer() throws RecognitionException {
        GalaxyXNewParser.initializer_return retval = new GalaxyXNewParser.initializer_return();
        retval.start = input.LT(1);
        int initializer_StartIndex = input.index();
        CommonTree root_0 = null;

        Token INITIALIZER74=null;
        Token COLON75=null;
        Token END78=null;
        Token INITIALIZER79=null;
        GalaxyXNewParser.local_var_decl_return local_var_decl76 = null;

        GalaxyXNewParser.statement_return statement77 = null;


        CommonTree INITIALIZER74_tree=null;
        CommonTree COLON75_tree=null;
        CommonTree END78_tree=null;
        CommonTree INITIALIZER79_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_INITIALIZER=new RewriteRuleTokenStream(adaptor,"token INITIALIZER");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_local_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule local_var_decl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:106:2: ( INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER -> ^( INITIALIZER ( local_var_decl )* ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:106:4: INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER
            {
            INITIALIZER74=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INITIALIZER.add(INITIALIZER74);

            COLON75=(Token)match(input,COLON,FOLLOW_COLON_in_initializer668); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON75);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:107:4: ( local_var_decl )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_initializer673);
            	    local_var_decl76=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_local_var_decl.add(local_var_decl76.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:108:4: ( statement )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_initializer679);
            	    statement77=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement77.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            END78=(Token)match(input,END,FOLLOW_END_in_initializer684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END78);

            INITIALIZER79=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INITIALIZER.add(INITIALIZER79);



            // AST REWRITE
            // elements: statement, local_var_decl, INITIALIZER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:3: -> ^( INITIALIZER ( local_var_decl )* ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:111:3: ^( INITIALIZER ( local_var_decl )* ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_INITIALIZER.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:111:17: ( local_var_decl )*
                while ( stream_local_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_local_var_decl.nextTree());

                }
                stream_local_var_decl.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:111:33: ( statement )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:114:1: array : LBRACK expression RBRACK -> ^( ARRAY expression ) ;
    public final GalaxyXNewParser.array_return array() throws RecognitionException {
        GalaxyXNewParser.array_return retval = new GalaxyXNewParser.array_return();
        retval.start = input.LT(1);
        int array_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LBRACK80=null;
        Token RBRACK82=null;
        GalaxyXNewParser.expression_return expression81 = null;


        CommonTree LBRACK80_tree=null;
        CommonTree RBRACK82_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:115:2: ( LBRACK expression RBRACK -> ^( ARRAY expression ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:115:4: LBRACK expression RBRACK
            {
            LBRACK80=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array713); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK80);

            pushFollow(FOLLOW_expression_in_array715);
            expression81=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression81.getTree());
            RBRACK82=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array717); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK82);



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
            // 115:29: -> ^( ARRAY expression )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:115:32: ^( ARRAY expression )
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:118:1: type : ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER ) | IDENTIFIER -> ^( TYPE IDENTIFIER ) );
    public final GalaxyXNewParser.type_return type() throws RecognitionException {
        GalaxyXNewParser.type_return retval = new GalaxyXNewParser.type_return();
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:119:2: ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER -> ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER ) | IDENTIFIER -> ^( TYPE IDENTIFIER ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==IDENTIFIER) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==NAMESPACE_ACCESS) ) {
                    alt26=1;
                }
                else if ( ((LA26_1>=IDENTIFIER && LA26_1<=COLON)||LA26_1==LBRACK) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:119:4: IDENTIFIER NAMESPACE_ACCESS IDENTIFIER
                    {
                    IDENTIFIER83=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER83);

                    NAMESPACE_ACCESS84=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_type739); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE_ACCESS.add(NAMESPACE_ACCESS84);

                    IDENTIFIER85=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER85);



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
                    // 119:43: -> ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:119:46: ^( NAMESPACE_TYPE IDENTIFIER IDENTIFIER )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:120:4: IDENTIFIER
                    {
                    IDENTIFIER86=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER86);



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
                    // 120:15: -> ^( TYPE IDENTIFIER )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:120:18: ^( TYPE IDENTIFIER )
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:123:1: modifier : ( PUBLIC | PRIVATE );
    public final GalaxyXNewParser.modifier_return modifier() throws RecognitionException {
        GalaxyXNewParser.modifier_return retval = new GalaxyXNewParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set87=null;

        CommonTree set87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:124:2: ( PUBLIC | PRIVATE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set87=(Token)input.LT(1);
            if ( (input.LA(1)>=PUBLIC && input.LA(1)<=PRIVATE) ) {
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:128:1: assignment_expression : expression assignment_operator expression -> ^( assignment_operator expression expression ) ;
    public final GalaxyXNewParser.assignment_expression_return assignment_expression() throws RecognitionException {
        GalaxyXNewParser.assignment_expression_return retval = new GalaxyXNewParser.assignment_expression_return();
        retval.start = input.LT(1);
        int assignment_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXNewParser.expression_return expression88 = null;

        GalaxyXNewParser.assignment_operator_return assignment_operator89 = null;

        GalaxyXNewParser.expression_return expression90 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_assignment_operator=new RewriteRuleSubtreeStream(adaptor,"rule assignment_operator");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:129:2: ( expression assignment_operator expression -> ^( assignment_operator expression expression ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:129:4: expression assignment_operator expression
            {
            pushFollow(FOLLOW_expression_in_assignment_expression792);
            expression88=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression88.getTree());
            pushFollow(FOLLOW_assignment_operator_in_assignment_expression794);
            assignment_operator89=assignment_operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_operator.add(assignment_operator89.getTree());
            pushFollow(FOLLOW_expression_in_assignment_expression796);
            expression90=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression90.getTree());


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
            // 129:46: -> ^( assignment_operator expression expression )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:129:49: ^( assignment_operator expression expression )
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:132:1: assignment_operator : ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR );
    public final GalaxyXNewParser.assignment_operator_return assignment_operator() throws RecognitionException {
        GalaxyXNewParser.assignment_operator_return retval = new GalaxyXNewParser.assignment_operator_return();
        retval.start = input.LT(1);
        int assignment_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set91=null;

        CommonTree set91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:133:2: ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set91=(Token)input.LT(1);
            if ( input.LA(1)==ASSGN||(input.LA(1)>=ASSGNP && input.LA(1)<=ASSGNBITXOR) ) {
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:146:1: expression : logical_or_expression ;
    public final GalaxyXNewParser.expression_return expression() throws RecognitionException {
        GalaxyXNewParser.expression_return retval = new GalaxyXNewParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXNewParser.logical_or_expression_return logical_or_expression92 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:147:2: ( logical_or_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:147:4: logical_or_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logical_or_expression_in_expression878);
            logical_or_expression92=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression92.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:150:1: logical_or_expression : logical_and_expression ( LOR logical_and_expression )* ;
    public final GalaxyXNewParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        GalaxyXNewParser.logical_or_expression_return retval = new GalaxyXNewParser.logical_or_expression_return();
        retval.start = input.LT(1);
        int logical_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LOR94=null;
        GalaxyXNewParser.logical_and_expression_return logical_and_expression93 = null;

        GalaxyXNewParser.logical_and_expression_return logical_and_expression95 = null;


        CommonTree LOR94_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:151:2: ( logical_and_expression ( LOR logical_and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:151:4: logical_and_expression ( LOR logical_and_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression890);
            logical_and_expression93=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression93.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:151:27: ( LOR logical_and_expression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==LOR) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:151:28: LOR logical_and_expression
            	    {
            	    LOR94=(Token)match(input,LOR,FOLLOW_LOR_in_logical_or_expression893); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOR94_tree = (CommonTree)adaptor.create(LOR94);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LOR94_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression896);
            	    logical_and_expression95=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression95.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:154:1: logical_and_expression : or_expression ( LAND or_expression )* ;
    public final GalaxyXNewParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        GalaxyXNewParser.logical_and_expression_return retval = new GalaxyXNewParser.logical_and_expression_return();
        retval.start = input.LT(1);
        int logical_and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LAND97=null;
        GalaxyXNewParser.or_expression_return or_expression96 = null;

        GalaxyXNewParser.or_expression_return or_expression98 = null;


        CommonTree LAND97_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:155:2: ( or_expression ( LAND or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:155:4: or_expression ( LAND or_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_or_expression_in_logical_and_expression909);
            or_expression96=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression96.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:155:18: ( LAND or_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==LAND) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:155:19: LAND or_expression
            	    {
            	    LAND97=(Token)match(input,LAND,FOLLOW_LAND_in_logical_and_expression912); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LAND97_tree = (CommonTree)adaptor.create(LAND97);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LAND97_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression915);
            	    or_expression98=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression98.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:158:1: or_expression : exclusive_or_expression ( OR exclusive_or_expression )* ;
    public final GalaxyXNewParser.or_expression_return or_expression() throws RecognitionException {
        GalaxyXNewParser.or_expression_return retval = new GalaxyXNewParser.or_expression_return();
        retval.start = input.LT(1);
        int or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OR100=null;
        GalaxyXNewParser.exclusive_or_expression_return exclusive_or_expression99 = null;

        GalaxyXNewParser.exclusive_or_expression_return exclusive_or_expression101 = null;


        CommonTree OR100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:159:2: ( exclusive_or_expression ( OR exclusive_or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:159:4: exclusive_or_expression ( OR exclusive_or_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_exclusive_or_expression_in_or_expression929);
            exclusive_or_expression99=exclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression99.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:159:28: ( OR exclusive_or_expression )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:159:29: OR exclusive_or_expression
            	    {
            	    OR100=(Token)match(input,OR,FOLLOW_OR_in_or_expression932); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR100_tree = (CommonTree)adaptor.create(OR100);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR100_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_exclusive_or_expression_in_or_expression935);
            	    exclusive_or_expression101=exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression101.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:162:1: exclusive_or_expression : and_expression ( XOR and_expression )* ;
    public final GalaxyXNewParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
        GalaxyXNewParser.exclusive_or_expression_return retval = new GalaxyXNewParser.exclusive_or_expression_return();
        retval.start = input.LT(1);
        int exclusive_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token XOR103=null;
        GalaxyXNewParser.and_expression_return and_expression102 = null;

        GalaxyXNewParser.and_expression_return and_expression104 = null;


        CommonTree XOR103_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:163:2: ( and_expression ( XOR and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:163:4: and_expression ( XOR and_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression949);
            and_expression102=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression102.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:163:19: ( XOR and_expression )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:163:20: XOR and_expression
            	    {
            	    XOR103=(Token)match(input,XOR,FOLLOW_XOR_in_exclusive_or_expression952); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    XOR103_tree = (CommonTree)adaptor.create(XOR103);
            	    root_0 = (CommonTree)adaptor.becomeRoot(XOR103_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression955);
            	    and_expression104=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression104.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:166:1: and_expression : equality_expression ( AND equality_expression )* ;
    public final GalaxyXNewParser.and_expression_return and_expression() throws RecognitionException {
        GalaxyXNewParser.and_expression_return retval = new GalaxyXNewParser.and_expression_return();
        retval.start = input.LT(1);
        int and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token AND106=null;
        GalaxyXNewParser.equality_expression_return equality_expression105 = null;

        GalaxyXNewParser.equality_expression_return equality_expression107 = null;


        CommonTree AND106_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:167:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:167:5: equality_expression ( AND equality_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_and_expression970);
            equality_expression105=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression105.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:167:25: ( AND equality_expression )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:167:26: AND equality_expression
            	    {
            	    AND106=(Token)match(input,AND,FOLLOW_AND_in_and_expression973); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND106_tree = (CommonTree)adaptor.create(AND106);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND106_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_and_expression976);
            	    equality_expression107=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression107.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:170:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final GalaxyXNewParser.equality_expression_return equality_expression() throws RecognitionException {
        GalaxyXNewParser.equality_expression_return retval = new GalaxyXNewParser.equality_expression_return();
        retval.start = input.LT(1);
        int equality_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set109=null;
        GalaxyXNewParser.relational_expression_return relational_expression108 = null;

        GalaxyXNewParser.relational_expression_return relational_expression110 = null;


        CommonTree set109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:171:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:171:5: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression991);
            relational_expression108=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression108.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:171:27: ( ( EQ | NEQ ) relational_expression )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:171:28: ( EQ | NEQ ) relational_expression
            	    {
            	    set109=(Token)input.LT(1);
            	    set109=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set109), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1001);
            	    relational_expression110=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression110.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:174:1: relational_expression : shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* ;
    public final GalaxyXNewParser.relational_expression_return relational_expression() throws RecognitionException {
        GalaxyXNewParser.relational_expression_return retval = new GalaxyXNewParser.relational_expression_return();
        retval.start = input.LT(1);
        int relational_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set112=null;
        GalaxyXNewParser.shift_expression_return shift_expression111 = null;

        GalaxyXNewParser.shift_expression_return shift_expression113 = null;


        CommonTree set112_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:175:2: ( shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:175:5: shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shift_expression_in_relational_expression1015);
            shift_expression111=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression111.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:175:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:175:23: ( LT | GT | LTEQ | GTEQ ) shift_expression
            	    {
            	    set112=(Token)input.LT(1);
            	    set112=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set112), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1029);
            	    shift_expression113=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression113.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:178:1: shift_expression : additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* ;
    public final GalaxyXNewParser.shift_expression_return shift_expression() throws RecognitionException {
        GalaxyXNewParser.shift_expression_return retval = new GalaxyXNewParser.shift_expression_return();
        retval.start = input.LT(1);
        int shift_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set115=null;
        GalaxyXNewParser.additive_expression_return additive_expression114 = null;

        GalaxyXNewParser.additive_expression_return additive_expression116 = null;


        CommonTree set115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:179:2: ( additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:179:5: additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_shift_expression1043);
            additive_expression114=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression114.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:179:25: ( ( SHIFTL | SHIFTR ) additive_expression )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:179:26: ( SHIFTL | SHIFTR ) additive_expression
            	    {
            	    set115=(Token)input.LT(1);
            	    set115=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFTL && input.LA(1)<=SHIFTR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set115), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1053);
            	    additive_expression116=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression116.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:182:1: additive_expression : multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* ;
    public final GalaxyXNewParser.additive_expression_return additive_expression() throws RecognitionException {
        GalaxyXNewParser.additive_expression_return retval = new GalaxyXNewParser.additive_expression_return();
        retval.start = input.LT(1);
        int additive_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set118=null;
        GalaxyXNewParser.multiplicative_expression_return multiplicative_expression117 = null;

        GalaxyXNewParser.multiplicative_expression_return multiplicative_expression119 = null;


        CommonTree set118_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:183:2: ( multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:183:5: multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1068);
            multiplicative_expression117=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression117.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:183:31: ( ( PLUS | SUB ) multiplicative_expression )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:183:32: ( PLUS | SUB ) multiplicative_expression
            	    {
            	    set118=(Token)input.LT(1);
            	    set118=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set118), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1080);
            	    multiplicative_expression119=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression119.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:186:1: multiplicative_expression : modulo_expression ( ( TIMES | DIV ) modulo_expression )* ;
    public final GalaxyXNewParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        GalaxyXNewParser.multiplicative_expression_return retval = new GalaxyXNewParser.multiplicative_expression_return();
        retval.start = input.LT(1);
        int multiplicative_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set121=null;
        GalaxyXNewParser.modulo_expression_return modulo_expression120 = null;

        GalaxyXNewParser.modulo_expression_return modulo_expression122 = null;


        CommonTree set121_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:187:2: ( modulo_expression ( ( TIMES | DIV ) modulo_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:187:5: modulo_expression ( ( TIMES | DIV ) modulo_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression1094);
            modulo_expression120=modulo_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression120.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:187:23: ( ( TIMES | DIV ) modulo_expression )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:187:24: ( TIMES | DIV ) modulo_expression
            	    {
            	    set121=(Token)input.LT(1);
            	    set121=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set121), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression1106);
            	    modulo_expression122=modulo_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression122.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:190:1: modulo_expression : unary_expression ( MODULO unary_expression )* ;
    public final GalaxyXNewParser.modulo_expression_return modulo_expression() throws RecognitionException {
        GalaxyXNewParser.modulo_expression_return retval = new GalaxyXNewParser.modulo_expression_return();
        retval.start = input.LT(1);
        int modulo_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token MODULO124=null;
        GalaxyXNewParser.unary_expression_return unary_expression123 = null;

        GalaxyXNewParser.unary_expression_return unary_expression125 = null;


        CommonTree MODULO124_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:191:2: ( unary_expression ( MODULO unary_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:191:5: unary_expression ( MODULO unary_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_modulo_expression1121);
            unary_expression123=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression123.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:191:22: ( MODULO unary_expression )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:191:23: MODULO unary_expression
            	    {
            	    MODULO124=(Token)match(input,MODULO,FOLLOW_MODULO_in_modulo_expression1124); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MODULO124_tree = (CommonTree)adaptor.create(MODULO124);
            	    root_0 = (CommonTree)adaptor.becomeRoot(MODULO124_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_modulo_expression1127);
            	    unary_expression125=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression125.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:194:1: unary_expression : ( postfix_expression | unary_operator unary_expression );
    public final GalaxyXNewParser.unary_expression_return unary_expression() throws RecognitionException {
        GalaxyXNewParser.unary_expression_return retval = new GalaxyXNewParser.unary_expression_return();
        retval.start = input.LT(1);
        int unary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXNewParser.postfix_expression_return postfix_expression126 = null;

        GalaxyXNewParser.unary_operator_return unary_operator127 = null;

        GalaxyXNewParser.unary_expression_return unary_expression128 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:195:2: ( postfix_expression | unary_operator unary_expression )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:195:5: postfix_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1142);
                    postfix_expression126=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression126.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:196:5: unary_operator unary_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unary_operator_in_unary_expression1148);
                    unary_operator127=unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(unary_operator127.getTree(), root_0);
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1151);
                    unary_expression128=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression128.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:199:1: postfix_expression : ( primary_expression | ( IDENTIFIER | THIS ) DOT postfix_expression -> ^( DOT IDENTIFIER postfix_expression ) | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression ) | IDENTIFIER ( LBRACK expression RBRACK )+ -> IDENTIFIER ( expression )+ | IDENTIFIER LPAREN expression_list RPAREN -> IDENTIFIER expression_list | IDENTIFIER LPAREN RPAREN -> ^( FUNCTION_EXPRESSION IDENTIFIER ) );
    public final GalaxyXNewParser.postfix_expression_return postfix_expression() throws RecognitionException {
        GalaxyXNewParser.postfix_expression_return retval = new GalaxyXNewParser.postfix_expression_return();
        retval.start = input.LT(1);
        int postfix_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER130=null;
        Token THIS131=null;
        Token DOT132=null;
        Token IDENTIFIER134=null;
        Token NAMESPACE_ACCESS135=null;
        Token IDENTIFIER137=null;
        Token LBRACK138=null;
        Token RBRACK140=null;
        Token IDENTIFIER141=null;
        Token LPAREN142=null;
        Token RPAREN144=null;
        Token IDENTIFIER145=null;
        Token LPAREN146=null;
        Token RPAREN147=null;
        GalaxyXNewParser.primary_expression_return primary_expression129 = null;

        GalaxyXNewParser.postfix_expression_return postfix_expression133 = null;

        GalaxyXNewParser.postfix_expression_return postfix_expression136 = null;

        GalaxyXNewParser.expression_return expression139 = null;

        GalaxyXNewParser.expression_list_return expression_list143 = null;


        CommonTree IDENTIFIER130_tree=null;
        CommonTree THIS131_tree=null;
        CommonTree DOT132_tree=null;
        CommonTree IDENTIFIER134_tree=null;
        CommonTree NAMESPACE_ACCESS135_tree=null;
        CommonTree IDENTIFIER137_tree=null;
        CommonTree LBRACK138_tree=null;
        CommonTree RBRACK140_tree=null;
        CommonTree IDENTIFIER141_tree=null;
        CommonTree LPAREN142_tree=null;
        CommonTree RPAREN144_tree=null;
        CommonTree IDENTIFIER145_tree=null;
        CommonTree LPAREN146_tree=null;
        CommonTree RPAREN147_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:200:2: ( primary_expression | ( IDENTIFIER | THIS ) DOT postfix_expression -> ^( DOT IDENTIFIER postfix_expression ) | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression ) | IDENTIFIER ( LBRACK expression RBRACK )+ -> IDENTIFIER ( expression )+ | IDENTIFIER LPAREN expression_list RPAREN -> IDENTIFIER expression_list | IDENTIFIER LPAREN RPAREN -> ^( FUNCTION_EXPRESSION IDENTIFIER ) )
            int alt41=6;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:200:4: primary_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primary_expression_in_postfix_expression1162);
                    primary_expression129=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression129.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:201:4: ( IDENTIFIER | THIS ) DOT postfix_expression
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:201:4: ( IDENTIFIER | THIS )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==IDENTIFIER) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==THIS) ) {
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
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:201:5: IDENTIFIER
                            {
                            IDENTIFIER130=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1168); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER130);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:201:18: THIS
                            {
                            THIS131=(Token)match(input,THIS,FOLLOW_THIS_in_postfix_expression1172); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS131);


                            }
                            break;

                    }

                    DOT132=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression1175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT132);

                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1177);
                    postfix_expression133=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression133.getTree());


                    // AST REWRITE
                    // elements: postfix_expression, DOT, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 201:47: -> ^( DOT IDENTIFIER postfix_expression )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:201:50: ^( DOT IDENTIFIER postfix_expression )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:202:4: IDENTIFIER NAMESPACE_ACCESS postfix_expression
                    {
                    IDENTIFIER134=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER134);

                    NAMESPACE_ACCESS135=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE_ACCESS.add(NAMESPACE_ACCESS135);

                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1196);
                    postfix_expression136=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression136.getTree());


                    // AST REWRITE
                    // elements: IDENTIFIER, NAMESPACE_ACCESS, postfix_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 202:51: -> ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:202:54: ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:203:4: IDENTIFIER ( LBRACK expression RBRACK )+
                    {
                    IDENTIFIER137=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER137);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:203:15: ( LBRACK expression RBRACK )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        alt40 = dfa40.predict(input);
                        switch (alt40) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:203:16: LBRACK expression RBRACK
                    	    {
                    	    LBRACK138=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix_expression1214); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK138);

                    	    pushFollow(FOLLOW_expression_in_postfix_expression1216);
                    	    expression139=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression139.getTree());
                    	    RBRACK140=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix_expression1218); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK140);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
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
                    // 203:43: -> IDENTIFIER ( expression )+
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:204:4: IDENTIFIER LPAREN expression_list RPAREN
                    {
                    IDENTIFIER141=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER141);

                    LPAREN142=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN142);

                    pushFollow(FOLLOW_expression_list_in_postfix_expression1236);
                    expression_list143=expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression_list.add(expression_list143.getTree());
                    RPAREN144=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1238); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN144);



                    // AST REWRITE
                    // elements: IDENTIFIER, expression_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:45: -> IDENTIFIER expression_list
                    {
                        adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_0, stream_expression_list.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:205:4: IDENTIFIER LPAREN RPAREN
                    {
                    IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER145);

                    LPAREN146=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN146);

                    RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN147);



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
                    // 205:29: -> ^( FUNCTION_EXPRESSION IDENTIFIER )
                    {
                        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:205:32: ^( FUNCTION_EXPRESSION IDENTIFIER )
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:208:1: expression_list : expression ( COMMA expression )* ;
    public final GalaxyXNewParser.expression_list_return expression_list() throws RecognitionException {
        GalaxyXNewParser.expression_list_return retval = new GalaxyXNewParser.expression_list_return();
        retval.start = input.LT(1);
        int expression_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA149=null;
        GalaxyXNewParser.expression_return expression148 = null;

        GalaxyXNewParser.expression_return expression150 = null;


        CommonTree COMMA149_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:209:2: ( expression ( COMMA expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:209:4: expression ( COMMA expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expression_list1272);
            expression148=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression148.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:209:15: ( COMMA expression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:209:16: COMMA expression
            	    {
            	    COMMA149=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression_list1275); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression_list1278);
            	    expression150=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression150.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:212:1: primary_expression : ( IDENTIFIER | LPAREN expression RPAREN | constant );
    public final GalaxyXNewParser.primary_expression_return primary_expression() throws RecognitionException {
        GalaxyXNewParser.primary_expression_return retval = new GalaxyXNewParser.primary_expression_return();
        retval.start = input.LT(1);
        int primary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER151=null;
        Token LPAREN152=null;
        Token RPAREN154=null;
        GalaxyXNewParser.expression_return expression153 = null;

        GalaxyXNewParser.constant_return constant155 = null;


        CommonTree IDENTIFIER151_tree=null;
        CommonTree LPAREN152_tree=null;
        CommonTree RPAREN154_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:213:2: ( IDENTIFIER | LPAREN expression RPAREN | constant )
            int alt43=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt43=1;
                }
                break;
            case LPAREN:
                {
                alt43=2;
                }
                break;
            case THIS:
            case INTEGER:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
            case FIXED_LITERAL:
            case TRUE:
            case FALSE:
            case NULL:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:213:4: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENTIFIER151=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1291); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER151_tree = (CommonTree)adaptor.create(IDENTIFIER151);
                    adaptor.addChild(root_0, IDENTIFIER151_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:214:4: LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN152=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression1296); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primary_expression1299);
                    expression153=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression153.getTree());
                    RPAREN154=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression1301); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:215:4: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression1307);
                    constant155=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant155.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:218:1: constant : ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS );
    public final GalaxyXNewParser.constant_return constant() throws RecognitionException {
        GalaxyXNewParser.constant_return retval = new GalaxyXNewParser.constant_return();
        retval.start = input.LT(1);
        int constant_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set156=null;

        CommonTree set156_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:219:5: ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set156=(Token)input.LT(1);
            if ( input.LA(1)==THIS||(input.LA(1)>=INTEGER && input.LA(1)<=NULL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set156));
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:229:1: unary_operator : ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT );
    public final GalaxyXNewParser.unary_operator_return unary_operator() throws RecognitionException {
        GalaxyXNewParser.unary_operator_return retval = new GalaxyXNewParser.unary_operator_return();
        retval.start = input.LT(1);
        int unary_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS157=null;
        Token SUB158=null;
        Token NOT159=null;
        Token NEW160=null;
        Token DELETE161=null;
        Token BIT_NOT162=null;

        CommonTree PLUS157_tree=null;
        CommonTree SUB158_tree=null;
        CommonTree NOT159_tree=null;
        CommonTree NEW160_tree=null;
        CommonTree DELETE161_tree=null;
        CommonTree BIT_NOT162_tree=null;
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:230:2: ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT )
            int alt44=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt44=1;
                }
                break;
            case SUB:
                {
                alt44=2;
                }
                break;
            case NOT:
                {
                alt44=3;
                }
                break;
            case NEW:
                {
                alt44=4;
                }
                break;
            case DELETE:
                {
                alt44=5;
                }
                break;
            case BIT_NOT:
                {
                alt44=6;
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:230:5: PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS157=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_operator1394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS157_tree = (CommonTree)adaptor.create(PLUS157);
                    adaptor.addChild(root_0, PLUS157_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:231:5: SUB
                    {
                    SUB158=(Token)match(input,SUB,FOLLOW_SUB_in_unary_operator1400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUB.add(SUB158);



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
                    // 231:9: -> NEGATION
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:232:5: NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT159=(Token)match(input,NOT,FOLLOW_NOT_in_unary_operator1410); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT159_tree = (CommonTree)adaptor.create(NOT159);
                    adaptor.addChild(root_0, NOT159_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:233:5: NEW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEW160=(Token)match(input,NEW,FOLLOW_NEW_in_unary_operator1416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW160_tree = (CommonTree)adaptor.create(NEW160);
                    adaptor.addChild(root_0, NEW160_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:234:5: DELETE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DELETE161=(Token)match(input,DELETE,FOLLOW_DELETE_in_unary_operator1422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DELETE161_tree = (CommonTree)adaptor.create(DELETE161);
                    adaptor.addChild(root_0, DELETE161_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:235:4: BIT_NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BIT_NOT162=(Token)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_unary_operator1427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIT_NOT162_tree = (CommonTree)adaptor.create(BIT_NOT162);
                    adaptor.addChild(root_0, BIT_NOT162_tree);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:238:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );
    public final GalaxyXNewParser.statement_return statement() throws RecognitionException {
        GalaxyXNewParser.statement_return retval = new GalaxyXNewParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXNewParser.assignment_statement_return assignment_statement163 = null;

        GalaxyXNewParser.expression_statement_return expression_statement164 = null;

        GalaxyXNewParser.if_statement_return if_statement165 = null;

        GalaxyXNewParser.while_statement_return while_statement166 = null;

        GalaxyXNewParser.do_while_statement_return do_while_statement167 = null;

        GalaxyXNewParser.for_statement_return for_statement168 = null;

        GalaxyXNewParser.jump_statement_return jump_statement169 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:239:2: ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement )
            int alt45=7;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:239:4: assignment_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_statement_in_statement1439);
                    assignment_statement163=assignment_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement163.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:240:4: expression_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_statement_in_statement1444);
                    expression_statement164=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement164.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:241:4: if_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement1449);
                    if_statement165=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement165.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:242:4: while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement1454);
                    while_statement166=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement166.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:243:4: do_while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_do_while_statement_in_statement1459);
                    do_while_statement167=do_while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, do_while_statement167.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:244:4: for_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_statement_in_statement1464);
                    for_statement168=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement168.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:245:4: jump_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_jump_statement_in_statement1469);
                    jump_statement169=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement169.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:248:1: assignment_statement : assignment_expression SEMI ;
    public final GalaxyXNewParser.assignment_statement_return assignment_statement() throws RecognitionException {
        GalaxyXNewParser.assignment_statement_return retval = new GalaxyXNewParser.assignment_statement_return();
        retval.start = input.LT(1);
        int assignment_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI171=null;
        GalaxyXNewParser.assignment_expression_return assignment_expression170 = null;


        CommonTree SEMI171_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:249:2: ( assignment_expression SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:249:4: assignment_expression SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_assignment_statement1481);
            assignment_expression170=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression170.getTree());
            SEMI171=(Token)match(input,SEMI,FOLLOW_SEMI_in_assignment_statement1483); if (state.failed) return retval;

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:252:1: expression_statement : ( SEMI | expression SEMI );
    public final GalaxyXNewParser.expression_statement_return expression_statement() throws RecognitionException {
        GalaxyXNewParser.expression_statement_return retval = new GalaxyXNewParser.expression_statement_return();
        retval.start = input.LT(1);
        int expression_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI172=null;
        Token SEMI174=null;
        GalaxyXNewParser.expression_return expression173 = null;


        CommonTree SEMI172_tree=null;
        CommonTree SEMI174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:253:2: ( SEMI | expression SEMI )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:253:4: SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEMI172=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1496); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:254:4: expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_expression_statement1502);
                    expression173=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression173.getTree());
                    SEMI174=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1504); if (state.failed) return retval;

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:257:1: if_statement : IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF -> ^( IF expression ( statement )* ( ^( ELIF expression ( statement )* ) )* ( ^( ELSE ( statement )* ) )? ) ;
    public final GalaxyXNewParser.if_statement_return if_statement() throws RecognitionException {
        GalaxyXNewParser.if_statement_return retval = new GalaxyXNewParser.if_statement_return();
        retval.start = input.LT(1);
        int if_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IF175=null;
        Token LPAREN176=null;
        Token RPAREN178=null;
        Token COLON179=null;
        Token ELIF181=null;
        Token LPAREN182=null;
        Token RPAREN184=null;
        Token COLON185=null;
        Token ELSE187=null;
        Token COLON188=null;
        Token END190=null;
        Token IF191=null;
        GalaxyXNewParser.expression_return expression177 = null;

        GalaxyXNewParser.statement_return statement180 = null;

        GalaxyXNewParser.expression_return expression183 = null;

        GalaxyXNewParser.statement_return statement186 = null;

        GalaxyXNewParser.statement_return statement189 = null;


        CommonTree IF175_tree=null;
        CommonTree LPAREN176_tree=null;
        CommonTree RPAREN178_tree=null;
        CommonTree COLON179_tree=null;
        CommonTree ELIF181_tree=null;
        CommonTree LPAREN182_tree=null;
        CommonTree RPAREN184_tree=null;
        CommonTree COLON185_tree=null;
        CommonTree ELSE187_tree=null;
        CommonTree COLON188_tree=null;
        CommonTree END190_tree=null;
        CommonTree IF191_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:258:2: ( IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF -> ^( IF expression ( statement )* ( ^( ELIF expression ( statement )* ) )* ( ^( ELSE ( statement )* ) )? ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:258:4: IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF
            {
            IF175=(Token)match(input,IF,FOLLOW_IF_in_if_statement1517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF175);

            LPAREN176=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1519); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN176);

            pushFollow(FOLLOW_expression_in_if_statement1521);
            expression177=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression177.getTree());
            RPAREN178=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1523); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN178);

            COLON179=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1525); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON179);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:259:4: ( statement )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement1530);
            	    statement180=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement180.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:260:3: ( ELIF LPAREN expression RPAREN COLON ( statement )* )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ELIF) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:260:4: ELIF LPAREN expression RPAREN COLON ( statement )*
            	    {
            	    ELIF181=(Token)match(input,ELIF,FOLLOW_ELIF_in_if_statement1536); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ELIF.add(ELIF181);

            	    LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1538); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);

            	    pushFollow(FOLLOW_expression_in_if_statement1540);
            	    expression183=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression183.getTree());
            	    RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1542); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);

            	    COLON185=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1544); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON185);

            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:261:4: ( statement )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        alt48 = dfa48.predict(input);
            	        switch (alt48) {
            	    	case 1 :
            	    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement1549);
            	    	    statement186=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) stream_statement.add(statement186.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:262:3: ( ELSE COLON ( statement )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ELSE) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:262:4: ELSE COLON ( statement )*
                    {
                    ELSE187=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE187);

                    COLON188=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON188);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:263:4: ( statement )*
                    loop50:
                    do {
                        int alt50=2;
                        alt50 = dfa50.predict(input);
                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement1565);
                    	    statement189=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement189.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            END190=(Token)match(input,END,FOLLOW_END_in_if_statement1572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END190);

            IF191=(Token)match(input,IF,FOLLOW_IF_in_if_statement1574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF191);



            // AST REWRITE
            // elements: expression, IF, ELSE, expression, statement, statement, statement, ELIF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 265:3: -> ^( IF expression ( statement )* ( ^( ELIF expression ( statement )* ) )* ( ^( ELSE ( statement )* ) )? )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:266:3: ^( IF expression ( statement )* ( ^( ELIF expression ( statement )* ) )* ( ^( ELSE ( statement )* ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:266:19: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:266:30: ( ^( ELIF expression ( statement )* ) )*
                while ( stream_expression.hasNext()||stream_ELIF.hasNext() ) {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:266:30: ^( ELIF expression ( statement )* )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_ELIF.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_expression.nextTree());
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:266:48: ( statement )*
                    while ( stream_statement.hasNext() ) {
                        adaptor.addChild(root_2, stream_statement.nextTree());

                    }
                    stream_statement.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_expression.reset();
                stream_ELIF.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:266:61: ( ^( ELSE ( statement )* ) )?
                if ( stream_ELSE.hasNext()||stream_statement.hasNext() ) {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:266:61: ^( ELSE ( statement )* )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:266:68: ( statement )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:269:1: while_statement : WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE -> ^( WHILE expression ( statement )* ) ;
    public final GalaxyXNewParser.while_statement_return while_statement() throws RecognitionException {
        GalaxyXNewParser.while_statement_return retval = new GalaxyXNewParser.while_statement_return();
        retval.start = input.LT(1);
        int while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token WHILE192=null;
        Token LPAREN193=null;
        Token RPAREN195=null;
        Token COLON196=null;
        Token END198=null;
        Token WHILE199=null;
        GalaxyXNewParser.expression_return expression194 = null;

        GalaxyXNewParser.statement_return statement197 = null;


        CommonTree WHILE192_tree=null;
        CommonTree LPAREN193_tree=null;
        CommonTree RPAREN195_tree=null;
        CommonTree COLON196_tree=null;
        CommonTree END198_tree=null;
        CommonTree WHILE199_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:270:2: ( WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE -> ^( WHILE expression ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:270:4: WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE
            {
            WHILE192=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1619); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE192);

            LPAREN193=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1621); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN193);

            pushFollow(FOLLOW_expression_in_while_statement1623);
            expression194=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression194.getTree());
            RPAREN195=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1625); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN195);

            COLON196=(Token)match(input,COLON,FOLLOW_COLON_in_while_statement1627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON196);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:271:4: ( statement )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement1632);
            	    statement197=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement197.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            END198=(Token)match(input,END,FOLLOW_END_in_while_statement1637); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END198);

            WHILE199=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE199);



            // AST REWRITE
            // elements: WHILE, expression, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 273:3: -> ^( WHILE expression ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:274:3: ^( WHILE expression ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:274:22: ( statement )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:277:1: for_statement : FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR -> ^( FOR ( assignment_expression )? ( expression )? ( expression )? ( statement )* ) ;
    public final GalaxyXNewParser.for_statement_return for_statement() throws RecognitionException {
        GalaxyXNewParser.for_statement_return retval = new GalaxyXNewParser.for_statement_return();
        retval.start = input.LT(1);
        int for_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token FOR200=null;
        Token LPAREN201=null;
        Token SEMI203=null;
        Token SEMI205=null;
        Token RPAREN207=null;
        Token COLON208=null;
        Token END210=null;
        Token FOR211=null;
        GalaxyXNewParser.assignment_expression_return assignment_expression202 = null;

        GalaxyXNewParser.expression_return expression204 = null;

        GalaxyXNewParser.expression_return expression206 = null;

        GalaxyXNewParser.statement_return statement209 = null;


        CommonTree FOR200_tree=null;
        CommonTree LPAREN201_tree=null;
        CommonTree SEMI203_tree=null;
        CommonTree SEMI205_tree=null;
        CommonTree RPAREN207_tree=null;
        CommonTree COLON208_tree=null;
        CommonTree END210_tree=null;
        CommonTree FOR211_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:278:2: ( FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR -> ^( FOR ( assignment_expression )? ( expression )? ( expression )? ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:278:4: FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR
            {
            FOR200=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR200);

            LPAREN201=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_for_statement1668); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN201);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:278:15: ( assignment_expression )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: assignment_expression
                    {
                    pushFollow(FOLLOW_assignment_expression_in_for_statement1670);
                    assignment_expression202=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression202.getTree());

                    }
                    break;

            }

            SEMI203=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1673); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI203);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:278:43: ( expression )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1675);
                    expression204=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression204.getTree());

                    }
                    break;

            }

            SEMI205=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1678); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI205);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:278:60: ( expression )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1680);
                    expression206=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression206.getTree());

                    }
                    break;

            }

            RPAREN207=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_for_statement1683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN207);

            COLON208=(Token)match(input,COLON,FOLLOW_COLON_in_for_statement1685); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON208);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:279:4: ( statement )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_for_statement1690);
            	    statement209=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement209.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            END210=(Token)match(input,END,FOLLOW_END_in_for_statement1695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END210);

            FOR211=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1697); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR211);



            // AST REWRITE
            // elements: statement, assignment_expression, expression, FOR, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 281:3: -> ^( FOR ( assignment_expression )? ( expression )? ( expression )? ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:282:3: ^( FOR ( assignment_expression )? ( expression )? ( expression )? ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:282:9: ( assignment_expression )?
                if ( stream_assignment_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignment_expression.nextTree());

                }
                stream_assignment_expression.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:282:32: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:282:44: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:282:56: ( statement )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:285:1: do_while_statement : DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO -> ^( WHILE expression ( statement )* ) ;
    public final GalaxyXNewParser.do_while_statement_return do_while_statement() throws RecognitionException {
        GalaxyXNewParser.do_while_statement_return retval = new GalaxyXNewParser.do_while_statement_return();
        retval.start = input.LT(1);
        int do_while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DO212=null;
        Token COLON213=null;
        Token WHILE215=null;
        Token LPAREN216=null;
        Token RPAREN218=null;
        Token END219=null;
        Token DO220=null;
        GalaxyXNewParser.statement_return statement214 = null;

        GalaxyXNewParser.expression_return expression217 = null;


        CommonTree DO212_tree=null;
        CommonTree COLON213_tree=null;
        CommonTree WHILE215_tree=null;
        CommonTree LPAREN216_tree=null;
        CommonTree RPAREN218_tree=null;
        CommonTree END219_tree=null;
        CommonTree DO220_tree=null;
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:286:2: ( DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO -> ^( WHILE expression ( statement )* ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:286:4: DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO
            {
            DO212=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1731); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO212);

            COLON213=(Token)match(input,COLON,FOLLOW_COLON_in_do_while_statement1733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON213);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:287:4: ( statement )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_do_while_statement1738);
            	    statement214=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement214.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            WHILE215=(Token)match(input,WHILE,FOLLOW_WHILE_in_do_while_statement1744); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE215);

            LPAREN216=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_do_while_statement1746); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN216);

            pushFollow(FOLLOW_expression_in_do_while_statement1748);
            expression217=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression217.getTree());
            RPAREN218=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_do_while_statement1750); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN218);

            END219=(Token)match(input,END,FOLLOW_END_in_do_while_statement1755); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END219);

            DO220=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1757); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO220);



            // AST REWRITE
            // elements: WHILE, statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 290:3: -> ^( WHILE expression ( statement )* )
            {
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:291:3: ^( WHILE expression ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:291:22: ( statement )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:294:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );
    public final GalaxyXNewParser.jump_statement_return jump_statement() throws RecognitionException {
        GalaxyXNewParser.jump_statement_return retval = new GalaxyXNewParser.jump_statement_return();
        retval.start = input.LT(1);
        int jump_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BREAK221=null;
        Token SEMI222=null;
        Token CONTINUE223=null;
        Token SEMI224=null;
        Token RETURN225=null;
        Token SEMI226=null;
        Token RETURN227=null;
        Token SEMI229=null;
        GalaxyXNewParser.expression_return expression228 = null;


        CommonTree BREAK221_tree=null;
        CommonTree SEMI222_tree=null;
        CommonTree CONTINUE223_tree=null;
        CommonTree SEMI224_tree=null;
        CommonTree RETURN225_tree=null;
        CommonTree SEMI226_tree=null;
        CommonTree RETURN227_tree=null;
        CommonTree SEMI229_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:295:2: ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI )
            int alt58=4;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:295:4: BREAK SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BREAK221=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement1784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK221_tree = (CommonTree)adaptor.create(BREAK221);
                    adaptor.addChild(root_0, BREAK221_tree);
                    }
                    SEMI222=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI222_tree = (CommonTree)adaptor.create(SEMI222);
                    adaptor.addChild(root_0, SEMI222_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:296:4: CONTINUE SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CONTINUE223=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTINUE223_tree = (CommonTree)adaptor.create(CONTINUE223);
                    adaptor.addChild(root_0, CONTINUE223_tree);
                    }
                    SEMI224=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1793); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI224_tree = (CommonTree)adaptor.create(SEMI224);
                    adaptor.addChild(root_0, SEMI224_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:297:4: RETURN SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RETURN225=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN225_tree = (CommonTree)adaptor.create(RETURN225);
                    adaptor.addChild(root_0, RETURN225_tree);
                    }
                    SEMI226=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1800); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI226_tree = (CommonTree)adaptor.create(SEMI226);
                    adaptor.addChild(root_0, SEMI226_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:298:4: RETURN expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RETURN227=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN227_tree = (CommonTree)adaptor.create(RETURN227);
                    adaptor.addChild(root_0, RETURN227_tree);
                    }
                    pushFollow(FOLLOW_expression_in_jump_statement1807);
                    expression228=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression228.getTree());
                    SEMI229=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1809); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI229_tree = (CommonTree)adaptor.create(SEMI229);
                    adaptor.addChild(root_0, SEMI229_tree);
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

    // $ANTLR start synpred13_GalaxyXNew
    public final void synpred13_GalaxyXNew_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:56:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:56:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred13_GalaxyXNew305);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_GalaxyXNew

    // $ANTLR start synpred16_GalaxyXNew
    public final void synpred16_GalaxyXNew_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:65:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:65:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred16_GalaxyXNew363);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_GalaxyXNew

    // $ANTLR start synpred20_GalaxyXNew
    public final void synpred20_GalaxyXNew_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:74:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:74:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred20_GalaxyXNew430);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_GalaxyXNew

    // $ANTLR start synpred30_GalaxyXNew
    public final void synpred30_GalaxyXNew_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:107:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:107:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred30_GalaxyXNew673);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_GalaxyXNew

    // $ANTLR start synpred69_GalaxyXNew
    public final void synpred69_GalaxyXNew_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:204:4: ( IDENTIFIER LPAREN expression_list RPAREN )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:204:4: IDENTIFIER LPAREN expression_list RPAREN
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred69_GalaxyXNew1232); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred69_GalaxyXNew1234); if (state.failed) return ;
        pushFollow(FOLLOW_expression_list_in_synpred69_GalaxyXNew1236);
        expression_list();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred69_GalaxyXNew1238); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_GalaxyXNew

    // $ANTLR start synpred85_GalaxyXNew
    public final void synpred85_GalaxyXNew_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:239:4: ( assignment_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:239:4: assignment_statement
        {
        pushFollow(FOLLOW_assignment_statement_in_synpred85_GalaxyXNew1439);
        assignment_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_GalaxyXNew

    // $ANTLR start synpred86_GalaxyXNew
    public final void synpred86_GalaxyXNew_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:240:4: ( expression_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:240:4: expression_statement
        {
        pushFollow(FOLLOW_expression_statement_in_synpred86_GalaxyXNew1444);
        expression_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_GalaxyXNew

    // $ANTLR start synpred102_GalaxyXNew
    public final void synpred102_GalaxyXNew_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:287:4: ( statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXNew.g:287:4: statement
        {
        pushFollow(FOLLOW_statement_in_synpred102_GalaxyXNew1738);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_GalaxyXNew

    // Delegated rules

    public final boolean synpred102_GalaxyXNew() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_GalaxyXNew_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_GalaxyXNew() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_GalaxyXNew_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_GalaxyXNew() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_GalaxyXNew_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_GalaxyXNew() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_GalaxyXNew_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_GalaxyXNew() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_GalaxyXNew_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_GalaxyXNew() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_GalaxyXNew_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_GalaxyXNew() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_GalaxyXNew_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_GalaxyXNew() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_GalaxyXNew_fragment(); // can never throw exception
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
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\17\1\uffff\1\17\13\uffff";
    static final String DFA2_maxS =
        "\1\44\1\uffff\1\36\13\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\2\1\3\2\uffff\1\4\5\uffff";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\1\uffff\1\1\1\3\5\uffff\1\4\4\uffff\2\5\1\10\3\uffff\2"+
            "\2",
            "",
            "\1\5\2\uffff\1\3\5\uffff\1\4\4\uffff\2\5",
            "",
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
            return "()* loopback of 40:4: ( class_decl | function_decl | field_decl | initializer )*";
        }
    }
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\1\17\1\uffff\1\17\12\uffff";
    static final String DFA5_maxS =
        "\1\44\1\uffff\1\36\12\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\2\uffff\1\2\1\3\1\4\4\uffff";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\1\uffff\1\1\2\uffff\1\7\2\uffff\1\10\1\6\4\uffff\2\3\4"+
            "\uffff\2\2",
            "",
            "\1\3\10\uffff\1\6\4\uffff\2\3",
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
            return "()* loopback of 48:4: ( field_decl | function_decl | constructor_decl | destructor_decl )*";
        }
    }
    static final String DFA7_eotS =
        "\46\uffff";
    static final String DFA7_eofS =
        "\46\uffff";
    static final String DFA7_minS =
        "\2\17\22\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA7_maxS =
        "\1\126\1\102\22\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\42\uffff\1\1";
    static final String DFA7_specialS =
        "\24\uffff\1\0\16\uffff\1\1\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\uffff\1\2\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "\1\45\5\uffff\1\2\5\uffff\2\2\3\uffff\1\43\1\uffff\1\24\2"+
            "\uffff\34\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 56:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_20 = input.LA(1);

                         
                        int index7_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_GalaxyXNew()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_35 = input.LA(1);

                         
                        int index7_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_GalaxyXNew()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_35);
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
        "\1\17\23\uffff";
    static final String DFA8_maxS =
        "\1\126\23\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA8_specialS =
        "\24\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\uffff\1\1\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 57:4: ( statement )*";
        }
    }
    static final String DFA10_eotS =
        "\46\uffff";
    static final String DFA10_eofS =
        "\46\uffff";
    static final String DFA10_minS =
        "\2\17\22\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA10_maxS =
        "\1\126\1\102\22\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\42\uffff\1\1";
    static final String DFA10_specialS =
        "\24\uffff\1\0\16\uffff\1\1\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\uffff\1\2\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "\1\45\5\uffff\1\2\5\uffff\2\2\3\uffff\1\43\1\uffff\1\24\2"+
            "\uffff\34\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 65:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_20 = input.LA(1);

                         
                        int index10_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_GalaxyXNew()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_35 = input.LA(1);

                         
                        int index10_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_GalaxyXNew()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_35);
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
        "\1\17\23\uffff";
    static final String DFA11_maxS =
        "\1\126\23\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA11_specialS =
        "\24\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\1\1\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 66:4: ( statement )*";
        }
    }
    static final String DFA14_eotS =
        "\46\uffff";
    static final String DFA14_eofS =
        "\46\uffff";
    static final String DFA14_minS =
        "\2\17\22\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA14_maxS =
        "\1\126\1\102\22\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\42\uffff\1\1";
    static final String DFA14_specialS =
        "\24\uffff\1\0\16\uffff\1\1\2\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\uffff\1\2\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "\1\45\5\uffff\1\2\5\uffff\2\2\3\uffff\1\43\1\uffff\1\24\2"+
            "\uffff\34\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 74:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_20 = input.LA(1);

                         
                        int index14_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_GalaxyXNew()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_35 = input.LA(1);

                         
                        int index14_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_GalaxyXNew()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_35);
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
        "\1\17\23\uffff";
    static final String DFA15_maxS =
        "\1\126\23\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA15_specialS =
        "\24\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\1\1\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 75:4: ( statement )*";
        }
    }
    static final String DFA24_eotS =
        "\46\uffff";
    static final String DFA24_eofS =
        "\46\uffff";
    static final String DFA24_minS =
        "\2\17\22\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA24_maxS =
        "\1\126\1\102\22\uffff\1\0\16\uffff\1\0\2\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\42\uffff\1\1";
    static final String DFA24_specialS =
        "\24\uffff\1\0\16\uffff\1\1\2\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\uffff\1\2\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "\1\45\5\uffff\1\2\5\uffff\2\2\3\uffff\1\43\1\uffff\1\24\2"+
            "\uffff\34\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 107:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_20 = input.LA(1);

                         
                        int index24_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_GalaxyXNew()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_35 = input.LA(1);

                         
                        int index24_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_GalaxyXNew()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\24\uffff";
    static final String DFA25_eofS =
        "\24\uffff";
    static final String DFA25_minS =
        "\1\17\23\uffff";
    static final String DFA25_maxS =
        "\1\126\23\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA25_specialS =
        "\24\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\1\uffff\1\1\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 108:4: ( statement )*";
        }
    }
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\1\1\11\uffff";
    static final String DFA29_minS =
        "\1\26\11\uffff";
    static final String DFA29_maxS =
        "\1\61\11\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA29_specialS =
        "\12\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\3\uffff\3\1\4\uffff\1\1\3\uffff\14\1\1\11",
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

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "()* loopback of 159:28: ( OR exclusive_or_expression )*";
        }
    }
    static final String DFA30_eotS =
        "\13\uffff";
    static final String DFA30_eofS =
        "\1\1\12\uffff";
    static final String DFA30_minS =
        "\1\26\12\uffff";
    static final String DFA30_maxS =
        "\1\62\12\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA30_specialS =
        "\13\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\3\uffff\3\1\4\uffff\1\1\3\uffff\15\1\1\12",
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
            return "()* loopback of 163:19: ( XOR and_expression )*";
        }
    }
    static final String DFA31_eotS =
        "\14\uffff";
    static final String DFA31_eofS =
        "\1\1\13\uffff";
    static final String DFA31_minS =
        "\1\26\13\uffff";
    static final String DFA31_maxS =
        "\1\63\13\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA31_specialS =
        "\14\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\3\uffff\3\1\4\uffff\1\1\3\uffff\16\1\1\13",
            "",
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
            return "()* loopback of 167:25: ( AND equality_expression )*";
        }
    }
    static final String DFA32_eotS =
        "\15\uffff";
    static final String DFA32_eofS =
        "\1\1\14\uffff";
    static final String DFA32_minS =
        "\1\26\14\uffff";
    static final String DFA32_maxS =
        "\1\65\14\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\12\uffff\1\1";
    static final String DFA32_specialS =
        "\15\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\3\uffff\3\1\4\uffff\1\1\3\uffff\17\1\2\14",
            "",
            "",
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
            return "()* loopback of 171:27: ( ( EQ | NEQ ) relational_expression )*";
        }
    }
    static final String DFA33_eotS =
        "\16\uffff";
    static final String DFA33_eofS =
        "\1\1\15\uffff";
    static final String DFA33_minS =
        "\1\26\15\uffff";
    static final String DFA33_maxS =
        "\1\71\15\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA33_specialS =
        "\16\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\3\uffff\3\1\4\uffff\1\1\3\uffff\21\1\4\15",
            "",
            "",
            "",
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
            return "()* loopback of 175:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*";
        }
    }
    static final String DFA34_eotS =
        "\17\uffff";
    static final String DFA34_eofS =
        "\1\1\16\uffff";
    static final String DFA34_minS =
        "\1\26\16\uffff";
    static final String DFA34_maxS =
        "\1\73\16\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\2\14\uffff\1\1";
    static final String DFA34_specialS =
        "\17\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\3\uffff\3\1\4\uffff\1\1\3\uffff\25\1\2\16",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 179:25: ( ( SHIFTL | SHIFTR ) additive_expression )*";
        }
    }
    static final String DFA35_eotS =
        "\20\uffff";
    static final String DFA35_eofS =
        "\1\1\17\uffff";
    static final String DFA35_minS =
        "\1\26\17\uffff";
    static final String DFA35_maxS =
        "\1\75\17\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA35_specialS =
        "\20\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\3\uffff\3\1\4\uffff\1\1\3\uffff\27\1\2\17",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 183:31: ( ( PLUS | SUB ) multiplicative_expression )*";
        }
    }
    static final String DFA36_eotS =
        "\21\uffff";
    static final String DFA36_eofS =
        "\1\1\20\uffff";
    static final String DFA36_minS =
        "\1\26\20\uffff";
    static final String DFA36_maxS =
        "\1\77\20\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA36_specialS =
        "\21\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\3\uffff\3\1\4\uffff\1\1\3\uffff\31\1\2\20",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 187:23: ( ( TIMES | DIV ) modulo_expression )*";
        }
    }
    static final String DFA37_eotS =
        "\22\uffff";
    static final String DFA37_eofS =
        "\1\1\21\uffff";
    static final String DFA37_minS =
        "\1\26\21\uffff";
    static final String DFA37_maxS =
        "\1\100\21\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\2\17\uffff\1\1";
    static final String DFA37_specialS =
        "\22\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\3\uffff\3\1\4\uffff\1\1\3\uffff\33\1\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 191:22: ( MODULO unary_expression )*";
        }
    }
    static final String DFA38_eotS =
        "\13\uffff";
    static final String DFA38_eofS =
        "\13\uffff";
    static final String DFA38_minS =
        "\1\17\12\uffff";
    static final String DFA38_maxS =
        "\1\115\12\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\5\uffff";
    static final String DFA38_specialS =
        "\13\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1\5\uffff\1\1\46\uffff\2\5\3\uffff\1\1\1\uffff\7\1\4\5",
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
            return "194:1: unary_expression : ( postfix_expression | unary_operator unary_expression );";
        }
    }
    static final String DFA41_eotS =
        "\56\uffff";
    static final String DFA41_eofS =
        "\1\uffff\1\2\1\uffff\1\2\52\uffff";
    static final String DFA41_minS =
        "\1\17\1\25\1\uffff\1\26\2\uffff\1\0\47\uffff";
    static final String DFA41_maxS =
        "\1\111\1\102\1\uffff\1\102\2\uffff\1\0\47\uffff";
    static final String DFA41_acceptS =
        "\2\uffff\1\1\2\uffff\1\3\22\uffff\1\2\1\4\22\uffff\1\5\1\6";
    static final String DFA41_specialS =
        "\6\uffff\1\0\47\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\5\uffff\1\2\53\uffff\1\3\1\uffff\7\2",
            "\1\6\1\2\3\uffff\3\2\3\uffff\1\31\1\2\1\5\2\uffff\34\2\1\uffff"+
            "\1\30",
            "",
            "\1\2\3\uffff\3\2\4\uffff\1\2\3\uffff\34\2\1\uffff\1\30",
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
            return "199:1: postfix_expression : ( primary_expression | ( IDENTIFIER | THIS ) DOT postfix_expression -> ^( DOT IDENTIFIER postfix_expression ) | IDENTIFIER NAMESPACE_ACCESS postfix_expression -> ^( NAMESPACE_ACCESS IDENTIFIER postfix_expression ) | IDENTIFIER ( LBRACK expression RBRACK )+ -> IDENTIFIER ( expression )+ | IDENTIFIER LPAREN expression_list RPAREN -> IDENTIFIER expression_list | IDENTIFIER LPAREN RPAREN -> ^( FUNCTION_EXPRESSION IDENTIFIER ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_6 = input.LA(1);

                         
                        int index41_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_GalaxyXNew()) ) {s = 44;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index41_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\23\uffff";
    static final String DFA40_eofS =
        "\1\1\22\uffff";
    static final String DFA40_minS =
        "\1\26\22\uffff";
    static final String DFA40_maxS =
        "\1\100\22\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\2\20\uffff\1\1";
    static final String DFA40_specialS =
        "\23\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\3\uffff\3\1\3\uffff\1\22\1\1\3\uffff\34\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()+ loopback of 203:15: ( LBRACK expression RBRACK )+";
        }
    }
    static final String DFA45_eotS =
        "\u0085\uffff";
    static final String DFA45_eofS =
        "\u0085\uffff";
    static final String DFA45_minS =
        "\1\17\1\25\1\17\2\33\6\17\10\uffff\15\0\1\uffff\2\0\1\uffff\25"+
        "\0\1\uffff\1\0\1\uffff\13\0\2\uffff\74\0";
    static final String DFA45_maxS =
        "\1\126\1\102\1\115\1\102\1\100\6\115\10\uffff\15\0\1\uffff\2\0"+
        "\1\uffff\25\0\1\uffff\1\0\1\uffff\13\0\2\uffff\74\0";
    static final String DFA45_acceptS =
        "\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\17\uffff\1\1\144\uffff";
    static final String DFA45_specialS =
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
    static final String[] DFA45_transitionS = {
            "\1\1\5\uffff\1\2\6\uffff\1\13\37\uffff\1\5\1\6\3\uffff\1\3"+
            "\1\uffff\7\4\1\7\1\10\1\11\1\12\1\14\2\uffff\1\15\1\17\1\16"+
            "\3\20",
            "\1\24\5\uffff\1\40\1\13\3\uffff\1\42\1\uffff\1\23\2\uffff"+
            "\12\40\1\37\1\36\1\35\1\34\1\33\2\32\4\31\2\30\2\27\2\26\1\25"+
            "\1\uffff\1\41",
            "\1\44\5\uffff\1\45\46\uffff\1\50\1\51\3\uffff\1\46\1\uffff"+
            "\7\47\1\52\1\53\1\54\1\55",
            "\1\40\1\13\10\uffff\12\40\1\70\1\67\1\66\1\65\1\64\2\63\4"+
            "\62\2\61\2\60\2\57\1\56\1\uffff\1\72",
            "\1\40\1\13\10\uffff\12\40\1\106\1\105\1\104\1\103\1\102\2"+
            "\101\4\100\2\77\2\76\2\75\1\74",
            "\1\111\5\uffff\1\112\46\uffff\1\115\1\116\3\uffff\1\113\1"+
            "\uffff\7\114\1\117\1\120\1\121\1\122",
            "\1\123\5\uffff\1\124\46\uffff\1\127\1\130\3\uffff\1\125\1"+
            "\uffff\7\126\1\131\1\132\1\133\1\134",
            "\1\135\5\uffff\1\136\46\uffff\1\141\1\142\3\uffff\1\137\1"+
            "\uffff\7\140\1\143\1\144\1\145\1\146",
            "\1\147\5\uffff\1\150\46\uffff\1\153\1\154\3\uffff\1\151\1"+
            "\uffff\7\152\1\155\1\156\1\157\1\160",
            "\1\161\5\uffff\1\162\46\uffff\1\165\1\166\3\uffff\1\163\1"+
            "\uffff\7\164\1\167\1\170\1\171\1\172",
            "\1\173\5\uffff\1\174\46\uffff\1\177\1\u0080\3\uffff\1\175"+
            "\1\uffff\7\176\1\u0081\1\u0082\1\u0083\1\u0084",
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
            return "238:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_19 = input.LA(1);

                         
                        int index45_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_20 = input.LA(1);

                         
                        int index45_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_21 = input.LA(1);

                         
                        int index45_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_22 = input.LA(1);

                         
                        int index45_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_22);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_23 = input.LA(1);

                         
                        int index45_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_24 = input.LA(1);

                         
                        int index45_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_25 = input.LA(1);

                         
                        int index45_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_26 = input.LA(1);

                         
                        int index45_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA45_27 = input.LA(1);

                         
                        int index45_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA45_28 = input.LA(1);

                         
                        int index45_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA45_29 = input.LA(1);

                         
                        int index45_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_29);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA45_30 = input.LA(1);

                         
                        int index45_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA45_31 = input.LA(1);

                         
                        int index45_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA45_33 = input.LA(1);

                         
                        int index45_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_33);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA45_34 = input.LA(1);

                         
                        int index45_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_34);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA45_36 = input.LA(1);

                         
                        int index45_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_36);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA45_37 = input.LA(1);

                         
                        int index45_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_37);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA45_38 = input.LA(1);

                         
                        int index45_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_38);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA45_39 = input.LA(1);

                         
                        int index45_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_39);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA45_40 = input.LA(1);

                         
                        int index45_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_40);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA45_41 = input.LA(1);

                         
                        int index45_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_41);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA45_42 = input.LA(1);

                         
                        int index45_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_42);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA45_43 = input.LA(1);

                         
                        int index45_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_43);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA45_44 = input.LA(1);

                         
                        int index45_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_44);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA45_45 = input.LA(1);

                         
                        int index45_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_45);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA45_46 = input.LA(1);

                         
                        int index45_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_46);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA45_47 = input.LA(1);

                         
                        int index45_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_47);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA45_48 = input.LA(1);

                         
                        int index45_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_48);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA45_49 = input.LA(1);

                         
                        int index45_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_49);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA45_50 = input.LA(1);

                         
                        int index45_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_50);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA45_51 = input.LA(1);

                         
                        int index45_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_51);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA45_52 = input.LA(1);

                         
                        int index45_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_52);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA45_53 = input.LA(1);

                         
                        int index45_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_53);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA45_54 = input.LA(1);

                         
                        int index45_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_54);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA45_55 = input.LA(1);

                         
                        int index45_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_55);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA45_56 = input.LA(1);

                         
                        int index45_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_56);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA45_58 = input.LA(1);

                         
                        int index45_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_58);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA45_60 = input.LA(1);

                         
                        int index45_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_60);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA45_61 = input.LA(1);

                         
                        int index45_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_61);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA45_62 = input.LA(1);

                         
                        int index45_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_62);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA45_63 = input.LA(1);

                         
                        int index45_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_63);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA45_64 = input.LA(1);

                         
                        int index45_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_64);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA45_65 = input.LA(1);

                         
                        int index45_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_65);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA45_66 = input.LA(1);

                         
                        int index45_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_66);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA45_67 = input.LA(1);

                         
                        int index45_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_67);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA45_68 = input.LA(1);

                         
                        int index45_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_68);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA45_69 = input.LA(1);

                         
                        int index45_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_69);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA45_70 = input.LA(1);

                         
                        int index45_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_70);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA45_73 = input.LA(1);

                         
                        int index45_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_73);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA45_74 = input.LA(1);

                         
                        int index45_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_74);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA45_75 = input.LA(1);

                         
                        int index45_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_75);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA45_76 = input.LA(1);

                         
                        int index45_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_76);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA45_77 = input.LA(1);

                         
                        int index45_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_77);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA45_78 = input.LA(1);

                         
                        int index45_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_78);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA45_79 = input.LA(1);

                         
                        int index45_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_79);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA45_80 = input.LA(1);

                         
                        int index45_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_80);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA45_81 = input.LA(1);

                         
                        int index45_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_81);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA45_82 = input.LA(1);

                         
                        int index45_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_82);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA45_83 = input.LA(1);

                         
                        int index45_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_83);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA45_84 = input.LA(1);

                         
                        int index45_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_84);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA45_85 = input.LA(1);

                         
                        int index45_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_85);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA45_86 = input.LA(1);

                         
                        int index45_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_86);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA45_87 = input.LA(1);

                         
                        int index45_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_87);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA45_88 = input.LA(1);

                         
                        int index45_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_88);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA45_89 = input.LA(1);

                         
                        int index45_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_89);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA45_90 = input.LA(1);

                         
                        int index45_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_90);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA45_91 = input.LA(1);

                         
                        int index45_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_91);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA45_92 = input.LA(1);

                         
                        int index45_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_92);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA45_93 = input.LA(1);

                         
                        int index45_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_93);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA45_94 = input.LA(1);

                         
                        int index45_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_94);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA45_95 = input.LA(1);

                         
                        int index45_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_95);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA45_96 = input.LA(1);

                         
                        int index45_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_96);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA45_97 = input.LA(1);

                         
                        int index45_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_97);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA45_98 = input.LA(1);

                         
                        int index45_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_98);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA45_99 = input.LA(1);

                         
                        int index45_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_99);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA45_100 = input.LA(1);

                         
                        int index45_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_100);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA45_101 = input.LA(1);

                         
                        int index45_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_101);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA45_102 = input.LA(1);

                         
                        int index45_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_102);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA45_103 = input.LA(1);

                         
                        int index45_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_103);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA45_104 = input.LA(1);

                         
                        int index45_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_104);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA45_105 = input.LA(1);

                         
                        int index45_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_105);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA45_106 = input.LA(1);

                         
                        int index45_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_106);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA45_107 = input.LA(1);

                         
                        int index45_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_107);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA45_108 = input.LA(1);

                         
                        int index45_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_108);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA45_109 = input.LA(1);

                         
                        int index45_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_109);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA45_110 = input.LA(1);

                         
                        int index45_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_110);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA45_111 = input.LA(1);

                         
                        int index45_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_111);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA45_112 = input.LA(1);

                         
                        int index45_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_112);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA45_113 = input.LA(1);

                         
                        int index45_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_113);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA45_114 = input.LA(1);

                         
                        int index45_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_114);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA45_115 = input.LA(1);

                         
                        int index45_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_115);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA45_116 = input.LA(1);

                         
                        int index45_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_116);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA45_117 = input.LA(1);

                         
                        int index45_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_117);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA45_118 = input.LA(1);

                         
                        int index45_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_118);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA45_119 = input.LA(1);

                         
                        int index45_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_119);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA45_120 = input.LA(1);

                         
                        int index45_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_120);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA45_121 = input.LA(1);

                         
                        int index45_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_121);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA45_122 = input.LA(1);

                         
                        int index45_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_122);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA45_123 = input.LA(1);

                         
                        int index45_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_123);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA45_124 = input.LA(1);

                         
                        int index45_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_124);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA45_125 = input.LA(1);

                         
                        int index45_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_125);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA45_126 = input.LA(1);

                         
                        int index45_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_126);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA45_127 = input.LA(1);

                         
                        int index45_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_127);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA45_128 = input.LA(1);

                         
                        int index45_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_128);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA45_129 = input.LA(1);

                         
                        int index45_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_129);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA45_130 = input.LA(1);

                         
                        int index45_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_130);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA45_131 = input.LA(1);

                         
                        int index45_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_131);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA45_132 = input.LA(1);

                         
                        int index45_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_GalaxyXNew()) ) {s = 32;}

                        else if ( (synpred86_GalaxyXNew()) ) {s = 11;}

                         
                        input.seek(index45_132);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\14\uffff";
    static final String DFA46_eofS =
        "\14\uffff";
    static final String DFA46_minS =
        "\1\17\13\uffff";
    static final String DFA46_maxS =
        "\1\115\13\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA46_specialS =
        "\14\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\2\5\uffff\1\2\6\uffff\1\1\37\uffff\2\2\3\uffff\1\2\1\uffff"+
            "\13\2",
            "",
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
            return "252:1: expression_statement : ( SEMI | expression SEMI );";
        }
    }
    static final String DFA47_eotS =
        "\26\uffff";
    static final String DFA47_eofS =
        "\26\uffff";
    static final String DFA47_minS =
        "\1\17\25\uffff";
    static final String DFA47_maxS =
        "\1\126\25\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\21\uffff";
    static final String DFA47_specialS =
        "\26\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\4\1\uffff\1\1\3\uffff\1\4\6\uffff\1\4\37\uffff\2\4\3\uffff"+
            "\1\4\1\uffff\14\4\2\1\6\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 259:4: ( statement )*";
        }
    }
    static final String DFA48_eotS =
        "\26\uffff";
    static final String DFA48_eofS =
        "\26\uffff";
    static final String DFA48_minS =
        "\1\17\25\uffff";
    static final String DFA48_maxS =
        "\1\126\25\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\21\uffff";
    static final String DFA48_specialS =
        "\26\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\4\1\uffff\1\1\3\uffff\1\4\6\uffff\1\4\37\uffff\2\4\3\uffff"+
            "\1\4\1\uffff\14\4\2\1\6\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 261:4: ( statement )*";
        }
    }
    static final String DFA50_eotS =
        "\24\uffff";
    static final String DFA50_eofS =
        "\24\uffff";
    static final String DFA50_minS =
        "\1\17\23\uffff";
    static final String DFA50_maxS =
        "\1\126\23\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA50_specialS =
        "\24\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\1\uffff\1\1\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "()* loopback of 263:4: ( statement )*";
        }
    }
    static final String DFA52_eotS =
        "\24\uffff";
    static final String DFA52_eofS =
        "\24\uffff";
    static final String DFA52_minS =
        "\1\17\23\uffff";
    static final String DFA52_maxS =
        "\1\126\23\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA52_specialS =
        "\24\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\1\uffff\1\1\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 271:4: ( statement )*";
        }
    }
    static final String DFA53_eotS =
        "\14\uffff";
    static final String DFA53_eofS =
        "\14\uffff";
    static final String DFA53_minS =
        "\1\17\13\uffff";
    static final String DFA53_maxS =
        "\1\115\13\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA53_specialS =
        "\14\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\5\uffff\1\1\6\uffff\1\13\37\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\13\1",
            "",
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
            return "278:15: ( assignment_expression )?";
        }
    }
    static final String DFA54_eotS =
        "\14\uffff";
    static final String DFA54_eofS =
        "\14\uffff";
    static final String DFA54_minS =
        "\1\17\13\uffff";
    static final String DFA54_maxS =
        "\1\115\13\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA54_specialS =
        "\14\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\1\5\uffff\1\1\6\uffff\1\13\37\uffff\2\1\3\uffff\1\1\1\uffff"+
            "\13\1",
            "",
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
            return "278:43: ( expression )?";
        }
    }
    static final String DFA55_eotS =
        "\14\uffff";
    static final String DFA55_eofS =
        "\14\uffff";
    static final String DFA55_minS =
        "\1\17\13\uffff";
    static final String DFA55_maxS =
        "\1\115\13\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA55_specialS =
        "\14\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1\5\uffff\1\1\1\13\45\uffff\2\1\3\uffff\1\1\1\uffff\13\1",
            "",
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
            return "278:60: ( expression )?";
        }
    }
    static final String DFA56_eotS =
        "\24\uffff";
    static final String DFA56_eofS =
        "\24\uffff";
    static final String DFA56_minS =
        "\1\17\23\uffff";
    static final String DFA56_maxS =
        "\1\126\23\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\2\1\1\21\uffff";
    static final String DFA56_specialS =
        "\24\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\2\1\uffff\1\1\3\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\14\2\2\uffff\6\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 279:4: ( statement )*";
        }
    }
    static final String DFA57_eotS =
        "\25\uffff";
    static final String DFA57_eofS =
        "\25\uffff";
    static final String DFA57_minS =
        "\1\17\1\25\21\uffff\1\0\1\uffff";
    static final String DFA57_maxS =
        "\1\126\1\25\21\uffff\1\0\1\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA57_specialS =
        "\23\uffff\1\0\1\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\5\uffff\1\2\6\uffff\1\2\37\uffff\2\2\3\uffff\1\2\1\uffff"+
            "\14\2\2\uffff\1\1\5\2",
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
            return "()* loopback of 287:4: ( statement )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_19 = input.LA(1);

                         
                        int index57_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_GalaxyXNew()) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index57_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\17\uffff";
    static final String DFA58_eofS =
        "\17\uffff";
    static final String DFA58_minS =
        "\1\124\2\uffff\1\17\13\uffff";
    static final String DFA58_maxS =
        "\1\126\2\uffff\1\115\13\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\11\uffff";
    static final String DFA58_specialS =
        "\17\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\1\2\1\3",
            "",
            "",
            "\1\5\5\uffff\1\5\6\uffff\1\4\37\uffff\2\5\3\uffff\1\5\1\uffff"+
            "\13\5",
            "",
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
            return "294:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );";
        }
    }
 

    public static final BitSet FOLLOW_namespace_decl_in_start127 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_decl141 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_namespace_decl143 = new BitSet(new long[]{0x00000018E1068000L});
    public static final BitSet FOLLOW_class_decl_in_namespace_decl149 = new BitSet(new long[]{0x00000018E1068000L});
    public static final BitSet FOLLOW_function_decl_in_namespace_decl153 = new BitSet(new long[]{0x00000018E1068000L});
    public static final BitSet FOLLOW_field_decl_in_namespace_decl157 = new BitSet(new long[]{0x00000018E1068000L});
    public static final BitSet FOLLOW_initializer_in_namespace_decl161 = new BitSet(new long[]{0x00000018E1068000L});
    public static final BitSet FOLLOW_END_in_namespace_decl167 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_class_decl205 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl208 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl210 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_EXTENDS_in_class_decl213 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl215 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_class_decl219 = new BitSet(new long[]{0x0000001861928000L});
    public static final BitSet FOLLOW_field_decl_in_class_decl225 = new BitSet(new long[]{0x0000001861928000L});
    public static final BitSet FOLLOW_function_decl_in_class_decl229 = new BitSet(new long[]{0x0000001861928000L});
    public static final BitSet FOLLOW_constructor_decl_in_class_decl233 = new BitSet(new long[]{0x0000001861928000L});
    public static final BitSet FOLLOW_destructor_decl_in_class_decl237 = new BitSet(new long[]{0x0000001861928000L});
    public static final BitSet FOLLOW_END_in_class_decl243 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl291 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_constructor_decl293 = new BitSet(new long[]{0x0000001860408000L});
    public static final BitSet FOLLOW_parameter_list_in_constructor_decl295 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_constructor_decl298 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_constructor_decl300 = new BitSet(new long[]{0x3000001870228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_local_var_decl_in_constructor_decl305 = new BitSet(new long[]{0x3000001870228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_statement_in_constructor_decl311 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_END_in_constructor_decl316 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl349 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_destructor_decl351 = new BitSet(new long[]{0x0000001860408000L});
    public static final BitSet FOLLOW_parameter_list_in_destructor_decl353 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_destructor_decl356 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_destructor_decl358 = new BitSet(new long[]{0x3000001870228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_local_var_decl_in_destructor_decl363 = new BitSet(new long[]{0x3000001870228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_statement_in_destructor_decl369 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_END_in_destructor_decl374 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_function_decl407 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl410 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_decl412 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_function_decl414 = new BitSet(new long[]{0x0000001860408000L});
    public static final BitSet FOLLOW_parameter_list_in_function_decl416 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_function_decl419 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RETURNS_in_function_decl421 = new BitSet(new long[]{0x0000001860008000L});
    public static final BitSet FOLLOW_type_in_function_decl423 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_function_decl425 = new BitSet(new long[]{0x3000001870228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_local_var_decl_in_function_decl430 = new BitSet(new long[]{0x3000001870228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_statement_in_function_decl436 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_END_in_function_decl441 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameter_list484 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list487 = new BitSet(new long[]{0x0000001860008000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list489 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_type_in_parameter520 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_local_var_decl548 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_array_in_local_var_decl550 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var_decl553 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ASSGN_in_local_var_decl556 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_local_var_decl558 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_local_var_decl562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_field_decl598 = new BitSet(new long[]{0x0000001860008000L});
    public static final BitSet FOLLOW_STATIC_in_field_decl601 = new BitSet(new long[]{0x0000001860008000L});
    public static final BitSet FOLLOW_CONST_in_field_decl604 = new BitSet(new long[]{0x0000001860008000L});
    public static final BitSet FOLLOW_type_in_field_decl607 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_array_in_field_decl609 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl612 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ASSGN_in_field_decl615 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_field_decl617 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_field_decl621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer666 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_initializer668 = new BitSet(new long[]{0x3000001870228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_local_var_decl_in_initializer673 = new BitSet(new long[]{0x3000001870228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_statement_in_initializer679 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_END_in_initializer684 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array713 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_array715 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACK_in_array717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type737 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_type739 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_assignment_expression792 = new BitSet(new long[]{0x00007FE008000000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression794 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_assignment_expression796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression890 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_LOR_in_logical_or_expression893 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression896 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression909 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_LAND_in_logical_and_expression912 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression915 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression929 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_OR_in_or_expression932 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression935 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression949 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_XOR_in_exclusive_or_expression952 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression955 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression970 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_AND_in_and_expression973 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_equality_expression_in_and_expression976 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression991 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_set_in_equality_expression994 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1001 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1015 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expression1018 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1029 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1043 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_set_in_shift_expression1046 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1053 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1068 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_set_in_additive_expression1071 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1080 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression1094 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression1097 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression1106 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression1121 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_MODULO_in_modulo_expression1124 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression1127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression1148 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_THIS_in_postfix_expression1172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1175 = new BitSet(new long[]{0x0000000000208000L,0x00000000000003FAL});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1192 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1194 = new BitSet(new long[]{0x0000000000208000L,0x00000000000003FAL});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1211 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LBRACK_in_postfix_expression1214 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_postfix_expression1216 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix_expression1218 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1232 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1234 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_list_in_postfix_expression1236 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1249 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1251 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1272 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list1275 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_expression_list1278 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary_expression1296 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_primary_expression1299 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_primary_expression1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_operator1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unary_operator1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_operator1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unary_operator1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unary_operator1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_unary_operator1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_statement1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_statement_in_statement1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_statement1481 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_assignment_statement1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement1502 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1517 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1519 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_if_statement1521 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1523 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1525 = new BitSet(new long[]{0x3000000010228000L,0x00000000007FFFFAL});
    public static final BitSet FOLLOW_statement_in_if_statement1530 = new BitSet(new long[]{0x3000000010228000L,0x00000000007FFFFAL});
    public static final BitSet FOLLOW_ELIF_in_if_statement1536 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1538 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_if_statement1540 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1542 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1544 = new BitSet(new long[]{0x3000000010228000L,0x00000000007FFFFAL});
    public static final BitSet FOLLOW_statement_in_if_statement1549 = new BitSet(new long[]{0x3000000010228000L,0x00000000007FFFFAL});
    public static final BitSet FOLLOW_ELSE_in_if_statement1557 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1559 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_statement_in_if_statement1565 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_END_in_if_statement1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IF_in_if_statement1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1619 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_while_statement1621 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_while_statement1623 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_while_statement1625 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_while_statement1627 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_statement_in_while_statement1632 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_END_in_while_statement1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement1666 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_for_statement1668 = new BitSet(new long[]{0x3000000010208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_assignment_expression_in_for_statement1670 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1673 = new BitSet(new long[]{0x3000000010208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_for_statement1675 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1678 = new BitSet(new long[]{0x3000000000608000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_for_statement1680 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_for_statement1683 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_for_statement1685 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_statement_in_for_statement1690 = new BitSet(new long[]{0x3000000010228000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_END_in_for_statement1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_FOR_in_for_statement1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1731 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_do_while_statement1733 = new BitSet(new long[]{0x3000000010208000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_statement_in_do_while_statement1738 = new BitSet(new long[]{0x3000000010208000L,0x00000000007E7FFAL});
    public static final BitSet FOLLOW_WHILE_in_do_while_statement1744 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_do_while_statement1746 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_do_while_statement1748 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_do_while_statement1750 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_do_while_statement1755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement1784 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement1791 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1798 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1805 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_in_jump_statement1807 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred13_GalaxyXNew305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred16_GalaxyXNew363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred20_GalaxyXNew430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred30_GalaxyXNew673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred69_GalaxyXNew1232 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred69_GalaxyXNew1234 = new BitSet(new long[]{0x3000000000208000L,0x0000000000003FFAL});
    public static final BitSet FOLLOW_expression_list_in_synpred69_GalaxyXNew1236 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred69_GalaxyXNew1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_synpred85_GalaxyXNew1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_synpred86_GalaxyXNew1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred102_GalaxyXNew1738 = new BitSet(new long[]{0x0000000000000002L});

}