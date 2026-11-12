package BankingApplication.Banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BanckaccountTest {

    @Test
    void testInitialBalance() {
        Banckaccount account = new Banckaccount(1000);
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    void testDeposit() {
        Banckaccount account = new Banckaccount(1500);
        account.deposit(500);
        assertEquals(2000.0, account.getBalance(), 0.001);
    }

    @Test
    void testWithdrawal() {
        Banckaccount account = new Banckaccount(1000);
        account.withdraw(500);
        assertEquals(500.0, account.getBalance(), 0.001);
    }

    @Test
    void testInvalidDeposit() {
        Banckaccount account = new Banckaccount(1000);
        account.deposit(-500);
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    void testInvalidWithdrawal() {
        Banckaccount account = new Banckaccount(1000);
        account.withdraw(1500);
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    void testZeroDeposit() {
        Banckaccount account = new Banckaccount(1000);
        account.deposit(0);
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    void testZeroWithdrawal() {
        Banckaccount account = new Banckaccount(1000);
        account.withdraw(0);
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    void testMultipleDeposits() {
        Banckaccount account = new Banckaccount(1000);
        account.deposit(500);
        account.deposit(500);
        assertEquals(2000.0, account.getBalance(), 0.001);
    }

    @Test
    void testMultipleWithdrawals() {
        Banckaccount account = new Banckaccount(2000);
        account.withdraw(500);
        account.withdraw(500);
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    void testDepositAndWithdrawal() {
        Banckaccount account = new Banckaccount(1000);
        account.deposit(500);
        account.withdraw(300);
        assertEquals(1200.0, account.getBalance(), 0.001);
    }
}