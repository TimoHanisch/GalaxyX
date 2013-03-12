package com.galaxyx.semantic;

public class Expr extends Node{
	public String s;
	public Type type;
	public Expr(String tok, Type p) {
		s = tok;
		type = p; 
	}
	public Expr gen() { return this; }
	public Expr reduce() { return this; }
}
