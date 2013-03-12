package com.galaxyx.semantic;

public class Op extends Expr{

	public Op(String tok, Type p) {
		super(tok, p);
	}	
	public Expr reduce() {
		Temp t = new Temp(type);
		return t;
	}
}
