package com.galaxyx.galaxyxparser.structures;

import com.galaxyx.galaxyxparser.typechecking.Type;

public class Field {

	private String name;
	private String asgn;
	private Type t;
	private boolean isStatic, isPrivate, isPublic,isArray;
	private int dim_count = 0;
	
	public Field(String name, Type t, boolean isStatic, boolean isPrivate, boolean isPublic){
		this.name = name;
		this.t = t;
		this.isStatic = isStatic;
		this.isPrivate = isPrivate;
		this.isPublic = isPublic;
	}
	
	public Field(String name, Type t, boolean isStatic, boolean isPrivate, boolean isPublic, boolean isArray,int dim_count){
		this.name = name;
		this.t = t;
		this.isStatic = isStatic;
		this.isPrivate = isPrivate;
		this.isPublic = isPublic;
		this.isArray = isArray;
		this.dim_count = dim_count;
	}	
	
	public String getName(){
		return name;
	}
	
	public Type getType(){
		return t;
	}
	
	public boolean isStatic(){
		return isStatic;
	}
	
	public boolean isPrivate(){
		return isPrivate;
	}
	
	public boolean isPublic(){
		return isPublic;
	}
	
	public boolean isArray(){
		return isArray;
	}
	
	public void setAsgn(String asgn){
		this.asgn = asgn;
	}
	
	public String getAsgn(){
		return asgn;
	}
	
	public String getPrintName(){
		String line = "";
		if(isPrivate){
			line += "pri_";
		}else{
			line += "pub_";
		}
		if(isStatic)line +="sta_";
		line += name;
		return line;
	}
}
