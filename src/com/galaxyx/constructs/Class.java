
package com.galaxyx.constructs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Class {
    private String name;
    private SightModifier modifier;
    
    private Map<String, Field> fields;
    private Map<String, Method> methods;
    
    private List<Method.Constructor> constructors;
    private List<Method.Destructor> destructors;
    
    public Class(String name){
        this(name, SightModifier.NAMESPACE);
    }
    
    public Class(String name, SightModifier modifier){
        this.name = name;
        this.modifier = modifier;
        fields = new HashMap<String, Field>();
        methods = new HashMap<String, Method>();
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
