package FrontEnd;

import ASTNode.*;
import Utils.*;

import java.util.Optional;

public class SemanticChecker implements ASTNodeVisitor {
    private Scope scope;

    public SemanticChecker(Scope scope) {
        this.scope = scope;
    }

    @Override
    public void visit(BlockStmtNode node) {
        scope = new Scope(scope);
        for (StmtNode statement : node.body) {
            statement.accept(this);
        }
        scope = scope.getParentScope();
    }

    @Override
    public void visit(IfStmtNode node) {
        node.condition.accept(this);
        if (!node.condition.nodeInfo.getType().equals("bool")) {
            throw new SemanticError("Type not match: condition judgement is not a bool");
        }
        scope = new Scope(scope);
        node.thenStmt.accept(this);
        node.elseStmt.accept(this);
        scope = scope.getParentScope();
    }

    @Override
    public void visit(WhileStmtNode node) {
        node.condition.accept(this);
        if (!node.condition.nodeInfo.getType().equals("bool")) {
            throw new SemanticError("Type not match: condition judgement is not a bool");
        }
        scope = new Scope(scope);
        scope.addLoopDepth();
        node.body.accept(this);
        scope.addLoopDepth();
        scope = scope.getParentScope();
    }

    @Override
    public void visit(ForStmtNode node) {
        node.varDefStmt.accept(this);
        node.condition.accept(this);
        if (!node.condition.nodeInfo.getType().equals("bool")) {
            throw new SemanticError("Type not match: condition judgement is not a bool");
        }
        node.step.accept(this);
        scope = new Scope(scope);
        scope.addLoopDepth();
        node.body.accept(this);
        scope.subLoopDepth();
        scope = scope.getParentScope();
    }

    @Override
    public void visit(JmpStmtNode node) {
        if (scope.getLoopDepth() <= 0) {
            throw new SemanticError("Loop depth exceeded");
        }
    }

    @Override
    public void visit(ReturnStmtNode node) {
        //The type should correspond to the function.
        node.expression.accept(this);
        if (!node.expression.nodeInfo.getType().equals("int") || !node.expression.nodeInfo.getType().equals("void")) {
            throw new SemanticError("Type not match: return value should be int");
        }
    }

    @Override
    public void visit(VarDefStmtNode node) {
        String type = node.type;
        for (VarDefStmtNode.DefNode defNode : node.defList) {
            scope.declareSymbol(defNode.identifier, type);
        }
    }

    @Override
    public void visit(ExprStmtNode node) {
        node.expr.accept(this);
    }

    @Override
    public void visit(EmptyStmtNode node) {
    }

    @Override
    public void visit(AssignExprNode node) {
        node.left.accept(this);
        node.right.accept(this);
        if (!node.left.nodeInfo.getType().equals(node.right.nodeInfo.getType())) {
            throw new SemanticError("Types not match: assign the wrong type to left.");
        }
        if (!node.left.nodeInfo.isLeftValue()) {
            throw new SemanticError("Types not match: the left is not assignable");
        }
        node.nodeInfo.setType(node.left.nodeInfo.getType());
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(BinaryExprNode node) {
        node.left.accept(this);
        node.right.accept(this);
        if (node.left.nodeInfo.getType().equals(node.right.nodeInfo.getType())) {
            throw new SemanticError("Types not match: types on sides of the binary operator is different.");
        }
        switch (node.operator) {
            case LOGIC_AND, LOGIC_OR: {
                if (!node.left.nodeInfo.getType().equals("bool")) {
                    throw new SemanticError("Types not match: the type should be bool");
                }
                break;
            }
            case PLUS, SUB, MUL, DIV, MOD, OR, AND, LEFT_SHIFT, RIGHT_SHIFT, G, GE, L, LE: {
                if (!node.left.nodeInfo.getType().equals("int")) {
                    throw new SemanticError("Types not match: the type should be int");
                }
                break;
            }
            case EQUAL, N_EQUAL: {
                break;
            }
        }
        node.nodeInfo.setType(node.left.nodeInfo.getType());
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(UnaryExprNode node) {
        node.expression.accept(this);
        if (node.operator == UnaryExprNode.UnaryOperator.LOGIC_NOT) {
            if (!node.expression.nodeInfo.getType().equals("bool")) {
                throw new SemanticError("Type not match: the type of the expression should be bool.");
            }
            node.nodeInfo.setType("bool");
            node.nodeInfo.setIsLeftValue(false);
        } else {
            if (!node.expression.nodeInfo.getType().equals("int")) {
                throw new SemanticError("Type not match: the type of the expression should be int.");
            }
            node.nodeInfo.setType("int");
            if (node.operator == UnaryExprNode.UnaryOperator.SELF_ADD || node.operator == UnaryExprNode.UnaryOperator.SELF_SUB) {
                if (!node.expression.nodeInfo.isLeftValue()) {
                    throw new SemanticError("A right value should not be ++/--");
                }
                node.nodeInfo.setIsLeftValue(true);
            } else {
                node.nodeInfo.setIsLeftValue(false);
            }
        }
    }

    @Override
    public void visit(IntLiteralExprNode node) {
        node.nodeInfo.setType("int");
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(BoolLiteralExprNode node) {
        node.nodeInfo.setType("bool");
        node.nodeInfo.setIsLeftValue(false);
    }

    @Override
    public void visit(VarExprNode node) {
        Optional<String> type = scope.getSymbol(node.identifier);
        if (type.isEmpty()) {
            throw new SemanticError(node.identifier + "has not been defined");
        }
        node.nodeInfo = new ExprNodeInfo(type.get(), true);
    }

    @Override
    public void visit(EmptyExprNode node) {
    }
}
