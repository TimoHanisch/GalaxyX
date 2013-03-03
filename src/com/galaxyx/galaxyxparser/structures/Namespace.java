package com.galaxyx.galaxyxparser.structures;

import com.galaxyx.galaxyxparser.Debug;
import java.util.HashMap;
import java.util.Map;

public class Namespace {

    private String name = "";
    private Map<String, Class> classMap = new HashMap<String, Class>();
    private Map<String, Field> namespaceFields = new HashMap<String, Field>();
    private Map<String, Method> methodMap = new HashMap<String, Method>();

    public Namespace(String name) {
        this.name = name;
    }

    public void addClass(Class cl) {
        classMap.put(cl.toString(), cl);
    }

    public void addField(String name, Field t) {
        namespaceFields.put(name, t);
    }

    public void addMethod(String name, Method m) {
        methodMap.put(name, m);
    }

    public boolean isClassInNamespace(String name) {
        return classMap.containsKey(name);
    }

    public boolean containsField(String name) {
        return namespaceFields.containsKey(name);
    }

    public boolean containsMethod(String name) {
        return methodMap.containsKey(name);
    }

    public Method getMethod(String name){
    	return methodMap.get(name);
    }
    
    public Field getField(String name) {
        return namespaceFields.get(name);
    }

    public Class getClass(String name) {
        return classMap.get(name);
    }

    public String getAsString(int level) {
        StringBuilder builder = new StringBuilder();
        builder.append(Debug.getTabs(level)+"Namespace: " + name + "\n");
        builder.append(Debug.getTabs(level)+"[CLASSES]\n");
        for (Class c : classMap.values()) {
            builder.append(c.getAsString(level + 1) + "\n");
        }
        builder.append(Debug.getTabs(level)+"[FIELDS]\n");
        for (Field f : namespaceFields.values()) {
            builder.append(f.getAsString(level + 1) + "\n");
        }
        builder.append(Debug.getTabs(level)+"[METHODS]\n");
        for (Method m : methodMap.values()) {
            builder.append(m.getAsString(level + 1) + "\n");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
