package Exceptions;

public class InCorrectPinException extends BankAppException {
    public InCorrectPinException(String message) {
        super(message);
    }
}
