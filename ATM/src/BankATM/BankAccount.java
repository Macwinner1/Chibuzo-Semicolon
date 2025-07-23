package BankATM;

public class BankAccount {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;
    private double balance;
    private int accountNumber;
    private String accountType;
    private String password;
    private double amount;

    public BankAccount(String firstName, String lastName, int age, String gender, String accountType, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }
    public void vaildDeposit(double amount) {
        if (amount > 0){
            this.balance += amount;
        }
    }

    public void deposit(double amount) {
        vaildDeposit(amount);
    }

    public void vaildWithdraw(double amount, String password) {
        if (amount > 0 && amount <= balance && password.equals(this.password)) {
            this.balance -= amount;
        }
    }

    public void withdraw(double amount, String password){
        vaildWithdraw(amount, password);
    }
}
