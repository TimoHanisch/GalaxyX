package com.galaxyx.galaxyx.semantic;

public class While extends Stmt{
	Expr expr;
	Stmt stmt;

	public While() {
		expr = null;
		stmt = null;
	}

	public void init(Expr x, Stmt s) {
		expr = x;
		stmt = s;
		if (expr.type != Type.Boolean)
			System.err.println("boolean required in while");
	}
}
