public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Error: Insufficient funds!");
            }
        } else {
            System.out.println("Error: Withdraw amount must be positive!");
        }
    }

    public void checkBalance() {
        System.out.println("Account " + accountNumber + " balance: $" + balance);
    }
}