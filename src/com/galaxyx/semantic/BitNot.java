
package com.galaxyx.semantic;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class BitNot extends BitArith{
    
    public BitNot(String s, Expr a){
        super(s,a,a);
    }
}
