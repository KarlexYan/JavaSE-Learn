package ExceptionDemo;

public class NameFormatException extends RuntimeException {
    // NameFormat 名字格式异常
    // Exception 代表这是个异常类

    // RuntimeException  运行时异常
    // Exception  编译时异常


    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
