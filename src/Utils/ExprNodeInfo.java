package Utils;

public class ExprNodeInfo {
    private String type;
    private boolean isLeftValue;

    public ExprNodeInfo(String type, boolean isLeftValue) {
        this.type = type;
        this.isLeftValue = isLeftValue;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public boolean isLeftValue(){
        return this.isLeftValue;
    }

    public void setIsLeftValue(boolean isLeftValue){
        this.isLeftValue = isLeftValue;
    }
}
