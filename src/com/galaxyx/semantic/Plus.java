
package com.galaxyx.semantic;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Plus extends Arith{
    
    public Plus(String op, Expr a, Expr b){
        super(op,a,b);
    }
    
    @Override
    public Type check(){
        if (expr1.type == Type.String && expr2.type == Type.String) {
            return Type.String;
        }
        return Type.max(expr1.type, expr2.type);
    }
}
