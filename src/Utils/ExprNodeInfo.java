package Utils;

public class ExprNodeInfo {
    private Type exprType;
    private boolean isLeftValue;

    public ExprNodeInfo() {
        this.exprType = null;
        this.isLeftValue = false;
    }

    public ExprNodeInfo(Type exprType, boolean isLeftValue) {
        this.exprType = exprType;
        this.isLeftValue = isLeftValue;
    }

    public Type getType() {
        return this.exprType;
    }

    public void setType(Type exprType) {
        this.exprType = exprType;
    }

    public boolean isLeftValue() {
        return this.isLeftValue;
    }

    public void setIsLeftValue(boolean isLeftValue) {
        this.isLeftValue = isLeftValue;
    }
}
