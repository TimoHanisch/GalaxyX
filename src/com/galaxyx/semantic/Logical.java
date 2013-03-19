package com.galaxyx.semantic;

public class Logical extends Expr {

    public Expr expr1, expr2;

    Logical(String tok, Expr x1, Expr x2) {
        super(tok, null);
        expr1 = x1;
        expr2 = x2;
        type = check(expr1.type, expr2.type);
    }

    public Type check(Type p1, Type p2) {
        if (p1 == Type.Boolean && p2 == Type.Boolean) {
            return Type.Boolean;
        } else {
            return null;
        }
    }

    public Expr gen() {
        Temp temp = new Temp(type);
        return temp;
    }
}
