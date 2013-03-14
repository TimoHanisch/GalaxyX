
package com.galaxyx.constructs;

import java.util.HashMap;
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
    
    private Map<String, Method.Constructor> constructors;
    private Map<String, Method.Destructor> destructors;
    
    public Class(String name){
        this(name, SightModifier.NAMESPACE);
    }
    
    public Class(String name, SightModifier modifier){
        this.name = name;
        this.modifier = modifier;
        fields = new HashMap<String, Field>();
        methods = new HashMap<String, Method>();
        constructors = new HashMap<String, Method.Constructor>();
        destructors = new HashMap<String, Method.Destructor>();
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
    
    public boolean addConstructor(Method.Constructor c){
        if(constructors.containsKey(c.toString())){
            return false;
        }
        constructors.put(c.toString(),c);
        return true;
    }
    
    public Method.Constructor getConstructor(Local ... params){
        String constr = Method.Constructor.getName(params);
        return constructors.get(constr);
    }
    
    public boolean addDestructor(Method.Destructor d){
        if(destructors.containsKey(d.toString())){
            return false;
        }
        destructors.put(d.toString(),d);
        return true;
    }
    
    public Method.Destructor getDestructor(Local ... params){
        String destr = Method.Destructor.getName(params);
        return destructors.get(destr);
    }    
    
    public SightModifier getModifier(){
        return modifier;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
