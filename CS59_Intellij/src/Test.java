import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("tests/program3.dsl");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        DSLLexer lexer = new DSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(tokens);
        ParseTree tree = parser.parse(); // parse the input stream!
    };
}