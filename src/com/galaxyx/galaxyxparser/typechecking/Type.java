package com.galaxyx.galaxyxparser.typechecking;

import java.util.ArrayList;

import com.galaxyx.galaxyxparser.Main;
import com.galaxyx.galaxyxparser.structures.Namespace;


public class Type {
	private String name = "";
	private boolean array = false;
	
	public static final Type
		Boolean = new Type("bool",false,false,new Type("boolarray",true,false,null))
	,	Byte = new Type("byte",false,false,new Type("bytearray",true,false,null))
	,	Char = new Type("char",false,false,new Type("chararray",true,false,null))
	,	Fixed = new Type("fixed",false,false,new Type("fixedarray",true,false,null))
	,	Gamelink = new Type("gamelink",false,true,new Type("gamelinkarray",true,false,null))
	,	Color = new Type("color",false,true,new Type("colorarray",true,false,null))
	,	Integer = new Type("int",false,false,new Type("intarray",true,false,null))
	,	Point = new Type("point",false,true,new Type("pointarray",true,false,null))
	,	String = new Type("string",false,true,new Type("stringarray",true,false,null))
	,	Abilcmd = new Type("abilcmd",false,true,new Type("abilcmdarray",true,false,null))
	,	Actor = new Type("actor",false,true,new Type("actorarray",true,false,null))
	,	Actorscope = new Type("actorscope",false,true,new Type("actorscopearray",true,false,null))
	,	Bank = new Type("bank",false,true,new Type("bankarray",true,false,null))
	,	Camerainfo = new Type("camerainfo",false,true,new Type("camerainfoarray",true,false,null))
	,	Marker = new Type("marker",false,true,new Type("markerarray",true,false,null))
	,	Order = new Type("order",false,true,new Type("orderarray",true,false,null))
	,	Playergroup = new Type("playergroup",false,true,new Type("playergrouparray",true,false,null))
	,	Region = new Type("region",false,true,new Type("regionarray",true,false,null))
	,	Revealer = new Type("revealer",false,true,new Type("revealerarray",true,false,null))
	,	Soundlink = new Type("soundlink",false,true,new Type("soundlinkarray",true,false,null))
	,	Text = new Type("text",false,true,new Type("textarray",true,false,null))
	,	Timer = new Type("timer",false,true,new Type("timerarray",true,false,null))
	,	Transmissionsource = new Type("transmissionsource",false,true,new Type("transmissionsourcearray",true,false,null))
	,	Trigger = new Type("trigger",false,true,new Type("triggerarray",true,false,null))
	,	Unitfilter = new Type("unitfilter",false,true,new Type("unitfilterarray",true,false,null))
	,	Unitgroup = new Type("unitgroup",false,true,new Type("unitgrouparray",true,false,null))
	,	Unitref = new Type("unitref",false,true,new Type("unitrefarray",true,false,null))
	,	Unit = new Type("unit",false,true,new Type("unitarray",true,false,null))
	,	Waveinfo = new Type("waveinfo",false,true,new Type("waveinfoarray",true,false,null))
	,	Wavetarget = new Type("wavetarget",false,true,new Type("wavetargetarray",true,false,null))
	,	Doodad = new Type("doodad",false,true,new Type("doodadarray",true,false,null))
	,	AIFilter = new Type("aifilter",false,true,new Type("aifilterarray",true,false,null))
	,	Sound = new Type("sound",false,true,new Type("soundarray",true,false,null))
	,	Wave = new Type("wave",false,true,new Type("wavearray",true,false,null))
	,	Null = new Type("null",false,false,null)
	,   Void = new Type("void",false,false,null);
	;
	
	public final Type Array;
	private boolean isNullable = false;
	private boolean isClass = false;
	private boolean isCustom = false;
	
	private static ArrayList<Type> customTypes = new ArrayList<Type>();
	
	public Type(String name, boolean array,boolean nullable, Type arrayType){
		this.name = name;
		this.array = array;
		this.Array = arrayType;
		this.isNullable = nullable;
	}
	
	public Type typedef;
	
	public Type(String name, boolean array,boolean nullable, Type arrayType, Type typedef, boolean isClass){
		this.name = name;
		this.array = array;
		this.Array = arrayType;
		this.typedef = typedef;
		this.isNullable = nullable;
		this.isClass = isClass;
	}
	
	public static Type TypeCustomTemplate(String name){
		Type t = new Type(name,false,false,null);
		t.isCustom = true;
		return t;
	}
	
	public static Type TypeCustom(String name, Type typedef, boolean isClass){
		Type t = new Type(name,false,true,new Type(name+"array",true,false,null), typedef, isClass);
		customTypes.add(t);
		return t;
	}
	
	//Use this only for classes
	public static void addCustomType(String name){
		Type t = new Type(name, false, false,new Type(name+"array",true,false,null));
		customTypes.add(t);
	}
	
	public static boolean isCustomType(String name){
		for(Type t : customTypes){
			if(t.toString().equals(name))return true;
		}
		return false;
	}
	
	public static Type getCustomType(String name){
		for(Type t : customTypes){
			if(t.toString().equals(name)){
				if(t.typedef != null)return t.typedef;
				return t;
			}
		}
		return null;
	}
	
	public static boolean customTypeExists(String name){
		return getCustomType(name) != null;
	}
	
	public Type getType(){
		if(name.equals("bool")){
			return Type.Boolean;
		}else if(name.equals("byte")){
			return Type.Byte;
		}else if(name.equals("char")){
			return Type.Char;
		}else if(name.equals("fixed")){
			return Type.Fixed;
		}else if(name.equals("gamelink")){
			return Type.Gamelink;
		}else if(name.equals("color")){
			return Type.Color;
		}else if(name.equals("int")){
			return Type.Integer;
		}else if(name.equals("point")){
			return Type.Point;
		}else if(name.equals("string")){
			return Type.String;
		}else if(name.equals("abilcmd")){
			return Type.Abilcmd;
		}else if(name.equals("actor")){
			return Type.Actor;
		}else if(name.equals("actorscope")){
			return Type.Actorscope;
		}else if(name.equals("bank")){
			return Type.Bank;
		}else if(name.equals("camerainfo")){
			return Type.Camerainfo;
		}else if(name.equals("marker")){
			return Type.Marker;
		}else if(name.equals("order")){
			return Type.Order;
		}else if(name.equals("playergroup")){
			return Type.Playergroup;
		}else if(name.equals("region")){
			return Type.Region;
		}else if(name.equals("revealer")){
			return Type.Revealer;
		}else if(name.equals("soundlink")){
			return Type.Soundlink;
		}else if(name.equals("text")){
			return Type.Text;
		}else if(name.equals("timer")){
			return Type.Timer;
		}else if(name.equals("transmissionsource")){
			return Type.Transmissionsource;
		}else if(name.equals("trigger")){
			return Type.Trigger;
		}else if(name.equals("unitfilter")){
			return Type.Unitfilter;
		}else if(name.equals("unitgroup")){
			return Type.Unitgroup;
		}else if(name.equals("unitref")){
			return Type.Unitref;
		}else if(name.equals("unit")){
			return Type.Unit;
		}else if(name.equals("waveinfo")){
			return Type.Waveinfo;
		}else if(name.equals("wavetarget")){
			return Type.Wavetarget;
		}else if(name.equals("doodad")){
			return Type.Doodad;
		}else if(name.equals("aifilter")){
			return Type.AIFilter;
		}else if(name.equals("sound")){
			return Type.Sound;
		}else if(name.equals("wave")){
			return Type.Wave;
		}else if(name.equals("null")){
			return Type.Transmissionsource;
		}
		return getCustomType(name);
	}
	
	public static boolean numeric(Type t){
		return t == Type.Char || t == Type.Integer || t == Type.Fixed;
	}
	
	public static Type max(Type p1, Type p2) {
		if (!numeric(p1) || !numeric(p2)) return null;
		else if (p1 == Type.Fixed || p2 == Type.Fixed) return Type.Fixed;
		else if (p1 == Type.Integer || p2 == Type.Integer) return Type.Integer;
		else return Type.Char;
	}
	
	public static boolean checkAssign(Type p1, Type p2){
		if(p1 == null || p2 == null){return false;}
		if(p1 == Type.Fixed && p2 == Type.Integer) return true;
		if(p1 == p2)return true;
		return false;
	}
	
	public static boolean checkAssignString(String p1, String p2){
		if(p1 == null || p2 == null){return false;}
		if(p1.equals(Type.Fixed.toString()) && p2.equals(Type.Integer.toString())) return false;
		if(!p1.equals(p2))return true;
		return false;
	}
	
	public static boolean checkPlusAssign(Type p1, Type p2){
		if(p1 == null || p2 == null){return false;}
		if(p1 == Type.Fixed && p2 == Type.Integer) return false;
		if(p1 == Type.Fixed && p2 == Type.Fixed) return false;
		if(p1 == Type.Integer && p2 == Type.Integer) return false;
		if(p1 == Type.String && p2 == Type.String) return false;
		return true;
	}
	
	public static boolean checkPlusAssignString(String p1, String p2){
		if(p1 == null || p2 == null){return false;}
		if(p1.equals(Type.Fixed.toString()) && p2.equals(Type.Integer.toString())) return false;
		if(p1.equals(Type.Fixed.toString()) && p2.equals(Type.Fixed.toString())) return false;
		if(p1.equals(Type.Integer.toString()) && p2.equals(Type.Integer.toString())) return false;
		if(p1.equals(Type.String.toString()) && p2.equals(Type.String.toString())) return false;
		return true;
	}
	
	public static boolean checkMathAssign(Type p1, Type p2){
		if(p1 == null || p2 == null){return false;}
		if(p1 == Type.Fixed && p2 == Type.Integer) return false;
		if(p1 == Type.Fixed && p2 == Type.Fixed) return false;
		if(p1 == Type.Integer && p2 == Type.Integer) return false;
		return true;
	}
	
	public static boolean checkMathAssignString(String p1, String p2){
		if(p1 == null || p2 == null){return false;}
		if(p1.equals(Type.Fixed.toString()) && p2.equals(Type.Integer.toString())) return false;
		if(p1.equals(Type.Fixed.toString()) && p2.equals(Type.Fixed.toString())) return false;
		if(p1.equals(Type.Integer.toString()) && p2.equals(Type.Integer.toString())) return false;
		return true;
	}
	
	public boolean isClass(){
		return isClass;
	}
	
	public boolean isArray(){
		return array;
	}
	
	public boolean isNullable(){
		return this.isNullable;
	}
	
	public String toString(){
		return name;
	}
}
