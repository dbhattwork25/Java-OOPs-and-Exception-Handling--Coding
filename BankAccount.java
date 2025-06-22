public class BankAccount {
    // Private balance field
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative. Setting balance to 0.");
            balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        account.deposit(500);        // Valid deposit
        account.withdraw(200);       // Valid withdrawal
        account.withdraw(2000);      // Invalid: insufficient balance
        account.deposit(-100);       // Invalid: negative deposit

        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}