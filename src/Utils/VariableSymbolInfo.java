package Utils;

public class VariableSymbolInfo extends SymbolInfo {
    private Type varType;

    public VariableSymbolInfo(Type varType) {
        this.varType = varType;
    }

    public void setType(Type varType) {
        this.varType = varType;
    }

    public Type getType() {
        return this.varType;
    }
}
