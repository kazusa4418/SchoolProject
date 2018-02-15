package integratedStudy.input;

public class InputNotIntegerException extends RuntimeException {
    InputNotIntegerException() {
        super("could not parse to integer type");
    }
    InputNotIntegerException(String msg) {
        super(msg);
    }
}
