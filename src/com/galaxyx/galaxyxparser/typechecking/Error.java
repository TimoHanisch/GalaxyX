package com.galaxyx.galaxyxparser.typechecking;

import org.antlr.runtime.Token;

public class Error {

    public static int ERROR_COUNT = 0;
    public static int WARNING_COUNT = 0;
    
    public static void printError(String e){
    	System.err.println(e);
    	ERROR_COUNT++;
    }
    
    public static void printError(int line, int pos, String text) {
        System.err.println("line " + line + ":" + pos + " " + text);
        ERROR_COUNT++;
    }

    public static void printError(String warning, Token... t) {
        for (int i = 0; i < t.length; i++) {
            warning = warning.replaceAll("\\$" + (i + 1), t[i].getText());
        }
        System.err.println("line " + t[0].getLine() + ":" + t[0].getCharPositionInLine() + " " + warning);
        ERROR_COUNT++;
    }
}
