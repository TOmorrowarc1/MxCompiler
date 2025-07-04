package Utils;

public class SemanticError extends CompileError {
    public SemanticError(String errorMessage) {
        super(errorMessage);
    }

    @Override
    public String getMessage() {
        String basicMessage = super.getMessage();
        return "Semantic Error" + basicMessage;
    }
}
