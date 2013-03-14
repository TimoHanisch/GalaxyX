
package com.galaxyx.constructs;

import com.galaxyx.semantic.Type;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Field {
    private String name;
    private SightModifier modifier;
    
    private boolean isStatic;
    private boolean isConstant;
    private boolean isArray;
    
    private int arrayDimensions;
    
    private Type type;
    
    public Field(String name, SightModifier modifier, boolean isStatic, boolean isConstant, boolean isArray, int arrayDimensions, Type type){
        this.name = name;
        this.modifier = modifier;
        this.isStatic = isStatic;
        this.isConstant = isConstant;
        this.isArray = isArray;
        this.arrayDimensions = arrayDimensions;
        this.type = type;
    }
    
    public SightModifier getModifier(){
        return modifier;
    }
    
    public boolean isStatic(){
        return isStatic;
    }
    
    public boolean isConsant(){
        return isConstant;
    }
    
    public boolean isArray(){
        return isArray;
    }
    
    public int getArrayDimensions(){
        return arrayDimensions;
    }
    
    public Type getType(){
        return type;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
