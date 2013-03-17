package com.galaxyx.utils;

import com.galaxyx.constructs.Namespace;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private Map<String, Namespace> namespaces;
    
    public SymbolTable(){
        namespaces = new HashMap<String, Namespace>();
    } 
    
    public Namespace addNamespace(String name){
        Namespace namespace = new Namespace(name); 
        namespaces.put(name, namespace);
        return namespace;
    }
    
    public Namespace getNamespace(String name){
        return namespaces.get(name);
    }
}