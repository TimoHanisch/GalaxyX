package com.galaxyx.semantic;

public class Not extends Logical{
	public Not(String t,Expr x2) {
		super("!"+t, x2, x2);
	}
}
