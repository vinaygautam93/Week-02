public class BankAccount {
    // Static variable (shared across all accounts)
    private static String bankName = "Global Bank";

    // Static variable to count total accounts
    private static int totalAccounts = 0;

    // Final variable (cannot be changed once assigned)
    private final String accountNumber;

    // Instance variables (unique to each account)
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName; // Resolving ambiguity
        this.accountNumber = accountNumber;        // Assigning final variable
        this.balance = initialBalance;

        totalAccounts++; // Increment total accounts when a new account is created
    }

    // Instance method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Static method to get total accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to check if an object is a BankAccount using 'instanceof'
    public static void displayIfBankAccount(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount account = (BankAccount) obj; // Safe typecasting
            account.displayAccountDetails();
        } else {
            System.out.println("The object is not an instance of BankAccount.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create bank account objects
        BankAccount account1 = new BankAccount("Alice", "ACC12345", 1500.00);
        BankAccount account2 = new BankAccount("Bob", "ACC54321", 2000.00);

        // Display account details
        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();
        System.out.println();

        // Display total accounts
        BankAccount.getTotalAccounts();
        System.out.println();

        // Use instanceof for safe type-checking
        BankAccount.displayIfBankAccount(account1); // Valid BankAccount
        System.out.println();
        BankAccount.displayIfBankAccount("Random String"); // Invalid case
    }
}
