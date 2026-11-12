
package BankingApplication.Banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BanckaccountTest {

    // 1. Test successful deposit - INTENTIONAL FAILURE
    @Test
    void testDeposit() {
        Bankaccount account = new Bankaccount(1000);

        account.deposit(500);

        assertEquals(2000, account.getBalance());
    }

    // 2. Test successful withdrawal - INTENTIONAL FAILURE
    @Test
    void testWithdrawal() {
        Bankaccount account = new Bankaccount(1000);

        account.withdraw(300);

        assertEquals(500, account.getBalance());
    }

    // 3. Test insufficient balance
    @Test
    void testInsufficientBalance() {
        Bankaccount account = new Bankaccount(500);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(600));
    }

    // 4. Test zero deposit
    @Test
    void testZeroDeposit() {
        Bankaccount account = new Bankaccount(1000);

        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(0));
    }

    // 5. Test negative deposit
    @Test
    void testNegativeDeposit() {
        Bankaccount account = new Bankaccount(1000);

        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(-100));
    }

    // 6. Test zero withdrawal
    @Test
    void testZeroWithdrawal() {
        Bankaccount account = new Bankaccount(1000);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(0));
    }

    // 7. Test negative withdrawal
    @Test
    void testNegativeWithdrawal() {
        Bankaccount account = new Bankaccount(1000);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(-100));
    }

    // 8. Test multiple transactions
    @Test
    void testMultipleTransactions() {
        Bankaccount account = new Bankaccount(2000);

        account.deposit(500);
        account.withdraw(300);
        account.deposit(1000);
        account.withdraw(200);

        assertEquals(3000, account.getBalance());
    }

    // 9. Test initial balance
    @Test
    void testInitialBalance() {
        Bankaccount account = new Bankaccount(5000);

        assertEquals(5000, account.getBalance());
    }

    // 10. Test negative initial balance
    @Test
    void testNegativeInitialBalance() {
        assertThrows(IllegalArgumentException.class,
                () -> new Bankaccount(-500));
    }
}
