// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g 2013-03-09 18:00:50

  	package com.galaxyx.galaxyxparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXLexer extends Lexer {
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

    public GalaxyXLexer() {;} 
    public GalaxyXLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GalaxyXLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g"; }

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:478:9: ( 'bool' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:478:11: 'bool'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:479:6: ( 'byte' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:479:8: 'byte'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:480:6: ( 'char' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:480:8: 'char'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:481:7: ( 'fixed' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:481:9: 'fixed'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:482:5: ( 'int' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:482:7: 'int'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:483:6: ( 'void' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:483:8: 'void'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:484:10: ( 'gamelink' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:484:12: 'gamelink'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:485:7: ( 'color' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:485:9: 'color'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:486:7: ( 'point' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:486:9: 'point'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:487:8: ( 'string' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:487:10: 'string'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:490:9: ( 'abilcmd' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:490:11: 'abilcmd'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:491:7: ( 'actor' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:491:9: 'actor'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:492:12: ( 'actorscope' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:492:14: 'actorscope'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:493:10: ( 'aifilter' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:493:12: 'aifilter'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:494:6: ( 'bank' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:494:8: 'bank'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:495:12: ( 'camerainfo' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:495:14: 'camerainfo'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:496:8: ( 'marker' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:496:10: 'marker'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:497:7: ( 'order' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:497:9: 'order'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:498:13: ( 'playergroup' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:498:15: 'playergroup'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:499:8: ( 'region' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:499:10: 'region'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:500:10: ( 'revealer' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:500:12: 'revealer'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:501:11: ( 'soundlink' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:501:13: 'soundlink'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:502:6: ( 'text' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:502:8: 'text'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:503:7: ( 'timer' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:503:9: 'timer'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:504:9: ( 'trigger' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:504:11: 'trigger'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:505:20: ( 'transmissionsource' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:505:22: 'transmissionsource'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:506:12: ( 'unitfilter' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:506:14: 'unitfilter'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:507:11: ( 'unitgroup' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:507:13: 'unitgroup'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:508:8: ( 'unitref' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:508:10: 'unitref'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:509:6: ( 'unit' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:509:8: 'unit'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:510:10: ( 'waveinfo' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:510:12: 'waveinfo'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:511:12: ( 'wavetarget' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:511:14: 'wavetarget'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:512:8: ( 'doodad' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:512:10: 'doodad'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:513:7: ( 'sound' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:513:9: 'sound'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:514:6: ( 'wave' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:514:8: 'wave'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:517:8: ( 'inline' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:517:10: 'inline'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:520:8: ( 'static' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:520:10: 'static'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:521:7: ( 'const' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:521:9: 'const'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:524:9: ( 'private' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:524:11: 'private'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:525:8: ( 'public' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:525:10: 'public'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:528:8: ( 'native' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:528:10: 'native'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:531:4: ( 'if' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:531:6: 'if'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:532:6: ( 'else' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:532:8: 'else'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:533:5: ( 'elif' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:533:7: 'elif'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:534:7: ( 'while' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:534:9: 'while'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:535:5: ( 'end' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:535:7: 'end'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:536:5: ( 'for' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:536:7: 'for'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:540:7: ( 'break' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:540:9: 'break'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:541:10: ( 'continue' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:541:12: 'continue'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:542:8: ( 'return' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:542:10: 'return'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:545:7: ( 'false' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:545:9: 'false'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:546:6: ( 'true' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:546:8: 'true'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:547:6: ( 'null' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:547:8: 'null'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:550:8: ( 'struct' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:550:10: 'struct'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:551:6: ( 'func' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:551:8: 'func'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:552:13: ( 'constructor' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:552:15: 'constructor'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:553:12: ( 'destructor' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:553:14: 'destructor'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:554:9: ( 'typedef' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:554:11: 'typedef'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:555:11: ( 'namespace' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:555:13: 'namespace'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:556:7: ( 'class' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:556:9: 'class'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:557:11: ( 'interface' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:557:13: 'interface'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:558:12: ( 'implements' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:558:14: 'implements'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:559:5: ( 'new' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:559:7: 'new'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:560:8: ( 'delete' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:560:10: 'delete'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:561:6: ( 'this' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:561:8: 'this'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:562:7: ( 'super' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:562:9: 'super'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:563:8: ( 'nameof' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:563:10: 'nameof'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:564:13: ( 'initializer' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:564:15: 'initializer'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:565:8: ( 'define' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:565:10: 'define'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:568:6: ( ';' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:568:8: ';'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:569:7: ( ',' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:569:9: ','
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:570:5: ( '.' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:570:7: '.'
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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:571:7: ( ':' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:571:9: ':'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:573:9: ( '<-' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:573:11: '<-'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:574:9: ( '->' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:574:11: '->'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:575:6: ( '+' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:575:8: '+'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:576:5: ( '-' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:576:7: '-'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:577:5: ( '/' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:577:7: '/'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:578:7: ( '*' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:578:9: '*'
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

    // $ANTLR start "MODULO"
    public final void mMODULO() throws RecognitionException {
        try {
            int _type = MODULO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:579:8: ( '%' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:579:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULO"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:581:5: ( '&' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:581:7: '&'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:582:4: ( '|' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:582:6: '|'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:583:5: ( '^' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:583:7: '^'
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

    // $ANTLR start "BIT_NOT"
    public final void mBIT_NOT() throws RecognitionException {
        try {
            int _type = BIT_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:584:9: ( '~' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:584:11: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIT_NOT"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:585:5: ( '!' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:585:7: '!'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:586:5: ( '||' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:586:7: '||'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:587:6: ( '&&' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:587:8: '&&'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:588:4: ( '==' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:588:6: '=='
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:589:5: ( '!=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:589:7: '!='
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:590:4: ( '<' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:590:6: '<'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:591:6: ( '<=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:591:8: '<='
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:592:4: ( '>' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:592:6: '>'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:593:6: ( '>=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:593:8: '>='
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:594:8: ( '<<' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:594:10: '<<'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:595:8: ( '>>' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:595:10: '>>'
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

    // $ANTLR start "ASSGN"
    public final void mASSGN() throws RecognitionException {
        try {
            int _type = ASSGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:597:7: ( '=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:597:9: '='
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:598:8: ( '+=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:598:10: '+='
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:599:8: ( '-=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:599:10: '-='
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:600:8: ( '*=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:600:10: '*='
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:601:8: ( '/=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:601:10: '/='
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

    // $ANTLR start "ASSGNM"
    public final void mASSGNM() throws RecognitionException {
        try {
            int _type = ASSGNM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:602:8: ( '%=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:602:10: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGNM"

    // $ANTLR start "ASSGNSHL"
    public final void mASSGNSHL() throws RecognitionException {
        try {
            int _type = ASSGNSHL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:603:10: ( '<<=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:603:12: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGNSHL"

    // $ANTLR start "ASSGNSHR"
    public final void mASSGNSHR() throws RecognitionException {
        try {
            int _type = ASSGNSHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:604:10: ( '>>=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:604:12: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGNSHR"

    // $ANTLR start "ASSGNBITAND"
    public final void mASSGNBITAND() throws RecognitionException {
        try {
            int _type = ASSGNBITAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:605:13: ( '&=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:605:15: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGNBITAND"

    // $ANTLR start "ASSGNBITOR"
    public final void mASSGNBITOR() throws RecognitionException {
        try {
            int _type = ASSGNBITOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:606:12: ( '|=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:606:14: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGNBITOR"

    // $ANTLR start "ASSGNBITXOR"
    public final void mASSGNBITXOR() throws RecognitionException {
        try {
            int _type = ASSGNBITXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:607:13: ( '^=' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:607:15: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSGNBITXOR"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:610:8: ( '(' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:610:10: '('
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:611:8: ( ')' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:611:10: ')'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:612:8: ( '{' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:612:10: '{'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:613:8: ( '}' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:613:10: '}'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:614:8: ( '[' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:614:10: '['
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:615:8: ( ']' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:615:10: ']'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:617:8: ( '#' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:617:10: '#'
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

    // $ANTLR start "NAMESPACE_ACCESS"
    public final void mNAMESPACE_ACCESS() throws RecognitionException {
        try {
            int _type = NAMESPACE_ACCESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:618:18: ( '::' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:618:20: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMESPACE_ACCESS"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:625:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:625:4: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:625:11: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:630:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:636:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:636:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:636:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:636:16: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:636:33: ~ ( '\\'' | '\\\\' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:640:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:640:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:640:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:640:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:640:31: ~ ( '\\\\' | '\"' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:644:2: ( ( DIGIT )+ | HEX_LITERAL )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:644:4: ( DIGIT )+
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:644:4: ( DIGIT )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:644:4: DIGIT
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:645:4: HEX_LITERAL
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:649:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:649:15: '0' ( 'x' | 'X' ) ( HexDigit )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:649:29: ( HexDigit )+
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:649:29: HexDigit
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:652:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:652:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:655:2: ( ( DIGIT )+ '.' ( DIGIT )* | '.' ( DIGIT )+ )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:655:4: ( DIGIT )+ '.' ( DIGIT )*
                    {
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:655:4: ( DIGIT )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:655:4: DIGIT
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:655:15: ( DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:655:15: DIGIT
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:656:4: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:656:8: ( DIGIT )+
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
                    	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:656:8: DIGIT
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:660:7: ( '0' .. '9' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:660:9: '0' .. '9'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:663:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:663:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:663:22: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:663:33: ( '0' .. '9' )+
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:663:34: '0' .. '9'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:666:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:666:19: ( 'f' | 'F' | 'd' | 'D' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:670:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:670:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:671:9: OctalEscape
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:676:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:676:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:676:14: ( '0' .. '3' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:676:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:676:25: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:676:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:676:36: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:676:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:677:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:677:14: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:677:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:677:25: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:677:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:678:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:678:14: ( '0' .. '7' )
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:678:15: '0' .. '7'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:683:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:683:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:686:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:686:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:690:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:690:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:690:12: (~ ( '\\n' | '\\r' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:690:12: ~ ( '\\n' | '\\r' )
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

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:690:26: ( '\\r' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:690:26: '\\r'
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
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:694:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:694:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:694:14: ( options {greedy=false; } : . )*
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
            	    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:694:42: .
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
        // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:8: ( BOOLEAN | BYTE | CHAR | FIXED | INT | VOID | GAMELINK | COLOR | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | AIFILTER | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRIGGER | TRANSMISSIONSOURCE | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | SOUND | WAVE | INLINE | STATIC | CONST | PRIVATE | PUBLIC | NATIVE | IF | ELSE | ELIF | WHILE | END | FOR | BREAK | CONTINUE | RETURN | FALSE | TRUE | NULL | STRUCT | FUNC | CONSTRUCTOR | DESTRUCTOR | TYPEDEF | NAMESPACE | CLASS | INTERFACE | IMPLEMENTS | NEW | DELETE | THIS | SUPER | NAMEOF | INITIALIZER | DEFINE | SEMI | COMMA | DOT | COLON | EXTENDS | RETURNS | PLUS | SUB | DIV | TIMES | MODULO | AND | OR | XOR | BIT_NOT | NOT | LOR | LAND | EQ | NEQ | LT | LTEQ | GT | GTEQ | SHIFTL | SHIFTR | ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR | LPAREN | RPAREN | LBRACE | RBRACE | LBRACK | RBRACK | PREFIX | NAMESPACE_ACCESS | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | INTEGER | FIXED_LITERAL | WS | LINE_COMMENT | MULTI_COMMENT )
        int alt18=122;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:10: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 2 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:18: BYTE
                {
                mBYTE(); 

                }
                break;
            case 3 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:23: CHAR
                {
                mCHAR(); 

                }
                break;
            case 4 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:28: FIXED
                {
                mFIXED(); 

                }
                break;
            case 5 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:34: INT
                {
                mINT(); 

                }
                break;
            case 6 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:38: VOID
                {
                mVOID(); 

                }
                break;
            case 7 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:43: GAMELINK
                {
                mGAMELINK(); 

                }
                break;
            case 8 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:52: COLOR
                {
                mCOLOR(); 

                }
                break;
            case 9 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:58: POINT
                {
                mPOINT(); 

                }
                break;
            case 10 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:64: STRING
                {
                mSTRING(); 

                }
                break;
            case 11 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:71: ABILCMD
                {
                mABILCMD(); 

                }
                break;
            case 12 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:79: ACTOR
                {
                mACTOR(); 

                }
                break;
            case 13 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:85: ACTORSCOPE
                {
                mACTORSCOPE(); 

                }
                break;
            case 14 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:96: AIFILTER
                {
                mAIFILTER(); 

                }
                break;
            case 15 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:105: BANK
                {
                mBANK(); 

                }
                break;
            case 16 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:110: CAMERAINFO
                {
                mCAMERAINFO(); 

                }
                break;
            case 17 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:121: MARKER
                {
                mMARKER(); 

                }
                break;
            case 18 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:128: ORDER
                {
                mORDER(); 

                }
                break;
            case 19 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:134: PLAYERGROUP
                {
                mPLAYERGROUP(); 

                }
                break;
            case 20 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:146: REGION
                {
                mREGION(); 

                }
                break;
            case 21 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:153: REVEALER
                {
                mREVEALER(); 

                }
                break;
            case 22 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:162: SOUNDLINK
                {
                mSOUNDLINK(); 

                }
                break;
            case 23 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:172: TEXT
                {
                mTEXT(); 

                }
                break;
            case 24 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:177: TIMER
                {
                mTIMER(); 

                }
                break;
            case 25 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:183: TRIGGER
                {
                mTRIGGER(); 

                }
                break;
            case 26 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:191: TRANSMISSIONSOURCE
                {
                mTRANSMISSIONSOURCE(); 

                }
                break;
            case 27 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:210: UNITFILTER
                {
                mUNITFILTER(); 

                }
                break;
            case 28 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:221: UNITGROUP
                {
                mUNITGROUP(); 

                }
                break;
            case 29 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:231: UNITREF
                {
                mUNITREF(); 

                }
                break;
            case 30 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:239: UNIT
                {
                mUNIT(); 

                }
                break;
            case 31 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:244: WAVEINFO
                {
                mWAVEINFO(); 

                }
                break;
            case 32 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:253: WAVETARGET
                {
                mWAVETARGET(); 

                }
                break;
            case 33 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:264: DOODAD
                {
                mDOODAD(); 

                }
                break;
            case 34 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:271: SOUND
                {
                mSOUND(); 

                }
                break;
            case 35 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:277: WAVE
                {
                mWAVE(); 

                }
                break;
            case 36 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:282: INLINE
                {
                mINLINE(); 

                }
                break;
            case 37 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:289: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 38 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:296: CONST
                {
                mCONST(); 

                }
                break;
            case 39 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:302: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 40 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:310: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 41 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:317: NATIVE
                {
                mNATIVE(); 

                }
                break;
            case 42 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:324: IF
                {
                mIF(); 

                }
                break;
            case 43 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:327: ELSE
                {
                mELSE(); 

                }
                break;
            case 44 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:332: ELIF
                {
                mELIF(); 

                }
                break;
            case 45 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:337: WHILE
                {
                mWHILE(); 

                }
                break;
            case 46 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:343: END
                {
                mEND(); 

                }
                break;
            case 47 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:347: FOR
                {
                mFOR(); 

                }
                break;
            case 48 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:351: BREAK
                {
                mBREAK(); 

                }
                break;
            case 49 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:357: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 50 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:366: RETURN
                {
                mRETURN(); 

                }
                break;
            case 51 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:373: FALSE
                {
                mFALSE(); 

                }
                break;
            case 52 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:379: TRUE
                {
                mTRUE(); 

                }
                break;
            case 53 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:384: NULL
                {
                mNULL(); 

                }
                break;
            case 54 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:389: STRUCT
                {
                mSTRUCT(); 

                }
                break;
            case 55 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:396: FUNC
                {
                mFUNC(); 

                }
                break;
            case 56 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:401: CONSTRUCTOR
                {
                mCONSTRUCTOR(); 

                }
                break;
            case 57 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:413: DESTRUCTOR
                {
                mDESTRUCTOR(); 

                }
                break;
            case 58 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:424: TYPEDEF
                {
                mTYPEDEF(); 

                }
                break;
            case 59 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:432: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 60 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:442: CLASS
                {
                mCLASS(); 

                }
                break;
            case 61 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:448: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 62 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:458: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 63 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:469: NEW
                {
                mNEW(); 

                }
                break;
            case 64 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:473: DELETE
                {
                mDELETE(); 

                }
                break;
            case 65 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:480: THIS
                {
                mTHIS(); 

                }
                break;
            case 66 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:485: SUPER
                {
                mSUPER(); 

                }
                break;
            case 67 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:491: NAMEOF
                {
                mNAMEOF(); 

                }
                break;
            case 68 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:498: INITIALIZER
                {
                mINITIALIZER(); 

                }
                break;
            case 69 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:510: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 70 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:517: SEMI
                {
                mSEMI(); 

                }
                break;
            case 71 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:522: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 72 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:528: DOT
                {
                mDOT(); 

                }
                break;
            case 73 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:532: COLON
                {
                mCOLON(); 

                }
                break;
            case 74 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:538: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 75 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:546: RETURNS
                {
                mRETURNS(); 

                }
                break;
            case 76 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:554: PLUS
                {
                mPLUS(); 

                }
                break;
            case 77 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:559: SUB
                {
                mSUB(); 

                }
                break;
            case 78 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:563: DIV
                {
                mDIV(); 

                }
                break;
            case 79 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:567: TIMES
                {
                mTIMES(); 

                }
                break;
            case 80 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:573: MODULO
                {
                mMODULO(); 

                }
                break;
            case 81 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:580: AND
                {
                mAND(); 

                }
                break;
            case 82 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:584: OR
                {
                mOR(); 

                }
                break;
            case 83 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:587: XOR
                {
                mXOR(); 

                }
                break;
            case 84 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:591: BIT_NOT
                {
                mBIT_NOT(); 

                }
                break;
            case 85 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:599: NOT
                {
                mNOT(); 

                }
                break;
            case 86 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:603: LOR
                {
                mLOR(); 

                }
                break;
            case 87 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:607: LAND
                {
                mLAND(); 

                }
                break;
            case 88 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:612: EQ
                {
                mEQ(); 

                }
                break;
            case 89 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:615: NEQ
                {
                mNEQ(); 

                }
                break;
            case 90 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:619: LT
                {
                mLT(); 

                }
                break;
            case 91 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:622: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 92 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:627: GT
                {
                mGT(); 

                }
                break;
            case 93 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:630: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 94 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:635: SHIFTL
                {
                mSHIFTL(); 

                }
                break;
            case 95 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:642: SHIFTR
                {
                mSHIFTR(); 

                }
                break;
            case 96 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:649: ASSGN
                {
                mASSGN(); 

                }
                break;
            case 97 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:655: ASSGNP
                {
                mASSGNP(); 

                }
                break;
            case 98 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:662: ASSGNS
                {
                mASSGNS(); 

                }
                break;
            case 99 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:669: ASSGNT
                {
                mASSGNT(); 

                }
                break;
            case 100 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:676: ASSGND
                {
                mASSGND(); 

                }
                break;
            case 101 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:683: ASSGNM
                {
                mASSGNM(); 

                }
                break;
            case 102 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:690: ASSGNSHL
                {
                mASSGNSHL(); 

                }
                break;
            case 103 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:699: ASSGNSHR
                {
                mASSGNSHR(); 

                }
                break;
            case 104 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:708: ASSGNBITAND
                {
                mASSGNBITAND(); 

                }
                break;
            case 105 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:720: ASSGNBITOR
                {
                mASSGNBITOR(); 

                }
                break;
            case 106 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:731: ASSGNBITXOR
                {
                mASSGNBITXOR(); 

                }
                break;
            case 107 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:743: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 108 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:750: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 109 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:757: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 110 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:764: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 111 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:771: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 112 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:778: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 113 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:785: PREFIX
                {
                mPREFIX(); 

                }
                break;
            case 114 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:792: NAMESPACE_ACCESS
                {
                mNAMESPACE_ACCESS(); 

                }
                break;
            case 115 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:809: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 116 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:820: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 

                }
                break;
            case 117 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:838: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 118 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:853: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 119 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:861: FIXED_LITERAL
                {
                mFIXED_LITERAL(); 

                }
                break;
            case 120 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:875: WS
                {
                mWS(); 

                }
                break;
            case 121 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:878: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 122 :
                // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyxparser\\GalaxyX.g:1:891: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\22\53\2\uffff\1\136\1\141\1\145\1\150\1\152\1\156\1\160"+
        "\1\162\1\165\1\170\1\172\1\uffff\1\174\1\176\1\u0081\12\uffff\2"+
        "\u0082\1\uffff\15\53\1\u0093\37\53\6\uffff\1\u00bd\33\uffff\1\u00bf"+
        "\2\uffff\12\53\1\u00cb\2\53\1\u00cf\2\53\1\uffff\44\53\1\u00f7\2"+
        "\53\1\u00fa\4\uffff\1\u00fb\1\u00fc\1\u00fd\1\53\1\u00ff\6\53\1"+
        "\uffff\1\53\1\u0107\1\53\1\uffff\3\53\1\u010c\22\53\1\u011f\3\53"+
        "\1\u0123\1\53\1\u0125\1\u0129\1\u012c\7\53\1\u0135\1\uffff\1\u0136"+
        "\1\u0137\4\uffff\1\u0138\1\uffff\1\u0139\1\u013b\2\53\1\u013e\1"+
        "\u013f\1\u0140\1\uffff\4\53\1\uffff\1\53\1\u0146\6\53\1\u014e\1"+
        "\u014f\1\53\1\u0152\2\53\1\u0155\3\53\1\uffff\1\u0159\2\53\1\uffff"+
        "\1\53\1\uffff\3\53\1\uffff\2\53\1\uffff\1\u0162\7\53\5\uffff\1\53"+
        "\1\uffff\2\53\3\uffff\1\53\1\u016e\3\53\1\uffff\2\53\1\u0174\1\u0175"+
        "\1\u0176\1\u0177\1\53\2\uffff\2\53\1\uffff\1\53\1\u017c\1\uffff"+
        "\1\u017d\1\53\1\u017f\1\uffff\10\53\1\uffff\1\u0188\1\53\1\u018a"+
        "\1\u018b\1\u018c\1\53\1\u018e\4\53\1\uffff\4\53\1\u0197\4\uffff"+
        "\1\53\1\u0199\2\53\2\uffff\1\53\1\uffff\1\u019d\1\53\1\u019f\2\53"+
        "\1\u01a2\2\53\1\uffff\1\53\3\uffff\1\53\1\uffff\1\53\1\u01a8\4\53"+
        "\1\u01ad\1\53\1\uffff\1\53\1\uffff\1\53\1\u01b1\1\u01b2\1\uffff"+
        "\1\53\1\uffff\2\53\1\uffff\1\u01b6\4\53\1\uffff\1\53\1\u01bc\2\53"+
        "\1\uffff\1\53\1\u01c0\1\53\2\uffff\2\53\1\u01c4\1\uffff\2\53\1\u01c7"+
        "\1\53\1\u01c9\1\uffff\1\53\1\u01cb\1\53\1\uffff\1\u01cd\1\53\1\u01cf"+
        "\1\uffff\1\u01d0\1\u01d1\1\uffff\1\u01d2\1\uffff\1\u01d3\1\uffff"+
        "\1\u01d4\1\uffff\1\53\6\uffff\6\53\1\u01dc\1\uffff";
    static final String DFA18_eofS =
        "\u01dd\uffff";
    static final String DFA18_minS =
        "\1\11\3\141\1\146\1\157\1\141\1\154\1\157\1\142\1\141\1\162\2\145"+
        "\1\156\1\141\1\145\1\141\1\154\2\uffff\1\60\1\72\1\55\2\75\1\52"+
        "\2\75\1\46\2\75\1\uffff\3\75\12\uffff\2\56\1\uffff\1\157\1\164\1"+
        "\156\1\145\1\141\1\154\1\155\1\141\1\170\1\162\1\154\1\156\1\151"+
        "\1\60\1\160\1\151\1\155\1\151\1\141\1\151\1\142\1\141\1\165\1\160"+
        "\1\151\1\164\1\146\1\162\1\144\1\147\1\170\1\155\1\141\1\160\2\151"+
        "\1\166\1\151\1\157\1\146\1\155\1\154\1\167\1\151\1\144\6\uffff\1"+
        "\75\33\uffff\1\75\2\uffff\1\154\1\145\1\153\1\141\1\162\1\157\1"+
        "\163\1\145\1\163\1\145\1\60\1\163\1\143\1\60\1\151\1\164\1\uffff"+
        "\1\154\1\144\1\145\1\156\1\171\1\166\1\154\1\151\1\164\1\156\1\145"+
        "\1\154\1\157\1\151\1\153\1\145\1\151\1\145\1\165\1\164\1\145\1\147"+
        "\1\156\2\145\1\163\1\164\1\145\1\154\1\144\1\164\1\145\2\151\1\145"+
        "\1\154\1\60\1\145\1\146\1\60\4\uffff\3\60\1\153\1\60\1\162\1\164"+
        "\1\151\1\162\1\163\1\144\1\uffff\1\145\1\60\1\162\1\uffff\1\156"+
        "\1\151\1\145\1\60\1\154\1\164\1\145\1\141\1\151\1\156\1\143\1\151"+
        "\1\144\1\162\1\143\1\162\1\154\1\145\1\162\1\157\1\141\1\162\1\60"+
        "\1\162\1\147\1\163\1\60\1\144\3\60\1\145\1\141\1\162\1\164\1\156"+
        "\1\166\1\157\1\60\1\uffff\2\60\4\uffff\1\60\1\uffff\2\60\1\156\1"+
        "\141\3\60\1\uffff\1\146\1\145\1\141\1\155\1\uffff\1\151\1\60\1\162"+
        "\1\164\1\143\1\147\1\164\1\143\2\60\1\155\1\60\1\164\1\162\1\60"+
        "\1\156\1\154\1\156\1\uffff\1\60\1\145\1\155\1\uffff\1\145\1\uffff"+
        "\1\151\1\162\1\145\1\uffff\1\156\1\141\1\uffff\1\60\1\144\1\165"+
        "\3\145\1\160\1\146\5\uffff\1\165\1\uffff\1\165\1\151\3\uffff\1\141"+
        "\1\60\1\154\1\145\1\156\1\uffff\1\147\1\145\4\60\1\151\2\uffff\1"+
        "\144\1\143\1\uffff\1\145\1\60\1\uffff\1\60\1\145\1\60\1\uffff\1"+
        "\162\1\151\1\146\1\154\1\157\2\146\1\162\1\uffff\1\60\1\143\3\60"+
        "\1\141\1\60\1\143\1\145\1\156\1\143\1\uffff\1\151\1\156\1\153\1"+
        "\162\1\60\4\uffff\1\156\1\60\1\157\1\162\2\uffff\1\162\1\uffff\1"+
        "\60\1\163\1\60\1\164\1\165\1\60\1\157\1\147\1\uffff\1\164\3\uffff"+
        "\1\143\1\uffff\1\164\1\60\1\146\1\145\1\172\1\164\1\60\1\157\1\uffff"+
        "\1\153\1\uffff\1\160\2\60\1\uffff\1\163\1\uffff\1\145\1\160\1\uffff"+
        "\1\60\1\145\1\157\1\145\1\157\1\uffff\1\157\1\60\1\145\1\163\1\uffff"+
        "\1\165\1\60\1\145\2\uffff\1\151\1\162\1\60\1\uffff\1\164\1\162\1"+
        "\60\1\162\1\60\1\uffff\1\162\1\60\1\160\1\uffff\1\60\1\157\1\60"+
        "\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\156"+
        "\6\uffff\1\163\1\157\1\165\1\162\1\143\1\145\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\176\1\171\1\157\1\165\1\156\1\157\1\141\2\165\1\151\1\141\1"+
        "\162\1\145\1\171\1\156\1\150\1\157\1\165\1\156\2\uffff\1\71\1\72"+
        "\1\75\1\76\5\75\1\174\1\75\1\uffff\2\75\1\76\12\uffff\2\71\1\uffff"+
        "\1\157\1\164\1\156\1\145\1\141\1\156\1\155\1\141\1\170\1\162\1\154"+
        "\1\156\1\164\1\172\1\160\1\151\1\155\1\151\1\141\1\151\1\142\1\162"+
        "\1\165\1\160\1\151\1\164\1\146\1\162\1\144\1\166\1\170\1\155\1\165"+
        "\1\160\2\151\1\166\1\151\1\157\1\163\1\164\1\154\1\167\1\163\1\144"+
        "\6\uffff\1\75\33\uffff\1\75\2\uffff\1\154\1\145\1\153\1\141\1\162"+
        "\1\157\1\164\1\145\1\163\1\145\1\172\1\163\1\143\1\172\1\151\1\164"+
        "\1\uffff\1\154\1\144\1\145\1\156\1\171\1\166\1\154\1\165\1\164\1"+
        "\156\1\145\1\154\1\157\1\151\1\153\1\145\1\151\1\145\1\165\1\164"+
        "\1\145\1\147\1\156\2\145\1\163\1\164\1\145\1\154\1\144\1\164\1\145"+
        "\2\151\1\145\1\154\1\172\1\145\1\146\1\172\4\uffff\3\172\1\153\1"+
        "\172\1\162\1\164\1\151\1\162\1\163\1\144\1\uffff\1\145\1\172\1\162"+
        "\1\uffff\1\156\1\151\1\145\1\172\1\154\1\164\1\145\1\141\1\151\1"+
        "\156\1\143\1\151\1\144\1\162\1\143\1\162\1\154\1\145\1\162\1\157"+
        "\1\141\1\162\1\172\1\162\1\147\1\163\1\172\1\144\3\172\1\145\1\141"+
        "\1\162\1\164\1\156\1\166\1\163\1\172\1\uffff\2\172\4\uffff\1\172"+
        "\1\uffff\2\172\1\156\1\141\3\172\1\uffff\1\146\1\145\1\141\1\155"+
        "\1\uffff\1\151\1\172\1\162\1\164\1\143\1\147\1\164\1\143\2\172\1"+
        "\155\1\172\1\164\1\162\1\172\1\156\1\154\1\156\1\uffff\1\172\1\145"+
        "\1\155\1\uffff\1\145\1\uffff\1\151\1\162\1\145\1\uffff\1\156\1\141"+
        "\1\uffff\1\172\1\144\1\165\3\145\1\160\1\146\5\uffff\1\165\1\uffff"+
        "\1\165\1\151\3\uffff\1\141\1\172\1\154\1\145\1\156\1\uffff\1\147"+
        "\1\145\4\172\1\151\2\uffff\1\144\1\143\1\uffff\1\145\1\172\1\uffff"+
        "\1\172\1\145\1\172\1\uffff\1\162\1\151\1\146\1\154\1\157\2\146\1"+
        "\162\1\uffff\1\172\1\143\3\172\1\141\1\172\1\143\1\145\1\156\1\143"+
        "\1\uffff\1\151\1\156\1\153\1\162\1\172\4\uffff\1\156\1\172\1\157"+
        "\1\162\2\uffff\1\162\1\uffff\1\172\1\163\1\172\1\164\1\165\1\172"+
        "\1\157\1\147\1\uffff\1\164\3\uffff\1\143\1\uffff\1\164\1\172\1\146"+
        "\1\145\1\172\1\164\1\172\1\157\1\uffff\1\153\1\uffff\1\160\2\172"+
        "\1\uffff\1\163\1\uffff\1\145\1\160\1\uffff\1\172\1\145\1\157\1\145"+
        "\1\157\1\uffff\1\157\1\172\1\145\1\163\1\uffff\1\165\1\172\1\145"+
        "\2\uffff\1\151\1\162\1\172\1\uffff\1\164\1\162\1\172\1\162\1\172"+
        "\1\uffff\1\162\1\172\1\160\1\uffff\1\172\1\157\1\172\1\uffff\2\172"+
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\156\6\uffff"+
        "\1\163\1\157\1\165\1\162\1\143\1\145\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\23\uffff\1\106\1\107\13\uffff\1\124\3\uffff\1\153\1\154\1\155"+
        "\1\156\1\157\1\160\1\161\1\163\1\164\1\165\2\uffff\1\170\55\uffff"+
        "\1\110\1\167\1\162\1\111\1\112\1\133\1\uffff\1\132\1\113\1\142\1"+
        "\115\1\141\1\114\1\144\1\171\1\172\1\116\1\143\1\117\1\145\1\120"+
        "\1\127\1\150\1\121\1\126\1\151\1\122\1\152\1\123\1\131\1\125\1\130"+
        "\1\140\1\135\1\uffff\1\134\1\166\20\uffff\1\52\50\uffff\1\146\1"+
        "\136\1\147\1\137\13\uffff\1\57\3\uffff\1\5\47\uffff\1\77\2\uffff"+
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
        "\u01dd\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\60\1\uffff\2\60\22\uffff\1\60\1\41\1\55\1\52\1\uffff\1\34"+
            "\1\35\1\54\1\44\1\45\1\33\1\31\1\24\1\30\1\25\1\32\1\56\11\57"+
            "\1\26\1\23\1\27\1\42\1\43\2\uffff\32\53\1\50\1\uffff\1\51\1"+
            "\37\1\53\1\uffff\1\11\1\1\1\2\1\20\1\22\1\3\1\6\1\53\1\4\3\53"+
            "\1\12\1\21\1\13\1\7\1\53\1\14\1\10\1\15\1\16\1\5\1\17\3\53\1"+
            "\46\1\36\1\47\1\40",
            "\1\63\15\uffff\1\61\2\uffff\1\64\6\uffff\1\62",
            "\1\67\6\uffff\1\65\3\uffff\1\70\2\uffff\1\66",
            "\1\73\7\uffff\1\71\5\uffff\1\72\5\uffff\1\74",
            "\1\76\6\uffff\1\77\1\75",
            "\1\100",
            "\1\101",
            "\1\103\2\uffff\1\102\2\uffff\1\104\2\uffff\1\105",
            "\1\107\4\uffff\1\106\1\110",
            "\1\111\1\112\5\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117\2\uffff\1\123\1\120\10\uffff\1\121\6\uffff\1\122",
            "\1\124",
            "\1\125\6\uffff\1\126",
            "\1\130\11\uffff\1\127",
            "\1\131\3\uffff\1\133\17\uffff\1\132",
            "\1\134\1\uffff\1\135",
            "",
            "",
            "\12\137",
            "\1\140",
            "\1\142\16\uffff\1\144\1\143",
            "\1\147\1\146",
            "\1\151",
            "\1\155\4\uffff\1\154\15\uffff\1\153",
            "\1\157",
            "\1\161",
            "\1\163\26\uffff\1\164",
            "\1\167\76\uffff\1\166",
            "\1\171",
            "",
            "\1\173",
            "\1\175",
            "\1\177\1\u0080",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137\1\uffff\12\57",
            "\1\137\1\uffff\12\57",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\1\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0092\2\uffff\1\u0091\7\uffff\1\u0090",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009c\20\uffff\1\u009b",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\14\uffff\1\u00a6\1\uffff\1\u00a5",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00aa\7\uffff\1\u00a9\13\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b4\5\uffff\1\u00b3\6\uffff\1\u00b2",
            "\1\u00b6\6\uffff\1\u00b5",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00ba\11\uffff\1\u00b9",
            "\1\u00bb",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be",
            "",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00cc",
            "\1\u00cd",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00ce\25"+
            "\53",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9\13\uffff\1\u00da",
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
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f8",
            "\1\u00f9",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00fe",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0124",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\5\53\1\u0126\1\u0127"+
            "\12\53\1\u0128\10\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u012a\12"+
            "\53\1\u012b\6\53",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0134\3\uffff\1\u0133",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u013a\10"+
            "\53",
            "\1\u013c",
            "\1\u013d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u014d\16"+
            "\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0150",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0151\7"+
            "\53",
            "\1\u0153",
            "\1\u0154",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u015a",
            "\1\u015b",
            "",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "",
            "",
            "",
            "",
            "\1\u016a",
            "",
            "\1\u016b",
            "\1\u016c",
            "",
            "",
            "",
            "\1\u016d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "",
            "\1\u0172",
            "\1\u0173",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0178",
            "",
            "",
            "\1\u0179",
            "\1\u017a",
            "",
            "\1\u017b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u017e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0189",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u018d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\u0198",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u019a",
            "\1\u019b",
            "",
            "",
            "\1\u019c",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u019e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01a0",
            "\1\u01a1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "\1\u01a5",
            "",
            "",
            "",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01ae",
            "",
            "\1\u01af",
            "",
            "\1\u01b0",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u01b3",
            "",
            "\1\u01b4",
            "\1\u01b5",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "",
            "\1\u01bb",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01bd",
            "\1\u01be",
            "",
            "\1\u01bf",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01c1",
            "",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u01c5",
            "\1\u01c6",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01c8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u01ca",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01cc",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01ce",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u01d5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
            return "1:1: Tokens : ( BOOLEAN | BYTE | CHAR | FIXED | INT | VOID | GAMELINK | COLOR | POINT | STRING | ABILCMD | ACTOR | ACTORSCOPE | AIFILTER | BANK | CAMERAINFO | MARKER | ORDER | PLAYERGROUP | REGION | REVEALER | SOUNDLINK | TEXT | TIMER | TRIGGER | TRANSMISSIONSOURCE | UNITFILTER | UNITGROUP | UNITREF | UNIT | WAVEINFO | WAVETARGET | DOODAD | SOUND | WAVE | INLINE | STATIC | CONST | PRIVATE | PUBLIC | NATIVE | IF | ELSE | ELIF | WHILE | END | FOR | BREAK | CONTINUE | RETURN | FALSE | TRUE | NULL | STRUCT | FUNC | CONSTRUCTOR | DESTRUCTOR | TYPEDEF | NAMESPACE | CLASS | INTERFACE | IMPLEMENTS | NEW | DELETE | THIS | SUPER | NAMEOF | INITIALIZER | DEFINE | SEMI | COMMA | DOT | COLON | EXTENDS | RETURNS | PLUS | SUB | DIV | TIMES | MODULO | AND | OR | XOR | BIT_NOT | NOT | LOR | LAND | EQ | NEQ | LT | LTEQ | GT | GTEQ | SHIFTL | SHIFTR | ASSGN | ASSGNP | ASSGNS | ASSGNT | ASSGND | ASSGNM | ASSGNSHL | ASSGNSHR | ASSGNBITAND | ASSGNBITOR | ASSGNBITXOR | LPAREN | RPAREN | LBRACE | RBRACE | LBRACK | RBRACK | PREFIX | NAMESPACE_ACCESS | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | INTEGER | FIXED_LITERAL | WS | LINE_COMMENT | MULTI_COMMENT );";
        }
    }
 

}