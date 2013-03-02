package com.galaxyx.galaxyxparser.structures;

import com.galaxyx.galaxyxparser.Debug;
import java.util.HashMap;
import java.util.Map;

import com.galaxyx.galaxyxparser.typechecking.Type;

public class Method {

    protected Map<String, LocalField> parameters = new HashMap<String, LocalField>();
    protected Map<String, LocalField> localMap = new HashMap<String, LocalField>();
    public Type returnType = Type.Void;
    private boolean isStatic = false;
    private String name;
    private boolean isPrivate = false;
    private boolean isPublic = false;
    private Namespace parentNS;
    private Class parentCL;

    public Method(Namespace ns, Class cl, boolean isStatic, boolean pub, boolean pri, String name, Type returnType, boolean method) {
        this.isStatic = isStatic;
        this.name = name;
        this.returnType = returnType;
        this.isPrivate = pri;
        this.isPublic = pub;
        this.parentNS = ns;
        this.parentCL = cl;
        if(method){
            if (cl == null) {
                ns.addMethod(name, this);
            } else {
                cl.addMethod(name, this);
            }
        }
    }

    public boolean addLocal(LocalField f, boolean isParameter) {
        if (localMap.containsKey(f.getName())) {
            return false;
        }
        if (isParameter) {
            parameters.put(f.getName(), f);
        }
        localMap.put(f.getName(), f);
        return true;
    }

    public boolean isLocalDefined(String name) {
        return localMap.containsKey(name);
    }

    public LocalField getLocal(String name) {
        return localMap.get(name);
    }

    public String getName() {
        return name;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public Class getParentClass() {
        return parentCL;
    }
    
    public String getAsString(int level){
        StringBuilder sb = new StringBuilder();
        String sight = isPublic?"public":(isPrivate?"private":"namespace");
        sb.append(Debug.getTabs(level)+"Method: "+sight+" "+(isStatic?"static":"")+" "+name+" returns "+returnType+"\n");
        sb.append(Debug.getTabs(level + 1)+"[LOCAL FIELDS]\n");
        for(LocalField lf : localMap.values()){
            sb.append(Debug.getTabs(level + 1)+lf.getType() + ":" + lf.getName() + "\n");
        }
        return sb.toString();
    }

    public String toString() {
        String line = parentNS + "_";
        if (parentCL != null) {
            line += parentCL + "_";
        }
        if (isPrivate) {
            line += "pri_";
        } else {
            line += "pub_";
        }
        if (isStatic) {
            line += "sta_";
        }
        line += name;
        return line;
    }
}
