import org.antlr.v4.runtime.*;

import java.io.FileInputStream;

public class Interpreter {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream(args[0]);
        CharStream input = CharStreams.fromStream(in);
        DSLLexer lexer  = new DSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(tokens);

        try {
            DSLParser.ProgramContext tree = parser.program();
            Translator translator = new Translator();
            translator.visitProgram(tree);
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}