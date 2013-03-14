
package com.galaxyx.constructs;

import com.galaxyx.semantic.Type;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Local {
    private Type type;
    private String name;
    
    private boolean array;
    private int arrayDimension;
    
    private boolean constant;
    
    public Local(String name, Type type, boolean array, int arrayDimension, boolean constant){
        this.name = name;
        this.type = type;
        this.array = array;
        this.arrayDimension = arrayDimension;
        this.constant = constant;
    }
    
    public Type getType(){
        return type;
    }
    
    public boolean isArray(){
        return array;
    }
    
    public int getArrayDimensions(){
        return arrayDimension;
    }
    
    public boolean isConstant(){
        return constant;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
