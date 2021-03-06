
package com.galaxyx.constructs;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Namespace {
    private String name;
    
    private Map<String, Class> classes;
    private Map<String, Field> fields;
    private Map<String, Method> methods;
    
    public Namespace(String name){
        this.name = name;
        classes = new HashMap<String, Class>();
        fields = new HashMap<String, Field>();
        methods = new HashMap<String, Method>();
    }
    
    public boolean addClass(Class c){
        if(classes.containsKey(c.toString())){
            return false;
        }
        classes.put(c.toString(), c);
        return true;
    }
    
    public Class getClass(String id){
        return classes.get(id);
    }
    
    public boolean addField(Field f){
        if(fields.containsKey(f.toString())){
            return false;
        }
        fields.put(f.toString(), f);
        return true;
    }
    
    public Field getField(String id){
        return fields.get(id);
    }
    
    public boolean addMethod(Method m){
        if(methods.containsKey(m.toString())){
            return false;
        }
        methods.put(m.toString(), m);
        return true;
    }
    
    public Method getMethod(String id){
        return methods.get(id);
    }
    
    @Override
    public String toString(){
        return name;
    }
}
