package com.galaxyx.galaxyxparser.structures;

import com.galaxyx.galaxyxparser.Debug;
import java.util.ArrayList;
import java.util.List;

public class Destructor extends Method {

    private List<LocalField> argumentList = new ArrayList<LocalField>();

    public Destructor(Class cl) {
        super(cl.getNamespace(), cl, false, false, false, "", null);
    }

    public boolean addArgument(LocalField t) {
        for (LocalField f : argumentList) {
            if (f.getName().equals(t.getName())) {
                return false;
            }
        }
        argumentList.add(t);
        return true;
    }

    public List<LocalField> getArgumentList() {
        return argumentList;
    }

    public String getAsString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(Debug.getTabs(level)+"[LOCAL FIELDS]\n");
        for (LocalField lf : argumentList) {
            sb.append(Debug.getTabs(level + 1)+lf.getType() + ":" + lf.getName() + "\n");
        }
        return sb.toString();
    }

    public String toString() {
        String line = super.getParentClass().getPrintName() + "destr_";
        for (int i = 0; i < argumentList.size(); i++) {
            if (i == argumentList.size() - 1) {
                line += argumentList.get(i).getType();
            } else {
                line += argumentList.get(i).getType() + "_";
            }
        }
        return line;
    }
}
