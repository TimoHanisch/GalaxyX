package de.timoh.galaxyxparser.typechecking;

public class Arith extends Op{
	public Expr expr1, expr2;

	public Arith(String op, Expr x1, Expr x2) {
		super(op, null);
		expr1 = x1;
		expr2 = x2;
		type = checkForStringChar();
	}
	
	private Type checkForStringChar(){
		if(expr1.type == Type.String && expr2.type == Type.String)return Type.String;
		return Type.max(expr1.type, expr2.type);
	}

	public Expr gen() {
		return new Arith(s, expr1.reduce(), expr2.reduce());
	}
}
