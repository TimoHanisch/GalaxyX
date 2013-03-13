
package com.galaxyx.constructs;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Method {
    private String name;
    
    
    @Override
    public String toString(){
        return name;
    }
    
    public static class Constructor extends Method{
        
    }
    
    public static class Destructor extends Method{
        
    }
}
