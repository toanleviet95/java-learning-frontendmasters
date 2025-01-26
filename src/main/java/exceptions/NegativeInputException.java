package exceptions;

public class NegativeInputException extends Exception {

    // Default message
    public NegativeInputException() {
        this("Input must be greater than or equal to 0");
    }

    public NegativeInputException(String message) {
        super(message);
    }
}
