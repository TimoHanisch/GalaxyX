package com.galaxyx.galaxyxparser.structures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class {
	public static int STANDARD_CLASS_INTANCE_COUNT = 32;
	private String name = "";
	private Class outerClass = null; //If null then this class is a normal class
	private Map<String, Method> methodMap = new HashMap<String, Method>();
	private Map<String, Field> fieldMap = new HashMap<String, Field>();
	private List<Constructor> constructors = new ArrayList<Constructor>();
	private List<Destructor> destructors = new ArrayList<Destructor>();
	private boolean isPrivate,isPublic;
	private Namespace parentNS;
	private boolean used = false;
	private int instance_count = STANDARD_CLASS_INTANCE_COUNT;
	
	private Class(Namespace ns){
		ns.addClass(this);
	}
	
	public Class(String name, boolean pub, boolean pri, Namespace parentNS){
		this(parentNS);
		this.name = name;
		this.isPublic = pub;
		this.isPrivate = pri;
		this.parentNS = parentNS;
	}
	
	public Class(String name, boolean pub, boolean pri,int instance_count, Namespace parentNS){
		this(parentNS);
		this.name = name;
		this.isPublic = pub;
		this.isPrivate = pri;
		this.parentNS = parentNS;
		this.instance_count = instance_count;
	}
	
	public Class(String name, boolean pub, boolean pri, Class outerClass, Namespace parentNS){
		this(parentNS);
		this.name = name;
		this.isPublic = pub;
		this.isPrivate = pri;
		this.outerClass = outerClass;
		this.parentNS = parentNS;
	}
	
	public Class(String name, boolean pub, boolean pri, Class outerClass,int instance_count,  Namespace parentNS){
		this(parentNS);
		this.name = name;
		this.isPublic = pub;
		this.isPrivate = pri;
		this.outerClass = outerClass;
		this.parentNS = parentNS;
		this.instance_count = instance_count;
	}
	
	public boolean isPrivate(){
		return isPrivate;
	}
	
	public boolean isPublic(){
		return isPublic;
	}
	
	public boolean isConstructorDefined(String line){
		for(Constructor c: constructors){
			if(c.toString().equals(line)){
				return true;
			}
		}
		return false;
	}
	
	public boolean isDestructorDefined(String line){
		for(Destructor c: destructors){
			if(c.toString().equals(line)){
				return true;
			}
		}
		return false;
	}	
	
	public void addConstructor(Constructor constr){
		constructors.add(constr);
	}
	
	public void addDestructor(Destructor destr){
		destructors.add(destr);
	}
	
	public void addMethod(String name, Method m){
		methodMap.put(name,m);
	}
	
	public boolean containsMethod(String name){
		return methodMap.containsKey(name);
	}
	
	public void addField(String name, Field f){
		fieldMap.put(name, f);
	}
	
	public boolean containsField(String name){
		return fieldMap.containsKey(name);
	}
	
	public Field getField(String name){
		return fieldMap.get(name);
	}
	
	public Namespace getNamespace(){
		return parentNS;
	}
	
	public int getInstanceCount(){
		return instance_count;
	}
	
	public Collection<Field> getFields(){
		return fieldMap.values();
	}
	
	//Methods are only used for generating code
	public void setUsed(boolean b){
		used = b;
	}
	
	public boolean isUsed(){
		return used;
	}
	
	public boolean isInnerClass(){
		return outerClass != null;
	}
	
	public String getPrintName(){
		String line = parentNS+"_";
		if(isPrivate){
			line += "pri_";
		}else if(isPublic){
			line += "pub_";
		}
		line += name +"_";
		return line;
	}
	
	@Override
	public String toString(){
		return name;
	}
}
