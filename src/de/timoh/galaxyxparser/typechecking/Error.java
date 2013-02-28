package de.timoh.galaxyxparser.typechecking;

public class Error {
	
	public static void printError(int line, int pos, String text){
		System.err.println("line "+line+":"+pos+" "+text);
	}
}
