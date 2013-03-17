package com.galaxyx;

import com.galaxyx.lexer.GalaxyXLexer;
import com.galaxyx.parser.GalaxyXDefinitionParser;
import com.galaxyx.parser.GalaxyXPreprocessorParser;
import com.galaxyx.treewalker.GalaxyXDefinitionWalker;
import com.galaxyx.utils.ErrorHandler;
import com.galaxyx.utils.FileLoader;
import com.galaxyx.utils.SymbolTable;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;



public class GalaxyXCompiler {

    public static String TEST_FILE = "compilerTest.galaxyx";
    
    public static void main(String[] args) throws RecognitionException {
        GalaxyXCompiler compiler = new GalaxyXCompiler(TEST_FILE);
        compiler.start();
    }
    
    private String input, filePath;
    private SymbolTable symbolTable;
    private ErrorHandler errHandler;
    
    public GalaxyXCompiler(String filePath){
        symbolTable = new SymbolTable();
        errHandler = new ErrorHandler();
        this.filePath = filePath;
        input = FileLoader.loadFile(filePath);
    }
    
    public void start() throws RecognitionException{
        if(!input.isEmpty()){
            System.out.println("Phase: Preprocessor");
            if(!phase_preprocessor()){
                return;
            }
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
        Preprocessor p = new Preprocessor(input,filePath,errHandler);
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
    
    private boolean phase_linking() throws RecognitionException{
        //Definition-Gather
        TokenStream tokenStream = getTokenStream();
        GalaxyXDefinitionParser parser = new GalaxyXDefinitionParser(tokenStream);
        GalaxyXDefinitionParser.parse_return ast = parser.parse(errHandler);
        CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(ast.getTree());
        GalaxyXDefinitionWalker walker = new GalaxyXDefinitionWalker(nodeStream);
        walker.eval(symbolTable, errHandler);
        if(errHandler.errorsOccured()){
            System.err.println("Definition errors: "+errHandler.retrieveErrorMessages().size());
            for (ErrorHandler.Error e : errHandler.retrieveErrorMessages()) {
                System.err.println(e);
            }
            errHandler.clear();
            return false;
        }
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
