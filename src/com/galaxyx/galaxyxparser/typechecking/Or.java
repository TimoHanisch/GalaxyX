package com.galaxyx.galaxyxparser.typechecking;

public class Or extends Logical{
	public Or(Expr x1, Expr x2) {
		super("||", x1, x2);
	}
}
