package com.galaxyx.semantic;

public class Not extends Logical {

    public Not(Expr x2) {
        super("!", x2, x2);
    }
}
