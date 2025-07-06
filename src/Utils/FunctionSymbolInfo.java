package Utils;

import java.util.List;

public class FunctionSymbolInfo extends SymbolInfo {
    private Type returnType;
    private List<Type> parametersType;

    public FunctionSymbolInfo(Type returnType, List<Type> parametersType) {
        this.returnType = returnType;
        this.parametersType = parametersType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setParametersType(List<Type> parametersType) {
        this.parametersType = parametersType;
    }

    public List<Type> getParametersType() {
        return parametersType;
    }
}
