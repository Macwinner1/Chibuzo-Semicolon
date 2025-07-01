package Account;

public class Account {
    private String pin;
    private int balance;

    public Account(String pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance ;
    }

    public int deposit(int amount) {
        if(amount > 0) balance = balance + amount;
        return balance;
    }

    public void withdraw(int amount) {
        if(amount > 0) balance = balance - amount;
    }
}
