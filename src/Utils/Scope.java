package Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Scope {
    private final Map<String, String> symbolTable = new HashMap<>();
    private final Map<String, Type> typeTable = new HashMap<>();
    private final Scope parentScope;

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public Scope getParentScope() {
        return parentScope;
    }

    public void addSymbol(String symbol, String typeName) {
        if (symbolTable.containsKey(symbol)) {
            throw new SemanticError("Symbol " + symbol + " already exists");
        }
        symbolTable.put(symbol, typeName);
    }

    public void addType(String typeName, Type type) {
        if (typeTable.containsKey(typeName)) {
            throw new SemanticError("Type " + typeName + " already exists");
        }
        typeTable.put(typeName, type);
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
}
