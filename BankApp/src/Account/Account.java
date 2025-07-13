package Account;

import Exceptions.InCorrectPinException;

import java.util.ArrayList;

public class Account implements BankApp {
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String AccountType;
    private String pin;
    private int balance;
    private final ArrayList<BankApp> accountsList;


    public Account(String FirstName, String LastName, String PhoneNumber, String AccountType) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.AccountType = AccountType;
        this.pin = pin;
        accountsList = new ArrayList<>();
    }
    @Override
    public int getBalance() {
        return balance ;
    }

    @Override
    public int deposit(int amount) {
        if(amount > 0) balance += amount;
        return balance;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public void createAccount(String FirstName, String LastName, String PhoneNumber, String AccountType){
        Account account = new Account(FirstName, LastName, PhoneNumber, AccountType);
        accountsList.add(account);
    }
    public String getAccounts(String PhoneNumber){
        for (BankApp account : accountsList) {
            if(PhoneNumber.equals(account)){

            }
        }
    }

    public void validatePin(String pin) {
        if (this.pin.equals(pin)){
            this.pin = pin;
        }
        else {
            throw new InCorrectPinException("Invalid pin");
        }
    }

    @Override
    public void withdraw(int amount, String password) {
        validatePin(password);
        if(amount > 0 && password == this.pin) balance -= amount;
    }
}
