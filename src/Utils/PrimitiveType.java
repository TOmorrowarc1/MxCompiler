package Utils;

public class PrimitiveType implements Type {
    private final String name;

    private PrimitiveType(String name) {
        this.name = name;
    }

    @Override
    public String typeName() {
        return name;
    }

    @Override
    public boolean isEquivalent(Type other) {
        // Two primitive types are equivalent if they are the exact same object.
        // This works because we are using singletons.
        return this == other;
    }

    public static final PrimitiveType INT = new PrimitiveType("int");
    public static final PrimitiveType BOOL = new PrimitiveType("bool");
    public static final PrimitiveType VOID = new PrimitiveType("void");
    public static final PrimitiveType NULL = new PrimitiveType("null");
}
