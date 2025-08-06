import org.antlr.v4.runtime.*;
import java.io.File;
import java.io.FileInputStream;

public class ParserTest {
    public static void parseHelper(String file) throws Exception {
        FileInputStream in = new FileInputStream(file);
        CharStream input = CharStreams.fromStream(in);
        DSLLexer lexer  = new DSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(tokens);
        parser.program();
    }

    public static void runAllTests() throws Exception {
        int delay = 50;

        File validDir = new File("tests/valid/");
        File[] validFiles = validDir.listFiles();
        if (validFiles != null) {
            for (File file : validFiles) {
                System.out.println("Testing File (Valid Input): " + file.getName());
                parseHelper(file.getPath());
                Thread.sleep(delay);
                System.out.println("Done: Expect No Error.\n");
            }
        }

        File invalidDir = new File("tests/invalid/");
        File[] invalidFiles = invalidDir.listFiles();
        if (invalidFiles != null) {
            for (File file : invalidFiles) {
                System.out.println("Testing File (Invalid Input): " + file.getPath());
                parseHelper(file.getPath());
                Thread.sleep(delay);
                System.out.println("Done: Expect Error Above.\n");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        runAllTests();
    }
}