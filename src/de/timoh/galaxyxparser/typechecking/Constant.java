package de.timoh.galaxyxparser.typechecking;

public class Constant extends Expr{

	public static final Constant
		True = new Constant("true", Type.Boolean)
	,	False = new Constant("false", Type.Boolean)
	,	Null = new Constant("null", Type.Null)
	;
	
	public Constant(String tok, Type p) {
		super(tok, p);
	}

}
