// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\parser\\GalaxyXPreprocessorParser.g 2013-03-12 20:20:45

	package com.galaxyx.galaxyx.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXPreprocessorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ELIF", "WHILE", "FOR", "END", "DO", "BREAK", "CONTINUE", "RETURN", "FALSE", "TRUE", "NULL", "STRUCT", "FUNC", "CONSTRUCTOR", "DESTRUCTOR", "TYPEDEF", "NAMESPACE", "CLASS", "INTERFACE", "IMPLEMENTS", "EXTENDS", "NEW", "DELETE", "THIS", "SUPER", "NAMEOF", "INITIALIZER", "INLINE", "STATIC", "CONST", "PRIVATE", "PUBLIC", "NATIVE", "DEFINE", "UNDEF", "PREFIX", "SEMI", "COMMA", "DOT", "COLON", "RETURNS", "PLUS", "SUB", "DIV", "TIMES", "MODULO", "AND", "OR", "XOR", "BIT_NOT", "NOT", "LOR", "LAND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "SHIFTL", "SHIFTR", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "NAMESPACE_ACCESS", "LETTER", "IDENTIFIER", "EscapeSequence", "CHARACTER_LITERAL", "STRING_LITERAL", "DIGIT", "HEX_LITERAL", "INTEGER", "HexDigit", "FIXED_LITERAL", "OctalEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT"
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
    public static final int PREFIX=41;
    public static final int SEMI=42;
    public static final int COMMA=43;
    public static final int DOT=44;
    public static final int COLON=45;
    public static final int RETURNS=46;
    public static final int PLUS=47;
    public static final int SUB=48;
    public static final int DIV=49;
    public static final int TIMES=50;
    public static final int MODULO=51;
    public static final int AND=52;
    public static final int OR=53;
    public static final int XOR=54;
    public static final int BIT_NOT=55;
    public static final int NOT=56;
    public static final int LOR=57;
    public static final int LAND=58;
    public static final int EQ=59;
    public static final int NEQ=60;
    public static final int LT=61;
    public static final int LTEQ=62;
    public static final int GT=63;
    public static final int GTEQ=64;
    public static final int SHIFTL=65;
    public static final int SHIFTR=66;
    public static final int ASSGN=67;
    public static final int ASSGNP=68;
    public static final int ASSGNS=69;
    public static final int ASSGNT=70;
    public static final int ASSGND=71;
    public static final int ASSGNM=72;
    public static final int ASSGNSHL=73;
    public static final int ASSGNSHR=74;
    public static final int ASSGNBITAND=75;
    public static final int ASSGNBITOR=76;
    public static final int ASSGNBITXOR=77;
    public static final int LPAREN=78;
    public static final int RPAREN=79;
    public static final int LBRACE=80;
    public static final int RBRACE=81;
    public static final int LBRACK=82;
    public static final int RBRACK=83;
    public static final int NAMESPACE_ACCESS=84;
    public static final int LETTER=85;
    public static final int IDENTIFIER=86;
    public static final int EscapeSequence=87;
    public static final int CHARACTER_LITERAL=88;
    public static final int STRING_LITERAL=89;
    public static final int DIGIT=90;
    public static final int HEX_LITERAL=91;
    public static final int INTEGER=92;
    public static final int HexDigit=93;
    public static final int FIXED_LITERAL=94;
    public static final int OctalEscape=95;
    public static final int WS=96;
    public static final int LINE_COMMENT=97;
    public static final int MULTI_COMMENT=98;

    // delegates
    // delegators


        public GalaxyXPreprocessorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXPreprocessorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GalaxyXPreprocessorParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\parser\\GalaxyXPreprocessorParser.g"; }



    // $ANTLR start "rule"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:12:1: rule : ;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:12:5: ()
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\parser\\GalaxyXPreprocessorParser.g:12:7: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rule"

    // Delegated rules


 

}