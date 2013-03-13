package com.galaxyx.utils;

import com.galaxyx.constructs.Namespace;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private static Map<String, Namespace> namespaces = new HashMap<String, Namespace>();
    
    public static boolean addNamespace(String name){
        if(namespaces.containsKey(name)){
            return false;
        }
        namespaces.put(name, new Namespace(name));
        return true;
    }
    
    public static Namespace getNamespace(String name){
        return namespaces.get(name);
    }
}