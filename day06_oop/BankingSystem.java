package day06_oop;

// Abstract class BankAccount defines the structure for different account types
abstract class BankAccount {
    private String accountNumber;  // Unique account number
    private String holderName;     // Account holder's name
    private double balance;        // Account balance

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Concrete methods for deposit and withdrawal
    public void deposit(double amount) {
        balance += amount; // Add amount to balance
    }

    public void withdraw(double amount) {
        balance -= amount; // Subtract amount from balance
    }

    // Abstract method to calculate interest, to be implemented by subclasses
    public abstract double calculateInterest();
}

// SavingsAccount class implements interest calculation for savings accounts
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest for savings account
    }
}

// CurrentAccount class implements interest calculation for current accounts
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest for current account
    }
}

// Interface Loanable defines loan-related behavior
interface Loanable {
    void applyForLoan(double amount); // Apply for a loan
    boolean checkEligibility(); // Check loan eligibility
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount("S123", "Alice", 5000);
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Interest for Savings Account: " + account.calculateInterest()); // Display calculated interest
        System.out.println("Balance: " + account.getBalance()); // Display balance using the getter method
    }
}
