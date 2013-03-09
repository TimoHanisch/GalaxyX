package com.galaxyx.galaxyxparser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.galaxyx.galaxyxparser.structures.Method;
import com.galaxyx.galaxyxparser.structures.Namespace;

public class SymbolTable {

    private Map<String, String> defineTable = new HashMap<String, String>();
    private Map<String, String> nativeFunctions = new HashMap<String, String>();
    private Map<String, Namespace> namespaceTable = new HashMap<String, Namespace>();

    private Method initializer;
    
    public void setInitializer(Method m){
    	this.initializer = m;
    }
    
    public Method getInitializer(){
    	return initializer;
    }
    
    public void putNamespace(String name, Namespace space) {
        namespaceTable.put(name, space);
    }

    public Namespace getNamespace(String name) {
        return namespaceTable.get(name);
    }

    public boolean namespaceExists(String name) {
        return namespaceTable.containsKey(name);
    }

    public void putDefine(String name, String define) {
        defineTable.put(name, define);
    }

    public List<Tupel<String, String>> getDefinesAsList() {
        List<Tupel<String, String>> list = new LinkedList<Tupel<String, String>>();
        for (String s : defineTable.keySet()) {
            list.add(new Tupel<String, String>(s, defineTable.get(s)));
        }
        return list;
    }
    
    public String getNamespacesAsString(){
    	StringBuilder builder = new StringBuilder();
    	for(Namespace ns:namespaceTable.values()){
    		builder.append(ns.getAsString(0)+"\n");
    	}
    	return builder.toString();
    }
}