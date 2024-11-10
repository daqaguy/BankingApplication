package org;

// Abstract class representing a generic account
abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

// Interface for transaction functionalities
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

// Checking account class implementing transactions
class CheckingAccount extends Account implements Transaction {
    private String accountNumber;

    public CheckingAccount(String accountNumber, double initialBalance) {
        super(initialBalance);
        this.accountNumber = accountNumber;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// User class with login and access control
class User {
    private String username;
    private String password;
    private CheckingAccount account;

    public User(String username, String password, String accountNumber, double initialBalance) {
        this.username = username;
        this.password = password;
        this.account = new CheckingAccount(accountNumber, initialBalance);
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public CheckingAccount getAccount() {
        return account;
    }
}

// Main class to test the banking application
public class BankingApplication {
    public static void main(String[] args) {
        // Create a user
        User user = new User("john_doe", "password123", "CHK123", 500.0);

        // Login
        if (user.login("john_doe", "password123")) {
            System.out.println("Login successful!");

            // Perform transactions
            CheckingAccount account = user.getAccount();
            account.deposit(200.0);
            System.out.println("Deposited 200. Balance: " + account.getBalance());

            account.withdraw(150.0);
            System.out.println("Withdrew 150. Balance: " + account.getBalance());
        } else {
            System.out.println("Invalid login credentials.");
        }
    }
}

