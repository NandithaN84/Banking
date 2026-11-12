
package BankingApplication.Banking;

public class Bankaccount {

    private double balance;

    // Constructor to create bank account
    public Bankaccount(double initialBalance) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                "Initial balance cannot be negative"
            );
        }

        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be greater than zero"
            );
        }

        balance = balance + amount;
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be greater than zero"
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                "Insufficient balance"
            );
        }

        balance = balance - amount;
    }

    // Display current balance
    public double getBalance() {
        return balance;
    }

    // Main method
    public static void main(String[] args) {

        Bankaccount account = new Bankaccount(1000);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("After Deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("After Withdrawal: " + account.getBalance());

        System.out.println("Current Balance: " + account.getBalance());
    }
}
