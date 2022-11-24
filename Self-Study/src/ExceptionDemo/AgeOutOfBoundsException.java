package ExceptionDemo;

public class AgeOutOfBoundsException extends RuntimeException {
    // AgeOutOfBounds  年龄异常


    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
