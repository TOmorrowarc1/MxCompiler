package Utils;

public class CompileError extends RuntimeException {
    public CompileError(String errorMessage) {
        super(errorMessage);
    }
}
