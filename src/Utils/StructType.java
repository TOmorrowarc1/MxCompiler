package Utils;


import java.util.HashMap;
import java.util.Map;

public class StructType implements Type {
    String name;
    Map<String, Type> fields = new HashMap<>();

    public StructType(String name,Map<String, Type> fields) {
        this.name = name;
        this.fields = fields;
    }

    @Override
    public String typeName() {
        return name;
    }

    @Override
    public boolean isEquivalent(Type other) {
        return other instanceof StructType && name.equals(other.typeName());
    }

    public Type getFieldType(String fieldName){
        return fields.get(fieldName);
    }
}
