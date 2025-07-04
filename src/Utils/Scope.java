package Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Scope {
    private final Map<String, String> symbolTable = new HashMap<>();
    private final Map<String, Type> typeTable = new HashMap<>();
    private final Scope parentScope;
    private int loopDepth;

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
        if (parentScope == null) {
            typeTable.put("int", PrimitiveType.INT);
            typeTable.put("bool", PrimitiveType.BOOL);
            typeTable.put("void", PrimitiveType.VOID);
        }
    }

    public Scope getParentScope() {
        return parentScope;
    }

    public void declareSymbol(String symbol, String typeName) {
        if (symbolTable.containsKey(symbol)) {
            throw new SemanticError("Symbol " + symbol + " already exists");
        }
        symbolTable.put(symbol, typeName);
    }

    public void declareType(String typeName, Type type) {
        if (typeTable.containsKey(typeName)) {
            throw new SemanticError("Type " + typeName + " already exists");
        }
        typeTable.put(typeName, type);
    }

    public void addLoopDepth() {
        this.loopDepth++;
    }

    public void subLoopDepth() {
        this.loopDepth--;
    }

    public Optional<String> getSymbol(String symbol) {
        Scope cursor = this;
        while (cursor != null) {
            if (cursor.symbolTable.containsKey(symbol)) {
                return Optional.of(cursor.symbolTable.get(symbol));
            }
            cursor = cursor.parentScope;
        }
        return Optional.empty();
    }

    public Optional<Type> getType(String typeName) {
        Scope cursor = this;
        while (cursor != null) {
            if (cursor.typeTable.containsKey(typeName)) {
                return Optional.of(cursor.typeTable.get(typeName));
            }
            cursor = cursor.parentScope;
        }
        return Optional.empty();
    }

    public int getLoopDepth() {
        return loopDepth;
    }
}
