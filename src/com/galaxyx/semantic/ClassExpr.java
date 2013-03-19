
package com.galaxyx.semantic;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class ClassExpr extends Expr{

    public ClassExpr(String s, Type a){
        super(s,check(a));
    }
    
    public static Type check(Type a){
        if(a.getGroup() == Type.CUSTOM){
            return a;
        }
        return null;
    }
}
