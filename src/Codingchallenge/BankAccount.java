package Codingchallenge;
public class BankAccount {
    private double balance; // Private field to store the balance

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        balance -= amount;
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Main method
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance
        account.deposit(500); // Deposit 500
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(200); // Withdraw 300
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}