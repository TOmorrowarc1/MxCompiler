package Utils;

import java.util.*;

public class Scope {
    private final Map<String, SymbolInfo> symbolTable = new HashMap<>();
    private final Map<String, Type> typeTable = new HashMap<>();
    private Scope parentScope;

    public Scope() {
        this.parentScope = null;
    }

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
        if (parentScope == null) {
            typeTable.put("int", PrimitiveType.INT);
            typeTable.put("bool", PrimitiveType.BOOL);
            typeTable.put("void", PrimitiveType.VOID);
            typeTable.put("null", PrimitiveType.NULL);
            typeTable.put("string", ClassType.STRING);
            List<Type> parametersType0 = new ArrayList<>();
            parametersType0.add(ClassType.STRING);
            symbolTable.put("print", new FunctionSymbolInfo(PrimitiveType.VOID, parametersType0));
            List<Type> parametersType1 = new ArrayList<>();
            parametersType1.add(ClassType.STRING);
            symbolTable.put("println", new FunctionSymbolInfo(PrimitiveType.VOID, parametersType1));
            List<Type> parametersType2 = new ArrayList<>();
            parametersType2.add(PrimitiveType.INT);
            symbolTable.put("printInt", new FunctionSymbolInfo(PrimitiveType.VOID, parametersType2));
            List<Type> parametersType3 = new ArrayList<>();
            parametersType3.add(PrimitiveType.INT);
            symbolTable.put("printlnInt", new FunctionSymbolInfo(PrimitiveType.VOID, parametersType3));
            List<Type> parametersType4 = new ArrayList<>();
            symbolTable.put("getString", new FunctionSymbolInfo(ClassType.STRING, parametersType4));
            List<Type> parametersType5 = new ArrayList<>();
            symbolTable.put("getInt", new FunctionSymbolInfo(PrimitiveType.INT, parametersType5));
            List<Type> parametersType6 = new ArrayList<>();
            parametersType6.add(PrimitiveType.INT);
            symbolTable.put("toString", new FunctionSymbolInfo(ClassType.STRING, parametersType6));
        }
    }

    public Scope getParentScope() {
        return parentScope;
    }

    public void setParentScope(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public void declareSymbol(String symbol, SymbolInfo symbolInfo) {
        if (symbolTable.containsKey(symbol)) {
            throw new SemanticError("Symbol " + symbol + " already exists");
        }
        symbolTable.put(symbol, symbolInfo);
    }

    public void declareType(String typeName, Type type) {
        if (typeTable.containsKey(typeName)) {
            throw new SemanticError("Type " + typeName + " already exists");
        }
        typeTable.put(typeName, type);
    }

    public Optional<SymbolInfo> getSymbol(String symbol) {
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
