import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void parseHelper(String file) throws Exception {
        FileInputStream in = new FileInputStream(file);
        CharStream input = CharStreams.fromStream(in);
        DSLLexer lexer  = new DSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(tokens);
        parser.parse();
    }

    public static void main(String[] args) throws Exception {
        File validDir = new File("tests/valid/");
        File[] validFiles = validDir.listFiles();
        if (validFiles != null) {
            for (File file : validFiles) {
                System.out.println("Testing File (Valid Input): " + file.getName());
                parseHelper(file.getPath());
                Thread.sleep(10);
                System.out.println("Done: Expect No Error.\n");
            }
        }

        File invalidDir = new File("tests/invalid/");
        File[] invalidFiles = invalidDir.listFiles();
        if (invalidFiles != null) {
            for (File file : invalidFiles) {
                System.out.println("Testing File (Invalid Input): " + file.getPath());
                parseHelper(file.getPath());
                Thread.sleep(10);
                System.out.println("Done: Expect Error Above.\n");
            }
        }
    };
}