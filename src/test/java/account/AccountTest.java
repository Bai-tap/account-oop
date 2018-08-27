package account;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testWithdraw() {
        Account account = new Account(1122, 20000);

        double expected = 17500;
        double actual = account.withdraw(2500);
    }

    @Test
    public void testDeposit() {
        Account account = new Account(1122, 20000);

        double expected = 23000;
        double actual = account.deposit(3000);
    }
}