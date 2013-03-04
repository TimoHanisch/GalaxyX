package com.galaxyx.galaxyxparser.structures;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.galaxyx.galaxyxparser.Debug;

import com.galaxyx.galaxyxparser.typechecking.Type;

public class Class {

    public static int STANDARD_CLASS_INTANCE_COUNT = 32;
    private String name = "";
    private Class outerClass = null; //If null then this class is a normal class
    private Map<String, Method> methodMap = new HashMap<String, Method>();
    private Map<String, Field> fieldMap = new HashMap<String, Field>();
    private Map<String, Constructor> constructors = new HashMap<String, Constructor>();
    private Map<String, Destructor> destructors = new HashMap<String, Destructor>();
    private boolean isPrivate, isPublic;
    private Namespace parentNS;
    private boolean used = false;
    private int instance_count = STANDARD_CLASS_INTANCE_COUNT;

    private Class(Namespace ns, String name) {
        this.name = name;
        ns.addClass(this);
        Type.TypeCustom(ns.toString() + "_" + name, Type.Integer, true);
    }

    public Class(String name, boolean pub, boolean pri, Namespace parentNS) {
        this(parentNS, name);
        this.isPublic = pub;
        this.isPrivate = pri;
        this.parentNS = parentNS;
    }

    public Class(String name, boolean pub, boolean pri, int instance_count, Namespace parentNS) {
        this(parentNS, name);
        this.isPublic = pub;
        this.isPrivate = pri;
        this.parentNS = parentNS;
        this.instance_count = instance_count;
    }

    public Class(String name, boolean pub, boolean pri, Class outerClass, Namespace parentNS) {
        this(parentNS, name);
        this.isPublic = pub;
        this.isPrivate = pri;
        this.outerClass = outerClass;
        this.parentNS = parentNS;
    }

    public Class(String name, boolean pub, boolean pri, Class outerClass, int instance_count, Namespace parentNS) {
        this(parentNS, name);
        this.isPublic = pub;
        this.isPrivate = pri;
        this.outerClass = outerClass;
        this.parentNS = parentNS;
        this.instance_count = instance_count;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public boolean isConstructorDefined(String line) {
        return constructors.containsKey(line);
    }

    public boolean isDestructorDefined(String line) {
        return destructors.containsKey(line);
    }

    public void addConstructor(Constructor constr) {
        constructors.put(constr.toString(),constr);
    }

    public void addDestructor(Destructor destr) {
        destructors.put(destr.toString(),destr);
    }

    public Method getConstructor(List<LocalField> l){
    	String name = getPrintName()+"constr_";
        int i = 0;
        for(LocalField lf : l){
            if (i == l.size() - 1) {
                name += lf.getType();
            } else {
                name += lf.getType() + "_";
            }
        	i++;
        }
    	if(!isConstructorDefined(name)){
    		return null;
    	}
    	return constructors.get(name);
    }

    public Method getDestructor(List<LocalField> l){
    	String name = getPrintName()+"destr_";
        int i = 0;
        for(LocalField lf : l){
            if (i == l.size() - 1) {
                name += lf.getType();
            } else {
                name += lf.getType() + "_";
            }
        	i++;
        }
    	if(!isConstructorDefined(name)){
    		return null;
    	}
    	return constructors.get(name);
    }
    
    public void addMethod(String name, Method m) {
        methodMap.put(name, m);
    }

    public boolean containsMethod(String name) {
        return methodMap.containsKey(name);
    }

    public void addField(String name, Field f) {
        fieldMap.put(name, f);
    }

    public boolean containsField(String name) {
        return fieldMap.containsKey(name);
    }

    public Field getField(String name) {
        return fieldMap.get(name);
    }
    
    public Method getMethod(String name){
    	return methodMap.get(name);
    }

    public Namespace getNamespace() {
        return parentNS;
    }

    public int getInstanceCount() {
        return instance_count;
    }

    public Collection<Field> getFields() {
        return fieldMap.values();
    }

    //Methods are only used for generating code
    public void setUsed(boolean b) {
        used = b;
    }

    public boolean isUsed() {
        return used;
    }
    
    public String getName(){
    	return name;
    }

    public boolean isInnerClass() {
        return outerClass != null;
    }

    public String getPrintName() {
        String line = parentNS + "_";
        if (isPrivate) {
            line += "pri_";
        } else if (isPublic) {
            line += "pub_";
        }
        line += name + "_";
        return line;
    }

    public String getAsString(int level) {
        StringBuilder builder = new StringBuilder();
        builder.append(Debug.getTabs(level)+"Class: " + name + "\n");
        builder.append(Debug.getTabs(level)+"[Constructors]\n");
        for (Constructor c : constructors.values()) {
            builder.append(Debug.getTabs(level) + c.getAsString(level) + "\n");
        }
        builder.append(Debug.getTabs(level)+"[Destructors]\n");
        for (Destructor d : destructors.values()) {
            builder.append(Debug.getTabs(level) + d.getAsString(level) + "\n");
        }
        builder.append(Debug.getTabs(level)+"[FIELDS]\n");
        for (Field f : fieldMap.values()) {
            builder.append(Debug.getTabs(level) + f.getAsString(level) + "\n");
        }
        builder.append(Debug.getTabs(level)+"[METHODS]\n");
        for (Method m : methodMap.values()) {
            builder.append(Debug.getTabs(level) + m.getAsString(level) + "\n");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
