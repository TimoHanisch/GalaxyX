// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g 2013-02-28 12:08:56

  package com.galaxyx.galaxyxparser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXHeaderWalker extends TreeParser {
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


        public GalaxyXHeaderWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXHeaderWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GalaxyXHeaderWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g"; }



    // $ANTLR start "rule"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:12:1: rule : ( define )* EOF ;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:12:5: ( ( define )* EOF )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:12:7: ( define )* EOF
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:12:7: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DEFINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:12:7: define
            	    {
            	    pushFollow(FOLLOW_define_in_rule48);
            	    define();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_rule51); 

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
    // $ANTLR end "rule"


    // $ANTLR start "define"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:14:1: define : ^( DEFINE i1= IDENTIFIER i2= basic ) ;
    public final void define() throws RecognitionException {
        CommonTree i1=null;
        String i2 = null;


        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:15:2: ( ^( DEFINE i1= IDENTIFIER i2= basic ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:15:4: ^( DEFINE i1= IDENTIFIER i2= basic )
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_define61); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_define65); 
            pushFollow(FOLLOW_basic_in_define69);
            i2=basic();

            state._fsp--;

            Main.table.putDefine(i1.getText(),i2);

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
    // $ANTLR end "define"


    // $ANTLR start "basic"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:18:1: basic returns [String s] : (i1= IDENTIFIER | i1= INTEGER | i1= FIXED_LITERAL | i1= CHARACTER_LITERAL | i1= STRING_LITERAL ) ;
    public final String basic() throws RecognitionException {
        String s = null;

        CommonTree i1=null;

        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:19:2: ( (i1= IDENTIFIER | i1= INTEGER | i1= FIXED_LITERAL | i1= CHARACTER_LITERAL | i1= STRING_LITERAL ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:19:4: (i1= IDENTIFIER | i1= INTEGER | i1= FIXED_LITERAL | i1= CHARACTER_LITERAL | i1= STRING_LITERAL )
            {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:19:4: (i1= IDENTIFIER | i1= INTEGER | i1= FIXED_LITERAL | i1= CHARACTER_LITERAL | i1= STRING_LITERAL )
            int alt2=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt2=1;
                }
                break;
            case INTEGER:
                {
                alt2=2;
                }
                break;
            case FIXED_LITERAL:
                {
                alt2=3;
                }
                break;
            case CHARACTER_LITERAL:
                {
                alt2=4;
                }
                break;
            case STRING_LITERAL:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:19:5: i1= IDENTIFIER
                    {
                    i1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_basic93); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:20:4: i1= INTEGER
                    {
                    i1=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_basic103); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:21:4: i1= FIXED_LITERAL
                    {
                    i1=(CommonTree)match(input,FIXED_LITERAL,FOLLOW_FIXED_LITERAL_in_basic113); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:22:4: i1= CHARACTER_LITERAL
                    {
                    i1=(CommonTree)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_basic122); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyXHeaderWalker.g:23:4: i1= STRING_LITERAL
                    {
                    i1=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_basic131); 

                    }
                    break;

            }

            s = i1.getText();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "basic"

    // Delegated rules


 

    public static final BitSet FOLLOW_define_in_rule48 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_rule51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_define61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_define65 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_basic_in_define69 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_basic93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_basic103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIXED_LITERAL_in_basic113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_basic122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_basic131 = new BitSet(new long[]{0x0000000000000002L});

}