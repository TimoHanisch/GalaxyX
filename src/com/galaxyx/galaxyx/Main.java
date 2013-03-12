package com.galaxyx.galaxyx;

import com.galaxyx.galaxyx.utils.SymbolTable;
import com.galaxyx.galaxyx.lexer.GalaxyXLexer;
import com.galaxyx.galaxyx.parser.GalaxyXSemanticParser;
import com.galaxyx.galaxyx.parser.GalaxyXSemanticParser.parse_return;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;



public class Main {

    /*
     * .galx  = GalaxyX file
     * .galxh = GalaxyX-Header file
     */
    /**
     * @param args
     * @throws RecognitionException 
     */
    //Public Stuff needed
    public static SymbolTable table = new SymbolTable();
    public static List<String> outputList = new ArrayList<String>();
    private static boolean fileNotFound;
    //End

    public static void main(String[] args) throws RecognitionException {
        /*if(args.length < 1){
        System.err.println("Error: No arguments");
        return;
        }
        String text = loadFile(args[0]);
        if(fileNotFound){
        System.err.println("Error: No such file");
        return;
        }*/
        CharStream charStream = new ANTLRStringStream("namespace Test:\n"
                + "fixed version = 1.0;\n"
                + "class g :\n"
                + "constructor(System::List list):\n"
                + "list = 5;\n"
                + "//customFunction(System::Unit.MAX_HP);\n"
                + "//System::DebugPrint(\"test\");\n"
                + "//System::Debug.Print(\"Hello World\");\n"
                + "end constructor\n"
                + "end class\n"
                + "end namespace\n"
                + "namespace System:\n"
                + "class Unit:\n"
                + "end class\n"
                + "class List:\n"
                + "end class\n"
                + "end namespace\n");
        GalaxyXLexer lexer = new GalaxyXLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        GalaxyXSemanticParser parser = new GalaxyXSemanticParser(tokenStream);
        parse_return evaluator = parser.parse();
        System.out.println(((CommonTree)evaluator.getTree()).toStringTree());
        
//        CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(evaluator.tree);
//        GalaxyXWalker walker = new GalaxyXWalker(nodeStream);
//        walker.evaluator();
        //System.out.println(Error.ERROR_COUNT+" errors occured");
        //System.out.println(Error.WARNING_COUNT+" warnings occured");
    }

    private static String includePreprocess(String content) {
        return "";
    }

    private static void includeDefinitions(String gxhPath) {
    }

    private static String replaceDefinitions(String content) {
        return "";
    }

    private static String loadFile(String path) {
        BufferedReader br = null;
        String line = null;
        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                line += System.getProperty("line.separator");
                sb.append(line);
            }
        } catch (FileNotFoundException e) {
            fileNotFound = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
