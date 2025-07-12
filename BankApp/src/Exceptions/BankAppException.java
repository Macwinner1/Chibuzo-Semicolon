package Exceptions;

public class BankAppException extends RuntimeException{
    public BankAppException(String message) {
        super(message);
    }
}
