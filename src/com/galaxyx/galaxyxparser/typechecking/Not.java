package com.galaxyx.galaxyxparser.typechecking;

public class Not extends Logical{
	public Not(String t,Expr x2) {
		super("!"+t, x2, x2);
	}
}
