// BankAccount class
class BankAccount {
    public int accountNumber;     // Public attribute
    protected String accountHolder; // Protected attribute
    private double balance;       // Private attribute

    // Constructor to initialize account details
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Subclass demonstrating protected and public access
class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}
