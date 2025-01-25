import java.util.ArrayList;
import java.util.List;

// Represents a bank account
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor to initialize an account
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // View the account balance
    public double getBalance() {
        return balance;
    }

    // Print account details
    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

// Represents a customer who can have multiple accounts
class Customer {
    private String name;
    private List<BankAccount> accounts; // Association: Customer has bank accounts

    // Constructor to initialize a customer
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add a new bank account for the customer
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // View balances of all accounts
    public void viewBalances() {
        System.out.println("Customer: " + name);
        for (BankAccount account : accounts) {
            account.printAccountDetails();
        }
    }
}

// Represents a bank that has customers
class Bank {
    private String name;
    private List<Customer> customers; // Association: Bank has customers

    // Constructor to initialize the bank
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Add a customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Open an account for a customer
    public void openAccount(Customer customer, BankAccount account) {
        customer.addAccount(account);
    }

    // Display all customers of the bank
    public void displayCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            customer.viewBalances();
        }
    }
}

// Main class to demonstrate the bank and customer relationship
public class BankAccountMain {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Global Bank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Open accounts for customers
        bank.openAccount(customer1, new BankAccount("ACC123", 1000.0));
        bank.openAccount(customer1, new BankAccount("ACC124", 2500.0));

        bank.openAccount(customer2, new BankAccount("ACC125", 500.0));

        // Display customers and their accounts
        bank.displayCustomers();
    }
}
