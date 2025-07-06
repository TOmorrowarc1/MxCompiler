package Utils;

public class ArrayType implements Type {
    Type elementType;

    public ArrayType(Type elementType) {
        this.elementType = elementType;
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
}
