import Account.Account;
import Account.BankApp;
import Exceptions.InCorrectPinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {

    @Test
    public void testAccountOpenWithZeroBalance() {
        BankApp okaforAccount = new Account("okafor", "ifechukwu", "08068853611", "Savings");
        assertEquals(0, okaforAccount.getBalance());
    }
    @Test
    public void test2AccountOpenWithZeroBalance() {
        BankApp okaforAccount = new Account("okafor", "ifechukwu", "08068853611", "Savings");
        BankApp johnAccount = new Account("john", "chinedu", "08065583611", "Savings");
        assertEquals(0, okaforAccount.getBalance());
        assertEquals(0, johnAccount.getBalance());
    }
    @Test
    public void testDepositOn2Account() {
        BankApp okaforAccount = new Account("okafor", "ifechukwu", "08068853611", "Savings");
        BankApp johnAccount = new Account("john", "chinedu", "08065583611", "Savings");
        okaforAccount.deposit(5500);
        johnAccount.deposit(5000);
        assertEquals(5500, okaforAccount.getBalance());
        assertEquals(5000, johnAccount.getBalance());
    }
    @Test
    public void testNegativeDepositOn2Account() {
        BankApp okaforAccount = new Account("okafor", "ifechukwu", "08068853611", "Savings");
        BankApp johnAccount = new Account("john", "chinedu", "08065583611", "Savings");
        okaforAccount.deposit(-5500);
        johnAccount.deposit(-5000);
        assertEquals(0, okaforAccount.getBalance());
        assertEquals(0, johnAccount.getBalance());
    }
    @Test
    public void testNegativeWithdrawOn2AccountWithZeroBalance() {
        BankApp okaforAccount = new Account("okafor", "ifechukwu", "08068853611", "Savings");
        BankApp johnAccount = new Account("john", "chinedu", "08065583611", "Savings");
        okaforAccount.setPin("okaforPin");
        johnAccount.setPin("johnPin");
        okaforAccount.withdraw(-5500, "okaforPin");
        johnAccount.withdraw(-5000, "johnPin");
        assertEquals(0, okaforAccount.getBalance());
        assertEquals(0, johnAccount.getBalance());
    }
    @Test
    public void testWithdrawOn2Account() {
        BankApp okaforAccount = new Account("okafor", "ifechukwu", "08068853611", "Savings");
        BankApp johnAccount = new Account("john", "chinedu", "08065583611", "Savings");
        okaforAccount.deposit(5500);
        johnAccount.deposit(5000);
        okaforAccount.setPin("okaforPin");
        johnAccount.setPin("johnPin");
        okaforAccount.withdraw(2500, "okaforPin");
        johnAccount.withdraw(1500, "johnPin");
        assertEquals(3000, okaforAccount.getBalance());
        assertEquals(3500, johnAccount.getBalance());
    }
    @Test
    public void testWithdrawOn2AccountWithInvalidPin() {
        BankApp okaforAccount = new Account("okafor", "ifechukwu", "08068853611", "Savings");
        BankApp johnAccount = new Account("john", "chinedu", "08065583611", "Savings");
        okaforAccount.deposit(5500);
        johnAccount.deposit(5000);
        okaforAccount.setPin("okaforPin");
        johnAccount.setPin("johnPin");
        assertThrows(InCorrectPinException.class, () -> okaforAccount.withdraw(2500, "okPin"));
        assertThrows(InCorrectPinException.class, () -> johnAccount.withdraw(1500, "jonPin"));
    }
}
