
package com.galaxyx.semantic;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Timo Hanisch (timohanisch@gmail.com)
 */
public class Type {
    private static Map<String, Type> customTypes = new HashMap<String, Type>();
    
    public static final byte NATIVE = 0x00;
    public static final byte CUSTOM = 0x01;
    public static final Type Boolean = new Type("bool", NATIVE), 
                             Byte = new Type("byte", NATIVE), 
                             Char = new Type("char", NATIVE), 
                             Fixed = new Type("fixed", NATIVE), 
                             Gamelink = new Type("gamelink", NATIVE), 
                             Color = new Type("color", NATIVE), 
                             Integer = new Type("int", NATIVE), 
                             Point = new Type("point", NATIVE), 
                             String = new Type("string", NATIVE), 
                             Abilcmd = new Type("abilcmd", NATIVE), 
                             Actor = new Type("actor", NATIVE), 
                             Actorscope = new Type("actorscope", NATIVE), 
                             Bank = new Type("bank", NATIVE), 
                             Camerainfo = new Type("camerainfo", NATIVE), 
                             Marker = new Type("marker", NATIVE), 
                             Order = new Type("order", NATIVE), 
                             Playergroup = new Type("playergroup", NATIVE), 
                             Region = new Type("region", NATIVE), 
                             Revealer = new Type("revealer", NATIVE), 
                             Soundlink = new Type("soundlink", NATIVE), 
                             Text = new Type("text", NATIVE), 
                             Timer = new Type("timer", NATIVE), 
                             Transmissionsource = new Type("transmissionsource", NATIVE), 
                             Trigger = new Type("trigger", NATIVE), 
                             Unitfilter = new Type("unitfilter", NATIVE), 
                             Unitgroup = new Type("unitgroup", NATIVE), 
                             Unitref = new Type("unitref", NATIVE), 
                             Unit = new Type("unit", NATIVE), 
                             Waveinfo = new Type("waveinfo", NATIVE), 
                             Wavetarget = new Type("wavetarget", NATIVE), 
                             Doodad = new Type("doodad", NATIVE), 
                             AIFilter = new Type("aifilter", NATIVE), 
                             Sound = new Type("sound", NATIVE), 
                             Wave = new Type("wave", NATIVE), 
                             Void = new Type("void", NATIVE),
                             Null = new Type("null", NATIVE);
    ;
    private String name;
    private byte group;
    
    public Type(String name, byte group){
        this.name = name;
        this.group = group;
    }
    
    public static boolean addCustomType(Type t){
        if(t.group == NATIVE){
            return false;
        }
        if(customTypes.containsKey(t.toString())){
            return false;
        }
        customTypes.put(t.toString(), t);
        return true;
    }
    
    public static Type getType(String name){
        if (name.equals("bool")) {
            return Type.Boolean;
        } else if (name.equals("byte")) {
            return Type.Byte;
        } else if (name.equals("char")) {
            return Type.Char;
        } else if (name.equals("fixed")) {
            return Type.Fixed;
        } else if (name.equals("gamelink")) {
            return Type.Gamelink;
        } else if (name.equals("color")) {
            return Type.Color;
        } else if (name.equals("int")) {
            return Type.Integer;
        } else if (name.equals("point")) {
            return Type.Point;
        } else if (name.equals("string")) {
            return Type.String;
        } else if (name.equals("abilcmd")) {
            return Type.Abilcmd;
        } else if (name.equals("actor")) {
            return Type.Actor;
        } else if (name.equals("actorscope")) {
            return Type.Actorscope;
        } else if (name.equals("bank")) {
            return Type.Bank;
        } else if (name.equals("camerainfo")) {
            return Type.Camerainfo;
        } else if (name.equals("marker")) {
            return Type.Marker;
        } else if (name.equals("order")) {
            return Type.Order;
        } else if (name.equals("playergroup")) {
            return Type.Playergroup;
        } else if (name.equals("region")) {
            return Type.Region;
        } else if (name.equals("revealer")) {
            return Type.Revealer;
        } else if (name.equals("soundlink")) {
            return Type.Soundlink;
        } else if (name.equals("text")) {
            return Type.Text;
        } else if (name.equals("timer")) {
            return Type.Timer;
        } else if (name.equals("transmissionsource")) {
            return Type.Transmissionsource;
        } else if (name.equals("trigger")) {
            return Type.Trigger;
        } else if (name.equals("unitfilter")) {
            return Type.Unitfilter;
        } else if (name.equals("unitgroup")) {
            return Type.Unitgroup;
        } else if (name.equals("unitref")) {
            return Type.Unitref;
        } else if (name.equals("unit")) {
            return Type.Unit;
        } else if (name.equals("waveinfo")) {
            return Type.Waveinfo;
        } else if (name.equals("wavetarget")) {
            return Type.Wavetarget;
        } else if (name.equals("doodad")) {
            return Type.Doodad;
        } else if (name.equals("aifilter")) {
            return Type.AIFilter;
        } else if (name.equals("sound")) {
            return Type.Sound;
        } else if (name.equals("wave")) {
            return Type.Wave;
        }
        return customTypes.get(name);
    }

    public static Type max(Type p1, Type p2) {
        if (!numeric(p1) || !numeric(p2)) {
            return null;
        } else if (p1 == Type.Fixed || p2 == Type.Fixed) {
            return Type.Fixed;
        } else if (p1 == Type.Integer || p2 == Type.Integer) {
            return Type.Integer;
        } else {
            return Type.Char;
        }
    }

    public static boolean checkAssign(Type p1, Type p2) {
        if (p1 == null || p2 == null) {
            return false;
        }
        return (p1 == Type.Fixed && p2 == Type.Integer || p1 == p2 || p1 == Type.String && p2.group == CUSTOM || p2 == Type.String && p1.group == CUSTOM);
    }

    public static boolean checkPlusAssign(Type p1, Type p2) {
        if (p1 == null || p2 == null) {
            return false;
        }
        return p1 == Type.Fixed && p2 == Type.Integer || p1 == Type.Fixed && p2 == Type.Fixed || p1 == Type.Integer && p2 == Type.Integer || p1 == Type.String && p2 == Type.String;
    }

    public static boolean checkMathAssign(Type p1, Type p2) {
        if (p1 == null || p2 == null) {
            return false;
        }
        return p1 == Type.Fixed && p2 == Type.Integer || p1 == Type.Fixed && p2 == Type.Fixed || p1 == Type.Integer && p2 == Type.Integer;
    }

    public static boolean numeric(Type t) {
        return t == Type.Char || t == Type.Integer || t == Type.Fixed;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
