// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g 2013-03-12 19:52:50

	package  com.galaxyx.galaxyx.treewalker;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyXLinkingWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ELIF", "WHILE", "FOR", "END", "DO", "BREAK", "CONTINUE", "RETURN", "FALSE", "TRUE", "NULL", "STRUCT", "FUNC", "CONSTRUCTOR", "DESTRUCTOR", "TYPEDEF", "NAMESPACE", "CLASS", "INTERFACE", "IMPLEMENTS", "EXTENDS", "NEW", "DELETE", "THIS", "SUPER", "NAMEOF", "INITIALIZER", "INLINE", "STATIC", "CONST", "PRIVATE", "PUBLIC", "NATIVE", "SEMI", "COMMA", "DOT", "COLON", "RETURNS", "PLUS", "SUB", "DIV", "TIMES", "MODULO", "AND", "OR", "XOR", "BIT_NOT", "NOT", "LOR", "LAND", "EQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "SHIFTL", "SHIFTR", "ASSGN", "ASSGNP", "ASSGNS", "ASSGNT", "ASSGND", "ASSGNM", "ASSGNSHL", "ASSGNSHR", "ASSGNBITAND", "ASSGNBITOR", "ASSGNBITXOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "NAMESPACE_ACCESS", "LETTER", "IDENTIFIER", "EscapeSequence", "CHARACTER_LITERAL", "STRING_LITERAL", "DIGIT", "HEX_LITERAL", "INTEGER", "HexDigit", "FIXED_LITERAL", "OctalEscape", "WS", "LINE_COMMENT", "MULTI_COMMENT"
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
    public static final int SEMI=39;
    public static final int COMMA=40;
    public static final int DOT=41;
    public static final int COLON=42;
    public static final int RETURNS=43;
    public static final int PLUS=44;
    public static final int SUB=45;
    public static final int DIV=46;
    public static final int TIMES=47;
    public static final int MODULO=48;
    public static final int AND=49;
    public static final int OR=50;
    public static final int XOR=51;
    public static final int BIT_NOT=52;
    public static final int NOT=53;
    public static final int LOR=54;
    public static final int LAND=55;
    public static final int EQ=56;
    public static final int NEQ=57;
    public static final int LT=58;
    public static final int LTEQ=59;
    public static final int GT=60;
    public static final int GTEQ=61;
    public static final int SHIFTL=62;
    public static final int SHIFTR=63;
    public static final int ASSGN=64;
    public static final int ASSGNP=65;
    public static final int ASSGNS=66;
    public static final int ASSGNT=67;
    public static final int ASSGND=68;
    public static final int ASSGNM=69;
    public static final int ASSGNSHL=70;
    public static final int ASSGNSHR=71;
    public static final int ASSGNBITAND=72;
    public static final int ASSGNBITOR=73;
    public static final int ASSGNBITXOR=74;
    public static final int LPAREN=75;
    public static final int RPAREN=76;
    public static final int LBRACE=77;
    public static final int RBRACE=78;
    public static final int LBRACK=79;
    public static final int RBRACK=80;
    public static final int NAMESPACE_ACCESS=81;
    public static final int LETTER=82;
    public static final int IDENTIFIER=83;
    public static final int EscapeSequence=84;
    public static final int CHARACTER_LITERAL=85;
    public static final int STRING_LITERAL=86;
    public static final int DIGIT=87;
    public static final int HEX_LITERAL=88;
    public static final int INTEGER=89;
    public static final int HexDigit=90;
    public static final int FIXED_LITERAL=91;
    public static final int OctalEscape=92;
    public static final int WS=93;
    public static final int LINE_COMMENT=94;
    public static final int MULTI_COMMENT=95;

    // delegates
    // delegators


        public GalaxyXLinkingWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyXLinkingWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GalaxyXLinkingWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g"; }



    // $ANTLR start "rule"
    // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:13:1: rule : ;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:13:5: ()
            // C:\\Users\\Timo\\EclipseProjects\\GalaxyX\\src\\com\\galaxyx\\galaxyx\\treewalker\\GalaxyXLinkingWalker.g:13:7: 
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