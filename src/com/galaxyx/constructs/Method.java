
package com.galaxyx.constructs;

import com.galaxyx.semantic.Type;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Method {
    private String name;
    private SightModifier modifier;
    
    private boolean isStatic;
    private Type returnType;
    
    private Map<String, Local> locals;
    
    public Method(String name, SightModifier modifier, boolean isStatic, Type returnType){
        this.name = name;
        this.modifier = modifier;
        this.isStatic = isStatic;
        this.returnType = returnType;
        this.locals = new HashMap<String, Local>();
    }
    
    public boolean addLocal(Local l){
        if(locals.containsKey(l.toString())){
            return false;
        }
        locals.put(l.toString(), l);
        return true;
    }
    
    public boolean isStatic(){
        return isStatic;
    }
    
    public Type getType(){
        return returnType;
    }
    
    public SightModifier getModifier(){
        return modifier;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public static class Constructor extends Method{
          
        public Constructor(Local ... params){
            this(getTypes(params));
        }
        
        public Constructor(Type ... params){
            super(getName(params),SightModifier.PUBLIC,false,null);
        }
        
        public static String getName(Type ... params){
            String name = "constr_";
            if(params == null){
                return "constr_void";
            }
            for(int i = 0; i < params.length; i++){
                name += params[i].compileString();
            }
            return name;
        }
    }
    
    public static class Destructor extends Method{
        
        public Destructor(Local ... params){
            this(getTypes(params));
        }
        
        public Destructor(Type ... params){
            super(getName(params),SightModifier.PUBLIC,false,null);
        }
           
        public static String getName(Type ... params){
            String name = "destr_";
            if(params == null){
                return "destr_void";
            }
            for(int i = 0; i < params.length; i++){
                name += params[i].compileString();
            }
            return name;
        }
    }
        
    private static Type[] getTypes(Local ... params){
        Type[] t = new Type[params.length];
        for(int i = 0; i < params.length; i++){
            t[i] = params[i].getType();
        }
        return t;
    }
}
