package de.timoh.galaxyxparser.structures;

import de.timoh.galaxyxparser.typechecking.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method {
	
	private List<Type> parameters = new ArrayList<Type>();
	public Type returnType = Type.Void;
	private boolean isStatic = false;
	private String name;
	private boolean isPrivate = false;
	private boolean isPublic = false;
	private Namespace parentNS;
	private Class parentCL;
	private Map<String, LocalField> localMap = new HashMap<String, LocalField>();
	
	public Method(Namespace ns, Class cl,boolean isStatic, boolean pub, boolean pri,String name, Type returnType){
		this.isStatic = isStatic;
		this.name = name;
		this.returnType = returnType;
		this.isPrivate = pri;
		this.isPublic = pub;
		this.parentNS = ns;
		this.parentCL = cl;
	}
	
	public boolean addParameter(LocalField f){
		if(localMap.containsKey(f.getName()))return false;
		parameters.add(f.getType());
		localMap.put(f.getName(),f);
		return true;
	}
	
	public void addLocal(LocalField lf){
		localMap.put(lf.getName(), lf);
	}
	
	public boolean isLocalDefined(String name){
		return localMap.containsKey(name);
	}
	
	public LocalField getLocal(String name){
		return localMap.get(name);
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isPublic(){
		return isPublic;
	}
	
	public boolean isPrivate(){
		return isPrivate;
	}
	
	public boolean isStatic(){
		return isStatic;
	}
	
	public Class getParentClass(){
		return parentCL;
	}
	
	public String toString(){
		String line = parentNS+"_";
		if(parentCL != null)line += parentCL +"_";
		if(isPrivate){
			line += "pri_";
		}else{
			line += "pub_";
		}
		if(isStatic)line+="sta_";
		line+=name;
		return line;
	}
}
