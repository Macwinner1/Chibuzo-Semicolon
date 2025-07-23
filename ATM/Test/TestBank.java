
import BankATM.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    @Test
    public void test_that_new_account_open_balance_0() {
        BankAccount bankAccount = new BankAccount("okafor", "ifechukwu", 31, "male", "Saving Account", 806885611);
        assertEquals(0, bankAccount.getBalance());
    }
    @Test
    public void test_that_new_account_can_be_deposit() {
        BankAccount bankAccount = new BankAccount("okafor", "ifechukwu", 31, "male", "Saving Account", 806885611);
        bankAccount.deposit(5000.0);
        assertEquals(5000, bankAccount.getBalance());
    }
    @Test
    public void test_that_negative_value_cant_deposit() {
        BankAccount bankAccount = new BankAccount("okafor", "ifechukwu", 31, "male", "Saving Account", 806885611);
        bankAccount.deposit(-4500);
        assertEquals(0, bankAccount.getBalance());
    }
    @Test
    public void test_that_0_balance_cant_withdraw() {
        BankAccount bankAccount = new BankAccount("okafor", "ifechukwu", 31, "male", "Saving Account", 806885611);
        bankAccount.setPassword("CorrectPin");
        bankAccount.withdraw(-4500, "CorrectPin");
        assertEquals(0, bankAccount.getBalance());
    }
    @Test
    public void test_that_negative_amount_cant_withdraw() {
        BankAccount bankAccount = new BankAccount("okafor", "ifechukwu", 31, "male", "Saving Account", 806885611);
        bankAccount.deposit(5000);
        bankAccount.setPassword("CorrectPin");
        bankAccount.withdraw(-4500, "CorrectPin");
        assertEquals(5000, bankAccount.getBalance());
    }
    @Test
    public void test_that_valid_amount_can_be_withdraw() {
        BankAccount bankAccount = new BankAccount("okafor", "ifechukwu", 31, "male", "Saving Account", 806885611);
        bankAccount.deposit(5000);
        bankAccount.setPassword("CorrectPin");
        bankAccount.withdraw(4500, "CorrectPin");
        assertEquals(500, bankAccount.getBalance());
    }


}
