package com.galaxyx.utils;

import com.galaxyx.constructs.Namespace;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private Map<String, Namespace> namespaces;
    
    public SymbolTable(){
        namespaces = new HashMap<String, Namespace>();
    }
    
    public boolean addNamespace(String name){
        if(namespaces.containsKey(name)){
            return false;
        }
        namespaces.put(name, new Namespace(name));
        return true;
    }
    
    public Namespace getNamespace(String name){
        return namespaces.get(name);
    }
}