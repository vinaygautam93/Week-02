package day05_oop.hierarchical_inheritance;

// Base class representing a general Bank Account
class BankAccount {
    protected String accountNumber; // Unique account number
    protected double balance;       // Account balance

    // Constructor to initialize BankAccount attributes
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display general account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass representing a Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate for savings account

    // Constructor to initialize SavingsAccount attributes
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Initialize superclass attributes
        this.interestRate = interestRate;
    }

    // Method to display the account type
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    // Overriding displayAccountInfo to include interest rate
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass representing a Checking Account
class CheckingAccount extends BankAccount {
    private double withdrawalLimit; // Withdrawal limit for checking account

    // Constructor to initialize CheckingAccount attributes
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Initialize superclass attributes
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display the account type
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    // Overriding displayAccountInfo to include withdrawal limit
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass representing a Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    private double maturityAmount; // Maturity amount for the fixed deposit

    // Constructor to initialize FixedDepositAccount attributes
    public FixedDepositAccount(String accountNumber, double balance, double maturityAmount) {
        super(accountNumber, balance); // Initialize superclass attributes
        this.maturityAmount = maturityAmount;
    }

    // Method to display the account type
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    // Overriding displayAccountInfo to include maturity amount
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Maturity Amount: $" + maturityAmount);
    }
}

// Main class to test the implementation
public class BankSystem {
    public static void main(String[] args) {
        // Create instances of different account types
        SavingsAccount savings = new SavingsAccount("SAV12345", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CHK67890", 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD98765", 10000.0, 12000.0);

        // Display information about each account type
        System.out.println("Bank Account Details:");
        savings.displayAccountType();
        savings.displayAccountInfo();
        System.out.println();

        checking.displayAccountType();
        checking.displayAccountInfo();
        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountInfo();
    }
}
