
package com.galaxyx.semantic;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class BitArith extends Arith{

    public BitArith(String s, Expr a, Expr b){
        super(s,a,b);
    }
    
    @Override
    public Type check(){
        if (expr1.type == Type.Integer && expr2.type == Type.Integer) {
            return Type.Integer;
        }
        return null;
    }
}
