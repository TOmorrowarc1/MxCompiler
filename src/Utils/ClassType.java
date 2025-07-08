package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClassType implements Type {
    private final String className;
    private final Scope classScope;

    public ClassType(String className) {
        this.className = className;
        this.classScope = null;
    }

    public ClassType(String className, Scope classScope) {
        this.className = className;
        this.classScope = classScope;
    }

    public void declareSymbol(String symbolName, SymbolInfo symbol) {
        if (classScope != null) {
            classScope.declareSymbol(symbolName, symbol);
        }
    }

    public Optional<SymbolInfo> getSymbol(String symbol) {
        if (classScope != null) {
            return classScope.getSymbol(symbol);
        }
        return Optional.empty();
    }

    public Scope getClassScope() {
        return classScope;
    }

    @Override
    public String typeName() {
        return className;
    }

    @Override
    public boolean isEquivalent(Type other) {
        return other instanceof ClassType && className.equals(other.typeName());
    }

    public static final ClassType STRING = new ClassType("String");

    static {
        List<Type> lengthList = new ArrayList<>();
        FunctionSymbolInfo length = new FunctionSymbolInfo(PrimitiveType.INT, lengthList);
        STRING.declareSymbol("length", length);
        List<Type> parseIntList = new ArrayList<>();
        FunctionSymbolInfo parseInt = new FunctionSymbolInfo(PrimitiveType.INT, parseIntList);
        STRING.declareSymbol("parseInt", parseInt);
        List<Type> ordList = new ArrayList<>();
        ordList.add(PrimitiveType.INT);
        FunctionSymbolInfo ord = new FunctionSymbolInfo(PrimitiveType.INT, ordList);
        STRING.declareSymbol("ord", ord);
        List<Type> subStringList = new ArrayList<>();
        subStringList.add(PrimitiveType.INT);
        subStringList.add(PrimitiveType.INT);
        FunctionSymbolInfo subString = new FunctionSymbolInfo(new ClassType("String"), subStringList);
        STRING.declareSymbol("subString", subString);
    }

}
