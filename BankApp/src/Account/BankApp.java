package Account;

public interface BankApp {
    int getBalance();

    int deposit(int amount);

    void withdraw(int amount, String password);

    void setPin(String password);

    void createAccount(String FirstName, String LastName, String PhoneNumber, String AccountType);
}
