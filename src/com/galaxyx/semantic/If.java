package com.galaxyx.semantic;

public class If extends Stmt{
	Expr expr;
	Stmt stmt;

	public If(Expr x, Stmt s) {
		expr = x;
		stmt = s;
		if (expr.type != Type.Boolean)
			System.err.println("boolean required in if");
	}
}
