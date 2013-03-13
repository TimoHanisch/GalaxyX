package com.galaxyx;

import com.galaxyx.utils.ErrorHandler;
import com.galaxyx.utils.FileLoader;
import com.galaxyx.utils.Tupel;
import com.galaxyx.utils.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.runtime.Token;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Preprocessor {

    private Map<String, String> defineTable;
    private Map<String, List<Tupel<Integer, Integer>>> definitionScope;
    private ErrorHandler handler;
    private String input, filePath;
    private boolean includePhase = false;
    private List<File> includeList;

    public Preprocessor(String input, String filePath) {
        this.input = input;
        this.filePath = filePath;
        handler = new ErrorHandler();
        defineTable = new HashMap<String, String>();
        definitionScope = new HashMap<String, List<Tupel<Integer, Integer>>>();
        includeList = new ArrayList<File>();
        includeList.add(new File(filePath));
    }

    private void processDefines() {
        for (String id : defineTable.keySet()) {
            List<Tupel<Integer,Integer>> scopes = definitionScope.get(id);
            for(int i = 0; i < scopes.size(); i++){
                String [] lines = input.split(Utils.LINE_SEPERATOR_REGEX);
                StringBuilder builder = new StringBuilder();
                Tupel<Integer,Integer> scope = scopes.get(i);
                for(int l = 1; l <= lines.length; l++){
                    String line = lines[l-1];
                    if(l >= scope.o1 && l <= scope.o2){
                        builder.append(line.replaceAll(id, defineTable.get(id)));
                        builder.append(System.getProperty("line.separator"));
                    }else{
                        builder.append(line);
                        builder.append(System.getProperty("line.separator"));
                    }
                }
                input = builder.toString();
            }
        }
    }
    
    private void clean(){
        String [] inputLines = input.split(Utils.LINE_SEPERATOR_REGEX);
        for(int i = 0; i < inputLines.length; i++){
            String line = inputLines[i];
            line = line.trim();
            if(line.startsWith("#")){
                inputLines[i] = null;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < inputLines.length; i++){
            String line = inputLines[i];
            if(line != null){
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
        }
        input = builder.toString();
    }
    
    public void reportError(String msg, Token ... tokens){
        handler.reportError(new ErrorHandler.Error(msg, tokens));
    }
    
    public void reportError(String msg, int line, int pos){
        handler.reportError(new ErrorHandler.Error(msg,line,pos));
    }

    public ErrorHandler getErrorHandler() {
        return handler;
    }

    public boolean define(String id, String definition, int line) {
        //Dirty to don't mess up the line numbers
        if(includePhase){
            return true;
        }
        if(defineTable.containsKey(id)){
            List<Tupel<Integer,Integer>> scopes = definitionScope.get(id);
            Tupel<Integer,Integer> t = scopes.get(scopes.size() - 1);
            if(line <= t.o2){
                return false;
            }
        }
        defineTable.put(id, definition);
        if(!definitionScope.containsKey(id)){
            List<Tupel<Integer,Integer>> scopes = new ArrayList<Tupel<Integer,Integer>>();
            scopes.add(new Tupel<Integer,Integer>(line, Integer.MAX_VALUE));
            definitionScope.put(id,scopes);
        }else{
            List<Tupel<Integer,Integer>> scopes = definitionScope.get(id);
            scopes.add(new Tupel<Integer,Integer>(line, Integer.MAX_VALUE));
        }
        return true;
    }

    public boolean undef(String id, int line) {
        //Dirty to don't mess up the line numbers
        if(includePhase){
            return true;
        }
        if(!defineTable.containsKey(id)){
            return false;
        }
        List<Tupel<Integer,Integer>> scopes = definitionScope.get(id);
        Tupel<Integer,Integer> t = scopes.get(scopes.size() - 1);
        if(t.o2 < line){
            return false;
        }
        t.o2 = line - 1;
        return true;
    }
    
    public void processInclude(Token path){
        if(!includePhase){
            String includePath = path.getText().substring(1, path.getText().length() - 1);
            File f = new File(includePath);
            if(includeList.contains(f)){
                reportError("Cyclic dependency for include",path);
            }else if(!f.exists()){
                reportError("Could not find file '"+includePath+"'",path);
            }else{
                String includeText = FileLoader.loadFile(f.getAbsolutePath());
                String [] inputLines = input.split(Utils.LINE_SEPERATOR_REGEX);
                StringBuilder builder = new StringBuilder();
                for(int i = 0; i < inputLines.length; i++){
                    String line = inputLines[i];
                    if(i == path.getLine() - 1){
                        builder.append(includeText);
                        builder.append(System.getProperty("line.separator"));
                    }else{
                        builder.append(line);
                        builder.append(System.getProperty("line.separator"));
                    }
                }
                input = builder.toString();
                includePhase = true;
            }
        }
    }

    public boolean canProcess() {
        return !handler.errorsOccured();
    }
    
    public String includePhase(){
        if(includePhase){
            includePhase = false;
            defineTable.clear();
            definitionScope.clear();
            return input;
        }
        return null;
    }

    public void printErrors() {
        for (ErrorHandler.Error e : handler.retrieveErrorMessages()) {
            System.err.println(e);
        }
        handler.clear();
    }

    public String process() {
        processDefines();
        clean();
        return input;
    }
}
