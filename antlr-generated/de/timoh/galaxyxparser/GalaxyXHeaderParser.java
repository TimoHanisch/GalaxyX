// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g 2013-02-28 11:50:08

	package de.timoh.galaxyxparser;
	import de.timoh.galaxyxparser.typechecking.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class GalaxyXHeaderParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PREFIX", "DEFINE", "IDENTIFIER", "INTEGER", "FIXED_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", "LETTER", "EscapeSequence", "DIGIT", "HEX_LITERAL", "HexDigit", "Exponent", "FloatTypeSuffix", "OctalEscape", "UnicodeEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT"
    };
    public static final int EOF=-1;
    public static final int PREFIX=4;
    public static final int DEFINE=5;
    public static final int IDENTIFIER=6;
    public static final int INTEGER=7;
    public static final int FIXED_LITERAL=8;
    public static final int CHARACTER_LITERAL=9;
    public static final int STRING_LITERAL=10;
    public static final int LETTER=11;
    public static final int EscapeSequence=12;
    public static final int DIGIT=13;
    public static final int HEX_LITERAL=14;
    public static final int HexDigit=15;
    public static final int Exponent=16;
    public static final int FloatTypeSuffix=17;
    public static final int OctalEscape=18;
    public static final int UnicodeEscape=19;
    public static final int WS=20;
    public static final int LINE_COMMENT=21;
    public static final int MULTI_COMMENT=22;

    // delegates
    // delegators


        public GalaxyXHeaderParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXHeaderParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[7+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GalaxyXHeaderParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g"; }


    public static class rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g:18:1: rule : ( define )* ;
    public final GalaxyXHeaderParser.rule_return rule() throws RecognitionException {
        GalaxyXHeaderParser.rule_return retval = new GalaxyXHeaderParser.rule_return();
        retval.start = input.LT(1);
        int rule_StartIndex = input.index();
        CommonTree root_0 = null;

        GalaxyXHeaderParser.define_return define1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g:19:2: ( ( define )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g:19:4: ( define )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g:19:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PREFIX) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g:0:0: define
            	    {
            	    pushFollow(FOLLOW_define_in_rule77);
            	    define1=define();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, define1.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 1, rule_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rule"

    public static class define_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "define"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g:23:1: define : PREFIX DEFINE IDENTIFIER ( IDENTIFIER | INTEGER | FIXED_LITERAL | CHARACTER_LITERAL | STRING_LITERAL ) ;
    public final GalaxyXHeaderParser.define_return define() throws RecognitionException {
        GalaxyXHeaderParser.define_return retval = new GalaxyXHeaderParser.define_return();
        retval.start = input.LT(1);
        int define_StartIndex = input.index();
        CommonTree root_0 = null;

        Token PREFIX2=null;
        Token DEFINE3=null;
        Token IDENTIFIER4=null;
        Token set5=null;

        CommonTree PREFIX2_tree=null;
        CommonTree DEFINE3_tree=null;
        CommonTree IDENTIFIER4_tree=null;
        CommonTree set5_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g:24:2: ( PREFIX DEFINE IDENTIFIER ( IDENTIFIER | INTEGER | FIXED_LITERAL | CHARACTER_LITERAL | STRING_LITERAL ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyXHeader.g:24:4: PREFIX DEFINE IDENTIFIER ( IDENTIFIER | INTEGER | FIXED_LITERAL | CHARACTER_LITERAL | STRING_LITERAL )
            {
            root_0 = (CommonTree)adaptor.nil();

            PREFIX2=(Token)match(input,PREFIX,FOLLOW_PREFIX_in_define90); if (state.failed) return retval;
            DEFINE3=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_define93); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFINE3_tree = (CommonTree)adaptor.create(DEFINE3);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFINE3_tree, root_0);
            }
            IDENTIFIER4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_define96); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER4_tree = (CommonTree)adaptor.create(IDENTIFIER4);
            adaptor.addChild(root_0, IDENTIFIER4_tree);
            }
            set5=(Token)input.LT(1);
            if ( (input.LA(1)>=IDENTIFIER && input.LA(1)<=STRING_LITERAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set5));
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
            if ( state.backtracking>0 ) { memoize(input, 2, define_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "define"

    // Delegated rules


 

    public static final BitSet FOLLOW_define_in_rule77 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_PREFIX_in_define90 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DEFINE_in_define93 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_define96 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_set_in_define98 = new BitSet(new long[]{0x0000000000000002L});

}