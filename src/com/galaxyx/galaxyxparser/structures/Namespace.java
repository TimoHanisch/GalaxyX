package com.galaxyx.galaxyxparser.structures;

import java.util.HashMap;
import java.util.Map;

public class Namespace {
	private String name = "";
	private Map<String,Class> classMap = new HashMap<String,Class>();
	private Map<String,Field> namespaceFields = new HashMap<String,Field>();
	private Map<String,Method> methodMap = new HashMap<String,Method>();
	public Namespace(String name){
		this.name = name;
	}
	
	public void addClass(Class cl){
		classMap.put(cl.toString(), cl);
	}
	
	public void addField(String name, Field t){
		namespaceFields.put(name, t);
	}
	
	public void addMethod(String name, Method m){
		methodMap.put(name,m);
	}
	
	public boolean isClassInNamespace(String name){
		return classMap.containsKey(name);
	}
	
	public boolean isFieldInNamespace(String name){
		return namespaceFields.containsKey(name);
	}
	
	public boolean containsMethod(String name){
		return methodMap.containsKey(name);
	}
	
	public Field getField(String name){
		return namespaceFields.get(name);
	}
	
	public Class getClass(String name){
		return classMap.get(name);
	}
	
	@Override
	public String toString(){
		return name;
	}
}
