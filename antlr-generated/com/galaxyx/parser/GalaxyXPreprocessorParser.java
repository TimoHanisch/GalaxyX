// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g 2013-03-17 17:33:57

	package com.galaxyx.parser;
	
	import com.galaxyx.Preprocessor; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class GalaxyXPreprocessorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ELIF", "WHILE", "FOR", "END", "DO", "BREAK", "CONTINUE", "RETURN", "FALSE", "TRUE", "NULL", "STRUCT", "FUNC", "CONSTRUCTOR", "DESTRUCTOR", "TYPEDEF", "NAMESPACE", "CLASS", "INTERFACE", "IMPLEMENTS", "EXTENDS", "NEW", "DELETE", "THIS", "SUPER", "NAMEOF", "INITIALIZER", "INLINE", "STATIC", "CONST", "PRIVATE", "PUBLIC", "NATIVE", "DEFINE", "UNDEF", "INCLUDE", "PREFIX", "SEMI", "COMMA", "DOT", "COLON", "RETURNS", "PLUS", "SUB", "DIV", "TIMES", "MODULO", "AND", "OR", "XOR", "BIT_NOT", "NOT", "LOR", "LAND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "SHIFTL", "SHIFTR", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "NAMESPACE_ACCESS", "LETTER", "IDENTIFIER", "EscapeSequence", "CHARACTER_LITERAL", "STRING_LITERAL", "DIGIT", "HEX_LITERAL", "INTEGER", "HexDigit", "FIXED_LITERAL", "OctalEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT", "NEGATION"
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
    public static final int NEGATION=100;

    // delegates
    // delegators


        public GalaxyXPreprocessorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXPreprocessorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[168+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GalaxyXPreprocessorParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g"; }


    	private Preprocessor p;
    	
    	@Override
        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            Token t = e.token;
            String msg = getErrorMessage(e, tokenNames);
    		p.reportError(msg,t);
        }


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parse"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:34:1: parse[Preprocessor p] : ( preprocessor | namespace_decl )* EOF ;
    public final GalaxyXPreprocessorParser.parse_return parse(Preprocessor p) throws RecognitionException {
        GalaxyXPreprocessorParser.parse_return retval = new GalaxyXPreprocessorParser.parse_return();
        retval.start = input.LT(1);
        int parse_StartIndex = input.index();
        Object root_0 = null;

        Token EOF3=null;
        GalaxyXPreprocessorParser.preprocessor_return preprocessor1 = null;

        GalaxyXPreprocessorParser.namespace_decl_return namespace_decl2 = null;


        Object EOF3_tree=null;


        	this.p = p;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:38:2: ( ( preprocessor | namespace_decl )* EOF )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:38:4: ( preprocessor | namespace_decl )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:38:4: ( preprocessor | namespace_decl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PREFIX) ) {
                    alt1=1;
                }
                else if ( (LA1_0==NAMESPACE) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:38:5: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_parse96);
            	    preprocessor1=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, preprocessor1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:38:20: namespace_decl
            	    {
            	    pushFollow(FOLLOW_namespace_decl_in_parse100);
            	    namespace_decl2=namespace_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_parse104); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF3_tree = (Object)adaptor.create(EOF3);
            adaptor.addChild(root_0, EOF3_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, parse_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parse"

    public static class namespace_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:41:1: namespace_decl : NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer | preprocessor )* END NAMESPACE ;
    public final GalaxyXPreprocessorParser.namespace_decl_return namespace_decl() throws RecognitionException {
        GalaxyXPreprocessorParser.namespace_decl_return retval = new GalaxyXPreprocessorParser.namespace_decl_return();
        retval.start = input.LT(1);
        int namespace_decl_StartIndex = input.index();
        Object root_0 = null;

        Token NAMESPACE4=null;
        Token IDENTIFIER5=null;
        Token COLON6=null;
        Token END12=null;
        Token NAMESPACE13=null;
        GalaxyXPreprocessorParser.class_decl_return class_decl7 = null;

        GalaxyXPreprocessorParser.function_decl_return function_decl8 = null;

        GalaxyXPreprocessorParser.field_decl_return field_decl9 = null;

        GalaxyXPreprocessorParser.initializer_return initializer10 = null;

        GalaxyXPreprocessorParser.preprocessor_return preprocessor11 = null;


        Object NAMESPACE4_tree=null;
        Object IDENTIFIER5_tree=null;
        Object COLON6_tree=null;
        Object END12_tree=null;
        Object NAMESPACE13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:42:2: ( NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer | preprocessor )* END NAMESPACE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:42:4: NAMESPACE IDENTIFIER COLON ( class_decl | function_decl | field_decl | initializer | preprocessor )* END NAMESPACE
            {
            root_0 = (Object)adaptor.nil();

            NAMESPACE4=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl115); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAMESPACE4_tree = (Object)adaptor.create(NAMESPACE4);
            adaptor.addChild(root_0, NAMESPACE4_tree);
            }
            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_decl117); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER5_tree = (Object)adaptor.create(IDENTIFIER5);
            adaptor.addChild(root_0, IDENTIFIER5_tree);
            }
            COLON6=(Token)match(input,COLON,FOLLOW_COLON_in_namespace_decl119); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON6_tree = (Object)adaptor.create(COLON6);
            adaptor.addChild(root_0, COLON6_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:4: ( class_decl | function_decl | field_decl | initializer | preprocessor )*
            loop2:
            do {
                int alt2=6;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:5: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace_decl125);
            	    class_decl7=class_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_decl7.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_namespace_decl129);
            	    function_decl8=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_decl8.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:34: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace_decl133);
            	    field_decl9=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_decl9.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:47: initializer
            	    {
            	    pushFollow(FOLLOW_initializer_in_namespace_decl137);
            	    initializer10=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer10.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:61: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_namespace_decl141);
            	    preprocessor11=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, preprocessor11.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            END12=(Token)match(input,END,FOLLOW_END_in_namespace_decl147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END12_tree = (Object)adaptor.create(END12);
            adaptor.addChild(root_0, END12_tree);
            }
            NAMESPACE13=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace_decl149); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAMESPACE13_tree = (Object)adaptor.create(NAMESPACE13);
            adaptor.addChild(root_0, NAMESPACE13_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, namespace_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namespace_decl"

    public static class class_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:47:1: class_decl : ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl | preprocessor )* END CLASS ;
    public final GalaxyXPreprocessorParser.class_decl_return class_decl() throws RecognitionException {
        GalaxyXPreprocessorParser.class_decl_return retval = new GalaxyXPreprocessorParser.class_decl_return();
        retval.start = input.LT(1);
        int class_decl_StartIndex = input.index();
        Object root_0 = null;

        Token CLASS15=null;
        Token IDENTIFIER16=null;
        Token EXTENDS17=null;
        Token IDENTIFIER18=null;
        Token COLON19=null;
        Token END25=null;
        Token CLASS26=null;
        GalaxyXPreprocessorParser.modifier_return modifier14 = null;

        GalaxyXPreprocessorParser.field_decl_return field_decl20 = null;

        GalaxyXPreprocessorParser.function_decl_return function_decl21 = null;

        GalaxyXPreprocessorParser.constructor_decl_return constructor_decl22 = null;

        GalaxyXPreprocessorParser.destructor_decl_return destructor_decl23 = null;

        GalaxyXPreprocessorParser.preprocessor_return preprocessor24 = null;


        Object CLASS15_tree=null;
        Object IDENTIFIER16_tree=null;
        Object EXTENDS17_tree=null;
        Object IDENTIFIER18_tree=null;
        Object COLON19_tree=null;
        Object END25_tree=null;
        Object CLASS26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:48:2: ( ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl | preprocessor )* END CLASS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:48:4: ( modifier )? CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? COLON ( field_decl | function_decl | constructor_decl | destructor_decl | preprocessor )* END CLASS
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:48:4: ( modifier )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=PRIVATE && LA3_0<=PUBLIC)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_class_decl161);
                    modifier14=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier14.getTree());

                    }
                    break;

            }

            CLASS15=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl164); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS15_tree = (Object)adaptor.create(CLASS15);
            adaptor.addChild(root_0, CLASS15_tree);
            }
            IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
            adaptor.addChild(root_0, IDENTIFIER16_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:48:31: ( EXTENDS IDENTIFIER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:48:32: EXTENDS IDENTIFIER
                    {
                    EXTENDS17=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_class_decl169); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS17_tree = (Object)adaptor.create(EXTENDS17);
                    adaptor.addChild(root_0, EXTENDS17_tree);
                    }
                    IDENTIFIER18=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER18_tree = (Object)adaptor.create(IDENTIFIER18);
                    adaptor.addChild(root_0, IDENTIFIER18_tree);
                    }

                    }
                    break;

            }

            COLON19=(Token)match(input,COLON,FOLLOW_COLON_in_class_decl175); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON19_tree = (Object)adaptor.create(COLON19);
            adaptor.addChild(root_0, COLON19_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:4: ( field_decl | function_decl | constructor_decl | destructor_decl | preprocessor )*
            loop5:
            do {
                int alt5=6;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:5: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl181);
            	    field_decl20=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_decl20.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:18: function_decl
            	    {
            	    pushFollow(FOLLOW_function_decl_in_class_decl185);
            	    function_decl21=function_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_decl21.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:34: constructor_decl
            	    {
            	    pushFollow(FOLLOW_constructor_decl_in_class_decl189);
            	    constructor_decl22=constructor_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, constructor_decl22.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:53: destructor_decl
            	    {
            	    pushFollow(FOLLOW_destructor_decl_in_class_decl193);
            	    destructor_decl23=destructor_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, destructor_decl23.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:71: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_class_decl197);
            	    preprocessor24=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, preprocessor24.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            END25=(Token)match(input,END,FOLLOW_END_in_class_decl203); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END25_tree = (Object)adaptor.create(END25);
            adaptor.addChild(root_0, END25_tree);
            }
            CLASS26=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl205); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS26_tree = (Object)adaptor.create(CLASS26);
            adaptor.addChild(root_0, CLASS26_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, class_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class constructor_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructor_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:53:1: constructor_decl : CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl | preprocessor )* ( statement | preprocessor )* END CONSTRUCTOR ;
    public final GalaxyXPreprocessorParser.constructor_decl_return constructor_decl() throws RecognitionException {
        GalaxyXPreprocessorParser.constructor_decl_return retval = new GalaxyXPreprocessorParser.constructor_decl_return();
        retval.start = input.LT(1);
        int constructor_decl_StartIndex = input.index();
        Object root_0 = null;

        Token CONSTRUCTOR27=null;
        Token LPAREN28=null;
        Token RPAREN30=null;
        Token COLON31=null;
        Token END36=null;
        Token CONSTRUCTOR37=null;
        GalaxyXPreprocessorParser.parameter_list_return parameter_list29 = null;

        GalaxyXPreprocessorParser.local_var_decl_return local_var_decl32 = null;

        GalaxyXPreprocessorParser.preprocessor_return preprocessor33 = null;

        GalaxyXPreprocessorParser.statement_return statement34 = null;

        GalaxyXPreprocessorParser.preprocessor_return preprocessor35 = null;


        Object CONSTRUCTOR27_tree=null;
        Object LPAREN28_tree=null;
        Object RPAREN30_tree=null;
        Object COLON31_tree=null;
        Object END36_tree=null;
        Object CONSTRUCTOR37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:54:2: ( CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl | preprocessor )* ( statement | preprocessor )* END CONSTRUCTOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:54:4: CONSTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl | preprocessor )* ( statement | preprocessor )* END CONSTRUCTOR
            {
            root_0 = (Object)adaptor.nil();

            CONSTRUCTOR27=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl218); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTRUCTOR27_tree = (Object)adaptor.create(CONSTRUCTOR27);
            adaptor.addChild(root_0, CONSTRUCTOR27_tree);
            }
            LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constructor_decl220); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN28_tree = (Object)adaptor.create(LPAREN28);
            adaptor.addChild(root_0, LPAREN28_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:54:23: ( parameter_list )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_constructor_decl222);
                    parameter_list29=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list29.getTree());

                    }
                    break;

            }

            RPAREN30=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constructor_decl225); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN30_tree = (Object)adaptor.create(RPAREN30);
            adaptor.addChild(root_0, RPAREN30_tree);
            }
            COLON31=(Token)match(input,COLON,FOLLOW_COLON_in_constructor_decl227); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON31_tree = (Object)adaptor.create(COLON31);
            adaptor.addChild(root_0, COLON31_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:55:4: ( local_var_decl | preprocessor )*
            loop7:
            do {
                int alt7=3;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:55:5: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_constructor_decl233);
            	    local_var_decl32=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local_var_decl32.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:55:22: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_constructor_decl237);
            	    preprocessor33=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, preprocessor33.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:56:4: ( statement | preprocessor )*
            loop8:
            do {
                int alt8=3;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:56:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor_decl245);
            	    statement34=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement34.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:56:17: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_constructor_decl249);
            	    preprocessor35=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, preprocessor35.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            END36=(Token)match(input,END,FOLLOW_END_in_constructor_decl255); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END36_tree = (Object)adaptor.create(END36);
            adaptor.addChild(root_0, END36_tree);
            }
            CONSTRUCTOR37=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constructor_decl257); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTRUCTOR37_tree = (Object)adaptor.create(CONSTRUCTOR37);
            adaptor.addChild(root_0, CONSTRUCTOR37_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, constructor_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constructor_decl"

    public static class destructor_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "destructor_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:60:1: destructor_decl : DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl | preprocessor )* ( statement | preprocessor )* END DESTRUCTOR ;
    public final GalaxyXPreprocessorParser.destructor_decl_return destructor_decl() throws RecognitionException {
        GalaxyXPreprocessorParser.destructor_decl_return retval = new GalaxyXPreprocessorParser.destructor_decl_return();
        retval.start = input.LT(1);
        int destructor_decl_StartIndex = input.index();
        Object root_0 = null;

        Token DESTRUCTOR38=null;
        Token LPAREN39=null;
        Token RPAREN41=null;
        Token COLON42=null;
        Token END47=null;
        Token DESTRUCTOR48=null;
        GalaxyXPreprocessorParser.parameter_list_return parameter_list40 = null;

        GalaxyXPreprocessorParser.local_var_decl_return local_var_decl43 = null;

        GalaxyXPreprocessorParser.preprocessor_return preprocessor44 = null;

        GalaxyXPreprocessorParser.statement_return statement45 = null;

        GalaxyXPreprocessorParser.preprocessor_return preprocessor46 = null;


        Object DESTRUCTOR38_tree=null;
        Object LPAREN39_tree=null;
        Object RPAREN41_tree=null;
        Object COLON42_tree=null;
        Object END47_tree=null;
        Object DESTRUCTOR48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:61:2: ( DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl | preprocessor )* ( statement | preprocessor )* END DESTRUCTOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:61:4: DESTRUCTOR LPAREN ( parameter_list )? RPAREN COLON ( local_var_decl | preprocessor )* ( statement | preprocessor )* END DESTRUCTOR
            {
            root_0 = (Object)adaptor.nil();

            DESTRUCTOR38=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DESTRUCTOR38_tree = (Object)adaptor.create(DESTRUCTOR38);
            adaptor.addChild(root_0, DESTRUCTOR38_tree);
            }
            LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_destructor_decl271); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN39_tree = (Object)adaptor.create(LPAREN39);
            adaptor.addChild(root_0, LPAREN39_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:61:22: ( parameter_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_destructor_decl273);
                    parameter_list40=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list40.getTree());

                    }
                    break;

            }

            RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_destructor_decl276); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN41_tree = (Object)adaptor.create(RPAREN41);
            adaptor.addChild(root_0, RPAREN41_tree);
            }
            COLON42=(Token)match(input,COLON,FOLLOW_COLON_in_destructor_decl278); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON42_tree = (Object)adaptor.create(COLON42);
            adaptor.addChild(root_0, COLON42_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:62:4: ( local_var_decl | preprocessor )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:62:5: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_destructor_decl284);
            	    local_var_decl43=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local_var_decl43.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:62:22: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_destructor_decl288);
            	    preprocessor44=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, preprocessor44.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:63:4: ( statement | preprocessor )*
            loop11:
            do {
                int alt11=3;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:63:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_destructor_decl296);
            	    statement45=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement45.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:63:17: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_destructor_decl300);
            	    preprocessor46=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, preprocessor46.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            END47=(Token)match(input,END,FOLLOW_END_in_destructor_decl306); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END47_tree = (Object)adaptor.create(END47);
            adaptor.addChild(root_0, END47_tree);
            }
            DESTRUCTOR48=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destructor_decl308); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DESTRUCTOR48_tree = (Object)adaptor.create(DESTRUCTOR48);
            adaptor.addChild(root_0, DESTRUCTOR48_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, destructor_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "destructor_decl"

    public static class function_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:67:1: function_decl : ( modifier )? ( STATIC )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl | preprocessor )* ( statement | preprocessor )* END FUNC ;
    public final GalaxyXPreprocessorParser.function_decl_return function_decl() throws RecognitionException {
        GalaxyXPreprocessorParser.function_decl_return retval = new GalaxyXPreprocessorParser.function_decl_return();
        retval.start = input.LT(1);
        int function_decl_StartIndex = input.index();
        Object root_0 = null;

        Token STATIC50=null;
        Token FUNC51=null;
        Token IDENTIFIER52=null;
        Token LPAREN53=null;
        Token RPAREN55=null;
        Token RETURNS56=null;
        Token COLON58=null;
        Token END63=null;
        Token FUNC64=null;
        GalaxyXPreprocessorParser.modifier_return modifier49 = null;

        GalaxyXPreprocessorParser.parameter_list_return parameter_list54 = null;

        GalaxyXPreprocessorParser.type_return type57 = null;

        GalaxyXPreprocessorParser.local_var_decl_return local_var_decl59 = null;

        GalaxyXPreprocessorParser.preprocessor_return preprocessor60 = null;

        GalaxyXPreprocessorParser.statement_return statement61 = null;

        GalaxyXPreprocessorParser.preprocessor_return preprocessor62 = null;


        Object STATIC50_tree=null;
        Object FUNC51_tree=null;
        Object IDENTIFIER52_tree=null;
        Object LPAREN53_tree=null;
        Object RPAREN55_tree=null;
        Object RETURNS56_tree=null;
        Object COLON58_tree=null;
        Object END63_tree=null;
        Object FUNC64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:68:2: ( ( modifier )? ( STATIC )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl | preprocessor )* ( statement | preprocessor )* END FUNC )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:68:4: ( modifier )? ( STATIC )? FUNC IDENTIFIER LPAREN ( parameter_list )? RPAREN RETURNS type COLON ( local_var_decl | preprocessor )* ( statement | preprocessor )* END FUNC
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:68:4: ( modifier )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=PRIVATE && LA12_0<=PUBLIC)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_function_decl320);
                    modifier49=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier49.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:68:14: ( STATIC )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==STATIC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: STATIC
                    {
                    STATIC50=(Token)match(input,STATIC,FOLLOW_STATIC_in_function_decl323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC50_tree = (Object)adaptor.create(STATIC50);
                    adaptor.addChild(root_0, STATIC50_tree);
                    }

                    }
                    break;

            }

            FUNC51=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl326); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNC51_tree = (Object)adaptor.create(FUNC51);
            adaptor.addChild(root_0, FUNC51_tree);
            }
            IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_decl328); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
            adaptor.addChild(root_0, IDENTIFIER52_tree);
            }
            LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_decl330); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN53_tree = (Object)adaptor.create(LPAREN53);
            adaptor.addChild(root_0, LPAREN53_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:68:45: ( parameter_list )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IDENTIFIER) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function_decl332);
                    parameter_list54=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_list54.getTree());

                    }
                    break;

            }

            RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_decl335); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN55_tree = (Object)adaptor.create(RPAREN55);
            adaptor.addChild(root_0, RPAREN55_tree);
            }
            RETURNS56=(Token)match(input,RETURNS,FOLLOW_RETURNS_in_function_decl337); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RETURNS56_tree = (Object)adaptor.create(RETURNS56);
            adaptor.addChild(root_0, RETURNS56_tree);
            }
            pushFollow(FOLLOW_type_in_function_decl339);
            type57=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type57.getTree());
            COLON58=(Token)match(input,COLON,FOLLOW_COLON_in_function_decl341); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON58_tree = (Object)adaptor.create(COLON58);
            adaptor.addChild(root_0, COLON58_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:69:4: ( local_var_decl | preprocessor )*
            loop15:
            do {
                int alt15=3;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:69:5: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_function_decl347);
            	    local_var_decl59=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local_var_decl59.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:69:22: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_function_decl351);
            	    preprocessor60=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, preprocessor60.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:70:4: ( statement | preprocessor )*
            loop16:
            do {
                int alt16=3;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:70:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function_decl359);
            	    statement61=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement61.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:70:17: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_function_decl363);
            	    preprocessor62=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, preprocessor62.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            END63=(Token)match(input,END,FOLLOW_END_in_function_decl369); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END63_tree = (Object)adaptor.create(END63);
            adaptor.addChild(root_0, END63_tree);
            }
            FUNC64=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_decl371); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNC64_tree = (Object)adaptor.create(FUNC64);
            adaptor.addChild(root_0, FUNC64_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, function_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "function_decl"

    public static class parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:74:1: parameter_list : parameter ( COMMA parameter )* ;
    public final GalaxyXPreprocessorParser.parameter_list_return parameter_list() throws RecognitionException {
        GalaxyXPreprocessorParser.parameter_list_return retval = new GalaxyXPreprocessorParser.parameter_list_return();
        retval.start = input.LT(1);
        int parameter_list_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA66=null;
        GalaxyXPreprocessorParser.parameter_return parameter65 = null;

        GalaxyXPreprocessorParser.parameter_return parameter67 = null;


        Object COMMA66_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:75:2: ( parameter ( COMMA parameter )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:75:4: parameter ( COMMA parameter )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parameter_in_parameter_list383);
            parameter65=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter65.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:75:14: ( COMMA parameter )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:75:15: COMMA parameter
            	    {
            	    COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_list386); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA66_tree = (Object)adaptor.create(COMMA66);
            	    adaptor.addChild(root_0, COMMA66_tree);
            	    }
            	    pushFollow(FOLLOW_parameter_in_parameter_list388);
            	    parameter67=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter67.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parameter_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parameter_list"

    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:78:1: parameter : type IDENTIFIER ;
    public final GalaxyXPreprocessorParser.parameter_return parameter() throws RecognitionException {
        GalaxyXPreprocessorParser.parameter_return retval = new GalaxyXPreprocessorParser.parameter_return();
        retval.start = input.LT(1);
        int parameter_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER69=null;
        GalaxyXPreprocessorParser.type_return type68 = null;


        Object IDENTIFIER69_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:79:2: ( type IDENTIFIER )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:79:4: type IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_parameter402);
            type68=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type68.getTree());
            IDENTIFIER69=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter404); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER69_tree = (Object)adaptor.create(IDENTIFIER69);
            adaptor.addChild(root_0, IDENTIFIER69_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class local_var_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "local_var_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:82:1: local_var_decl : ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ;
    public final GalaxyXPreprocessorParser.local_var_decl_return local_var_decl() throws RecognitionException {
        GalaxyXPreprocessorParser.local_var_decl_return retval = new GalaxyXPreprocessorParser.local_var_decl_return();
        retval.start = input.LT(1);
        int local_var_decl_StartIndex = input.index();
        Object root_0 = null;

        Token CONST70=null;
        Token IDENTIFIER73=null;
        Token ASSGN74=null;
        Token SEMI76=null;
        GalaxyXPreprocessorParser.type_return type71 = null;

        GalaxyXPreprocessorParser.array_return array72 = null;

        GalaxyXPreprocessorParser.expression_return expression75 = null;


        Object CONST70_tree=null;
        Object IDENTIFIER73_tree=null;
        Object ASSGN74_tree=null;
        Object SEMI76_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:83:2: ( ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:83:4: ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:83:4: ( CONST )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==CONST) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: CONST
                    {
                    CONST70=(Token)match(input,CONST,FOLLOW_CONST_in_local_var_decl416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONST70_tree = (Object)adaptor.create(CONST70);
                    adaptor.addChild(root_0, CONST70_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_local_var_decl419);
            type71=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type71.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:83:16: ( array )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LBRACK) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_local_var_decl421);
            	    array72=array();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, array72.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            IDENTIFIER73=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var_decl424); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER73_tree = (Object)adaptor.create(IDENTIFIER73);
            adaptor.addChild(root_0, IDENTIFIER73_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:83:34: ( ASSGN expression )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ASSGN) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:83:35: ASSGN expression
                    {
                    ASSGN74=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_local_var_decl427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSGN74_tree = (Object)adaptor.create(ASSGN74);
                    adaptor.addChild(root_0, ASSGN74_tree);
                    }
                    pushFollow(FOLLOW_expression_in_local_var_decl429);
                    expression75=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression75.getTree());

                    }
                    break;

            }

            SEMI76=(Token)match(input,SEMI,FOLLOW_SEMI_in_local_var_decl433); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI76_tree = (Object)adaptor.create(SEMI76);
            adaptor.addChild(root_0, SEMI76_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, local_var_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "local_var_decl"

    public static class field_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:86:1: field_decl : ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI ;
    public final GalaxyXPreprocessorParser.field_decl_return field_decl() throws RecognitionException {
        GalaxyXPreprocessorParser.field_decl_return retval = new GalaxyXPreprocessorParser.field_decl_return();
        retval.start = input.LT(1);
        int field_decl_StartIndex = input.index();
        Object root_0 = null;

        Token STATIC78=null;
        Token CONST79=null;
        Token IDENTIFIER82=null;
        Token ASSGN83=null;
        Token SEMI85=null;
        GalaxyXPreprocessorParser.modifier_return modifier77 = null;

        GalaxyXPreprocessorParser.type_return type80 = null;

        GalaxyXPreprocessorParser.array_return array81 = null;

        GalaxyXPreprocessorParser.expression_return expression84 = null;


        Object STATIC78_tree=null;
        Object CONST79_tree=null;
        Object IDENTIFIER82_tree=null;
        Object ASSGN83_tree=null;
        Object SEMI85_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:87:2: ( ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:87:4: ( modifier )? ( STATIC )? ( CONST )? type ( array )* IDENTIFIER ( ASSGN expression )? SEMI
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:87:4: ( modifier )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=PRIVATE && LA21_0<=PUBLIC)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_field_decl445);
                    modifier77=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier77.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:87:14: ( STATIC )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==STATIC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: STATIC
                    {
                    STATIC78=(Token)match(input,STATIC,FOLLOW_STATIC_in_field_decl448); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC78_tree = (Object)adaptor.create(STATIC78);
                    adaptor.addChild(root_0, STATIC78_tree);
                    }

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:87:22: ( CONST )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==CONST) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: CONST
                    {
                    CONST79=(Token)match(input,CONST,FOLLOW_CONST_in_field_decl451); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONST79_tree = (Object)adaptor.create(CONST79);
                    adaptor.addChild(root_0, CONST79_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_field_decl454);
            type80=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type80.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:87:34: ( array )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LBRACK) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: array
            	    {
            	    pushFollow(FOLLOW_array_in_field_decl456);
            	    array81=array();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, array81.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            IDENTIFIER82=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl459); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER82_tree = (Object)adaptor.create(IDENTIFIER82);
            adaptor.addChild(root_0, IDENTIFIER82_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:87:52: ( ASSGN expression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ASSGN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:87:53: ASSGN expression
                    {
                    ASSGN83=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_field_decl462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSGN83_tree = (Object)adaptor.create(ASSGN83);
                    adaptor.addChild(root_0, ASSGN83_tree);
                    }
                    pushFollow(FOLLOW_expression_in_field_decl464);
                    expression84=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression84.getTree());

                    }
                    break;

            }

            SEMI85=(Token)match(input,SEMI,FOLLOW_SEMI_in_field_decl468); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI85_tree = (Object)adaptor.create(SEMI85);
            adaptor.addChild(root_0, SEMI85_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, field_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field_decl"

    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initializer"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:90:1: initializer : INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER ;
    public final GalaxyXPreprocessorParser.initializer_return initializer() throws RecognitionException {
        GalaxyXPreprocessorParser.initializer_return retval = new GalaxyXPreprocessorParser.initializer_return();
        retval.start = input.LT(1);
        int initializer_StartIndex = input.index();
        Object root_0 = null;

        Token INITIALIZER86=null;
        Token COLON87=null;
        Token END90=null;
        Token INITIALIZER91=null;
        GalaxyXPreprocessorParser.local_var_decl_return local_var_decl88 = null;

        GalaxyXPreprocessorParser.statement_return statement89 = null;


        Object INITIALIZER86_tree=null;
        Object COLON87_tree=null;
        Object END90_tree=null;
        Object INITIALIZER91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:91:2: ( INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:91:4: INITIALIZER COLON ( local_var_decl )* ( statement )* END INITIALIZER
            {
            root_0 = (Object)adaptor.nil();

            INITIALIZER86=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer480); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INITIALIZER86_tree = (Object)adaptor.create(INITIALIZER86);
            adaptor.addChild(root_0, INITIALIZER86_tree);
            }
            COLON87=(Token)match(input,COLON,FOLLOW_COLON_in_initializer482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON87_tree = (Object)adaptor.create(COLON87);
            adaptor.addChild(root_0, COLON87_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:92:4: ( local_var_decl )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_initializer487);
            	    local_var_decl88=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local_var_decl88.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:93:4: ( statement )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_initializer493);
            	    statement89=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement89.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            END90=(Token)match(input,END,FOLLOW_END_in_initializer498); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END90_tree = (Object)adaptor.create(END90);
            adaptor.addChild(root_0, END90_tree);
            }
            INITIALIZER91=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer500); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INITIALIZER91_tree = (Object)adaptor.create(INITIALIZER91);
            adaptor.addChild(root_0, INITIALIZER91_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, initializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "initializer"

    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:97:1: array : LBRACK RBRACK ;
    public final GalaxyXPreprocessorParser.array_return array() throws RecognitionException {
        GalaxyXPreprocessorParser.array_return retval = new GalaxyXPreprocessorParser.array_return();
        retval.start = input.LT(1);
        int array_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACK92=null;
        Token RBRACK93=null;

        Object LBRACK92_tree=null;
        Object RBRACK93_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:98:2: ( LBRACK RBRACK )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:98:4: LBRACK RBRACK
            {
            root_0 = (Object)adaptor.nil();

            LBRACK92=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array511); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK92_tree = (Object)adaptor.create(LBRACK92);
            adaptor.addChild(root_0, LBRACK92_tree);
            }
            RBRACK93=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array513); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACK93_tree = (Object)adaptor.create(RBRACK93);
            adaptor.addChild(root_0, RBRACK93_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, array_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:101:1: type : ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER | IDENTIFIER );
    public final GalaxyXPreprocessorParser.type_return type() throws RecognitionException {
        GalaxyXPreprocessorParser.type_return retval = new GalaxyXPreprocessorParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER94=null;
        Token NAMESPACE_ACCESS95=null;
        Token IDENTIFIER96=null;
        Token IDENTIFIER97=null;

        Object IDENTIFIER94_tree=null;
        Object NAMESPACE_ACCESS95_tree=null;
        Object IDENTIFIER96_tree=null;
        Object IDENTIFIER97_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:102:2: ( IDENTIFIER NAMESPACE_ACCESS IDENTIFIER | IDENTIFIER )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:102:4: IDENTIFIER NAMESPACE_ACCESS IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER94=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type525); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER94_tree = (Object)adaptor.create(IDENTIFIER94);
                    adaptor.addChild(root_0, IDENTIFIER94_tree);
                    }
                    NAMESPACE_ACCESS95=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_type527); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAMESPACE_ACCESS95_tree = (Object)adaptor.create(NAMESPACE_ACCESS95);
                    adaptor.addChild(root_0, NAMESPACE_ACCESS95_tree);
                    }
                    IDENTIFIER96=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER96_tree = (Object)adaptor.create(IDENTIFIER96);
                    adaptor.addChild(root_0, IDENTIFIER96_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:103:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER97=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER97_tree = (Object)adaptor.create(IDENTIFIER97);
                    adaptor.addChild(root_0, IDENTIFIER97_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:106:1: modifier : ( PUBLIC | PRIVATE );
    public final GalaxyXPreprocessorParser.modifier_return modifier() throws RecognitionException {
        GalaxyXPreprocessorParser.modifier_return retval = new GalaxyXPreprocessorParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        Object root_0 = null;

        Token set98=null;

        Object set98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:107:2: ( PUBLIC | PRIVATE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set98=(Token)input.LT(1);
            if ( (input.LA(1)>=PRIVATE && input.LA(1)<=PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set98));
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, modifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:111:1: assignment_expression : expression assignment_operator expression ;
    public final GalaxyXPreprocessorParser.assignment_expression_return assignment_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.assignment_expression_return retval = new GalaxyXPreprocessorParser.assignment_expression_return();
        retval.start = input.LT(1);
        int assignment_expression_StartIndex = input.index();
        Object root_0 = null;

        GalaxyXPreprocessorParser.expression_return expression99 = null;

        GalaxyXPreprocessorParser.assignment_operator_return assignment_operator100 = null;

        GalaxyXPreprocessorParser.expression_return expression101 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:112:2: ( expression assignment_operator expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:112:4: expression assignment_operator expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_assignment_expression562);
            expression99=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression99.getTree());
            pushFollow(FOLLOW_assignment_operator_in_assignment_expression564);
            assignment_operator100=assignment_operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_operator100.getTree());
            pushFollow(FOLLOW_expression_in_assignment_expression566);
            expression101=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression101.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, assignment_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment_expression"

    public static class assignment_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_operator"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:115:1: assignment_operator : ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR );
    public final GalaxyXPreprocessorParser.assignment_operator_return assignment_operator() throws RecognitionException {
        GalaxyXPreprocessorParser.assignment_operator_return retval = new GalaxyXPreprocessorParser.assignment_operator_return();
        retval.start = input.LT(1);
        int assignment_operator_StartIndex = input.index();
        Object root_0 = null;

        Token set102=null;

        Object set102_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:116:2: ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set102=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSGN && input.LA(1)<=ASSGNBITXOR) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set102));
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, assignment_operator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment_operator"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:129:1: expression : logical_or_expression ;
    public final GalaxyXPreprocessorParser.expression_return expression() throws RecognitionException {
        GalaxyXPreprocessorParser.expression_return retval = new GalaxyXPreprocessorParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        GalaxyXPreprocessorParser.logical_or_expression_return logical_or_expression103 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:130:2: ( logical_or_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:130:4: logical_or_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logical_or_expression_in_expression638);
            logical_or_expression103=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression103.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class logical_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:133:1: logical_or_expression : logical_and_expression ( LOR logical_and_expression )* ;
    public final GalaxyXPreprocessorParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.logical_or_expression_return retval = new GalaxyXPreprocessorParser.logical_or_expression_return();
        retval.start = input.LT(1);
        int logical_or_expression_StartIndex = input.index();
        Object root_0 = null;

        Token LOR105=null;
        GalaxyXPreprocessorParser.logical_and_expression_return logical_and_expression104 = null;

        GalaxyXPreprocessorParser.logical_and_expression_return logical_and_expression106 = null;


        Object LOR105_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:134:2: ( logical_and_expression ( LOR logical_and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:134:4: logical_and_expression ( LOR logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression650);
            logical_and_expression104=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression104.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:134:27: ( LOR logical_and_expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==LOR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:134:28: LOR logical_and_expression
            	    {
            	    LOR105=(Token)match(input,LOR,FOLLOW_LOR_in_logical_or_expression653); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOR105_tree = (Object)adaptor.create(LOR105);
            	    root_0 = (Object)adaptor.becomeRoot(LOR105_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression656);
            	    logical_and_expression106=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression106.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, logical_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"

    public static class logical_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_and_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:137:1: logical_and_expression : or_expression ( LAND or_expression )* ;
    public final GalaxyXPreprocessorParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.logical_and_expression_return retval = new GalaxyXPreprocessorParser.logical_and_expression_return();
        retval.start = input.LT(1);
        int logical_and_expression_StartIndex = input.index();
        Object root_0 = null;

        Token LAND108=null;
        GalaxyXPreprocessorParser.or_expression_return or_expression107 = null;

        GalaxyXPreprocessorParser.or_expression_return or_expression109 = null;


        Object LAND108_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:138:2: ( or_expression ( LAND or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:138:4: or_expression ( LAND or_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expression_in_logical_and_expression669);
            or_expression107=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression107.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:138:18: ( LAND or_expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==LAND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:138:19: LAND or_expression
            	    {
            	    LAND108=(Token)match(input,LAND,FOLLOW_LAND_in_logical_and_expression672); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LAND108_tree = (Object)adaptor.create(LAND108);
            	    root_0 = (Object)adaptor.becomeRoot(LAND108_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_or_expression_in_logical_and_expression675);
            	    or_expression109=or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expression109.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, logical_and_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"

    public static class or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:141:1: or_expression : exclusive_or_expression ( OR exclusive_or_expression )* ;
    public final GalaxyXPreprocessorParser.or_expression_return or_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.or_expression_return retval = new GalaxyXPreprocessorParser.or_expression_return();
        retval.start = input.LT(1);
        int or_expression_StartIndex = input.index();
        Object root_0 = null;

        Token OR111=null;
        GalaxyXPreprocessorParser.exclusive_or_expression_return exclusive_or_expression110 = null;

        GalaxyXPreprocessorParser.exclusive_or_expression_return exclusive_or_expression112 = null;


        Object OR111_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:142:2: ( exclusive_or_expression ( OR exclusive_or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:142:4: exclusive_or_expression ( OR exclusive_or_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exclusive_or_expression_in_or_expression689);
            exclusive_or_expression110=exclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression110.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:142:28: ( OR exclusive_or_expression )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:142:29: OR exclusive_or_expression
            	    {
            	    OR111=(Token)match(input,OR,FOLLOW_OR_in_or_expression692); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR111_tree = (Object)adaptor.create(OR111);
            	    root_0 = (Object)adaptor.becomeRoot(OR111_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_exclusive_or_expression_in_or_expression695);
            	    exclusive_or_expression112=exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression112.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "or_expression"

    public static class exclusive_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exclusive_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:145:1: exclusive_or_expression : and_expression ( XOR and_expression )* ;
    public final GalaxyXPreprocessorParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.exclusive_or_expression_return retval = new GalaxyXPreprocessorParser.exclusive_or_expression_return();
        retval.start = input.LT(1);
        int exclusive_or_expression_StartIndex = input.index();
        Object root_0 = null;

        Token XOR114=null;
        GalaxyXPreprocessorParser.and_expression_return and_expression113 = null;

        GalaxyXPreprocessorParser.and_expression_return and_expression115 = null;


        Object XOR114_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:146:2: ( and_expression ( XOR and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:146:4: and_expression ( XOR and_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression709);
            and_expression113=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression113.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:146:19: ( XOR and_expression )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:146:20: XOR and_expression
            	    {
            	    XOR114=(Token)match(input,XOR,FOLLOW_XOR_in_exclusive_or_expression712); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    XOR114_tree = (Object)adaptor.create(XOR114);
            	    root_0 = (Object)adaptor.becomeRoot(XOR114_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression715);
            	    and_expression115=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression115.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, exclusive_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exclusive_or_expression"

    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:149:1: and_expression : equality_expression ( AND equality_expression )* ;
    public final GalaxyXPreprocessorParser.and_expression_return and_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.and_expression_return retval = new GalaxyXPreprocessorParser.and_expression_return();
        retval.start = input.LT(1);
        int and_expression_StartIndex = input.index();
        Object root_0 = null;

        Token AND117=null;
        GalaxyXPreprocessorParser.equality_expression_return equality_expression116 = null;

        GalaxyXPreprocessorParser.equality_expression_return equality_expression118 = null;


        Object AND117_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:150:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:150:5: equality_expression ( AND equality_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_and_expression730);
            equality_expression116=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression116.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:150:25: ( AND equality_expression )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:150:26: AND equality_expression
            	    {
            	    AND117=(Token)match(input,AND,FOLLOW_AND_in_and_expression733); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND117_tree = (Object)adaptor.create(AND117);
            	    root_0 = (Object)adaptor.becomeRoot(AND117_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_and_expression736);
            	    equality_expression118=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression118.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, and_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "and_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:153:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final GalaxyXPreprocessorParser.equality_expression_return equality_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.equality_expression_return retval = new GalaxyXPreprocessorParser.equality_expression_return();
        retval.start = input.LT(1);
        int equality_expression_StartIndex = input.index();
        Object root_0 = null;

        Token set120=null;
        GalaxyXPreprocessorParser.relational_expression_return relational_expression119 = null;

        GalaxyXPreprocessorParser.relational_expression_return relational_expression121 = null;


        Object set120_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:154:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:154:5: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression751);
            relational_expression119=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression119.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:154:27: ( ( EQ | NEQ ) relational_expression )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:154:28: ( EQ | NEQ ) relational_expression
            	    {
            	    set120=(Token)input.LT(1);
            	    set120=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set120), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression761);
            	    relational_expression121=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression121.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, equality_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:157:1: relational_expression : shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* ;
    public final GalaxyXPreprocessorParser.relational_expression_return relational_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.relational_expression_return retval = new GalaxyXPreprocessorParser.relational_expression_return();
        retval.start = input.LT(1);
        int relational_expression_StartIndex = input.index();
        Object root_0 = null;

        Token set123=null;
        GalaxyXPreprocessorParser.shift_expression_return shift_expression122 = null;

        GalaxyXPreprocessorParser.shift_expression_return shift_expression124 = null;


        Object set123_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:158:2: ( shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:158:5: shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shift_expression_in_relational_expression775);
            shift_expression122=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression122.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:158:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:158:23: ( LT | GT | LTEQ | GTEQ ) shift_expression
            	    {
            	    set123=(Token)input.LT(1);
            	    set123=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set123), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression789);
            	    shift_expression124=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression124.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, relational_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relational_expression"

    public static class shift_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shift_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:161:1: shift_expression : additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* ;
    public final GalaxyXPreprocessorParser.shift_expression_return shift_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.shift_expression_return retval = new GalaxyXPreprocessorParser.shift_expression_return();
        retval.start = input.LT(1);
        int shift_expression_StartIndex = input.index();
        Object root_0 = null;

        Token set126=null;
        GalaxyXPreprocessorParser.additive_expression_return additive_expression125 = null;

        GalaxyXPreprocessorParser.additive_expression_return additive_expression127 = null;


        Object set126_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:162:2: ( additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:162:5: additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_shift_expression803);
            additive_expression125=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression125.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:162:25: ( ( SHIFTL | SHIFTR ) additive_expression )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:162:26: ( SHIFTL | SHIFTR ) additive_expression
            	    {
            	    set126=(Token)input.LT(1);
            	    set126=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFTL && input.LA(1)<=SHIFTR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set126), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression813);
            	    additive_expression127=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression127.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, shift_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shift_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:165:1: additive_expression : multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* ;
    public final GalaxyXPreprocessorParser.additive_expression_return additive_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.additive_expression_return retval = new GalaxyXPreprocessorParser.additive_expression_return();
        retval.start = input.LT(1);
        int additive_expression_StartIndex = input.index();
        Object root_0 = null;

        Token set129=null;
        GalaxyXPreprocessorParser.multiplicative_expression_return multiplicative_expression128 = null;

        GalaxyXPreprocessorParser.multiplicative_expression_return multiplicative_expression130 = null;


        Object set129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:166:2: ( multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:166:5: multiplicative_expression ( ( PLUS | SUB ) multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression828);
            multiplicative_expression128=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression128.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:166:31: ( ( PLUS | SUB ) multiplicative_expression )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:166:32: ( PLUS | SUB ) multiplicative_expression
            	    {
            	    set129=(Token)input.LT(1);
            	    set129=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set129), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression840);
            	    multiplicative_expression130=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression130.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, additive_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:169:1: multiplicative_expression : modulo_expression ( ( TIMES | DIV ) modulo_expression )* ;
    public final GalaxyXPreprocessorParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.multiplicative_expression_return retval = new GalaxyXPreprocessorParser.multiplicative_expression_return();
        retval.start = input.LT(1);
        int multiplicative_expression_StartIndex = input.index();
        Object root_0 = null;

        Token set132=null;
        GalaxyXPreprocessorParser.modulo_expression_return modulo_expression131 = null;

        GalaxyXPreprocessorParser.modulo_expression_return modulo_expression133 = null;


        Object set132_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:170:2: ( modulo_expression ( ( TIMES | DIV ) modulo_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:170:5: modulo_expression ( ( TIMES | DIV ) modulo_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression854);
            modulo_expression131=modulo_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression131.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:170:23: ( ( TIMES | DIV ) modulo_expression )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:170:24: ( TIMES | DIV ) modulo_expression
            	    {
            	    set132=(Token)input.LT(1);
            	    set132=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DIV && input.LA(1)<=TIMES) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set132), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression866);
            	    modulo_expression133=modulo_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression133.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, multiplicative_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class modulo_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modulo_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:173:1: modulo_expression : unary_expression ( MODULO unary_expression )* ;
    public final GalaxyXPreprocessorParser.modulo_expression_return modulo_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.modulo_expression_return retval = new GalaxyXPreprocessorParser.modulo_expression_return();
        retval.start = input.LT(1);
        int modulo_expression_StartIndex = input.index();
        Object root_0 = null;

        Token MODULO135=null;
        GalaxyXPreprocessorParser.unary_expression_return unary_expression134 = null;

        GalaxyXPreprocessorParser.unary_expression_return unary_expression136 = null;


        Object MODULO135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:174:2: ( unary_expression ( MODULO unary_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:174:5: unary_expression ( MODULO unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_modulo_expression881);
            unary_expression134=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression134.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:174:22: ( MODULO unary_expression )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:174:23: MODULO unary_expression
            	    {
            	    MODULO135=(Token)match(input,MODULO,FOLLOW_MODULO_in_modulo_expression884); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MODULO135_tree = (Object)adaptor.create(MODULO135);
            	    root_0 = (Object)adaptor.becomeRoot(MODULO135_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_modulo_expression887);
            	    unary_expression136=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression136.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, modulo_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modulo_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:177:1: unary_expression : ( postfix_expression | unary_operator unary_expression );
    public final GalaxyXPreprocessorParser.unary_expression_return unary_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.unary_expression_return retval = new GalaxyXPreprocessorParser.unary_expression_return();
        retval.start = input.LT(1);
        int unary_expression_StartIndex = input.index();
        Object root_0 = null;

        GalaxyXPreprocessorParser.postfix_expression_return postfix_expression137 = null;

        GalaxyXPreprocessorParser.unary_operator_return unary_operator138 = null;

        GalaxyXPreprocessorParser.unary_expression_return unary_expression139 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:178:2: ( postfix_expression | unary_operator unary_expression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=FALSE && LA40_0<=NULL)||LA40_0==THIS||LA40_0==LPAREN||LA40_0==IDENTIFIER||(LA40_0>=CHARACTER_LITERAL && LA40_0<=STRING_LITERAL)||LA40_0==INTEGER||LA40_0==FIXED_LITERAL) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=NEW && LA40_0<=DELETE)||(LA40_0>=PLUS && LA40_0<=SUB)||(LA40_0>=BIT_NOT && LA40_0<=NOT)) ) {
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:178:5: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression902);
                    postfix_expression137=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression137.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:179:5: unary_operator unary_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unary_operator_in_unary_expression908);
                    unary_operator138=unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(unary_operator138.getTree(), root_0);
                    pushFollow(FOLLOW_unary_expression_in_unary_expression911);
                    unary_expression139=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression139.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, unary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfix_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:182:1: postfix_expression : ( primary_expression | ( IDENTIFIER | THIS ) DOT postfix_expression | IDENTIFIER NAMESPACE_ACCESS postfix_expression | IDENTIFIER ( LBRACK expression RBRACK )+ | IDENTIFIER LPAREN expression_list RPAREN | IDENTIFIER LPAREN RPAREN );
    public final GalaxyXPreprocessorParser.postfix_expression_return postfix_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.postfix_expression_return retval = new GalaxyXPreprocessorParser.postfix_expression_return();
        retval.start = input.LT(1);
        int postfix_expression_StartIndex = input.index();
        Object root_0 = null;

        Token set141=null;
        Token DOT142=null;
        Token IDENTIFIER144=null;
        Token NAMESPACE_ACCESS145=null;
        Token IDENTIFIER147=null;
        Token LBRACK148=null;
        Token RBRACK150=null;
        Token IDENTIFIER151=null;
        Token LPAREN152=null;
        Token RPAREN154=null;
        Token IDENTIFIER155=null;
        Token LPAREN156=null;
        Token RPAREN157=null;
        GalaxyXPreprocessorParser.primary_expression_return primary_expression140 = null;

        GalaxyXPreprocessorParser.postfix_expression_return postfix_expression143 = null;

        GalaxyXPreprocessorParser.postfix_expression_return postfix_expression146 = null;

        GalaxyXPreprocessorParser.expression_return expression149 = null;

        GalaxyXPreprocessorParser.expression_list_return expression_list153 = null;


        Object set141_tree=null;
        Object DOT142_tree=null;
        Object IDENTIFIER144_tree=null;
        Object NAMESPACE_ACCESS145_tree=null;
        Object IDENTIFIER147_tree=null;
        Object LBRACK148_tree=null;
        Object RBRACK150_tree=null;
        Object IDENTIFIER151_tree=null;
        Object LPAREN152_tree=null;
        Object RPAREN154_tree=null;
        Object IDENTIFIER155_tree=null;
        Object LPAREN156_tree=null;
        Object RPAREN157_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:183:2: ( primary_expression | ( IDENTIFIER | THIS ) DOT postfix_expression | IDENTIFIER NAMESPACE_ACCESS postfix_expression | IDENTIFIER ( LBRACK expression RBRACK )+ | IDENTIFIER LPAREN expression_list RPAREN | IDENTIFIER LPAREN RPAREN )
            int alt42=6;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:183:4: primary_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primary_expression_in_postfix_expression922);
                    primary_expression140=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression140.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:184:4: ( IDENTIFIER | THIS ) DOT postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    set141=(Token)input.LT(1);
                    if ( input.LA(1)==THIS||input.LA(1)==IDENTIFIER ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set141));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    DOT142=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression935); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT142_tree = (Object)adaptor.create(DOT142);
                    adaptor.addChild(root_0, DOT142_tree);
                    }
                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression937);
                    postfix_expression143=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression143.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:185:4: IDENTIFIER NAMESPACE_ACCESS postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER144=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER144_tree = (Object)adaptor.create(IDENTIFIER144);
                    adaptor.addChild(root_0, IDENTIFIER144_tree);
                    }
                    NAMESPACE_ACCESS145=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_postfix_expression944); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAMESPACE_ACCESS145_tree = (Object)adaptor.create(NAMESPACE_ACCESS145);
                    adaptor.addChild(root_0, NAMESPACE_ACCESS145_tree);
                    }
                    pushFollow(FOLLOW_postfix_expression_in_postfix_expression946);
                    postfix_expression146=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression146.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:186:4: IDENTIFIER ( LBRACK expression RBRACK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER147=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression951); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER147_tree = (Object)adaptor.create(IDENTIFIER147);
                    adaptor.addChild(root_0, IDENTIFIER147_tree);
                    }
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:186:15: ( LBRACK expression RBRACK )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        alt41 = dfa41.predict(input);
                        switch (alt41) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:186:16: LBRACK expression RBRACK
                    	    {
                    	    LBRACK148=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix_expression954); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    LBRACK148_tree = (Object)adaptor.create(LBRACK148);
                    	    adaptor.addChild(root_0, LBRACK148_tree);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_postfix_expression956);
                    	    expression149=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression149.getTree());
                    	    RBRACK150=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix_expression958); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    RBRACK150_tree = (Object)adaptor.create(RBRACK150);
                    	    adaptor.addChild(root_0, RBRACK150_tree);
                    	    }

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


                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:187:4: IDENTIFIER LPAREN expression_list RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER151=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression965); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER151_tree = (Object)adaptor.create(IDENTIFIER151);
                    adaptor.addChild(root_0, IDENTIFIER151_tree);
                    }
                    LPAREN152=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression967); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN152_tree = (Object)adaptor.create(LPAREN152);
                    adaptor.addChild(root_0, LPAREN152_tree);
                    }
                    pushFollow(FOLLOW_expression_list_in_postfix_expression969);
                    expression_list153=expression_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_list153.getTree());
                    RPAREN154=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN154_tree = (Object)adaptor.create(RPAREN154);
                    adaptor.addChild(root_0, RPAREN154_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:188:4: IDENTIFIER LPAREN RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER155=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER155_tree = (Object)adaptor.create(IDENTIFIER155);
                    adaptor.addChild(root_0, IDENTIFIER155_tree);
                    }
                    LPAREN156=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN156_tree = (Object)adaptor.create(LPAREN156);
                    adaptor.addChild(root_0, LPAREN156_tree);
                    }
                    RPAREN157=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN157_tree = (Object)adaptor.create(RPAREN157);
                    adaptor.addChild(root_0, RPAREN157_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, postfix_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"

    public static class expression_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:191:1: expression_list : expression ( COMMA expression )* ;
    public final GalaxyXPreprocessorParser.expression_list_return expression_list() throws RecognitionException {
        GalaxyXPreprocessorParser.expression_list_return retval = new GalaxyXPreprocessorParser.expression_list_return();
        retval.start = input.LT(1);
        int expression_list_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA159=null;
        GalaxyXPreprocessorParser.expression_return expression158 = null;

        GalaxyXPreprocessorParser.expression_return expression160 = null;


        Object COMMA159_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:192:2: ( expression ( COMMA expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:192:4: expression ( COMMA expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expression_list991);
            expression158=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression158.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:192:15: ( COMMA expression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:192:16: COMMA expression
            	    {
            	    COMMA159=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression_list994); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression_list997);
            	    expression160=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression160.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, expression_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression_list"

    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:195:1: primary_expression : ( IDENTIFIER | LPAREN expression RPAREN | constant );
    public final GalaxyXPreprocessorParser.primary_expression_return primary_expression() throws RecognitionException {
        GalaxyXPreprocessorParser.primary_expression_return retval = new GalaxyXPreprocessorParser.primary_expression_return();
        retval.start = input.LT(1);
        int primary_expression_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER161=null;
        Token LPAREN162=null;
        Token RPAREN164=null;
        GalaxyXPreprocessorParser.expression_return expression163 = null;

        GalaxyXPreprocessorParser.constant_return constant165 = null;


        Object IDENTIFIER161_tree=null;
        Object LPAREN162_tree=null;
        Object RPAREN164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:196:2: ( IDENTIFIER | LPAREN expression RPAREN | constant )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:196:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER161=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER161_tree = (Object)adaptor.create(IDENTIFIER161);
                    adaptor.addChild(root_0, IDENTIFIER161_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:197:4: LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN162=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression1015); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primary_expression1018);
                    expression163=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression163.getTree());
                    RPAREN164=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression1020); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:198:4: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression1026);
                    constant165=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant165.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, primary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primary_expression"

    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:201:1: constant : ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS );
    public final GalaxyXPreprocessorParser.constant_return constant() throws RecognitionException {
        GalaxyXPreprocessorParser.constant_return retval = new GalaxyXPreprocessorParser.constant_return();
        retval.start = input.LT(1);
        int constant_StartIndex = input.index();
        Object root_0 = null;

        Token set166=null;

        Object set166_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:202:5: ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set166=(Token)input.LT(1);
            if ( (input.LA(1)>=FALSE && input.LA(1)<=NULL)||input.LA(1)==THIS||(input.LA(1)>=CHARACTER_LITERAL && input.LA(1)<=STRING_LITERAL)||input.LA(1)==INTEGER||input.LA(1)==FIXED_LITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set166));
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, constant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class unary_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_operator"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:212:1: unary_operator : ( PLUS | SUB | NOT | NEW | DELETE | BIT_NOT );
    public final GalaxyXPreprocessorParser.unary_operator_return unary_operator() throws RecognitionException {
        GalaxyXPreprocessorParser.unary_operator_return retval = new GalaxyXPreprocessorParser.unary_operator_return();
        retval.start = input.LT(1);
        int unary_operator_StartIndex = input.index();
        Object root_0 = null;

        Token set167=null;

        Object set167_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:213:2: ( PLUS | SUB | NOT | NEW | DELETE | BIT_NOT )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set167=(Token)input.LT(1);
            if ( (input.LA(1)>=NEW && input.LA(1)<=DELETE)||(input.LA(1)>=PLUS && input.LA(1)<=SUB)||(input.LA(1)>=BIT_NOT && input.LA(1)<=NOT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set167));
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, unary_operator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_operator"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:221:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );
    public final GalaxyXPreprocessorParser.statement_return statement() throws RecognitionException {
        GalaxyXPreprocessorParser.statement_return retval = new GalaxyXPreprocessorParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        GalaxyXPreprocessorParser.assignment_statement_return assignment_statement168 = null;

        GalaxyXPreprocessorParser.expression_statement_return expression_statement169 = null;

        GalaxyXPreprocessorParser.if_statement_return if_statement170 = null;

        GalaxyXPreprocessorParser.while_statement_return while_statement171 = null;

        GalaxyXPreprocessorParser.do_while_statement_return do_while_statement172 = null;

        GalaxyXPreprocessorParser.for_statement_return for_statement173 = null;

        GalaxyXPreprocessorParser.jump_statement_return jump_statement174 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:222:2: ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement )
            int alt45=7;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:222:4: assignment_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_statement_in_statement1154);
                    assignment_statement168=assignment_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_statement168.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:223:4: expression_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_statement_in_statement1159);
                    expression_statement169=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement169.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:224:4: if_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement1164);
                    if_statement170=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement170.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:225:4: while_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement1169);
                    while_statement171=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement171.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:226:4: do_while_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_do_while_statement_in_statement1174);
                    do_while_statement172=do_while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, do_while_statement172.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:227:4: for_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_for_statement_in_statement1179);
                    for_statement173=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement173.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:228:4: jump_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_jump_statement_in_statement1184);
                    jump_statement174=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement174.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class assignment_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:231:1: assignment_statement : assignment_expression SEMI ;
    public final GalaxyXPreprocessorParser.assignment_statement_return assignment_statement() throws RecognitionException {
        GalaxyXPreprocessorParser.assignment_statement_return retval = new GalaxyXPreprocessorParser.assignment_statement_return();
        retval.start = input.LT(1);
        int assignment_statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI176=null;
        GalaxyXPreprocessorParser.assignment_expression_return assignment_expression175 = null;


        Object SEMI176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:232:2: ( assignment_expression SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:232:4: assignment_expression SEMI
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_assignment_statement1196);
            assignment_expression175=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression175.getTree());
            SEMI176=(Token)match(input,SEMI,FOLLOW_SEMI_in_assignment_statement1198); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, assignment_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment_statement"

    public static class expression_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:235:1: expression_statement : ( SEMI | expression SEMI );
    public final GalaxyXPreprocessorParser.expression_statement_return expression_statement() throws RecognitionException {
        GalaxyXPreprocessorParser.expression_statement_return retval = new GalaxyXPreprocessorParser.expression_statement_return();
        retval.start = input.LT(1);
        int expression_statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI177=null;
        Token SEMI179=null;
        GalaxyXPreprocessorParser.expression_return expression178 = null;


        Object SEMI177_tree=null;
        Object SEMI179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:236:2: ( SEMI | expression SEMI )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==SEMI) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=FALSE && LA46_0<=NULL)||(LA46_0>=NEW && LA46_0<=THIS)||(LA46_0>=PLUS && LA46_0<=SUB)||(LA46_0>=BIT_NOT && LA46_0<=NOT)||LA46_0==LPAREN||LA46_0==IDENTIFIER||(LA46_0>=CHARACTER_LITERAL && LA46_0<=STRING_LITERAL)||LA46_0==INTEGER||LA46_0==FIXED_LITERAL) ) {
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:236:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI177=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1211); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:237:4: expression SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_expression_statement1217);
                    expression178=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression178.getTree());
                    SEMI179=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1219); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, expression_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression_statement"

    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:240:1: if_statement : IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF ;
    public final GalaxyXPreprocessorParser.if_statement_return if_statement() throws RecognitionException {
        GalaxyXPreprocessorParser.if_statement_return retval = new GalaxyXPreprocessorParser.if_statement_return();
        retval.start = input.LT(1);
        int if_statement_StartIndex = input.index();
        Object root_0 = null;

        Token IF180=null;
        Token LPAREN181=null;
        Token RPAREN183=null;
        Token COLON184=null;
        Token ELIF186=null;
        Token LPAREN187=null;
        Token RPAREN189=null;
        Token COLON190=null;
        Token ELSE192=null;
        Token COLON193=null;
        Token END195=null;
        Token IF196=null;
        GalaxyXPreprocessorParser.expression_return expression182 = null;

        GalaxyXPreprocessorParser.statement_return statement185 = null;

        GalaxyXPreprocessorParser.expression_return expression188 = null;

        GalaxyXPreprocessorParser.statement_return statement191 = null;

        GalaxyXPreprocessorParser.statement_return statement194 = null;


        Object IF180_tree=null;
        Object LPAREN181_tree=null;
        Object RPAREN183_tree=null;
        Object COLON184_tree=null;
        Object ELIF186_tree=null;
        Object LPAREN187_tree=null;
        Object RPAREN189_tree=null;
        Object COLON190_tree=null;
        Object ELSE192_tree=null;
        Object COLON193_tree=null;
        Object END195_tree=null;
        Object IF196_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:241:2: ( IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:241:4: IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF
            {
            root_0 = (Object)adaptor.nil();

            IF180=(Token)match(input,IF,FOLLOW_IF_in_if_statement1232); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF180_tree = (Object)adaptor.create(IF180);
            adaptor.addChild(root_0, IF180_tree);
            }
            LPAREN181=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN181_tree = (Object)adaptor.create(LPAREN181);
            adaptor.addChild(root_0, LPAREN181_tree);
            }
            pushFollow(FOLLOW_expression_in_if_statement1236);
            expression182=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression182.getTree());
            RPAREN183=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1238); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN183_tree = (Object)adaptor.create(RPAREN183);
            adaptor.addChild(root_0, RPAREN183_tree);
            }
            COLON184=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON184_tree = (Object)adaptor.create(COLON184);
            adaptor.addChild(root_0, COLON184_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:242:4: ( statement )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement1245);
            	    statement185=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement185.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:243:3: ( ELIF LPAREN expression RPAREN COLON ( statement )* )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ELIF) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:243:4: ELIF LPAREN expression RPAREN COLON ( statement )*
            	    {
            	    ELIF186=(Token)match(input,ELIF,FOLLOW_ELIF_in_if_statement1251); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELIF186_tree = (Object)adaptor.create(ELIF186);
            	    adaptor.addChild(root_0, ELIF186_tree);
            	    }
            	    LPAREN187=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1253); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LPAREN187_tree = (Object)adaptor.create(LPAREN187);
            	    adaptor.addChild(root_0, LPAREN187_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_if_statement1255);
            	    expression188=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression188.getTree());
            	    RPAREN189=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1257); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RPAREN189_tree = (Object)adaptor.create(RPAREN189);
            	    adaptor.addChild(root_0, RPAREN189_tree);
            	    }
            	    COLON190=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1259); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COLON190_tree = (Object)adaptor.create(COLON190);
            	    adaptor.addChild(root_0, COLON190_tree);
            	    }
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:244:4: ( statement )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        alt48 = dfa48.predict(input);
            	        switch (alt48) {
            	    	case 1 :
            	    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_if_statement1264);
            	    	    statement191=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement191.getTree());

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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:245:3: ( ELSE COLON ( statement )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ELSE) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:245:4: ELSE COLON ( statement )*
                    {
                    ELSE192=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1272); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE192_tree = (Object)adaptor.create(ELSE192);
                    adaptor.addChild(root_0, ELSE192_tree);
                    }
                    COLON193=(Token)match(input,COLON,FOLLOW_COLON_in_if_statement1274); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON193_tree = (Object)adaptor.create(COLON193);
                    adaptor.addChild(root_0, COLON193_tree);
                    }
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:246:4: ( statement )*
                    loop50:
                    do {
                        int alt50=2;
                        alt50 = dfa50.predict(input);
                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement1280);
                    	    statement194=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement194.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            END195=(Token)match(input,END,FOLLOW_END_in_if_statement1287); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END195_tree = (Object)adaptor.create(END195);
            adaptor.addChild(root_0, END195_tree);
            }
            IF196=(Token)match(input,IF,FOLLOW_IF_in_if_statement1289); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF196_tree = (Object)adaptor.create(IF196);
            adaptor.addChild(root_0, IF196_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, if_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class while_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:250:1: while_statement : WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE ;
    public final GalaxyXPreprocessorParser.while_statement_return while_statement() throws RecognitionException {
        GalaxyXPreprocessorParser.while_statement_return retval = new GalaxyXPreprocessorParser.while_statement_return();
        retval.start = input.LT(1);
        int while_statement_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE197=null;
        Token LPAREN198=null;
        Token RPAREN200=null;
        Token COLON201=null;
        Token END203=null;
        Token WHILE204=null;
        GalaxyXPreprocessorParser.expression_return expression199 = null;

        GalaxyXPreprocessorParser.statement_return statement202 = null;


        Object WHILE197_tree=null;
        Object LPAREN198_tree=null;
        Object RPAREN200_tree=null;
        Object COLON201_tree=null;
        Object END203_tree=null;
        Object WHILE204_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:251:2: ( WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:251:4: WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE
            {
            root_0 = (Object)adaptor.nil();

            WHILE197=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1301); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE197_tree = (Object)adaptor.create(WHILE197);
            adaptor.addChild(root_0, WHILE197_tree);
            }
            LPAREN198=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1303); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN198_tree = (Object)adaptor.create(LPAREN198);
            adaptor.addChild(root_0, LPAREN198_tree);
            }
            pushFollow(FOLLOW_expression_in_while_statement1305);
            expression199=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression199.getTree());
            RPAREN200=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1307); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN200_tree = (Object)adaptor.create(RPAREN200);
            adaptor.addChild(root_0, RPAREN200_tree);
            }
            COLON201=(Token)match(input,COLON,FOLLOW_COLON_in_while_statement1309); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON201_tree = (Object)adaptor.create(COLON201);
            adaptor.addChild(root_0, COLON201_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:252:4: ( statement )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement1314);
            	    statement202=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement202.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            END203=(Token)match(input,END,FOLLOW_END_in_while_statement1319); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END203_tree = (Object)adaptor.create(END203);
            adaptor.addChild(root_0, END203_tree);
            }
            WHILE204=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1321); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE204_tree = (Object)adaptor.create(WHILE204);
            adaptor.addChild(root_0, WHILE204_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, while_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "while_statement"

    public static class for_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:256:1: for_statement : FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR ;
    public final GalaxyXPreprocessorParser.for_statement_return for_statement() throws RecognitionException {
        GalaxyXPreprocessorParser.for_statement_return retval = new GalaxyXPreprocessorParser.for_statement_return();
        retval.start = input.LT(1);
        int for_statement_StartIndex = input.index();
        Object root_0 = null;

        Token FOR205=null;
        Token LPAREN206=null;
        Token SEMI208=null;
        Token SEMI210=null;
        Token RPAREN212=null;
        Token COLON213=null;
        Token END215=null;
        Token FOR216=null;
        GalaxyXPreprocessorParser.assignment_expression_return assignment_expression207 = null;

        GalaxyXPreprocessorParser.expression_return expression209 = null;

        GalaxyXPreprocessorParser.expression_return expression211 = null;

        GalaxyXPreprocessorParser.statement_return statement214 = null;


        Object FOR205_tree=null;
        Object LPAREN206_tree=null;
        Object SEMI208_tree=null;
        Object SEMI210_tree=null;
        Object RPAREN212_tree=null;
        Object COLON213_tree=null;
        Object END215_tree=null;
        Object FOR216_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:257:2: ( FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:257:4: FOR LPAREN ( assignment_expression )? SEMI ( expression )? SEMI ( expression )? RPAREN COLON ( statement )* END FOR
            {
            root_0 = (Object)adaptor.nil();

            FOR205=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1333); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR205_tree = (Object)adaptor.create(FOR205);
            adaptor.addChild(root_0, FOR205_tree);
            }
            LPAREN206=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_for_statement1335); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN206_tree = (Object)adaptor.create(LPAREN206);
            adaptor.addChild(root_0, LPAREN206_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:257:15: ( assignment_expression )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=FALSE && LA53_0<=NULL)||(LA53_0>=NEW && LA53_0<=THIS)||(LA53_0>=PLUS && LA53_0<=SUB)||(LA53_0>=BIT_NOT && LA53_0<=NOT)||LA53_0==LPAREN||LA53_0==IDENTIFIER||(LA53_0>=CHARACTER_LITERAL && LA53_0<=STRING_LITERAL)||LA53_0==INTEGER||LA53_0==FIXED_LITERAL) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: assignment_expression
                    {
                    pushFollow(FOLLOW_assignment_expression_in_for_statement1337);
                    assignment_expression207=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression207.getTree());

                    }
                    break;

            }

            SEMI208=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1340); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI208_tree = (Object)adaptor.create(SEMI208);
            adaptor.addChild(root_0, SEMI208_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:257:43: ( expression )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=FALSE && LA54_0<=NULL)||(LA54_0>=NEW && LA54_0<=THIS)||(LA54_0>=PLUS && LA54_0<=SUB)||(LA54_0>=BIT_NOT && LA54_0<=NOT)||LA54_0==LPAREN||LA54_0==IDENTIFIER||(LA54_0>=CHARACTER_LITERAL && LA54_0<=STRING_LITERAL)||LA54_0==INTEGER||LA54_0==FIXED_LITERAL) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1342);
                    expression209=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression209.getTree());

                    }
                    break;

            }

            SEMI210=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1345); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI210_tree = (Object)adaptor.create(SEMI210);
            adaptor.addChild(root_0, SEMI210_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:257:60: ( expression )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=FALSE && LA55_0<=NULL)||(LA55_0>=NEW && LA55_0<=THIS)||(LA55_0>=PLUS && LA55_0<=SUB)||(LA55_0>=BIT_NOT && LA55_0<=NOT)||LA55_0==LPAREN||LA55_0==IDENTIFIER||(LA55_0>=CHARACTER_LITERAL && LA55_0<=STRING_LITERAL)||LA55_0==INTEGER||LA55_0==FIXED_LITERAL) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_for_statement1347);
                    expression211=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression211.getTree());

                    }
                    break;

            }

            RPAREN212=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_for_statement1350); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN212_tree = (Object)adaptor.create(RPAREN212);
            adaptor.addChild(root_0, RPAREN212_tree);
            }
            COLON213=(Token)match(input,COLON,FOLLOW_COLON_in_for_statement1352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON213_tree = (Object)adaptor.create(COLON213);
            adaptor.addChild(root_0, COLON213_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:258:4: ( statement )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_for_statement1357);
            	    statement214=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement214.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            END215=(Token)match(input,END,FOLLOW_END_in_for_statement1362); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END215_tree = (Object)adaptor.create(END215);
            adaptor.addChild(root_0, END215_tree);
            }
            FOR216=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1364); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR216_tree = (Object)adaptor.create(FOR216);
            adaptor.addChild(root_0, FOR216_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, for_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "for_statement"

    public static class do_while_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "do_while_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:262:1: do_while_statement : DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO ;
    public final GalaxyXPreprocessorParser.do_while_statement_return do_while_statement() throws RecognitionException {
        GalaxyXPreprocessorParser.do_while_statement_return retval = new GalaxyXPreprocessorParser.do_while_statement_return();
        retval.start = input.LT(1);
        int do_while_statement_StartIndex = input.index();
        Object root_0 = null;

        Token DO217=null;
        Token COLON218=null;
        Token WHILE220=null;
        Token LPAREN221=null;
        Token RPAREN223=null;
        Token END224=null;
        Token DO225=null;
        GalaxyXPreprocessorParser.statement_return statement219 = null;

        GalaxyXPreprocessorParser.expression_return expression222 = null;


        Object DO217_tree=null;
        Object COLON218_tree=null;
        Object WHILE220_tree=null;
        Object LPAREN221_tree=null;
        Object RPAREN223_tree=null;
        Object END224_tree=null;
        Object DO225_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:263:2: ( DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:263:4: DO COLON ( statement )* WHILE LPAREN expression RPAREN END DO
            {
            root_0 = (Object)adaptor.nil();

            DO217=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DO217_tree = (Object)adaptor.create(DO217);
            adaptor.addChild(root_0, DO217_tree);
            }
            COLON218=(Token)match(input,COLON,FOLLOW_COLON_in_do_while_statement1378); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON218_tree = (Object)adaptor.create(COLON218);
            adaptor.addChild(root_0, COLON218_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:264:4: ( statement )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_do_while_statement1383);
            	    statement219=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement219.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            WHILE220=(Token)match(input,WHILE,FOLLOW_WHILE_in_do_while_statement1389); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE220_tree = (Object)adaptor.create(WHILE220);
            adaptor.addChild(root_0, WHILE220_tree);
            }
            LPAREN221=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_do_while_statement1391); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN221_tree = (Object)adaptor.create(LPAREN221);
            adaptor.addChild(root_0, LPAREN221_tree);
            }
            pushFollow(FOLLOW_expression_in_do_while_statement1393);
            expression222=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression222.getTree());
            RPAREN223=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_do_while_statement1395); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN223_tree = (Object)adaptor.create(RPAREN223);
            adaptor.addChild(root_0, RPAREN223_tree);
            }
            END224=(Token)match(input,END,FOLLOW_END_in_do_while_statement1400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END224_tree = (Object)adaptor.create(END224);
            adaptor.addChild(root_0, END224_tree);
            }
            DO225=(Token)match(input,DO,FOLLOW_DO_in_do_while_statement1402); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DO225_tree = (Object)adaptor.create(DO225);
            adaptor.addChild(root_0, DO225_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, do_while_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "do_while_statement"

    public static class jump_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jump_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:269:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );
    public final GalaxyXPreprocessorParser.jump_statement_return jump_statement() throws RecognitionException {
        GalaxyXPreprocessorParser.jump_statement_return retval = new GalaxyXPreprocessorParser.jump_statement_return();
        retval.start = input.LT(1);
        int jump_statement_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK226=null;
        Token SEMI227=null;
        Token CONTINUE228=null;
        Token SEMI229=null;
        Token RETURN230=null;
        Token SEMI231=null;
        Token RETURN232=null;
        Token SEMI234=null;
        GalaxyXPreprocessorParser.expression_return expression233 = null;


        Object BREAK226_tree=null;
        Object SEMI227_tree=null;
        Object CONTINUE228_tree=null;
        Object SEMI229_tree=null;
        Object RETURN230_tree=null;
        Object SEMI231_tree=null;
        Object RETURN232_tree=null;
        Object SEMI234_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:270:2: ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI )
            int alt58=4;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:270:4: BREAK SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    BREAK226=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement1414); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK226_tree = (Object)adaptor.create(BREAK226);
                    adaptor.addChild(root_0, BREAK226_tree);
                    }
                    SEMI227=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI227_tree = (Object)adaptor.create(SEMI227);
                    adaptor.addChild(root_0, SEMI227_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:271:4: CONTINUE SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    CONTINUE228=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTINUE228_tree = (Object)adaptor.create(CONTINUE228);
                    adaptor.addChild(root_0, CONTINUE228_tree);
                    }
                    SEMI229=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI229_tree = (Object)adaptor.create(SEMI229);
                    adaptor.addChild(root_0, SEMI229_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:272:4: RETURN SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN230=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN230_tree = (Object)adaptor.create(RETURN230);
                    adaptor.addChild(root_0, RETURN230_tree);
                    }
                    SEMI231=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI231_tree = (Object)adaptor.create(SEMI231);
                    adaptor.addChild(root_0, SEMI231_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:273:4: RETURN expression SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN232=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN232_tree = (Object)adaptor.create(RETURN232);
                    adaptor.addChild(root_0, RETURN232_tree);
                    }
                    pushFollow(FOLLOW_expression_in_jump_statement1437);
                    expression233=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression233.getTree());
                    SEMI234=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1439); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI234_tree = (Object)adaptor.create(SEMI234);
                    adaptor.addChild(root_0, SEMI234_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, jump_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "jump_statement"

    public static class preprocessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "preprocessor"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:278:1: preprocessor : PREFIX ( include | define | undef ) ;
    public final GalaxyXPreprocessorParser.preprocessor_return preprocessor() throws RecognitionException {
        GalaxyXPreprocessorParser.preprocessor_return retval = new GalaxyXPreprocessorParser.preprocessor_return();
        retval.start = input.LT(1);
        int preprocessor_StartIndex = input.index();
        Object root_0 = null;

        Token PREFIX235=null;
        GalaxyXPreprocessorParser.include_return include236 = null;

        GalaxyXPreprocessorParser.define_return define237 = null;

        GalaxyXPreprocessorParser.undef_return undef238 = null;


        Object PREFIX235_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:279:2: ( PREFIX ( include | define | undef ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:279:4: PREFIX ( include | define | undef )
            {
            root_0 = (Object)adaptor.nil();

            PREFIX235=(Token)match(input,PREFIX,FOLLOW_PREFIX_in_preprocessor1452); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PREFIX235_tree = (Object)adaptor.create(PREFIX235);
            adaptor.addChild(root_0, PREFIX235_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:280:3: ( include | define | undef )
            int alt59=3;
            switch ( input.LA(1) ) {
            case INCLUDE:
                {
                alt59=1;
                }
                break;
            case DEFINE:
                {
                alt59=2;
                }
                break;
            case UNDEF:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:280:4: include
                    {
                    pushFollow(FOLLOW_include_in_preprocessor1457);
                    include236=include();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, include236.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:280:14: define
                    {
                    pushFollow(FOLLOW_define_in_preprocessor1461);
                    define237=define();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, define237.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:280:23: undef
                    {
                    pushFollow(FOLLOW_undef_in_preprocessor1465);
                    undef238=undef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, undef238.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, preprocessor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "preprocessor"

    public static class include_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "include"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:283:1: include : INCLUDE path= STRING_LITERAL ;
    public final GalaxyXPreprocessorParser.include_return include() throws RecognitionException {
        GalaxyXPreprocessorParser.include_return retval = new GalaxyXPreprocessorParser.include_return();
        retval.start = input.LT(1);
        int include_StartIndex = input.index();
        Object root_0 = null;

        Token path=null;
        Token INCLUDE239=null;

        Object path_tree=null;
        Object INCLUDE239_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:284:2: ( INCLUDE path= STRING_LITERAL )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:284:4: INCLUDE path= STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INCLUDE239=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include1478); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INCLUDE239_tree = (Object)adaptor.create(INCLUDE239);
            adaptor.addChild(root_0, INCLUDE239_tree);
            }
            path=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_include1482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            path_tree = (Object)adaptor.create(path);
            adaptor.addChild(root_0, path_tree);
            }
            if ( state.backtracking==0 ) {

              		p.processInclude(path);
              	
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, include_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "include"

    public static class define_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "define"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:290:1: define : DEFINE id= IDENTIFIER (s= STRING_LITERAL | (s= SUB )? i= INTEGER | (s= SUB )? f= FIXED_LITERAL ) ;
    public final GalaxyXPreprocessorParser.define_return define() throws RecognitionException {
        GalaxyXPreprocessorParser.define_return retval = new GalaxyXPreprocessorParser.define_return();
        retval.start = input.LT(1);
        int define_StartIndex = input.index();
        Object root_0 = null;

        Token id=null;
        Token s=null;
        Token i=null;
        Token f=null;
        Token DEFINE240=null;

        Object id_tree=null;
        Object s_tree=null;
        Object i_tree=null;
        Object f_tree=null;
        Object DEFINE240_tree=null;


        	String definition = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:294:2: ( DEFINE id= IDENTIFIER (s= STRING_LITERAL | (s= SUB )? i= INTEGER | (s= SUB )? f= FIXED_LITERAL ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:294:4: DEFINE id= IDENTIFIER (s= STRING_LITERAL | (s= SUB )? i= INTEGER | (s= SUB )? f= FIXED_LITERAL )
            {
            root_0 = (Object)adaptor.nil();

            DEFINE240=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_define1501); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFINE240_tree = (Object)adaptor.create(DEFINE240);
            adaptor.addChild(root_0, DEFINE240_tree);
            }
            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_define1505); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            id_tree = (Object)adaptor.create(id);
            adaptor.addChild(root_0, id_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:294:25: (s= STRING_LITERAL | (s= SUB )? i= INTEGER | (s= SUB )? f= FIXED_LITERAL )
            int alt62=3;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt62=1;
                }
                break;
            case SUB:
                {
                int LA62_2 = input.LA(2);

                if ( (LA62_2==INTEGER) ) {
                    alt62=2;
                }
                else if ( (LA62_2==FIXED_LITERAL) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 2, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
                {
                alt62=2;
                }
                break;
            case FIXED_LITERAL:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:294:26: s= STRING_LITERAL
                    {
                    s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_define1510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    s_tree = (Object)adaptor.create(s);
                    adaptor.addChild(root_0, s_tree);
                    }
                    if ( state.backtracking==0 ) {
                      definition = (s!=null?s.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:294:68: (s= SUB )? i= INTEGER
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:294:69: (s= SUB )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==SUB) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: s= SUB
                            {
                            s=(Token)match(input,SUB,FOLLOW_SUB_in_define1517); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            s_tree = (Object)adaptor.create(s);
                            adaptor.addChild(root_0, s_tree);
                            }

                            }
                            break;

                    }

                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_define1522); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    i_tree = (Object)adaptor.create(i);
                    adaptor.addChild(root_0, i_tree);
                    }
                    if ( state.backtracking==0 ) {
                      definition = s == null? (i!=null?i.getText():null) : "-"+(i!=null?i.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:294:135: (s= SUB )? f= FIXED_LITERAL
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:294:136: (s= SUB )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==SUB) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:0:0: s= SUB
                            {
                            s=(Token)match(input,SUB,FOLLOW_SUB_in_define1529); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            s_tree = (Object)adaptor.create(s);
                            adaptor.addChild(root_0, s_tree);
                            }

                            }
                            break;

                    }

                    f=(Token)match(input,FIXED_LITERAL,FOLLOW_FIXED_LITERAL_in_define1534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    f_tree = (Object)adaptor.create(f);
                    adaptor.addChild(root_0, f_tree);
                    }
                    if ( state.backtracking==0 ) {
                      definition = s == null? (f!=null?f.getText():null) : "-"+(f!=null?f.getText():null);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		if(!p.define((id!=null?id.getText():null),definition,(id!=null?id.getLine():0))){
              			p.reportError("Definition $1 already exists",id);
              		}
              	
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, define_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "define"

    public static class undef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "undef"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:302:1: undef : UNDEF id= IDENTIFIER ;
    public final GalaxyXPreprocessorParser.undef_return undef() throws RecognitionException {
        GalaxyXPreprocessorParser.undef_return retval = new GalaxyXPreprocessorParser.undef_return();
        retval.start = input.LT(1);
        int undef_StartIndex = input.index();
        Object root_0 = null;

        Token id=null;
        Token UNDEF241=null;

        Object id_tree=null;
        Object UNDEF241_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:303:2: ( UNDEF id= IDENTIFIER )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:303:4: UNDEF id= IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            UNDEF241=(Token)match(input,UNDEF,FOLLOW_UNDEF_in_undef1552); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UNDEF241_tree = (Object)adaptor.create(UNDEF241);
            adaptor.addChild(root_0, UNDEF241_tree);
            }
            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_undef1556); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            id_tree = (Object)adaptor.create(id);
            adaptor.addChild(root_0, id_tree);
            }
            if ( state.backtracking==0 ) {

              		if(!p.undef((id!=null?id.getText():null),(id!=null?id.getLine():0))){
              			p.reportError("Definition $1 does not exist",id);
              		}
              	
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, undef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "undef"

    // $ANTLR start synpred4_GalaxyXPreprocessorParser
    public final void synpred4_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:18: ( function_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:18: function_decl
        {
        pushFollow(FOLLOW_function_decl_in_synpred4_GalaxyXPreprocessorParser129);
        function_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_GalaxyXPreprocessorParser

    // $ANTLR start synpred5_GalaxyXPreprocessorParser
    public final void synpred5_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:34: ( field_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:43:34: field_decl
        {
        pushFollow(FOLLOW_field_decl_in_synpred5_GalaxyXPreprocessorParser133);
        field_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_GalaxyXPreprocessorParser

    // $ANTLR start synpred10_GalaxyXPreprocessorParser
    public final void synpred10_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:5: ( field_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:5: field_decl
        {
        pushFollow(FOLLOW_field_decl_in_synpred10_GalaxyXPreprocessorParser181);
        field_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_GalaxyXPreprocessorParser

    // $ANTLR start synpred11_GalaxyXPreprocessorParser
    public final void synpred11_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:18: ( function_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:49:18: function_decl
        {
        pushFollow(FOLLOW_function_decl_in_synpred11_GalaxyXPreprocessorParser185);
        function_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_GalaxyXPreprocessorParser

    // $ANTLR start synpred16_GalaxyXPreprocessorParser
    public final void synpred16_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:55:5: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:55:5: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred16_GalaxyXPreprocessorParser233);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_GalaxyXPreprocessorParser

    // $ANTLR start synpred17_GalaxyXPreprocessorParser
    public final void synpred17_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:55:22: ( preprocessor )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:55:22: preprocessor
        {
        pushFollow(FOLLOW_preprocessor_in_synpred17_GalaxyXPreprocessorParser237);
        preprocessor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_GalaxyXPreprocessorParser

    // $ANTLR start synpred21_GalaxyXPreprocessorParser
    public final void synpred21_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:62:5: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:62:5: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred21_GalaxyXPreprocessorParser284);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_GalaxyXPreprocessorParser

    // $ANTLR start synpred22_GalaxyXPreprocessorParser
    public final void synpred22_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:62:22: ( preprocessor )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:62:22: preprocessor
        {
        pushFollow(FOLLOW_preprocessor_in_synpred22_GalaxyXPreprocessorParser288);
        preprocessor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_GalaxyXPreprocessorParser

    // $ANTLR start synpred28_GalaxyXPreprocessorParser
    public final void synpred28_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:69:5: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:69:5: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred28_GalaxyXPreprocessorParser347);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_GalaxyXPreprocessorParser

    // $ANTLR start synpred29_GalaxyXPreprocessorParser
    public final void synpred29_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:69:22: ( preprocessor )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:69:22: preprocessor
        {
        pushFollow(FOLLOW_preprocessor_in_synpred29_GalaxyXPreprocessorParser351);
        preprocessor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_GalaxyXPreprocessorParser

    // $ANTLR start synpred41_GalaxyXPreprocessorParser
    public final void synpred41_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:92:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:92:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred41_GalaxyXPreprocessorParser487);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_GalaxyXPreprocessorParser

    // $ANTLR start synpred80_GalaxyXPreprocessorParser
    public final void synpred80_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:187:4: ( IDENTIFIER LPAREN expression_list RPAREN )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:187:4: IDENTIFIER LPAREN expression_list RPAREN
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred80_GalaxyXPreprocessorParser965); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred80_GalaxyXPreprocessorParser967); if (state.failed) return ;
        pushFollow(FOLLOW_expression_list_in_synpred80_GalaxyXPreprocessorParser969);
        expression_list();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred80_GalaxyXPreprocessorParser971); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_GalaxyXPreprocessorParser

    // $ANTLR start synpred96_GalaxyXPreprocessorParser
    public final void synpred96_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:222:4: ( assignment_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:222:4: assignment_statement
        {
        pushFollow(FOLLOW_assignment_statement_in_synpred96_GalaxyXPreprocessorParser1154);
        assignment_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_GalaxyXPreprocessorParser

    // $ANTLR start synpred97_GalaxyXPreprocessorParser
    public final void synpred97_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:223:4: ( expression_statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:223:4: expression_statement
        {
        pushFollow(FOLLOW_expression_statement_in_synpred97_GalaxyXPreprocessorParser1159);
        expression_statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_GalaxyXPreprocessorParser

    // $ANTLR start synpred113_GalaxyXPreprocessorParser
    public final void synpred113_GalaxyXPreprocessorParser_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:264:4: ( statement )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:264:4: statement
        {
        pushFollow(FOLLOW_statement_in_synpred113_GalaxyXPreprocessorParser1383);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_GalaxyXPreprocessorParser

    // Delegated rules

    public final boolean synpred4_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_GalaxyXPreprocessorParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_GalaxyXPreprocessorParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_GalaxyXPreprocessorParser_fragment(); // can never throw exception
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
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA2_eotS =
        "\22\uffff";
    static final String DFA2_eofS =
        "\22\uffff";
    static final String DFA2_minS =
        "\1\11\1\uffff\1\22\1\uffff\1\22\6\uffff\1\0\6\uffff";
    static final String DFA2_maxS =
        "\1\127\1\uffff\1\127\1\uffff\1\127\6\uffff\1\0\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\6\1\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\1\5\10\uffff";
    static final String DFA2_specialS =
        "\13\uffff\1\0\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\10\uffff\1\5\4\uffff\1\3\10\uffff\1\10\1\uffff\1\4\1\6"+
            "\2\2\4\uffff\1\11\54\uffff\1\6",
            "",
            "\1\5\4\uffff\1\3\12\uffff\1\13\1\6\63\uffff\1\6",
            "",
            "\1\5\20\uffff\1\6\63\uffff\1\6",
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
            return "()* loopback of 43:4: ( class_decl | function_decl | field_decl | initializer | preprocessor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_GalaxyXPreprocessorParser()) ) {s = 5;}

                        else if ( (synpred5_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index2_11);
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
        "\21\uffff";
    static final String DFA5_eofS =
        "\21\uffff";
    static final String DFA5_minS =
        "\1\11\1\uffff\2\22\6\uffff\1\0\6\uffff";
    static final String DFA5_maxS =
        "\1\127\1\uffff\2\127\6\uffff\1\0\6\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\6\2\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\7\uffff";
    static final String DFA5_specialS =
        "\12\uffff\1\0\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\10\uffff\1\6\1\7\1\10\15\uffff\1\3\1\4\2\2\4\uffff\1\11"+
            "\54\uffff\1\4",
            "",
            "\1\6\17\uffff\1\12\1\4\63\uffff\1\4",
            "\1\6\20\uffff\1\4\63\uffff\1\4",
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
            return "()* loopback of 49:4: ( field_decl | function_decl | constructor_decl | destructor_decl | preprocessor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_10 = input.LA(1);

                         
                        int index5_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_GalaxyXPreprocessorParser()) ) {s = 4;}

                        else if ( (synpred11_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index5_10);
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
        "\47\uffff";
    static final String DFA7_eofS =
        "\47\uffff";
    static final String DFA7_minS =
        "\1\4\1\53\14\uffff\1\47\3\uffff\1\0\15\uffff\1\0\2\uffff\3\0\1"+
        "\uffff";
    static final String DFA7_maxS =
        "\1\137\1\127\14\uffff\1\51\3\uffff\1\0\15\uffff\1\0\2\uffff\3\0"+
        "\1\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\3\15\uffff\1\1\25\uffff\1\2";
    static final String DFA7_specialS =
        "\22\uffff\1\0\15\uffff\1\1\2\uffff\1\2\1\3\1\4\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\20\6\uffff\1\16\1"+
            "\2\4\uffff\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\40\1"+
            "\uffff\1\22\1\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\45\1\43",
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
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()* loopback of 55:4: ( local_var_decl | preprocessor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_18 = input.LA(1);

                         
                        int index7_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_GalaxyXPreprocessorParser()) ) {s = 16;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_32 = input.LA(1);

                         
                        int index7_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_GalaxyXPreprocessorParser()) ) {s = 16;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_32);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_35 = input.LA(1);

                         
                        int index7_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_GalaxyXPreprocessorParser()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_35);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_36 = input.LA(1);

                         
                        int index7_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_GalaxyXPreprocessorParser()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_36);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_37 = input.LA(1);

                         
                        int index7_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_GalaxyXPreprocessorParser()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_37);
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
        "\20\uffff";
    static final String DFA8_eofS =
        "\20\uffff";
    static final String DFA8_minS =
        "\1\4\17\uffff";
    static final String DFA8_maxS =
        "\1\137\17\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\3\1\1\14\uffff\1\2";
    static final String DFA8_specialS =
        "\20\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\14\uffff\1\17\1\2\4\uffff"+
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
            return "()* loopback of 56:4: ( statement | preprocessor )*";
        }
    }
    static final String DFA10_eotS =
        "\47\uffff";
    static final String DFA10_eofS =
        "\47\uffff";
    static final String DFA10_minS =
        "\1\4\1\53\14\uffff\1\47\3\uffff\1\0\15\uffff\1\0\2\uffff\3\0\1"+
        "\uffff";
    static final String DFA10_maxS =
        "\1\137\1\127\14\uffff\1\51\3\uffff\1\0\15\uffff\1\0\2\uffff\3\0"+
        "\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\3\15\uffff\1\1\25\uffff\1\2";
    static final String DFA10_specialS =
        "\22\uffff\1\0\15\uffff\1\1\2\uffff\1\2\1\3\1\4\1\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\20\6\uffff\1\16\1"+
            "\2\4\uffff\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\40\1"+
            "\uffff\1\22\1\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\45\1\43",
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
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()* loopback of 62:4: ( local_var_decl | preprocessor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_18 = input.LA(1);

                         
                        int index10_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_GalaxyXPreprocessorParser()) ) {s = 16;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_32 = input.LA(1);

                         
                        int index10_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_GalaxyXPreprocessorParser()) ) {s = 16;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_32);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_35 = input.LA(1);

                         
                        int index10_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_GalaxyXPreprocessorParser()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_35);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_36 = input.LA(1);

                         
                        int index10_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_GalaxyXPreprocessorParser()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_36);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_37 = input.LA(1);

                         
                        int index10_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_GalaxyXPreprocessorParser()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_37);
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
        "\20\uffff";
    static final String DFA11_eofS =
        "\20\uffff";
    static final String DFA11_minS =
        "\1\4\17\uffff";
    static final String DFA11_maxS =
        "\1\137\17\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\3\1\1\14\uffff\1\2";
    static final String DFA11_specialS =
        "\20\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\14\uffff\1\17\1\2\4\uffff"+
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
            return "()* loopback of 63:4: ( statement | preprocessor )*";
        }
    }
    static final String DFA15_eotS =
        "\47\uffff";
    static final String DFA15_eofS =
        "\47\uffff";
    static final String DFA15_minS =
        "\1\4\1\53\14\uffff\1\47\3\uffff\1\0\15\uffff\1\0\2\uffff\3\0\1"+
        "\uffff";
    static final String DFA15_maxS =
        "\1\137\1\127\14\uffff\1\51\3\uffff\1\0\15\uffff\1\0\2\uffff\3\0"+
        "\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\3\15\uffff\1\1\25\uffff\1\2";
    static final String DFA15_specialS =
        "\22\uffff\1\0\15\uffff\1\1\2\uffff\1\2\1\3\1\4\1\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\20\6\uffff\1\16\1"+
            "\2\4\uffff\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\40\1"+
            "\uffff\1\22\1\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\45\1\43",
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
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()* loopback of 69:4: ( local_var_decl | preprocessor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_18 = input.LA(1);

                         
                        int index15_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_GalaxyXPreprocessorParser()) ) {s = 16;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_32 = input.LA(1);

                         
                        int index15_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_GalaxyXPreprocessorParser()) ) {s = 16;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_32);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_35 = input.LA(1);

                         
                        int index15_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_GalaxyXPreprocessorParser()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_35);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_36 = input.LA(1);

                         
                        int index15_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_GalaxyXPreprocessorParser()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_36);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_37 = input.LA(1);

                         
                        int index15_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_GalaxyXPreprocessorParser()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_37);
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
        "\20\uffff";
    static final String DFA16_eofS =
        "\20\uffff";
    static final String DFA16_minS =
        "\1\4\17\uffff";
    static final String DFA16_maxS =
        "\1\137\17\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\3\1\1\14\uffff\1\2";
    static final String DFA16_specialS =
        "\20\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\2\uffff\2\2\1\1\7\2\12\uffff\3\2\14\uffff\1\17\1\2\4\uffff"+
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
            return "()* loopback of 70:4: ( statement | preprocessor )*";
        }
    }
    static final String DFA26_eotS =
        "\42\uffff";
    static final String DFA26_eofS =
        "\42\uffff";
    static final String DFA26_minS =
        "\1\4\1\53\17\uffff\1\0\15\uffff\1\0\2\uffff";
    static final String DFA26_maxS =
        "\1\137\1\127\17\uffff\1\0\15\uffff\1\0\2\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\14\uffff\1\1\22\uffff";
    static final String DFA26_specialS =
        "\21\uffff\1\0\15\uffff\1\1\2\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\2\uffff\12\2\12\uffff\3\2\5\uffff\1\17\7\uffff\1\2\4\uffff"+
            "\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\2\uffff\10\2\2\uffff\26\2\3\uffff\1\37\1"+
            "\uffff\1\21\1\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 92:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_17 = input.LA(1);

                         
                        int index26_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_GalaxyXPreprocessorParser()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_31 = input.LA(1);

                         
                        int index26_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_GalaxyXPreprocessorParser()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_31);
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
        "\17\uffff";
    static final String DFA27_eofS =
        "\17\uffff";
    static final String DFA27_minS =
        "\1\4\16\uffff";
    static final String DFA27_maxS =
        "\1\137\16\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\1\1\14\uffff";
    static final String DFA27_specialS =
        "\17\uffff}>";
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
            return "()* loopback of 93:4: ( statement )*";
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
            return "()* loopback of 142:28: ( OR exclusive_or_expression )*";
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
            return "()* loopback of 146:19: ( XOR and_expression )*";
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
            return "()* loopback of 150:25: ( AND equality_expression )*";
        }
    }
    static final String DFA34_eotS =
        "\15\uffff";
    static final String DFA34_eofS =
        "\1\1\14\uffff";
    static final String DFA34_minS =
        "\1\53\14\uffff";
    static final String DFA34_maxS =
        "\1\124\14\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\2\12\uffff\1\1";
    static final String DFA34_specialS =
        "\15\uffff}>";
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
            return "()* loopback of 154:27: ( ( EQ | NEQ ) relational_expression )*";
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
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA35_specialS =
        "\16\uffff}>";
    static final String[] DFA35_transitionS = {
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
            return "()* loopback of 158:22: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*";
        }
    }
    static final String DFA36_eotS =
        "\17\uffff";
    static final String DFA36_eofS =
        "\1\1\16\uffff";
    static final String DFA36_minS =
        "\1\53\16\uffff";
    static final String DFA36_maxS =
        "\1\124\16\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\2\14\uffff\1\1";
    static final String DFA36_specialS =
        "\17\uffff}>";
    static final String[] DFA36_transitionS = {
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
            return "()* loopback of 162:25: ( ( SHIFTL | SHIFTR ) additive_expression )*";
        }
    }
    static final String DFA37_eotS =
        "\20\uffff";
    static final String DFA37_eofS =
        "\1\1\17\uffff";
    static final String DFA37_minS =
        "\1\53\17\uffff";
    static final String DFA37_maxS =
        "\1\124\17\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA37_specialS =
        "\20\uffff}>";
    static final String[] DFA37_transitionS = {
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
            return "()* loopback of 166:31: ( ( PLUS | SUB ) multiplicative_expression )*";
        }
    }
    static final String DFA38_eotS =
        "\21\uffff";
    static final String DFA38_eofS =
        "\1\1\20\uffff";
    static final String DFA38_minS =
        "\1\53\20\uffff";
    static final String DFA38_maxS =
        "\1\124\20\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA38_specialS =
        "\21\uffff}>";
    static final String[] DFA38_transitionS = {
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
            return "()* loopback of 170:23: ( ( TIMES | DIV ) modulo_expression )*";
        }
    }
    static final String DFA39_eotS =
        "\22\uffff";
    static final String DFA39_eofS =
        "\1\1\21\uffff";
    static final String DFA39_minS =
        "\1\53\21\uffff";
    static final String DFA39_maxS =
        "\1\124\21\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\2\17\uffff\1\1";
    static final String DFA39_specialS =
        "\22\uffff}>";
    static final String[] DFA39_transitionS = {
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
            return "()* loopback of 174:22: ( MODULO unary_expression )*";
        }
    }
    static final String DFA42_eotS =
        "\56\uffff";
    static final String DFA42_eofS =
        "\1\uffff\1\2\1\uffff\1\2\52\uffff";
    static final String DFA42_minS =
        "\1\16\1\53\1\uffff\1\53\3\uffff\1\0\46\uffff";
    static final String DFA42_maxS =
        "\1\137\1\125\1\uffff\1\124\3\uffff\1\0\46\uffff";
    static final String DFA42_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\1\3\22\uffff\1\4\22\uffff\1\5\1\6";
    static final String DFA42_specialS =
        "\7\uffff\1\0\46\uffff}>";
    static final String[] DFA42_transitionS = {
            "\3\2\14\uffff\1\3\61\uffff\1\2\7\uffff\1\1\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2",
            "\2\2\1\5\2\uffff\10\2\2\uffff\25\2\1\7\1\2\2\uffff\1\31\1"+
            "\2\1\6",
            "",
            "\2\2\1\5\2\uffff\10\2\2\uffff\25\2\1\uffff\1\2\3\uffff\1\2",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "182:1: postfix_expression : ( primary_expression | ( IDENTIFIER | THIS ) DOT postfix_expression | IDENTIFIER NAMESPACE_ACCESS postfix_expression | IDENTIFIER ( LBRACK expression RBRACK )+ | IDENTIFIER LPAREN expression_list RPAREN | IDENTIFIER LPAREN RPAREN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_7 = input.LA(1);

                         
                        int index42_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_GalaxyXPreprocessorParser()) ) {s = 44;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index42_7);
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
            return "()+ loopback of 186:15: ( LBRACK expression RBRACK )+";
        }
    }
    static final String DFA45_eotS =
        "\104\uffff";
    static final String DFA45_eofS =
        "\104\uffff";
    static final String DFA45_minS =
        "\1\4\1\53\1\16\2\53\1\16\10\uffff\16\0\1\uffff\1\0\1\uffff\21\0"+
        "\2\uffff\13\0\2\uffff\5\0";
    static final String DFA45_maxS =
        "\1\137\1\125\1\137\2\116\1\137\10\uffff\16\0\1\uffff\1\0\1\uffff"+
        "\21\0\2\uffff\13\0\2\uffff\5\0";
    static final String DFA45_acceptS =
        "\6\uffff\1\2\1\3\1\4\1\5\1\6\1\7\20\uffff\1\1\47\uffff";
    static final String DFA45_specialS =
        "\16\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\uffff\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff\1\40"+
        "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\2\uffff\1\53"+
        "\1\54\1\55\1\56\1\57}>";
    static final String[] DFA45_transitionS = {
            "\1\7\2\uffff\1\10\1\12\1\uffff\1\11\3\13\3\4\12\uffff\2\5\1"+
            "\3\15\uffff\1\6\4\uffff\2\5\6\uffff\2\5\25\uffff\1\2\7\uffff"+
            "\1\1\1\uffff\2\4\2\uffff\1\4\1\uffff\1\4",
            "\1\6\1\uffff\1\16\2\uffff\2\23\2\22\1\21\1\27\1\31\1\30\2"+
            "\uffff\1\33\1\32\2\26\4\25\2\24\13\34\1\20\3\uffff\1\35\1\uffff"+
            "\1\17",
            "\3\42\12\uffff\2\43\1\41\22\uffff\2\43\6\uffff\2\43\25\uffff"+
            "\1\40\7\uffff\1\37\1\uffff\2\42\2\uffff\1\42\1\uffff\1\42",
            "\1\6\1\uffff\1\44\2\uffff\2\47\2\46\1\45\1\53\1\55\1\54\2"+
            "\uffff\1\57\1\56\2\52\4\51\2\50\13\34",
            "\1\6\4\uffff\2\64\2\63\1\62\1\70\1\72\1\71\2\uffff\1\74\1"+
            "\73\2\67\4\66\2\65\13\34",
            "\3\102\12\uffff\2\103\1\101\22\uffff\2\103\6\uffff\2\103\25"+
            "\uffff\1\100\7\uffff\1\77\1\uffff\2\102\2\uffff\1\102\1\uffff"+
            "\1\102",
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
            "",
            "",
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
            return "221:1: statement : ( assignment_statement | expression_statement | if_statement | while_statement | do_while_statement | for_statement | jump_statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_14 = input.LA(1);

                         
                        int index45_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_15 = input.LA(1);

                         
                        int index45_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_16 = input.LA(1);

                         
                        int index45_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_17 = input.LA(1);

                         
                        int index45_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_18 = input.LA(1);

                         
                        int index45_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_18);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_19 = input.LA(1);

                         
                        int index45_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_19);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_20 = input.LA(1);

                         
                        int index45_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_21 = input.LA(1);

                         
                        int index45_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_21);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA45_22 = input.LA(1);

                         
                        int index45_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_22);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA45_23 = input.LA(1);

                         
                        int index45_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_23);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA45_24 = input.LA(1);

                         
                        int index45_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_24);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA45_25 = input.LA(1);

                         
                        int index45_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_25);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA45_26 = input.LA(1);

                         
                        int index45_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_26);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA45_27 = input.LA(1);

                         
                        int index45_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_27);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA45_29 = input.LA(1);

                         
                        int index45_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_29);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA45_31 = input.LA(1);

                         
                        int index45_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_31);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA45_32 = input.LA(1);

                         
                        int index45_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_32);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA45_33 = input.LA(1);

                         
                        int index45_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_33);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA45_34 = input.LA(1);

                         
                        int index45_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_34);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA45_35 = input.LA(1);

                         
                        int index45_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_35);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA45_36 = input.LA(1);

                         
                        int index45_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_36);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA45_37 = input.LA(1);

                         
                        int index45_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_37);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA45_38 = input.LA(1);

                         
                        int index45_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_38);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA45_39 = input.LA(1);

                         
                        int index45_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_39);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA45_40 = input.LA(1);

                         
                        int index45_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_40);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA45_41 = input.LA(1);

                         
                        int index45_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_41);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA45_42 = input.LA(1);

                         
                        int index45_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_42);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA45_43 = input.LA(1);

                         
                        int index45_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_43);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA45_44 = input.LA(1);

                         
                        int index45_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_44);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA45_45 = input.LA(1);

                         
                        int index45_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_45);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA45_46 = input.LA(1);

                         
                        int index45_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_46);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA45_47 = input.LA(1);

                         
                        int index45_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_47);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA45_50 = input.LA(1);

                         
                        int index45_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_50);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA45_51 = input.LA(1);

                         
                        int index45_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_51);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA45_52 = input.LA(1);

                         
                        int index45_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_52);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA45_53 = input.LA(1);

                         
                        int index45_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_53);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA45_54 = input.LA(1);

                         
                        int index45_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_54);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA45_55 = input.LA(1);

                         
                        int index45_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_55);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA45_56 = input.LA(1);

                         
                        int index45_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_56);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA45_57 = input.LA(1);

                         
                        int index45_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_57);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA45_58 = input.LA(1);

                         
                        int index45_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_58);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA45_59 = input.LA(1);

                         
                        int index45_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_59);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA45_60 = input.LA(1);

                         
                        int index45_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_60);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA45_63 = input.LA(1);

                         
                        int index45_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_63);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA45_64 = input.LA(1);

                         
                        int index45_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_64);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA45_65 = input.LA(1);

                         
                        int index45_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_65);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA45_66 = input.LA(1);

                         
                        int index45_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_66);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA45_67 = input.LA(1);

                         
                        int index45_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_GalaxyXPreprocessorParser()) ) {s = 28;}

                        else if ( (synpred97_GalaxyXPreprocessorParser()) ) {s = 6;}

                         
                        input.seek(index45_67);
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
    static final String DFA47_eotS =
        "\21\uffff";
    static final String DFA47_eofS =
        "\21\uffff";
    static final String DFA47_minS =
        "\1\4\20\uffff";
    static final String DFA47_maxS =
        "\1\137\20\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\14\uffff";
    static final String DFA47_specialS =
        "\21\uffff}>";
    static final String[] DFA47_transitionS = {
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
            return "()* loopback of 242:4: ( statement )*";
        }
    }
    static final String DFA48_eotS =
        "\21\uffff";
    static final String DFA48_eofS =
        "\21\uffff";
    static final String DFA48_minS =
        "\1\4\20\uffff";
    static final String DFA48_maxS =
        "\1\137\20\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\14\uffff";
    static final String DFA48_specialS =
        "\21\uffff}>";
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
            return "()* loopback of 244:4: ( statement )*";
        }
    }
    static final String DFA50_eotS =
        "\17\uffff";
    static final String DFA50_eofS =
        "\17\uffff";
    static final String DFA50_minS =
        "\1\4\16\uffff";
    static final String DFA50_maxS =
        "\1\137\16\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\2\1\1\14\uffff";
    static final String DFA50_specialS =
        "\17\uffff}>";
    static final String[] DFA50_transitionS = {
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
            return "()* loopback of 246:4: ( statement )*";
        }
    }
    static final String DFA52_eotS =
        "\17\uffff";
    static final String DFA52_eofS =
        "\17\uffff";
    static final String DFA52_minS =
        "\1\4\16\uffff";
    static final String DFA52_maxS =
        "\1\137\16\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\2\1\1\14\uffff";
    static final String DFA52_specialS =
        "\17\uffff}>";
    static final String[] DFA52_transitionS = {
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
            return "()* loopback of 252:4: ( statement )*";
        }
    }
    static final String DFA56_eotS =
        "\17\uffff";
    static final String DFA56_eofS =
        "\17\uffff";
    static final String DFA56_minS =
        "\1\4\16\uffff";
    static final String DFA56_maxS =
        "\1\137\16\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\2\1\1\14\uffff";
    static final String DFA56_specialS =
        "\17\uffff}>";
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
            return "()* loopback of 258:4: ( statement )*";
        }
    }
    static final String DFA57_eotS =
        "\20\uffff";
    static final String DFA57_eofS =
        "\20\uffff";
    static final String DFA57_minS =
        "\1\4\1\117\14\uffff\1\0\1\uffff";
    static final String DFA57_maxS =
        "\1\137\1\117\14\uffff\1\0\1\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\1\14\uffff\1\2";
    static final String DFA57_specialS =
        "\16\uffff\1\0\1\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\2\uffff\1\1\1\2\1\uffff\7\2\12\uffff\3\2\15\uffff\1\2"+
            "\4\uffff\2\2\6\uffff\2\2\25\uffff\1\2\7\uffff\1\2\1\uffff\2"+
            "\2\2\uffff\1\2\1\uffff\1\2",
            "\1\16",
            "",
            "",
            "",
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
            return "()* loopback of 264:4: ( statement )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_14 = input.LA(1);

                         
                        int index57_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_GalaxyXPreprocessorParser()) ) {s = 2;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_14);
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
        "\12\uffff";
    static final String DFA58_eofS =
        "\12\uffff";
    static final String DFA58_minS =
        "\1\13\2\uffff\1\16\6\uffff";
    static final String DFA58_maxS =
        "\1\15\2\uffff\1\137\6\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\4\uffff";
    static final String DFA58_specialS =
        "\12\uffff}>";
    static final String[] DFA58_transitionS = {
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
            return "269:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );";
        }
    }
 

    public static final BitSet FOLLOW_preprocessor_in_parse96 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_namespace_decl_in_parse100 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_EOF_in_parse104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace_decl117 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_namespace_decl119 = new BitSet(new long[]{0x0000043D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_class_decl_in_namespace_decl125 = new BitSet(new long[]{0x0000043D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_function_decl_in_namespace_decl129 = new BitSet(new long[]{0x0000043D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_field_decl_in_namespace_decl133 = new BitSet(new long[]{0x0000043D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_initializer_in_namespace_decl137 = new BitSet(new long[]{0x0000043D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_preprocessor_in_namespace_decl141 = new BitSet(new long[]{0x0000043D00840200L,0x0000000000800000L});
    public static final BitSet FOLLOW_END_in_namespace_decl147 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace_decl149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_class_decl161 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl166 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_EXTENDS_in_class_decl169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl171 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_class_decl175 = new BitSet(new long[]{0x0000043C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_field_decl_in_class_decl181 = new BitSet(new long[]{0x0000043C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_function_decl_in_class_decl185 = new BitSet(new long[]{0x0000043C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_constructor_decl_in_class_decl189 = new BitSet(new long[]{0x0000043C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_destructor_decl_in_class_decl193 = new BitSet(new long[]{0x0000043C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_preprocessor_in_class_decl197 = new BitSet(new long[]{0x0000043C001C0200L,0x0000000000800000L});
    public static final BitSet FOLLOW_END_in_class_decl203 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_constructor_decl220 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_constructor_decl222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_constructor_decl225 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_constructor_decl227 = new BitSet(new long[]{0x03030C3C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_constructor_decl233 = new BitSet(new long[]{0x03030C3C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_preprocessor_in_constructor_decl237 = new BitSet(new long[]{0x03030C3C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_constructor_decl245 = new BitSet(new long[]{0x03030C003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_preprocessor_in_constructor_decl249 = new BitSet(new long[]{0x03030C003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_constructor_decl255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constructor_decl257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_destructor_decl271 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_destructor_decl273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_destructor_decl276 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_destructor_decl278 = new BitSet(new long[]{0x03030C3C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_destructor_decl284 = new BitSet(new long[]{0x03030C3C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_preprocessor_in_destructor_decl288 = new BitSet(new long[]{0x03030C3C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_destructor_decl296 = new BitSet(new long[]{0x03030C003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_preprocessor_in_destructor_decl300 = new BitSet(new long[]{0x03030C003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_destructor_decl306 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destructor_decl308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_function_decl320 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_STATIC_in_function_decl323 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_decl328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_function_decl330 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000810000L});
    public static final BitSet FOLLOW_parameter_list_in_function_decl332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_function_decl335 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RETURNS_in_function_decl337 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_function_decl339 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_function_decl341 = new BitSet(new long[]{0x03030C3C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_function_decl347 = new BitSet(new long[]{0x03030C3C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_preprocessor_in_function_decl351 = new BitSet(new long[]{0x03030C3C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_function_decl359 = new BitSet(new long[]{0x03030C003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_preprocessor_in_function_decl363 = new BitSet(new long[]{0x03030C003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_function_decl369 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FUNC_in_function_decl371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameter_list383 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_COMMA_in_parameter_list386 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parameter_in_parameter_list388 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_type_in_parameter402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_local_var_decl416 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_local_var_decl419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_array_in_local_var_decl421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var_decl424 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSGN_in_local_var_decl427 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_local_var_decl429 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_local_var_decl433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_field_decl445 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STATIC_in_field_decl448 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CONST_in_field_decl451 = new BitSet(new long[]{0x0000003C00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_type_in_field_decl454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_array_in_field_decl456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000880000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl459 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ASSGN_in_field_decl462 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_field_decl464 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_field_decl468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer480 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_initializer482 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_local_var_decl_in_initializer487 = new BitSet(new long[]{0x0303083C3801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_initializer493 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_initializer498 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACK_in_array513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_type527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_assignment_expression562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007FF0L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression564 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_assignment_expression566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression650 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_LOR_in_logical_or_expression653 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression656 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression669 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_LAND_in_logical_and_expression672 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_or_expression_in_logical_and_expression675 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression689 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OR_in_or_expression692 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_or_expression695 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression709 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_XOR_in_exclusive_or_expression712 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression715 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression730 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_AND_in_and_expression733 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression736 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression751 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_set_in_equality_expression754 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression761 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression775 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_relational_expression778 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression789 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression803 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_shift_expression806 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression813 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression828 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_set_in_additive_expression831 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression840 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression854 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression857 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression866 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression881 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_MODULO_in_modulo_expression884 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression887 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression908 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_postfix_expression927 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression935 = new BitSet(new long[]{0x000000002001C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_postfix_expression944 = new BitSet(new long[]{0x000000002001C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACK_in_postfix_expression954 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix_expression958 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression967 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_list_in_postfix_expression969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list991 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_COMMA_in_expression_list994 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_expression_list997 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary_expression1015 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_primary_expression1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_primary_expression1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_statement1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_while_statement_in_statement1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_statement1196 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_assignment_statement1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement1217 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1234 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_if_statement1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1238 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1240 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1245 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_ELIF_in_if_statement1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_if_statement1253 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_if_statement1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_if_statement1257 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1259 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1264 = new BitSet(new long[]{0x030308003801FFF0L,0x00000000A6808000L});
    public static final BitSet FOLLOW_ELSE_in_if_statement1272 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1274 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_if_statement1280 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_if_statement1287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IF_in_if_statement1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_while_statement1303 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_while_statement1305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_while_statement1307 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_while_statement1309 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_while_statement1314 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_while_statement1319 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement1333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_for_statement1335 = new BitSet(new long[]{0x030308003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_assignment_expression_in_for_statement1337 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1340 = new BitSet(new long[]{0x030308003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_for_statement1342 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1345 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6818000L});
    public static final BitSet FOLLOW_expression_in_for_statement1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_for_statement1350 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_for_statement1352 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_for_statement1357 = new BitSet(new long[]{0x030308003801FF90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_END_in_for_statement1362 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FOR_in_for_statement1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1376 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_COLON_in_do_while_statement1378 = new BitSet(new long[]{0x030308003801FD90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_statement_in_do_while_statement1383 = new BitSet(new long[]{0x030308003801FD90L,0x00000000A6808000L});
    public static final BitSet FOLLOW_WHILE_in_do_while_statement1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_do_while_statement1391 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_do_while_statement1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_do_while_statement1395 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_do_while_statement1400 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_do_while_statement1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement1414 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement1421 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1428 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1435 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_in_jump_statement1437 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIX_in_preprocessor1452 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_include_in_preprocessor1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_define_in_preprocessor1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undef_in_preprocessor1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_include1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_define1501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_define1505 = new BitSet(new long[]{0x0002000000000000L,0x00000000A4000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_define1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_define1517 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_INTEGER_in_define1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_define1529 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_FIXED_LITERAL_in_define1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_undef1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_undef1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_decl_in_synpred4_GalaxyXPreprocessorParser129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_decl_in_synpred5_GalaxyXPreprocessorParser133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_decl_in_synpred10_GalaxyXPreprocessorParser181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_decl_in_synpred11_GalaxyXPreprocessorParser185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred16_GalaxyXPreprocessorParser233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preprocessor_in_synpred17_GalaxyXPreprocessorParser237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred21_GalaxyXPreprocessorParser284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preprocessor_in_synpred22_GalaxyXPreprocessorParser288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred28_GalaxyXPreprocessorParser347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preprocessor_in_synpred29_GalaxyXPreprocessorParser351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred41_GalaxyXPreprocessorParser487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred80_GalaxyXPreprocessorParser965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred80_GalaxyXPreprocessorParser967 = new BitSet(new long[]{0x030300003801C000L,0x00000000A6808000L});
    public static final BitSet FOLLOW_expression_list_in_synpred80_GalaxyXPreprocessorParser969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred80_GalaxyXPreprocessorParser971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_synpred96_GalaxyXPreprocessorParser1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_synpred97_GalaxyXPreprocessorParser1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred113_GalaxyXPreprocessorParser1383 = new BitSet(new long[]{0x0000000000000002L});

}