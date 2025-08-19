import org.antlr.v4.runtime.*;

import java.io.FileInputStream;

public class Interpreter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: no input file provided.");
            return;
        }

        try {
            FileInputStream in = new FileInputStream(args[0]);
            CharStream input = CharStreams.fromStream(in);
            DSLLexer lexer  = new DSLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DSLParser parser = new DSLParser(tokens);
            DSLParser.StartContext tree = parser.start();
            Translator translator = new Translator();
            translator.visitStart(tree);
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}