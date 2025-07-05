package Utils;


import java.util.Map;
import java.util.Optional;

public class ClassType implements Type {
    String name;
    Scope classScope;

    public ClassType(String className, Scope classScope) {
        this.name = className;
        this.classScope = classScope;
    }

    public void declareSymbol(String symbol, SymbolInfo symbolInfo) {
        classScope.declareSymbol(symbol, symbolInfo);
    }

    public Optional<SymbolInfo> getSymbol(String symbol) {
        return classScope.getSymbol(symbol);
    }

    @Override
    public String typeName() {
        return name;
    }

    @Override
    public boolean isEquivalent(Type other) {
        return other instanceof ClassType && name.equals(other.typeName());
    }
}
