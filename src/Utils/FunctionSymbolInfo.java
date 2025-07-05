package Utils;

import java.util.List;

public class FunctionSymbolInfo extends SymbolInfo {
    private String returnType;
    private List<String> parametersType;

    public FunctionSymbolInfo(String returnType, List<String> parametersType) {
        this.returnType = returnType;
        this.parametersType = parametersType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setParametersType(List<String> parametersType) {
        this.parametersType = parametersType;
    }

    public List<String> getParametersType() {
        return parametersType;
    }
}
