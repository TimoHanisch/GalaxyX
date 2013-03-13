package com.galaxyx.semantic;

public class Rel extends Logical {

    public Rel(String tok, Expr x1, Expr x2) {
        super(tok, x1, x2);
    }

    @Override
    public Type check(Type p1, Type p2) {
        if (p1 == p2) {
            return Type.Boolean;
        } else {
            return null;
        }
    }
}
