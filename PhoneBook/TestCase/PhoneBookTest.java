import PhoneBook.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    public void testThatPhoneNumberIsValid(){
        Contact contact = new Contact("08068853611");
        assertEquals(contact.getPhone(), "08068853611");
    }
    @Test
    public void testThatPhoneNumberIsInvalid(){
        assertThrows(InvalidPhoneNumberException.class, () -> new Contact("iij688536111"));
    }
    @Test
    public void testThatPhoneNumberIsNotAbove11(){
        assertThrows(InvalidPhoneNumberException.class, () -> new Contact("080688536111"));
    }
    @Test
    public void testThatPhoneNumberDontStartWithNegativeNumber(){
        assertThrows(InvalidPhoneNumberException.class, () -> new Contact("-80688536111"));
    }
    @Test
    public void testThatPhoneNumberDontHaveSpaceInBetween(){
        assertThrows(InvalidPhoneNumberException.class, () -> new Contact("08068 536111"));
    }
    @Test
    public void testThatEmailIsValid(){
        assertThrows(InvalidEmailException.class, () -> new Contact("08068853611", new Name("ifechukwu"),"okafor@gmail.com"));
    }
    @Test
    public void testThatContactListIsEmpty(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact(""));
        assertEquals(contact.getPhone(), "08068853611");

    }
    @Test
    public void testThatContactWasAdded(){
        Contact contact = new Contact("08068853611");

    }


}
