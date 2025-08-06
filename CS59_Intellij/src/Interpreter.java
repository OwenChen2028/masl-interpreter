import org.antlr.v4.runtime.*;

import java.io.FileInputStream;

public class Interpreter {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("tests/valid/otherbehav.dsl");
        CharStream input = CharStreams.fromStream(in);
        DSLLexer lexer  = new DSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(tokens);

        DSLParser.ProgramContext tree = parser.program();
        Translator translator = new Translator();
        translator.visitProgram(tree);
    }
}