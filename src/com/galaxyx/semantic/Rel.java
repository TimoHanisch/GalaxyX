package com.galaxyx.semantic;

public class Rel extends Logical{
	public Rel(String tok, Expr x1, Expr x2) {
		super(tok, x1, x2);
	}

	public Type check(Type p1, Type p2) {
		if (p1.isArray() || p2.isArray())
			return null;
		else if (p1 == p2)
			return Type.Boolean;
		else
			return null;
	}
}
