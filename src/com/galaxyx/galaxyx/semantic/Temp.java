package com.galaxyx.galaxyx.semantic;

public class Temp extends Expr {

    static int count = 0;
    int number;

    public Temp(Type p) {
        super("t", p);
        number = ++count;
    }
}
