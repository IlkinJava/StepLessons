package my_exception_example;

public class MyException extends RuntimeException {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
