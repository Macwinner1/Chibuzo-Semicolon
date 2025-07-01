import Account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccount {

    @Test
    public void testAccountBalance() {
        Account okaforAccount = new Account("correctPin");
        assertEquals(0, okaforAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        Account okaforAccount = new Account("correctPin");
        assertEquals(2000, okaforAccount.deposit(2000));
    }

    @Test
    public void testDeposit_2k_twice() {
        Account okaforAccount = new Account("correctPin");
        okaforAccount.deposit(2000);
        okaforAccount.deposit(2000);
        assertEquals(4000, okaforAccount.getBalance());
    }

    @Test
    public void testDeposit_dont_take_negative_number() {
        Account okaforAccount = new Account("correctPin");
        okaforAccount.deposit(-6000);
        assertEquals(0, okaforAccount.getBalance());
    }

    @Test
    public void testWithdraw() {
        Account okaforAccount = new Account("correctPin");
        okaforAccount.deposit(6000);
        okaforAccount.withdraw(2000);
        assertEquals(4000, okaforAccount.getBalance());
    }

    @Test
    public void testWithdraw_cant_take_negative_number() {
        Account okaforAccount = new Account("correctPin");
        okaforAccount.deposit(6000);
        okaforAccount.withdraw(-2000);
        assertEquals(6000, okaforAccount.getBalance());
    }

}
