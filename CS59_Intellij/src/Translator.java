import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class Translator implements DSLVisitor<Integer> {
    HashMap<String, Integer> numIds = new HashMap<>();
    HashMap<String, List<String>> listIds = new HashMap<>();
    HashMap<String, DSLParser.ContentContext> templateIds = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    @Override
    public Integer visitProgram(DSLParser.ProgramContext ctx) {
        for (DSLParser.StatementContext stmtCtx : ctx.statement()) {
            visitStatement(stmtCtx);
        }
        return null;
    }

    @Override
    public Integer visitStatement(DSLParser.StatementContext ctx) {
        if (ctx.declaration() != null) {
            visitDeclaration(ctx.declaration());
        }
        else if (ctx.operation() != null) {
            visitOperation(ctx.operation());
        }
        else if (ctx.conditional() != null) {
            visitConditional(ctx.conditional());
        }
        else if (ctx.loop() != null) {
            visitLoop(ctx.loop());
        }
        else if (ctx.genStmt() != null) {
            visitGenStmt(ctx.genStmt());
        }
        else if (ctx.ioStmt() != null) {
            visitIoStmt(ctx.ioStmt());
        }
        return null;
    }

    @Override
    public Integer visitDeclaration(DSLParser.DeclarationContext ctx) {
        if (ctx.numDec() != null) {
            visitNumDec(ctx.numDec());
        }
        else if (ctx.listDec() != null) {
            visitListDec(ctx.listDec());
        }
        else if (ctx.templateDec() != null) {
            visitTemplateDec(ctx.templateDec());
        }
        return null;
    }

    @Override
    public Integer visitNumDec(DSLParser.NumDecContext ctx) {
        String numId = ctx.ID().getText();
        Integer exprResult = visitExpression(ctx.expression());

        if (exprResult != null) {
            if (listIds.containsKey(numId) || templateIds.containsKey(numId)) {
                throw new RuntimeException(String.format("\"%s\" is already defined with a different type", numId));
            }
            else {
                numIds.put(numId, exprResult);
            }
        }
        else {
            throw new RuntimeException(String.format("initializer for \"%s\" evaluated to null (expected an integer)", numId));
        }

        return null;
    }

    @Override
    public Integer visitListDec(DSLParser.ListDecContext ctx) {
        String listId = ctx.ID().getText();
        List<String> strList = new ArrayList<>();

        for (DSLParser.PossibleStrContext strCtx : ctx.possibleStr()) {
            visitPossibleStr(strCtx);
            if (possibleStrResult != null) {
                strList.add(possibleStrResult);
            }
            else {
                throw new RuntimeException(String.format("initializer for an element in \"%s\" evaluated to null (expected a string)", listId));
            }
        }


        if (numIds.containsKey(listId) || templateIds.containsKey(listId)) {
            throw new RuntimeException(String.format("\"%s\" is already defined with a different type", listId));
        }
        else {
            listIds.put(listId, strList);
        }

        return null;
    }

    @Override
    public Integer visitOperation(DSLParser.OperationContext ctx) {
        if (ctx.numOp() != null) {
            visitNumOp(ctx.numOp());
        }
        else if (ctx.listOp() != null) {
            visitListOp(ctx.listOp());
        }
        return null;
    }

    @Override
    public Integer visitNumOp(DSLParser.NumOpContext ctx) {
        if (ctx.incOp() != null) {
            visitIncOp(ctx.incOp());
        }
        else if (ctx.decOp() != null) {
            visitDecOp(ctx.decOp());
        }
        return null;
    }

    @Override
    public Integer visitIncOp(DSLParser.IncOpContext ctx) {
        String numID = ctx.ID().getText();
        if (numIds.containsKey(numID)) {
            numIds.put(numID, numIds.get(numID) + 1);
        }
        else {
            throw new RuntimeException(String.format("no numeric variable named \"%s\" has been declared", numID));
        }
        return null;
    }

    @Override
    public Integer visitDecOp(DSLParser.DecOpContext ctx) {
        String numID = ctx.ID().getText();
        if (numIds.containsKey(numID)) {
            numIds.put(numID, numIds.get(numID) - 1);
        }
        else {
            throw new RuntimeException(String.format("no numeric variable named \"%s\" has been declared", numID));
        }
        return null;
    }

    @Override
    public Integer visitListOp(DSLParser.ListOpContext ctx) {
        if (ctx.setOp() != null) {
            visitSetOp(ctx.setOp());
        }
        else if (ctx.randOp() != null) {
            visitRandOp(ctx.randOp());
        }
        return null;
    }

    @Override
    public Integer visitSetOp(DSLParser.SetOpContext ctx) {
        String listId = ctx.ID().getText();
        if (listIds.containsKey(listId)) {
            Integer listIndex = visitExpression(ctx.expression());
            if (listIndex == null) {
                throw new RuntimeException(String.format("index for \"%s\" evaluated to null (expected a 1-based integer)", listId));
            }
            else if (listIndex >= 1 && listIndex <= listIds.get(listId).size()) {
                visitPossibleStr(ctx.possibleStr());
                if (possibleStrResult != null) {
                    listIds.get(listId).set(listIndex - 1, possibleStrResult);
                }
                else {
                    throw new RuntimeException(String.format("assignment to \"%s[%d]\" evaluated to null (lists cannot store null strings)", listId, listIndex));
                }
            }
            else {
                throw new RuntimeException(String.format("index %d is out of bounds (valid range for \"%s\" is 1 to %d)", listIndex, listId, listIds.get(listId).size()));
            }
        }
        else {
            throw new RuntimeException(String.format("no list named \"%s\" has been declared", listId));
        }
        return null;
    }

    @Override
    public Integer visitRandOp(DSLParser.RandOpContext ctx) {
        String listId = ctx.ID().getText();
        if (listIds.containsKey(listId)) {
            Collections.shuffle(listIds.get(listId));
        }
        else {
            throw new RuntimeException(String.format("no list named \"%s\" has been declared", listId));
        }
        return null;
    }

    @Override
    public Integer visitTemplateDec(DSLParser.TemplateDecContext ctx) {
        String templateId = ctx.ID().getText();
        if (numIds.containsKey(templateId) || listIds.containsKey(templateId)) {
            throw new RuntimeException(String.format("\"%s\" is already defined with a different type", templateId));
        }
        else {
            templateIds.put(templateId, ctx.content());
        }
        return null;
    }

    @Override
    public Integer visitConditional(DSLParser.ConditionalContext ctx) {
        Integer exprResult = visitExpression(ctx.expression());
        if (exprResult == null) {
            throw new RuntimeException("condition in check block evaluated to null (expected 0 or 1)");
        }
        else if (exprResult == 1) { // true
            for (DSLParser.StatementContext stmtCtx : ctx.statement()) {
                visitStatement(stmtCtx);
            }
        }
        else if (exprResult != 0) { // not true or false
            throw new RuntimeException(String.format("condition in check block evaluated to %d (expected 0 or 1)", exprResult));
        }
        return null;
    }

    @Override
    public Integer visitLoop(DSLParser.LoopContext ctx) {
        if (ctx.repeatLoop() != null) {
            visitRepeatLoop(ctx.repeatLoop());
        }
        else if (ctx.whileLoop() != null) {
            visitWhileLoop(ctx.whileLoop());
        }
        return null;
    }

    @Override
    public Integer visitRepeatLoop(DSLParser.RepeatLoopContext ctx) {
        Integer exprResult = visitExpression(ctx.expression());
        if (exprResult == null) {
            throw new RuntimeException("repeat loop count evaluated to null (expected ≥ 0)");
        }
        else if (exprResult >= 0) {
            for (int i = 0; i < exprResult; i++) {
                for (DSLParser.StatementContext stmtCtx : ctx.statement()) {
                    visitStatement(stmtCtx);
                }
            }
        }
        else {
            throw new RuntimeException(String.format("repeat loop count is %d (expected ≥ 0)", exprResult));
        }
        return null;
    }

    @Override
    public Integer visitWhileLoop(DSLParser.WhileLoopContext ctx) {
        int iter = 0;
        Integer exprResult;
        while (true) {
            exprResult = visitExpression(ctx.expression());
            if (exprResult == null) {
                throw new RuntimeException("while condition evaluated to null (expected 0 or 1)");
            }
            else if (exprResult == 0) {
                break;
            }
            else if (exprResult == 1) {
                if (iter >= 1000) {
                    throw new RuntimeException("while loop exceeded 1000 iterations (possible infinite loop)");
                }
                for (DSLParser.StatementContext stmtCtx : ctx.statement()) {
                    visitStatement(stmtCtx);
                }
                iter++;
            }
            else {
                throw new RuntimeException(String.format("while condition evaluated to %d (expected 0 or 1)", exprResult));
            }
        }
        return null;
    }

    @Override
    public Integer visitGenStmt(DSLParser.GenStmtContext ctx) {
        String templateId = ctx.ID().getText();
        if (templateIds.containsKey(templateId)) {
            visitContent(templateIds.get(templateId));
            if (contentResult != null) {
                System.out.println(contentResult);
            }
            else {
                throw new RuntimeException(String.format("template \"%s\" produced null content (check placeholders)", templateId));
            }
        }
        else {
            throw new RuntimeException(String.format("no template named \"%s\" has been declared", templateId));
        }
        return null; // TODO: generate actual files
    }

    @Override
    public Integer visitIoStmt(DSLParser.IoStmtContext ctx) {
        if (ctx.readStmt() != null) {
            visitReadStmt(ctx.readStmt());
        }
        else if (ctx.writeStmt() != null) {
            visitWriteStmt(ctx.writeStmt());
        }
        return null;
    }

    @Override
    public Integer visitReadStmt(DSLParser.ReadStmtContext ctx) {
        String id = ctx.ID().getText();
        if (numIds.containsKey(id) || templateIds.containsKey(id)) {
            throw new RuntimeException(String.format("\"%s\" is already defined with a different type", id));
        }
        else {
            System.out.print("Input: ");
            listIds.put(id, new ArrayList<>(
                    Collections.singletonList(scanner.nextLine())
            ));
        }
        return null;
    }

    @Override
    public Integer visitWriteStmt(DSLParser.WriteStmtContext ctx) {
        if (ctx.possibleStr() != null) {
            visitPossibleStr(ctx.possibleStr());
            if (possibleStrResult != null) {
                System.out.println(possibleStrResult);
            }
            else {
                throw new RuntimeException("write statement evaluated to null (expected a string)");
            }
        }
        else if (ctx.expression() != null) {
            Integer exprResult = visitExpression(ctx.expression());
            if (exprResult != null) {
                System.out.println(exprResult);
            }
            else {
                throw new RuntimeException("write statement evaluated to null (expected an integer)");
            }
        }
        return null;
    }

    @Override
    public Integer visitExpression(DSLParser.ExpressionContext ctx) {
        List<DSLParser.PossibleNumContext> nums = ctx.possibleNum();
        List<TerminalNode> ops  = ctx.OP();

        Integer value = visitPossibleNum(nums.get(0));
        if (value == null) {
            throw new RuntimeException("expression segment resolved to null");
        }

        for (int i = 1; i < nums.size(); i++) {
            Integer next = visitPossibleNum(nums.get(i));
            if (next == null) {
                throw new RuntimeException("expression segment resolved to null");
            }
            else {
                switch (ops.get(i - 1).getText().replaceAll(" ", "")) {
                    case "+":
                        value += next;
                        break;
                    case "-":
                        value -= next;
                        break;
                    case "*":
                        value *= next;
                        break;
                    case "/":
                        if (next != 0) {
                            value /= next;
                        }
                        else {
                            throw new RuntimeException("attempted division by zero in expression");
                        }
                        break;
                    case "Mod":
                        if (next != 0) {
                            value %= next;
                        }
                        else {
                            throw new RuntimeException("attempted modulus by zero in expression");
                        }
                        break;
                    case "Is":
                        value = (value.equals(next)) ? 1 : 0;
                        break;
                    case "Isn't":
                        value = (value.equals(next)) ? 0 : 1;
                        break;
                    case ">=":
                        value = (value >= next) ? 1 : 0;
                        break;
                    case "<=":
                        value = (value <= next) ? 1 : 0;
                        break;
                    case ">":
                        value = (value > next) ? 1 : 0;
                        break;
                    case "<":
                        value = (value < next) ? 1 : 0;
                        break;
                    case "And":
                        if (isBoolean(value) && isBoolean(next)) {
                            value = (value == 1 && next == 1) ? 1 : 0;
                        }
                        else {
                            throw new RuntimeException(String.format("logical operator received %d and %d (expected 0 or 1)", value, next));
                        }
                        break;
                    case "Or":
                        if (isBoolean(value) && isBoolean(next)) {
                            value = (value == 1 || next == 1) ? 1 : 0;
                        }
                        else {
                            throw new RuntimeException(String.format("logical operator received %d and %d (expected 0 or 1)", value, next));
                        }
                        break;
                    default:
                        throw new RuntimeException(String.format("unrecognised operator \"%s\"", ops.get(i - 1).getText()));
                }
            }
        }

        return value;
    }

    private static boolean isBoolean(int v) {
        return v == 0 || v == 1;
    }

    @Override
    public Integer visitPossibleNum(DSLParser.PossibleNumContext ctx) {
        if (ctx.NUM() != null) {
            return Integer.parseInt(ctx.NUM().getText());
        }
        if (ctx.ID() != null) {
            String numId = ctx.ID().getText();
            if (numIds.containsKey(numId)) {
                return numIds.get(numId);
            }
            else {
                if (listIds.containsKey(numId)) {
                    try {
                        return Integer.parseInt(listIds.get(numId).get(0));
                    }
                    catch (NumberFormatException e) {
                        throw new RuntimeException(String.format("first element of list \"%s\" is not a valid integer", numId));
                    }
                }
                else {
                    throw new RuntimeException(String.format("identifier \"%s\" is undefined", numId));
                }
            }
        }
        else if (ctx.indexedID() != null) {
            visitIndexedID(ctx.indexedID());
            if (possibleIndexingResult != null) {
                try {
                    return Integer.parseInt(possibleIndexingResult);
                }
                catch (NumberFormatException e) {
                    throw new RuntimeException(String.format("value at \"%s[index]\" is not an integer", ctx.indexedID().ID().getText()));
                }
            }
            else {
                throw new RuntimeException(String.format("evaluation of \"%s(index)\" returned null", ctx.indexedID().ID().getText()));
            }
        }
        return null;
    }

    String possibleStrResult = null;

    @Override
    public Integer visitPossibleStr(DSLParser.PossibleStrContext ctx) {
        possibleStrResult = null;
        if (ctx.STR() != null) {
            possibleStrResult = ctx.STR().getText().replaceAll("\"", "");
        }
        else if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (listIds.containsKey(id)) {
                possibleStrResult = listIds.get(id).get(0);
            }
            else if (numIds.containsKey(id)) {
                possibleStrResult = String.valueOf(numIds.get(id));
            }
            else if (templateIds.containsKey(id)) {
                visitContent(templateIds.get(id));
                if (contentResult != null) {
                    possibleStrResult = contentResult;
                }
                else {
                    throw new RuntimeException(String.format("template \"%s\" produced null content (check placeholders)", id));
                }
            }
            else {
                throw new RuntimeException(String.format("identifier \"%s\" is undefined", id));
            }
        }
        else if (ctx.indexedID() != null) {
            visitIndexedID(ctx.indexedID());
            if (possibleIndexingResult != null) {
                possibleStrResult = possibleIndexingResult;
            }
            else {
                throw new RuntimeException(String.format("evaluation of \"%s(index)\" returned null", ctx.indexedID().ID().getText()));
            }
        }
        return null;
    }

    String contentResult = null;

    @Override
    public Integer visitContent(DSLParser.ContentContext ctx) {
        contentResult = "";
        for (DSLParser.ContentItemContext itemCtx : ctx.contentItem()) {
            visitContentItem(itemCtx);
            if (itemResult != null) {
                contentResult += itemResult;
            }
            else {
                contentResult = null;
                throw new RuntimeException("template content contains a null segment");
            }
        }
        return null;
    }

    String itemResult = null;

    @Override
    public Integer visitContentItem(DSLParser.ContentItemContext ctx) {
        itemResult = null;
        if (ctx.possibleStr() != null) {
            visitPossibleStr(ctx.possibleStr());
            if (possibleStrResult != null) {
                itemResult = possibleStrResult;
            }
            else {
                throw new RuntimeException("template content contains a null segment");
            }
        }
        else if (ctx.BODY() != null) {
            itemResult = ctx.BODY().getText()
                    .replaceAll("`", "")
                    .replaceAll("\\{", "")
                    .replaceAll("}", "");
        }
        return null;
    }

    String possibleIndexingResult = null;

    @Override
    public Integer visitIndexedID(DSLParser.IndexedIDContext ctx) {
        possibleIndexingResult = null;
        String listId = ctx.ID().getText();
        if (listIds.containsKey(listId)) {
            Integer listIndex = visitExpression(ctx.expression());
            if (listIndex != null) {
                if (listIndex >= 1 && listIndex <= listIds.get(listId).size()) {
                    possibleIndexingResult = listIds.get(listId).get(listIndex - 1);
                }
                else {
                    throw new RuntimeException(String.format("index %d is out of bounds (valid range for \"%s\" is 1 to %d)", listIndex, listId, listIds.get(listId).size()));
                }
            }
            else {
                throw new RuntimeException(String.format("list index for \"%s\" evaluated to null (expected ≥ 1)", listId));
            }
        }
        else {
            throw new RuntimeException(String.format("no list named \"%s\" has been declared", listId));
        }
        return null;
    }

    @Override public Integer visit(ParseTree tree) { return null; }
    @Override public Integer visitChildren(RuleNode node) { return null; }
    @Override public Integer visitTerminal(TerminalNode node) { return null; }
    @Override public Integer visitErrorNode(ErrorNode node) { return null; }
}
