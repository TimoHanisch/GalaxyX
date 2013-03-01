package com.galaxyx.galaxyxparser.structures;

import com.galaxyx.galaxyxparser.typechecking.Type;

public class LocalField {
	private String name;
	private Type t;
	private boolean isArray;
	private int dimCount;
	
	public LocalField(String name, Type t){
		this.name = name;
		this.t = t;
	}
	
	public LocalField(String name, Type t, boolean isArray, int dimCount){
		this.name = name;
		this.t = t;
		this.isArray = isArray;
		this.dimCount = dimCount;
	}
	
	public String getName(){
		return name;
	}
	
	public Type getType(){
		return t;
	}
	
	public boolean isArray(){
		return isArray;
	}
	
	public int getDimCount(){
		return dimCount;
	}
	
	public String toString(){
		return name;
	}
}
