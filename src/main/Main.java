package main;

import parser.*;
import ASTNode.*;
import FrontEnd.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BlockStmtNode mainNode = null;
        try {
            // 1. 创建词法分析器
            YxLexer lexer = new YxLexer(CharStreams.fromStream(input));
            // 2. 创建Token流
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // 3. 创建语法分析器
            YxParser parser = new YxParser(tokens);
            ParseTree parserTree = parser.program();
            ASTBuilder astBuilder = new ASTBuilder();
            mainNode = (BlockStmtNode) astBuilder.visit(parserTree);
            //Two times or more check, signing and build the IR.
        } catch (Exception e) {
            throw e;
        }
    }
}