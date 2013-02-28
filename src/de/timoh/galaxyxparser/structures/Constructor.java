package de.timoh.galaxyxparser.structures;

import java.util.ArrayList;
import java.util.List;

public class Constructor extends Method{

	private List<LocalField> argumentList = new ArrayList<LocalField>();
	public Constructor(Class cl) {
		super(cl.getNamespace(), cl, false, false, false, "", null);
	}
	
	public boolean addArgument(LocalField t){
		for(LocalField f: argumentList){
			if(f.getName().equals(t.getName())){
				return false;
			}
		}
		argumentList.add(t);
		return true;
	}
	
	public List<LocalField> getArgumentList(){
		return argumentList;
	}
	
	public String toString(){
		String line = super.getParentClass().getPrintName() + "constr_";
		for(int i = 0; i < argumentList.size();i++){
			if(i == argumentList.size() - 1){
				line += argumentList.get(i).getType();
			}else{
				line += argumentList.get(i).getType()+"_";
			}
		}
		return line;
	}
}
