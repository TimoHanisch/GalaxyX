
package com.galaxyx.galaxyxparser;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Debug {
    
    public static String getTabs(int count){
        String s = "";
        for(; count > 0; count--){
            s += "\t";
        }
        return s;
    }
}
