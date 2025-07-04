package Utils;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class Position {
    private final int line;
    private final int column;

    public Position(int line, int column) {
        this.line = line;
        this.column = column;
    }

    // 提供一个便捷的构造函数，直接从ANTLR的Token或Context创建
    public Position(Token token) {
        this.line = token.getLine();
        this.column = token.getCharPositionInLine();
    }

    public Position(TerminalNode terminalNode) {
        this(terminalNode.getSymbol());
    }

    public Position(ParserRuleContext ctx) {
        this(ctx.getStart());
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "line " + line + ", column " + column;
    }
}
