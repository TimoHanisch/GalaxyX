package de.timoh.galaxyxparser.typechecking;

public class Set extends Stmt{
	public Expr expr;

	public Set(Type lvalue, Expr x) {
		expr = x;
		if (check(lvalue, expr.type) == null)
			System.err.println("type error");
	}

	public static Type check(Type p1, Type p2) {
		if (p1.isArray() || p2.isArray())
			return null;
		if (p1 == p2)
			return p2;
		if (Type.numeric(p1) && Type.numeric(p2))
			return p2;
		else if (p1 == Type.Boolean && p2 == Type.Boolean)
			return p2;
		else
			return null;
	}
}
