package PhoneBook;

public class InvalidPhoneNumberException extends RuntimeException {
    public InvalidPhoneNumberException(String invalidPhoneNumber) {
        super(invalidPhoneNumber);
    }
}
