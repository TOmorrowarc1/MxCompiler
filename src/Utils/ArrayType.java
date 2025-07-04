package Utils;

public class ArrayType implements Type {
    Type elementType;
    int length;

    public ArrayType(Type elementType, int length) {
        this.elementType = elementType;
        this.length = length;
    }

    @Override
    public String typeName() {
        String elementTypeName = elementType.typeName();
        return elementTypeName + "[]";
    }

    @Override
    public boolean isEquivalent(Type other) {
        return other instanceof ArrayType && typeName().equals(other.typeName());
    }

    public Type getElementType() {
        return elementType;
    }

    public int getLength() {
        return length;
    }
}
