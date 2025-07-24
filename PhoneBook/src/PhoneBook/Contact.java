package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private Name name;
    private String email;
    private String phone;
    private String address;
    private List<String> contact = new ArrayList<>();

    public Contact(String phone) {
        this(phone, new Name("Unknown name"));
    }
    public Contact(String phone, Name name) {
        this(phone, name, " ");
    }
    public Contact(String phone, Name name, String email) {
        this(phone, name, email, " ");
    }
    public Contact(String phone, Name name, String email, String address) {
        validatePhone(phone);
        validateEmail(email);
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        validatePhone(phone);
        this.phone = phone;
    }
    public void validatePhone(String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("^\\d{11}$")) {
            throw new InvalidPhoneNumberException("Invalid phone number");
        }
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException {
        validateEmail(email);
        this.email = email;
    }

    public void validateEmail(String email) throws InvalidEmailException {
        if(!email.contains("^@$")){
            throw new InvalidEmailException("Invalid email");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void add(String phone, Name name, String email, String address){

    }
}
