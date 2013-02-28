package de.timoh.galaxyxparser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import de.timoh.galaxyxparser.GalaxyXParser.translation_unit_return;
import de.timoh.galaxyxparser.structures.Constructor;
import de.timoh.galaxyxparser.structures.Destructor;
import de.timoh.galaxyxparser.structures.Field;
import de.timoh.galaxyxparser.structures.LocalField;
import de.timoh.galaxyxparser.structures.Method;
import de.timoh.galaxyxparser.typechecking.Type;
import de.timoh.galaxyxparser.structures.Class;

public class Main {

    /*
     * .galx  = GalaxyX file
     * .galxh = GalaxyX-Header file
     */
    /**
     * @param args
     * @throws RecognitionException 
     */
    //Public Stuff needed
    public static SymbolTable table = new SymbolTable();
    public static List<String> outputList = new ArrayList<String>();
    private static boolean fileNotFound;
    //End

    public static void main(String[] args) throws RecognitionException {
        /*if(args.length < 1){
        System.err.println("Error: No arguments");
        return;
        }
        String text = loadFile(args[0]);
        if(fileNotFound){
        System.err.println("Error: No such file");
        return;
        }*/
        CharStream charStream = new ANTLRStringStream("namespace Test:\n"
                + "class TestClass:\n"
                + "constructor(int i, string s):\n"
                + "end constructor\n"
                + "destructor (bool b):\n"
                + "end destructor\n"
                + "end class\n"
                + ""
                + "end namespace\n");
        GalaxyXLexer lexer = new GalaxyXLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        GalaxyXParser parser = new GalaxyXParser(tokenStream);
        translation_unit_return evaluator = parser.translation_unit();
        CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(evaluator.tree);
        GalaxyXWalker walker = new GalaxyXWalker(nodeStream);
        walker.evaluator();
        for (String s : outputList) {
            System.out.println(s);
        }
    }

    private static String includePreprocess(String content) {
        return "";
    }

    private static void includeDefinitions(String gxhPath) {
    }

    private static String replaceDefinitions(String content) {
        return "";
    }

    private static String loadFile(String path) {
        BufferedReader br = null;
        String line = null;
        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                line += System.getProperty("line.separator");
                sb.append(line);
            }
        } catch (FileNotFoundException e) {
            fileNotFound = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    //Here are the methods used to generate an output
    public static void addVar(String line, Type t, String asgn) {
        if (asgn.isEmpty()) {
            outputList.add(t + " " + line + ";");
        } else {
            outputList.add(t + " " + line + " =" + asgn + ";");
        }
    }
    //TODO INTELLIGENT IMPLIMENTIEREN (CALL VON MAIN METHODE?)

    public static void addClassVars(Class c) {
        Collection<Field> col = c.getFields();
        String prefix = c.getNamespace() + "_";
        if (c.isPublic()) {
            prefix += "pub_";
        } else if (c.isPrivate()) {
            prefix += "pri_";
        }
        prefix += c + "_";
        outputList.add("void " + prefix + "init_vars(){");
        outputList.add("\t int i = 0;");
        outputList.add("\t for(;i < " + c.getInstanceCount() + ";i+=1){");
        for (Field f : col) {
            if (!f.getAsgn().isEmpty() && !f.isArray()) {
                outputList.add("\t\t" + prefix + f.getPrintName() + "[i] =" + f.getAsgn() + ";");
            }
        }
        outputList.add("\t}");
        outputList.add("}");

    }

    public static void addLocalVar(LocalField f, String asgn) {
        if (asgn.isEmpty()) {
            outputList.add(f.getType() + " " + f.getName() + ";");
        } else {
            outputList.add(f.getType() + " " + f.getName() + " =" + asgn + ";");
        }
    }

    public static void addLocalArrayVar(LocalField f, List<String> expr) {
        String out = f.getType() + " ";
        for (int i = 0; i < f.getDimCount(); i++) {
            out += "[" + expr.get(i) + "]";
        }
        out += f.getName() + ";";
        outputList.add(out);
    }

    public static void addArrayVar(String line, Type t, int dim, List<String> expr) {
        String out = t + " ";
        for (int i = 0; i < dim; i++) {
            out += "[" + expr.get(i) + "]";
        }
        out += line + ";";
        outputList.add(out);
    }

    public static void openFunction(Method m) {
        outputList.add(m.returnType + " " + m + "(");
    }

    public static void addFunctionParameter(LocalField f, boolean last) {
        String s = outputList.get(outputList.size() - 1);
        if (last) {
            s += f.getType() + " " + f.getName();
        } else {
            s += f.getType() + " " + f.getName() + ",";
        }
        outputList.remove(outputList.size() - 1);
        outputList.add(s);
    }

    public static void endFunctionParameter() {
        String s = outputList.get(outputList.size() - 1);
        s += "){";
        outputList.remove(outputList.size() - 1);
        outputList.add(s);
    }

    public static void closeBlock() {
        outputList.add("}");
    }

    //Generate Presets
    public static void openConstructor(Constructor c) {
        outputList.add(c.getParentClass() + " " + c + "(");
        for (int i = 0; i < c.getArgumentList().size(); i++) {
            if (i == c.getArgumentList().size() - 1) {
                addFunctionParameter(c.getArgumentList().get(i), true);
            } else {
                addFunctionParameter(c.getArgumentList().get(i), false);
            }
        }
        endFunctionParameter();
        outputList.add("\t" + c.getParentClass() + " this = " + c.getParentClass().getPrintName() + "allocate_pointer();");
    }

    public static void closeConstructor() {
        outputList.add("\treturn this;");
        outputList.add("}");
    }

    public static void addDefaultConstructor(Class c) {
        outputList.add(c + " " + c.getPrintName() + "constr_default(){");
        outputList.add("\t return " + c.getPrintName() + "allocate_pointer();");
        outputList.add("}");
    }

    public static void openDestructor(Destructor d) {
        if (d.getArgumentList().size() > 0) {
            outputList.add("void " + d + "(" + d.getParentClass() + " this,");
        } else {
            outputList.add("void " + d + "(" + d.getParentClass() + " this");
        }
        for (int i = 0; i < d.getArgumentList().size(); i++) {
            if (i == d.getArgumentList().size() - 1) {
                addFunctionParameter(d.getArgumentList().get(i), true);
            } else {
                addFunctionParameter(d.getArgumentList().get(i), false);
            }
        }
        endFunctionParameter();
    }

    public static void closeDestructor(Class c) {
        outputList.add("\t" + c.getPrintName() + "deallocate_pointer(this);");
        outputList.add("}");
    }

    public static void addDefaultDestructor(Class c) {
        outputList.add("void " + c.getPrintName() + "destr_default(" + c + " this){");
        outputList.add("\t" + c.getPrintName() + "deallocate_pointer(this);");
        outputList.add("}");
    }

    public static void createStandardClassFunctions(Class c) {
        String prefix = c.getNamespace() + "_";
        if (c.isPublic()) {
            prefix += "pub_";
        } else if (c.isPrivate()) {
            prefix += "pri_";
        }
        prefix += c + "_";
        outputList.add("typedef int " + c + ";");
        outputList.add("bool [" + c.getInstanceCount() + "] " + prefix + "pointer;");
        outputList.add(c + " " + prefix + "allocate_pointer(){");
        outputList.add("\tint i = 0;");
        outputList.add("\tfor(;i < " + c.getInstanceCount() + "; i+=1){");
        outputList.add("\t\tif(!" + prefix + "pointer[i]){");
        outputList.add("\t\t\t" + prefix + "pointer[i] = true;");
        outputList.add("\t\t\treturn i;");
        outputList.add("\t\t}");
        outputList.add("\t}");
        outputList.add("\treturn -1;");
        outputList.add("}");
        outputList.add("void " + prefix + "deallocate_pointer(" + c + " i){");
        outputList.add("\t" + prefix + "pointer[i] = false;");
        outputList.add("}");
    }
}
