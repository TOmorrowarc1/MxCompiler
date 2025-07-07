package Utils;


import java.util.Map;
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

    public void declareSymbol(String symbol, SymbolInfo symbolInfo) {
        if (classScope != null) {
            classScope.declareSymbol(symbol, symbolInfo);
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
}
