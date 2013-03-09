// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g 2013-03-09 18:00:49

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
 * Copyright (c) Timo Hanisch 2013
 * timohanisch@gmail.com
 *
 * Namespaces/Classes/Methods/Global Vars get
 * registered here!
 **********************************************/
public class GalaxyXParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "TYPEDEF", "IDENTIFIER", "SEMI", "NAMESPACE", "COLON", "END", "INITIALIZER", "STATIC", "FUNC", "LPAREN", "RPAREN", "RETURNS", "COMMA", "CLASS", "LBRACK", "INTEGER", "RBRACK", "EXTENDS", "CONSTRUCTOR", "DESTRUCTOR", "PUBLIC", "PRIVATE", "ASSGN", "CONST", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "NAMESPACE_ACCESS", "BOOLEAN", "BYTE", "CHAR", "FIXED", "GAMELINK", "COLOR", "INT", "POINT", "STRING", "ABILCMD", "ACTOR", "ACTORSCOPE", "BANK", "CAMERAINFO", "MARKER", "ORDER", "PLAYERGROUP", "REGION", "REVEALER", "SOUNDLINK", "TEXT", "TIMER", "TRANSMISSIONSOURCE", "TRIGGER", "UNITFILTER", "UNITGROUP", "UNITREF", "UNIT", "WAVEINFO", "WAVETARGET", "DOODAD", "AIFILTER", "SOUND", "WAVE", "VOID", "PLUS", "SUB", "TIMES", "DIV", "MODULO", "DOT", "NOT", "NEW", "DELETE", "BIT_NOT", "CHARACTER_LITERAL", "STRING_LITERAL", "FIXED_LITERAL", "TRUE", "FALSE", "NULL", "THIS", "LOR", "LAND", "OR", "XOR", "AND", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "SHIFTL", "SHIFTR", "IF", "ELIF", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "RETURN", "INLINE", "NATIVE", "STRUCT", "INTERFACE", "IMPLEMENTS", "SUPER", "NAMEOF", "DEFINE", "LBRACE", "RBRACE", "PREFIX", "LETTER", "EscapeSequence", "DIGIT", "HEX_LITERAL", "HexDigit", "Exponent", "FloatTypeSuffix", "OctalEscape", "UnicodeEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT"
    };
    public static final int EOF=-1;
    public static final int NEGATION=4;
    public static final int TYPEDEF=5;
    public static final int IDENTIFIER=6;
    public static final int SEMI=7;
    public static final int NAMESPACE=8;
    public static final int COLON=9;
    public static final int END=10;
    public static final int INITIALIZER=11;
    public static final int STATIC=12;
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
    public static final int ASSGN=27;
    public static final int CONST=28;
    public static final int ASSGNP=29;
    public static final int ASSGNS=30;
    public static final int ASSGNT=31;
    public static final int ASSGND=32;
    public static final int ASSGNM=33;
    public static final int ASSGNSHL=34;
    public static final int ASSGNSHR=35;
    public static final int ASSGNBITAND=36;
    public static final int ASSGNBITOR=37;
    public static final int ASSGNBITXOR=38;
    public static final int NAMESPACE_ACCESS=39;
    public static final int BOOLEAN=40;
    public static final int BYTE=41;
    public static final int CHAR=42;
    public static final int FIXED=43;
    public static final int GAMELINK=44;
    public static final int COLOR=45;
    public static final int INT=46;
    public static final int POINT=47;
    public static final int STRING=48;
    public static final int ABILCMD=49;
    public static final int ACTOR=50;
    public static final int ACTORSCOPE=51;
    public static final int BANK=52;
    public static final int CAMERAINFO=53;
    public static final int MARKER=54;
    public static final int ORDER=55;
    public static final int PLAYERGROUP=56;
    public static final int REGION=57;
    public static final int REVEALER=58;
    public static final int SOUNDLINK=59;
    public static final int TEXT=60;
    public static final int TIMER=61;
    public static final int TRANSMISSIONSOURCE=62;
    public static final int TRIGGER=63;
    public static final int UNITFILTER=64;
    public static final int UNITGROUP=65;
    public static final int UNITREF=66;
    public static final int UNIT=67;
    public static final int WAVEINFO=68;
    public static final int WAVETARGET=69;
    public static final int DOODAD=70;
    public static final int AIFILTER=71;
    public static final int SOUND=72;
    public static final int WAVE=73;
    public static final int VOID=74;
    public static final int PLUS=75;
    public static final int SUB=76;
    public static final int TIMES=77;
    public static final int DIV=78;
    public static final int MODULO=79;
    public static final int DOT=80;
    public static final int NOT=81;
    public static final int NEW=82;
    public static final int DELETE=83;
    public static final int BIT_NOT=84;
    public static final int CHARACTER_LITERAL=85;
    public static final int STRING_LITERAL=86;
    public static final int FIXED_LITERAL=87;
    public static final int TRUE=88;
    public static final int FALSE=89;
    public static final int NULL=90;
    public static final int THIS=91;
    public static final int LOR=92;
    public static final int LAND=93;
    public static final int OR=94;
    public static final int XOR=95;
    public static final int AND=96;
    public static final int EQ=97;
    public static final int NEQ=98;
    public static final int LT=99;
    public static final int GT=100;
    public static final int LTEQ=101;
    public static final int GTEQ=102;
    public static final int SHIFTL=103;
    public static final int SHIFTR=104;
    public static final int IF=105;
    public static final int ELIF=106;
    public static final int ELSE=107;
    public static final int WHILE=108;
    public static final int FOR=109;
    public static final int BREAK=110;
    public static final int CONTINUE=111;
    public static final int RETURN=112;
    public static final int INLINE=113;
    public static final int NATIVE=114;
    public static final int STRUCT=115;
    public static final int INTERFACE=116;
    public static final int IMPLEMENTS=117;
    public static final int SUPER=118;
    public static final int NAMEOF=119;
    public static final int DEFINE=120;
    public static final int LBRACE=121;
    public static final int RBRACE=122;
    public static final int PREFIX=123;
    public static final int LETTER=124;
    public static final int EscapeSequence=125;
    public static final int DIGIT=126;
    public static final int HEX_LITERAL=127;
    public static final int HexDigit=128;
    public static final int Exponent=129;
    public static final int FloatTypeSuffix=130;
    public static final int OctalEscape=131;
    public static final int UnicodeEscape=132;
    public static final int WS=133;
    public static final int LINE_COMMENT=134;
    public static final int MULTI_COMMENT=135;

    // delegates
    // delegators


        public GalaxyXParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[180+1];
             
             
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
    	
    	@Override 
    	public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            Error.printError(hdr + msg);
        }


    public static class translation_unit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "translation_unit"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:48:1: translation_unit : ( namespace )* ;
    public final GalaxyXParser.translation_unit_return translation_unit() throws RecognitionException {
        GalaxyXParser.translation_unit_return retval = new GalaxyXParser.translation_unit_return();
        retval.start = input.LT(1);
        int translation_unit_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.namespace_return namespace1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:49:2: ( ( namespace )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:49:4: ( namespace )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:49:4: ( namespace )*
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:52:1: typedef_decl : ( modifier )? TYPEDEF type IDENTIFIER SEMI ;
    public final GalaxyXParser.typedef_decl_return typedef_decl() throws RecognitionException {
        GalaxyXParser.typedef_decl_return retval = new GalaxyXParser.typedef_decl_return();
        retval.start = input.LT(1);
        int typedef_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token TYPEDEF3=null;
        Token IDENTIFIER5=null;
        Token SEMI6=null;
        GalaxyXParser.modifier_return modifier2 = null;

        GalaxyXParser.type_return type4 = null;


        CommonTree TYPEDEF3_tree=null;
        CommonTree IDENTIFIER5_tree=null;
        CommonTree SEMI6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:53:2: ( ( modifier )? TYPEDEF type IDENTIFIER SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:53:4: ( modifier )? TYPEDEF type IDENTIFIER SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:53:4: ( modifier )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=PUBLIC && LA2_0<=PRIVATE)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_typedef_decl108);
                    modifier2=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier2.getTree());

                    }
                    break;

            }

            TYPEDEF3=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedef_decl111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF3_tree = (CommonTree)adaptor.create(TYPEDEF3);
            root_0 = (CommonTree)adaptor.becomeRoot(TYPEDEF3_tree, root_0);
            }
            pushFollow(FOLLOW_type_in_typedef_decl114);
            type4=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type4.getTree());
            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedef_decl116); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER5_tree = (CommonTree)adaptor.create(IDENTIFIER5);
            adaptor.addChild(root_0, IDENTIFIER5_tree);
            }
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_typedef_decl118); if (state.failed) return retval;

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:58:1: namespace : NAMESPACE i1= IDENTIFIER COLON ( initializer )? ( function | class_decl | field_decl | typedef_decl )* END NAMESPACE ;
    public final GalaxyXParser.namespace_return namespace() throws RecognitionException {
        GalaxyXParser.namespace_return retval = new GalaxyXParser.namespace_return();
        retval.start = input.LT(1);
        int namespace_StartIndex = input.index();
        CommonTree root_0 = null;

        Token i1=null;
        Token NAMESPACE7=null;
        Token COLON8=null;
        Token END14=null;
        Token NAMESPACE15=null;
        GalaxyXParser.initializer_return initializer9 = null;

        GalaxyXParser.function_return function10 = null;

        GalaxyXParser.class_decl_return class_decl11 = null;

        GalaxyXParser.field_decl_return field_decl12 = null;

        GalaxyXParser.typedef_decl_return typedef_decl13 = null;


        CommonTree i1_tree=null;
        CommonTree NAMESPACE7_tree=null;
        CommonTree COLON8_tree=null;
        CommonTree END14_tree=null;
        CommonTree NAMESPACE15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:59:2: ( NAMESPACE i1= IDENTIFIER COLON ( initializer )? ( function | class_decl | field_decl | typedef_decl )* END NAMESPACE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:59:4: NAMESPACE i1= IDENTIFIER COLON ( initializer )? ( function | class_decl | field_decl | typedef_decl )* END NAMESPACE
            {
            root_0 = (CommonTree)adaptor.nil();

            NAMESPACE7=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAMESPACE7_tree = (CommonTree)adaptor.create(NAMESPACE7);
            root_0 = (CommonTree)adaptor.becomeRoot(NAMESPACE7_tree, root_0);
            }
            i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace140); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i1_tree = (CommonTree)adaptor.create(i1);
            adaptor.addChild(root_0, i1_tree);
            }
            COLON8=(Token)match(input,COLON,FOLLOW_COLON_in_namespace142); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		if(Main.table.namespaceExists(i1.getText())){
              			namespace = Main.table.getNamespace((i1!=null?i1.getText():null));
              		}else{
              			namespace = new Namespace((i1!=null?i1.getText():null));
              			Main.table.putNamespace((i1!=null?i1.getText():null),namespace);
              		}
              	
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:4: ( initializer )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: initializer
                    {
                    pushFollow(FOLLOW_initializer_in_namespace152);
                    initializer9=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer9.getTree());

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:17: ( function | class_decl | field_decl | typedef_decl )*
            loop4:
            do {
                int alt4=5;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:18: function
            	    {
            	    pushFollow(FOLLOW_function_in_namespace156);
            	    function10=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function10.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:29: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_namespace160);
            	    class_decl11=class_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_decl11.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:42: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_namespace164);
            	    field_decl12=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_decl12.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:55: typedef_decl
            	    {
            	    pushFollow(FOLLOW_typedef_decl_in_namespace168);
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

            END14=(Token)match(input,END,FOLLOW_END_in_namespace175); if (state.failed) return retval;
            NAMESPACE15=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace178); if (state.failed) return retval;
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

    public static class initializer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initializer"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:75:1: initializer : i1= INITIALIZER COLON local= local_var_decl ( statement )* END INITIALIZER ;
    public final GalaxyXParser.initializer_return initializer() throws RecognitionException {
        GalaxyXParser.initializer_return retval = new GalaxyXParser.initializer_return();
        retval.start = input.LT(1);
        int initializer_StartIndex = input.index();
        CommonTree root_0 = null;

        Token i1=null;
        Token COLON16=null;
        Token END18=null;
        Token INITIALIZER19=null;
        GalaxyXParser.local_var_decl_return local = null;

        GalaxyXParser.statement_return statement17 = null;


        CommonTree i1_tree=null;
        CommonTree COLON16_tree=null;
        CommonTree END18_tree=null;
        CommonTree INITIALIZER19_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:76:2: (i1= INITIALIZER COLON local= local_var_decl ( statement )* END INITIALIZER )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:76:6: i1= INITIALIZER COLON local= local_var_decl ( statement )* END INITIALIZER
            {
            root_0 = (CommonTree)adaptor.nil();

            i1=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i1_tree = (CommonTree)adaptor.create(i1);
            adaptor.addChild(root_0, i1_tree);
            }
            COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_initializer199); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		if(Main.table.getInitializer() != null){
              			Error.printError("An initializer is already defined",i1);
              		}else{
              			method = new Method(namespace,null,false,false,false,"Initializer",Type.Void,false);
              		}
              	
            }
            pushFollow(FOLLOW_local_var_decl_in_initializer211);
            local=local_var_decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, local.getTree());
            if ( state.backtracking==0 ) {

              		if(!method.addLocal((local!=null?local.local:null),false)){
              			Error.printError("Variable "+(local!=null?local.local:null)+" already defined for initializer",i1);
              		}
              	
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:90:5: ( statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_initializer220);
            	    statement17=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            END18=(Token)match(input,END,FOLLOW_END_in_initializer227); if (state.failed) return retval;
            INITIALIZER19=(Token)match(input,INITIALIZER,FOLLOW_INITIALIZER_in_initializer230); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		method = null;
              	
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
            if ( state.backtracking>0 ) { memoize(input, 4, initializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "initializer"

    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:97:1: function : ( (m= modifier )? ) ( (s= STATIC )? ) FUNC i= IDENTIFIER LPAREN (args= argument_list )? RPAREN RETURNS t= type COLON (local= local_var_decl )* ( statement )* END FUNC ;
    public final GalaxyXParser.function_return function() throws RecognitionException {
        GalaxyXParser.function_return retval = new GalaxyXParser.function_return();
        retval.start = input.LT(1);
        int function_StartIndex = input.index();
        CommonTree root_0 = null;

        Token s=null;
        Token i=null;
        Token FUNC20=null;
        Token LPAREN21=null;
        Token RPAREN22=null;
        Token RETURNS23=null;
        Token COLON24=null;
        Token END26=null;
        Token FUNC27=null;
        GalaxyXParser.modifier_return m = null;

        GalaxyXParser.argument_list_return args = null;

        GalaxyXParser.type_return t = null;

        GalaxyXParser.local_var_decl_return local = null;

        GalaxyXParser.statement_return statement25 = null;


        CommonTree s_tree=null;
        CommonTree i_tree=null;
        CommonTree FUNC20_tree=null;
        CommonTree LPAREN21_tree=null;
        CommonTree RPAREN22_tree=null;
        CommonTree RETURNS23_tree=null;
        CommonTree COLON24_tree=null;
        CommonTree END26_tree=null;
        CommonTree FUNC27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:2: ( ( (m= modifier )? ) ( (s= STATIC )? ) FUNC i= IDENTIFIER LPAREN (args= argument_list )? RPAREN RETURNS t= type COLON (local= local_var_decl )* ( statement )* END FUNC )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:4: ( (m= modifier )? ) ( (s= STATIC )? ) FUNC i= IDENTIFIER LPAREN (args= argument_list )? RPAREN RETURNS t= type COLON (local= local_var_decl )* ( statement )* END FUNC
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:4: ( (m= modifier )? )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:5: (m= modifier )?
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:6: (m= modifier )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=PUBLIC && LA6_0<=PRIVATE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: m= modifier
                    {
                    pushFollow(FOLLOW_modifier_in_function249);
                    m=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());

                    }
                    break;

            }


            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:19: ( (s= STATIC )? )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:20: (s= STATIC )?
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:21: (s= STATIC )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==STATIC) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: s= STATIC
                    {
                    s=(Token)match(input,STATIC,FOLLOW_STATIC_in_function257); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    s_tree = (CommonTree)adaptor.create(s);
                    adaptor.addChild(root_0, s_tree);
                    }

                    }
                    break;

            }


            }

            FUNC20=(Token)match(input,FUNC,FOLLOW_FUNC_in_function262); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNC20_tree = (CommonTree)adaptor.create(FUNC20);
            root_0 = (CommonTree)adaptor.becomeRoot(FUNC20_tree, root_0);
            }
            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i_tree = (CommonTree)adaptor.create(i);
            adaptor.addChild(root_0, i_tree);
            }
            LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function269); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:98:63: (args= argument_list )?
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: args= argument_list
                    {
                    pushFollow(FOLLOW_argument_list_in_function274);
                    args=argument_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args.getTree());

                    }
                    break;

            }

            RPAREN22=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function277); if (state.failed) return retval;
            RETURNS23=(Token)match(input,RETURNS,FOLLOW_RETURNS_in_function280); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_function285);
            t=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
            COLON24=(Token)match(input,COLON,FOLLOW_COLON_in_function287); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              	  	if(cl == null){
              	  		if(s == null){
              	  			Error.printError("Methods without a class have to be static",i);
              	  		}else if(namespace.containsMethod((i!=null?i.getText():null))){
              	  			Error.printError("$1 is already defined within namespace "+cl,i);
              	  		}else{
              	  			method = new Method(namespace,null,true,(m != null && (m!=null?input.toString(m.start,m.stop):null).equals("public")),(m != null && (m!=null?input.toString(m.start,m.stop):null).equals("private")),(i!=null?i.getText():null),(t!=null?t.t:null),true);
              	  			if(args != null){
              	  				for(LocalField f:(args!=null?args.args:null)){
              	  					if(!method.addLocal(f,true)){
              	  						Error.printError("Variable "+f+" already defined for method $1",i);
              	  					}
              	  				}
              	  			}
              	  		}
              	  	}else if(cl.containsMethod((i!=null?i.getText():null))){
              	  		Error.printError("$1 is already defined within class "+cl,i);
              	  	}else{
              	  		method = new Method(namespace,cl,(s != null),(m != null && (m!=null?input.toString(m.start,m.stop):null).equals("public")),(m != null && (m!=null?input.toString(m.start,m.stop):null).equals("private")),(i!=null?i.getText():null),(t!=null?t.t:null),true);
                			if(args != null){
                				for(LocalField f:(args!=null?args.args:null)){
                					if(!method.addLocal(f,true)){
                						Error.printError("Variable "+f+" already defined for method $1",i);
                					}
                				}
                			}
              	  	}
              	  
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:128:4: (local= local_var_decl )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:128:5: local= local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_function301);
            	    local=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local.getTree());
            	    if ( state.backtracking==0 ) {

            	      		if(!method.addLocal((local!=null?local.local:null),false)){
            	      			Error.printError("Variable "+(local!=null?local.local:null)+" already defined for method $1",i);
            	      		}
            	      	  
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:135:4: ( statement )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_function317);
            	    statement25=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement25.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              	  	method = null;
              	  
            }
            END26=(Token)match(input,END,FOLLOW_END_in_function328); if (state.failed) return retval;
            FUNC27=(Token)match(input,FUNC,FOLLOW_FUNC_in_function331); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 5, function_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class argument_list_return extends ParserRuleReturnScope {
        public List<LocalField> args;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument_list"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:142:1: argument_list returns [List<LocalField> args] : t= type i1= IDENTIFIER ( COMMA t2= type i2= IDENTIFIER )* ;
    public final GalaxyXParser.argument_list_return argument_list() throws RecognitionException {
        GalaxyXParser.argument_list_return retval = new GalaxyXParser.argument_list_return();
        retval.start = input.LT(1);
        int argument_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token i1=null;
        Token i2=null;
        Token COMMA28=null;
        GalaxyXParser.type_return t = null;

        GalaxyXParser.type_return t2 = null;


        CommonTree i1_tree=null;
        CommonTree i2_tree=null;
        CommonTree COMMA28_tree=null;


        	retval.args = new ArrayList<LocalField>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:146:2: (t= type i1= IDENTIFIER ( COMMA t2= type i2= IDENTIFIER )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:146:4: t= type i1= IDENTIFIER ( COMMA t2= type i2= IDENTIFIER )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_type_in_argument_list354);
            t=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
            i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argument_list358); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i1_tree = (CommonTree)adaptor.create(i1);
            root_0 = (CommonTree)adaptor.becomeRoot(i1_tree, root_0);
            }
            if ( state.backtracking==0 ) {

              		retval.args.add(new LocalField((i1!=null?i1.getText():null),(t!=null?t.t:null)));
              	
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:150:4: ( COMMA t2= type i2= IDENTIFIER )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:150:5: COMMA t2= type i2= IDENTIFIER
            	    {
            	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_list369); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA28_tree = (CommonTree)adaptor.create(COMMA28);
            	    adaptor.addChild(root_0, COMMA28_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_argument_list373);
            	    t2=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, t2.getTree());
            	    i2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argument_list377); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    i2_tree = (CommonTree)adaptor.create(i2);
            	    adaptor.addChild(root_0, i2_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	      retval.args.add(new LocalField((i2!=null?i2.getText():null),(t2!=null?t2.t:null)));
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
            if ( state.backtracking>0 ) { memoize(input, 6, argument_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "argument_list"

    public static class class_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:153:1: class_decl : ( (m= modifier )? ) CLASS c= IDENTIFIER ( LBRACK i= INTEGER RBRACK )? ( EXTENDS IDENTIFIER )? COLON ( function | field_decl | typedef_decl | constr_decl | destr_decl )* END CLASS ;
    public final GalaxyXParser.class_decl_return class_decl() throws RecognitionException {
        GalaxyXParser.class_decl_return retval = new GalaxyXParser.class_decl_return();
        retval.start = input.LT(1);
        int class_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token c=null;
        Token i=null;
        Token CLASS29=null;
        Token LBRACK30=null;
        Token RBRACK31=null;
        Token EXTENDS32=null;
        Token IDENTIFIER33=null;
        Token COLON34=null;
        Token END40=null;
        Token CLASS41=null;
        GalaxyXParser.modifier_return m = null;

        GalaxyXParser.function_return function35 = null;

        GalaxyXParser.field_decl_return field_decl36 = null;

        GalaxyXParser.typedef_decl_return typedef_decl37 = null;

        GalaxyXParser.constr_decl_return constr_decl38 = null;

        GalaxyXParser.destr_decl_return destr_decl39 = null;


        CommonTree c_tree=null;
        CommonTree i_tree=null;
        CommonTree CLASS29_tree=null;
        CommonTree LBRACK30_tree=null;
        CommonTree RBRACK31_tree=null;
        CommonTree EXTENDS32_tree=null;
        CommonTree IDENTIFIER33_tree=null;
        CommonTree COLON34_tree=null;
        CommonTree END40_tree=null;
        CommonTree CLASS41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:154:2: ( ( (m= modifier )? ) CLASS c= IDENTIFIER ( LBRACK i= INTEGER RBRACK )? ( EXTENDS IDENTIFIER )? COLON ( function | field_decl | typedef_decl | constr_decl | destr_decl )* END CLASS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:154:4: ( (m= modifier )? ) CLASS c= IDENTIFIER ( LBRACK i= INTEGER RBRACK )? ( EXTENDS IDENTIFIER )? COLON ( function | field_decl | typedef_decl | constr_decl | destr_decl )* END CLASS
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:154:4: ( (m= modifier )? )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:154:5: (m= modifier )?
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:154:6: (m= modifier )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=PUBLIC && LA12_0<=PRIVATE)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: m= modifier
                    {
                    pushFollow(FOLLOW_modifier_in_class_decl396);
                    m=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, m.getTree());

                    }
                    break;

            }


            }

            CLASS29=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl401); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS29_tree = (CommonTree)adaptor.create(CLASS29);
            root_0 = (CommonTree)adaptor.becomeRoot(CLASS29_tree, root_0);
            }
            c=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl406); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            c_tree = (CommonTree)adaptor.create(c);
            adaptor.addChild(root_0, c_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:154:39: ( LBRACK i= INTEGER RBRACK )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:154:40: LBRACK i= INTEGER RBRACK
                    {
                    LBRACK30=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_class_decl409); if (state.failed) return retval;
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_class_decl414); if (state.failed) return retval;
                    RBRACK31=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_class_decl417); if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:154:69: ( EXTENDS IDENTIFIER )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EXTENDS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:154:70: EXTENDS IDENTIFIER
                    {
                    EXTENDS32=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_class_decl423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS32_tree = (CommonTree)adaptor.create(EXTENDS32);
                    adaptor.addChild(root_0, EXTENDS32_tree);
                    }
                    IDENTIFIER33=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_decl425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER33_tree = (CommonTree)adaptor.create(IDENTIFIER33);
                    adaptor.addChild(root_0, IDENTIFIER33_tree);
                    }

                    }
                    break;

            }

            COLON34=(Token)match(input,COLON,FOLLOW_COLON_in_class_decl429); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		if(namespace.isClassInNamespace((c!=null?c.getText():null))){
              			Error.printError((c!=null?c.getLine():0),c.getCharPositionInLine() ,"Class is allready defined within namespace.");
              		}else{
              			boolean pub = m == null? false : (m!=null?input.toString(m.start,m.stop):null).equals("public");
              			boolean pri = m == null? false : (m!=null?input.toString(m.start,m.stop):null).equals("private");
              			int count = (i == null ? DefaultValues.DEFAULT_CLASS_COUNT : Integer.parseInt((i!=null?i.getText():null)));
              			cl = new Class((c!=null?c.getText():null),pub,pri,count,namespace);
              		}
              	
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:4: ( function | field_decl | typedef_decl | constr_decl | destr_decl )*
            loop15:
            do {
                int alt15=6;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:5: function
            	    {
            	    pushFollow(FOLLOW_function_in_class_decl439);
            	    function35=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function35.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:16: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_class_decl443);
            	    field_decl36=field_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_decl36.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:29: typedef_decl
            	    {
            	    pushFollow(FOLLOW_typedef_decl_in_class_decl447);
            	    typedef_decl37=typedef_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedef_decl37.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:44: constr_decl
            	    {
            	    pushFollow(FOLLOW_constr_decl_in_class_decl451);
            	    constr_decl38=constr_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, constr_decl38.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:58: destr_decl
            	    {
            	    pushFollow(FOLLOW_destr_decl_in_class_decl455);
            	    destr_decl39=destr_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, destr_decl39.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            END40=(Token)match(input,END,FOLLOW_END_in_class_decl462); if (state.failed) return retval;
            CLASS41=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_decl465); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 7, class_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class constr_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constr_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:172:1: constr_decl : c= CONSTRUCTOR LPAREN (args= argument_list )? RPAREN COLON (local= local_var_decl )* ( statement )* END CONSTRUCTOR ;
    public final GalaxyXParser.constr_decl_return constr_decl() throws RecognitionException {
        GalaxyXParser.constr_decl_return retval = new GalaxyXParser.constr_decl_return();
        retval.start = input.LT(1);
        int constr_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token c=null;
        Token LPAREN42=null;
        Token RPAREN43=null;
        Token COLON44=null;
        Token END46=null;
        Token CONSTRUCTOR47=null;
        GalaxyXParser.argument_list_return args = null;

        GalaxyXParser.local_var_decl_return local = null;

        GalaxyXParser.statement_return statement45 = null;


        CommonTree c_tree=null;
        CommonTree LPAREN42_tree=null;
        CommonTree RPAREN43_tree=null;
        CommonTree COLON44_tree=null;
        CommonTree END46_tree=null;
        CommonTree CONSTRUCTOR47_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:173:2: (c= CONSTRUCTOR LPAREN (args= argument_list )? RPAREN COLON (local= local_var_decl )* ( statement )* END CONSTRUCTOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:173:4: c= CONSTRUCTOR LPAREN (args= argument_list )? RPAREN COLON (local= local_var_decl )* ( statement )* END CONSTRUCTOR
            {
            root_0 = (CommonTree)adaptor.nil();

            c=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constr_decl483); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            c_tree = (CommonTree)adaptor.create(c);
            root_0 = (CommonTree)adaptor.becomeRoot(c_tree, root_0);
            }
            LPAREN42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constr_decl486); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:173:31: (args= argument_list )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: args= argument_list
                    {
                    pushFollow(FOLLOW_argument_list_in_constr_decl491);
                    args=argument_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args.getTree());

                    }
                    break;

            }

            RPAREN43=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constr_decl494); if (state.failed) return retval;
            COLON44=(Token)match(input,COLON,FOLLOW_COLON_in_constr_decl497); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON44_tree = (CommonTree)adaptor.create(COLON44);
            adaptor.addChild(root_0, COLON44_tree);
            }
            if ( state.backtracking==0 ) {

              	  	method = new Constructor(cl);
              		if(args != null){
              			for(LocalField f:(args!=null?args.args:null)){
              				if(!method.addLocal(f,true)){
              					Error.printError("Variable "+f+" already defined for method $1",c);
              				}
              			}
              		}
              		if(cl.isConstructorDefined(method.toString())){
              			Error.printError("Constructor with same declaration header is already defined",c);
              		}else{
              			cl.addConstructor((Constructor)method);
              		}
              	  
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:189:4: (local= local_var_decl )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:189:5: local= local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_constr_decl510);
            	    local=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local.getTree());
            	    if ( state.backtracking==0 ) {

            	      		if(!method.addLocal((local!=null?local.local:null),false)){
            	      			Error.printError("Variable "+(local!=null?local.local:null)+" already defined for method $1",c);
            	      		}
            	      	  
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:196:4: ( statement )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constr_decl526);
            	    statement45=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement45.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            END46=(Token)match(input,END,FOLLOW_END_in_constr_decl532); if (state.failed) return retval;
            CONSTRUCTOR47=(Token)match(input,CONSTRUCTOR,FOLLOW_CONSTRUCTOR_in_constr_decl535); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 8, constr_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constr_decl"

    public static class destr_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "destr_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:200:1: destr_decl : d= DESTRUCTOR LPAREN (args= argument_list )? RPAREN COLON (local= local_var_decl )* ( statement )* END DESTRUCTOR ;
    public final GalaxyXParser.destr_decl_return destr_decl() throws RecognitionException {
        GalaxyXParser.destr_decl_return retval = new GalaxyXParser.destr_decl_return();
        retval.start = input.LT(1);
        int destr_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token d=null;
        Token LPAREN48=null;
        Token RPAREN49=null;
        Token COLON50=null;
        Token END52=null;
        Token DESTRUCTOR53=null;
        GalaxyXParser.argument_list_return args = null;

        GalaxyXParser.local_var_decl_return local = null;

        GalaxyXParser.statement_return statement51 = null;


        CommonTree d_tree=null;
        CommonTree LPAREN48_tree=null;
        CommonTree RPAREN49_tree=null;
        CommonTree COLON50_tree=null;
        CommonTree END52_tree=null;
        CommonTree DESTRUCTOR53_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:201:2: (d= DESTRUCTOR LPAREN (args= argument_list )? RPAREN COLON (local= local_var_decl )* ( statement )* END DESTRUCTOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:201:4: d= DESTRUCTOR LPAREN (args= argument_list )? RPAREN COLON (local= local_var_decl )* ( statement )* END DESTRUCTOR
            {
            root_0 = (CommonTree)adaptor.nil();

            d=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destr_decl549); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            d_tree = (CommonTree)adaptor.create(d);
            root_0 = (CommonTree)adaptor.becomeRoot(d_tree, root_0);
            }
            LPAREN48=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_destr_decl552); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:201:30: (args= argument_list )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: args= argument_list
                    {
                    pushFollow(FOLLOW_argument_list_in_destr_decl557);
                    args=argument_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args.getTree());

                    }
                    break;

            }

            RPAREN49=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_destr_decl560); if (state.failed) return retval;
            COLON50=(Token)match(input,COLON,FOLLOW_COLON_in_destr_decl563); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON50_tree = (CommonTree)adaptor.create(COLON50);
            adaptor.addChild(root_0, COLON50_tree);
            }
            if ( state.backtracking==0 ) {

              	  	method = new Destructor(cl);
              		if(args != null){
              			for(LocalField f:(args!=null?args.args:null)){
              				if(!method.addLocal(f,true)){
              					Error.printError("Variable "+f+" already defined for method $1",d);
              				}
              			}
              		}
              		if(cl.isDestructorDefined(method.toString())){
              			Error.printError("Constructor with same declaration header is already defined",d);
              		}else{
              			cl.addDestructor((Destructor)method);
              		}
              	  
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:217:4: (local= local_var_decl )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:217:5: local= local_var_decl
            	    {
            	    pushFollow(FOLLOW_local_var_decl_in_destr_decl576);
            	    local=local_var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, local.getTree());
            	    if ( state.backtracking==0 ) {

            	      		if(!method.addLocal((local!=null?local.local:null),false)){
            	      			Error.printError("Variable "+(local!=null?local.local:null)+" already defined for method $1",d);
            	      		}
            	      	  
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:223:4: ( statement )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_destr_decl589);
            	    statement51=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement51.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            END52=(Token)match(input,END,FOLLOW_END_in_destr_decl595); if (state.failed) return retval;
            DESTRUCTOR53=(Token)match(input,DESTRUCTOR,FOLLOW_DESTRUCTOR_in_destr_decl598); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 9, destr_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "destr_decl"

    public static class modifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:227:1: modifier : ( PUBLIC | PRIVATE );
    public final GalaxyXParser.modifier_return modifier() throws RecognitionException {
        GalaxyXParser.modifier_return retval = new GalaxyXParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set54=null;

        CommonTree set54_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:228:2: ( PUBLIC | PRIVATE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set54=(Token)input.LT(1);
            if ( (input.LA(1)>=PUBLIC && input.LA(1)<=PRIVATE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set54));
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
            if ( state.backtracking>0 ) { memoize(input, 10, modifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class local_var_decl_return extends ParserRuleReturnScope {
        public LocalField local;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "local_var_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:231:1: local_var_decl returns [LocalField local] : t= type (array= array_decl )? i= IDENTIFIER ( ASSGN expression )? SEMI ;
    public final GalaxyXParser.local_var_decl_return local_var_decl() throws RecognitionException {
        GalaxyXParser.local_var_decl_return retval = new GalaxyXParser.local_var_decl_return();
        retval.start = input.LT(1);
        int local_var_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token i=null;
        Token ASSGN55=null;
        Token SEMI57=null;
        GalaxyXParser.type_return t = null;

        GalaxyXParser.array_decl_return array = null;

        GalaxyXParser.expression_return expression56 = null;


        CommonTree i_tree=null;
        CommonTree ASSGN55_tree=null;
        CommonTree SEMI57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:232:2: (t= type (array= array_decl )? i= IDENTIFIER ( ASSGN expression )? SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:232:4: t= type (array= array_decl )? i= IDENTIFIER ( ASSGN expression )? SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_type_in_local_var_decl632);
            t=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:232:16: (array= array_decl )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LBRACK) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: array= array_decl
                    {
                    pushFollow(FOLLOW_array_decl_in_local_var_decl636);
                    array=array_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array.getTree());

                    }
                    break;

            }

            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_local_var_decl641); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i_tree = (CommonTree)adaptor.create(i);
            root_0 = (CommonTree)adaptor.becomeRoot(i_tree, root_0);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:232:43: ( ASSGN expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ASSGN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:232:44: ASSGN expression
                    {
                    ASSGN55=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_local_var_decl645); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSGN55_tree = (CommonTree)adaptor.create(ASSGN55);
                    root_0 = (CommonTree)adaptor.becomeRoot(ASSGN55_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_local_var_decl648);
                    expression56=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression56.getTree());

                    }
                    break;

            }

            SEMI57=(Token)match(input,SEMI,FOLLOW_SEMI_in_local_var_decl652); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		retval.local = new LocalField((i!=null?i.getText():null),(t!=null?t.t:null),array != null,(array!=null?array.i:0));
              	
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
            if ( state.backtracking>0 ) { memoize(input, 11, local_var_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "local_var_decl"

    public static class field_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:238:1: field_decl : (m= modifier )? (s= STATIC )? (c= CONST )? t= type (array= array_decl )? i= IDENTIFIER ( ASSGN expression )? SEMI ;
    public final GalaxyXParser.field_decl_return field_decl() throws RecognitionException {
        GalaxyXParser.field_decl_return retval = new GalaxyXParser.field_decl_return();
        retval.start = input.LT(1);
        int field_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token s=null;
        Token c=null;
        Token i=null;
        Token ASSGN58=null;
        Token SEMI60=null;
        GalaxyXParser.modifier_return m = null;

        GalaxyXParser.type_return t = null;

        GalaxyXParser.array_decl_return array = null;

        GalaxyXParser.expression_return expression59 = null;


        CommonTree s_tree=null;
        CommonTree c_tree=null;
        CommonTree i_tree=null;
        CommonTree ASSGN58_tree=null;
        CommonTree SEMI60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:2: ( (m= modifier )? (s= STATIC )? (c= CONST )? t= type (array= array_decl )? i= IDENTIFIER ( ASSGN expression )? SEMI )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:4: (m= modifier )? (s= STATIC )? (c= CONST )? t= type (array= array_decl )? i= IDENTIFIER ( ASSGN expression )? SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:4: (m= modifier )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:5: m= modifier
                    {
                    pushFollow(FOLLOW_modifier_in_field_decl671);
                    m=modifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:19: (s= STATIC )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:20: s= STATIC
                    {
                    s=(Token)match(input,STATIC,FOLLOW_STATIC_in_field_decl679); if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:33: (c= CONST )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: c= CONST
                    {
                    c=(Token)match(input,CONST,FOLLOW_CONST_in_field_decl686); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    c_tree = (CommonTree)adaptor.create(c);
                    adaptor.addChild(root_0, c_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_field_decl691);
            t=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(t.getTree(), root_0);
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:54: (array= array_decl )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LBRACK) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: array= array_decl
                    {
                    pushFollow(FOLLOW_array_decl_in_field_decl696);
                    array=array_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array.getTree());

                    }
                    break;

            }

            i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_decl701); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i_tree = (CommonTree)adaptor.create(i);
            adaptor.addChild(root_0, i_tree);
            }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:81: ( ASSGN expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ASSGN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:239:82: ASSGN expression
                    {
                    ASSGN58=(Token)match(input,ASSGN,FOLLOW_ASSGN_in_field_decl705); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSGN58_tree = (CommonTree)adaptor.create(ASSGN58);
                    adaptor.addChild(root_0, ASSGN58_tree);
                    }
                    pushFollow(FOLLOW_expression_in_field_decl707);
                    expression59=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression59.getTree());

                    }
                    break;

            }

            SEMI60=(Token)match(input,SEMI,FOLLOW_SEMI_in_field_decl711); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              		boolean pub = m == null? false : (m!=null?input.toString(m.start,m.stop):null).equals("public");
              		boolean pri = m == null? false : (m!=null?input.toString(m.start,m.stop):null).equals("private");
              		Field f = new Field((i!=null?i.getText():null),(t!=null?t.t:null),s == null,pri,pub,array != null,(array!=null?array.i:0));
              		if(cl == null){
              			if(namespace.containsField(f.getName())){
              				Error.printError("Field "+f.getName()+" already defined for namespace "+namespace,i);
              			}else{
              				namespace.addField(f.getName(),f);
              			}
              		}else{
              			if(cl.containsField(f.getName())){
              				Error.printError("Field "+f.getName()+" already defined for class "+cl.getName(),i);
              			}else{
              				namespace.addField(f.getName(),f);
              			}
              		}
              	
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
            if ( state.backtracking>0 ) { memoize(input, 12, field_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field_decl"

    public static class array_decl_return extends ParserRuleReturnScope {
        public int i;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_decl"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:260:1: array_decl returns [int i] : ( LBRACK expression RBRACK )+ ;
    public final GalaxyXParser.array_decl_return array_decl() throws RecognitionException {
        GalaxyXParser.array_decl_return retval = new GalaxyXParser.array_decl_return();
        retval.start = input.LT(1);
        int array_decl_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LBRACK61=null;
        Token RBRACK63=null;
        GalaxyXParser.expression_return expression62 = null;


        CommonTree LBRACK61_tree=null;
        CommonTree RBRACK63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:261:2: ( ( LBRACK expression RBRACK )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:261:4: ( LBRACK expression RBRACK )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:261:4: ( LBRACK expression RBRACK )+
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:261:5: LBRACK expression RBRACK
            	    {
            	    LBRACK61=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_decl732); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LBRACK61_tree = (CommonTree)adaptor.create(LBRACK61);
            	    adaptor.addChild(root_0, LBRACK61_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_array_decl734);
            	    expression62=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression62.getTree());
            	    RBRACK63=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_decl736); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RBRACK63_tree = (CommonTree)adaptor.create(RBRACK63);
            	    adaptor.addChild(root_0, RBRACK63_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	      retval.i++;
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
            if ( state.backtracking>0 ) { memoize(input, 13, array_decl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array_decl"

    public static class assignment_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_operator"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:264:1: assignment_operator : ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR );
    public final GalaxyXParser.assignment_operator_return assignment_operator() throws RecognitionException {
        GalaxyXParser.assignment_operator_return retval = new GalaxyXParser.assignment_operator_return();
        retval.start = input.LT(1);
        int assignment_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set64=null;

        CommonTree set64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:265:2: ( ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set64=(Token)input.LT(1);
            if ( input.LA(1)==ASSGN||(input.LA(1)>=ASSGNP && input.LA(1)<=ASSGNBITXOR) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set64));
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
        public Type t;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:278:1: type returns [Type t] : ( (ns= IDENTIFIER NAMESPACE_ACCESS )? i= IDENTIFIER | BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | VOID );
    public final GalaxyXParser.type_return type() throws RecognitionException {
        GalaxyXParser.type_return retval = new GalaxyXParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ns=null;
        Token i=null;
        Token NAMESPACE_ACCESS65=null;
        Token BOOLEAN66=null;
        Token BYTE67=null;
        Token CHAR68=null;
        Token FIXED69=null;
        Token GAMELINK70=null;
        Token COLOR71=null;
        Token INT72=null;
        Token POINT73=null;
        Token STRING74=null;
        Token ABILCMD75=null;
        Token ACTOR76=null;
        Token ACTORSCOPE77=null;
        Token BANK78=null;
        Token CAMERAINFO79=null;
        Token MARKER80=null;
        Token ORDER81=null;
        Token PLAYERGROUP82=null;
        Token REGION83=null;
        Token REVEALER84=null;
        Token SOUNDLINK85=null;
        Token TEXT86=null;
        Token TIMER87=null;
        Token TRANSMISSIONSOURCE88=null;
        Token TRIGGER89=null;
        Token UNITFILTER90=null;
        Token UNITGROUP91=null;
        Token UNITREF92=null;
        Token UNIT93=null;
        Token WAVEINFO94=null;
        Token WAVETARGET95=null;
        Token DOODAD96=null;
        Token AIFILTER97=null;
        Token SOUND98=null;
        Token WAVE99=null;
        Token VOID100=null;

        CommonTree ns_tree=null;
        CommonTree i_tree=null;
        CommonTree NAMESPACE_ACCESS65_tree=null;
        CommonTree BOOLEAN66_tree=null;
        CommonTree BYTE67_tree=null;
        CommonTree CHAR68_tree=null;
        CommonTree FIXED69_tree=null;
        CommonTree GAMELINK70_tree=null;
        CommonTree COLOR71_tree=null;
        CommonTree INT72_tree=null;
        CommonTree POINT73_tree=null;
        CommonTree STRING74_tree=null;
        CommonTree ABILCMD75_tree=null;
        CommonTree ACTOR76_tree=null;
        CommonTree ACTORSCOPE77_tree=null;
        CommonTree BANK78_tree=null;
        CommonTree CAMERAINFO79_tree=null;
        CommonTree MARKER80_tree=null;
        CommonTree ORDER81_tree=null;
        CommonTree PLAYERGROUP82_tree=null;
        CommonTree REGION83_tree=null;
        CommonTree REVEALER84_tree=null;
        CommonTree SOUNDLINK85_tree=null;
        CommonTree TEXT86_tree=null;
        CommonTree TIMER87_tree=null;
        CommonTree TRANSMISSIONSOURCE88_tree=null;
        CommonTree TRIGGER89_tree=null;
        CommonTree UNITFILTER90_tree=null;
        CommonTree UNITGROUP91_tree=null;
        CommonTree UNITREF92_tree=null;
        CommonTree UNIT93_tree=null;
        CommonTree WAVEINFO94_tree=null;
        CommonTree WAVETARGET95_tree=null;
        CommonTree DOODAD96_tree=null;
        CommonTree AIFILTER97_tree=null;
        CommonTree SOUND98_tree=null;
        CommonTree WAVE99_tree=null;
        CommonTree VOID100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:279:2: ( (ns= IDENTIFIER NAMESPACE_ACCESS )? i= IDENTIFIER | BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | VOID )
            int alt31=36;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:279:4: (ns= IDENTIFIER NAMESPACE_ACCESS )? i= IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:279:4: (ns= IDENTIFIER NAMESPACE_ACCESS )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==NAMESPACE_ACCESS) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:279:5: ns= IDENTIFIER NAMESPACE_ACCESS
                            {
                            ns=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type819); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ns_tree = (CommonTree)adaptor.create(ns);
                            adaptor.addChild(root_0, ns_tree);
                            }
                            NAMESPACE_ACCESS65=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_type821); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NAMESPACE_ACCESS65_tree = (CommonTree)adaptor.create(NAMESPACE_ACCESS65);
                            adaptor.addChild(root_0, NAMESPACE_ACCESS65_tree);
                            }

                            }
                            break;

                    }

                    i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    i_tree = (CommonTree)adaptor.create(i);
                    adaptor.addChild(root_0, i_tree);
                    }
                    if ( state.backtracking==0 ) {
                      String prefix = ns == null ? namespace.toString() : (ns!=null?ns.getText():null);
                      		 if(Type.customTypeExists(prefix + "_" + (i!=null?i.getText():null))){
                      			retval.t = Type.getCustomType(prefix + "_" + (i!=null?i.getText():null));
                      		 }else{
                      		 	retval.t = Type.TypeCustomTemplate(prefix + "_" + (i!=null?i.getText():null));
                      		 }
                      		
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:287:4: BOOLEAN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BOOLEAN66=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN66_tree = (CommonTree)adaptor.create(BOOLEAN66);
                    adaptor.addChild(root_0, BOOLEAN66_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Boolean;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:288:4: BYTE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BYTE67=(Token)match(input,BYTE,FOLLOW_BYTE_in_type844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BYTE67_tree = (CommonTree)adaptor.create(BYTE67);
                    adaptor.addChild(root_0, BYTE67_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Byte;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:289:4: CHAR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR68=(Token)match(input,CHAR,FOLLOW_CHAR_in_type851); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR68_tree = (CommonTree)adaptor.create(CHAR68);
                    adaptor.addChild(root_0, CHAR68_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Char;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:290:4: FIXED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FIXED69=(Token)match(input,FIXED,FOLLOW_FIXED_in_type858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FIXED69_tree = (CommonTree)adaptor.create(FIXED69);
                    adaptor.addChild(root_0, FIXED69_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Fixed;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:291:4: GAMELINK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GAMELINK70=(Token)match(input,GAMELINK,FOLLOW_GAMELINK_in_type865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GAMELINK70_tree = (CommonTree)adaptor.create(GAMELINK70);
                    adaptor.addChild(root_0, GAMELINK70_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Gamelink;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:292:4: COLOR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COLOR71=(Token)match(input,COLOR,FOLLOW_COLOR_in_type872); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLOR71_tree = (CommonTree)adaptor.create(COLOR71);
                    adaptor.addChild(root_0, COLOR71_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Color;
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:293:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT72=(Token)match(input,INT,FOLLOW_INT_in_type879); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT72_tree = (CommonTree)adaptor.create(INT72);
                    adaptor.addChild(root_0, INT72_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Integer;
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:294:4: POINT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    POINT73=(Token)match(input,POINT,FOLLOW_POINT_in_type886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    POINT73_tree = (CommonTree)adaptor.create(POINT73);
                    adaptor.addChild(root_0, POINT73_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Point;
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:295:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING74=(Token)match(input,STRING,FOLLOW_STRING_in_type893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING74_tree = (CommonTree)adaptor.create(STRING74);
                    adaptor.addChild(root_0, STRING74_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.String;
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:296:4: ABILCMD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ABILCMD75=(Token)match(input,ABILCMD,FOLLOW_ABILCMD_in_type900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ABILCMD75_tree = (CommonTree)adaptor.create(ABILCMD75);
                    adaptor.addChild(root_0, ABILCMD75_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Abilcmd;
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:297:4: ACTOR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACTOR76=(Token)match(input,ACTOR,FOLLOW_ACTOR_in_type907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ACTOR76_tree = (CommonTree)adaptor.create(ACTOR76);
                    adaptor.addChild(root_0, ACTOR76_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Actor;
                    }

                    }
                    break;
                case 13 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:298:4: ACTORSCOPE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ACTORSCOPE77=(Token)match(input,ACTORSCOPE,FOLLOW_ACTORSCOPE_in_type914); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ACTORSCOPE77_tree = (CommonTree)adaptor.create(ACTORSCOPE77);
                    adaptor.addChild(root_0, ACTORSCOPE77_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Actorscope;
                    }

                    }
                    break;
                case 14 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:299:4: BANK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BANK78=(Token)match(input,BANK,FOLLOW_BANK_in_type921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANK78_tree = (CommonTree)adaptor.create(BANK78);
                    adaptor.addChild(root_0, BANK78_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Bank;
                    }

                    }
                    break;
                case 15 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:300:4: CAMERAINFO
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CAMERAINFO79=(Token)match(input,CAMERAINFO,FOLLOW_CAMERAINFO_in_type928); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAMERAINFO79_tree = (CommonTree)adaptor.create(CAMERAINFO79);
                    adaptor.addChild(root_0, CAMERAINFO79_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Camerainfo;
                    }

                    }
                    break;
                case 16 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:301:4: MARKER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MARKER80=(Token)match(input,MARKER,FOLLOW_MARKER_in_type935); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MARKER80_tree = (CommonTree)adaptor.create(MARKER80);
                    adaptor.addChild(root_0, MARKER80_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Marker;
                    }

                    }
                    break;
                case 17 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:302:4: ORDER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ORDER81=(Token)match(input,ORDER,FOLLOW_ORDER_in_type942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ORDER81_tree = (CommonTree)adaptor.create(ORDER81);
                    adaptor.addChild(root_0, ORDER81_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Order;
                    }

                    }
                    break;
                case 18 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:303:4: PLAYERGROUP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLAYERGROUP82=(Token)match(input,PLAYERGROUP,FOLLOW_PLAYERGROUP_in_type949); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLAYERGROUP82_tree = (CommonTree)adaptor.create(PLAYERGROUP82);
                    adaptor.addChild(root_0, PLAYERGROUP82_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Playergroup;
                    }

                    }
                    break;
                case 19 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:304:4: REGION
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REGION83=(Token)match(input,REGION,FOLLOW_REGION_in_type956); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGION83_tree = (CommonTree)adaptor.create(REGION83);
                    adaptor.addChild(root_0, REGION83_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Region;
                    }

                    }
                    break;
                case 20 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:305:4: REVEALER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REVEALER84=(Token)match(input,REVEALER,FOLLOW_REVEALER_in_type963); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REVEALER84_tree = (CommonTree)adaptor.create(REVEALER84);
                    adaptor.addChild(root_0, REVEALER84_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Revealer;
                    }

                    }
                    break;
                case 21 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:306:4: SOUNDLINK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SOUNDLINK85=(Token)match(input,SOUNDLINK,FOLLOW_SOUNDLINK_in_type970); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SOUNDLINK85_tree = (CommonTree)adaptor.create(SOUNDLINK85);
                    adaptor.addChild(root_0, SOUNDLINK85_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Soundlink;
                    }

                    }
                    break;
                case 22 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:307:4: TEXT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TEXT86=(Token)match(input,TEXT,FOLLOW_TEXT_in_type977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TEXT86_tree = (CommonTree)adaptor.create(TEXT86);
                    adaptor.addChild(root_0, TEXT86_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Text;
                    }

                    }
                    break;
                case 23 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:308:4: TIMER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TIMER87=(Token)match(input,TIMER,FOLLOW_TIMER_in_type984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIMER87_tree = (CommonTree)adaptor.create(TIMER87);
                    adaptor.addChild(root_0, TIMER87_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Timer;
                    }

                    }
                    break;
                case 24 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:309:4: TRANSMISSIONSOURCE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TRANSMISSIONSOURCE88=(Token)match(input,TRANSMISSIONSOURCE,FOLLOW_TRANSMISSIONSOURCE_in_type991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRANSMISSIONSOURCE88_tree = (CommonTree)adaptor.create(TRANSMISSIONSOURCE88);
                    adaptor.addChild(root_0, TRANSMISSIONSOURCE88_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Transmissionsource;
                    }

                    }
                    break;
                case 25 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:310:4: TRIGGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TRIGGER89=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_type998); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRIGGER89_tree = (CommonTree)adaptor.create(TRIGGER89);
                    adaptor.addChild(root_0, TRIGGER89_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Trigger;
                    }

                    }
                    break;
                case 26 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:311:4: UNITFILTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNITFILTER90=(Token)match(input,UNITFILTER,FOLLOW_UNITFILTER_in_type1005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNITFILTER90_tree = (CommonTree)adaptor.create(UNITFILTER90);
                    adaptor.addChild(root_0, UNITFILTER90_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Unitfilter;
                    }

                    }
                    break;
                case 27 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:312:4: UNITGROUP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNITGROUP91=(Token)match(input,UNITGROUP,FOLLOW_UNITGROUP_in_type1012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNITGROUP91_tree = (CommonTree)adaptor.create(UNITGROUP91);
                    adaptor.addChild(root_0, UNITGROUP91_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Unitgroup;
                    }

                    }
                    break;
                case 28 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:313:4: UNITREF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNITREF92=(Token)match(input,UNITREF,FOLLOW_UNITREF_in_type1019); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNITREF92_tree = (CommonTree)adaptor.create(UNITREF92);
                    adaptor.addChild(root_0, UNITREF92_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Unitref;
                    }

                    }
                    break;
                case 29 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:314:4: UNIT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNIT93=(Token)match(input,UNIT,FOLLOW_UNIT_in_type1026); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNIT93_tree = (CommonTree)adaptor.create(UNIT93);
                    adaptor.addChild(root_0, UNIT93_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Unit;
                    }

                    }
                    break;
                case 30 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:315:4: WAVEINFO
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAVEINFO94=(Token)match(input,WAVEINFO,FOLLOW_WAVEINFO_in_type1033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WAVEINFO94_tree = (CommonTree)adaptor.create(WAVEINFO94);
                    adaptor.addChild(root_0, WAVEINFO94_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Waveinfo;
                    }

                    }
                    break;
                case 31 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:316:4: WAVETARGET
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAVETARGET95=(Token)match(input,WAVETARGET,FOLLOW_WAVETARGET_in_type1040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WAVETARGET95_tree = (CommonTree)adaptor.create(WAVETARGET95);
                    adaptor.addChild(root_0, WAVETARGET95_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Wavetarget;
                    }

                    }
                    break;
                case 32 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:317:4: DOODAD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOODAD96=(Token)match(input,DOODAD,FOLLOW_DOODAD_in_type1047); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOODAD96_tree = (CommonTree)adaptor.create(DOODAD96);
                    adaptor.addChild(root_0, DOODAD96_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Doodad;
                    }

                    }
                    break;
                case 33 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:318:4: AIFILTER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    AIFILTER97=(Token)match(input,AIFILTER,FOLLOW_AIFILTER_in_type1054); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AIFILTER97_tree = (CommonTree)adaptor.create(AIFILTER97);
                    adaptor.addChild(root_0, AIFILTER97_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.AIFilter;
                    }

                    }
                    break;
                case 34 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:319:4: SOUND
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SOUND98=(Token)match(input,SOUND,FOLLOW_SOUND_in_type1061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SOUND98_tree = (CommonTree)adaptor.create(SOUND98);
                    adaptor.addChild(root_0, SOUND98_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Sound;
                    }

                    }
                    break;
                case 35 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:320:4: WAVE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WAVE99=(Token)match(input,WAVE,FOLLOW_WAVE_in_type1068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WAVE99_tree = (CommonTree)adaptor.create(WAVE99);
                    adaptor.addChild(root_0, WAVE99_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Wave;
                    }

                    }
                    break;
                case 36 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:321:5: VOID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VOID100=(Token)match(input,VOID,FOLLOW_VOID_in_type1076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID100_tree = (CommonTree)adaptor.create(VOID100);
                    adaptor.addChild(root_0, VOID100_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.t = Type.Void;
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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:325:1: argument_expression_list : assignment_expression ( COMMA assignment_expression )* ;
    public final GalaxyXParser.argument_expression_list_return argument_expression_list() throws RecognitionException {
        GalaxyXParser.argument_expression_list_return retval = new GalaxyXParser.argument_expression_list_return();
        retval.start = input.LT(1);
        int argument_expression_list_StartIndex = input.index();
        CommonTree root_0 = null;

        Token COMMA102=null;
        GalaxyXParser.assignment_expression_return assignment_expression101 = null;

        GalaxyXParser.assignment_expression_return assignment_expression103 = null;


        CommonTree COMMA102_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:326:2: ( assignment_expression ( COMMA assignment_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:326:6: assignment_expression ( COMMA assignment_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1093);
            assignment_expression101=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression101.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:326:28: ( COMMA assignment_expression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:326:29: COMMA assignment_expression
            	    {
            	    COMMA102=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_expression_list1096); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA102_tree = (CommonTree)adaptor.create(COMMA102);
            	    adaptor.addChild(root_0, COMMA102_tree);
            	    }
            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1098);
            	    assignment_expression103=assignment_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression103.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:329:1: additive_expression : ( multiplicative_expression ) ( PLUS multiplicative_expression | SUB multiplicative_expression )* ;
    public final GalaxyXParser.additive_expression_return additive_expression() throws RecognitionException {
        GalaxyXParser.additive_expression_return retval = new GalaxyXParser.additive_expression_return();
        retval.start = input.LT(1);
        int additive_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS105=null;
        Token SUB107=null;
        GalaxyXParser.multiplicative_expression_return multiplicative_expression104 = null;

        GalaxyXParser.multiplicative_expression_return multiplicative_expression106 = null;

        GalaxyXParser.multiplicative_expression_return multiplicative_expression108 = null;


        CommonTree PLUS105_tree=null;
        CommonTree SUB107_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:330:2: ( ( multiplicative_expression ) ( PLUS multiplicative_expression | SUB multiplicative_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:330:4: ( multiplicative_expression ) ( PLUS multiplicative_expression | SUB multiplicative_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:330:4: ( multiplicative_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:330:5: multiplicative_expression
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1112);
            multiplicative_expression104=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression104.getTree());

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:330:32: ( PLUS multiplicative_expression | SUB multiplicative_expression )*
            loop33:
            do {
                int alt33=3;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:330:33: PLUS multiplicative_expression
            	    {
            	    PLUS105=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression1116); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    PLUS105_tree = (CommonTree)adaptor.create(PLUS105);
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUS105_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1119);
            	    multiplicative_expression106=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression106.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:330:67: SUB multiplicative_expression
            	    {
            	    SUB107=(Token)match(input,SUB,FOLLOW_SUB_in_additive_expression1123); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SUB107_tree = (CommonTree)adaptor.create(SUB107);
            	    root_0 = (CommonTree)adaptor.becomeRoot(SUB107_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1126);
            	    multiplicative_expression108=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression108.getTree());

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
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:333:1: multiplicative_expression : modulo_expression ( TIMES modulo_expression | DIV modulo_expression )* ;
    public final GalaxyXParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        GalaxyXParser.multiplicative_expression_return retval = new GalaxyXParser.multiplicative_expression_return();
        retval.start = input.LT(1);
        int multiplicative_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token TIMES110=null;
        Token DIV112=null;
        GalaxyXParser.modulo_expression_return modulo_expression109 = null;

        GalaxyXParser.modulo_expression_return modulo_expression111 = null;

        GalaxyXParser.modulo_expression_return modulo_expression113 = null;


        CommonTree TIMES110_tree=null;
        CommonTree DIV112_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:334:2: ( modulo_expression ( TIMES modulo_expression | DIV modulo_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:334:4: modulo_expression ( TIMES modulo_expression | DIV modulo_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression1140);
            modulo_expression109=modulo_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression109.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:334:22: ( TIMES modulo_expression | DIV modulo_expression )*
            loop34:
            do {
                int alt34=3;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:334:23: TIMES modulo_expression
            	    {
            	    TIMES110=(Token)match(input,TIMES,FOLLOW_TIMES_in_multiplicative_expression1143); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TIMES110_tree = (CommonTree)adaptor.create(TIMES110);
            	    root_0 = (CommonTree)adaptor.becomeRoot(TIMES110_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression1146);
            	    modulo_expression111=modulo_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression111.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:334:50: DIV modulo_expression
            	    {
            	    DIV112=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicative_expression1150); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DIV112_tree = (CommonTree)adaptor.create(DIV112);
            	    root_0 = (CommonTree)adaptor.becomeRoot(DIV112_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_modulo_expression_in_multiplicative_expression1153);
            	    modulo_expression113=modulo_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, modulo_expression113.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 18, multiplicative_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class modulo_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modulo_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:337:1: modulo_expression : unary_expression ( MODULO unary_expression )* ;
    public final GalaxyXParser.modulo_expression_return modulo_expression() throws RecognitionException {
        GalaxyXParser.modulo_expression_return retval = new GalaxyXParser.modulo_expression_return();
        retval.start = input.LT(1);
        int modulo_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token MODULO115=null;
        GalaxyXParser.unary_expression_return unary_expression114 = null;

        GalaxyXParser.unary_expression_return unary_expression116 = null;


        CommonTree MODULO115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:338:2: ( unary_expression ( MODULO unary_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:338:4: unary_expression ( MODULO unary_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_modulo_expression1167);
            unary_expression114=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression114.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:338:21: ( MODULO unary_expression )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:338:22: MODULO unary_expression
            	    {
            	    MODULO115=(Token)match(input,MODULO,FOLLOW_MODULO_in_modulo_expression1170); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    MODULO115_tree = (CommonTree)adaptor.create(MODULO115);
            	    root_0 = (CommonTree)adaptor.becomeRoot(MODULO115_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_expression_in_modulo_expression1173);
            	    unary_expression116=unary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression116.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 19, modulo_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modulo_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:341:1: unary_expression : ( postfix_expression | unary_operator unary_expression );
    public final GalaxyXParser.unary_expression_return unary_expression() throws RecognitionException {
        GalaxyXParser.unary_expression_return retval = new GalaxyXParser.unary_expression_return();
        retval.start = input.LT(1);
        int unary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.postfix_expression_return postfix_expression117 = null;

        GalaxyXParser.unary_operator_return unary_operator118 = null;

        GalaxyXParser.unary_expression_return unary_expression119 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:342:2: ( postfix_expression | unary_operator unary_expression )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:342:4: postfix_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1187);
                    postfix_expression117=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression117.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:343:4: unary_operator unary_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unary_operator_in_unary_expression1192);
                    unary_operator118=unary_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(unary_operator118.getTree(), root_0);
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1195);
                    unary_expression119=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression119.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 20, unary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class postfix_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfix_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:346:1: postfix_expression : primary_expression ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT postfix_expression | NAMESPACE_ACCESS postfix_expression )* ;
    public final GalaxyXParser.postfix_expression_return postfix_expression() throws RecognitionException {
        GalaxyXParser.postfix_expression_return retval = new GalaxyXParser.postfix_expression_return();
        retval.start = input.LT(1);
        int postfix_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LBRACK121=null;
        Token RBRACK123=null;
        Token LPAREN124=null;
        Token RPAREN125=null;
        Token LPAREN126=null;
        Token RPAREN128=null;
        Token DOT129=null;
        Token NAMESPACE_ACCESS131=null;
        GalaxyXParser.primary_expression_return primary_expression120 = null;

        GalaxyXParser.expression_return expression122 = null;

        GalaxyXParser.argument_expression_list_return argument_expression_list127 = null;

        GalaxyXParser.postfix_expression_return postfix_expression130 = null;

        GalaxyXParser.postfix_expression_return postfix_expression132 = null;


        CommonTree LBRACK121_tree=null;
        CommonTree RBRACK123_tree=null;
        CommonTree LPAREN124_tree=null;
        CommonTree RPAREN125_tree=null;
        CommonTree LPAREN126_tree=null;
        CommonTree RPAREN128_tree=null;
        CommonTree DOT129_tree=null;
        CommonTree NAMESPACE_ACCESS131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:347:2: ( primary_expression ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT postfix_expression | NAMESPACE_ACCESS postfix_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:347:6: primary_expression ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT postfix_expression | NAMESPACE_ACCESS postfix_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_primary_expression_in_postfix_expression1208);
            primary_expression120=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression120.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:348:9: ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT postfix_expression | NAMESPACE_ACCESS postfix_expression )*
            loop37:
            do {
                int alt37=6;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:348:13: LBRACK expression RBRACK
            	    {
            	    LBRACK121=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_postfix_expression1222); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_postfix_expression1225);
            	    expression122=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression122.getTree());
            	    RBRACK123=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_postfix_expression1227); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:349:13: LPAREN RPAREN
            	    {
            	    LPAREN124=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1242); if (state.failed) return retval;
            	    RPAREN125=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1245); if (state.failed) return retval;

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:350:13: LPAREN argument_expression_list RPAREN
            	    {
            	    LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression1260); if (state.failed) return retval;
            	    pushFollow(FOLLOW_argument_expression_list_in_postfix_expression1263);
            	    argument_expression_list127=argument_expression_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_expression_list127.getTree());
            	    RPAREN128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression1265); if (state.failed) return retval;

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:351:13: DOT postfix_expression
            	    {
            	    DOT129=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression1280); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT129_tree = (CommonTree)adaptor.create(DOT129);
            	    adaptor.addChild(root_0, DOT129_tree);
            	    }
            	    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1282);
            	    postfix_expression130=postfix_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression130.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:352:11: NAMESPACE_ACCESS postfix_expression
            	    {
            	    NAMESPACE_ACCESS131=(Token)match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1294); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAMESPACE_ACCESS131_tree = (CommonTree)adaptor.create(NAMESPACE_ACCESS131);
            	    adaptor.addChild(root_0, NAMESPACE_ACCESS131_tree);
            	    }
            	    pushFollow(FOLLOW_postfix_expression_in_postfix_expression1296);
            	    postfix_expression132=postfix_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression132.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 21, postfix_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"

    public static class unary_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_operator"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:356:1: unary_operator : ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT );
    public final GalaxyXParser.unary_operator_return unary_operator() throws RecognitionException {
        GalaxyXParser.unary_operator_return retval = new GalaxyXParser.unary_operator_return();
        retval.start = input.LT(1);
        int unary_operator_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PLUS133=null;
        Token SUB134=null;
        Token NOT135=null;
        Token NEW136=null;
        Token DELETE137=null;
        Token BIT_NOT138=null;

        CommonTree PLUS133_tree=null;
        CommonTree SUB134_tree=null;
        CommonTree NOT135_tree=null;
        CommonTree NEW136_tree=null;
        CommonTree DELETE137_tree=null;
        CommonTree BIT_NOT138_tree=null;
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:357:2: ( PLUS | SUB -> NEGATION | NOT | NEW | DELETE | BIT_NOT )
            int alt38=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt38=1;
                }
                break;
            case SUB:
                {
                alt38=2;
                }
                break;
            case NOT:
                {
                alt38=3;
                }
                break;
            case NEW:
                {
                alt38=4;
                }
                break;
            case DELETE:
                {
                alt38=5;
                }
                break;
            case BIT_NOT:
                {
                alt38=6;
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:357:4: PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS133=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_operator1318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS133_tree = (CommonTree)adaptor.create(PLUS133);
                    adaptor.addChild(root_0, PLUS133_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:358:4: SUB
                    {
                    SUB134=(Token)match(input,SUB,FOLLOW_SUB_in_unary_operator1323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUB.add(SUB134);



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
                    // 358:8: -> NEGATION
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:359:4: NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT135=(Token)match(input,NOT,FOLLOW_NOT_in_unary_operator1332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT135_tree = (CommonTree)adaptor.create(NOT135);
                    adaptor.addChild(root_0, NOT135_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:360:4: NEW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEW136=(Token)match(input,NEW,FOLLOW_NEW_in_unary_operator1337); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW136_tree = (CommonTree)adaptor.create(NEW136);
                    adaptor.addChild(root_0, NEW136_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:361:4: DELETE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DELETE137=(Token)match(input,DELETE,FOLLOW_DELETE_in_unary_operator1342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DELETE137_tree = (CommonTree)adaptor.create(DELETE137);
                    adaptor.addChild(root_0, DELETE137_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:362:4: BIT_NOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BIT_NOT138=(Token)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_unary_operator1347); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIT_NOT138_tree = (CommonTree)adaptor.create(BIT_NOT138);
                    adaptor.addChild(root_0, BIT_NOT138_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 22, unary_operator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unary_operator"

    public static class primary_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:365:1: primary_expression : ( IDENTIFIER | constant | LPAREN expression RPAREN );
    public final GalaxyXParser.primary_expression_return primary_expression() throws RecognitionException {
        GalaxyXParser.primary_expression_return retval = new GalaxyXParser.primary_expression_return();
        retval.start = input.LT(1);
        int primary_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IDENTIFIER139=null;
        Token LPAREN141=null;
        Token RPAREN143=null;
        GalaxyXParser.constant_return constant140 = null;

        GalaxyXParser.expression_return expression142 = null;


        CommonTree IDENTIFIER139_tree=null;
        CommonTree LPAREN141_tree=null;
        CommonTree RPAREN143_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:366:2: ( IDENTIFIER | constant | LPAREN expression RPAREN )
            int alt39=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt39=1;
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
                alt39=2;
                }
                break;
            case LPAREN:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:366:4: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENTIFIER139=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1358); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER139_tree = (CommonTree)adaptor.create(IDENTIFIER139);
                    adaptor.addChild(root_0, IDENTIFIER139_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:367:4: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression1363);
                    constant140=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant140.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:368:4: LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN141=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary_expression1368); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primary_expression1371);
                    expression142=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression142.getTree());
                    RPAREN143=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary_expression1373); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 23, primary_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primary_expression"

    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:371:1: constant : ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS );
    public final GalaxyXParser.constant_return constant() throws RecognitionException {
        GalaxyXParser.constant_return retval = new GalaxyXParser.constant_return();
        retval.start = input.LT(1);
        int constant_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set144=null;

        CommonTree set144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:372:5: ( INTEGER | CHARACTER_LITERAL | STRING_LITERAL | FIXED_LITERAL | TRUE | FALSE | NULL | THIS )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set144=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||(input.LA(1)>=CHARACTER_LITERAL && input.LA(1)<=THIS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set144));
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
            if ( state.backtracking>0 ) { memoize(input, 24, constant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:385:1: expression : assignment_expression ;
    public final GalaxyXParser.expression_return expression() throws RecognitionException {
        GalaxyXParser.expression_return retval = new GalaxyXParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.assignment_expression_return assignment_expression145 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:386:2: ( assignment_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:386:4: assignment_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_expression1468);
            assignment_expression145=assignment_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression145.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 25, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class constant_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:389:1: constant_expression : logical_or_expression ;
    public final GalaxyXParser.constant_expression_return constant_expression() throws RecognitionException {
        GalaxyXParser.constant_expression_return retval = new GalaxyXParser.constant_expression_return();
        retval.start = input.LT(1);
        int constant_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.logical_or_expression_return logical_or_expression146 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:390:2: ( logical_or_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:390:4: logical_or_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logical_or_expression_in_constant_expression1479);
            logical_or_expression146=logical_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression146.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 26, constant_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constant_expression"

    public static class assignment_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:393:1: assignment_expression : ( logical_or_expression | lvalue assignment_operator assignment_expression );
    public final GalaxyXParser.assignment_expression_return assignment_expression() throws RecognitionException {
        GalaxyXParser.assignment_expression_return retval = new GalaxyXParser.assignment_expression_return();
        retval.start = input.LT(1);
        int assignment_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.logical_or_expression_return logical_or_expression147 = null;

        GalaxyXParser.lvalue_return lvalue148 = null;

        GalaxyXParser.assignment_operator_return assignment_operator149 = null;

        GalaxyXParser.assignment_expression_return assignment_expression150 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:394:2: ( logical_or_expression | lvalue assignment_operator assignment_expression )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:394:4: logical_or_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_logical_or_expression_in_assignment_expression1490);
                    logical_or_expression147=logical_or_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression147.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:395:4: lvalue assignment_operator assignment_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_assignment_expression1495);
                    lvalue148=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue148.getTree());
                    pushFollow(FOLLOW_assignment_operator_in_assignment_expression1497);
                    assignment_operator149=assignment_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignment_operator149.getTree(), root_0);
                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression1500);
                    assignment_expression150=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression150.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 27, assignment_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment_expression"

    public static class lvalue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:398:1: lvalue : unary_expression ;
    public final GalaxyXParser.lvalue_return lvalue() throws RecognitionException {
        GalaxyXParser.lvalue_return retval = new GalaxyXParser.lvalue_return();
        retval.start = input.LT(1);
        int lvalue_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.unary_expression_return unary_expression151 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:399:2: ( unary_expression )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:399:4: unary_expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_expression_in_lvalue1512);
            unary_expression151=unary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression151.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 28, lvalue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "lvalue"

    public static class logical_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:402:1: logical_or_expression : logical_and_expression ( LOR logical_and_expression )* ;
    public final GalaxyXParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        GalaxyXParser.logical_or_expression_return retval = new GalaxyXParser.logical_or_expression_return();
        retval.start = input.LT(1);
        int logical_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LOR153=null;
        GalaxyXParser.logical_and_expression_return logical_and_expression152 = null;

        GalaxyXParser.logical_and_expression_return logical_and_expression154 = null;


        CommonTree LOR153_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:403:2: ( logical_and_expression ( LOR logical_and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:403:4: logical_and_expression ( LOR logical_and_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1523);
            logical_and_expression152=logical_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression152.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:403:27: ( LOR logical_and_expression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LOR) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:403:28: LOR logical_and_expression
            	    {
            	    LOR153=(Token)match(input,LOR,FOLLOW_LOR_in_logical_or_expression1526); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOR153_tree = (CommonTree)adaptor.create(LOR153);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LOR153_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1529);
            	    logical_and_expression154=logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression154.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, logical_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"

    public static class logical_and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_and_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:406:1: logical_and_expression : inclusive_or_expression ( LAND inclusive_or_expression )* ;
    public final GalaxyXParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        GalaxyXParser.logical_and_expression_return retval = new GalaxyXParser.logical_and_expression_return();
        retval.start = input.LT(1);
        int logical_and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LAND156=null;
        GalaxyXParser.inclusive_or_expression_return inclusive_or_expression155 = null;

        GalaxyXParser.inclusive_or_expression_return inclusive_or_expression157 = null;


        CommonTree LAND156_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:407:2: ( inclusive_or_expression ( LAND inclusive_or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:407:4: inclusive_or_expression ( LAND inclusive_or_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1543);
            inclusive_or_expression155=inclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusive_or_expression155.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:407:28: ( LAND inclusive_or_expression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LAND) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:407:29: LAND inclusive_or_expression
            	    {
            	    LAND156=(Token)match(input,LAND,FOLLOW_LAND_in_logical_and_expression1546); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LAND156_tree = (CommonTree)adaptor.create(LAND156);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LAND156_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1549);
            	    inclusive_or_expression157=inclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusive_or_expression157.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 30, logical_and_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"

    public static class inclusive_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inclusive_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:410:1: inclusive_or_expression : exclusive_or_expression ( OR exclusive_or_expression )* ;
    public final GalaxyXParser.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException {
        GalaxyXParser.inclusive_or_expression_return retval = new GalaxyXParser.inclusive_or_expression_return();
        retval.start = input.LT(1);
        int inclusive_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OR159=null;
        GalaxyXParser.exclusive_or_expression_return exclusive_or_expression158 = null;

        GalaxyXParser.exclusive_or_expression_return exclusive_or_expression160 = null;


        CommonTree OR159_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:411:2: ( exclusive_or_expression ( OR exclusive_or_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:411:4: exclusive_or_expression ( OR exclusive_or_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1562);
            exclusive_or_expression158=exclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression158.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:411:28: ( OR exclusive_or_expression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==OR) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:411:29: OR exclusive_or_expression
            	    {
            	    OR159=(Token)match(input,OR,FOLLOW_OR_in_inclusive_or_expression1565); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR159_tree = (CommonTree)adaptor.create(OR159);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR159_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1568);
            	    exclusive_or_expression160=exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression160.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 31, inclusive_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inclusive_or_expression"

    public static class exclusive_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exclusive_or_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:414:1: exclusive_or_expression : and_expression ( XOR and_expression )* ;
    public final GalaxyXParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
        GalaxyXParser.exclusive_or_expression_return retval = new GalaxyXParser.exclusive_or_expression_return();
        retval.start = input.LT(1);
        int exclusive_or_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token XOR162=null;
        GalaxyXParser.and_expression_return and_expression161 = null;

        GalaxyXParser.and_expression_return and_expression163 = null;


        CommonTree XOR162_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:415:2: ( and_expression ( XOR and_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:415:4: and_expression ( XOR and_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1581);
            and_expression161=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression161.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:415:19: ( XOR and_expression )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:415:20: XOR and_expression
            	    {
            	    XOR162=(Token)match(input,XOR,FOLLOW_XOR_in_exclusive_or_expression1584); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    XOR162_tree = (CommonTree)adaptor.create(XOR162);
            	    root_0 = (CommonTree)adaptor.becomeRoot(XOR162_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1587);
            	    and_expression163=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression163.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 32, exclusive_or_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exclusive_or_expression"

    public static class and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:418:1: and_expression : equality_expression ( AND equality_expression )* ;
    public final GalaxyXParser.and_expression_return and_expression() throws RecognitionException {
        GalaxyXParser.and_expression_return retval = new GalaxyXParser.and_expression_return();
        retval.start = input.LT(1);
        int and_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token AND165=null;
        GalaxyXParser.equality_expression_return equality_expression164 = null;

        GalaxyXParser.equality_expression_return equality_expression166 = null;


        CommonTree AND165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:419:2: ( equality_expression ( AND equality_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:419:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_and_expression1600);
            equality_expression164=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression164.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:419:24: ( AND equality_expression )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:419:25: AND equality_expression
            	    {
            	    AND165=(Token)match(input,AND,FOLLOW_AND_in_and_expression1603); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND165_tree = (CommonTree)adaptor.create(AND165);
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND165_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expression_in_and_expression1606);
            	    equality_expression166=equality_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression166.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 33, and_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "and_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:422:1: equality_expression : relational_expression ( ( EQ | NEQ ) relational_expression )* ;
    public final GalaxyXParser.equality_expression_return equality_expression() throws RecognitionException {
        GalaxyXParser.equality_expression_return retval = new GalaxyXParser.equality_expression_return();
        retval.start = input.LT(1);
        int equality_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set168=null;
        GalaxyXParser.relational_expression_return relational_expression167 = null;

        GalaxyXParser.relational_expression_return relational_expression169 = null;


        CommonTree set168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:423:2: ( relational_expression ( ( EQ | NEQ ) relational_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:423:4: relational_expression ( ( EQ | NEQ ) relational_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression1620);
            relational_expression167=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression167.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:423:26: ( ( EQ | NEQ ) relational_expression )*
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:423:27: ( EQ | NEQ ) relational_expression
            	    {
            	    set168=(Token)input.LT(1);
            	    set168=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set168), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1630);
            	    relational_expression169=relational_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression169.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 34, equality_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:426:1: relational_expression : shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* ;
    public final GalaxyXParser.relational_expression_return relational_expression() throws RecognitionException {
        GalaxyXParser.relational_expression_return retval = new GalaxyXParser.relational_expression_return();
        retval.start = input.LT(1);
        int relational_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set171=null;
        GalaxyXParser.shift_expression_return shift_expression170 = null;

        GalaxyXParser.shift_expression_return shift_expression172 = null;


        CommonTree set171_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:427:2: ( shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:427:4: shift_expression ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shift_expression_in_relational_expression1643);
            shift_expression170=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression170.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:427:21: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:427:22: ( LT | GT | LTEQ | GTEQ ) shift_expression
            	    {
            	    set171=(Token)input.LT(1);
            	    set171=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT && input.LA(1)<=GTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set171), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1657);
            	    shift_expression172=shift_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression172.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 35, relational_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relational_expression"

    public static class shift_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shift_expression"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:430:1: shift_expression : additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* ;
    public final GalaxyXParser.shift_expression_return shift_expression() throws RecognitionException {
        GalaxyXParser.shift_expression_return retval = new GalaxyXParser.shift_expression_return();
        retval.start = input.LT(1);
        int shift_expression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set174=null;
        GalaxyXParser.additive_expression_return additive_expression173 = null;

        GalaxyXParser.additive_expression_return additive_expression175 = null;


        CommonTree set174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:431:2: ( additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:431:4: additive_expression ( ( SHIFTL | SHIFTR ) additive_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_shift_expression1670);
            additive_expression173=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression173.getTree());
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:431:24: ( ( SHIFTL | SHIFTR ) additive_expression )*
            loop48:
            do {
                int alt48=2;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:431:25: ( SHIFTL | SHIFTR ) additive_expression
            	    {
            	    set174=(Token)input.LT(1);
            	    set174=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFTL && input.LA(1)<=SHIFTR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set174), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1680);
            	    additive_expression175=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression175.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, shift_expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shift_expression"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:436:1: statement : ( expression_statement | selection_statement | while_statement | for_statement | jump_statement );
    public final GalaxyXParser.statement_return statement() throws RecognitionException {
        GalaxyXParser.statement_return retval = new GalaxyXParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXParser.expression_statement_return expression_statement176 = null;

        GalaxyXParser.selection_statement_return selection_statement177 = null;

        GalaxyXParser.while_statement_return while_statement178 = null;

        GalaxyXParser.for_statement_return for_statement179 = null;

        GalaxyXParser.jump_statement_return jump_statement180 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:437:2: ( expression_statement | selection_statement | while_statement | for_statement | jump_statement )
            int alt49=5;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:437:4: expression_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_statement_in_statement1696);
                    expression_statement176=expression_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement176.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:438:4: selection_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selection_statement_in_statement1701);
                    selection_statement177=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement177.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:439:4: while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement1706);
                    while_statement178=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement178.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:440:4: for_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_statement_in_statement1711);
                    for_statement179=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement179.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:441:4: jump_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_jump_statement_in_statement1716);
                    jump_statement180=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement180.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class expression_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:444:1: expression_statement : ( SEMI | expression SEMI );
    public final GalaxyXParser.expression_statement_return expression_statement() throws RecognitionException {
        GalaxyXParser.expression_statement_return retval = new GalaxyXParser.expression_statement_return();
        retval.start = input.LT(1);
        int expression_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SEMI181=null;
        Token SEMI183=null;
        GalaxyXParser.expression_return expression182 = null;


        CommonTree SEMI181_tree=null;
        CommonTree SEMI183_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:445:2: ( SEMI | expression SEMI )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:445:4: SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEMI181=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1729); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:446:4: expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_expression_statement1735);
                    expression182=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression182.getTree());
                    SEMI183=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression_statement1737); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 38, expression_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression_statement"

    public static class selection_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selection_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:449:1: selection_statement : IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF ;
    public final GalaxyXParser.selection_statement_return selection_statement() throws RecognitionException {
        GalaxyXParser.selection_statement_return retval = new GalaxyXParser.selection_statement_return();
        retval.start = input.LT(1);
        int selection_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IF184=null;
        Token LPAREN185=null;
        Token RPAREN187=null;
        Token COLON188=null;
        Token ELIF190=null;
        Token LPAREN191=null;
        Token RPAREN193=null;
        Token COLON194=null;
        Token ELSE196=null;
        Token COLON197=null;
        Token END199=null;
        Token IF200=null;
        GalaxyXParser.expression_return expression186 = null;

        GalaxyXParser.statement_return statement189 = null;

        GalaxyXParser.expression_return expression192 = null;

        GalaxyXParser.statement_return statement195 = null;

        GalaxyXParser.statement_return statement198 = null;


        CommonTree IF184_tree=null;
        CommonTree LPAREN185_tree=null;
        CommonTree RPAREN187_tree=null;
        CommonTree COLON188_tree=null;
        CommonTree ELIF190_tree=null;
        CommonTree LPAREN191_tree=null;
        CommonTree RPAREN193_tree=null;
        CommonTree COLON194_tree=null;
        CommonTree ELSE196_tree=null;
        CommonTree COLON197_tree=null;
        CommonTree END199_tree=null;
        CommonTree IF200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:450:2: ( IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:450:4: IF LPAREN expression RPAREN COLON ( statement )* ( ELIF LPAREN expression RPAREN COLON ( statement )* )* ( ELSE COLON ( statement )* )? END IF
            {
            root_0 = (CommonTree)adaptor.nil();

            IF184=(Token)match(input,IF,FOLLOW_IF_in_selection_statement1749); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF184_tree = (CommonTree)adaptor.create(IF184);
            adaptor.addChild(root_0, IF184_tree);
            }
            LPAREN185=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selection_statement1751); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_selection_statement1754);
            expression186=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression186.getTree());
            RPAREN187=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selection_statement1756); if (state.failed) return retval;
            COLON188=(Token)match(input,COLON,FOLLOW_COLON_in_selection_statement1759); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:450:41: ( statement )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_selection_statement1762);
            	    statement189=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement189.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:451:4: ( ELIF LPAREN expression RPAREN COLON ( statement )* )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==ELIF) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:451:5: ELIF LPAREN expression RPAREN COLON ( statement )*
            	    {
            	    ELIF190=(Token)match(input,ELIF,FOLLOW_ELIF_in_selection_statement1769); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELIF190_tree = (CommonTree)adaptor.create(ELIF190);
            	    adaptor.addChild(root_0, ELIF190_tree);
            	    }
            	    LPAREN191=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selection_statement1771); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_selection_statement1774);
            	    expression192=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression192.getTree());
            	    RPAREN193=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selection_statement1776); if (state.failed) return retval;
            	    COLON194=(Token)match(input,COLON,FOLLOW_COLON_in_selection_statement1779); if (state.failed) return retval;
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:451:44: ( statement )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        alt52 = dfa52.predict(input);
            	        switch (alt52) {
            	    	case 1 :
            	    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_selection_statement1782);
            	    	    statement195=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement195.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop52;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:452:4: ( ELSE COLON ( statement )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ELSE) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:452:5: ELSE COLON ( statement )*
                    {
                    ELSE196=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_statement1791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE196_tree = (CommonTree)adaptor.create(ELSE196);
                    adaptor.addChild(root_0, ELSE196_tree);
                    }
                    COLON197=(Token)match(input,COLON,FOLLOW_COLON_in_selection_statement1793); if (state.failed) return retval;
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:452:17: ( statement )*
                    loop54:
                    do {
                        int alt54=2;
                        alt54 = dfa54.predict(input);
                        switch (alt54) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_selection_statement1796);
                    	    statement198=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement198.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            END199=(Token)match(input,END,FOLLOW_END_in_selection_statement1804); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END199_tree = (CommonTree)adaptor.create(END199);
            adaptor.addChild(root_0, END199_tree);
            }
            IF200=(Token)match(input,IF,FOLLOW_IF_in_selection_statement1806); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF200_tree = (CommonTree)adaptor.create(IF200);
            adaptor.addChild(root_0, IF200_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 39, selection_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "selection_statement"

    public static class while_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:456:1: while_statement : WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE ;
    public final GalaxyXParser.while_statement_return while_statement() throws RecognitionException {
        GalaxyXParser.while_statement_return retval = new GalaxyXParser.while_statement_return();
        retval.start = input.LT(1);
        int while_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token WHILE201=null;
        Token LPAREN202=null;
        Token RPAREN204=null;
        Token COLON205=null;
        Token END207=null;
        Token WHILE208=null;
        GalaxyXParser.expression_return expression203 = null;

        GalaxyXParser.statement_return statement206 = null;


        CommonTree WHILE201_tree=null;
        CommonTree LPAREN202_tree=null;
        CommonTree RPAREN204_tree=null;
        CommonTree COLON205_tree=null;
        CommonTree END207_tree=null;
        CommonTree WHILE208_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:457:2: ( WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:457:4: WHILE LPAREN expression RPAREN COLON ( statement )* END WHILE
            {
            root_0 = (CommonTree)adaptor.nil();

            WHILE201=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1818); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE201_tree = (CommonTree)adaptor.create(WHILE201);
            adaptor.addChild(root_0, WHILE201_tree);
            }
            LPAREN202=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1820); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_while_statement1823);
            expression203=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression203.getTree());
            RPAREN204=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1825); if (state.failed) return retval;
            COLON205=(Token)match(input,COLON,FOLLOW_COLON_in_while_statement1828); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:457:44: ( statement )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement1831);
            	    statement206=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement206.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            END207=(Token)match(input,END,FOLLOW_END_in_while_statement1837); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END207_tree = (CommonTree)adaptor.create(END207);
            adaptor.addChild(root_0, END207_tree);
            }
            WHILE208=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1839); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE208_tree = (CommonTree)adaptor.create(WHILE208);
            adaptor.addChild(root_0, WHILE208_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 40, while_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "while_statement"

    public static class for_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:461:1: for_statement : FOR LPAREN expression SEMI expression SEMI expression RPAREN COLON ( statement )* END FOR ;
    public final GalaxyXParser.for_statement_return for_statement() throws RecognitionException {
        GalaxyXParser.for_statement_return retval = new GalaxyXParser.for_statement_return();
        retval.start = input.LT(1);
        int for_statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token FOR209=null;
        Token LPAREN210=null;
        Token SEMI212=null;
        Token SEMI214=null;
        Token RPAREN216=null;
        Token COLON217=null;
        Token END219=null;
        Token FOR220=null;
        GalaxyXParser.expression_return expression211 = null;

        GalaxyXParser.expression_return expression213 = null;

        GalaxyXParser.expression_return expression215 = null;

        GalaxyXParser.statement_return statement218 = null;


        CommonTree FOR209_tree=null;
        CommonTree LPAREN210_tree=null;
        CommonTree SEMI212_tree=null;
        CommonTree SEMI214_tree=null;
        CommonTree RPAREN216_tree=null;
        CommonTree COLON217_tree=null;
        CommonTree END219_tree=null;
        CommonTree FOR220_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:462:2: ( FOR LPAREN expression SEMI expression SEMI expression RPAREN COLON ( statement )* END FOR )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:462:4: FOR LPAREN expression SEMI expression SEMI expression RPAREN COLON ( statement )* END FOR
            {
            root_0 = (CommonTree)adaptor.nil();

            FOR209=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1851); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR209_tree = (CommonTree)adaptor.create(FOR209);
            adaptor.addChild(root_0, FOR209_tree);
            }
            LPAREN210=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_for_statement1853); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_for_statement1856);
            expression211=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression211.getTree());
            SEMI212=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1858); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_for_statement1861);
            expression213=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression213.getTree());
            SEMI214=(Token)match(input,SEMI,FOLLOW_SEMI_in_for_statement1863); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_for_statement1866);
            expression215=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression215.getTree());
            RPAREN216=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_for_statement1868); if (state.failed) return retval;
            COLON217=(Token)match(input,COLON,FOLLOW_COLON_in_for_statement1871); if (state.failed) return retval;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:463:4: ( statement )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_for_statement1877);
            	    statement218=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement218.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            END219=(Token)match(input,END,FOLLOW_END_in_for_statement1883); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END219_tree = (CommonTree)adaptor.create(END219);
            adaptor.addChild(root_0, END219_tree);
            }
            FOR220=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1885); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR220_tree = (CommonTree)adaptor.create(FOR220);
            adaptor.addChild(root_0, FOR220_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 41, for_statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "for_statement"

    public static class jump_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jump_statement"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:467:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );
    public final GalaxyXParser.jump_statement_return jump_statement() throws RecognitionException {
        GalaxyXParser.jump_statement_return retval = new GalaxyXParser.jump_statement_return();
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
        GalaxyXParser.expression_return expression228 = null;


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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:468:2: ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI )
            int alt58=4;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:468:4: BREAK SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BREAK221=(Token)match(input,BREAK,FOLLOW_BREAK_in_jump_statement1897); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK221_tree = (CommonTree)adaptor.create(BREAK221);
                    adaptor.addChild(root_0, BREAK221_tree);
                    }
                    SEMI222=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1899); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:469:4: CONTINUE SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CONTINUE223=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTINUE223_tree = (CommonTree)adaptor.create(CONTINUE223);
                    adaptor.addChild(root_0, CONTINUE223_tree);
                    }
                    SEMI224=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1907); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:470:4: RETURN SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RETURN225=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1913); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN225_tree = (CommonTree)adaptor.create(RETURN225);
                    adaptor.addChild(root_0, RETURN225_tree);
                    }
                    SEMI226=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1915); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:471:4: RETURN expression SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RETURN227=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_statement1921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN227_tree = (CommonTree)adaptor.create(RETURN227);
                    adaptor.addChild(root_0, RETURN227_tree);
                    }
                    pushFollow(FOLLOW_expression_in_jump_statement1923);
                    expression228=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression228.getTree());
                    SEMI229=(Token)match(input,SEMI,FOLLOW_SEMI_in_jump_statement1925); if (state.failed) return retval;

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

    // $ANTLR start synpred4_GalaxyX
    public final void synpred4_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:18: ( function )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:18: function
        {
        pushFollow(FOLLOW_function_in_synpred4_GalaxyX156);
        function();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_GalaxyX

    // $ANTLR start synpred6_GalaxyX
    public final void synpred6_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:42: ( field_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:68:42: field_decl
        {
        pushFollow(FOLLOW_field_decl_in_synpred6_GalaxyX164);
        field_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_GalaxyX

    // $ANTLR start synpred12_GalaxyX
    public final void synpred12_GalaxyX_fragment() throws RecognitionException {   
        GalaxyXParser.local_var_decl_return local = null;


        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:128:5: (local= local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:128:5: local= local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred12_GalaxyX301);
        local=local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_GalaxyX

    // $ANTLR start synpred18_GalaxyX
    public final void synpred18_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:5: ( function )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:5: function
        {
        pushFollow(FOLLOW_function_in_synpred18_GalaxyX439);
        function();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_GalaxyX

    // $ANTLR start synpred19_GalaxyX
    public final void synpred19_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:16: ( field_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:165:16: field_decl
        {
        pushFollow(FOLLOW_field_decl_in_synpred19_GalaxyX443);
        field_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_GalaxyX

    // $ANTLR start synpred24_GalaxyX
    public final void synpred24_GalaxyX_fragment() throws RecognitionException {   
        GalaxyXParser.local_var_decl_return local = null;


        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:189:5: (local= local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:189:5: local= local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred24_GalaxyX510);
        local=local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_GalaxyX

    // $ANTLR start synpred27_GalaxyX
    public final void synpred27_GalaxyX_fragment() throws RecognitionException {   
        GalaxyXParser.local_var_decl_return local = null;


        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:217:5: (local= local_var_decl )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:217:5: local= local_var_decl
        {
        pushFollow(FOLLOW_local_var_decl_in_synpred27_GalaxyX576);
        local=local_var_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_GalaxyX

    // $ANTLR start synpred91_GalaxyX
    public final void synpred91_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:348:13: ( LBRACK expression RBRACK )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:348:13: LBRACK expression RBRACK
        {
        match(input,LBRACK,FOLLOW_LBRACK_in_synpred91_GalaxyX1222); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred91_GalaxyX1225);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACK,FOLLOW_RBRACK_in_synpred91_GalaxyX1227); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_GalaxyX

    // $ANTLR start synpred92_GalaxyX
    public final void synpred92_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:349:13: ( LPAREN RPAREN )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:349:13: LPAREN RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred92_GalaxyX1242); if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred92_GalaxyX1245); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_GalaxyX

    // $ANTLR start synpred93_GalaxyX
    public final void synpred93_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:350:13: ( LPAREN argument_expression_list RPAREN )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:350:13: LPAREN argument_expression_list RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred93_GalaxyX1260); if (state.failed) return ;
        pushFollow(FOLLOW_argument_expression_list_in_synpred93_GalaxyX1263);
        argument_expression_list();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred93_GalaxyX1265); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_GalaxyX

    // $ANTLR start synpred94_GalaxyX
    public final void synpred94_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:351:13: ( DOT postfix_expression )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:351:13: DOT postfix_expression
        {
        match(input,DOT,FOLLOW_DOT_in_synpred94_GalaxyX1280); if (state.failed) return ;
        pushFollow(FOLLOW_postfix_expression_in_synpred94_GalaxyX1282);
        postfix_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_GalaxyX

    // $ANTLR start synpred95_GalaxyX
    public final void synpred95_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:352:11: ( NAMESPACE_ACCESS postfix_expression )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:352:11: NAMESPACE_ACCESS postfix_expression
        {
        match(input,NAMESPACE_ACCESS,FOLLOW_NAMESPACE_ACCESS_in_synpred95_GalaxyX1294); if (state.failed) return ;
        pushFollow(FOLLOW_postfix_expression_in_synpred95_GalaxyX1296);
        postfix_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_GalaxyX

    // $ANTLR start synpred110_GalaxyX
    public final void synpred110_GalaxyX_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:394:4: ( logical_or_expression )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:394:4: logical_or_expression
        {
        pushFollow(FOLLOW_logical_or_expression_in_synpred110_GalaxyX1490);
        logical_or_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_GalaxyX

    // Delegated rules

    public final boolean synpred95_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_GalaxyX_fragment(); // can never throw exception
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
    public final boolean synpred91_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_GalaxyX_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_GalaxyX() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_GalaxyX_fragment(); // can never throw exception
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA3_eotS =
        "\55\uffff";
    static final String DFA3_eofS =
        "\55\uffff";
    static final String DFA3_minS =
        "\1\5\54\uffff";
    static final String DFA3_maxS =
        "\1\112\54\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\52\uffff";
    static final String DFA3_specialS =
        "\55\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\2\3\uffff\1\2\1\1\2\2\4\uffff\1\2\6\uffff\2\2\1\uffff\1"+
            "\2\13\uffff\43\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "68:4: ( initializer )?";
        }
    }
    static final String DFA4_eotS =
        "\173\uffff";
    static final String DFA4_eofS =
        "\173\uffff";
    static final String DFA4_minS =
        "\1\5\1\uffff\1\5\1\6\50\uffff\1\0\116\uffff";
    static final String DFA4_maxS =
        "\1\112\1\uffff\2\112\50\uffff\1\0\116\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\5\2\uffff\1\1\1\2\1\3\44\uffff\1\4\117\uffff";
    static final String DFA4_specialS =
        "\54\uffff\1\0\116\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\53\1\6\3\uffff\1\1\1\uffff\1\3\1\4\4\uffff\1\5\6\uffff\2"+
            "\2\1\uffff\1\6\13\uffff\43\6",
            "",
            "\1\53\1\6\5\uffff\1\54\1\4\4\uffff\1\5\11\uffff\1\6\13\uffff"+
            "\43\6",
            "\1\6\6\uffff\1\4\16\uffff\1\6\13\uffff\43\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 68:17: ( function | class_decl | field_decl | typedef_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_44 = input.LA(1);

                         
                        int index4_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_GalaxyX()) ) {s = 4;}

                        else if ( (synpred6_GalaxyX()) ) {s = 6;}

                         
                        input.seek(index4_44);
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
    static final String DFA5_eotS =
        "\22\uffff";
    static final String DFA5_eofS =
        "\22\uffff";
    static final String DFA5_minS =
        "\1\6\21\uffff";
    static final String DFA5_maxS =
        "\1\160\21\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\2\1\1\17\uffff";
    static final String DFA5_specialS =
        "\22\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\2\2\uffff\1\1\3\uffff\1\2\5\uffff\1\2\66\uffff\2\2\4\uffff"+
            "\13\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 90:5: ( statement )*";
        }
    }
    static final String DFA8_eotS =
        "\46\uffff";
    static final String DFA8_eofS =
        "\46\uffff";
    static final String DFA8_minS =
        "\1\6\45\uffff";
    static final String DFA8_maxS =
        "\1\112\45\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\43\uffff\1\2";
    static final String DFA8_specialS =
        "\46\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\10\uffff\1\45\30\uffff\43\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "98:63: (args= argument_list )?";
        }
    }
    static final String DFA9_eotS =
        "\111\uffff";
    static final String DFA9_eofS =
        "\111\uffff";
    static final String DFA9_minS =
        "\1\6\1\uffff\1\6\62\uffff\2\0\22\uffff";
    static final String DFA9_maxS =
        "\1\160\1\uffff\1\150\62\uffff\2\0\22\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\20\uffff\1\1\66\uffff";
    static final String DFA9_specialS =
        "\65\uffff\1\0\1\1\22\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\1\2\uffff\1\1\3\uffff\1\1\5\uffff\1\1\23\uffff\43\22"+
            "\2\1\4\uffff\13\1\15\uffff\1\1\2\uffff\5\1",
            "",
            "\1\22\1\1\6\uffff\1\1\4\uffff\1\66\7\uffff\1\1\1\uffff\12"+
            "\1\1\65\43\uffff\6\1\13\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 128:4: (local= local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_53 = input.LA(1);

                         
                        int index9_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_GalaxyX()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_53);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_54 = input.LA(1);

                         
                        int index9_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_GalaxyX()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_54);
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
        "\22\uffff";
    static final String DFA10_eofS =
        "\22\uffff";
    static final String DFA10_minS =
        "\1\6\21\uffff";
    static final String DFA10_maxS =
        "\1\160\21\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\1\1\17\uffff";
    static final String DFA10_specialS =
        "\22\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\2\2\uffff\1\1\3\uffff\1\2\5\uffff\1\2\66\uffff\2\2\4\uffff"+
            "\13\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 135:4: ( statement )*";
        }
    }
    static final String DFA15_eotS =
        "\173\uffff";
    static final String DFA15_eofS =
        "\173\uffff";
    static final String DFA15_minS =
        "\1\5\1\uffff\1\5\1\6\51\uffff\1\0\115\uffff";
    static final String DFA15_maxS =
        "\1\112\1\uffff\2\112\51\uffff\1\0\115\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\6\2\uffff\1\1\1\2\44\uffff\1\3\1\4\1\5\116\uffff";
    static final String DFA15_specialS =
        "\55\uffff\1\0\115\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\52\1\5\3\uffff\1\1\1\uffff\1\3\1\4\11\uffff\1\53\1\54\2"+
            "\2\1\uffff\1\5\13\uffff\43\5",
            "",
            "\1\52\1\5\5\uffff\1\55\1\4\16\uffff\1\5\13\uffff\43\5",
            "\1\5\6\uffff\1\4\16\uffff\1\5\13\uffff\43\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 165:4: ( function | field_decl | typedef_decl | constr_decl | destr_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_45 = input.LA(1);

                         
                        int index15_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_GalaxyX()) ) {s = 4;}

                        else if ( (synpred19_GalaxyX()) ) {s = 5;}

                         
                        input.seek(index15_45);
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
        "\46\uffff";
    static final String DFA16_eofS =
        "\46\uffff";
    static final String DFA16_minS =
        "\1\6\45\uffff";
    static final String DFA16_maxS =
        "\1\112\45\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\43\uffff\1\2";
    static final String DFA16_specialS =
        "\46\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\10\uffff\1\45\30\uffff\43\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "173:31: (args= argument_list )?";
        }
    }
    static final String DFA17_eotS =
        "\111\uffff";
    static final String DFA17_eofS =
        "\111\uffff";
    static final String DFA17_minS =
        "\1\6\1\uffff\1\6\62\uffff\2\0\22\uffff";
    static final String DFA17_maxS =
        "\1\160\1\uffff\1\150\62\uffff\2\0\22\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\20\uffff\1\1\66\uffff";
    static final String DFA17_specialS =
        "\65\uffff\1\0\1\1\22\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\1\2\uffff\1\1\3\uffff\1\1\5\uffff\1\1\23\uffff\43\22"+
            "\2\1\4\uffff\13\1\15\uffff\1\1\2\uffff\5\1",
            "",
            "\1\22\1\1\6\uffff\1\1\4\uffff\1\66\7\uffff\1\1\1\uffff\12"+
            "\1\1\65\43\uffff\6\1\13\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 189:4: (local= local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_53 = input.LA(1);

                         
                        int index17_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_GalaxyX()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_53);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_54 = input.LA(1);

                         
                        int index17_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_GalaxyX()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_54);
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
        "\22\uffff";
    static final String DFA18_eofS =
        "\22\uffff";
    static final String DFA18_minS =
        "\1\6\21\uffff";
    static final String DFA18_maxS =
        "\1\160\21\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\1\1\17\uffff";
    static final String DFA18_specialS =
        "\22\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\2\2\uffff\1\1\3\uffff\1\2\5\uffff\1\2\66\uffff\2\2\4\uffff"+
            "\13\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 196:4: ( statement )*";
        }
    }
    static final String DFA19_eotS =
        "\46\uffff";
    static final String DFA19_eofS =
        "\46\uffff";
    static final String DFA19_minS =
        "\1\6\45\uffff";
    static final String DFA19_maxS =
        "\1\112\45\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\43\uffff\1\2";
    static final String DFA19_specialS =
        "\46\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\10\uffff\1\45\30\uffff\43\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "201:30: (args= argument_list )?";
        }
    }
    static final String DFA20_eotS =
        "\111\uffff";
    static final String DFA20_eofS =
        "\111\uffff";
    static final String DFA20_minS =
        "\1\6\1\uffff\1\6\62\uffff\2\0\22\uffff";
    static final String DFA20_maxS =
        "\1\160\1\uffff\1\150\62\uffff\2\0\22\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\20\uffff\1\1\66\uffff";
    static final String DFA20_specialS =
        "\65\uffff\1\0\1\1\22\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\1\2\uffff\1\1\3\uffff\1\1\5\uffff\1\1\23\uffff\43\22"+
            "\2\1\4\uffff\13\1\15\uffff\1\1\2\uffff\5\1",
            "",
            "\1\22\1\1\6\uffff\1\1\4\uffff\1\66\7\uffff\1\1\1\uffff\12"+
            "\1\1\65\43\uffff\6\1\13\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 217:4: (local= local_var_decl )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_53 = input.LA(1);

                         
                        int index20_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_GalaxyX()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_53);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_54 = input.LA(1);

                         
                        int index20_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_GalaxyX()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_54);
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
        "\22\uffff";
    static final String DFA21_eofS =
        "\22\uffff";
    static final String DFA21_minS =
        "\1\6\21\uffff";
    static final String DFA21_maxS =
        "\1\160\21\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\1\1\17\uffff";
    static final String DFA21_specialS =
        "\22\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\2\2\uffff\1\1\3\uffff\1\2\5\uffff\1\2\66\uffff\2\2\4\uffff"+
            "\13\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 223:4: ( statement )*";
        }
    }
    static final String DFA24_eotS =
        "\50\uffff";
    static final String DFA24_eofS =
        "\50\uffff";
    static final String DFA24_minS =
        "\1\6\47\uffff";
    static final String DFA24_maxS =
        "\1\112\47\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\1\1\2\45\uffff";
    static final String DFA24_specialS =
        "\50\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\5\uffff\1\2\14\uffff\2\1\1\uffff\1\2\13\uffff\43\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "239:4: (m= modifier )?";
        }
    }
    static final String DFA25_eotS =
        "\47\uffff";
    static final String DFA25_eofS =
        "\47\uffff";
    static final String DFA25_minS =
        "\1\6\46\uffff";
    static final String DFA25_maxS =
        "\1\112\46\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\2\44\uffff";
    static final String DFA25_specialS =
        "\47\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\5\uffff\1\1\17\uffff\1\2\13\uffff\43\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "239:19: (s= STATIC )?";
        }
    }
    static final String DFA26_eotS =
        "\46\uffff";
    static final String DFA26_eofS =
        "\46\uffff";
    static final String DFA26_minS =
        "\1\6\45\uffff";
    static final String DFA26_maxS =
        "\1\112\45\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\43\uffff";
    static final String DFA26_specialS =
        "\46\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\25\uffff\1\1\13\uffff\43\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "239:33: (c= CONST )?";
        }
    }
    static final String DFA31_eotS =
        "\45\uffff";
    static final String DFA31_eofS =
        "\45\uffff";
    static final String DFA31_minS =
        "\1\6\44\uffff";
    static final String DFA31_maxS =
        "\1\112\44\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44";
    static final String DFA31_specialS =
        "\45\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\41\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1"+
            "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1"+
            "\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "278:1: type returns [Type t] : ( (ns= IDENTIFIER NAMESPACE_ACCESS )? i= IDENTIFIER | BOOLEAN | BYTE | CHAR | FIXED | GAMELINK | COLOR | INT | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRANSMISSIONSOURCE | TRIGGER | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | AIFILTER | SOUND | WAVE | VOID );";
        }
    }
    static final String DFA33_eotS =
        "\20\uffff";
    static final String DFA33_eofS =
        "\1\1\17\uffff";
    static final String DFA33_minS =
        "\1\7\17\uffff";
    static final String DFA33_maxS =
        "\1\150\17\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\3\14\uffff\1\1\1\2";
    static final String DFA33_specialS =
        "\20\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\7\uffff\1\1\1\uffff\1\1\3\uffff\1\1\65\uffff\1\16\1\17"+
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
            return "()* loopback of 330:32: ( PLUS multiplicative_expression | SUB multiplicative_expression )*";
        }
    }
    static final String DFA34_eotS =
        "\22\uffff";
    static final String DFA34_eofS =
        "\1\1\21\uffff";
    static final String DFA34_minS =
        "\1\7\21\uffff";
    static final String DFA34_maxS =
        "\1\150\21\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\3\16\uffff\1\1\1\2";
    static final String DFA34_specialS =
        "\22\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\7\uffff\1\1\1\uffff\1\1\3\uffff\1\1\65\uffff\2\1\1\20"+
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
            return "()* loopback of 334:22: ( TIMES modulo_expression | DIV modulo_expression )*";
        }
    }
    static final String DFA35_eotS =
        "\23\uffff";
    static final String DFA35_eofS =
        "\1\1\22\uffff";
    static final String DFA35_minS =
        "\1\7\22\uffff";
    static final String DFA35_maxS =
        "\1\150\22\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\2\20\uffff\1\1";
    static final String DFA35_specialS =
        "\23\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\7\uffff\1\1\1\uffff\1\1\3\uffff\1\1\65\uffff\4\1\1\22"+
            "\14\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 338:21: ( MODULO unary_expression )*";
        }
    }
    static final String DFA36_eotS =
        "\12\uffff";
    static final String DFA36_eofS =
        "\12\uffff";
    static final String DFA36_minS =
        "\1\6\11\uffff";
    static final String DFA36_maxS =
        "\1\133\11\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String DFA36_specialS =
        "\12\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\7\uffff\1\1\5\uffff\1\1\66\uffff\2\4\4\uffff\4\4\7\1",
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
            return "341:1: unary_expression : ( postfix_expression | unary_operator unary_expression );";
        }
    }
    static final String DFA37_eotS =
        "\66\uffff";
    static final String DFA37_eofS =
        "\1\1\65\uffff";
    static final String DFA37_minS =
        "\1\7\23\uffff\4\0\36\uffff";
    static final String DFA37_maxS =
        "\1\150\23\uffff\4\0\36\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\6\37\uffff\1\1\12\uffff\1\2\1\3\3\uffff\1\4\3\uffff"+
        "\1\5";
    static final String DFA37_specialS =
        "\24\uffff\1\0\1\1\1\2\1\3\36\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\6\uffff\1\25\1\1\1\uffff\1\1\1\uffff\1\24\1\uffff\1\1"+
            "\5\uffff\1\1\1\uffff\12\1\1\27\43\uffff\5\1\1\26\13\uffff\15"+
            "\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 348:9: ( LBRACK expression RBRACK | LPAREN RPAREN | LPAREN argument_expression_list RPAREN | DOT postfix_expression | NAMESPACE_ACCESS postfix_expression )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_20 = input.LA(1);

                         
                        int index37_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_GalaxyX()) ) {s = 33;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_21 = input.LA(1);

                         
                        int index37_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_GalaxyX()) ) {s = 44;}

                        else if ( (synpred93_GalaxyX()) ) {s = 45;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_22 = input.LA(1);

                         
                        int index37_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_GalaxyX()) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_22);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_23 = input.LA(1);

                         
                        int index37_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_GalaxyX()) ) {s = 53;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\167\uffff";
    static final String DFA40_eofS =
        "\1\uffff\2\16\164\uffff";
    static final String DFA40_minS =
        "\1\6\2\7\7\6\4\0\23\uffff\4\0\23\uffff\77\0";
    static final String DFA40_maxS =
        "\1\133\2\150\7\133\4\0\23\uffff\4\0\23\uffff\77\0";
    static final String DFA40_acceptS =
        "\16\uffff\1\1\21\uffff\1\2\126\uffff";
    static final String DFA40_specialS =
        "\12\uffff\1\0\1\1\1\2\1\3\23\uffff\1\4\1\5\1\6\1\7\23\uffff\1\10"+
        "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
        "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
        "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74"+
        "\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106}>";
    static final String[] DFA40_transitionS = {
            "\1\1\7\uffff\1\3\5\uffff\1\2\66\uffff\1\4\1\5\4\uffff\1\6\1"+
            "\7\1\10\1\11\7\2",
            "\1\16\6\uffff\1\13\1\16\1\uffff\1\16\1\uffff\1\12\1\uffff"+
            "\1\16\5\uffff\1\40\1\uffff\12\40\1\15\43\uffff\5\16\1\14\13"+
            "\uffff\15\16",
            "\1\16\6\uffff\1\42\1\16\1\uffff\1\16\1\uffff\1\41\1\uffff"+
            "\1\16\5\uffff\1\40\1\uffff\12\40\1\44\43\uffff\5\16\1\43\13"+
            "\uffff\15\16",
            "\1\70\7\uffff\1\72\5\uffff\1\71\66\uffff\1\73\1\74\4\uffff"+
            "\1\75\1\76\1\77\1\100\7\71",
            "\1\101\7\uffff\1\103\5\uffff\1\102\66\uffff\1\104\1\105\4"+
            "\uffff\1\106\1\107\1\110\1\111\7\102",
            "\1\112\7\uffff\1\114\5\uffff\1\113\66\uffff\1\115\1\116\4"+
            "\uffff\1\117\1\120\1\121\1\122\7\113",
            "\1\123\7\uffff\1\125\5\uffff\1\124\66\uffff\1\126\1\127\4"+
            "\uffff\1\130\1\131\1\132\1\133\7\124",
            "\1\134\7\uffff\1\136\5\uffff\1\135\66\uffff\1\137\1\140\4"+
            "\uffff\1\141\1\142\1\143\1\144\7\135",
            "\1\145\7\uffff\1\147\5\uffff\1\146\66\uffff\1\150\1\151\4"+
            "\uffff\1\152\1\153\1\154\1\155\7\146",
            "\1\156\7\uffff\1\160\5\uffff\1\157\66\uffff\1\161\1\162\4"+
            "\uffff\1\163\1\164\1\165\1\166\7\157",
            "\1\uffff",
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
            "",
            "\1\uffff",
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
            "\1\uffff"
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
            return "393:1: assignment_expression : ( logical_or_expression | lvalue assignment_operator assignment_expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_10 = input.LA(1);

                         
                        int index40_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_11 = input.LA(1);

                         
                        int index40_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_12 = input.LA(1);

                         
                        int index40_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_13 = input.LA(1);

                         
                        int index40_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_33 = input.LA(1);

                         
                        int index40_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_33);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA40_34 = input.LA(1);

                         
                        int index40_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_34);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA40_35 = input.LA(1);

                         
                        int index40_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_35);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA40_36 = input.LA(1);

                         
                        int index40_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_36);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA40_56 = input.LA(1);

                         
                        int index40_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_56);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA40_57 = input.LA(1);

                         
                        int index40_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_57);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA40_58 = input.LA(1);

                         
                        int index40_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_58);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA40_59 = input.LA(1);

                         
                        int index40_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_59);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA40_60 = input.LA(1);

                         
                        int index40_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_60);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA40_61 = input.LA(1);

                         
                        int index40_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_61);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA40_62 = input.LA(1);

                         
                        int index40_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_62);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA40_63 = input.LA(1);

                         
                        int index40_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_63);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA40_64 = input.LA(1);

                         
                        int index40_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_64);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA40_65 = input.LA(1);

                         
                        int index40_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_65);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA40_66 = input.LA(1);

                         
                        int index40_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_66);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA40_67 = input.LA(1);

                         
                        int index40_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_67);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA40_68 = input.LA(1);

                         
                        int index40_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_68);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA40_69 = input.LA(1);

                         
                        int index40_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_69);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA40_70 = input.LA(1);

                         
                        int index40_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_70);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA40_71 = input.LA(1);

                         
                        int index40_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_71);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA40_72 = input.LA(1);

                         
                        int index40_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_72);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA40_73 = input.LA(1);

                         
                        int index40_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_73);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA40_74 = input.LA(1);

                         
                        int index40_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_74);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA40_75 = input.LA(1);

                         
                        int index40_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_75);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA40_76 = input.LA(1);

                         
                        int index40_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_76);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA40_77 = input.LA(1);

                         
                        int index40_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_77);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA40_78 = input.LA(1);

                         
                        int index40_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_78);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA40_79 = input.LA(1);

                         
                        int index40_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_79);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA40_80 = input.LA(1);

                         
                        int index40_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_80);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA40_81 = input.LA(1);

                         
                        int index40_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_81);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA40_82 = input.LA(1);

                         
                        int index40_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_82);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA40_83 = input.LA(1);

                         
                        int index40_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_83);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA40_84 = input.LA(1);

                         
                        int index40_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_84);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA40_85 = input.LA(1);

                         
                        int index40_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_85);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA40_86 = input.LA(1);

                         
                        int index40_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_86);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA40_87 = input.LA(1);

                         
                        int index40_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_87);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA40_88 = input.LA(1);

                         
                        int index40_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_88);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA40_89 = input.LA(1);

                         
                        int index40_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_89);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA40_90 = input.LA(1);

                         
                        int index40_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_90);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA40_91 = input.LA(1);

                         
                        int index40_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_91);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA40_92 = input.LA(1);

                         
                        int index40_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_92);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA40_93 = input.LA(1);

                         
                        int index40_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_93);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA40_94 = input.LA(1);

                         
                        int index40_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_94);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA40_95 = input.LA(1);

                         
                        int index40_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_95);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA40_96 = input.LA(1);

                         
                        int index40_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_96);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA40_97 = input.LA(1);

                         
                        int index40_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_97);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA40_98 = input.LA(1);

                         
                        int index40_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_98);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA40_99 = input.LA(1);

                         
                        int index40_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_99);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA40_100 = input.LA(1);

                         
                        int index40_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_100);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA40_101 = input.LA(1);

                         
                        int index40_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_101);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA40_102 = input.LA(1);

                         
                        int index40_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_102);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA40_103 = input.LA(1);

                         
                        int index40_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_103);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA40_104 = input.LA(1);

                         
                        int index40_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_104);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA40_105 = input.LA(1);

                         
                        int index40_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_105);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA40_106 = input.LA(1);

                         
                        int index40_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_106);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA40_107 = input.LA(1);

                         
                        int index40_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_107);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA40_108 = input.LA(1);

                         
                        int index40_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_108);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA40_109 = input.LA(1);

                         
                        int index40_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_109);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA40_110 = input.LA(1);

                         
                        int index40_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_110);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA40_111 = input.LA(1);

                         
                        int index40_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_111);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA40_112 = input.LA(1);

                         
                        int index40_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_112);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA40_113 = input.LA(1);

                         
                        int index40_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_113);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA40_114 = input.LA(1);

                         
                        int index40_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_114);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA40_115 = input.LA(1);

                         
                        int index40_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_115);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA40_116 = input.LA(1);

                         
                        int index40_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_116);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA40_117 = input.LA(1);

                         
                        int index40_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_117);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA40_118 = input.LA(1);

                         
                        int index40_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_GalaxyX()) ) {s = 14;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index40_118);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\12\uffff";
    static final String DFA44_eofS =
        "\1\1\11\uffff";
    static final String DFA44_minS =
        "\1\7\11\uffff";
    static final String DFA44_maxS =
        "\1\137\11\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA44_specialS =
        "\12\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\7\uffff\1\1\1\uffff\1\1\3\uffff\1\1\106\uffff\3\1\1\11",
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
            return "()* loopback of 415:19: ( XOR and_expression )*";
        }
    }
    static final String DFA45_eotS =
        "\13\uffff";
    static final String DFA45_eofS =
        "\1\1\12\uffff";
    static final String DFA45_minS =
        "\1\7\12\uffff";
    static final String DFA45_maxS =
        "\1\140\12\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA45_specialS =
        "\13\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1\7\uffff\1\1\1\uffff\1\1\3\uffff\1\1\106\uffff\4\1\1\12",
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
            return "()* loopback of 419:24: ( AND equality_expression )*";
        }
    }
    static final String DFA46_eotS =
        "\14\uffff";
    static final String DFA46_eofS =
        "\1\1\13\uffff";
    static final String DFA46_minS =
        "\1\7\13\uffff";
    static final String DFA46_maxS =
        "\1\142\13\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA46_specialS =
        "\14\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1\7\uffff\1\1\1\uffff\1\1\3\uffff\1\1\106\uffff\5\1\2\13",
            "",
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
            return "()* loopback of 423:26: ( ( EQ | NEQ ) relational_expression )*";
        }
    }
    static final String DFA47_eotS =
        "\15\uffff";
    static final String DFA47_eofS =
        "\1\1\14\uffff";
    static final String DFA47_minS =
        "\1\7\14\uffff";
    static final String DFA47_maxS =
        "\1\146\14\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\12\uffff\1\1";
    static final String DFA47_specialS =
        "\15\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\1\7\uffff\1\1\1\uffff\1\1\3\uffff\1\1\106\uffff\7\1\4\14",
            "",
            "",
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
            return "()* loopback of 427:21: ( ( LT | GT | LTEQ | GTEQ ) shift_expression )*";
        }
    }
    static final String DFA48_eotS =
        "\16\uffff";
    static final String DFA48_eofS =
        "\1\1\15\uffff";
    static final String DFA48_minS =
        "\1\7\15\uffff";
    static final String DFA48_maxS =
        "\1\150\15\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA48_specialS =
        "\16\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\1\7\uffff\1\1\1\uffff\1\1\3\uffff\1\1\106\uffff\13\1\2\15",
            "",
            "",
            "",
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
            return "()* loopback of 431:24: ( ( SHIFTL | SHIFTR ) additive_expression )*";
        }
    }
    static final String DFA49_eotS =
        "\21\uffff";
    static final String DFA49_eofS =
        "\21\uffff";
    static final String DFA49_minS =
        "\1\6\20\uffff";
    static final String DFA49_maxS =
        "\1\160\20\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\11\uffff\1\2\1\3\1\4\1\5\2\uffff";
    static final String DFA49_specialS =
        "\21\uffff}>";
    static final String[] DFA49_transitionS = {
            "\2\1\6\uffff\1\1\5\uffff\1\1\66\uffff\2\1\4\uffff\13\1\15\uffff"+
            "\1\13\2\uffff\1\14\1\15\3\16",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "436:1: statement : ( expression_statement | selection_statement | while_statement | for_statement | jump_statement );";
        }
    }
    static final String DFA50_eotS =
        "\13\uffff";
    static final String DFA50_eofS =
        "\13\uffff";
    static final String DFA50_minS =
        "\1\6\12\uffff";
    static final String DFA50_maxS =
        "\1\133\12\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\10\uffff";
    static final String DFA50_specialS =
        "\13\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\1\1\6\uffff\1\2\5\uffff\1\2\66\uffff\2\2\4\uffff\13\2",
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
            return "444:1: expression_statement : ( SEMI | expression SEMI );";
        }
    }
    static final String DFA51_eotS =
        "\24\uffff";
    static final String DFA51_eofS =
        "\24\uffff";
    static final String DFA51_minS =
        "\1\6\23\uffff";
    static final String DFA51_maxS =
        "\1\160\23\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\17\uffff";
    static final String DFA51_specialS =
        "\24\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\4\2\uffff\1\1\3\uffff\1\4\5\uffff\1\4\66\uffff\2\4\4\uffff"+
            "\13\4\15\uffff\1\4\2\1\5\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 450:41: ( statement )*";
        }
    }
    static final String DFA52_eotS =
        "\24\uffff";
    static final String DFA52_eofS =
        "\24\uffff";
    static final String DFA52_minS =
        "\1\6\23\uffff";
    static final String DFA52_maxS =
        "\1\160\23\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\17\uffff";
    static final String DFA52_specialS =
        "\24\uffff}>";
    static final String[] DFA52_transitionS = {
            "\2\4\2\uffff\1\1\3\uffff\1\4\5\uffff\1\4\66\uffff\2\4\4\uffff"+
            "\13\4\15\uffff\1\4\2\1\5\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 451:44: ( statement )*";
        }
    }
    static final String DFA54_eotS =
        "\22\uffff";
    static final String DFA54_eofS =
        "\22\uffff";
    static final String DFA54_minS =
        "\1\6\21\uffff";
    static final String DFA54_maxS =
        "\1\160\21\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\2\1\1\17\uffff";
    static final String DFA54_specialS =
        "\22\uffff}>";
    static final String[] DFA54_transitionS = {
            "\2\2\2\uffff\1\1\3\uffff\1\2\5\uffff\1\2\66\uffff\2\2\4\uffff"+
            "\13\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 452:17: ( statement )*";
        }
    }
    static final String DFA56_eotS =
        "\22\uffff";
    static final String DFA56_eofS =
        "\22\uffff";
    static final String DFA56_minS =
        "\1\6\21\uffff";
    static final String DFA56_maxS =
        "\1\160\21\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\2\1\1\17\uffff";
    static final String DFA56_specialS =
        "\22\uffff}>";
    static final String[] DFA56_transitionS = {
            "\2\2\2\uffff\1\1\3\uffff\1\2\5\uffff\1\2\66\uffff\2\2\4\uffff"+
            "\13\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 457:44: ( statement )*";
        }
    }
    static final String DFA57_eotS =
        "\22\uffff";
    static final String DFA57_eofS =
        "\22\uffff";
    static final String DFA57_minS =
        "\1\6\21\uffff";
    static final String DFA57_maxS =
        "\1\160\21\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\2\1\1\17\uffff";
    static final String DFA57_specialS =
        "\22\uffff}>";
    static final String[] DFA57_transitionS = {
            "\2\2\2\uffff\1\1\3\uffff\1\2\5\uffff\1\2\66\uffff\2\2\4\uffff"+
            "\13\2\15\uffff\1\2\2\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 463:4: ( statement )*";
        }
    }
    static final String DFA58_eotS =
        "\16\uffff";
    static final String DFA58_eofS =
        "\16\uffff";
    static final String DFA58_minS =
        "\1\156\2\uffff\1\6\12\uffff";
    static final String DFA58_maxS =
        "\1\160\2\uffff\1\133\12\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\10\uffff";
    static final String DFA58_specialS =
        "\16\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\1\2\1\3",
            "",
            "",
            "\1\5\1\4\6\uffff\1\5\5\uffff\1\5\66\uffff\2\5\4\uffff\13\5",
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
            return "467:1: jump_statement : ( BREAK SEMI | CONTINUE SEMI | RETURN SEMI | RETURN expression SEMI );";
        }
    }
 

    public static final BitSet FOLLOW_namespace_in_translation_unit95 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_modifier_in_typedef_decl108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedef_decl111 = new BitSet(new long[]{0xFFFFFF0000000040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_type_in_typedef_decl114 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedef_decl116 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_typedef_decl118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace135 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_namespace140 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_namespace142 = new BitSet(new long[]{0xFFFFFF0016043C60L,0x00000000000007FFL});
    public static final BitSet FOLLOW_initializer_in_namespace152 = new BitSet(new long[]{0xFFFFFF0016043460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_function_in_namespace156 = new BitSet(new long[]{0xFFFFFF0016043460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_class_decl_in_namespace160 = new BitSet(new long[]{0xFFFFFF0016043460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_field_decl_in_namespace164 = new BitSet(new long[]{0xFFFFFF0016043460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_typedef_decl_in_namespace168 = new BitSet(new long[]{0xFFFFFF0016043460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_END_in_namespace175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer197 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_initializer199 = new BitSet(new long[]{0xFFFFFF0000000040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_local_var_decl_in_initializer211 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_statement_in_initializer220 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_END_in_initializer227 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INITIALIZER_in_initializer230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_function249 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_STATIC_in_function257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_FUNC_in_function262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function267 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_function269 = new BitSet(new long[]{0xFFFFFF0000008040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_argument_list_in_function274 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_function277 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RETURNS_in_function280 = new BitSet(new long[]{0xFFFFFF0000000040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_type_in_function285 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_function287 = new BitSet(new long[]{0xFFFFFF00001044C0L,0x0001F2000FFE1FFFL});
    public static final BitSet FOLLOW_local_var_decl_in_function301 = new BitSet(new long[]{0xFFFFFF00001044C0L,0x0001F2000FFE1FFFL});
    public static final BitSet FOLLOW_statement_in_function317 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_END_in_function328 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_FUNC_in_function331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_argument_list354 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argument_list358 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_argument_list369 = new BitSet(new long[]{0xFFFFFF0000000040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_type_in_argument_list373 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argument_list377 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_modifier_in_class_decl396 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl406 = new BitSet(new long[]{0x0000000000480200L});
    public static final BitSet FOLLOW_LBRACK_in_class_decl409 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_INTEGER_in_class_decl414 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_class_decl417 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_EXTENDS_in_class_decl423 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_decl425 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_class_decl429 = new BitSet(new long[]{0xFFFFFF0017843460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_function_in_class_decl439 = new BitSet(new long[]{0xFFFFFF0017843460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_field_decl_in_class_decl443 = new BitSet(new long[]{0xFFFFFF0017843460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_typedef_decl_in_class_decl447 = new BitSet(new long[]{0xFFFFFF0017843460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_constr_decl_in_class_decl451 = new BitSet(new long[]{0xFFFFFF0017843460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_destr_decl_in_class_decl455 = new BitSet(new long[]{0xFFFFFF0017843460L,0x00000000000007FFL});
    public static final BitSet FOLLOW_END_in_class_decl462 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CLASS_in_class_decl465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constr_decl483 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_constr_decl486 = new BitSet(new long[]{0xFFFFFF0000008040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_argument_list_in_constr_decl491 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_constr_decl494 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_constr_decl497 = new BitSet(new long[]{0xFFFFFF00001044C0L,0x0001F2000FFE1FFFL});
    public static final BitSet FOLLOW_local_var_decl_in_constr_decl510 = new BitSet(new long[]{0xFFFFFF00001044C0L,0x0001F2000FFE1FFFL});
    public static final BitSet FOLLOW_statement_in_constr_decl526 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_END_in_constr_decl532 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTRUCTOR_in_constr_decl535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destr_decl549 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_destr_decl552 = new BitSet(new long[]{0xFFFFFF0000008040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_argument_list_in_destr_decl557 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_destr_decl560 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_destr_decl563 = new BitSet(new long[]{0xFFFFFF00001044C0L,0x0001F2000FFE1FFFL});
    public static final BitSet FOLLOW_local_var_decl_in_destr_decl576 = new BitSet(new long[]{0xFFFFFF00001044C0L,0x0001F2000FFE1FFFL});
    public static final BitSet FOLLOW_statement_in_destr_decl589 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_END_in_destr_decl595 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DESTRUCTOR_in_destr_decl598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_local_var_decl632 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_array_decl_in_local_var_decl636 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_local_var_decl641 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_ASSGN_in_local_var_decl645 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_local_var_decl648 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_local_var_decl652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_field_decl671 = new BitSet(new long[]{0xFFFFFF0010001040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_STATIC_in_field_decl679 = new BitSet(new long[]{0xFFFFFF0010000040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_CONST_in_field_decl686 = new BitSet(new long[]{0xFFFFFF0000000040L,0x00000000000007FFL});
    public static final BitSet FOLLOW_type_in_field_decl691 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_array_decl_in_field_decl696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_field_decl701 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_ASSGN_in_field_decl705 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_field_decl707 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_field_decl711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_decl732 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_array_decl734 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_array_decl736 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type819 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_type821 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_type844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_in_type858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GAMELINK_in_type865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_in_type872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_type886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_type893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABILCMD_in_type900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTOR_in_type907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTORSCOPE_in_type914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANK_in_type921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAMERAINFO_in_type928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARKER_in_type935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_type942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAYERGROUP_in_type949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGION_in_type956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REVEALER_in_type963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUNDLINK_in_type970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_type977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMER_in_type984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSMISSIONSOURCE_in_type991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIGGER_in_type998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITFILTER_in_type1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITGROUP_in_type1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITREF_in_type1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIT_in_type1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVEINFO_in_type1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVETARGET_in_type1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOODAD_in_type1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AIFILTER_in_type1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUND_in_type1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WAVE_in_type1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1093 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_argument_expression_list1096 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1098 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1112 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression1116 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_SUB_in_additive_expression1123 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression1140 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_TIMES_in_multiplicative_expression1143 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression1146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_DIV_in_multiplicative_expression1150 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_modulo_expression_in_multiplicative_expression1153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression1167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_MODULO_in_modulo_expression1170 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_unary_expression_in_modulo_expression1173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression1192 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1208 = new BitSet(new long[]{0x0000008000084002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACK_in_postfix_expression1222 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_postfix_expression1225 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_postfix_expression1227 = new BitSet(new long[]{0x0000008000084002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1242 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1245 = new BitSet(new long[]{0x0000008000084002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression1260 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression1263 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression1265 = new BitSet(new long[]{0x0000008000084002L,0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression1280 = new BitSet(new long[]{0x0000000000104040L,0x000000000FE00000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1282 = new BitSet(new long[]{0x0000008000084002L,0x0000000000010000L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_postfix_expression1294 = new BitSet(new long[]{0x0000000000104040L,0x000000000FE00000L});
    public static final BitSet FOLLOW_postfix_expression_in_postfix_expression1296 = new BitSet(new long[]{0x0000008000084002L,0x0000000000010000L});
    public static final BitSet FOLLOW_PLUS_in_unary_operator1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unary_operator1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_operator1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_unary_operator1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unary_operator1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_unary_operator1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary_expression1368 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_primary_expression1371 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_primary_expression1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_constant_expression1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_assignment_expression1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_assignment_expression1495 = new BitSet(new long[]{0x0000007FE8000000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1497 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_lvalue1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1523 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_LOR_in_logical_or_expression1526 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1529 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1543 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_LAND_in_logical_and_expression1546 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1549 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1562 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_OR_in_inclusive_or_expression1565 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1568 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1581 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_XOR_in_exclusive_or_expression1584 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1600 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_and_expression1603 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1606 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1620 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_set_in_equality_expression1623 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1630 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1643 = new BitSet(new long[]{0x0000000000000002L,0x0000007800000000L});
    public static final BitSet FOLLOW_set_in_relational_expression1646 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1657 = new BitSet(new long[]{0x0000000000000002L,0x0000007800000000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1670 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_set_in_shift_expression1673 = new BitSet(new long[]{0x0000000000104040L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1680 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_expression_statement_in_statement1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement1735 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_expression_statement1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_statement1749 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_selection_statement1751 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_selection_statement1754 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_selection_statement1756 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_selection_statement1759 = new BitSet(new long[]{0x00000000001044C0L,0x0001FE000FFE1800L});
    public static final BitSet FOLLOW_statement_in_selection_statement1762 = new BitSet(new long[]{0x00000000001044C0L,0x0001FE000FFE1800L});
    public static final BitSet FOLLOW_ELIF_in_selection_statement1769 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_selection_statement1771 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_selection_statement1774 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_selection_statement1776 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_selection_statement1779 = new BitSet(new long[]{0x00000000001044C0L,0x0001FE000FFE1800L});
    public static final BitSet FOLLOW_statement_in_selection_statement1782 = new BitSet(new long[]{0x00000000001044C0L,0x0001FE000FFE1800L});
    public static final BitSet FOLLOW_ELSE_in_selection_statement1791 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_selection_statement1793 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_statement_in_selection_statement1796 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_END_in_selection_statement1804 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_IF_in_selection_statement1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1818 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_while_statement1820 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_while_statement1823 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_while_statement1825 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_while_statement1828 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_statement_in_while_statement1831 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_END_in_while_statement1837 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHILE_in_while_statement1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement1851 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAREN_in_for_statement1853 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_for_statement1856 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1858 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_for_statement1861 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_for_statement1863 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_for_statement1866 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_for_statement1868 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_for_statement1871 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_statement_in_for_statement1877 = new BitSet(new long[]{0x00000000001044C0L,0x0001F2000FFE1800L});
    public static final BitSet FOLLOW_END_in_for_statement1883 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_FOR_in_for_statement1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_jump_statement1897 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_jump_statement1905 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1913 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_statement1921 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_jump_statement1923 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_jump_statement1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred4_GalaxyX156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_decl_in_synpred6_GalaxyX164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred12_GalaxyX301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred18_GalaxyX439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_decl_in_synpred19_GalaxyX443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred24_GalaxyX510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_var_decl_in_synpred27_GalaxyX576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_synpred91_GalaxyX1222 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_expression_in_synpred91_GalaxyX1225 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_synpred91_GalaxyX1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred92_GalaxyX1242 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred92_GalaxyX1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred93_GalaxyX1260 = new BitSet(new long[]{0x00000000001040C0L,0x000000000FFE1800L});
    public static final BitSet FOLLOW_argument_expression_list_in_synpred93_GalaxyX1263 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred93_GalaxyX1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred94_GalaxyX1280 = new BitSet(new long[]{0x0000000000104040L,0x000000000FE00000L});
    public static final BitSet FOLLOW_postfix_expression_in_synpred94_GalaxyX1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_ACCESS_in_synpred95_GalaxyX1294 = new BitSet(new long[]{0x0000000000104040L,0x000000000FE00000L});
    public static final BitSet FOLLOW_postfix_expression_in_synpred95_GalaxyX1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_synpred110_GalaxyX1490 = new BitSet(new long[]{0x0000000000000002L});

}