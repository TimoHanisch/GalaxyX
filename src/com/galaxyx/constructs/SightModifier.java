
package com.galaxyx.constructs;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public enum SightModifier {
    PUBLIC,
    PRIVATE,
    NAMESPACE;
    
    /**
     *
     * @param s
     * @return
     */
    public static SightModifier getModifier(String s){
        if(s.toLowerCase().equals("public")){
            return PUBLIC;
        }else if(s.toLowerCase().equals("private")){
            return PRIVATE;
        }
        return NAMESPACE;
    }
}
