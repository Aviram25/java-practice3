package day2;

// Represents a savings account, extending the account class with specific rules
public class savings extends account {
    
    // Constructor to initialize a savings account with number, name, and balance
    public savings(int no, String name, double balance) {
        super(no, name, balance);
    }
    
    // Withdraws the specified amount if sufficient balance exists and minimum balance is maintained
    @Override
    public double withdraw(double amount) {
        // Check if balance is sufficient and post-withdrawal balance will be above 10,000
        if (balance > amount && balance - amount > 10000) {
            balance = balance - amount; // Deduct amount from balance
        }
        // Return the updated balance
        return balance;
    }
    
    // Deposits the specified amount if it does not exceed the deposit limit
    @Override
    public double deposit(double amount) {
        // Check if deposit amount is within the limit of 100,000
        if (amount <= 100000) {
            balance = balance + amount; // Add amount to balance
        }
        // Return the updated balance
        return balance;
    }
    
    // Main method to test the savings account functionality
    public static void main(String[] args) {
        // Create a savings account with account number 1, name "ABC", and initial balance 40,000
        savings a1 = new savings(1, "ABC", 40000);
        
        // Deposit 4,999 and print the updated balance
        double temp01 = a1.deposit(4999);
        System.out.println(temp01);
        
        // Withdraw 31,000 and print the updated balance
        double temp = a1.withdraw(31000);
        System.out.println(temp);
    }
}

