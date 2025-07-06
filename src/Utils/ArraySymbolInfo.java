package Utils;

public class ArraySymbolInfo extends SymbolInfo {
    private Type elementType;
    private int length;

    public ArraySymbolInfo(Type elementType, int length) {
        this.elementType = elementType;
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Type getElementType() {
        return this.elementType;
    }

    public void setElementType(Type elementType) {
        this.elementType = elementType;
    }
}
