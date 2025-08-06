import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Translator implements DSLVisitor<Integer> {

    @Override
    public Integer visitParse(DSLParser.ParseContext ctx) {
        return null;
    }

    @Override
    public Integer visitStatement(DSLParser.StatementContext ctx) {
        return null;
    }

    @Override
    public Integer visitDeclaration(DSLParser.DeclarationContext ctx) {
        return null;
    }

    @Override
    public Integer visitNumDec(DSLParser.NumDecContext ctx) {
        return null;
    }

    @Override
    public Integer visitListDec(DSLParser.ListDecContext ctx) {
        return null;
    }

    @Override
    public Integer visitOperation(DSLParser.OperationContext ctx) {
        return null;
    }

    @Override
    public Integer visitNumOp(DSLParser.NumOpContext ctx) {
        return null;
    }

    @Override
    public Integer visitListOp(DSLParser.ListOpContext ctx) {
        return null;
    }

    @Override
    public Integer visitTemplateDec(DSLParser.TemplateDecContext ctx) {
        return null;
    }

    @Override
    public Integer visitConditional(DSLParser.ConditionalContext ctx) {
        return null;
    }

    @Override
    public Integer visitLoop(DSLParser.LoopContext ctx) {
        return null;
    }

    @Override
    public Integer visitGenStmt(DSLParser.GenStmtContext ctx) {
        return null;
    }

    @Override
    public Integer visitIoStmt(DSLParser.IoStmtContext ctx) {
        return null;
    }

    @Override
    public Integer visitExpression(DSLParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Integer visitPossibleNum(DSLParser.PossibleNumContext ctx) {
        return null;
    }

    @Override
    public Integer visitPossibleStr(DSLParser.PossibleStrContext ctx) {
        return null;
    }

    @Override
    public Integer visitContent(DSLParser.ContentContext ctx) {
        return null;
    }

    @Override
    public Integer visitSubstitution(DSLParser.SubstitutionContext ctx) {
        return null;
    }

    @Override
    public Integer visitIndexedID(DSLParser.IndexedIDContext ctx) {
        return null;
    }

    @Override
    public Integer visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Integer visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Integer visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Integer visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
