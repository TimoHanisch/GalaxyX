package com.galaxyx;

import com.galaxyx.lexer.GalaxyXLexer;
import com.galaxyx.parser.GalaxyXPreprocessorParser;
import com.galaxyx.utils.FileLoader;
import com.galaxyx.utils.SymbolTable;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;



public class GalaxyXCompiler {

    public static String TEST_FILE = "compilerTest.galaxyx";
    
    public static void main(String[] args) throws RecognitionException {
        GalaxyXCompiler compiler = new GalaxyXCompiler(TEST_FILE);
        compiler.start();
    }
    
    private String input, filePath;
    private SymbolTable symbolTable;
    
    public GalaxyXCompiler(String filePath){
        symbolTable = new SymbolTable();
        this.filePath = filePath;
        input = FileLoader.loadFile(filePath);
    }
    
    public void start() throws RecognitionException{
        if(!input.isEmpty()){
            System.out.println("Phase: Preprocessor");
            if(!phase_preprocessor()){
                return;
            }
            System.out.println(input);
            System.out.println("Phase: Definition-Linking");
            if(!phase_linking()){
                return;
            }
            System.out.println("Phase: Semantic Check");
            if(!phase_semantic()){
                return;
            }
            System.out.println("Phase: Code Generation");
            generateCode();
        }
    }
    
    private boolean phase_preprocessor() throws RecognitionException{
        Preprocessor p = new Preprocessor(input,filePath);
        do{
            TokenStream tokenStream = getTokenStream();
            GalaxyXPreprocessorParser parser = new GalaxyXPreprocessorParser(tokenStream);
            parser.parse(p);
            if(!p.canProcess()){
                p.printErrors();
                return false;
            }
        }while((input = p.includePhase()) != null);
        input = p.process();
        return true;
    }
    
    private boolean phase_linking(){
        //Definition-Gather
        
        //Definition-Linker
        
        return false;
    } 
    
    private boolean phase_semantic(){
        
        return false;
    }
    
    private void generateCode(){
        
    }
    
    private TokenStream getTokenStream(){
        CharStream charStream = new ANTLRStringStream(input);
        GalaxyXLexer lexer = new GalaxyXLexer(charStream);
        return new CommonTokenStream(lexer);
    }
}
