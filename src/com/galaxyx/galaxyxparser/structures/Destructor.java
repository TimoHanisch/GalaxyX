package com.galaxyx.galaxyxparser.structures;

import com.galaxyx.galaxyxparser.Debug;

public class Destructor extends Method {

    public Destructor(Class cl) {
        super(cl.getNamespace(), cl, false, false, false, "", null,false);
    }

    @Override
    public String getAsString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(Debug.getTabs(level) + "[LOCAL FIELDS]\n");
        for(LocalField lf : localMap.values()){
            sb.append(Debug.getTabs(level + 1)+lf.getType() + ":" + lf.getName() + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        String line = super.getParentClass().getPrintName() + "destr_";
        int i = 0;
        for(LocalField lf : parameters.values()){
            if (i == parameters.values().size() - 1) {
                line += lf.getType();
            } else {
                line += lf.getType() + "_";
            }
        	i++;
        }
        return line;
    }
}
