// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g 2013-03-13 08:55:52

  	package com.galaxyx.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class GalaxyXLexer extends Lexer {
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

    // delegates
    // delegators

    public GalaxyXLexer() {;} 
    public GalaxyXLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GalaxyXLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
        state.ruleMemo = new HashMap[224+1];
 
    }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g"; }

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        int IF_StartIndex = input.index();
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:15:4: ( 'if' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:15:6: 'if'
            {
            match("if"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, IF_StartIndex); }
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        int ELSE_StartIndex = input.index();
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:16:6: ( 'else' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:16:8: 'else'
            {
            match("else"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, ELSE_StartIndex); }
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        int ELIF_StartIndex = input.index();
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:17:5: ( 'elif' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:17:7: 'elif'
            {
            match("elif"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, ELIF_StartIndex); }
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        int WHILE_StartIndex = input.index();
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:18:7: ( 'while' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:18:9: 'while'
            {
            match("while"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, WHILE_StartIndex); }
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        int FOR_StartIndex = input.index();
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:19:5: ( 'for' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:19:7: 'for'
            {
            match("for"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, FOR_StartIndex); }
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        int END_StartIndex = input.index();
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:20:5: ( 'end' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:20:7: 'end'
            {
            match("end"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, END_StartIndex); }
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        int DO_StartIndex = input.index();
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:21:4: ( 'do' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:21:6: 'do'
            {
            match("do"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, DO_StartIndex); }
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        int BREAK_StartIndex = input.index();
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:24:7: ( 'break' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:24:9: 'break'
            {
            match("break"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, BREAK_StartIndex); }
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        int CONTINUE_StartIndex = input.index();
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:25:10: ( 'continue' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:25:12: 'continue'
            {
            match("continue"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, CONTINUE_StartIndex); }
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        int RETURN_StartIndex = input.index();
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:26:8: ( 'return' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:26:10: 'return'
            {
            match("return"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, RETURN_StartIndex); }
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        int FALSE_StartIndex = input.index();
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:29:7: ( 'false' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:29:9: 'false'
            {
            match("false"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, FALSE_StartIndex); }
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        int TRUE_StartIndex = input.index();
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:30:6: ( 'true' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:30:8: 'true'
            {
            match("true"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, TRUE_StartIndex); }
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        int NULL_StartIndex = input.index();
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:31:6: ( 'null' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:31:8: 'null'
            {
            match("null"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, NULL_StartIndex); }
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        int STRUCT_StartIndex = input.index();
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:34:8: ( 'struct' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:34:10: 'struct'
            {
            match("struct"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, STRUCT_StartIndex); }
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        int FUNC_StartIndex = input.index();
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:35:6: ( 'func' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:35:8: 'func'
            {
            match("func"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, FUNC_StartIndex); }
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "CONSTRUCTOR"
    public final void mCONSTRUCTOR() throws RecognitionException {
        int CONSTRUCTOR_StartIndex = input.index();
        try {
            int _type = CONSTRUCTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:36:13: ( 'constructor' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:36:15: 'constructor'
            {
            match("constructor"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, CONSTRUCTOR_StartIndex); }
        }
    }
    // $ANTLR end "CONSTRUCTOR"

    // $ANTLR start "DESTRUCTOR"
    public final void mDESTRUCTOR() throws RecognitionException {
        int DESTRUCTOR_StartIndex = input.index();
        try {
            int _type = DESTRUCTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:37:12: ( 'destructor' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:37:14: 'destructor'
            {
            match("destructor"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, DESTRUCTOR_StartIndex); }
        }
    }
    // $ANTLR end "DESTRUCTOR"

    // $ANTLR start "TYPEDEF"
    public final void mTYPEDEF() throws RecognitionException {
        int TYPEDEF_StartIndex = input.index();
        try {
            int _type = TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:38:9: ( 'typedef' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:38:11: 'typedef'
            {
            match("typedef"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, TYPEDEF_StartIndex); }
        }
    }
    // $ANTLR end "TYPEDEF"

    // $ANTLR start "NAMESPACE"
    public final void mNAMESPACE() throws RecognitionException {
        int NAMESPACE_StartIndex = input.index();
        try {
            int _type = NAMESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:39:11: ( 'namespace' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:39:13: 'namespace'
            {
            match("namespace"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, NAMESPACE_StartIndex); }
        }
    }
    // $ANTLR end "NAMESPACE"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        int CLASS_StartIndex = input.index();
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:40:7: ( 'class' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:40:9: 'class'
            {
            match("class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, CLASS_StartIndex); }
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        int INTERFACE_StartIndex = input.index();
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:41:11: ( 'interface' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:41:13: 'interface'
            {
            match("interface"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, INTERFACE_StartIndex); }
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "IMPLEMENTS"
    public final void mIMPLEMENTS() throws RecognitionException {
        int IMPLEMENTS_StartIndex = input.index();
        try {
            int _type = IMPLEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:42:12: ( 'implements' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:42:14: 'implements'
            {
            match("implements"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, IMPLEMENTS_StartIndex); }
        }
    }
    // $ANTLR end "IMPLEMENTS"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        int EXTENDS_StartIndex = input.index();
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:43:9: ( 'extends' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:43:11: 'extends'
            {
            match("extends"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, EXTENDS_StartIndex); }
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        int NEW_StartIndex = input.index();
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:44:5: ( 'new' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:44:7: 'new'
            {
            match("new"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, NEW_StartIndex); }
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        int DELETE_StartIndex = input.index();
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:45:8: ( 'delete' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:45:10: 'delete'
            {
            match("delete"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, DELETE_StartIndex); }
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        int THIS_StartIndex = input.index();
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:46:6: ( 'this' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:46:8: 'this'
            {
            match("this"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, THIS_StartIndex); }
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        int SUPER_StartIndex = input.index();
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:47:7: ( 'super' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:47:9: 'super'
            {
            match("super"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, SUPER_StartIndex); }
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "NAMEOF"
    public final void mNAMEOF() throws RecognitionException {
        int NAMEOF_StartIndex = input.index();
        try {
            int _type = NAMEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:48:8: ( 'nameof' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:48:10: 'nameof'
            {
            match("nameof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, NAMEOF_StartIndex); }
        }
    }
    // $ANTLR end "NAMEOF"

    // $ANTLR start "INITIALIZER"
    public final void mINITIALIZER() throws RecognitionException {
        int INITIALIZER_StartIndex = input.index();
        try {
            int _type = INITIALIZER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:49:13: ( 'initializer' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:49:15: 'initializer'
            {
            match("initializer"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, INITIALIZER_StartIndex); }
        }
    }
    // $ANTLR end "INITIALIZER"

    // $ANTLR start "INLINE"
    public final void mINLINE() throws RecognitionException {
        int INLINE_StartIndex = input.index();
        try {
            int _type = INLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:52:8: ( 'inline' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:52:10: 'inline'
            {
            match("inline"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, INLINE_StartIndex); }
        }
    }
    // $ANTLR end "INLINE"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        int STATIC_StartIndex = input.index();
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:55:8: ( 'static' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:55:10: 'static'
            {
            match("static"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, STATIC_StartIndex); }
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        int CONST_StartIndex = input.index();
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:56:7: ( 'const' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:56:9: 'const'
            {
            match("const"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, CONST_StartIndex); }
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        int PRIVATE_StartIndex = input.index();
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:59:9: ( 'private' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:59:11: 'private'
            {
            match("private"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, PRIVATE_StartIndex); }
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        int PUBLIC_StartIndex = input.index();
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:60:8: ( 'public' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:60:10: 'public'
            {
            match("public"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, PUBLIC_StartIndex); }
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "NATIVE"
    public final void mNATIVE() throws RecognitionException {
        int NATIVE_StartIndex = input.index();
        try {
            int _type = NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:63:8: ( 'native' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:63:10: 'native'
            {
            match("native"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, NATIVE_StartIndex); }
        }
    }
    // $ANTLR end "NATIVE"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        int DEFINE_StartIndex = input.index();
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:65:8: ( 'define' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:65:10: 'define'
            {
            match("define"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, DEFINE_StartIndex); }
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "UNDEF"
    public final void mUNDEF() throws RecognitionException {
        int UNDEF_StartIndex = input.index();
        try {
            int _type = UNDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:66:7: ( 'undef' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:66:9: 'undef'
            {
            match("undef"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, UNDEF_StartIndex); }
        }
    }
    // $ANTLR end "UNDEF"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        int INCLUDE_StartIndex = input.index();
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:67:9: ( 'include' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:67:11: 'include'
            {
            match("include"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, INCLUDE_StartIndex); }
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "PREFIX"
    public final void mPREFIX() throws RecognitionException {
        int PREFIX_StartIndex = input.index();
        try {
            int _type = PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:69:8: ( '#' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:69:10: '#'
            {
            match('#'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, PREFIX_StartIndex); }
        }
    }
    // $ANTLR end "PREFIX"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        int SEMI_StartIndex = input.index();
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:72:6: ( ';' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:72:8: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, SEMI_StartIndex); }
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        int COMMA_StartIndex = input.index();
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:73:7: ( ',' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:73:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, COMMA_StartIndex); }
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        int DOT_StartIndex = input.index();
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:74:5: ( '.' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:74:7: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, DOT_StartIndex); }
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        int COLON_StartIndex = input.index();
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:75:7: ( ':' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:75:9: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, COLON_StartIndex); }
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "RETURNS"
    public final void mRETURNS() throws RecognitionException {
        int RETURNS_StartIndex = input.index();
        try {
            int _type = RETURNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:77:9: ( '->' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:77:11: '->'
            {
            match("->"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, RETURNS_StartIndex); }
        }
    }
    // $ANTLR end "RETURNS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        int PLUS_StartIndex = input.index();
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:78:6: ( '+' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:78:8: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, PLUS_StartIndex); }
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        int SUB_StartIndex = input.index();
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:79:5: ( '-' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:79:7: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, SUB_StartIndex); }
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        int DIV_StartIndex = input.index();
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:80:5: ( '/' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:80:7: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, DIV_StartIndex); }
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        int TIMES_StartIndex = input.index();
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:81:7: ( '*' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:81:9: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, TIMES_StartIndex); }
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "MODULO"
    public final void mMODULO() throws RecognitionException {
        int MODULO_StartIndex = input.index();
        try {
            int _type = MODULO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:82:8: ( '%' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:82:10: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, MODULO_StartIndex); }
        }
    }
    // $ANTLR end "MODULO"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        int AND_StartIndex = input.index();
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:84:5: ( '&' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:84:7: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, AND_StartIndex); }
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        int OR_StartIndex = input.index();
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:85:4: ( '|' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:85:6: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, OR_StartIndex); }
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        int XOR_StartIndex = input.index();
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:86:5: ( '^' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:86:7: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, XOR_StartIndex); }
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "BIT_NOT"
    public final void mBIT_NOT() throws RecognitionException {
        int BIT_NOT_StartIndex = input.index();
        try {
            int _type = BIT_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:87:9: ( '~' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:87:11: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, BIT_NOT_StartIndex); }
        }
    }
    // $ANTLR end "BIT_NOT"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        int NOT_StartIndex = input.index();
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:88:5: ( '!' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:88:7: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, NOT_StartIndex); }
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "LOR"
    public final void mLOR() throws RecognitionException {
        int LOR_StartIndex = input.index();
        try {
            int _type = LOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:89:5: ( '||' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:89:7: '||'
            {
            match("||"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, LOR_StartIndex); }
        }
    }
    // $ANTLR end "LOR"

    // $ANTLR start "LAND"
    public final void mLAND() throws RecognitionException {
        int LAND_StartIndex = input.index();
        try {
            int _type = LAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:90:6: ( '&&' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:90:8: '&&'
            {
            match("&&"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, LAND_StartIndex); }
        }
    }
    // $ANTLR end "LAND"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        int EQ_StartIndex = input.index();
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:91:4: ( '==' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:91:6: '=='
            {
            match("=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, EQ_StartIndex); }
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        int NEQ_StartIndex = input.index();
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:92:5: ( '!=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:92:7: '!='
            {
            match("!="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, NEQ_StartIndex); }
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        int LT_StartIndex = input.index();
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:93:4: ( '<' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:93:6: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, LT_StartIndex); }
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        int LTEQ_StartIndex = input.index();
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:94:6: ( '<=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:94:8: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, LTEQ_StartIndex); }
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        int GT_StartIndex = input.index();
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:95:4: ( '>' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:95:6: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, GT_StartIndex); }
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        int GTEQ_StartIndex = input.index();
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:96:6: ( '>=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:96:8: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, GTEQ_StartIndex); }
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "SHIFTL"
    public final void mSHIFTL() throws RecognitionException {
        int SHIFTL_StartIndex = input.index();
        try {
            int _type = SHIFTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:97:8: ( '<<' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:97:10: '<<'
            {
            match("<<"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, SHIFTL_StartIndex); }
        }
    }
    // $ANTLR end "SHIFTL"

    // $ANTLR start "SHIFTR"
    public final void mSHIFTR() throws RecognitionException {
        int SHIFTR_StartIndex = input.index();
        try {
            int _type = SHIFTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:98:8: ( '>>' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:98:10: '>>'
            {
            match(">>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, SHIFTR_StartIndex); }
        }
    }
    // $ANTLR end "SHIFTR"

    // $ANTLR start "ASSGN"
    public final void mASSGN() throws RecognitionException {
        int ASSGN_StartIndex = input.index();
        try {
            int _type = ASSGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:100:7: ( '=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:100:9: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, ASSGN_StartIndex); }
        }
    }
    // $ANTLR end "ASSGN"

    // $ANTLR start "ASSGNP"
    public final void mASSGNP() throws RecognitionException {
        int ASSGNP_StartIndex = input.index();
        try {
            int _type = ASSGNP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:101:8: ( '+=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:101:10: '+='
            {
            match("+="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, ASSGNP_StartIndex); }
        }
    }
    // $ANTLR end "ASSGNP"

    // $ANTLR start "ASSGNS"
    public final void mASSGNS() throws RecognitionException {
        int ASSGNS_StartIndex = input.index();
        try {
            int _type = ASSGNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:102:8: ( '-=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:102:10: '-='
            {
            match("-="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, ASSGNS_StartIndex); }
        }
    }
    // $ANTLR end "ASSGNS"

    // $ANTLR start "ASSGNT"
    public final void mASSGNT() throws RecognitionException {
        int ASSGNT_StartIndex = input.index();
        try {
            int _type = ASSGNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:103:8: ( '*=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:103:10: '*='
            {
            match("*="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, ASSGNT_StartIndex); }
        }
    }
    // $ANTLR end "ASSGNT"

    // $ANTLR start "ASSGND"
    public final void mASSGND() throws RecognitionException {
        int ASSGND_StartIndex = input.index();
        try {
            int _type = ASSGND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:104:8: ( '/=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:104:10: '/='
            {
            match("/="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, ASSGND_StartIndex); }
        }
    }
    // $ANTLR end "ASSGND"

    // $ANTLR start "ASSGNM"
    public final void mASSGNM() throws RecognitionException {
        int ASSGNM_StartIndex = input.index();
        try {
            int _type = ASSGNM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:105:8: ( '%=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:105:10: '%='
            {
            match("%="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, ASSGNM_StartIndex); }
        }
    }
    // $ANTLR end "ASSGNM"

    // $ANTLR start "ASSGNSHL"
    public final void mASSGNSHL() throws RecognitionException {
        int ASSGNSHL_StartIndex = input.index();
        try {
            int _type = ASSGNSHL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:106:10: ( '<<=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:106:12: '<<='
            {
            match("<<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, ASSGNSHL_StartIndex); }
        }
    }
    // $ANTLR end "ASSGNSHL"

    // $ANTLR start "ASSGNSHR"
    public final void mASSGNSHR() throws RecognitionException {
        int ASSGNSHR_StartIndex = input.index();
        try {
            int _type = ASSGNSHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:107:10: ( '>>=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:107:12: '>>='
            {
            match(">>="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, ASSGNSHR_StartIndex); }
        }
    }
    // $ANTLR end "ASSGNSHR"

    // $ANTLR start "ASSGNBITAND"
    public final void mASSGNBITAND() throws RecognitionException {
        int ASSGNBITAND_StartIndex = input.index();
        try {
            int _type = ASSGNBITAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:108:13: ( '&=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:108:15: '&='
            {
            match("&="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, ASSGNBITAND_StartIndex); }
        }
    }
    // $ANTLR end "ASSGNBITAND"

    // $ANTLR start "ASSGNBITOR"
    public final void mASSGNBITOR() throws RecognitionException {
        int ASSGNBITOR_StartIndex = input.index();
        try {
            int _type = ASSGNBITOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:109:12: ( '|=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:109:14: '|='
            {
            match("|="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, ASSGNBITOR_StartIndex); }
        }
    }
    // $ANTLR end "ASSGNBITOR"

    // $ANTLR start "ASSGNBITXOR"
    public final void mASSGNBITXOR() throws RecognitionException {
        int ASSGNBITXOR_StartIndex = input.index();
        try {
            int _type = ASSGNBITXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:110:13: ( '^=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:110:15: '^='
            {
            match("^="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, ASSGNBITXOR_StartIndex); }
        }
    }
    // $ANTLR end "ASSGNBITXOR"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        int LPAREN_StartIndex = input.index();
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:113:8: ( '(' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:113:10: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, LPAREN_StartIndex); }
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        int RPAREN_StartIndex = input.index();
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:114:8: ( ')' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:114:10: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, RPAREN_StartIndex); }
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        int LBRACE_StartIndex = input.index();
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:115:8: ( '{' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:115:10: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, LBRACE_StartIndex); }
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        int RBRACE_StartIndex = input.index();
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:116:8: ( '}' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:116:10: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, RBRACE_StartIndex); }
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        int LBRACK_StartIndex = input.index();
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:117:8: ( '[' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:117:10: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, LBRACK_StartIndex); }
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        int RBRACK_StartIndex = input.index();
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:118:8: ( ']' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:118:10: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, RBRACK_StartIndex); }
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "NAMESPACE_ACCESS"
    public final void mNAMESPACE_ACCESS() throws RecognitionException {
        int NAMESPACE_ACCESS_StartIndex = input.index();
        try {
            int _type = NAMESPACE_ACCESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:120:18: ( '::' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:120:20: '::'
            {
            match("::"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, NAMESPACE_ACCESS_StartIndex); }
        }
    }
    // $ANTLR end "NAMESPACE_ACCESS"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        int IDENTIFIER_StartIndex = input.index();
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:128:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:128:4: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); if (state.failed) return ;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:128:11: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
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
            if ( state.backtracking>0 ) { memoize(input, 83, IDENTIFIER_StartIndex); }
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        int LETTER_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:133:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, LETTER_StartIndex); }
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "CHARACTER_LITERAL"
    public final void mCHARACTER_LITERAL() throws RecognitionException {
        int CHARACTER_LITERAL_StartIndex = input.index();
        try {
            int _type = CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:139:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:139:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); if (state.failed) return ;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:139:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\\') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:139:16: EscapeSequence
                    {
                    mEscapeSequence(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:139:33: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, CHARACTER_LITERAL_StartIndex); }
        }
    }
    // $ANTLR end "CHARACTER_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        int STRING_LITERAL_StartIndex = input.index();
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:143:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:143:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:143:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:143:14: EscapeSequence
            	    {
            	    mEscapeSequence(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:143:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, STRING_LITERAL_StartIndex); }
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        int INTEGER_StartIndex = input.index();
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:147:2: ( ( DIGIT )+ | HEX_LITERAL )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:147:4: ( DIGIT )+
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:147:4: ( DIGIT )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:0:0: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:148:4: HEX_LITERAL
                    {
                    mHEX_LITERAL(); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, INTEGER_StartIndex); }
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        int HEX_LITERAL_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:152:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:152:15: '0' ( 'x' | 'X' ) ( HexDigit )+
            {
            match('0'); if (state.failed) return ;
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:152:29: ( HexDigit )+
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:0:0: HexDigit
            	    {
            	    mHexDigit(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, HEX_LITERAL_StartIndex); }
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        int HexDigit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:155:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:155:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, HexDigit_StartIndex); }
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "FIXED_LITERAL"
    public final void mFIXED_LITERAL() throws RecognitionException {
        int FIXED_LITERAL_StartIndex = input.index();
        try {
            int _type = FIXED_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:158:2: ( ( DIGIT )+ '.' ( DIGIT )* | '.' ( DIGIT )+ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='.') ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:158:4: ( DIGIT )+ '.' ( DIGIT )*
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:158:4: ( DIGIT )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:0:0: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('.'); if (state.failed) return ;
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:158:15: ( DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:0:0: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:159:4: '.' ( DIGIT )+
                    {
                    match('.'); if (state.failed) return ;
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:159:8: ( DIGIT )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:0:0: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
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
            if ( state.backtracking>0 ) { memoize(input, 90, FIXED_LITERAL_StartIndex); }
        }
    }
    // $ANTLR end "FIXED_LITERAL"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        int DIGIT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:163:7: ( '0' .. '9' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:163:9: '0' .. '9'
            {
            matchRange('0','9'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, DIGIT_StartIndex); }
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        int EscapeSequence_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:167:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\"'||LA11_1=='\''||LA11_1=='\\'||LA11_1=='b'||LA11_1=='f'||LA11_1=='n'||LA11_1=='r'||LA11_1=='t') ) {
                    alt11=1;
                }
                else if ( ((LA11_1>='0' && LA11_1<='7')) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:167:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); if (state.failed) return ;
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:168:9: OctalEscape
                    {
                    mOctalEscape(); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, EscapeSequence_StartIndex); }
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        int OctalEscape_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>='0' && LA12_1<='3')) ) {
                    int LA12_2 = input.LA(3);

                    if ( (synpred28_GalaxyXLexer()) ) {
                        alt12=1;
                    }
                    else if ( (synpred29_GalaxyXLexer()) ) {
                        alt12=2;
                    }
                    else if ( (true) ) {
                        alt12=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA12_1>='4' && LA12_1<='7')) ) {
                    int LA12_3 = input.LA(3);

                    if ( (synpred29_GalaxyXLexer()) ) {
                        alt12=2;
                    }
                    else if ( (true) ) {
                        alt12=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:14: ( '0' .. '3' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:15: '0' .. '3'
                    {
                    matchRange('0','3'); if (state.failed) return ;

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:25: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:36: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:37: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:14: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:15: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:25: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:175:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:175:14: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:175:15: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;

            }
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, OctalEscape_StartIndex); }
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        int WS_StartIndex = input.index();
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:178:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:178:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, WS_StartIndex); }
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        int LINE_COMMENT_StartIndex = input.index();
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:182:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:182:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); if (state.failed) return ;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:182:12: (~ ( '\\n' | '\\r' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:0:0: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:182:26: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:0:0: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;

            }

            match('\n'); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, LINE_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        int MULTI_COMMENT_StartIndex = input.index();
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:186:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:186:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:186:14: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        int LA15_3 = input.LA(3);

                        if ( (synpred38_GalaxyXLexer()) ) {
                            alt15=1;
                        }
                        else if ( (true) ) {
                            alt15=2;
                        }


                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:186:42: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); if (state.failed) return ;

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, MULTI_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "MULTI_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:8: ( IF | ELSE | ELIF | WHILE | FOR | END | DO | BREAK | CONTINUE | RETURN | FALSE | TRUE | NULL | STRUCT | FUNC | CONSTRUCTOR | DESTRUCTOR | TYPEDEF | NAMESPACE | CLASS | INTERFACE | IMPLEMENTS | EXTENDS | NEW | DELETE | THIS | SUPER | NAMEOF | INITIALIZER | INLINE | STATIC | CONST | PRIVATE | PUBLIC | NATIVE | DEFINE | UNDEF | INCLUDE | PREFIX | SEMI | COMMA | DOT | COLON | RETURNS | PLUS | SUB | DIV | TIMES | MODULO | AND | OR | XOR | BIT_NOT | NOT | LOR | LAND | EQ | NEQ | LT | LTEQ | GT | GTEQ | SHIFTL | SHIFTR | ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR | LPAREN | RPAREN | LBRACE | RBRACE | LBRACK | RBRACK | NAMESPACE_ACCESS | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | INTEGER | FIXED_LITERAL | WS | LINE_COMMENT | MULTI_COMMENT )
        int alt16=90;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:10: IF
                {
                mIF(); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:13: ELSE
                {
                mELSE(); if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:18: ELIF
                {
                mELIF(); if (state.failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:23: WHILE
                {
                mWHILE(); if (state.failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:29: FOR
                {
                mFOR(); if (state.failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:33: END
                {
                mEND(); if (state.failed) return ;

                }
                break;
            case 7 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:37: DO
                {
                mDO(); if (state.failed) return ;

                }
                break;
            case 8 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:40: BREAK
                {
                mBREAK(); if (state.failed) return ;

                }
                break;
            case 9 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:46: CONTINUE
                {
                mCONTINUE(); if (state.failed) return ;

                }
                break;
            case 10 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:55: RETURN
                {
                mRETURN(); if (state.failed) return ;

                }
                break;
            case 11 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:62: FALSE
                {
                mFALSE(); if (state.failed) return ;

                }
                break;
            case 12 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:68: TRUE
                {
                mTRUE(); if (state.failed) return ;

                }
                break;
            case 13 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:73: NULL
                {
                mNULL(); if (state.failed) return ;

                }
                break;
            case 14 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:78: STRUCT
                {
                mSTRUCT(); if (state.failed) return ;

                }
                break;
            case 15 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:85: FUNC
                {
                mFUNC(); if (state.failed) return ;

                }
                break;
            case 16 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:90: CONSTRUCTOR
                {
                mCONSTRUCTOR(); if (state.failed) return ;

                }
                break;
            case 17 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:102: DESTRUCTOR
                {
                mDESTRUCTOR(); if (state.failed) return ;

                }
                break;
            case 18 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:113: TYPEDEF
                {
                mTYPEDEF(); if (state.failed) return ;

                }
                break;
            case 19 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:121: NAMESPACE
                {
                mNAMESPACE(); if (state.failed) return ;

                }
                break;
            case 20 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:131: CLASS
                {
                mCLASS(); if (state.failed) return ;

                }
                break;
            case 21 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:137: INTERFACE
                {
                mINTERFACE(); if (state.failed) return ;

                }
                break;
            case 22 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:147: IMPLEMENTS
                {
                mIMPLEMENTS(); if (state.failed) return ;

                }
                break;
            case 23 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:158: EXTENDS
                {
                mEXTENDS(); if (state.failed) return ;

                }
                break;
            case 24 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:166: NEW
                {
                mNEW(); if (state.failed) return ;

                }
                break;
            case 25 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:170: DELETE
                {
                mDELETE(); if (state.failed) return ;

                }
                break;
            case 26 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:177: THIS
                {
                mTHIS(); if (state.failed) return ;

                }
                break;
            case 27 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:182: SUPER
                {
                mSUPER(); if (state.failed) return ;

                }
                break;
            case 28 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:188: NAMEOF
                {
                mNAMEOF(); if (state.failed) return ;

                }
                break;
            case 29 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:195: INITIALIZER
                {
                mINITIALIZER(); if (state.failed) return ;

                }
                break;
            case 30 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:207: INLINE
                {
                mINLINE(); if (state.failed) return ;

                }
                break;
            case 31 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:214: STATIC
                {
                mSTATIC(); if (state.failed) return ;

                }
                break;
            case 32 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:221: CONST
                {
                mCONST(); if (state.failed) return ;

                }
                break;
            case 33 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:227: PRIVATE
                {
                mPRIVATE(); if (state.failed) return ;

                }
                break;
            case 34 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:235: PUBLIC
                {
                mPUBLIC(); if (state.failed) return ;

                }
                break;
            case 35 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:242: NATIVE
                {
                mNATIVE(); if (state.failed) return ;

                }
                break;
            case 36 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:249: DEFINE
                {
                mDEFINE(); if (state.failed) return ;

                }
                break;
            case 37 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:256: UNDEF
                {
                mUNDEF(); if (state.failed) return ;

                }
                break;
            case 38 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:262: INCLUDE
                {
                mINCLUDE(); if (state.failed) return ;

                }
                break;
            case 39 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:270: PREFIX
                {
                mPREFIX(); if (state.failed) return ;

                }
                break;
            case 40 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:277: SEMI
                {
                mSEMI(); if (state.failed) return ;

                }
                break;
            case 41 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:282: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 42 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:288: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 43 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:292: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 44 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:298: RETURNS
                {
                mRETURNS(); if (state.failed) return ;

                }
                break;
            case 45 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:306: PLUS
                {
                mPLUS(); if (state.failed) return ;

                }
                break;
            case 46 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:311: SUB
                {
                mSUB(); if (state.failed) return ;

                }
                break;
            case 47 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:315: DIV
                {
                mDIV(); if (state.failed) return ;

                }
                break;
            case 48 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:319: TIMES
                {
                mTIMES(); if (state.failed) return ;

                }
                break;
            case 49 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:325: MODULO
                {
                mMODULO(); if (state.failed) return ;

                }
                break;
            case 50 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:332: AND
                {
                mAND(); if (state.failed) return ;

                }
                break;
            case 51 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:336: OR
                {
                mOR(); if (state.failed) return ;

                }
                break;
            case 52 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:339: XOR
                {
                mXOR(); if (state.failed) return ;

                }
                break;
            case 53 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:343: BIT_NOT
                {
                mBIT_NOT(); if (state.failed) return ;

                }
                break;
            case 54 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:351: NOT
                {
                mNOT(); if (state.failed) return ;

                }
                break;
            case 55 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:355: LOR
                {
                mLOR(); if (state.failed) return ;

                }
                break;
            case 56 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:359: LAND
                {
                mLAND(); if (state.failed) return ;

                }
                break;
            case 57 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:364: EQ
                {
                mEQ(); if (state.failed) return ;

                }
                break;
            case 58 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:367: NEQ
                {
                mNEQ(); if (state.failed) return ;

                }
                break;
            case 59 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:371: LT
                {
                mLT(); if (state.failed) return ;

                }
                break;
            case 60 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:374: LTEQ
                {
                mLTEQ(); if (state.failed) return ;

                }
                break;
            case 61 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:379: GT
                {
                mGT(); if (state.failed) return ;

                }
                break;
            case 62 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:382: GTEQ
                {
                mGTEQ(); if (state.failed) return ;

                }
                break;
            case 63 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:387: SHIFTL
                {
                mSHIFTL(); if (state.failed) return ;

                }
                break;
            case 64 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:394: SHIFTR
                {
                mSHIFTR(); if (state.failed) return ;

                }
                break;
            case 65 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:401: ASSGN
                {
                mASSGN(); if (state.failed) return ;

                }
                break;
            case 66 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:407: ASSGNP
                {
                mASSGNP(); if (state.failed) return ;

                }
                break;
            case 67 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:414: ASSGNS
                {
                mASSGNS(); if (state.failed) return ;

                }
                break;
            case 68 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:421: ASSGNT
                {
                mASSGNT(); if (state.failed) return ;

                }
                break;
            case 69 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:428: ASSGND
                {
                mASSGND(); if (state.failed) return ;

                }
                break;
            case 70 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:435: ASSGNM
                {
                mASSGNM(); if (state.failed) return ;

                }
                break;
            case 71 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:442: ASSGNSHL
                {
                mASSGNSHL(); if (state.failed) return ;

                }
                break;
            case 72 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:451: ASSGNSHR
                {
                mASSGNSHR(); if (state.failed) return ;

                }
                break;
            case 73 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:460: ASSGNBITAND
                {
                mASSGNBITAND(); if (state.failed) return ;

                }
                break;
            case 74 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:472: ASSGNBITOR
                {
                mASSGNBITOR(); if (state.failed) return ;

                }
                break;
            case 75 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:483: ASSGNBITXOR
                {
                mASSGNBITXOR(); if (state.failed) return ;

                }
                break;
            case 76 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:495: LPAREN
                {
                mLPAREN(); if (state.failed) return ;

                }
                break;
            case 77 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:502: RPAREN
                {
                mRPAREN(); if (state.failed) return ;

                }
                break;
            case 78 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:509: LBRACE
                {
                mLBRACE(); if (state.failed) return ;

                }
                break;
            case 79 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:516: RBRACE
                {
                mRBRACE(); if (state.failed) return ;

                }
                break;
            case 80 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:523: LBRACK
                {
                mLBRACK(); if (state.failed) return ;

                }
                break;
            case 81 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:530: RBRACK
                {
                mRBRACK(); if (state.failed) return ;

                }
                break;
            case 82 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:537: NAMESPACE_ACCESS
                {
                mNAMESPACE_ACCESS(); if (state.failed) return ;

                }
                break;
            case 83 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:554: IDENTIFIER
                {
                mIDENTIFIER(); if (state.failed) return ;

                }
                break;
            case 84 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:565: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); if (state.failed) return ;

                }
                break;
            case 85 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:583: STRING_LITERAL
                {
                mSTRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 86 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:598: INTEGER
                {
                mINTEGER(); if (state.failed) return ;

                }
                break;
            case 87 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:606: FIXED_LITERAL
                {
                mFIXED_LITERAL(); if (state.failed) return ;

                }
                break;
            case 88 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:620: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 89 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:623: LINE_COMMENT
                {
                mLINE_COMMENT(); if (state.failed) return ;

                }
                break;
            case 90 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:636: MULTI_COMMENT
                {
                mMULTI_COMMENT(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred28_GalaxyXLexer
    public final void synpred28_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:9: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
        {
        match('\\'); if (state.failed) return ;
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:14: ( '0' .. '3' )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:15: '0' .. '3'
        {
        matchRange('0','3'); if (state.failed) return ;

        }

        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:25: ( '0' .. '7' )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:26: '0' .. '7'
        {
        matchRange('0','7'); if (state.failed) return ;

        }

        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:36: ( '0' .. '7' )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:173:37: '0' .. '7'
        {
        matchRange('0','7'); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_GalaxyXLexer

    // $ANTLR start synpred29_GalaxyXLexer
    public final void synpred29_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:9: ( '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
        {
        match('\\'); if (state.failed) return ;
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:14: ( '0' .. '7' )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:15: '0' .. '7'
        {
        matchRange('0','7'); if (state.failed) return ;

        }

        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:25: ( '0' .. '7' )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:174:26: '0' .. '7'
        {
        matchRange('0','7'); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_GalaxyXLexer

    // $ANTLR start synpred38_GalaxyXLexer
    public final void synpred38_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:186:42: ( . )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:186:42: .
        {
        matchAny(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_GalaxyXLexer

    // $ANTLR start synpred39_GalaxyXLexer
    public final void synpred39_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:10: ( IF )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:10: IF
        {
        mIF(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_GalaxyXLexer

    // $ANTLR start synpred40_GalaxyXLexer
    public final void synpred40_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:13: ( ELSE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:13: ELSE
        {
        mELSE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_GalaxyXLexer

    // $ANTLR start synpred41_GalaxyXLexer
    public final void synpred41_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:18: ( ELIF )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:18: ELIF
        {
        mELIF(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_GalaxyXLexer

    // $ANTLR start synpred42_GalaxyXLexer
    public final void synpred42_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:23: ( WHILE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:23: WHILE
        {
        mWHILE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_GalaxyXLexer

    // $ANTLR start synpred43_GalaxyXLexer
    public final void synpred43_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:29: ( FOR )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:29: FOR
        {
        mFOR(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_GalaxyXLexer

    // $ANTLR start synpred44_GalaxyXLexer
    public final void synpred44_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:33: ( END )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:33: END
        {
        mEND(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_GalaxyXLexer

    // $ANTLR start synpred45_GalaxyXLexer
    public final void synpred45_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:37: ( DO )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:37: DO
        {
        mDO(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_GalaxyXLexer

    // $ANTLR start synpred46_GalaxyXLexer
    public final void synpred46_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:40: ( BREAK )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:40: BREAK
        {
        mBREAK(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_GalaxyXLexer

    // $ANTLR start synpred47_GalaxyXLexer
    public final void synpred47_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:46: ( CONTINUE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:46: CONTINUE
        {
        mCONTINUE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_GalaxyXLexer

    // $ANTLR start synpred48_GalaxyXLexer
    public final void synpred48_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:55: ( RETURN )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:55: RETURN
        {
        mRETURN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_GalaxyXLexer

    // $ANTLR start synpred49_GalaxyXLexer
    public final void synpred49_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:62: ( FALSE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:62: FALSE
        {
        mFALSE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_GalaxyXLexer

    // $ANTLR start synpred50_GalaxyXLexer
    public final void synpred50_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:68: ( TRUE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:68: TRUE
        {
        mTRUE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_GalaxyXLexer

    // $ANTLR start synpred51_GalaxyXLexer
    public final void synpred51_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:73: ( NULL )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:73: NULL
        {
        mNULL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_GalaxyXLexer

    // $ANTLR start synpred52_GalaxyXLexer
    public final void synpred52_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:78: ( STRUCT )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:78: STRUCT
        {
        mSTRUCT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_GalaxyXLexer

    // $ANTLR start synpred53_GalaxyXLexer
    public final void synpred53_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:85: ( FUNC )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:85: FUNC
        {
        mFUNC(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_GalaxyXLexer

    // $ANTLR start synpred54_GalaxyXLexer
    public final void synpred54_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:90: ( CONSTRUCTOR )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:90: CONSTRUCTOR
        {
        mCONSTRUCTOR(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_GalaxyXLexer

    // $ANTLR start synpred55_GalaxyXLexer
    public final void synpred55_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:102: ( DESTRUCTOR )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:102: DESTRUCTOR
        {
        mDESTRUCTOR(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_GalaxyXLexer

    // $ANTLR start synpred56_GalaxyXLexer
    public final void synpred56_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:113: ( TYPEDEF )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:113: TYPEDEF
        {
        mTYPEDEF(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_GalaxyXLexer

    // $ANTLR start synpred57_GalaxyXLexer
    public final void synpred57_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:121: ( NAMESPACE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:121: NAMESPACE
        {
        mNAMESPACE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_GalaxyXLexer

    // $ANTLR start synpred58_GalaxyXLexer
    public final void synpred58_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:131: ( CLASS )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:131: CLASS
        {
        mCLASS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_GalaxyXLexer

    // $ANTLR start synpred59_GalaxyXLexer
    public final void synpred59_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:137: ( INTERFACE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:137: INTERFACE
        {
        mINTERFACE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_GalaxyXLexer

    // $ANTLR start synpred60_GalaxyXLexer
    public final void synpred60_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:147: ( IMPLEMENTS )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:147: IMPLEMENTS
        {
        mIMPLEMENTS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_GalaxyXLexer

    // $ANTLR start synpred61_GalaxyXLexer
    public final void synpred61_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:158: ( EXTENDS )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:158: EXTENDS
        {
        mEXTENDS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_GalaxyXLexer

    // $ANTLR start synpred62_GalaxyXLexer
    public final void synpred62_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:166: ( NEW )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:166: NEW
        {
        mNEW(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_GalaxyXLexer

    // $ANTLR start synpred63_GalaxyXLexer
    public final void synpred63_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:170: ( DELETE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:170: DELETE
        {
        mDELETE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_GalaxyXLexer

    // $ANTLR start synpred64_GalaxyXLexer
    public final void synpred64_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:177: ( THIS )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:177: THIS
        {
        mTHIS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_GalaxyXLexer

    // $ANTLR start synpred65_GalaxyXLexer
    public final void synpred65_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:182: ( SUPER )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:182: SUPER
        {
        mSUPER(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_GalaxyXLexer

    // $ANTLR start synpred66_GalaxyXLexer
    public final void synpred66_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:188: ( NAMEOF )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:188: NAMEOF
        {
        mNAMEOF(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_GalaxyXLexer

    // $ANTLR start synpred67_GalaxyXLexer
    public final void synpred67_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:195: ( INITIALIZER )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:195: INITIALIZER
        {
        mINITIALIZER(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_GalaxyXLexer

    // $ANTLR start synpred68_GalaxyXLexer
    public final void synpred68_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:207: ( INLINE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:207: INLINE
        {
        mINLINE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_GalaxyXLexer

    // $ANTLR start synpred69_GalaxyXLexer
    public final void synpred69_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:214: ( STATIC )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:214: STATIC
        {
        mSTATIC(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_GalaxyXLexer

    // $ANTLR start synpred70_GalaxyXLexer
    public final void synpred70_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:221: ( CONST )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:221: CONST
        {
        mCONST(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_GalaxyXLexer

    // $ANTLR start synpred71_GalaxyXLexer
    public final void synpred71_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:227: ( PRIVATE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:227: PRIVATE
        {
        mPRIVATE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_GalaxyXLexer

    // $ANTLR start synpred72_GalaxyXLexer
    public final void synpred72_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:235: ( PUBLIC )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:235: PUBLIC
        {
        mPUBLIC(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_GalaxyXLexer

    // $ANTLR start synpred73_GalaxyXLexer
    public final void synpred73_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:242: ( NATIVE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:242: NATIVE
        {
        mNATIVE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_GalaxyXLexer

    // $ANTLR start synpred74_GalaxyXLexer
    public final void synpred74_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:249: ( DEFINE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:249: DEFINE
        {
        mDEFINE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_GalaxyXLexer

    // $ANTLR start synpred75_GalaxyXLexer
    public final void synpred75_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:256: ( UNDEF )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:256: UNDEF
        {
        mUNDEF(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_GalaxyXLexer

    // $ANTLR start synpred76_GalaxyXLexer
    public final void synpred76_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:262: ( INCLUDE )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:262: INCLUDE
        {
        mINCLUDE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_GalaxyXLexer

    // $ANTLR start synpred101_GalaxyXLexer
    public final void synpred101_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:387: ( SHIFTL )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:387: SHIFTL
        {
        mSHIFTL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_GalaxyXLexer

    // $ANTLR start synpred102_GalaxyXLexer
    public final void synpred102_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:394: ( SHIFTR )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:394: SHIFTR
        {
        mSHIFTR(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_GalaxyXLexer

    // $ANTLR start synpred109_GalaxyXLexer
    public final void synpred109_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:442: ( ASSGNSHL )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:442: ASSGNSHL
        {
        mASSGNSHL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_GalaxyXLexer

    // $ANTLR start synpred110_GalaxyXLexer
    public final void synpred110_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:451: ( ASSGNSHR )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:451: ASSGNSHR
        {
        mASSGNSHR(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_GalaxyXLexer

    // $ANTLR start synpred121_GalaxyXLexer
    public final void synpred121_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:554: ( IDENTIFIER )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:554: IDENTIFIER
        {
        mIDENTIFIER(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_GalaxyXLexer

    // $ANTLR start synpred124_GalaxyXLexer
    public final void synpred124_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:598: ( INTEGER )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:598: INTEGER
        {
        mINTEGER(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_GalaxyXLexer

    // $ANTLR start synpred125_GalaxyXLexer
    public final void synpred125_GalaxyXLexer_fragment() throws RecognitionException {   
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:606: ( FIXED_LITERAL )
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\lexer\\GalaxyXLexer.g:1:606: FIXED_LITERAL
        {
        mFIXED_LITERAL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_GalaxyXLexer

    public final boolean synpred75_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_GalaxyXLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_GalaxyXLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\15\46\3\uffff\1\141\1\144\1\147\1\151\1\155\1\157\1\161"+
        "\1\164\1\167\1\171\1\uffff\1\173\1\175\1\u0080\1\u0083\11\uffff"+
        "\2\u0084\u008a\uffff";
    static final String DFA16_eofS =
        "\u00b5\uffff";
    static final String DFA16_minS =
        "\1\11\1\146\1\154\1\150\1\141\1\145\1\162\1\154\1\145\1\150\1\141"+
        "\1\164\1\162\1\156\3\uffff\1\60\1\72\2\75\1\52\2\75\1\46\2\75\1"+
        "\uffff\2\75\1\74\1\75\11\uffff\2\56\1\uffff\3\0\2\uffff\3\0\2\uffff"+
        "\1\0\2\uffff\3\0\2\uffff\2\0\2\uffff\1\0\2\uffff\2\0\2\uffff\1\0"+
        "\2\uffff\3\0\2\uffff\3\0\2\uffff\2\0\2\uffff\2\0\2\uffff\1\0\40"+
        "\uffff\1\0\2\uffff\1\0\3\uffff\1\0\2\uffff\1\0\53\uffff";
    static final String DFA16_maxS =
        "\1\176\1\156\1\170\1\150\1\165\1\157\1\162\1\157\1\145\1\171\3"+
        "\165\1\156\3\uffff\1\71\1\72\1\76\5\75\1\174\1\75\1\uffff\3\75\1"+
        "\76\11\uffff\2\71\1\uffff\3\0\2\uffff\3\0\2\uffff\1\0\2\uffff\3"+
        "\0\2\uffff\2\0\2\uffff\1\0\2\uffff\2\0\2\uffff\1\0\2\uffff\3\0\2"+
        "\uffff\3\0\2\uffff\2\0\2\uffff\2\0\2\uffff\1\0\40\uffff\1\0\2\uffff"+
        "\1\0\3\uffff\1\0\2\uffff\1\0\53\uffff";
    static final String DFA16_acceptS =
        "\16\uffff\1\47\1\50\1\51\12\uffff\1\65\4\uffff\1\114\1\115\1\116"+
        "\1\117\1\120\1\121\1\123\1\124\1\125\2\uffff\1\130\65\uffff\1\52"+
        "\1\127\1\122\1\53\1\54\1\103\1\56\1\102\1\55\1\105\1\131\1\132\1"+
        "\57\1\104\1\60\1\106\1\61\1\70\1\111\1\62\1\67\1\112\1\63\1\113"+
        "\1\64\1\72\1\66\1\71\1\101\1\74\1\uffff\1\73\1\76\1\uffff\1\75\1"+
        "\126\6\uffff\1\1\1\25\1\35\1\36\1\46\1\26\1\2\1\3\1\6\1\27\1\4\1"+
        "\5\1\13\1\17\1\7\1\21\1\31\1\44\1\10\1\11\1\20\1\40\1\24\1\12\1"+
        "\14\1\22\1\32\1\15\1\23\1\34\1\43\1\30\1\16\1\37\1\33\1\41\1\42"+
        "\1\45\1\77\1\107\1\100\1\110";
    static final String DFA16_specialS =
        "\54\uffff\1\0\1\1\1\2\2\uffff\1\3\1\4\1\5\2\uffff\1\6\2\uffff\1"+
        "\7\1\10\1\11\2\uffff\1\12\1\13\2\uffff\1\14\2\uffff\1\15\1\16\2"+
        "\uffff\1\17\2\uffff\1\20\1\21\1\22\2\uffff\1\23\1\24\1\25\2\uffff"+
        "\1\26\1\27\2\uffff\1\30\1\31\2\uffff\1\32\40\uffff\1\33\2\uffff"+
        "\1\34\3\uffff\1\35\2\uffff\1\36\53\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\53\1\uffff\2\53\22\uffff\1\53\1\34\1\50\1\16\1\uffff\1\27"+
            "\1\30\1\47\1\40\1\41\1\26\1\24\1\20\1\23\1\21\1\25\1\51\11\52"+
            "\1\22\1\17\1\36\1\35\1\37\2\uffff\32\46\1\44\1\uffff\1\45\1"+
            "\32\1\46\1\uffff\1\46\1\6\1\7\1\5\1\2\1\4\2\46\1\1\4\46\1\12"+
            "\1\46\1\14\1\46\1\10\1\13\1\11\1\15\1\46\1\3\3\46\1\42\1\31"+
            "\1\43\1\33",
            "\1\54\6\uffff\1\56\1\55",
            "\1\61\1\uffff\1\62\11\uffff\1\63",
            "\1\66",
            "\1\72\15\uffff\1\71\5\uffff\1\73",
            "\1\77\11\uffff\1\76",
            "\1\102",
            "\1\106\2\uffff\1\105",
            "\1\111",
            "\1\116\11\uffff\1\114\6\uffff\1\115",
            "\1\122\3\uffff\1\123\17\uffff\1\121",
            "\1\126\1\127",
            "\1\132\2\uffff\1\133",
            "\1\136",
            "",
            "",
            "",
            "\12\142",
            "\1\143",
            "\1\146\1\145",
            "\1\150",
            "\1\154\4\uffff\1\153\15\uffff\1\152",
            "\1\156",
            "\1\160",
            "\1\162\26\uffff\1\163",
            "\1\166\76\uffff\1\165",
            "\1\170",
            "",
            "\1\172",
            "\1\174",
            "\1\177\1\176",
            "\1\u0081\1\u0082",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\142\1\uffff\12\u0086",
            "\1\142\1\uffff\12\u0089",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
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
            return "1:1: Tokens : ( IF | ELSE | ELIF | WHILE | FOR | END | DO | BREAK | CONTINUE | RETURN | FALSE | TRUE | NULL | STRUCT | FUNC | CONSTRUCTOR | DESTRUCTOR | TYPEDEF | NAMESPACE | CLASS | INTERFACE | IMPLEMENTS | EXTENDS | NEW | DELETE | THIS | SUPER | NAMEOF | INITIALIZER | INLINE | STATIC | CONST | PRIVATE | PUBLIC | NATIVE | DEFINE | UNDEF | INCLUDE | PREFIX | SEMI | COMMA | DOT | COLON | RETURNS | PLUS | SUB | DIV | TIMES | MODULO | AND | OR | XOR | BIT_NOT | NOT | LOR | LAND | EQ | NEQ | LT | LTEQ | GT | GTEQ | SHIFTL | SHIFTR | ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR | LPAREN | RPAREN | LBRACE | RBRACE | LBRACK | RBRACK | NAMESPACE_ACCESS | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | INTEGER | FIXED_LITERAL | WS | LINE_COMMENT | MULTI_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_44 = input.LA(1);

                         
                        int index16_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_GalaxyXLexer()) ) {s = 139;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_44);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_45 = input.LA(1);

                         
                        int index16_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_GalaxyXLexer()) ) {s = 140;}

                        else if ( (synpred67_GalaxyXLexer()) ) {s = 141;}

                        else if ( (synpred68_GalaxyXLexer()) ) {s = 142;}

                        else if ( (synpred76_GalaxyXLexer()) ) {s = 143;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_45);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_46 = input.LA(1);

                         
                        int index16_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_GalaxyXLexer()) ) {s = 144;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_46);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_49 = input.LA(1);

                         
                        int index16_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_GalaxyXLexer()) ) {s = 145;}

                        else if ( (synpred41_GalaxyXLexer()) ) {s = 146;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_49);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_50 = input.LA(1);

                         
                        int index16_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_GalaxyXLexer()) ) {s = 147;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_50);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_51 = input.LA(1);

                         
                        int index16_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_GalaxyXLexer()) ) {s = 148;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_51);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_54 = input.LA(1);

                         
                        int index16_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_GalaxyXLexer()) ) {s = 149;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_54);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_57 = input.LA(1);

                         
                        int index16_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_GalaxyXLexer()) ) {s = 150;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_57);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_58 = input.LA(1);

                         
                        int index16_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_GalaxyXLexer()) ) {s = 151;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_58);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_59 = input.LA(1);

                         
                        int index16_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_GalaxyXLexer()) ) {s = 152;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_59);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_62 = input.LA(1);

                         
                        int index16_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_GalaxyXLexer()) ) {s = 153;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_62);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_63 = input.LA(1);

                         
                        int index16_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_GalaxyXLexer()) ) {s = 154;}

                        else if ( (synpred63_GalaxyXLexer()) ) {s = 155;}

                        else if ( (synpred74_GalaxyXLexer()) ) {s = 156;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_63);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_66 = input.LA(1);

                         
                        int index16_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_GalaxyXLexer()) ) {s = 157;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_66);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_69 = input.LA(1);

                         
                        int index16_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_GalaxyXLexer()) ) {s = 158;}

                        else if ( (synpred54_GalaxyXLexer()) ) {s = 159;}

                        else if ( (synpred70_GalaxyXLexer()) ) {s = 160;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_69);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA16_70 = input.LA(1);

                         
                        int index16_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_GalaxyXLexer()) ) {s = 161;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_70);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA16_73 = input.LA(1);

                         
                        int index16_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_GalaxyXLexer()) ) {s = 162;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_73);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA16_76 = input.LA(1);

                         
                        int index16_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_GalaxyXLexer()) ) {s = 163;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_76);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA16_77 = input.LA(1);

                         
                        int index16_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_GalaxyXLexer()) ) {s = 164;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_77);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA16_78 = input.LA(1);

                         
                        int index16_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_GalaxyXLexer()) ) {s = 165;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_78);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA16_81 = input.LA(1);

                         
                        int index16_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_GalaxyXLexer()) ) {s = 166;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_81);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA16_82 = input.LA(1);

                         
                        int index16_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_GalaxyXLexer()) ) {s = 167;}

                        else if ( (synpred66_GalaxyXLexer()) ) {s = 168;}

                        else if ( (synpred73_GalaxyXLexer()) ) {s = 169;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_82);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA16_83 = input.LA(1);

                         
                        int index16_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_GalaxyXLexer()) ) {s = 170;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_83);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA16_86 = input.LA(1);

                         
                        int index16_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_GalaxyXLexer()) ) {s = 171;}

                        else if ( (synpred69_GalaxyXLexer()) ) {s = 172;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_86);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA16_87 = input.LA(1);

                         
                        int index16_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_GalaxyXLexer()) ) {s = 173;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_87);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA16_90 = input.LA(1);

                         
                        int index16_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_GalaxyXLexer()) ) {s = 174;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_90);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA16_91 = input.LA(1);

                         
                        int index16_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_GalaxyXLexer()) ) {s = 175;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_91);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA16_94 = input.LA(1);

                         
                        int index16_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_GalaxyXLexer()) ) {s = 176;}

                        else if ( (synpred121_GalaxyXLexer()) ) {s = 38;}

                         
                        input.seek(index16_94);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA16_127 = input.LA(1);

                         
                        int index16_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_GalaxyXLexer()) ) {s = 177;}

                        else if ( (synpred109_GalaxyXLexer()) ) {s = 178;}

                         
                        input.seek(index16_127);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA16_130 = input.LA(1);

                         
                        int index16_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_GalaxyXLexer()) ) {s = 179;}

                        else if ( (synpred110_GalaxyXLexer()) ) {s = 180;}

                         
                        input.seek(index16_130);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA16_134 = input.LA(1);

                         
                        int index16_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_GalaxyXLexer()) ) {s = 132;}

                        else if ( (synpred125_GalaxyXLexer()) ) {s = 98;}

                         
                        input.seek(index16_134);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA16_137 = input.LA(1);

                         
                        int index16_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_GalaxyXLexer()) ) {s = 132;}

                        else if ( (synpred125_GalaxyXLexer()) ) {s = 98;}

                         
                        input.seek(index16_137);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}