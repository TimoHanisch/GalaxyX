package de.timoh.galaxyxparser.typechecking;

public class Node {
	static int labels = 0;
	public static int newlabel() { return ++labels; }
}
