package Utils;

public class VariableSymbolInfo extends SymbolInfo {
    private String type;

    public VariableSymbolInfo(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
