package PhoneBook;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String invalidEmail) {
        super(invalidEmail);
    }
}
