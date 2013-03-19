package com.galaxyx.semantic;

public class Constant extends Expr{

	public static final Constant
		True = new Constant("true", Type.Boolean)
	,	False = new Constant("false", Type.Boolean)
	,	Null = new Constant("null", Type.Null)
        ,       This = new Constant("this", Type.String)
	;
	
	public Constant(String tok, Type p) {
		super(tok, p);
	}

}
