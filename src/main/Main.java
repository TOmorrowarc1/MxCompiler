package main;

import Utils.Scope;
import Utils.SemanticError;
import parser.*;
import ASTNode.*;
import FrontEnd.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scope globalScope = new Scope(null);
        InputStream input = System.in;
        if (args.length > 0) {
            String filePath = args[0];
            input = new FileInputStream(filePath);
        }
        try {
            YxLexer lexer = new YxLexer(CharStreams.fromStream(input));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            YxParser parser = new YxParser (tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(SyntaxErrorListener.INSTANCE);
            ParseTree parserTree = parser.program();

            ASTBuilder astBuilder = new ASTBuilder();
            ProgramNode ASTRoot = (ProgramNode) astBuilder.visit(parserTree);
            new SymbolCollector(globalScope).visit(ASTRoot);
            new SemanticChecker(globalScope).visit(ASTRoot);
        } catch (Exception err) {
            System.out.println(err.getMessage());
            System.exit(1);
        }
    }
}