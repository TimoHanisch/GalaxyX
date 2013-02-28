package com.galaxyx.galaxyxparser.typechecking;

public class And extends Logical{
	public And(Expr x1, Expr x2) {
		super("&&", x1, x2);
	}
}
