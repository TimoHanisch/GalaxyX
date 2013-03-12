package com.galaxyx.galaxyx.semantic;

public class Unary extends Op{
	public Expr expr;

	public Unary(String tok, Expr e) {
		super(tok, null);
		expr = e;
		type = Type.max(Type.Integer, expr.type);
		if (type == null)
			System.err.println("type error");
	}

	public Expr gen() {
		return new Unary(s, expr.reduce());
	}
}
