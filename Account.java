package day2;

// Base class representing a generic bank account with basic attributes and operations
public class account {
    
    // Account number, unique identifier for the account
    protected int no;
    // Name of the account holder
    protected String name;
    // Current balance in the account
    protected double balance;
    
    // Constructor to initialize account with number, name, and balance
    public account(int no, String name, double balance) {
        this.no = no;
        this.name = name;
        this.balance = balance;
    }
    
    // Withdraws the specified amount from the account if sufficient balance exists
    public double withdraw(double amount) {
        if (balance > amount) {
            balance = balance - amount; // Deduct amount from balance
        }
        // Return the updated balance
        return balance;
    }
    
    // Deposits the specified amount into the account
    public double deposit(double amount) {
        balance = balance + amount; // Add amount to balance
        // Return the updated balance
        return balance;
    }
}
