// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g 2013-02-28 12:10:05

	package com.galaxyx.galaxyxparser;
	import com.galaxyx.galaxyxparser.typechecking.*;
	import com.galaxyx.galaxyxparser.typechecking.Error;
	import com.galaxyx.galaxyxparser.structures.*;
	import com.galaxyx.galaxyxparser.structures.Class;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/**********************************************
 * GalaxyX Grammar
 * Copyright (c) Timo Hanisch 2011
 * timohanisch@gmx.de
 *
 * Namespaces/Classes/Methods/Global Vars get
 * registered here!
 **********************************************/
public class GalaxyXParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "STATIC", "TYPEDEF", "IDENTIFIER", "SEMI", "NAMESPACE", "COLON", "END", "INLINE", "FUNC", "LPAREN", "RPAREN", "RETURNS", "COMMA", "CLASS", "LBRACK", "INTEGER", "RBRACK", "EXTENDS", "CONSTRUCTOR", "DESTRUCTOR", "PUBLIC", "PRIVATE", "CONST", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "BOOLEAN", "BYTE", "CHAR", "FIXED", "GAMELINK", "COLOR", "INT", "POINT", "STRING", "ABILCMD", "ACTOR", "ACTORSCOPE", "BANK", "CAMERAINFO", "MARKER", "ORDER", "PLAYERGROUP", "REGION", "REVEALER", "SOUNDLINK", "TEXT", "TIMER", "TRANSMISSIONSOURCE", "TRIGGER", "UNITFILTER", "UNITGROUP", "UNITREF", "UNIT", "WAVEINFO", "WAVETARGET", "DOODAD", "AIFILTER", "SOUND", "WAVE", "VOID", "PLUS", "SUB", "TIMES", "DIV", "DOT", "NOT", "NEW", "DELETE", "NAMEOF", "NATIVE", "CHARACTER_LITERAL", "STRING_LITERAL", "FIXED_LITERAL", "TRUE", "FALSE", "NULL", "THIS", "LOR", "LAND", "OR", "XOR", "AND", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "SHIFTL", "SHIFTR", "IF", "ELIF", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "RETURN", "STRUCT", "INTERFACE", "IMPLEMENTS", "SUPER", "INITIALIZER", "DEFINE", "TILDE", "INC", "DEC", "LBRACE", "RBRACE", "PREFIX", "LETTER", "EscapeSequence", "DIGIT", "HEX_LITERAL", "HexDigit", "Exponent", "FloatTypeSuffix", "OctalEscape", "UnicodeEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT"
    };
    public static final int EOF=-1;
    public static final int NEGATION=4;
    public static final int STATIC=5;
    public static final int TYPEDEF=6;
    public static final int IDENTIFIER=7;
    public static final int SEMI=8;
    public static final int NAMESPACE=9;
    public static final int COLON=10;
    public static final int END=11;
    public static final int INLINE=12;
    public static final int FUNC=13;
    public static final int LPAREN=14;
    public static final int RPAREN=15;
    public static final int RETURNS=16;
    public static final int COMMA=17;
    public static final int CLASS=18;
    public static final int LBRACK=19;
    public static final int INTEGER=20;
    public static final int RBRACK=21;
    public static final int EXTENDS=22;
    public static final int CONSTRUCTOR=23;
    public static final int DESTRUCTOR=24;
    public static final int PUBLIC=25;
    public static final int PRIVATE=26;
    public static final int CONST=27;
    public static final int ASSGN=28;
    public static final int ASSGNP=29;
    public static final int ASSGNS=30;
    public static final int ASSGNT=31;
    public static final int ASSGND=32;
    public static final int BOOLEAN=33;
    public static final int BYTE=34;
    public static final int CHAR=35;
    public static final int FIXED=36;
    public static final int GAMELINK=37;
    public static final int COLOR=38;
    public static final int INT=39;
    public static final int POINT=40;
    public static final int STRING=41;
    public static final int ABILCMD=42;
    public static final int ACTOR=43;
    public static final int ACTORSCOPE=44;
    public static final int BANK=45;
    public static final int CAMERAINFO=46;
    public static final int MARKER=47;
    public static final int ORDER=48;
    public static final int PLAYERGROUP=49;
    public static final int REGION=50;
    public static final int REVEALER=51;
    public static final int SOUNDLINK=52;
    public static final int TEXT=53;
    public static final int TIMER=54;
    public static final int TRANSMISSIONSOURCE=55;
    public static final int TRIGGER=56;
    public static final int UNITFILTER=57;
    public static final int UNITGROUP=58;
    public static final int UNITREF=59;
    public static final int UNIT=60;
    public static final int WAVEINFO=61;
    public static final int WAVETARGET=62;
    public static final int DOODAD=63;
    public static final int AIFILTER=64;
    public static final int SOUND=65;
    public static final int WAVE=66;
    public static final int VOID=67;
    public static final int PLUS=68;
    public static final int SUB=69;
    public static final int TIMES=70;
    public static final int DIV=71;
    public static final int DOT=72;
    public static final int NOT=73;
    public static final int NEW=74;
    public static final int DELETE=75;
    public static final int NAMEOF=76;
    public static final int NATIVE=77;
    public static final int CHARACTER_LITERAL=78;
    public static final int STRING_LITERAL=79;
    public static final int FIXED_LITERAL=80;
    public static final int TRUE=81;
    public static final int FALSE=82;
    public static final int NULL=83;
    public static final int THIS=84;
    public static final int LOR=85;
    public static final int LAND=86;
    public static final int OR=87;
    public static final int XOR=88;
    public static final int AND=89;
    public static final int EQ=90;
    public static final int NEQ=91;
    public static final int LT=92;
    public static final int GT=93;
    public static final int LTEQ=94;
    public static final int GTEQ=95;
    public static final int SHIFTL=96;
    public static final int SHIFTR=97;
    public static final int IF=98;
    public static final int ELIF=99;
    public static final int ELSE=100;
    public static final int WHILE=101;
    public static final int FOR=102;
    public static final int BREAK=103;
    public static final int CONTINUE=104;
    public static final int RETURN=105;
    public static final int STRUCT=106;
    public static final int INTERFACE=107;
    public static final int IMPLEMENTS=108;
    public static final int SUPER=109;
    public static final int INITIALIZER=110;
    public static final int DEFINE=111;
    public static final int TILDE=112;
    public static final int INC=113;
    public static final int DEC=114;
    public static final int LBRACE=115;
    public static final int RBRACE=116;
    public static final int PREFIX=117;
    public static final int LETTER=118;
    public static final int EscapeSequence=119;
    public static final int DIGIT=120;
    public static final int HEX_LITERAL=121;
    public static final int HexDigit=122;
    public static final int Exponent=123;
    public static final int FloatTypeSuffix=124;
    public static final int OctalEscape=125;
    public static final int UnicodeEscape=126;
    public static final int WS=127;
    public static final int LINE_COMMENT=128;
    public static final int MULTI_COMMENT=129;

    // delegates
    // delegators


        public GalaxyXParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[174+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GalaxyXParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g"; }


    	private Namespace namespace = null;
    	private Class cl = null;
    	private Method method = null;
    	private Constructor constr = null;
    	private Destructor destr = null;


    public static class translation_unit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "translation_unit"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:42:1: translation_unit : ( namespace )* ;
    public final GalaxyXParser.translation_unit_return translation_unit() throws RecognitionException {
        GalaxyXParser.translation_unit_return retval = new GalaxyXParser.translation_unit_return();
        retval.start = input.LT(1);
        int translation_unit_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.namespace_return namespace1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:43:2: ( ( namespace )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:43:4: ( namespace )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:43:4: ( namespace )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: namespace
            	    {
            	    pushFollow(FOLLOW_namespace_in_translation_unit95);
            	    namespace1=namespace();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace1.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 1, translation_unit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "translation_unit"

    public static class typedef_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedef_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:46:1: typedef_decl : ( modifier )? ( STATIC )? TYPEDEF type IDENTIFIER SEMI ;
    public final GalaxyXParser.typedef_decl_return typedef_decl() throws RecognitionException {
        GalaxyXParser.typedef_decl_return retval = new GalaxyXParser.typedef_decl_return();
        retval.start = input.LT(1);
        int typedef_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token STATIC3=null;
        Token TYPEDEF4=null;
        Token IDENTIFIER6=null;
        Token SEMI7=null;
        GalaxyXParser.modifier_return modifier2 = null;

        GalaxyXParser.type_return type5 = null;


        CommonTree STATIC3_tree=null;
        CommonTree TYPEDEF4_tree=null;
        CommonTree IDENTIFIER6_tree=null;
        CommonTree SEMI7_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:47:2: ( ( modifier )? ( STATIC )? TYPEDEF type IDENTIFIER SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:47:4: ( modifier )? ( STATIC )? TYPEDEF type IDENTIFIER SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:47:4: ( modifier )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=PUBLIC && LA2_0<=PRIVATE)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_typedef_decl107);
                    modifier2=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier2.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:47:14: ( STATIC )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==STATIC) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: STATIC
                    {
                    STATIC3=(Token)match(input,STATIC,FOLLOW_STATIC_in_typedef_decl110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC3_tree = (CommonTree)adaptor.create(STATIC3);
                    adaptor.addChild(root_0, STATIC3_tree);
                    }

                    }
                    break;

            }

            TYPEDEF4=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedef_decl113); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF4_tree = (CommonTree)adaptor.create(TYPEDEF4);
            root_0 = (CommonTree)adaptor.becomeRoot(TYPEDEF4_tree, root_0);
            }
            pushFollow(FOLLOW_type_in_typedef_decl116);
            type5=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type5.getTree());
            IDENTIFIER6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedef_decl118); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER6_tree = (CommonTree)adaptor.create(IDENTIFIER6);
            adaptor.addChild(root_0, IDENTIFIER6_tree);
            }
            SEMI7=(Token)match(input,SEMI,FOLLOW_SEMI_in_typedef_decl120); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 2, typedef_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typedef_decl"

    public static class namespace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:50:1: namespace : NAMESPACE i1= IDENTIFIER COLON ( function | class_decl | field_decl | typedef_decl )* END NAMESPACE ;
    public final GalaxyXParser.namespace_return namespace() throws RecognitionException {
        GalaxyXParser.namespace_return retval = new GalaxyXParser.namespace_return();
        retval.start = input.LT(1);
        int namespace_StartIndex = input.index();
        CommonTree root_0 = null;

        Token i1=null;
        Token NAMESPACE8=null;
        Token COLON9=null;
        Token END14=null;
        Token NAMESPACE15=null;
        GalaxyXParser.function_return function10 = null;

        GalaxyXParser.class_decl_return class_decl11 = null;

        GalaxyXParser.field_decl_return field_decl12 = null;

        GalaxyXParser.typedef_decl_return typedef_decl13 = null;


        CommonTree i1_tree=null;
        CommonTree NAMESPACE8_tree=null;
        CommonTree COLON9_tree=null;
        CommonTree END14_tree=null;
        CommonTree NAMESPACE15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:51:2: ( NAMESPACE i1= IDENTIFIER COLON ( function | class_decl | field_decl | typedef_decl )* END NAMESPACE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:51:4: NAMESPACE i1= IDENTIFIER COLON ( function | class_decl | field_decl | typedef_decl )* END NAMESPACE
            {
            root_0 = (CommonTree)adaptor.nil();

            NAMESPACE8=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAMESPACE8_tree = (CommonTree)adaptor.create(NAMESPACE8);
            root_0 = (CommonTree)adaptor.becomeRoot(NAMESPACE8_tree, root_0);
            }
            i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace140); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i1_tree = (CommonTree)adaptor.create(i1);
            adaptor.addChild(root_0, i1_tree);
            }
            COLON9=(Token)match(input,COLON,FOLLOW_COLON_in_namespace142); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		if(Main.table.namespaceExists(i1.getText())){
              			namespace = Main.table.getNamespace((i1!=null?i1.getText():null));
              		}else{
              			namespace = new Namespace((i1!=null?i1.getText():null));
              			Main.table.putNamespace((i1!=null?i1.getText():null),namespace);
              		}
              	
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:4: ( function | class_decl | field_decl | typedef_decl )*
            loop4:
            do {
                int alt4=5;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:5: function
            	    {
            	    pushFollow(FOLLOW_function_in_namespace153);
            	    function10=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function10.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:16: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace157);
            	    class_decl11=class_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_decl11.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:29: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace161);
            	    field_decl12=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_decl12.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:42: typedef_decl
            	    {
            	    pushFollow(FOLLOW_typedef_decl_in_namespace165);
            	    typedef_decl13=typedef_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_decl13.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            END14=(Token)match(input,END,FOLLOW_END_in_namespace172); if (state.failed) return retval;
            NAMESPACE15=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace175); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		namespace = null;
              	
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
            if ( state.backtracking>0 ) { memoize(input, 3, namespace_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namespace"

    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:67:1: function : ( modifier )? ( STATIC )? ( INLINE )? FUNC IDENTIFIER LPAREN ( argument_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC ;
    public final GalaxyXParser.function_return function() throws RecognitionException {
        GalaxyXParser.function_return retval = new GalaxyXParser.function_return();
        retval.start = input.LT(1);
        int function_StartIndex = input.index();
        CommonTree root_0 = null;

        Token STATIC17=null;
        Token INLINE18=null;
        Token FUNC19=null;
        Token IDENTIFIER20=null;
        Token LPAREN21=null;
        Token RPAREN23=null;
        Token RETURNS24=null;
        Token COLON26=null;
        Token END29=null;
        Token FUNC30=null;
        GalaxyXParser.modifier_return modifier16 = null;

        GalaxyXParser.argument_list_return argument_list22 = null;

        GalaxyXParser.type_return type25 = null;

        GalaxyXParser.local_var_decl_return local_var_decl27 = null;

        GalaxyXParser.statement_return statement28 = null;


        CommonTree STATIC17_tree=null;
        CommonTree INLINE18_tree=null;
        CommonTree FUNC19_tree=null;
        CommonTree IDENTIFIER20_tree=null;
        CommonTree LPAREN21_tree=null;
        CommonTree RPAREN23_tree=null;
        CommonTree RETURNS24_tree=null;
        CommonTree COLON26_tree=null;
        CommonTree END29_tree=null;
        CommonTree FUNC30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:2: ( ( modifier )? ( STATIC )? ( INLINE )? FUNC IDENTIFIER LPAREN ( argument_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:4: ( modifier )? ( STATIC )? ( INLINE )? FUNC IDENTIFIER LPAREN ( argument_list )? RPAREN RETURNS type COLON ( local_var_decl )* ( statement )* END FUNC
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:4: ( modifier )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=PUBLIC && LA5_0<=PRIVATE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_function191);
                    modifier16=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier16.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:14: ( STATIC )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==STATIC) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: STATIC
                    {
                    STATIC17=(Token)match(input,STATIC,FOLLOW_STATIC_in_function194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC17_tree = (CommonTree)adaptor.create(STATIC17);
                    adaptor.addChild(root_0, STATIC17_tree);
                    }

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:22: ( INLINE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==INLINE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: INLINE
                    {
                    INLINE18=(Token)match(input,INLINE,FOLLOW_INLINE_in_function197); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE18_tree = (CommonTree)adaptor.create(INLINE18);
                    adaptor.addChild(root_0, INLINE18_tree);
                    }

                    }
                    break;

            }

            FUNC19=(Token)match(input,FUNC,FOLLOW_FUNC_in_function200); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNC19_tree = (CommonTree)adaptor.create(FUNC19);
            root_0 = (CommonTree)adaptor.becomeRoot(FUNC19_tree, root_0);
            }
            IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function203); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER20_tree = (CommonTree)adaptor.create(IDENTIFIER20);
            adaptor.addChild(root_0, IDENTIFIER20_tree);
            }
            LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function205); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:55: ( argument_list )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENTIFIER||(LA8_0>=BOOLEAN && LA8_0<=VOID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: argument_list
                    {
                    pushFollow(FOLLOW_argument_list_in_function208);
                    argument_list22=argument_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_list22.getTree());

                    }
                    break;

            }

            RPAREN23=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function211); if (state.failed) return retval;
            RETURNS24=(Token)match(input,RETURNS,FOLLOW_RETURNS_in_function214); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_function217);
            type25=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type25.getTree());
            COLON26=(Token)match(input,COLON,FOLLOW_COLON_in_function219); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:69:4: ( local_var_decl )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_function225);
            	    local_var_decl27=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local_var_decl27.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:70:4: ( statement )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function231);
            	    statement28=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement28.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            END29=(Token)match(input,END,FOLLOW_END_in_function237); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END29_tree = (CommonTree)adaptor.create(END29);
            adaptor.addChild(root_0, END29_tree);
            }
            FUNC30=(Token)match(input,FUNC,FOLLOW_FUNC_in_function239); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNC30_tree = (CommonTree)adaptor.create(FUNC30);
            adaptor.addChild(root_0, FUNC30_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 4, function_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class argument_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:74:1: argument_list : type IDENTIFIER ( COMMA type IDENTIFIER )* ;
    public final GalaxyXParser.argument_list_return argument_list() throws RecognitionException {
        GalaxyXParser.argument_list_return retval = new GalaxyXParser.argument_list_return();
        retval.start = input.LT(1);
        int argument_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER32=null;
        Token COMMA33=null;
        Token IDENTIFIER35=null;
        GalaxyXParser.type_return type31 = null;

        GalaxyXParser.type_return type34 = null;


        CommonTree IDENTIFIER32_tree=null;
        CommonTree COMMA33_tree=null;
        CommonTree IDENTIFIER35_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:75:2: ( type IDENTIFIER ( COMMA type IDENTIFIER )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:75:4: type IDENTIFIER ( COMMA type IDENTIFIER )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_type_in_argument_list251);
            type31=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(type31.getTree(), root_0);
            IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argument_list254); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER32_tree = (CommonTree)adaptor.create(IDENTIFIER32);
            adaptor.addChild(root_0, IDENTIFIER32_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:75:21: ( COMMA type IDENTIFIER )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:75:22: COMMA type IDENTIFIER
            	    {
            	    COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_list257); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA33_tree = (CommonTree)adaptor.create(COMMA33);
            	    adaptor.addChild(root_0, COMMA33_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_argument_list259);
            	    type34=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type34.getTree());
            	    IDENTIFIER35=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argument_list261); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    IDENTIFIER35_tree = (CommonTree)adaptor.create(IDENTIFIER35);
            	    adaptor.addChild(root_0, IDENTIFIER35_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
            if ( state.backtracking>0 ) { memoize(input, 5, argument_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "argument_list"

    public static class class_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:78:1: class_decl : (m= modifier )? CLASS c= IDENTIFIER ( LBRACK i= INTEGER RBRACK )? ( EXTENDS IDENTIFIER )? COLON ( function | field_decl | typedef_decl | constr_decl | destr_decl )* END CLASS ;
    public final GalaxyXParser.class_decl_return class_decl() throws RecognitionException {
        GalaxyXParser.class_decl_return retval = new GalaxyXParser.class_decl_return();
        retval.start = input.LT(1);
        int class_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token c=null;
        Token i=null;
        Token CLASS36=null;
        Token LBRACK37=null;
        Token RBRACK38=null;
        Token EXTENDS39=null;
        Token IDENTIFIER40=null;
        Token COLON41=null;
        Token END47=null;
        Token CLASS48=null;
        GalaxyXParser.modifier_return m = null;

        GalaxyXParser.function_return function42 = null;

        GalaxyXParser.field_decl_return field_decl43 = null;

        GalaxyXParser.typedef_decl_return typedef_decl44 = null;

        GalaxyXParser.constr_decl_return constr_decl45 = null;

        GalaxyXParser.destr_decl_return destr_decl46 = null;


        CommonTree c_tree=null;
        CommonTree i_tree=null;
        CommonTree CLASS36_tree=null;
        CommonTree LBRACK37_tree=null;
        CommonTree RBRACK38_tree=null;
        CommonTree EXTENDS39_tree=null;
        CommonTree IDENTIFIER40_tree=null;
        CommonTree COLON41_tree=null;
        CommonTree END47_tree=null;
        CommonTree CLASS48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:79:2: ( (m= modifier )? CLASS c= IDENTIFIER ( LBRACK i= INTEGER RBRACK )? ( EXTENDS IDENTIFIER )? COLON ( function | field_decl | typedef_decl | constr_decl | destr_decl )* END CLASS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:79:4: (m= modifier )? CLASS c= IDENTIFIER ( LBRACK i= INTEGER RBRACK )? ( EXTENDS IDENTIFIER )? COLON ( function | field_decl | typedef_decl | constr_decl | destr_decl )* END CLASS
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:79:5: (m= modifier )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=PUBLIC && LA12_0<=PRIVATE)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: m= modifier
                    {
                    pushFollow(FOLLOW_modifier_in_class_decl277);
                    m=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());

                    }
                    break;

            }

            CLASS36=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl280); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS36_tree = (CommonTree)adaptor.create(CLASS36);
            root_0 = (CommonTree)adaptor.becomeRoot(CLASS36_tree, root_0);
            }
            c=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl285); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            c_tree = (CommonTree)adaptor.create(c);
            adaptor.addChild(root_0, c_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:79:36: ( LBRACK i= INTEGER RBRACK )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:79:37: LBRACK i= INTEGER RBRACK
                    {
                    LBRACK37=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_class_decl288); if (state.failed) return retval;
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_class_decl293); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    i_tree = (CommonTree)adaptor.create(i);
                    adaptor.addChild(root_0, i_tree);
                    }
                    RBRACK38=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_class_decl295); if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:79:65: ( EXTENDS IDENTIFIER )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EXTENDS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:79:66: EXTENDS IDENTIFIER
                    {
                    EXTENDS39=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_class_decl301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS39_tree = (CommonTree)adaptor.create(EXTENDS39);
                    adaptor.addChild(root_0, EXTENDS39_tree);
                    }
                    IDENTIFIER40=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER40_tree = (CommonTree)adaptor.create(IDENTIFIER40);
                    adaptor.addChild(root_0, IDENTIFIER40_tree);
                    }

                    }
                    break;

            }

            COLON41=(Token)match(input,COLON,FOLLOW_COLON_in_class_decl307); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		if(namespace.isClassInNamespace((c!=null?c.getText():null))){
              			Error.printError((c!=null?c.getLine():0),c.getCharPositionInLine() ,"Class is allready defined within namespace.");
              		}else{
              			boolean pub = m == null? false : (m!=null?input.toString(m.start,m.stop):null).equals("public");
              			boolean pri = m == null? false : (m!=null?input.toString(m.start,m.stop):null).equals("private");
              			cl = new Class((c!=null?c.getText():null),pub,pri,Integer.parseInt((i!=null?i.getText():null)),namespace);
              		}
              	
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:4: ( function | field_decl | typedef_decl | constr_decl | destr_decl )*
            loop15:
            do {
                int alt15=6;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:5: function
            	    {
            	    pushFollow(FOLLOW_function_in_class_decl317);
            	    function42=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function42.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:16: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl321);
            	    field_decl43=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_decl43.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:29: typedef_decl
            	    {
            	    pushFollow(FOLLOW_typedef_decl_in_class_decl325);
            	    typedef_decl44=typedef_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_decl44.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:44: constr_decl
            	    {
            	    pushFollow(FOLLOW_constr_decl_in_class_decl329);
            	    constr_decl45=constr_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, constr_decl45.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:58: destr_decl
            	    {
            	    pushFollow(FOLLOW_destr_decl_in_class_decl333);
            	    destr_decl46=destr_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, destr_decl46.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            END47=(Token)match(input,END,FOLLOW_END_in_class_decl340); if (state.failed) return retval;
            CLASS48=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl343); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		cl = null;
              	
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
            if ( state.backtracking>0 ) { memoize(input, 6, class_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class constr_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constr_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:96:1: constr_decl : CONSTRUCTOR LPAREN ( argument_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR ;
    public final GalaxyXParser.constr_decl_return constr_decl() throws RecognitionException {
        GalaxyXParser.constr_decl_return retval = new GalaxyXParser.constr_decl_return();
        retval.start = input.LT(1);
        int constr_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token CONSTRUCTOR49=null;
        Token LPAREN50=null;
        Token RPAREN52=null;
        Token COLON53=null;
        Token END56=null;
        Token CONSTRUCTOR57=null;
        GalaxyXParser.argument_list_return argument_list51 = null;

        GalaxyXParser.local_var_decl_return local_var_decl54 = null;

        GalaxyXParser.statement_return statement55 = null;


        CommonTree CONSTRUCTOR49_tree=null;
        CommonTree LPAREN50_tree=null;
        CommonTree RPAREN52_tree=null;
        CommonTree COLON53_tree=null;
        CommonTree END56_tree=null;
        CommonTree CONSTRUCTOR57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:97:2: ( CONSTRUCTOR LPAREN ( argument_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:97:4: CONSTRUCTOR LPAREN ( argument_list )? RPAREN COLON ( local_var_decl )* ( statement )* END CONSTRUCTOR
            {
            root_0 = (CommonTree)adaptor.nil();

            CONSTRUCTOR49=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constr_decl359); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTRUCTOR49_tree = (CommonTree)adaptor.create(CONSTRUCTOR49);
            root_0 = (CommonTree)adaptor.becomeRoot(CONSTRUCTOR49_tree, root_0);
            }
            LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constr_decl362); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:97:25: ( argument_list )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER||(LA16_0>=BOOLEAN && LA16_0<=VOID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: argument_list
                    {
                    pushFollow(FOLLOW_argument_list_in_constr_decl365);
                    argument_list51=argument_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_list51.getTree());

                    }
                    break;

            }

            RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constr_decl368); if (state.failed) return retval;
            COLON53=(Token)match(input,COLON,FOLLOW_COLON_in_constr_decl371); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:4: ( local_var_decl )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_constr_decl377);
            	    local_var_decl54=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local_var_decl54.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:99:4: ( statement )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constr_decl383);
            	    statement55=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement55.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            END56=(Token)match(input,END,FOLLOW_END_in_constr_decl389); if (state.failed) return retval;
            CONSTRUCTOR57=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constr_decl392); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 7, constr_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constr_decl"

    public static class destr_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "destr_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:103:1: destr_decl : DESTRUCTOR LPAREN ( argument_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR ;
    public final GalaxyXParser.destr_decl_return destr_decl() throws RecognitionException {
        GalaxyXParser.destr_decl_return retval = new GalaxyXParser.destr_decl_return();
        retval.start = input.LT(1);
        int destr_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token DESTRUCTOR58=null;
        Token LPAREN59=null;
        Token RPAREN61=null;
        Token COLON62=null;
        Token END65=null;
        Token DESTRUCTOR66=null;
        GalaxyXParser.argument_list_return argument_list60 = null;

        GalaxyXParser.local_var_decl_return local_var_decl63 = null;

        GalaxyXParser.statement_return statement64 = null;


        CommonTree DESTRUCTOR58_tree=null;
        CommonTree LPAREN59_tree=null;
        CommonTree RPAREN61_tree=null;
        CommonTree COLON62_tree=null;
        CommonTree END65_tree=null;
        CommonTree DESTRUCTOR66_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:104:2: ( DESTRUCTOR LPAREN ( argument_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:104:4: DESTRUCTOR LPAREN ( argument_list )? RPAREN COLON ( local_var_decl )* ( statement )* END DESTRUCTOR
            {
            root_0 = (CommonTree)adaptor.nil();

            DESTRUCTOR58=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destr_decl404); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DESTRUCTOR58_tree = (CommonTree)adaptor.create(DESTRUCTOR58);
            root_0 = (CommonTree)adaptor.becomeRoot(DESTRUCTOR58_tree, root_0);
            }
            LPAREN59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_destr_decl407); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:104:24: ( argument_list )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER||(LA19_0>=BOOLEAN && LA19_0<=VOID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: argument_list
                    {
                    pushFollow(FOLLOW_argument_list_in_destr_decl410);
                    argument_list60=argument_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_list60.getTree());

                    }
                    break;

            }

            RPAREN61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_destr_decl413); if (state.failed) return retval;
            COLON62=(Token)match(input,COLON,FOLLOW_COLON_in_destr_decl416); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:105:4: ( local_var_decl )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_destr_decl422);
            	    local_var_decl63=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local_var_decl63.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:106:4: ( statement )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_destr_decl428);
            	    statement64=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement64.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            END65=(Token)match(input,END,FOLLOW_END_in_destr_decl434); if (state.failed) return retval;
            DESTRUCTOR66=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destr_decl437); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 8, destr_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "destr_decl"

    public static class modifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:110:1: modifier : ( PUBLIC | PRIVATE );
    public final GalaxyXParser.modifier_return modifier() throws RecognitionException {
        GalaxyXParser.modifier_return retval = new GalaxyXParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set67=null;

        CommonTree set67_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:111:2: ( PUBLIC | PRIVATE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set67=(Token)input.LT(1);
            if ( (input.LA(1)>=PUBLIC && input.LA(1)<=PRIVATE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set67));
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
            if ( state.backtracking>0 ) { memoize(input, 9, modifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class local_var_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "local_var_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:114:1: local_var_decl : type ( array_decl )? IDENTIFIER ( assgn_decl )? SEMI ;
    public final GalaxyXParser.local_var_decl_return local_var_decl() throws RecognitionException {
        GalaxyXParser.local_var_decl_return retval = new GalaxyXParser.local_var_decl_return();
        retval.start = input.LT(1);
        int local_var_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER70=null;
        Token SEMI72=null;
        GalaxyXParser.type_return type68 = null;

        GalaxyXParser.array_decl_return array_decl69 = null;

        GalaxyXParser.assgn_decl_return assgn_decl71 = null;


        CommonTree IDENTIFIER70_tree=null;
        CommonTree SEMI72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:115:2: ( type ( array_decl )? IDENTIFIER ( assgn_decl )? SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:115:4: type ( array_decl )? IDENTIFIER ( assgn_decl )? SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_type_in_local_var_decl465);
            type68=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(type68.getTree(), root_0);
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:115:10: ( array_decl )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LBRACK) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: array_decl
                    {
                    pushFollow(FOLLOW_array_decl_in_local_var_decl468);
                    array_decl69=array_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_decl69.getTree());

                    }
                    break;

            }

            IDENTIFIER70=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var_decl471); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER70_tree = (CommonTree)adaptor.create(IDENTIFIER70);
            adaptor.addChild(root_0, IDENTIFIER70_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:115:33: ( assgn_decl )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ASSGN && LA23_0<=ASSGND)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: assgn_decl
                    {
                    pushFollow(FOLLOW_assgn_decl_in_local_var_decl473);
                    assgn_decl71=assgn_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assgn_decl71.getTree());

                    }
                    break;

            }

            SEMI72=(Token)match(input,SEMI,FOLLOW_SEMI_in_local_var_decl476); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 10, local_var_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "local_var_decl"

    public static class field_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:118:1: field_decl : ( modifier )? ( STATIC )? ( CONST )? type ( array_decl )? IDENTIFIER ( assgn_decl )? SEMI ;
    public final GalaxyXParser.field_decl_return field_decl() throws RecognitionException {
        GalaxyXParser.field_decl_return retval = new GalaxyXParser.field_decl_return();
        retval.start = input.LT(1);
        int field_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token STATIC74=null;
        Token CONST75=null;
        Token IDENTIFIER78=null;
        Token SEMI80=null;
        GalaxyXParser.modifier_return modifier73 = null;

        GalaxyXParser.type_return type76 = null;

        GalaxyXParser.array_decl_return array_decl77 = null;

        GalaxyXParser.assgn_decl_return assgn_decl79 = null;


        CommonTree STATIC74_tree=null;
        CommonTree CONST75_tree=null;
        CommonTree IDENTIFIER78_tree=null;
        CommonTree SEMI80_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:119:2: ( ( modifier )? ( STATIC )? ( CONST )? type ( array_decl )? IDENTIFIER ( assgn_decl )? SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:119:4: ( modifier )? ( STATIC )? ( CONST )? type ( array_decl )? IDENTIFIER ( assgn_decl )? SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:119:4: ( modifier )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=PUBLIC && LA24_0<=PRIVATE)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_field_decl489);
                    modifier73=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier73.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:119:14: ( STATIC )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==STATIC) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: STATIC
                    {
                    STATIC74=(Token)match(input,STATIC,FOLLOW_STATIC_in_field_decl492); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC74_tree = (CommonTree)adaptor.create(STATIC74);
                    adaptor.addChild(root_0, STATIC74_tree);
                    }

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:119:22: ( CONST )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==CONST) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: CONST
                    {
                    CONST75=(Token)match(input,CONST,FOLLOW_CONST_in_field_decl495); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONST75_tree = (CommonTree)adaptor.create(CONST75);
                    adaptor.addChild(root_0, CONST75_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_field_decl498);
            type76=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(type76.getTree(), root_0);
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:119:35: ( array_decl )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LBRACK) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: array_decl
                    {
                    pushFollow(FOLLOW_array_decl_in_field_decl501);
                    array_decl77=array_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_decl77.getTree());

                    }
                    break;

            }

            IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl504); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER78_tree = (CommonTree)adaptor.create(IDENTIFIER78);
            adaptor.addChild(root_0, IDENTIFIER78_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:119:59: ( assgn_decl )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=ASSGN && LA28_0<=ASSGND)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: assgn_decl
                    {
                    pushFollow(FOLLOW_assgn_decl_in_field_decl507);
                    assgn_decl79=assgn_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assgn_decl79.getTree());

                    }
                    break;

            }

            SEMI80=(Token)match(input,SEMI,FOLLOW_SEMI_in_field_decl510); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 11, field_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field_decl"

    public static class array_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:122:1: array_decl : ( LBRACK expression RBRACK )+ ;
    public final GalaxyXParser.array_decl_return array_decl() throws RecognitionException {
        GalaxyXParser.array_decl_return retval = new GalaxyXParser.array_decl_return();
        retval.start = input.LT(1);
        int array_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LBRACK81=null;
        Token RBRACK83=null;
        GalaxyXParser.expression_return expression82 = null;


        CommonTree LBRACK81_tree=null;
        CommonTree RBRACK83_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:123:2: ( ( LBRACK expression RBRACK )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:123:4: ( LBRACK expression RBRACK )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:123:4: ( LBRACK expression RBRACK )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==LBRACK) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:123:5: LBRACK expression RBRACK
            	    {
            	    LBRACK81=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_decl524); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LBRACK81_tree = (CommonTree)adaptor.create(LBRACK81);
            	    adaptor.addChild(root_0, LBRACK81_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_array_decl526);
            	    expression82=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression82.getTree());
            	    RBRACK83=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_decl528); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RBRACK83_tree = (CommonTree)adaptor.create(RBRACK83);
            	    adaptor.addChild(root_0, RBRACK83_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
            if ( state.backtracking>0 ) { memoize(input, 12, array_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array_decl"

    public static class assgn_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assgn_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:126:1: assgn_decl : assignment_operator expression ;
    public final GalaxyXParser.assgn_decl_return assgn_decl() throws RecognitionException {
        GalaxyXParser.assgn_decl_return retval = new GalaxyXParser.assgn_decl_return();
        retval.start = input.LT(1);
        int assgn_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.assignment_operator_return assignment_operator84 = null;

        GalaxyXParser.expression_return expression85 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:127:2: ( assignment_operator expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:127:4: assignment_operator expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_operator_in_assgn_decl542);
            assignment_operator84=assignment_operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_operator84.getTree());
            pushFollow(FOLLOW_expression_in_assgn_decl544);
            expression85=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression85.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 13, assgn_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assgn_decl"

    public static class assignment_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_operator"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:130:1: assignment_operator : ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND );
    public final GalaxyXParser.assignment_operator_return assignment_operator() throws RecognitionException {
        GalaxyXParser.assignment_operator_return retval = new GalaxyXParser.assignment_operator_return();
        retval.start = input.LT(1);
        int assignment_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set86=null;

        CommonTree set86_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:131:2: ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set86=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSGN && input.LA(1)<=ASSGND) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set86));
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
            if ( state.backtracking>0 ) { memoize(input, 14, assignment_operator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment_operator"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:138:1: type : ( IDENTIFIER | BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | VOID );
    public final GalaxyXParser.type_return type() throws RecognitionException {
        GalaxyXParser.type_return retval = new GalaxyXParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set87=null;

        CommonTree set87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:139:2: ( IDENTIFIER | BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | VOID )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set87=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||(input.LA(1)>=BOOLEAN && input.LA(1)<=VOID) ) {
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
            if ( state.backtracking>0 ) { memoize(input, 15, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class argument_expression_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument_expression_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:178:1: argument_expression_list : assignment_expression ( COMMA assignment_expression )* ;
    public final GalaxyXParser.argument_expression_list_return argument_expression_list() throws RecognitionException {
        GalaxyXParser.argument_expression_list_return retval = new GalaxyXParser.argument_expression_list_return();
        retval.start = input.LT(1);
        int argument_expression_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA89=null;
        GalaxyXParser.assignment_expression_return assignment_expression88 = null;

        GalaxyXParser.assignment_expression_return assignment_expression90 = null;


        CommonTree COMMA89_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:179:2: ( assignment_expression ( COMMA assignment_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:179:6: assignment_expression ( COMMA assignment_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list776);
            assignment_expression88=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression88.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:179:28: ( COMMA assignment_expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:179:29: COMMA assignment_expression
            	    {
            	    COMMA89=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list779); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA89_tree = (CommonTree)adaptor.create(COMMA89);
            	    adaptor.addChild(root_0, COMMA89_tree);
            	    }
            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list781);
            	    assignment_expression90=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression90.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 16, argument_expression_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "argument_expression_list"

    public static class additive_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:182:1: additive_expression : ( multiplicative_expression ) ( PLUS multiplicative_expression | SUB multiplicative_expression )* ;
    public final GalaxyXParser.additive_expression_return additive_expression() throws RecognitionException {
        GalaxyXParser.additive_expression_return retval = new GalaxyXParser.additive_expression_return();
        retval.start = input.LT(1);
        int additive_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS92=null;
        Token SUB94=null;
        GalaxyXParser.multiplicative_expression_return multiplicative_expression91 = null;

        GalaxyXParser.multiplicative_expression_return multiplicative_expression93 = null;

        GalaxyXParser.multiplicative_expression_return multiplicative_expression95 = null;


        CommonTree PLUS92_tree=null;
        CommonTree SUB94_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:183:2: ( ( multiplicative_expression ) ( PLUS multiplicative_expression | SUB multiplicative_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:183:4: ( multiplicative_expression ) ( PLUS multiplicative_expression | SUB multiplicative_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:183:4: ( multiplicative_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:183:5: multiplicative_expression
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression795);
            multiplicative_expression91=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression91.getTree());

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:183:32: ( PLUS multiplicative_expression | SUB multiplicative_expression )*
            loop31:
            do {
                int alt31=3;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:183:33: PLUS multiplicative_expression
            	    {
            	    PLUS92=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression799); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    PLUS92_tree = (CommonTree)adaptor.create(PLUS92);
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUS92_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression802);
            	    multiplicative_expression93=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression93.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:183:67: SUB multiplicative_expression
            	    {
            	    SUB94=(Token)match(input,SUB,FOLLOW_SUB_in_additive_expression806); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SUB94_tree = (CommonTree)adaptor.create(SUB94);
            	    root_0 = (CommonTree)adaptor.becomeRoot(SUB94_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression809);
            	    multiplicative_expression95=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression95.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 17, additive_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:186:1: multiplicative_expression : unary_expression ( TIMES unary_expression | DIV unary_expression )* ;
    public final GalaxyXParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        GalaxyXParser.multiplicative_expression_return retval = new GalaxyXParser.multiplicative_expression_return();
        retval.start = input.LT(1);
        int multiplicative_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token TIMES97=null;
        Token DIV99=null;
        GalaxyXParser.unary_expression_return unary_expression96 = null;

        GalaxyXParser.unary_expression_return unary_expression98 = null;

        GalaxyXParser.unary_expression_return unary_expression100 = null;


        CommonTree TIMES97_tree=null;
        CommonTree DIV99_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:187:2: ( unary_expression ( TIMES unary_expression | DIV unary_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:187:4: unary_expression ( TIMES unary_expression | DIV unary_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression823);
            unary_expression96=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression96.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:187:21: ( TIMES unary_expression | DIV unary_expression )*
            loop32:
            do {
                int alt32=3;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:187:22: TIMES unary_expression
            	    {
            	    TIMES97=(Token)match(input,TIMES,FOLLOW_TIMES_in_multiplicative_expression826); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMES97_tree = (CommonTree)adaptor.create(TIMES97);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMES97_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression829);
            	    unary_expression98=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression98.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:187:48: DIV unary_expression
            	    {
            	    DIV99=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicative_expression833); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DIV99_tree = (CommonTree)adaptor.create(DIV99);
            	    root_0 = (CommonTree)adaptor.becomeRoot(DIV99_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression836);
            	    unary_expression100=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression100.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 18, multiplicative_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:190:1: unary_expression : ( postfix_expression | unary_operator unary_expression );
    public final GalaxyXParser.unary_expression_return unary_expression() throws RecognitionException {
        GalaxyXParser.unary_expression_return retval = new GalaxyXParser.unary_expression_return();
        retval.start = input.LT(1);
        int unary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.postfix_expression_return postfix_expression101 = null;

        GalaxyXParser.unary_operator_return unary_operator102 = null;

        GalaxyXParser.unary_expression_return unary_expression103 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:191:2: ( postfix_expression | unary_operator unary_expression )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:191:4: postfix_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression849);
                    postfix_expression101=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression101.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:192:4: unary_operator unary_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unary_operator_in_unary_expression854);
                    unary_operator102=unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(unary_operator102.getTree(), root_0);
                    pushFollow(FOLLOW_unary_expression_in_unary_expression857);
                    unary_expression103=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression103.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 19, unary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class postfix_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfix_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:195:1: postfix_expression : primary_expression ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT IDENTIFIER ( ( LBRACK expression RBRACK )* | LPAREN argument_expression_list RPAREN | LPAREN expression RPAREN ) )* ;
    public final GalaxyXParser.postfix_expression_return postfix_expression() throws RecognitionException {
        GalaxyXParser.postfix_expression_return retval = new GalaxyXParser.postfix_expression_return();
        retval.start = input.LT(1);
        int postfix_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LBRACK105=null;
        Token RBRACK107=null;
        Token LPAREN108=null;
        Token RPAREN109=null;
        Token LPAREN110=null;
        Token RPAREN112=null;
        Token DOT113=null;
        Token IDENTIFIER114=null;
        Token LBRACK115=null;
        Token RBRACK117=null;
        Token LPAREN118=null;
        Token RPAREN120=null;
        Token LPAREN121=null;
        Token RPAREN123=null;
        GalaxyXParser.primary_expression_return primary_expression104 = null;

        GalaxyXParser.expression_return expression106 = null;

        GalaxyXParser.argument_expression_list_return argument_expression_list111 = null;

        GalaxyXParser.expression_return expression116 = null;

        GalaxyXParser.argument_expression_list_return argument_expression_list119 = null;

        GalaxyXParser.expression_return expression122 = null;


        CommonTree LBRACK105_tree=null;
        CommonTree RBRACK107_tree=null;
        CommonTree LPAREN108_tree=null;
        CommonTree RPAREN109_tree=null;
        CommonTree LPAREN110_tree=null;
        CommonTree RPAREN112_tree=null;
        CommonTree DOT113_tree=null;
        CommonTree IDENTIFIER114_tree=null;
        CommonTree LBRACK115_tree=null;
        CommonTree RBRACK117_tree=null;
        CommonTree LPAREN118_tree=null;
        CommonTree RPAREN120_tree=null;
        CommonTree LPAREN121_tree=null;
        CommonTree RPAREN123_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:196:2: ( primary_expression ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT IDENTIFIER ( ( LBRACK expression RBRACK )* | LPAREN argument_expression_list RPAREN | LPAREN expression RPAREN ) )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:196:6: primary_expression ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT IDENTIFIER ( ( LBRACK expression RBRACK )* | LPAREN argument_expression_list RPAREN | LPAREN expression RPAREN ) )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_primary_expression_in_postfix_expression870);
            primary_expression104=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression104.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:197:9: ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT IDENTIFIER ( ( LBRACK expression RBRACK )* | LPAREN argument_expression_list RPAREN | LPAREN expression RPAREN ) )*
            loop36:
            do {
                int alt36=5;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:197:13: LBRACK expression RBRACK
            	    {
            	    LBRACK105=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix_expression884); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_postfix_expression887);
            	    expression106=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression106.getTree());
            	    RBRACK107=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix_expression889); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:198:13: LPAREN RPAREN
            	    {
            	    LPAREN108=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression904); if (state.failed) return retval;
            	    RPAREN109=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression907); if (state.failed) return retval;

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:199:13: LPAREN argument_expression_list RPAREN
            	    {
            	    LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression922); if (state.failed) return retval;
            	    pushFollow(FOLLOW_argument_expression_list_in_postfix_expression925);
            	    argument_expression_list111=argument_expression_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list111.getTree());
            	    RPAREN112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression927); if (state.failed) return retval;

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:13: DOT IDENTIFIER ( ( LBRACK expression RBRACK )* | LPAREN argument_expression_list RPAREN | LPAREN expression RPAREN )
            	    {
            	    DOT113=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression942); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT113_tree = (CommonTree)adaptor.create(DOT113);
            	    adaptor.addChild(root_0, DOT113_tree);
            	    }
            	    IDENTIFIER114=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression944); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    IDENTIFIER114_tree = (CommonTree)adaptor.create(IDENTIFIER114);
            	    adaptor.addChild(root_0, IDENTIFIER114_tree);
            	    }
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:28: ( ( LBRACK expression RBRACK )* | LPAREN argument_expression_list RPAREN | LPAREN expression RPAREN )
            	    int alt35=3;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:29: ( LBRACK expression RBRACK )*
            	            {
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:29: ( LBRACK expression RBRACK )*
            	            loop34:
            	            do {
            	                int alt34=2;
            	                alt34 = dfa34.predict(input);
            	                switch (alt34) {
            	            	case 1 :
            	            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:30: LBRACK expression RBRACK
            	            	    {
            	            	    LBRACK115=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix_expression948); if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) {
            	            	    LBRACK115_tree = (CommonTree)adaptor.create(LBRACK115);
            	            	    adaptor.addChild(root_0, LBRACK115_tree);
            	            	    }
            	            	    pushFollow(FOLLOW_expression_in_postfix_expression950);
            	            	    expression116=expression();

            	            	    state._fsp--;
            	            	    if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression116.getTree());
            	            	    RBRACK117=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix_expression952); if (state.failed) return retval;
            	            	    if ( state.backtracking==0 ) {
            	            	    RBRACK117_tree = (CommonTree)adaptor.create(RBRACK117);
            	            	    adaptor.addChild(root_0, RBRACK117_tree);
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop34;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:59: LPAREN argument_expression_list RPAREN
            	            {
            	            LPAREN118=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression958); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LPAREN118_tree = (CommonTree)adaptor.create(LPAREN118);
            	            adaptor.addChild(root_0, LPAREN118_tree);
            	            }
            	            pushFollow(FOLLOW_argument_expression_list_in_postfix_expression960);
            	            argument_expression_list119=argument_expression_list();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list119.getTree());
            	            RPAREN120=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression962); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            RPAREN120_tree = (CommonTree)adaptor.create(RPAREN120);
            	            adaptor.addChild(root_0, RPAREN120_tree);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:100: LPAREN expression RPAREN
            	            {
            	            LPAREN121=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression966); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LPAREN121_tree = (CommonTree)adaptor.create(LPAREN121);
            	            adaptor.addChild(root_0, LPAREN121_tree);
            	            }
            	            pushFollow(FOLLOW_expression_in_postfix_expression968);
            	            expression122=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression122.getTree());
            	            RPAREN123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression970); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            RPAREN123_tree = (CommonTree)adaptor.create(RPAREN123);
            	            adaptor.addChild(root_0, RPAREN123_tree);
            	            }

            	            }
            	            break;

            	    }


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
            if ( state.backtracking>0 ) { memoize(input, 20, postfix_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"

    public static class unary_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_operator"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:204:1: unary_operator : ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | NAMEOF | NATIVE );
    public final GalaxyXParser.unary_operator_return unary_operator() throws RecognitionException {
        GalaxyXParser.unary_operator_return retval = new GalaxyXParser.unary_operator_return();
        retval.start = input.LT(1);
        int unary_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS124=null;
        Token SUB125=null;
        Token NOT126=null;
        Token NEW127=null;
        Token DELETE128=null;
        Token NAMEOF129=null;
        Token NATIVE130=null;

        CommonTree PLUS124_tree=null;
        CommonTree SUB125_tree=null;
        CommonTree NOT126_tree=null;
        CommonTree NEW127_tree=null;
        CommonTree DELETE128_tree=null;
        CommonTree NAMEOF129_tree=null;
        CommonTree NATIVE130_tree=null;
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:205:2: ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | NAMEOF | NATIVE )
            int alt37=7;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt37=1;
                }
                break;
            case SUB:
                {
                alt37=2;
                }
                break;
            case NOT:
                {
                alt37=3;
                }
                break;
            case NEW:
                {
                alt37=4;
                }
                break;
            case DELETE:
                {
                alt37=5;
                }
                break;
            case NAMEOF:
                {
                alt37=6;
                }
                break;
            case NATIVE:
                {
                alt37=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:205:4: PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS124=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_operator993); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS124_tree = (CommonTree)adaptor.create(PLUS124);
                    adaptor.addChild(root_0, PLUS124_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:206:4: SUB
                    {
                    SUB125=(Token)match(input,SUB,FOLLOW_SUB_in_unary_operator998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUB.add(SUB125);



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
                    // 206:8: -> NEGATION
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:207:4: NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT126=(Token)match(input,NOT,FOLLOW_NOT_in_unary_operator1007); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT126_tree = (CommonTree)adaptor.create(NOT126);
                    adaptor.addChild(root_0, NOT126_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:208:4: NEW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEW127=(Token)match(input,NEW,FOLLOW_NEW_in_unary_operator1012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW127_tree = (CommonTree)adaptor.create(NEW127);
                    adaptor.addChild(root_0, NEW127_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:209:4: DELETE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DELETE128=(Token)match(input,DELETE,FOLLOW_DELETE_in_unary_operator1017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DELETE128_tree = (CommonTree)adaptor.create(DELETE128);
                    adaptor.addChild(root_0, DELETE128_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:210:4: NAMEOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NAMEOF129=(Token)match(input,NAMEOF,FOLLOW_NAMEOF_in_unary_operator1022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAMEOF129_tree = (CommonTree)adaptor.create(NAMEOF129);
                    adaptor.addChild(root_0, NAMEOF129_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:211:4: NATIVE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NATIVE130=(Token)match(input,NATIVE,FOLLOW_NATIVE_in_unary_operator1027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NATIVE130_tree = (CommonTree)adaptor.create(NATIVE130);
                    adaptor.addChild(root_0, NATIVE130_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 21, unary_operator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_operator"

    public static class primary_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:214:1: primary_expression : ( IDENTIFIER | constant | LPAREN expression RPAREN );
    public final GalaxyXParser.primary_expression_return primary_expression() throws RecognitionException {
        GalaxyXParser.primary_expression_return retval = new GalaxyXParser.primary_expression_return();
        retval.start = input.LT(1);
        int primary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER131=null;
        Token LPAREN133=null;
        Token RPAREN135=null;
        GalaxyXParser.constant_return constant132 = null;

        GalaxyXParser.expression_return expression134 = null;


        CommonTree IDENTIFIER131_tree=null;
        CommonTree LPAREN133_tree=null;
        CommonTree RPAREN135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:215:2: ( IDENTIFIER | constant | LPAREN expression RPAREN )
            int alt38=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt38=1;
                }
                break;
            case INTEGER:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
            case FIXED_LITERAL:
            case TRUE:
            case FALSE:
            case NULL:
            case THIS:
                {
                alt38=2;
                }
                break;
            case LPAREN:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:215:4: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENTIFIER131=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1038); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER131_tree = (CommonTree)adaptor.create(IDENTIFIER131);
                    adaptor.addChild(root_0, IDENTIFIER131_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:216:4: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression1043);
                    constant132=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant132.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:217:4: LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN133=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression1048); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primary_expression1051);
                    expression134=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression134.getTree());
                    RPAREN135=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression1053); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 22, primary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primary_expression"

    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:220:1: constant : ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS );
    public final GalaxyXParser.constant_return constant() throws RecognitionException {
        GalaxyXParser.constant_return retval = new GalaxyXParser.constant_return();
        retval.start = input.LT(1);
        int constant_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set136=null;

        CommonTree set136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:221:5: ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set136=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||(input.LA(1)>=CHARACTER_LITERAL && input.LA(1)<=THIS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set136));
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
            if ( state.backtracking>0 ) { memoize(input, 23, constant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:234:1: expression : assignment_expression ;
    public final GalaxyXParser.expression_return expression() throws RecognitionException {
        GalaxyXParser.expression_return retval = new GalaxyXParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.assignment_expression_return assignment_expression137 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:235:2: ( assignment_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:235:4: assignment_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_expression1148);
            assignment_expression137=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression137.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 24, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class constant_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:238:1: constant_expression : logical_or_expression ;
    public final GalaxyXParser.constant_expression_return constant_expression() throws RecognitionException {
        GalaxyXParser.constant_expression_return retval = new GalaxyXParser.constant_expression_return();
        retval.start = input.LT(1);
        int constant_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.logical_or_expression_return logical_or_expression138 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:2: ( logical_or_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:4: logical_or_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logical_or_expression_in_constant_expression1159);
            logical_or_expression138=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression138.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 25, constant_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constant_expression"

    public static class assignment_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:242:1: assignment_expression : ( logical_or_expression | lvalue assignment_operator assignment_expression );
    public final GalaxyXParser.assignment_expression_return assignment_expression() throws RecognitionException {
        GalaxyXParser.assignment_expression_return retval = new GalaxyXParser.assignment_expression_return();
        retval.start = input.LT(1);
        int assignment_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.logical_or_expression_return logical_or_expression139 = null;

        GalaxyXParser.lvalue_return lvalue140 = null;

        GalaxyXParser.assignment_operator_return assignment_operator141 = null;

        GalaxyXParser.assignment_expression_return assignment_expression142 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:243:2: ( logical_or_expression | lvalue assignment_operator assignment_expression )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:243:4: logical_or_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_logical_or_expression_in_assignment_expression1170);
                    logical_or_expression139=logical_or_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression139.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:244:4: lvalue assignment_operator assignment_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_assignment_expression1175);
                    lvalue140=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue140.getTree());
                    pushFollow(FOLLOW_assignment_operator_in_assignment_expression1177);
                    assignment_operator141=assignment_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignment_operator141.getTree(), root_0);
                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression1180);
                    assignment_expression142=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression142.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 26, assignment_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment_expression"

    public static class lvalue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:247:1: lvalue : unary_expression ;
    public final GalaxyXParser.lvalue_return lvalue() throws RecognitionException {
        GalaxyXParser.lvalue_return retval = new GalaxyXParser.lvalue_return();
        retval.start = input.LT(1);
        int lvalue_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.unary_expression_return unary_expression143 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:248:2: ( unary_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:248:4: unary_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_lvalue1192);
            unary_expression143=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression143.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 27, lvalue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "lvalue"

    public static class logical_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:251:1: logical_or_expression : logical_and_expression ( LOR logical_and_expression )* ;
    public final GalaxyXParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        GalaxyXParser.logical_or_expression_return retval = new GalaxyXParser.logical_or_expression_return();
        retval.start = input.LT(1);
        int logical_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LOR145=null;
        GalaxyXParser.logical_and_expression_return logical_and_expression144 = null;

        GalaxyXParser.logical_and_expression_return logical_and_expression146 = null;


        CommonTree LOR145_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:252:2: ( logical_and_expression ( LOR logical_and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:252:4: logical_and_expression ( LOR logical_and_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1203);
            logical_and_expression144=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression144.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:252:27: ( LOR logical_and_expression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LOR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:252:28: LOR logical_and_expression
            	    {
            	    LOR145=(Token)match(input,LOR,FOLLOW_LOR_in_logical_or_expression1206); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOR145_tree = (CommonTree)adaptor.create(LOR145);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LOR145_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1209);
            	    logical_and_expression146=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression146.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
            if ( state.backtracking>0 ) { memoize(input, 28, logical_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"

    public static class logical_and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_and_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:255:1: logical_and_expression : inclusive_or_expression ( LAND inclusive_or_expression )* ;
    public final GalaxyXParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        GalaxyXParser.logical_and_expression_return retval = new GalaxyXParser.logical_and_expression_return();
        retval.start = input.LT(1);
        int logical_and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LAND148=null;
        GalaxyXParser.inclusive_or_expression_return inclusive_or_expression147 = null;

        GalaxyXParser.inclusive_or_expression_return inclusive_or_expression149 = null;


        CommonTree LAND148_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:256:2: ( inclusive_or_expression ( LAND inclusive_or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:256:4: inclusive_or_expression ( LAND inclusive_or_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1223);
            inclusive_or_expression147=inclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusive_or_expression147.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:256:28: ( LAND inclusive_or_expression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LAND) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:256:29: LAND inclusive_or_expression
            	    {
            	    LAND148=(Token)match(input,LAND,FOLLOW_LAND_in_logical_and_expression1226); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LAND148_tree = (CommonTree)adaptor.create(LAND148);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LAND148_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1229);
            	    inclusive_or_expression149=inclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusive_or_expression149.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
            if ( state.backtracking>0 ) { memoize(input, 29, logical_and_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"

    public static class inclusive_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inclusive_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:259:1: inclusive_or_expression : exclusive_or_expression ( OR exclusive_or_expression )* ;
    public final GalaxyXParser.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException {
        GalaxyXParser.inclusive_or_expression_return retval = new GalaxyXParser.inclusive_or_expression_return();
        retval.start = input.LT(1);
        int inclusive_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OR151=null;
        GalaxyXParser.exclusive_or_expression_return exclusive_or_expression150 = null;

        GalaxyXParser.exclusive_or_expression_return exclusive_or_expression152 = null;


        CommonTree OR151_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:260:2: ( exclusive_or_expression ( OR exclusive_or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:260:4: exclusive_or_expression ( OR exclusive_or_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1242);
            exclusive_or_expression150=exclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression150.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:260:28: ( OR exclusive_or_expression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==OR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:260:29: OR exclusive_or_expression
            	    {
            	    OR151=(Token)match(input,OR,FOLLOW_OR_in_inclusive_or_expression1245); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR151_tree = (CommonTree)adaptor.create(OR151);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR151_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1248);
            	    exclusive_or_expression152=exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression152.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 30, inclusive_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inclusive_or_expression"

    public static class exclusive_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exclusive_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:263:1: exclusive_or_expression : and_expression ( XOR and_expression )* ;
    public final GalaxyXParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
        GalaxyXParser.exclusive_or_expression_return retval = new GalaxyXParser.exclusive_or_expression_return();
        retval.start = input.LT(1);
        int exclusive_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token XOR154=null;
        GalaxyXParser.and_expression_return and_expression153 = null;

        GalaxyXParser.and_expression_return and_expression155 = null;


        CommonTree XOR154_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:264:2: ( and_expression ( XOR and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:264:4: and_expression ( XOR and_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1261);
            and_expression153=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression153.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:264:19: ( XOR and_expression )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:264:20: XOR and_expression
            	    {
            	    XOR154=(Token)match(input,XOR,FOLLOW_XOR_in_exclusive_or_expression1264); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    XOR154_tree = (CommonTree)adaptor.create(XOR154);
            	    root_0 = (CommonTree)adaptor.becomeRoot(XOR154_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1267);
            	    and_expression155=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression155.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 31, exclusive_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exclusive_or_expression"

    public static class and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:267:1: and_expression : equality_expression ( AND equality_expression )* ;
    public final GalaxyXParser.and_expression_return and_expression() throws RecognitionException {
        GalaxyXParser.and_expression_return retval = new GalaxyXParser.and_expression_return();
        retval.start = input.LT(1);
        int and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token AND157=null;
        GalaxyXParser.equality_expression_return equality_expression156 = null;

        GalaxyXParser.equality_expression_return equality_expression158 = null;


        CommonTree AND157_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:268:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:268:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_and_expression1280);
            equality_expression156=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression156.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:268:24: ( AND equality_expression )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:268:25: AND equality_expression
            	    {
            	    AND157=(Token)match(input,AND,FOLLOW_AND_in_and_expression1283); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND157_tree = (CommonTree)adaptor.create(AND157);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND157_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_and_expression1286);
            	    equality_expression158=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression158.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
            if ( state.backtracking>0 ) { memoize(input, 32, and_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "and_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:270:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final GalaxyXParser.equality_expression_return equality_expression() throws RecognitionException {
        GalaxyXParser.equality_expression_return retval = new GalaxyXParser.equality_expression_return();
        retval.start = input.LT(1);
        int equality_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set160=null;
        GalaxyXParser.relational_expression_return relational_expression159 = null;

        GalaxyXParser.relational_expression_return relational_expression161 = null;


        CommonTree set160_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:271:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:271:4: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression1298);
            relational_expression159=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression159.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:271:26: ( ( EQ | NEQ ) relational_expression )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:271:27: ( EQ | NEQ ) relational_expression
            	    {
            	    set160=(Token)input.LT(1);
            	    set160=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set160), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1308);
            	    relational_expression161=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression161.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
            if ( state.backtracking>0 ) { memoize(input, 33, equality_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:274:1: relational_expression : shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* ;
    public final GalaxyXParser.relational_expression_return relational_expression() throws RecognitionException {
        GalaxyXParser.relational_expression_return retval = new GalaxyXParser.relational_expression_return();
        retval.start = input.LT(1);
        int relational_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set163=null;
        GalaxyXParser.shift_expression_return shift_expression162 = null;

        GalaxyXParser.shift_expression_return shift_expression164 = null;


        CommonTree set163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:275:2: ( shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:275:4: shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shift_expression_in_relational_expression1321);
            shift_expression162=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression162.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:275:21: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:275:22: ( LT | GT | LTEQ | GTEQ ) shift_expression
            	    {
            	    set163=(Token)input.LT(1);
            	    set163=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set163), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1335);
            	    shift_expression164=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression164.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
            if ( state.backtracking>0 ) { memoize(input, 34, relational_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relational_expression"

    public static class shift_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shift_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:278:1: shift_expression : additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* ;
    public final GalaxyXParser.shift_expression_return shift_expression() throws RecognitionException {
        GalaxyXParser.shift_expression_return retval = new GalaxyXParser.shift_expression_return();
        retval.start = input.LT(1);
        int shift_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set166=null;
        GalaxyXParser.additive_expression_return additive_expression165 = null;

        GalaxyXParser.additive_expression_return additive_expression167 = null;


        CommonTree set166_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:279:2: ( additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:279:4: additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_shift_expression1348);
            additive_expression165=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression165.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:279:24: ( ( SHIFTL | SHIFTR ) additive_expression )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:279:25: ( SHIFTL | SHIFTR ) additive_expression
            	    {
            	    set166=(Token)input.LT(1);
            	    set166=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFTL && input.LA(1)<=SHIFTR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set166), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1358);
            	    additive_expression167=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression167.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
            if ( state.backtracking>0 ) { memoize(input, 35, shift_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shift_expression"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:284:1: statement : ( expression_statement | selection_statement | while_statement | for_statement | jump_statement );
    public final GalaxyXParser.statement_return statement() throws RecognitionException {
        GalaxyXParser.statement_return retval = new GalaxyXParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.expression_statement_return expression_statement168 = null;

        GalaxyXParser.selection_statement_return selection_statement169 = null;

        GalaxyXParser.while_statement_return while_statement170 = null;

        GalaxyXParser.for_statement_return for_statement171 = null;

        GalaxyXParser.jump_statement_return jump_statement172 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:285:2: ( expression_statement | selection_statement | while_statement | for_statement | jump_statement )
            int alt48=5;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:285:4: expression_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_statement_in_statement1374);
                    expression_statement168=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement168.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:286:4: selection_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selection_statement_in_statement1379);
                    selection_statement169=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement169.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:287:4: while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement1384);
                    while_statement170=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement170.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:288:4: for_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_statement_in_statement1389);
                    for_statement171=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement171.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:289:4: jump_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_jump_statement_in_statement1394);
                    jump_statement172=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement172.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class expression_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:292:1: expression_statement : ( SEMI | expression SEMI );
    public final GalaxyXParser.expression_statement_return expression_statement() throws RecognitionException {
        GalaxyXParser.expression_statement_return retval = new GalaxyXParser.expression_statement_return();
        retval.start = input.LT(1);
        int expression_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI173=null;
        Token SEMI175=null;
        GalaxyXParser.expression_return expression174 = null;


        CommonTree SEMI173_tree=null;
        CommonTree SEMI175_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:293:2: ( SEMI | expression SEMI )
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:293:4: SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEMI173=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1407); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:294:4: expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_expression_statement1413);
                    expression174=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression174.getTree());
                    SEMI175=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1415); if (state.failed) return retval;

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

    public static class selection_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selection_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:297:1: selection_statement : IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF ;
    public final GalaxyXParser.selection_statement_return selection_statement() throws RecognitionException {
        GalaxyXParser.selection_statement_return retval = new GalaxyXParser.selection_statement_return();
        retval.start = input.LT(1);
        int selection_statement_StartIndex = input.index();
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
        GalaxyXParser.expression_return expression178 = null;

        GalaxyXParser.statement_return statement181 = null;

        GalaxyXParser.expression_return expression184 = null;

        GalaxyXParser.statement_return statement187 = null;

        GalaxyXParser.statement_return statement190 = null;


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

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:298:2: ( IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:298:4: IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF176=(Token)match(input,IF,FOLLOW_IF_in_selection_statement1427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF176_tree = (CommonTree)adaptor.create(IF176);
            adaptor.addChild(root_0, IF176_tree);
            }
            LPAREN177=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selection_statement1429); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_selection_statement1432);
            expression178=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression178.getTree());
            RPAREN179=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selection_statement1434); if (state.failed) return retval;
            COLON180=(Token)match(input,COLON,FOLLOW_COLON_in_selection_statement1437); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:298:41: ( statement )*
            loop50:
            do {
                int alt50=2;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_selection_statement1440);
            	    statement181=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement181.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:299:4: ( ELIF LPAREN expression RPAREN COLON ( statement )* )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==ELIF) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:299:5: ELIF LPAREN expression RPAREN COLON ( statement )*
            	    {
            	    ELIF182=(Token)match(input,ELIF,FOLLOW_ELIF_in_selection_statement1447); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELIF182_tree = (CommonTree)adaptor.create(ELIF182);
            	    adaptor.addChild(root_0, ELIF182_tree);
            	    }
            	    LPAREN183=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selection_statement1449); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_selection_statement1452);
            	    expression184=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression184.getTree());
            	    RPAREN185=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selection_statement1454); if (state.failed) return retval;
            	    COLON186=(Token)match(input,COLON,FOLLOW_COLON_in_selection_statement1457); if (state.failed) return retval;
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:299:44: ( statement )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        alt51 = dfa51.predict(input);
            	        switch (alt51) {
            	    	case 1 :
            	    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_selection_statement1460);
            	    	    statement187=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement187.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:300:4: ( ELSE COLON ( statement )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ELSE) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:300:5: ELSE COLON ( statement )*
                    {
                    ELSE188=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement1469); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE188_tree = (CommonTree)adaptor.create(ELSE188);
                    adaptor.addChild(root_0, ELSE188_tree);
                    }
                    COLON189=(Token)match(input,COLON,FOLLOW_COLON_in_selection_statement1471); if (state.failed) return retval;
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:300:17: ( statement )*
                    loop53:
                    do {
                        int alt53=2;
                        alt53 = dfa53.predict(input);
                        switch (alt53) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_selection_statement1474);
                    	    statement190=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement190.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            END191=(Token)match(input,END,FOLLOW_END_in_selection_statement1482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END191_tree = (CommonTree)adaptor.create(END191);
            adaptor.addChild(root_0, END191_tree);
            }
            IF192=(Token)match(input,IF,FOLLOW_IF_in_selection_statement1484); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF192_tree = (CommonTree)adaptor.create(IF192);
            adaptor.addChild(root_0, IF192_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 38, selection_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "selection_statement"

    public static class while_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:304:1: while_statement : WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE ;
    public final GalaxyXParser.while_statement_return while_statement() throws RecognitionException {
        GalaxyXParser.while_statement_return retval = new GalaxyXParser.while_statement_return();
        retval.start = input.LT(1);
        int while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token WHILE193=null;
        Token LPAREN194=null;
        Token RPAREN196=null;
        Token COLON197=null;
        Token END199=null;
        Token WHILE200=null;
        GalaxyXParser.expression_return expression195 = null;

        GalaxyXParser.statement_return statement198 = null;


        CommonTree WHILE193_tree=null;
        CommonTree LPAREN194_tree=null;
        CommonTree RPAREN196_tree=null;
        CommonTree COLON197_tree=null;
        CommonTree END199_tree=null;
        CommonTree WHILE200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:305:2: ( WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:305:4: WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE
            {
            root_0 = (CommonTree)adaptor.nil();

            WHILE193=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1496); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE193_tree = (CommonTree)adaptor.create(WHILE193);
            adaptor.addChild(root_0, WHILE193_tree);
            }
            LPAREN194=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1498); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_while_statement1501);
            expression195=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression195.getTree());
            RPAREN196=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1503); if (state.failed) return retval;
            COLON197=(Token)match(input,COLON,FOLLOW_COLON_in_while_statement1506); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:305:44: ( statement )*
            loop55:
            do {
                int alt55=2;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement1509);
            	    statement198=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement198.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            END199=(Token)match(input,END,FOLLOW_END_in_while_statement1515); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END199_tree = (CommonTree)adaptor.create(END199);
            adaptor.addChild(root_0, END199_tree);
            }
            WHILE200=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE200_tree = (CommonTree)adaptor.create(WHILE200);
            adaptor.addChild(root_0, WHILE200_tree);
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:309:1: for_statement : FOR LPAREN expression SEMI expression SEMI expression RPAREN COLON ( statement )* END FOR ;
    public final GalaxyXParser.for_statement_return for_statement() throws RecognitionException {
        GalaxyXParser.for_statement_return retval = new GalaxyXParser.for_statement_return();
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
        GalaxyXParser.expression_return expression203 = null;

        GalaxyXParser.expression_return expression205 = null;

        GalaxyXParser.expression_return expression207 = null;

        GalaxyXParser.statement_return statement210 = null;


        CommonTree FOR201_tree=null;
        CommonTree LPAREN202_tree=null;
        CommonTree SEMI204_tree=null;
        CommonTree SEMI206_tree=null;
        CommonTree RPAREN208_tree=null;
        CommonTree COLON209_tree=null;
        CommonTree END211_tree=null;
        CommonTree FOR212_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:310:2: ( FOR LPAREN expression SEMI expression SEMI expression RPAREN COLON ( statement )* END FOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:310:4: FOR LPAREN expression SEMI expression SEMI expression RPAREN COLON ( statement )* END FOR
            {
            root_0 = (CommonTree)adaptor.nil();

            FOR201=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1529); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR201_tree = (CommonTree)adaptor.create(FOR201);
            adaptor.addChild(root_0, FOR201_tree);
            }
            LPAREN202=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_for_statement1531); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_for_statement1534);
            expression203=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression203.getTree());
            SEMI204=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1536); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_for_statement1539);
            expression205=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression205.getTree());
            SEMI206=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1541); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_for_statement1544);
            expression207=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression207.getTree());
            RPAREN208=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_for_statement1546); if (state.failed) return retval;
            COLON209=(Token)match(input,COLON,FOLLOW_COLON_in_for_statement1549); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:311:4: ( statement )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_for_statement1555);
            	    statement210=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement210.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            END211=(Token)match(input,END,FOLLOW_END_in_for_statement1561); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END211_tree = (CommonTree)adaptor.create(END211);
            adaptor.addChild(root_0, END211_tree);
            }
            FOR212=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1563); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR212_tree = (CommonTree)adaptor.create(FOR212);
            adaptor.addChild(root_0, FOR212_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 40, for_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "for_statement"

    public static class jump_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jump_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:315:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );
    public final GalaxyXParser.jump_statement_return jump_statement() throws RecognitionException {
        GalaxyXParser.jump_statement_return retval = new GalaxyXParser.jump_statement_return();
        retval.start = input.LT(1);
        int jump_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BREAK213=null;
        Token SEMI214=null;
        Token CONTINUE215=null;
        Token SEMI216=null;
        Token RETURN217=null;
        Token SEMI218=null;
        Token RETURN219=null;
        Token SEMI221=null;
        GalaxyXParser.expression_return expression220 = null;


        CommonTree BREAK213_tree=null;
        CommonTree SEMI214_tree=null;
        CommonTree CONTINUE215_tree=null;
        CommonTree SEMI216_tree=null;
        CommonTree RETURN217_tree=null;
        CommonTree SEMI218_tree=null;
        CommonTree RETURN219_tree=null;
        CommonTree SEMI221_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:316:2: ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI )
            int alt57=4;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:316:4: BREAK SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BREAK213=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement1575); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK213_tree = (CommonTree)adaptor.create(BREAK213);
                    adaptor.addChild(root_0, BREAK213_tree);
                    }
                    SEMI214=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1577); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:317:4: CONTINUE SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CONTINUE215=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTINUE215_tree = (CommonTree)adaptor.create(CONTINUE215);
                    adaptor.addChild(root_0, CONTINUE215_tree);
                    }
                    SEMI216=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1585); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:318:4: RETURN SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RETURN217=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN217_tree = (CommonTree)adaptor.create(RETURN217);
                    adaptor.addChild(root_0, RETURN217_tree);
                    }
                    SEMI218=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1593); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:319:4: RETURN expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RETURN219=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN219_tree = (CommonTree)adaptor.create(RETURN219);
                    adaptor.addChild(root_0, RETURN219_tree);
                    }
                    pushFollow(FOLLOW_expression_in_jump_statement1601);
                    expression220=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression220.getTree());
                    SEMI221=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1603); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 41, jump_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "jump_statement"

    // $ANTLR start synpred4_GalaxyX
    public final void synpred4_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:5: ( function )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:5: function
        {
        pushFollow(FOLLOW_function_in_synpred4_GalaxyX153);
        function();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_GalaxyX

    // $ANTLR start synpred6_GalaxyX
    public final void synpred6_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:29: ( field_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:29: field_decl
        {
        pushFollow(FOLLOW_field_decl_in_synpred6_GalaxyX161);
        field_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_GalaxyX

    // $ANTLR start synpred7_GalaxyX
    public final void synpred7_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:42: ( typedef_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:60:42: typedef_decl
        {
        pushFollow(FOLLOW_typedef_decl_in_synpred7_GalaxyX165);
        typedef_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_GalaxyX

    // $ANTLR start synpred12_GalaxyX
    public final void synpred12_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:69:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:69:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred12_GalaxyX225);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_GalaxyX

    // $ANTLR start synpred18_GalaxyX
    public final void synpred18_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:5: ( function )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:5: function
        {
        pushFollow(FOLLOW_function_in_synpred18_GalaxyX317);
        function();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_GalaxyX

    // $ANTLR start synpred19_GalaxyX
    public final void synpred19_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:16: ( field_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:16: field_decl
        {
        pushFollow(FOLLOW_field_decl_in_synpred19_GalaxyX321);
        field_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_GalaxyX

    // $ANTLR start synpred20_GalaxyX
    public final void synpred20_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:29: ( typedef_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:89:29: typedef_decl
        {
        pushFollow(FOLLOW_typedef_decl_in_synpred20_GalaxyX325);
        typedef_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_GalaxyX

    // $ANTLR start synpred24_GalaxyX
    public final void synpred24_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred24_GalaxyX377);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_GalaxyX

    // $ANTLR start synpred27_GalaxyX
    public final void synpred27_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:105:4: ( local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:105:4: local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred27_GalaxyX422);
        local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_GalaxyX

    // $ANTLR start synpred86_GalaxyX
    public final void synpred86_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:30: ( LBRACK expression RBRACK )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:30: LBRACK expression RBRACK
        {
        match(input,LBRACK,FOLLOW_LBRACK_in_synpred86_GalaxyX948); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred86_GalaxyX950);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACK,FOLLOW_RBRACK_in_synpred86_GalaxyX952); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_GalaxyX

    // $ANTLR start synpred87_GalaxyX
    public final void synpred87_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:29: ( ( LBRACK expression RBRACK )* )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:29: ( LBRACK expression RBRACK )*
        {
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:29: ( LBRACK expression RBRACK )*
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LBRACK) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:30: LBRACK expression RBRACK
        	    {
        	    match(input,LBRACK,FOLLOW_LBRACK_in_synpred87_GalaxyX948); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred87_GalaxyX950);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,RBRACK,FOLLOW_RBRACK_in_synpred87_GalaxyX952); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop58;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred87_GalaxyX

    // $ANTLR start synpred88_GalaxyX
    public final void synpred88_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:59: ( LPAREN argument_expression_list RPAREN )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:59: LPAREN argument_expression_list RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred88_GalaxyX958); if (state.failed) return ;
        pushFollow(FOLLOW_argument_expression_list_in_synpred88_GalaxyX960);
        argument_expression_list();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred88_GalaxyX962); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_GalaxyX

    // $ANTLR start synpred105_GalaxyX
    public final void synpred105_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:243:4: ( logical_or_expression )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:243:4: logical_or_expression
        {
        pushFollow(FOLLOW_logical_or_expression_in_synpred105_GalaxyX1170);
        logical_or_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_GalaxyX

    // Delegated rules

    public final boolean synpred20_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA4_eotS =
        "\26\uffff";
    static final String DFA4_eofS =
        "\26\uffff";
    static final String DFA4_minS =
        "\1\5\1\uffff\1\5\1\6\6\uffff\1\0\13\uffff";
    static final String DFA4_maxS =
        "\1\103\1\uffff\2\103\6\uffff\1\0\13\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\5\2\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\14\uffff";
    static final String DFA4_specialS =
        "\12\uffff\1\0\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\1\11\1\7\3\uffff\1\1\2\4\4\uffff\1\6\6\uffff\2\2\1\7\5"+
            "\uffff\43\7",
            "",
            "\1\12\1\11\1\7\4\uffff\2\4\4\uffff\1\6\10\uffff\1\7\5\uffff"+
            "\43\7",
            "\1\11\1\7\4\uffff\2\4\15\uffff\1\7\5\uffff\43\7",
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
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 60:4: ( function | class_decl | field_decl | typedef_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_GalaxyX()) ) {s = 4;}

                        else if ( (synpred6_GalaxyX()) ) {s = 7;}

                        else if ( (synpred7_GalaxyX()) ) {s = 9;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\46\uffff";
    static final String DFA9_eofS =
        "\46\uffff";
    static final String DFA9_minS =
        "\1\7\1\uffff\1\7\21\uffff\1\0\21\uffff";
    static final String DFA9_maxS =
        "\1\151\1\uffff\1\141\21\uffff\1\0\21\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\21\uffff\1\1\22\uffff";
    static final String DFA9_specialS =
        "\24\uffff\1\0\21\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\1\2\uffff\1\1\2\uffff\1\1\5\uffff\1\1\14\uffff\43\23"+
            "\2\1\3\uffff\14\1\15\uffff\1\1\2\uffff\5\1",
            "",
            "\1\23\1\1\5\uffff\1\1\4\uffff\1\24\10\uffff\5\1\43\uffff\5"+
            "\1\14\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 69:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_20 = input.LA(1);

                         
                        int index9_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_GalaxyX()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\23\uffff";
    static final String DFA10_eofS =
        "\23\uffff";
    static final String DFA10_minS =
        "\1\7\22\uffff";
    static final String DFA10_maxS =
        "\1\151\22\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\1\1\20\uffff";
    static final String DFA10_specialS =
        "\23\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\2\2\uffff\1\1\2\uffff\1\2\5\uffff\1\2\57\uffff\2\2\3\uffff"+
            "\14\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 70:4: ( statement )*";
        }
    }
    static final String DFA15_eotS =
        "\26\uffff";
    static final String DFA15_eofS =
        "\26\uffff";
    static final String DFA15_minS =
        "\1\5\1\uffff\1\5\1\6\7\uffff\1\0\12\uffff";
    static final String DFA15_maxS =
        "\1\103\1\uffff\2\103\7\uffff\1\0\12\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\6\2\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\13\uffff";
    static final String DFA15_specialS =
        "\13\uffff\1\0\12\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\3\1\10\1\6\3\uffff\1\1\2\4\11\uffff\1\11\1\12\2\2\1\6\5"+
            "\uffff\43\6",
            "",
            "\1\13\1\10\1\6\4\uffff\2\4\15\uffff\1\6\5\uffff\43\6",
            "\1\10\1\6\4\uffff\2\4\15\uffff\1\6\5\uffff\43\6",
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
            return "()* loopback of 89:4: ( function | field_decl | typedef_decl | constr_decl | destr_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_GalaxyX()) ) {s = 4;}

                        else if ( (synpred19_GalaxyX()) ) {s = 6;}

                        else if ( (synpred20_GalaxyX()) ) {s = 8;}

                         
                        input.seek(index15_11);
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
    static final String DFA17_eotS =
        "\46\uffff";
    static final String DFA17_eofS =
        "\46\uffff";
    static final String DFA17_minS =
        "\1\7\1\uffff\1\7\21\uffff\1\0\21\uffff";
    static final String DFA17_maxS =
        "\1\151\1\uffff\1\141\21\uffff\1\0\21\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\21\uffff\1\1\22\uffff";
    static final String DFA17_specialS =
        "\24\uffff\1\0\21\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\1\2\uffff\1\1\2\uffff\1\1\5\uffff\1\1\14\uffff\43\23"+
            "\2\1\3\uffff\14\1\15\uffff\1\1\2\uffff\5\1",
            "",
            "\1\23\1\1\5\uffff\1\1\4\uffff\1\24\10\uffff\5\1\43\uffff\5"+
            "\1\14\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 98:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_20 = input.LA(1);

                         
                        int index17_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_GalaxyX()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\23\uffff";
    static final String DFA18_eofS =
        "\23\uffff";
    static final String DFA18_minS =
        "\1\7\22\uffff";
    static final String DFA18_maxS =
        "\1\151\22\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\1\1\20\uffff";
    static final String DFA18_specialS =
        "\23\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\2\2\uffff\1\1\2\uffff\1\2\5\uffff\1\2\57\uffff\2\2\3\uffff"+
            "\14\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 99:4: ( statement )*";
        }
    }
    static final String DFA20_eotS =
        "\46\uffff";
    static final String DFA20_eofS =
        "\46\uffff";
    static final String DFA20_minS =
        "\1\7\1\uffff\1\7\21\uffff\1\0\21\uffff";
    static final String DFA20_maxS =
        "\1\151\1\uffff\1\141\21\uffff\1\0\21\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\21\uffff\1\1\22\uffff";
    static final String DFA20_specialS =
        "\24\uffff\1\0\21\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\1\2\uffff\1\1\2\uffff\1\1\5\uffff\1\1\14\uffff\43\23"+
            "\2\1\3\uffff\14\1\15\uffff\1\1\2\uffff\5\1",
            "",
            "\1\23\1\1\5\uffff\1\1\4\uffff\1\24\10\uffff\5\1\43\uffff\5"+
            "\1\14\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()* loopback of 105:4: ( local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_20 = input.LA(1);

                         
                        int index20_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_GalaxyX()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\23\uffff";
    static final String DFA21_eofS =
        "\23\uffff";
    static final String DFA21_minS =
        "\1\7\22\uffff";
    static final String DFA21_maxS =
        "\1\151\22\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\1\1\20\uffff";
    static final String DFA21_specialS =
        "\23\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\2\2\uffff\1\1\2\uffff\1\2\5\uffff\1\2\57\uffff\2\2\3\uffff"+
            "\14\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 106:4: ( statement )*";
        }
    }
    static final String DFA31_eotS =
        "\20\uffff";
    static final String DFA31_eofS =
        "\1\1\17\uffff";
    static final String DFA31_minS =
        "\1\10\17\uffff";
    static final String DFA31_maxS =
        "\1\141\17\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\3\14\uffff\1\1\1\2";
    static final String DFA31_specialS =
        "\20\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\6\uffff\1\1\1\uffff\1\1\3\uffff\1\1\56\uffff\1\16\1\17"+
            "\17\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 183:32: ( PLUS multiplicative_expression | SUB multiplicative_expression )*";
        }
    }
    static final String DFA32_eotS =
        "\22\uffff";
    static final String DFA32_eofS =
        "\1\1\21\uffff";
    static final String DFA32_minS =
        "\1\10\21\uffff";
    static final String DFA32_maxS =
        "\1\141\21\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\3\16\uffff\1\1\1\2";
    static final String DFA32_specialS =
        "\22\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\6\uffff\1\1\1\uffff\1\1\3\uffff\1\1\56\uffff\2\1\1\20"+
            "\1\21\15\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 187:21: ( TIMES unary_expression | DIV unary_expression )*";
        }
    }
    static final String DFA33_eotS =
        "\13\uffff";
    static final String DFA33_eofS =
        "\13\uffff";
    static final String DFA33_minS =
        "\1\7\12\uffff";
    static final String DFA33_maxS =
        "\1\124\12\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\6\uffff";
    static final String DFA33_specialS =
        "\13\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\6\uffff\1\1\5\uffff\1\1\57\uffff\2\4\3\uffff\5\4\7\1",
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
            return "190:1: unary_expression : ( postfix_expression | unary_operator unary_expression );";
        }
    }
    static final String DFA36_eotS =
        "\41\uffff";
    static final String DFA36_eofS =
        "\1\1\40\uffff";
    static final String DFA36_minS =
        "\1\10\23\uffff\1\7\14\uffff";
    static final String DFA36_maxS =
        "\1\141\23\uffff\1\124\14\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\5\21\uffff\1\1\1\uffff\1\4\1\2\1\3\11\uffff";
    static final String DFA36_specialS =
        "\41\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\5\uffff\1\24\1\1\1\uffff\1\1\1\uffff\1\23\1\uffff\1\1"+
            "\6\uffff\5\1\43\uffff\4\1\1\25\14\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\6\uffff\1\27\1\26\4\uffff\1\27\57\uffff\2\27\3\uffff"+
            "\14\27",
            "",
            "",
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
            return "()* loopback of 197:9: ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT IDENTIFIER ( ( LBRACK expression RBRACK )* | LPAREN argument_expression_list RPAREN | LPAREN expression RPAREN ) )*";
        }
    }
    static final String DFA35_eotS =
        "\43\uffff";
    static final String DFA35_eofS =
        "\1\1\42\uffff";
    static final String DFA35_minS =
        "\1\10\23\uffff\1\7\2\uffff\12\0\2\uffff";
    static final String DFA35_maxS =
        "\1\141\23\uffff\1\124\2\uffff\12\0\2\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\37\uffff\1\2\1\3";
    static final String DFA35_specialS =
        "\27\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\5\uffff\1\24\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\6"+
            "\uffff\5\1\43\uffff\5\1\14\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\6\uffff\1\31\1\1\4\uffff\1\30\57\uffff\1\32\1\33\3\uffff"+
            "\1\34\1\35\1\36\1\37\1\40\7\30",
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
            return "200:28: ( ( LBRACK expression RBRACK )* | LPAREN argument_expression_list RPAREN | LPAREN expression RPAREN )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_23 = input.LA(1);

                         
                        int index35_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_23);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_24 = input.LA(1);

                         
                        int index35_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_25 = input.LA(1);

                         
                        int index35_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_25);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_26 = input.LA(1);

                         
                        int index35_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_26);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_27 = input.LA(1);

                         
                        int index35_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_27);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_28 = input.LA(1);

                         
                        int index35_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_28);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA35_29 = input.LA(1);

                         
                        int index35_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_29);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA35_30 = input.LA(1);

                         
                        int index35_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_30);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA35_31 = input.LA(1);

                         
                        int index35_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_31);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA35_32 = input.LA(1);

                         
                        int index35_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_GalaxyX()) ) {s = 1;}

                        else if ( (synpred88_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index35_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\41\uffff";
    static final String DFA34_eofS =
        "\1\1\40\uffff";
    static final String DFA34_minS =
        "\1\10\22\uffff\1\7\2\uffff\12\0\1\uffff";
    static final String DFA34_maxS =
        "\1\141\22\uffff\1\124\2\uffff\12\0\1\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\2\36\uffff\1\1";
    static final String DFA34_specialS =
        "\26\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\5\uffff\2\1\1\uffff\1\1\1\uffff\1\23\1\uffff\1\1\6\uffff"+
            "\5\1\43\uffff\5\1\14\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\6\uffff\1\30\5\uffff\1\27\57\uffff\1\31\1\32\3\uffff"+
            "\1\33\1\34\1\35\1\36\1\37\7\27",
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
            return "()* loopback of 200:29: ( LBRACK expression RBRACK )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_22 = input.LA(1);

                         
                        int index34_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_23 = input.LA(1);

                         
                        int index34_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_23);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_24 = input.LA(1);

                         
                        int index34_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_24);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_25 = input.LA(1);

                         
                        int index34_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_25);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_26 = input.LA(1);

                         
                        int index34_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_26);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_27 = input.LA(1);

                         
                        int index34_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_27);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_28 = input.LA(1);

                         
                        int index34_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_28);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_29 = input.LA(1);

                         
                        int index34_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_29);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_30 = input.LA(1);

                         
                        int index34_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_30);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_31 = input.LA(1);

                         
                        int index34_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_GalaxyX()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\u0085\uffff";
    static final String DFA39_eofS =
        "\1\uffff\2\16\u0082\uffff";
    static final String DFA39_minS =
        "\1\7\2\10\10\7\3\0\22\uffff\3\0\22\uffff\120\0";
    static final String DFA39_maxS =
        "\1\124\2\141\10\124\3\0\22\uffff\3\0\22\uffff\120\0";
    static final String DFA39_acceptS =
        "\16\uffff\1\1\20\uffff\1\2\145\uffff";
    static final String DFA39_specialS =
        "\13\uffff\1\0\1\1\1\2\22\uffff\1\3\1\4\1\5\22\uffff\1\6\1\7\1\10"+
        "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
        "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
        "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74"+
        "\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107"+
        "\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
        "\1\123\1\124\1\125}>";
    static final String[] DFA39_transitionS = {
            "\1\1\6\uffff\1\3\5\uffff\1\2\57\uffff\1\4\1\5\3\uffff\1\6\1"+
            "\7\1\10\1\11\1\12\7\2",
            "\1\16\5\uffff\1\14\1\16\1\uffff\1\16\1\uffff\1\13\1\uffff"+
            "\1\16\6\uffff\5\37\43\uffff\4\16\1\15\14\uffff\15\16",
            "\1\16\5\uffff\1\41\1\16\1\uffff\1\16\1\uffff\1\40\1\uffff"+
            "\1\16\6\uffff\5\37\43\uffff\4\16\1\42\14\uffff\15\16",
            "\1\65\6\uffff\1\67\5\uffff\1\66\57\uffff\1\70\1\71\3\uffff"+
            "\1\72\1\73\1\74\1\75\1\76\7\66",
            "\1\77\6\uffff\1\101\5\uffff\1\100\57\uffff\1\102\1\103\3\uffff"+
            "\1\104\1\105\1\106\1\107\1\110\7\100",
            "\1\111\6\uffff\1\113\5\uffff\1\112\57\uffff\1\114\1\115\3"+
            "\uffff\1\116\1\117\1\120\1\121\1\122\7\112",
            "\1\123\6\uffff\1\125\5\uffff\1\124\57\uffff\1\126\1\127\3"+
            "\uffff\1\130\1\131\1\132\1\133\1\134\7\124",
            "\1\135\6\uffff\1\137\5\uffff\1\136\57\uffff\1\140\1\141\3"+
            "\uffff\1\142\1\143\1\144\1\145\1\146\7\136",
            "\1\147\6\uffff\1\151\5\uffff\1\150\57\uffff\1\152\1\153\3"+
            "\uffff\1\154\1\155\1\156\1\157\1\160\7\150",
            "\1\161\6\uffff\1\163\5\uffff\1\162\57\uffff\1\164\1\165\3"+
            "\uffff\1\166\1\167\1\170\1\171\1\172\7\162",
            "\1\173\6\uffff\1\175\5\uffff\1\174\57\uffff\1\176\1\177\3"+
            "\uffff\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\7\174",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "242:1: assignment_expression : ( logical_or_expression | lvalue assignment_operator assignment_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_11 = input.LA(1);

                         
                        int index39_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_12 = input.LA(1);

                         
                        int index39_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_13 = input.LA(1);

                         
                        int index39_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_32 = input.LA(1);

                         
                        int index39_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_32);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_33 = input.LA(1);

                         
                        int index39_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_33);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_34 = input.LA(1);

                         
                        int index39_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_34);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_53 = input.LA(1);

                         
                        int index39_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_53);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA39_54 = input.LA(1);

                         
                        int index39_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_54);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA39_55 = input.LA(1);

                         
                        int index39_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_55);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA39_56 = input.LA(1);

                         
                        int index39_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_56);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA39_57 = input.LA(1);

                         
                        int index39_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_57);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA39_58 = input.LA(1);

                         
                        int index39_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_58);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA39_59 = input.LA(1);

                         
                        int index39_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_59);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA39_60 = input.LA(1);

                         
                        int index39_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_60);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA39_61 = input.LA(1);

                         
                        int index39_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_61);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA39_62 = input.LA(1);

                         
                        int index39_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_62);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA39_63 = input.LA(1);

                         
                        int index39_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_63);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA39_64 = input.LA(1);

                         
                        int index39_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_64);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA39_65 = input.LA(1);

                         
                        int index39_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_65);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA39_66 = input.LA(1);

                         
                        int index39_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_66);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA39_67 = input.LA(1);

                         
                        int index39_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_67);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA39_68 = input.LA(1);

                         
                        int index39_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_68);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA39_69 = input.LA(1);

                         
                        int index39_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_69);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA39_70 = input.LA(1);

                         
                        int index39_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_70);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA39_71 = input.LA(1);

                         
                        int index39_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_71);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA39_72 = input.LA(1);

                         
                        int index39_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_72);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA39_73 = input.LA(1);

                         
                        int index39_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_73);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA39_74 = input.LA(1);

                         
                        int index39_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_74);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA39_75 = input.LA(1);

                         
                        int index39_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_75);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA39_76 = input.LA(1);

                         
                        int index39_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_76);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA39_77 = input.LA(1);

                         
                        int index39_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_77);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA39_78 = input.LA(1);

                         
                        int index39_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_78);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA39_79 = input.LA(1);

                         
                        int index39_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_79);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA39_80 = input.LA(1);

                         
                        int index39_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_80);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA39_81 = input.LA(1);

                         
                        int index39_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_81);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA39_82 = input.LA(1);

                         
                        int index39_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_82);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA39_83 = input.LA(1);

                         
                        int index39_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_83);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA39_84 = input.LA(1);

                         
                        int index39_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_84);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA39_85 = input.LA(1);

                         
                        int index39_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_85);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA39_86 = input.LA(1);

                         
                        int index39_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_86);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA39_87 = input.LA(1);

                         
                        int index39_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_87);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA39_88 = input.LA(1);

                         
                        int index39_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_88);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA39_89 = input.LA(1);

                         
                        int index39_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_89);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA39_90 = input.LA(1);

                         
                        int index39_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_90);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA39_91 = input.LA(1);

                         
                        int index39_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_91);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA39_92 = input.LA(1);

                         
                        int index39_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_92);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA39_93 = input.LA(1);

                         
                        int index39_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_93);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA39_94 = input.LA(1);

                         
                        int index39_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_94);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA39_95 = input.LA(1);

                         
                        int index39_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_95);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA39_96 = input.LA(1);

                         
                        int index39_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_96);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA39_97 = input.LA(1);

                         
                        int index39_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_97);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA39_98 = input.LA(1);

                         
                        int index39_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_98);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA39_99 = input.LA(1);

                         
                        int index39_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_99);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA39_100 = input.LA(1);

                         
                        int index39_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_100);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA39_101 = input.LA(1);

                         
                        int index39_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_101);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA39_102 = input.LA(1);

                         
                        int index39_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_102);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA39_103 = input.LA(1);

                         
                        int index39_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_103);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA39_104 = input.LA(1);

                         
                        int index39_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_104);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA39_105 = input.LA(1);

                         
                        int index39_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_105);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA39_106 = input.LA(1);

                         
                        int index39_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_106);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA39_107 = input.LA(1);

                         
                        int index39_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_107);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA39_108 = input.LA(1);

                         
                        int index39_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_108);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA39_109 = input.LA(1);

                         
                        int index39_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_109);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA39_110 = input.LA(1);

                         
                        int index39_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_110);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA39_111 = input.LA(1);

                         
                        int index39_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_111);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA39_112 = input.LA(1);

                         
                        int index39_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_112);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA39_113 = input.LA(1);

                         
                        int index39_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_113);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA39_114 = input.LA(1);

                         
                        int index39_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_114);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA39_115 = input.LA(1);

                         
                        int index39_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_115);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA39_116 = input.LA(1);

                         
                        int index39_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_116);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA39_117 = input.LA(1);

                         
                        int index39_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_117);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA39_118 = input.LA(1);

                         
                        int index39_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_118);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA39_119 = input.LA(1);

                         
                        int index39_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_119);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA39_120 = input.LA(1);

                         
                        int index39_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_120);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA39_121 = input.LA(1);

                         
                        int index39_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_121);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA39_122 = input.LA(1);

                         
                        int index39_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_122);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA39_123 = input.LA(1);

                         
                        int index39_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_123);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA39_124 = input.LA(1);

                         
                        int index39_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_124);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA39_125 = input.LA(1);

                         
                        int index39_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_125);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA39_126 = input.LA(1);

                         
                        int index39_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_126);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA39_127 = input.LA(1);

                         
                        int index39_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_127);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA39_128 = input.LA(1);

                         
                        int index39_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_128);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA39_129 = input.LA(1);

                         
                        int index39_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_129);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA39_130 = input.LA(1);

                         
                        int index39_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_130);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA39_131 = input.LA(1);

                         
                        int index39_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_131);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA39_132 = input.LA(1);

                         
                        int index39_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index39_132);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\12\uffff";
    static final String DFA43_eofS =
        "\1\1\11\uffff";
    static final String DFA43_minS =
        "\1\10\11\uffff";
    static final String DFA43_maxS =
        "\1\130\11\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA43_specialS =
        "\12\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\6\uffff\1\1\1\uffff\1\1\3\uffff\1\1\77\uffff\3\1\1\11",
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
            return "()* loopback of 264:19: ( XOR and_expression )*";
        }
    }
    static final String DFA44_eotS =
        "\13\uffff";
    static final String DFA44_eofS =
        "\1\1\12\uffff";
    static final String DFA44_minS =
        "\1\10\12\uffff";
    static final String DFA44_maxS =
        "\1\131\12\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA44_specialS =
        "\13\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\6\uffff\1\1\1\uffff\1\1\3\uffff\1\1\77\uffff\4\1\1\12",
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
            return "()* loopback of 268:24: ( AND equality_expression )*";
        }
    }
    static final String DFA45_eotS =
        "\14\uffff";
    static final String DFA45_eofS =
        "\1\1\13\uffff";
    static final String DFA45_minS =
        "\1\10\13\uffff";
    static final String DFA45_maxS =
        "\1\133\13\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA45_specialS =
        "\14\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1\6\uffff\1\1\1\uffff\1\1\3\uffff\1\1\77\uffff\5\1\2\13",
            "",
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
            return "()* loopback of 271:26: ( ( EQ | NEQ ) relational_expression )*";
        }
    }
    static final String DFA46_eotS =
        "\15\uffff";
    static final String DFA46_eofS =
        "\1\1\14\uffff";
    static final String DFA46_minS =
        "\1\10\14\uffff";
    static final String DFA46_maxS =
        "\1\137\14\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\2\12\uffff\1\1";
    static final String DFA46_specialS =
        "\15\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\6\uffff\1\1\1\uffff\1\1\3\uffff\1\1\77\uffff\7\1\4\14",
            "",
            "",
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
            return "()* loopback of 275:21: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*";
        }
    }
    static final String DFA47_eotS =
        "\16\uffff";
    static final String DFA47_eofS =
        "\1\1\15\uffff";
    static final String DFA47_minS =
        "\1\10\15\uffff";
    static final String DFA47_maxS =
        "\1\141\15\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA47_specialS =
        "\16\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\1\6\uffff\1\1\1\uffff\1\1\3\uffff\1\1\77\uffff\13\1\2\15",
            "",
            "",
            "",
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
            return "()* loopback of 279:24: ( ( SHIFTL | SHIFTR ) additive_expression )*";
        }
    }
    static final String DFA48_eotS =
        "\22\uffff";
    static final String DFA48_eofS =
        "\22\uffff";
    static final String DFA48_minS =
        "\1\7\21\uffff";
    static final String DFA48_maxS =
        "\1\151\21\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\12\uffff\1\2\1\3\1\4\1\5\2\uffff";
    static final String DFA48_specialS =
        "\22\uffff}>";
    static final String[] DFA48_transitionS = {
            "\2\1\5\uffff\1\1\5\uffff\1\1\57\uffff\2\1\3\uffff\14\1\15\uffff"+
            "\1\14\2\uffff\1\15\1\16\3\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "284:1: statement : ( expression_statement | selection_statement | while_statement | for_statement | jump_statement );";
        }
    }
    static final String DFA49_eotS =
        "\14\uffff";
    static final String DFA49_eofS =
        "\14\uffff";
    static final String DFA49_minS =
        "\1\7\13\uffff";
    static final String DFA49_maxS =
        "\1\124\13\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA49_specialS =
        "\14\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\2\1\1\5\uffff\1\2\5\uffff\1\2\57\uffff\2\2\3\uffff\14\2",
            "",
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
            return "292:1: expression_statement : ( SEMI | expression SEMI );";
        }
    }
    static final String DFA50_eotS =
        "\25\uffff";
    static final String DFA50_eofS =
        "\25\uffff";
    static final String DFA50_minS =
        "\1\7\24\uffff";
    static final String DFA50_maxS =
        "\1\151\24\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\20\uffff";
    static final String DFA50_specialS =
        "\25\uffff}>";
    static final String[] DFA50_transitionS = {
            "\2\4\2\uffff\1\1\2\uffff\1\4\5\uffff\1\4\57\uffff\2\4\3\uffff"+
            "\14\4\15\uffff\1\4\2\1\5\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 298:41: ( statement )*";
        }
    }
    static final String DFA51_eotS =
        "\25\uffff";
    static final String DFA51_eofS =
        "\25\uffff";
    static final String DFA51_minS =
        "\1\7\24\uffff";
    static final String DFA51_maxS =
        "\1\151\24\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\20\uffff";
    static final String DFA51_specialS =
        "\25\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\4\2\uffff\1\1\2\uffff\1\4\5\uffff\1\4\57\uffff\2\4\3\uffff"+
            "\14\4\15\uffff\1\4\2\1\5\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 299:44: ( statement )*";
        }
    }
    static final String DFA53_eotS =
        "\23\uffff";
    static final String DFA53_eofS =
        "\23\uffff";
    static final String DFA53_minS =
        "\1\7\22\uffff";
    static final String DFA53_maxS =
        "\1\151\22\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\1\1\20\uffff";
    static final String DFA53_specialS =
        "\23\uffff}>";
    static final String[] DFA53_transitionS = {
            "\2\2\2\uffff\1\1\2\uffff\1\2\5\uffff\1\2\57\uffff\2\2\3\uffff"+
            "\14\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 300:17: ( statement )*";
        }
    }
    static final String DFA55_eotS =
        "\23\uffff";
    static final String DFA55_eofS =
        "\23\uffff";
    static final String DFA55_minS =
        "\1\7\22\uffff";
    static final String DFA55_maxS =
        "\1\151\22\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\2\1\1\20\uffff";
    static final String DFA55_specialS =
        "\23\uffff}>";
    static final String[] DFA55_transitionS = {
            "\2\2\2\uffff\1\1\2\uffff\1\2\5\uffff\1\2\57\uffff\2\2\3\uffff"+
            "\14\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 305:44: ( statement )*";
        }
    }
    static final String DFA56_eotS =
        "\23\uffff";
    static final String DFA56_eofS =
        "\23\uffff";
    static final String DFA56_minS =
        "\1\7\22\uffff";
    static final String DFA56_maxS =
        "\1\151\22\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\2\1\1\20\uffff";
    static final String DFA56_specialS =
        "\23\uffff}>";
    static final String[] DFA56_transitionS = {
            "\2\2\2\uffff\1\1\2\uffff\1\2\5\uffff\1\2\57\uffff\2\2\3\uffff"+
            "\14\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 311:4: ( statement )*";
        }
    }
    static final String DFA57_eotS =
        "\17\uffff";
    static final String DFA57_eofS =
        "\17\uffff";
    static final String DFA57_minS =
        "\1\147\2\uffff\1\7\13\uffff";
    static final String DFA57_maxS =
        "\1\151\2\uffff\1\124\13\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\11\uffff";
    static final String DFA57_specialS =
        "\17\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1\1\2\1\3",
            "",
            "",
            "\1\5\1\4\5\uffff\1\5\5\uffff\1\5\57\uffff\2\5\3\uffff\14\5",
            "",
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
            return "315:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );";
        }
    }
 

    public static final BitSet FOLLOW_namespace_in_translation_unit95 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_modifier_in_typedef_decl107 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_STATIC_in_typedef_decl110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedef_decl113 = new BitSet(new long[]{0xFFFFFFFE00000080L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_typedef_decl116 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedef_decl118 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_typedef_decl120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace135 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace140 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_namespace142 = new BitSet(new long[]{0xFFFFFFFE0E0438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_function_in_namespace153 = new BitSet(new long[]{0xFFFFFFFE0E0438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_class_decl_in_namespace157 = new BitSet(new long[]{0xFFFFFFFE0E0438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_field_decl_in_namespace161 = new BitSet(new long[]{0xFFFFFFFE0E0438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_typedef_decl_in_namespace165 = new BitSet(new long[]{0xFFFFFFFE0E0438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_END_in_namespace172 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_function191 = new BitSet(new long[]{0x0000000000003020L});
    public static final BitSet FOLLOW_STATIC_in_function194 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_INLINE_in_function197 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_FUNC_in_function200 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function203 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_function205 = new BitSet(new long[]{0xFFFFFFFE00008080L,0x000000000000000FL});
    public static final BitSet FOLLOW_argument_list_in_function208 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_function211 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RETURNS_in_function214 = new BitSet(new long[]{0xFFFFFFFE00000080L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_function217 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_function219 = new BitSet(new long[]{0xFFFFFFFE00104980L,0x000003E4001FFE3FL});
    public static final BitSet FOLLOW_local_var_decl_in_function225 = new BitSet(new long[]{0xFFFFFFFE00104980L,0x000003E4001FFE3FL});
    public static final BitSet FOLLOW_statement_in_function231 = new BitSet(new long[]{0x0000000000104980L,0x000003E4001FFE30L});
    public static final BitSet FOLLOW_END_in_function237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_FUNC_in_function239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_argument_list251 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argument_list254 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_argument_list257 = new BitSet(new long[]{0xFFFFFFFE00000080L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_argument_list259 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argument_list261 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_modifier_in_class_decl277 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl280 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl285 = new BitSet(new long[]{0x0000000000480400L});
    public static final BitSet FOLLOW_LBRACK_in_class_decl288 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_INTEGER_in_class_decl293 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_class_decl295 = new BitSet(new long[]{0x0000000000400400L});
    public static final BitSet FOLLOW_EXTENDS_in_class_decl301 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl303 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_class_decl307 = new BitSet(new long[]{0xFFFFFFFE0F8438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_function_in_class_decl317 = new BitSet(new long[]{0xFFFFFFFE0F8438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_field_decl_in_class_decl321 = new BitSet(new long[]{0xFFFFFFFE0F8438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_typedef_decl_in_class_decl325 = new BitSet(new long[]{0xFFFFFFFE0F8438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_constr_decl_in_class_decl329 = new BitSet(new long[]{0xFFFFFFFE0F8438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_destr_decl_in_class_decl333 = new BitSet(new long[]{0xFFFFFFFE0F8438E0L,0x000000000000000FL});
    public static final BitSet FOLLOW_END_in_class_decl340 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constr_decl359 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_constr_decl362 = new BitSet(new long[]{0xFFFFFFFE00008080L,0x000000000000000FL});
    public static final BitSet FOLLOW_argument_list_in_constr_decl365 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_constr_decl368 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_constr_decl371 = new BitSet(new long[]{0xFFFFFFFE00104980L,0x000003E4001FFE3FL});
    public static final BitSet FOLLOW_local_var_decl_in_constr_decl377 = new BitSet(new long[]{0xFFFFFFFE00104980L,0x000003E4001FFE3FL});
    public static final BitSet FOLLOW_statement_in_constr_decl383 = new BitSet(new long[]{0x0000000000104980L,0x000003E4001FFE30L});
    public static final BitSet FOLLOW_END_in_constr_decl389 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constr_decl392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destr_decl404 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_destr_decl407 = new BitSet(new long[]{0xFFFFFFFE00008080L,0x000000000000000FL});
    public static final BitSet FOLLOW_argument_list_in_destr_decl410 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_destr_decl413 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_destr_decl416 = new BitSet(new long[]{0xFFFFFFFE00104980L,0x000003E4001FFE3FL});
    public static final BitSet FOLLOW_local_var_decl_in_destr_decl422 = new BitSet(new long[]{0xFFFFFFFE00104980L,0x000003E4001FFE3FL});
    public static final BitSet FOLLOW_statement_in_destr_decl428 = new BitSet(new long[]{0x0000000000104980L,0x000003E4001FFE30L});
    public static final BitSet FOLLOW_END_in_destr_decl434 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destr_decl437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_local_var_decl465 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_array_decl_in_local_var_decl468 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var_decl471 = new BitSet(new long[]{0x00000001F0000100L});
    public static final BitSet FOLLOW_assgn_decl_in_local_var_decl473 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_local_var_decl476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_field_decl489 = new BitSet(new long[]{0xFFFFFFFE080000A0L,0x000000000000000FL});
    public static final BitSet FOLLOW_STATIC_in_field_decl492 = new BitSet(new long[]{0xFFFFFFFE08000080L,0x000000000000000FL});
    public static final BitSet FOLLOW_CONST_in_field_decl495 = new BitSet(new long[]{0xFFFFFFFE00000080L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_field_decl498 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_array_decl_in_field_decl501 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl504 = new BitSet(new long[]{0x00000001F0000100L});
    public static final BitSet FOLLOW_assgn_decl_in_field_decl507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_field_decl510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_decl524 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_array_decl526 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_array_decl528 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_assignment_operator_in_assgn_decl542 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_assgn_decl544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list776 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list779 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list781 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression795 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression799 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_SUB_in_additive_expression806 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression809 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression823 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_TIMES_in_multiplicative_expression826 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression829 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_DIV_in_multiplicative_expression833 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression836 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression854 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression870 = new BitSet(new long[]{0x0000000000084002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LBRACK_in_postfix_expression884 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_postfix_expression887 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix_expression889 = new BitSet(new long[]{0x0000000000084002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression904 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression907 = new BitSet(new long[]{0x0000000000084002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression922 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression925 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression927 = new BitSet(new long[]{0x0000000000084002L,0x0000000000000100L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression942 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression944 = new BitSet(new long[]{0x0000000000084002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LBRACK_in_postfix_expression948 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_postfix_expression950 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix_expression952 = new BitSet(new long[]{0x0000000000084002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression958 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression960 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression962 = new BitSet(new long[]{0x0000000000084002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression966 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_postfix_expression968 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression970 = new BitSet(new long[]{0x0000000000084002L,0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_in_unary_operator993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unary_operator998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_operator1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unary_operator1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unary_operator1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMEOF_in_unary_operator1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_unary_operator1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary_expression1048 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_primary_expression1051 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_primary_expression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_constant_expression1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_assignment_expression1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_assignment_expression1175 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1177 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_lvalue1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_LOR_in_logical_or_expression1206 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1223 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_LAND_in_logical_and_expression1226 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1229 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1242 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_OR_in_inclusive_or_expression1245 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1248 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1261 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_XOR_in_exclusive_or_expression1264 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1267 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1280 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_and_expression1283 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1286 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1298 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_set_in_equality_expression1301 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1308 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1321 = new BitSet(new long[]{0x0000000000000002L,0x00000000F0000000L});
    public static final BitSet FOLLOW_set_in_relational_expression1324 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1335 = new BitSet(new long[]{0x0000000000000002L,0x00000000F0000000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1348 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_set_in_shift_expression1351 = new BitSet(new long[]{0x0000000000104080L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1358 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_expression_statement_in_statement1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement1413 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement1427 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_selection_statement1429 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_selection_statement1432 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_selection_statement1434 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_selection_statement1437 = new BitSet(new long[]{0x0000000000104980L,0x000003FC001FFE30L});
    public static final BitSet FOLLOW_statement_in_selection_statement1440 = new BitSet(new long[]{0x0000000000104980L,0x000003FC001FFE30L});
    public static final BitSet FOLLOW_ELIF_in_selection_statement1447 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_selection_statement1449 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_selection_statement1452 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_selection_statement1454 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_selection_statement1457 = new BitSet(new long[]{0x0000000000104980L,0x000003FC001FFE30L});
    public static final BitSet FOLLOW_statement_in_selection_statement1460 = new BitSet(new long[]{0x0000000000104980L,0x000003FC001FFE30L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement1469 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_selection_statement1471 = new BitSet(new long[]{0x0000000000104980L,0x000003E4001FFE30L});
    public static final BitSet FOLLOW_statement_in_selection_statement1474 = new BitSet(new long[]{0x0000000000104980L,0x000003E4001FFE30L});
    public static final BitSet FOLLOW_END_in_selection_statement1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_IF_in_selection_statement1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_while_statement1498 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_while_statement1501 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_while_statement1503 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_while_statement1506 = new BitSet(new long[]{0x0000000000104980L,0x000003E4001FFE30L});
    public static final BitSet FOLLOW_statement_in_while_statement1509 = new BitSet(new long[]{0x0000000000104980L,0x000003E4001FFE30L});
    public static final BitSet FOLLOW_END_in_while_statement1515 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement1529 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_for_statement1531 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_for_statement1534 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1536 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_for_statement1539 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1541 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_for_statement1544 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_for_statement1546 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_for_statement1549 = new BitSet(new long[]{0x0000000000104980L,0x000003E4001FFE30L});
    public static final BitSet FOLLOW_statement_in_for_statement1555 = new BitSet(new long[]{0x0000000000104980L,0x000003E4001FFE30L});
    public static final BitSet FOLLOW_END_in_for_statement1561 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_FOR_in_for_statement1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement1575 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement1583 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1591 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1599 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_jump_statement1601 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred4_GalaxyX153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_decl_in_synpred6_GalaxyX161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_decl_in_synpred7_GalaxyX165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred12_GalaxyX225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred18_GalaxyX317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_decl_in_synpred19_GalaxyX321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_decl_in_synpred20_GalaxyX325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred24_GalaxyX377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred27_GalaxyX422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_synpred86_GalaxyX948 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_synpred86_GalaxyX950 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_synpred86_GalaxyX952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_synpred87_GalaxyX948 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_expression_in_synpred87_GalaxyX950 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_synpred87_GalaxyX952 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred88_GalaxyX958 = new BitSet(new long[]{0x0000000000104180L,0x00000000001FFE30L});
    public static final BitSet FOLLOW_argument_expression_list_in_synpred88_GalaxyX960 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred88_GalaxyX962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_synpred105_GalaxyX1170 = new BitSet(new long[]{0x0000000000000002L});

}