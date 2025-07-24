package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact){
        contactList.add(contact);
    }
    public Contact findContactById(int phoneNumber){
        for(Contact contact : contactList){
            if(contact.getPhone().equals(ID)){
                return contact;
            }
        }
        return null;
        contactList.forEach(contact -> {
            if(contact.getPhone().equals(phoneNumber))
            }
        });
    }
}
