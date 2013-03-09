// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g 2013-03-02 17:19:13

  	package com.galaxyx.galaxyxparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXHeaderLexer extends Lexer {
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

    public GalaxyXHeaderLexer() {;} 
    public GalaxyXHeaderLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GalaxyXHeaderLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g"; }

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:29:8: ( 'define' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:29:10: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "PREFIX"
    public final void mPREFIX() throws RecognitionException {
        try {
            int _type = PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:30:8: ( '#' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:30:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREFIX"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:34:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:34:4: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:34:11: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:39:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "CHARACTER_LITERAL"
    public final void mCHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:45:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:45:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:45:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\\') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:45:16: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:45:33: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:49:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:49:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:49:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:49:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:49:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:53:2: ( ( DIGIT )+ | HEX_LITERAL )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='X'||LA5_1=='x') ) {
                    alt5=2;
                }
                else {
                    alt5=1;}
            }
            else if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:53:4: ( DIGIT )+
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:53:4: ( DIGIT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:53:4: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:54:4: HEX_LITERAL
                    {
                    mHEX_LITERAL(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:58:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:58:15: '0' ( 'x' | 'X' ) ( HexDigit )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:58:29: ( HexDigit )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||(LA6_0>='a' && LA6_0<='f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:58:29: HexDigit
            	    {
            	    mHexDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:61:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:61:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "FIXED_LITERAL"
    public final void mFIXED_LITERAL() throws RecognitionException {
        try {
            int _type = FIXED_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:64:2: ( ( DIGIT )+ '.' ( DIGIT )* | '.' ( DIGIT )+ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='.') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:64:4: ( DIGIT )+ '.' ( DIGIT )*
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:64:4: ( DIGIT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:64:4: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('.'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:64:15: ( DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:64:15: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:65:4: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:65:8: ( DIGIT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:65:8: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIXED_LITERAL"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:69:7: ( '0' .. '9' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:69:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:72:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:72:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:72:22: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:72:33: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:72:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatTypeSuffix"
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:75:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:75:19: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "FloatTypeSuffix"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:79:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\\') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='\"'||LA13_1=='\''||LA13_1=='\\'||LA13_1=='b'||LA13_1=='f'||LA13_1=='n'||LA13_1=='r'||LA13_1=='t') ) {
                    alt13=1;
                }
                else if ( ((LA13_1>='0' && LA13_1<='7')) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:79:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:80:9: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:85:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\\') ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>='0' && LA14_1<='3')) ) {
                    int LA14_2 = input.LA(3);

                    if ( ((LA14_2>='0' && LA14_2<='7')) ) {
                        int LA14_4 = input.LA(4);

                        if ( ((LA14_4>='0' && LA14_4<='7')) ) {
                            alt14=1;
                        }
                        else {
                            alt14=2;}
                    }
                    else {
                        alt14=3;}
                }
                else if ( ((LA14_1>='4' && LA14_1<='7')) ) {
                    int LA14_3 = input.LA(3);

                    if ( ((LA14_3>='0' && LA14_3<='7')) ) {
                        alt14=2;
                    }
                    else {
                        alt14=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:85:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:85:14: ( '0' .. '3' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:85:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:85:25: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:85:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:85:36: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:85:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:86:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:86:14: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:86:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:86:25: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:86:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:87:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:87:14: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:87:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:92:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:92:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:96:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:96:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:100:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:100:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:100:12: (~ ( '\\n' | '\\r' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:100:12: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:100:26: ( '\\r' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:100:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:104:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:104:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:104:14: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:104:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:8: ( DEFINE | PREFIX | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | INTEGER | FIXED_LITERAL | WS | LINE_COMMENT | MULTI_COMMENT )
        int alt18=10;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:10: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 2 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:17: PREFIX
                {
                mPREFIX(); 

                }
                break;
            case 3 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:24: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 4 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:35: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 

                }
                break;
            case 5 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:53: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 6 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:68: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 7 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:76: FIXED_LITERAL
                {
                mFIXED_LITERAL(); 

                }
                break;
            case 8 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:90: WS
                {
                mWS(); 

                }
                break;
            case 9 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:93: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 10 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\build\\classes\\com\\galaxyx\\galaxyxparser\\GalaxyXHeader.g:1:106: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\3\4\uffff\2\14\3\uffff\1\3\3\uffff\3\3\1\23\1\uffff";
    static final String DFA18_eofS =
        "\24\uffff";
    static final String DFA18_minS =
        "\1\11\1\145\4\uffff\2\56\2\uffff\1\52\1\146\3\uffff\1\151\1\156"+
        "\1\145\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\172\1\145\4\uffff\2\71\2\uffff\1\57\1\146\3\uffff\1\151\1\156"+
        "\1\145\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\2\uffff\1\7\1\10\2\uffff\1\6\1\11\1\12"+
        "\4\uffff\1\1";
    static final String DFA18_specialS =
        "\24\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\11\1\uffff\2\11\22\uffff\1\11\1\uffff\1\5\1\2\3\uffff\1"+
            "\4\6\uffff\1\10\1\12\1\6\11\7\7\uffff\32\3\4\uffff\1\3\1\uffff"+
            "\3\3\1\1\26\3",
            "\1\13",
            "",
            "",
            "",
            "",
            "\1\10\1\uffff\12\7",
            "\1\10\1\uffff\12\7",
            "",
            "",
            "\1\16\4\uffff\1\15",
            "\1\17",
            "",
            "",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "\12\3\7\uffff\32\3\4\uffff\1\3\1\uffff\32\3",
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
            return "1:1: Tokens : ( DEFINE | PREFIX | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | INTEGER | FIXED_LITERAL | WS | LINE_COMMENT | MULTI_COMMENT );";
        }
    }
 

}