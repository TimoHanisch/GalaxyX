// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g 2013-02-28 11:50:15

  	package de.timoh.galaxyxparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXLexer extends Lexer {
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

    public GalaxyXLexer() {;} 
    public GalaxyXLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GalaxyXLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g"; }

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:326:9: ( 'bool' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:326:11: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "BYTE"
    public final void mBYTE() throws RecognitionException {
        try {
            int _type = BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:327:6: ( 'byte' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:327:8: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BYTE"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:328:6: ( 'char' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:328:8: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "FIXED"
    public final void mFIXED() throws RecognitionException {
        try {
            int _type = FIXED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:329:7: ( 'fixed' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:329:9: 'fixed'
            {
            match("fixed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIXED"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:330:5: ( 'int' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:330:7: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:331:6: ( 'void' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:331:8: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "GAMELINK"
    public final void mGAMELINK() throws RecognitionException {
        try {
            int _type = GAMELINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:332:10: ( 'gamelink' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:332:12: 'gamelink'
            {
            match("gamelink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GAMELINK"

    // $ANTLR start "COLOR"
    public final void mCOLOR() throws RecognitionException {
        try {
            int _type = COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:333:7: ( 'color' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:333:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLOR"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:334:7: ( 'point' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:334:9: 'point'
            {
            match("point"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:335:8: ( 'string' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:335:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ABILCMD"
    public final void mABILCMD() throws RecognitionException {
        try {
            int _type = ABILCMD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:338:9: ( 'abilcmd' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:338:11: 'abilcmd'
            {
            match("abilcmd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABILCMD"

    // $ANTLR start "ACTOR"
    public final void mACTOR() throws RecognitionException {
        try {
            int _type = ACTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:339:7: ( 'actor' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:339:9: 'actor'
            {
            match("actor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTOR"

    // $ANTLR start "ACTORSCOPE"
    public final void mACTORSCOPE() throws RecognitionException {
        try {
            int _type = ACTORSCOPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:340:12: ( 'actorscope' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:340:14: 'actorscope'
            {
            match("actorscope"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTORSCOPE"

    // $ANTLR start "AIFILTER"
    public final void mAIFILTER() throws RecognitionException {
        try {
            int _type = AIFILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:341:10: ( 'aifilter' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:341:12: 'aifilter'
            {
            match("aifilter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AIFILTER"

    // $ANTLR start "BANK"
    public final void mBANK() throws RecognitionException {
        try {
            int _type = BANK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:342:6: ( 'bank' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:342:8: 'bank'
            {
            match("bank"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANK"

    // $ANTLR start "CAMERAINFO"
    public final void mCAMERAINFO() throws RecognitionException {
        try {
            int _type = CAMERAINFO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:343:12: ( 'camerainfo' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:343:14: 'camerainfo'
            {
            match("camerainfo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAMERAINFO"

    // $ANTLR start "MARKER"
    public final void mMARKER() throws RecognitionException {
        try {
            int _type = MARKER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:344:8: ( 'marker' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:344:10: 'marker'
            {
            match("marker"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MARKER"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:345:7: ( 'order' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:345:9: 'order'
            {
            match("order"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "PLAYERGROUP"
    public final void mPLAYERGROUP() throws RecognitionException {
        try {
            int _type = PLAYERGROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:346:13: ( 'playergroup' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:346:15: 'playergroup'
            {
            match("playergroup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLAYERGROUP"

    // $ANTLR start "REGION"
    public final void mREGION() throws RecognitionException {
        try {
            int _type = REGION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:347:8: ( 'region' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:347:10: 'region'
            {
            match("region"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGION"

    // $ANTLR start "REVEALER"
    public final void mREVEALER() throws RecognitionException {
        try {
            int _type = REVEALER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:348:10: ( 'revealer' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:348:12: 'revealer'
            {
            match("revealer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REVEALER"

    // $ANTLR start "SOUNDLINK"
    public final void mSOUNDLINK() throws RecognitionException {
        try {
            int _type = SOUNDLINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:349:11: ( 'soundlink' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:349:13: 'soundlink'
            {
            match("soundlink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOUNDLINK"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:350:6: ( 'text' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:350:8: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "TIMER"
    public final void mTIMER() throws RecognitionException {
        try {
            int _type = TIMER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:351:7: ( 'timer' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:351:9: 'timer'
            {
            match("timer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMER"

    // $ANTLR start "TRIGGER"
    public final void mTRIGGER() throws RecognitionException {
        try {
            int _type = TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:352:9: ( 'trigger' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:352:11: 'trigger'
            {
            match("trigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRIGGER"

    // $ANTLR start "TRANSMISSIONSOURCE"
    public final void mTRANSMISSIONSOURCE() throws RecognitionException {
        try {
            int _type = TRANSMISSIONSOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:353:20: ( 'transmissionsource' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:353:22: 'transmissionsource'
            {
            match("transmissionsource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRANSMISSIONSOURCE"

    // $ANTLR start "UNITFILTER"
    public final void mUNITFILTER() throws RecognitionException {
        try {
            int _type = UNITFILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:354:12: ( 'unitfilter' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:354:14: 'unitfilter'
            {
            match("unitfilter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNITFILTER"

    // $ANTLR start "UNITGROUP"
    public final void mUNITGROUP() throws RecognitionException {
        try {
            int _type = UNITGROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:355:11: ( 'unitgroup' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:355:13: 'unitgroup'
            {
            match("unitgroup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNITGROUP"

    // $ANTLR start "UNITREF"
    public final void mUNITREF() throws RecognitionException {
        try {
            int _type = UNITREF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:356:8: ( 'unitref' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:356:10: 'unitref'
            {
            match("unitref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNITREF"

    // $ANTLR start "UNIT"
    public final void mUNIT() throws RecognitionException {
        try {
            int _type = UNIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:357:6: ( 'unit' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:357:8: 'unit'
            {
            match("unit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIT"

    // $ANTLR start "WAVEINFO"
    public final void mWAVEINFO() throws RecognitionException {
        try {
            int _type = WAVEINFO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:358:10: ( 'waveinfo' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:358:12: 'waveinfo'
            {
            match("waveinfo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WAVEINFO"

    // $ANTLR start "WAVETARGET"
    public final void mWAVETARGET() throws RecognitionException {
        try {
            int _type = WAVETARGET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:359:12: ( 'wavetarget' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:359:14: 'wavetarget'
            {
            match("wavetarget"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WAVETARGET"

    // $ANTLR start "DOODAD"
    public final void mDOODAD() throws RecognitionException {
        try {
            int _type = DOODAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:360:8: ( 'doodad' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:360:10: 'doodad'
            {
            match("doodad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOODAD"

    // $ANTLR start "SOUND"
    public final void mSOUND() throws RecognitionException {
        try {
            int _type = SOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:361:7: ( 'sound' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:361:9: 'sound'
            {
            match("sound"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOUND"

    // $ANTLR start "WAVE"
    public final void mWAVE() throws RecognitionException {
        try {
            int _type = WAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:362:6: ( 'wave' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:362:8: 'wave'
            {
            match("wave"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WAVE"

    // $ANTLR start "INLINE"
    public final void mINLINE() throws RecognitionException {
        try {
            int _type = INLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:365:8: ( 'inline' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:365:10: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INLINE"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:368:8: ( 'static' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:368:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:369:7: ( 'const' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:369:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:372:9: ( 'private' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:372:11: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:373:8: ( 'public' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:373:10: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "NATIVE"
    public final void mNATIVE() throws RecognitionException {
        try {
            int _type = NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:376:8: ( 'native' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:376:10: 'native'
            {
            match("native"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NATIVE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:379:4: ( 'if' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:379:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:380:6: ( 'else' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:380:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:381:5: ( 'elif' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:381:7: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:382:7: ( 'while' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:382:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:383:5: ( 'end' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:383:7: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:384:5: ( 'for' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:384:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:388:7: ( 'break' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:388:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:389:10: ( 'continue' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:389:12: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:390:8: ( 'return' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:390:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:393:7: ( 'false' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:393:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:394:6: ( 'true' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:394:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:395:6: ( 'null' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:395:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:398:8: ( 'struct' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:398:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:399:6: ( 'func' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:399:8: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "CONSTRUCTOR"
    public final void mCONSTRUCTOR() throws RecognitionException {
        try {
            int _type = CONSTRUCTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:400:13: ( 'constructor' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:400:15: 'constructor'
            {
            match("constructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRUCTOR"

    // $ANTLR start "DESTRUCTOR"
    public final void mDESTRUCTOR() throws RecognitionException {
        try {
            int _type = DESTRUCTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:401:12: ( 'destructor' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:401:14: 'destructor'
            {
            match("destructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESTRUCTOR"

    // $ANTLR start "TYPEDEF"
    public final void mTYPEDEF() throws RecognitionException {
        try {
            int _type = TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:402:9: ( 'typedef' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:402:11: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPEDEF"

    // $ANTLR start "NAMESPACE"
    public final void mNAMESPACE() throws RecognitionException {
        try {
            int _type = NAMESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:403:11: ( 'namespace' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:403:13: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMESPACE"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:404:7: ( 'class' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:404:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:405:11: ( 'interface' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:405:13: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "IMPLEMENTS"
    public final void mIMPLEMENTS() throws RecognitionException {
        try {
            int _type = IMPLEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:406:12: ( 'implements' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:406:14: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPLEMENTS"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:407:5: ( 'new' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:407:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:408:8: ( 'delete' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:408:10: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:409:6: ( 'this' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:409:8: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:410:7: ( 'super' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:410:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "NAMEOF"
    public final void mNAMEOF() throws RecognitionException {
        try {
            int _type = NAMEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:411:8: ( 'nameof' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:411:10: 'nameof'
            {
            match("nameof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMEOF"

    // $ANTLR start "INITIALIZER"
    public final void mINITIALIZER() throws RecognitionException {
        try {
            int _type = INITIALIZER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:412:13: ( 'initializer' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:412:15: 'initializer'
            {
            match("initializer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INITIALIZER"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:413:8: ( 'define' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:413:10: 'define'
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

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:416:6: ( ';' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:416:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:417:7: ( ',' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:417:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:418:5: ( '.' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:418:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:419:7: ( '~' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:419:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:420:7: ( ':' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:420:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:422:9: ( '<-' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:422:11: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "RETURNS"
    public final void mRETURNS() throws RecognitionException {
        try {
            int _type = RETURNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:423:9: ( '->' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:423:11: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURNS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:424:6: ( '+' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:424:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:425:5: ( '-' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:425:7: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:426:5: ( '/' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:426:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:427:7: ( '*' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:427:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:428:5: ( '++' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:428:7: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:429:5: ( '--' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:429:7: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "ASSGN"
    public final void mASSGN() throws RecognitionException {
        try {
            int _type = ASSGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:430:7: ( '=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:430:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGN"

    // $ANTLR start "ASSGNP"
    public final void mASSGNP() throws RecognitionException {
        try {
            int _type = ASSGNP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:431:8: ( '+=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:431:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGNP"

    // $ANTLR start "ASSGNS"
    public final void mASSGNS() throws RecognitionException {
        try {
            int _type = ASSGNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:432:8: ( '-=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:432:10: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGNS"

    // $ANTLR start "ASSGNT"
    public final void mASSGNT() throws RecognitionException {
        try {
            int _type = ASSGNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:433:8: ( '*=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:433:10: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGNT"

    // $ANTLR start "ASSGND"
    public final void mASSGND() throws RecognitionException {
        try {
            int _type = ASSGND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:434:8: ( '/=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:434:10: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGND"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:436:5: ( '&' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:436:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:437:4: ( '|' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:437:6: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:438:5: ( '^' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:438:7: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:439:5: ( '!' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:439:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "LOR"
    public final void mLOR() throws RecognitionException {
        try {
            int _type = LOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:440:5: ( '||' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:440:7: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOR"

    // $ANTLR start "LAND"
    public final void mLAND() throws RecognitionException {
        try {
            int _type = LAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:441:6: ( '&&' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:441:8: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAND"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:442:4: ( '==' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:442:6: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:443:5: ( '!=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:443:7: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:444:4: ( '<' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:444:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:445:6: ( '<=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:445:8: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:446:4: ( '>' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:446:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:447:6: ( '>=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:447:8: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "SHIFTL"
    public final void mSHIFTL() throws RecognitionException {
        try {
            int _type = SHIFTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:448:8: ( '<<' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:448:10: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHIFTL"

    // $ANTLR start "SHIFTR"
    public final void mSHIFTR() throws RecognitionException {
        try {
            int _type = SHIFTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:449:8: ( '>>' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:449:10: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHIFTR"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:451:8: ( '(' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:451:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:452:8: ( ')' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:452:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:453:8: ( '{' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:453:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:454:8: ( '}' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:454:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:455:8: ( '[' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:455:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:456:8: ( ']' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:456:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "PREFIX"
    public final void mPREFIX() throws RecognitionException {
        try {
            int _type = PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:458:8: ( '#' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:458:10: '#'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:466:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:466:4: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:466:11: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:471:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:477:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:477:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:477:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:477:16: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:477:33: ~ ( '\\'' | '\\\\' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:481:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:481:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:481:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:481:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:481:31: ~ ( '\\\\' | '\"' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:485:2: ( ( DIGIT )+ | HEX_LITERAL )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:485:4: ( DIGIT )+
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:485:4: ( DIGIT )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:485:4: DIGIT
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:486:4: HEX_LITERAL
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:490:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:490:15: '0' ( 'x' | 'X' ) ( HexDigit )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:490:29: ( HexDigit )+
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:490:29: HexDigit
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:493:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:493:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:496:2: ( ( DIGIT )+ '.' ( DIGIT )* | '.' ( DIGIT )+ )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:496:4: ( DIGIT )+ '.' ( DIGIT )*
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:496:4: ( DIGIT )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:496:4: DIGIT
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:496:15: ( DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:496:15: DIGIT
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:497:4: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:497:8: ( DIGIT )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:497:8: DIGIT
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:501:7: ( '0' .. '9' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:501:9: '0' .. '9'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:504:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:504:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:504:22: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:504:33: ( '0' .. '9' )+
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:504:34: '0' .. '9'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:507:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:507:19: ( 'f' | 'F' | 'd' | 'D' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:511:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:511:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:512:9: OctalEscape
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:517:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:517:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:517:14: ( '0' .. '3' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:517:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:517:25: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:517:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:517:36: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:517:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:518:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:518:14: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:518:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:518:25: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:518:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:519:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:519:14: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:519:15: '0' .. '7'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:524:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:524:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:527:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:527:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:531:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:531:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:531:12: (~ ( '\\n' | '\\r' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:531:12: ~ ( '\\n' | '\\r' )
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:531:26: ( '\\r' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:531:26: '\\r'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:535:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:535:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:535:14: ( options {greedy=false; } : . )*
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:535:42: .
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
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:8: ( BOOLEAN | BYTE | CHAR | FIXED | INT | VOID | GAMELINK | COLOR | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | AIFILTER | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRIGGER | TRANSMISSIONSOURCE | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | SOUND | WAVE | INLINE | STATIC | CONST | PRIVATE | PUBLIC | NATIVE | IF | ELSE | ELIF | WHILE | END | FOR | BREAK | CONTINUE | RETURN | FALSE | TRUE | NULL | STRUCT | FUNC | CONSTRUCTOR | DESTRUCTOR | TYPEDEF | NAMESPACE | CLASS | INTERFACE | IMPLEMENTS | NEW | DELETE | THIS | SUPER | NAMEOF | INITIALIZER | DEFINE | SEMI | COMMA | DOT | TILDE | COLON | EXTENDS | RETURNS | PLUS | SUB | DIV | TIMES | INC | DEC | ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | AND | OR | XOR | NOT | LOR | LAND | EQ | NEQ | LT | LTEQ | GT | GTEQ | SHIFTL | SHIFTR | LPAREN | RPAREN | LBRACE | RBRACE | LBRACK | RBRACK | PREFIX | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | INTEGER | FIXED_LITERAL | WS | LINE_COMMENT | MULTI_COMMENT )
        int alt18=116;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:10: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 2 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:18: BYTE
                {
                mBYTE(); 

                }
                break;
            case 3 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:23: CHAR
                {
                mCHAR(); 

                }
                break;
            case 4 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:28: FIXED
                {
                mFIXED(); 

                }
                break;
            case 5 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:34: INT
                {
                mINT(); 

                }
                break;
            case 6 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:38: VOID
                {
                mVOID(); 

                }
                break;
            case 7 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:43: GAMELINK
                {
                mGAMELINK(); 

                }
                break;
            case 8 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:52: COLOR
                {
                mCOLOR(); 

                }
                break;
            case 9 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:58: POINT
                {
                mPOINT(); 

                }
                break;
            case 10 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:64: STRING
                {
                mSTRING(); 

                }
                break;
            case 11 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:71: ABILCMD
                {
                mABILCMD(); 

                }
                break;
            case 12 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:79: ACTOR
                {
                mACTOR(); 

                }
                break;
            case 13 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:85: ACTORSCOPE
                {
                mACTORSCOPE(); 

                }
                break;
            case 14 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:96: AIFILTER
                {
                mAIFILTER(); 

                }
                break;
            case 15 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:105: BANK
                {
                mBANK(); 

                }
                break;
            case 16 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:110: CAMERAINFO
                {
                mCAMERAINFO(); 

                }
                break;
            case 17 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:121: MARKER
                {
                mMARKER(); 

                }
                break;
            case 18 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:128: ORDER
                {
                mORDER(); 

                }
                break;
            case 19 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:134: PLAYERGROUP
                {
                mPLAYERGROUP(); 

                }
                break;
            case 20 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:146: REGION
                {
                mREGION(); 

                }
                break;
            case 21 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:153: REVEALER
                {
                mREVEALER(); 

                }
                break;
            case 22 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:162: SOUNDLINK
                {
                mSOUNDLINK(); 

                }
                break;
            case 23 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:172: TEXT
                {
                mTEXT(); 

                }
                break;
            case 24 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:177: TIMER
                {
                mTIMER(); 

                }
                break;
            case 25 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:183: TRIGGER
                {
                mTRIGGER(); 

                }
                break;
            case 26 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:191: TRANSMISSIONSOURCE
                {
                mTRANSMISSIONSOURCE(); 

                }
                break;
            case 27 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:210: UNITFILTER
                {
                mUNITFILTER(); 

                }
                break;
            case 28 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:221: UNITGROUP
                {
                mUNITGROUP(); 

                }
                break;
            case 29 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:231: UNITREF
                {
                mUNITREF(); 

                }
                break;
            case 30 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:239: UNIT
                {
                mUNIT(); 

                }
                break;
            case 31 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:244: WAVEINFO
                {
                mWAVEINFO(); 

                }
                break;
            case 32 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:253: WAVETARGET
                {
                mWAVETARGET(); 

                }
                break;
            case 33 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:264: DOODAD
                {
                mDOODAD(); 

                }
                break;
            case 34 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:271: SOUND
                {
                mSOUND(); 

                }
                break;
            case 35 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:277: WAVE
                {
                mWAVE(); 

                }
                break;
            case 36 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:282: INLINE
                {
                mINLINE(); 

                }
                break;
            case 37 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:289: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 38 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:296: CONST
                {
                mCONST(); 

                }
                break;
            case 39 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:302: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 40 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:310: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 41 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:317: NATIVE
                {
                mNATIVE(); 

                }
                break;
            case 42 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:324: IF
                {
                mIF(); 

                }
                break;
            case 43 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:327: ELSE
                {
                mELSE(); 

                }
                break;
            case 44 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:332: ELIF
                {
                mELIF(); 

                }
                break;
            case 45 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:337: WHILE
                {
                mWHILE(); 

                }
                break;
            case 46 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:343: END
                {
                mEND(); 

                }
                break;
            case 47 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:347: FOR
                {
                mFOR(); 

                }
                break;
            case 48 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:351: BREAK
                {
                mBREAK(); 

                }
                break;
            case 49 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:357: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 50 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:366: RETURN
                {
                mRETURN(); 

                }
                break;
            case 51 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:373: FALSE
                {
                mFALSE(); 

                }
                break;
            case 52 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:379: TRUE
                {
                mTRUE(); 

                }
                break;
            case 53 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:384: NULL
                {
                mNULL(); 

                }
                break;
            case 54 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:389: STRUCT
                {
                mSTRUCT(); 

                }
                break;
            case 55 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:396: FUNC
                {
                mFUNC(); 

                }
                break;
            case 56 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:401: CONSTRUCTOR
                {
                mCONSTRUCTOR(); 

                }
                break;
            case 57 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:413: DESTRUCTOR
                {
                mDESTRUCTOR(); 

                }
                break;
            case 58 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:424: TYPEDEF
                {
                mTYPEDEF(); 

                }
                break;
            case 59 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:432: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 60 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:442: CLASS
                {
                mCLASS(); 

                }
                break;
            case 61 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:448: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 62 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:458: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 63 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:469: NEW
                {
                mNEW(); 

                }
                break;
            case 64 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:473: DELETE
                {
                mDELETE(); 

                }
                break;
            case 65 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:480: THIS
                {
                mTHIS(); 

                }
                break;
            case 66 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:485: SUPER
                {
                mSUPER(); 

                }
                break;
            case 67 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:491: NAMEOF
                {
                mNAMEOF(); 

                }
                break;
            case 68 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:498: INITIALIZER
                {
                mINITIALIZER(); 

                }
                break;
            case 69 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:510: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 70 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:517: SEMI
                {
                mSEMI(); 

                }
                break;
            case 71 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:522: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 72 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:528: DOT
                {
                mDOT(); 

                }
                break;
            case 73 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:532: TILDE
                {
                mTILDE(); 

                }
                break;
            case 74 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:538: COLON
                {
                mCOLON(); 

                }
                break;
            case 75 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:544: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 76 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:552: RETURNS
                {
                mRETURNS(); 

                }
                break;
            case 77 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:560: PLUS
                {
                mPLUS(); 

                }
                break;
            case 78 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:565: SUB
                {
                mSUB(); 

                }
                break;
            case 79 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:569: DIV
                {
                mDIV(); 

                }
                break;
            case 80 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:573: TIMES
                {
                mTIMES(); 

                }
                break;
            case 81 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:579: INC
                {
                mINC(); 

                }
                break;
            case 82 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:583: DEC
                {
                mDEC(); 

                }
                break;
            case 83 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:587: ASSGN
                {
                mASSGN(); 

                }
                break;
            case 84 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:593: ASSGNP
                {
                mASSGNP(); 

                }
                break;
            case 85 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:600: ASSGNS
                {
                mASSGNS(); 

                }
                break;
            case 86 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:607: ASSGNT
                {
                mASSGNT(); 

                }
                break;
            case 87 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:614: ASSGND
                {
                mASSGND(); 

                }
                break;
            case 88 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:621: AND
                {
                mAND(); 

                }
                break;
            case 89 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:625: OR
                {
                mOR(); 

                }
                break;
            case 90 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:628: XOR
                {
                mXOR(); 

                }
                break;
            case 91 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:632: NOT
                {
                mNOT(); 

                }
                break;
            case 92 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:636: LOR
                {
                mLOR(); 

                }
                break;
            case 93 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:640: LAND
                {
                mLAND(); 

                }
                break;
            case 94 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:645: EQ
                {
                mEQ(); 

                }
                break;
            case 95 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:648: NEQ
                {
                mNEQ(); 

                }
                break;
            case 96 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:652: LT
                {
                mLT(); 

                }
                break;
            case 97 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:655: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 98 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:660: GT
                {
                mGT(); 

                }
                break;
            case 99 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:663: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 100 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:668: SHIFTL
                {
                mSHIFTL(); 

                }
                break;
            case 101 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:675: SHIFTR
                {
                mSHIFTR(); 

                }
                break;
            case 102 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:682: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 103 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:689: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 104 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:696: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 105 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:703: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 106 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:710: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 107 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:717: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 108 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:724: PREFIX
                {
                mPREFIX(); 

                }
                break;
            case 109 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:731: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 110 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:742: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 

                }
                break;
            case 111 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:760: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 112 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:775: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 113 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:783: FIXED_LITERAL
                {
                mFIXED_LITERAL(); 

                }
                break;
            case 114 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:797: WS
                {
                mWS(); 

                }
                break;
            case 115 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:800: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 116 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\de\\timoh\\galaxyxparser\\GalaxyX.g:1:813: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\22\52\2\uffff\1\135\2\uffff\1\142\1\146\1\151\1\155\1"+
        "\157\1\161\1\163\1\165\1\uffff\1\167\1\172\12\uffff\2\173\1\uffff"+
        "\15\52\1\u008c\37\52\37\uffff\12\52\1\u00c0\2\52\1\u00c4\2\52\1"+
        "\uffff\44\52\1\u00ec\2\52\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\52\1"+
        "\u00f4\6\52\1\uffff\1\52\1\u00fc\1\52\1\uffff\3\52\1\u0101\22\52"+
        "\1\u0114\3\52\1\u0118\1\52\1\u011a\1\u011e\1\u0121\7\52\1\u012a"+
        "\1\uffff\1\u012b\1\u012c\4\uffff\1\u012d\1\uffff\1\u012e\1\u0130"+
        "\2\52\1\u0133\1\u0134\1\u0135\1\uffff\4\52\1\uffff\1\52\1\u013b"+
        "\6\52\1\u0143\1\u0144\1\52\1\u0147\2\52\1\u014a\3\52\1\uffff\1\u014e"+
        "\2\52\1\uffff\1\52\1\uffff\3\52\1\uffff\2\52\1\uffff\1\u0157\7\52"+
        "\5\uffff\1\52\1\uffff\2\52\3\uffff\1\52\1\u0163\3\52\1\uffff\2\52"+
        "\1\u0169\1\u016a\1\u016b\1\u016c\1\52\2\uffff\2\52\1\uffff\1\52"+
        "\1\u0171\1\uffff\1\u0172\1\52\1\u0174\1\uffff\10\52\1\uffff\1\u017d"+
        "\1\52\1\u017f\1\u0180\1\u0181\1\52\1\u0183\4\52\1\uffff\4\52\1\u018c"+
        "\4\uffff\1\52\1\u018e\2\52\2\uffff\1\52\1\uffff\1\u0192\1\52\1\u0194"+
        "\2\52\1\u0197\2\52\1\uffff\1\52\3\uffff\1\52\1\uffff\1\52\1\u019d"+
        "\4\52\1\u01a2\1\52\1\uffff\1\52\1\uffff\1\52\1\u01a6\1\u01a7\1\uffff"+
        "\1\52\1\uffff\2\52\1\uffff\1\u01ab\4\52\1\uffff\1\52\1\u01b1\2\52"+
        "\1\uffff\1\52\1\u01b5\1\52\2\uffff\2\52\1\u01b9\1\uffff\2\52\1\u01bc"+
        "\1\52\1\u01be\1\uffff\1\52\1\u01c0\1\52\1\uffff\1\u01c2\1\52\1\u01c4"+
        "\1\uffff\1\u01c5\1\u01c6\1\uffff\1\u01c7\1\uffff\1\u01c8\1\uffff"+
        "\1\u01c9\1\uffff\1\52\6\uffff\6\52\1\u01d1\1\uffff";
    static final String DFA18_eofS =
        "\u01d2\uffff";
    static final String DFA18_minS =
        "\1\11\3\141\1\146\1\157\1\141\1\154\1\157\1\142\1\141\1\162\2\145"+
        "\1\156\1\141\1\145\1\141\1\154\2\uffff\1\60\2\uffff\2\55\1\53\1"+
        "\52\2\75\1\46\1\174\1\uffff\2\75\12\uffff\2\56\1\uffff\1\157\1\164"+
        "\1\156\1\145\1\141\1\154\1\155\1\141\1\170\1\162\1\154\1\156\1\151"+
        "\1\60\1\160\1\151\1\155\1\151\1\141\1\151\1\142\1\141\1\165\1\160"+
        "\1\151\1\164\1\146\1\162\1\144\1\147\1\170\1\155\1\141\1\160\2\151"+
        "\1\166\1\151\1\157\1\146\1\155\1\154\1\167\1\151\1\144\37\uffff"+
        "\1\154\1\145\1\153\1\141\1\162\1\157\1\163\1\145\1\163\1\145\1\60"+
        "\1\163\1\143\1\60\1\151\1\164\1\uffff\1\154\1\144\1\145\1\156\1"+
        "\171\1\166\1\154\1\151\1\164\1\156\1\145\1\154\1\157\1\151\1\153"+
        "\1\145\1\151\1\145\1\165\1\164\1\145\1\147\1\156\2\145\1\163\1\164"+
        "\1\145\1\154\1\144\1\164\1\145\2\151\1\145\1\154\1\60\1\145\1\146"+
        "\4\60\1\153\1\60\1\162\1\164\1\151\1\162\1\163\1\144\1\uffff\1\145"+
        "\1\60\1\162\1\uffff\1\156\1\151\1\145\1\60\1\154\1\164\1\145\1\141"+
        "\1\151\1\156\1\143\1\151\1\144\1\162\1\143\1\162\1\154\1\145\1\162"+
        "\1\157\1\141\1\162\1\60\1\162\1\147\1\163\1\60\1\144\3\60\1\145"+
        "\1\141\1\162\1\164\1\156\1\166\1\157\1\60\1\uffff\2\60\4\uffff\1"+
        "\60\1\uffff\2\60\1\156\1\141\3\60\1\uffff\1\146\1\145\1\141\1\155"+
        "\1\uffff\1\151\1\60\1\162\1\164\1\143\1\147\1\164\1\143\2\60\1\155"+
        "\1\60\1\164\1\162\1\60\1\156\1\154\1\156\1\uffff\1\60\1\145\1\155"+
        "\1\uffff\1\145\1\uffff\1\151\1\162\1\145\1\uffff\1\156\1\141\1\uffff"+
        "\1\60\1\144\1\165\3\145\1\160\1\146\5\uffff\1\165\1\uffff\1\165"+
        "\1\151\3\uffff\1\141\1\60\1\154\1\145\1\156\1\uffff\1\147\1\145"+
        "\4\60\1\151\2\uffff\1\144\1\143\1\uffff\1\145\1\60\1\uffff\1\60"+
        "\1\145\1\60\1\uffff\1\162\1\151\1\146\1\154\1\157\2\146\1\162\1"+
        "\uffff\1\60\1\143\3\60\1\141\1\60\1\143\1\145\1\156\1\143\1\uffff"+
        "\1\151\1\156\1\153\1\162\1\60\4\uffff\1\156\1\60\1\157\1\162\2\uffff"+
        "\1\162\1\uffff\1\60\1\163\1\60\1\164\1\165\1\60\1\157\1\147\1\uffff"+
        "\1\164\3\uffff\1\143\1\uffff\1\164\1\60\1\146\1\145\1\172\1\164"+
        "\1\60\1\157\1\uffff\1\153\1\uffff\1\160\2\60\1\uffff\1\163\1\uffff"+
        "\1\145\1\160\1\uffff\1\60\1\145\1\157\1\145\1\157\1\uffff\1\157"+
        "\1\60\1\145\1\163\1\uffff\1\165\1\60\1\145\2\uffff\1\151\1\162\1"+
        "\60\1\uffff\1\164\1\162\1\60\1\162\1\60\1\uffff\1\162\1\60\1\160"+
        "\1\uffff\1\60\1\157\1\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60"+
        "\1\uffff\1\60\1\uffff\1\156\6\uffff\1\163\1\157\1\165\1\162\1\143"+
        "\1\145\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\176\1\171\1\157\1\165\1\156\1\157\1\141\2\165\1\151\1\141\1"+
        "\162\1\145\1\171\1\156\1\150\1\157\1\165\1\156\2\uffff\1\71\2\uffff"+
        "\1\75\1\76\4\75\1\46\1\174\1\uffff\1\75\1\76\12\uffff\2\71\1\uffff"+
        "\1\157\1\164\1\156\1\145\1\141\1\156\1\155\1\141\1\170\1\162\1\154"+
        "\1\156\1\164\1\172\1\160\1\151\1\155\1\151\1\141\1\151\1\142\1\162"+
        "\1\165\1\160\1\151\1\164\1\146\1\162\1\144\1\166\1\170\1\155\1\165"+
        "\1\160\2\151\1\166\1\151\1\157\1\163\1\164\1\154\1\167\1\163\1\144"+
        "\37\uffff\1\154\1\145\1\153\1\141\1\162\1\157\1\164\1\145\1\163"+
        "\1\145\1\172\1\163\1\143\1\172\1\151\1\164\1\uffff\1\154\1\144\1"+
        "\145\1\156\1\171\1\166\1\154\1\165\1\164\1\156\1\145\1\154\1\157"+
        "\1\151\1\153\1\145\1\151\1\145\1\165\1\164\1\145\1\147\1\156\2\145"+
        "\1\163\1\164\1\145\1\154\1\144\1\164\1\145\2\151\1\145\1\154\1\172"+
        "\1\145\1\146\4\172\1\153\1\172\1\162\1\164\1\151\1\162\1\163\1\144"+
        "\1\uffff\1\145\1\172\1\162\1\uffff\1\156\1\151\1\145\1\172\1\154"+
        "\1\164\1\145\1\141\1\151\1\156\1\143\1\151\1\144\1\162\1\143\1\162"+
        "\1\154\1\145\1\162\1\157\1\141\1\162\1\172\1\162\1\147\1\163\1\172"+
        "\1\144\3\172\1\145\1\141\1\162\1\164\1\156\1\166\1\163\1\172\1\uffff"+
        "\2\172\4\uffff\1\172\1\uffff\2\172\1\156\1\141\3\172\1\uffff\1\146"+
        "\1\145\1\141\1\155\1\uffff\1\151\1\172\1\162\1\164\1\143\1\147\1"+
        "\164\1\143\2\172\1\155\1\172\1\164\1\162\1\172\1\156\1\154\1\156"+
        "\1\uffff\1\172\1\145\1\155\1\uffff\1\145\1\uffff\1\151\1\162\1\145"+
        "\1\uffff\1\156\1\141\1\uffff\1\172\1\144\1\165\3\145\1\160\1\146"+
        "\5\uffff\1\165\1\uffff\1\165\1\151\3\uffff\1\141\1\172\1\154\1\145"+
        "\1\156\1\uffff\1\147\1\145\4\172\1\151\2\uffff\1\144\1\143\1\uffff"+
        "\1\145\1\172\1\uffff\1\172\1\145\1\172\1\uffff\1\162\1\151\1\146"+
        "\1\154\1\157\2\146\1\162\1\uffff\1\172\1\143\3\172\1\141\1\172\1"+
        "\143\1\145\1\156\1\143\1\uffff\1\151\1\156\1\153\1\162\1\172\4\uffff"+
        "\1\156\1\172\1\157\1\162\2\uffff\1\162\1\uffff\1\172\1\163\1\172"+
        "\1\164\1\165\1\172\1\157\1\147\1\uffff\1\164\3\uffff\1\143\1\uffff"+
        "\1\164\1\172\1\146\1\145\1\172\1\164\1\172\1\157\1\uffff\1\153\1"+
        "\uffff\1\160\2\172\1\uffff\1\163\1\uffff\1\145\1\160\1\uffff\1\172"+
        "\1\145\1\157\1\145\1\157\1\uffff\1\157\1\172\1\145\1\163\1\uffff"+
        "\1\165\1\172\1\145\2\uffff\1\151\1\162\1\172\1\uffff\1\164\1\162"+
        "\1\172\1\162\1\172\1\uffff\1\162\1\172\1\160\1\uffff\1\172\1\157"+
        "\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1"+
        "\uffff\1\156\6\uffff\1\163\1\157\1\165\1\162\1\143\1\145\1\172\1"+
        "\uffff";
    static final String DFA18_acceptS =
        "\23\uffff\1\106\1\107\1\uffff\1\111\1\112\10\uffff\1\132\2\uffff"+
        "\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\2\uffff"+
        "\1\162\55\uffff\1\110\1\161\1\113\1\141\1\144\1\140\1\114\1\122"+
        "\1\125\1\116\1\121\1\124\1\115\1\127\1\163\1\164\1\117\1\126\1\120"+
        "\1\136\1\123\1\135\1\130\1\134\1\131\1\137\1\133\1\143\1\145\1\142"+
        "\1\160\20\uffff\1\52\63\uffff\1\57\3\uffff\1\5\47\uffff\1\77\2\uffff"+
        "\1\56\1\1\1\2\1\17\1\uffff\1\3\7\uffff\1\67\4\uffff\1\6\22\uffff"+
        "\1\27\3\uffff\1\64\1\uffff\1\101\3\uffff\1\36\2\uffff\1\43\10\uffff"+
        "\1\65\1\53\1\54\1\60\1\10\1\uffff\1\46\2\uffff\1\74\1\4\1\63\5\uffff"+
        "\1\11\7\uffff\1\42\1\102\2\uffff\1\14\2\uffff\1\22\3\uffff\1\30"+
        "\10\uffff\1\55\13\uffff\1\44\5\uffff\1\50\1\12\1\66\1\45\4\uffff"+
        "\1\21\1\24\1\uffff\1\62\10\uffff\1\41\1\uffff\1\100\1\105\1\51\1"+
        "\uffff\1\103\10\uffff\1\47\1\uffff\1\13\3\uffff\1\31\1\uffff\1\72"+
        "\2\uffff\1\35\5\uffff\1\61\4\uffff\1\7\3\uffff\1\16\1\25\3\uffff"+
        "\1\37\5\uffff\1\75\3\uffff\1\26\3\uffff\1\34\2\uffff\1\73\1\uffff"+
        "\1\20\1\uffff\1\76\1\uffff\1\15\1\uffff\1\33\1\40\1\71\1\70\1\104"+
        "\1\23\7\uffff\1\32";
    static final String DFA18_specialS =
        "\u01d2\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\57\1\uffff\2\57\22\uffff\1\57\1\41\1\54\1\51\2\uffff\1\36"+
            "\1\53\1\43\1\44\1\34\1\32\1\24\1\31\1\25\1\33\1\55\11\56\1\27"+
            "\1\23\1\30\1\35\1\42\2\uffff\32\52\1\47\1\uffff\1\50\1\40\1"+
            "\52\1\uffff\1\11\1\1\1\2\1\20\1\22\1\3\1\6\1\52\1\4\3\52\1\12"+
            "\1\21\1\13\1\7\1\52\1\14\1\10\1\15\1\16\1\5\1\17\3\52\1\45\1"+
            "\37\1\46\1\26",
            "\1\62\15\uffff\1\60\2\uffff\1\63\6\uffff\1\61",
            "\1\66\6\uffff\1\64\3\uffff\1\67\2\uffff\1\65",
            "\1\72\7\uffff\1\70\5\uffff\1\71\5\uffff\1\73",
            "\1\75\6\uffff\1\76\1\74",
            "\1\77",
            "\1\100",
            "\1\102\2\uffff\1\101\2\uffff\1\103\2\uffff\1\104",
            "\1\106\4\uffff\1\105\1\107",
            "\1\110\1\111\5\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\2\uffff\1\122\1\117\10\uffff\1\120\6\uffff\1\121",
            "\1\123",
            "\1\124\6\uffff\1\125",
            "\1\127\11\uffff\1\126",
            "\1\130\3\uffff\1\132\17\uffff\1\131",
            "\1\133\1\uffff\1\134",
            "",
            "",
            "\12\136",
            "",
            "",
            "\1\137\16\uffff\1\141\1\140",
            "\1\144\17\uffff\1\145\1\143",
            "\1\147\21\uffff\1\150",
            "\1\154\4\uffff\1\153\15\uffff\1\152",
            "\1\156",
            "\1\160",
            "\1\162",
            "\1\164",
            "",
            "\1\166",
            "\1\170\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136\1\uffff\12\56",
            "\1\136\1\uffff\12\56",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081\1\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u008b\2\uffff\1\u008a\7\uffff\1\u0089",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0095\20\uffff\1\u0094",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\14\uffff\1\u009f\1\uffff\1\u009e",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a3\7\uffff\1\u00a2\13\uffff\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ad\5\uffff\1\u00ac\6\uffff\1\u00ab",
            "\1\u00af\6\uffff\1\u00ae",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b3\11\uffff\1\u00b2",
            "\1\u00b4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c1",
            "\1\u00c2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00c3\25"+
            "\52",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce\13\uffff\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ed",
            "\1\u00ee",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0119",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\u011b\1\u011c"+
            "\12\52\1\u011d\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u011f\12"+
            "\52\1\u0120\6\52",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0129\3\uffff\1\u0128",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u012f\10"+
            "\52",
            "\1\u0131",
            "\1\u0132",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "",
            "\1\u013a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u0142\16"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0145",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u0146\7"+
            "\52",
            "\1\u0148",
            "\1\u0149",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\u0151",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "",
            "",
            "",
            "",
            "",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "",
            "",
            "",
            "\1\u0162",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u016d",
            "",
            "",
            "\1\u016e",
            "\1\u016f",
            "",
            "\1\u0170",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0173",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0182",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\u018d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018f",
            "\1\u0190",
            "",
            "",
            "\1\u0191",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0193",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0195",
            "\1\u0196",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0198",
            "\1\u0199",
            "",
            "\1\u019a",
            "",
            "",
            "",
            "\1\u019b",
            "",
            "\1\u019c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "",
            "\1\u01a5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "",
            "\1\u01b0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01b2",
            "\1\u01b3",
            "",
            "\1\u01b4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01b6",
            "",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01bd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01bf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01c1",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01c3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01ca",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            return "1:1: Tokens : ( BOOLEAN | BYTE | CHAR | FIXED | INT | VOID | GAMELINK | COLOR | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | AIFILTER | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRIGGER | TRANSMISSIONSOURCE | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | SOUND | WAVE | INLINE | STATIC | CONST | PRIVATE | PUBLIC | NATIVE | IF | ELSE | ELIF | WHILE | END | FOR | BREAK | CONTINUE | RETURN | FALSE | TRUE | NULL | STRUCT | FUNC | CONSTRUCTOR | DESTRUCTOR | TYPEDEF | NAMESPACE | CLASS | INTERFACE | IMPLEMENTS | NEW | DELETE | THIS | SUPER | NAMEOF | INITIALIZER | DEFINE | SEMI | COMMA | DOT | TILDE | COLON | EXTENDS | RETURNS | PLUS | SUB | DIV | TIMES | INC | DEC | ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | AND | OR | XOR | NOT | LOR | LAND | EQ | NEQ | LT | LTEQ | GT | GTEQ | SHIFTL | SHIFTR | LPAREN | RPAREN | LBRACE | RBRACE | LBRACK | RBRACK | PREFIX | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | INTEGER | FIXED_LITERAL | WS | LINE_COMMENT | MULTI_COMMENT );";
        }
    }
 

}