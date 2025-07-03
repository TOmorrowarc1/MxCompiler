package main;

import parser.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "1 + 2 - 3";  // 测试输入
        // 1. 创建词法分析器
        YxLexer lexer = new YxLexer(CharStreams.fromString(input));
        // 2. 创建Token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 3. 创建语法分析器
        YxParser parser = new YxParser(tokens);
        // 4. 解析表达式
        ParseTree tree = parser.yx();
        // 5. 打印语法树
        System.out.println(tree.toStringTree(parser));
    }
}