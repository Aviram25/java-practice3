package day2;

// Represents a current account, extending the account class with specific rules
public class current extends account {
    
    // Constructor to initialize a current account with number, name, and balance
    public current(int no, String name, double balance) {
        super(no, name, balance);
    }
    
    // Withdraws the specified amount if sufficient balance exists and amount is within limit
    @Override
    public double withdraw(double amount) {
        // Check if balance is sufficient and withdrawal amount is within 50,000
        if (balance > amount && amount <= 50000) {
            balance = balance - amount; // Deduct amount from balance
        }
        // Return the updated balance
        return balance;
    }
    
    // Deposits the specified amount if it does not exceed the deposit limit
    @Override
    public double deposit(double amount) {
        // Check if deposit amount is within the limit of 500,000
        if (amount <= 500000) {
            balance = balance + amount; // Add amount to balance
        }
        // Return the updated balance
        return balance;
    }
    
    // Main method to test the current account functionality
    public static void main(String[] args) {
        // Create a current account with account number 2, name "efg", and initial balance 200,000
        current a2 = new current(2, "efg", 200000);
        
        // Deposit 4,999 and print the updated balance
        double temp02 = a2.deposit(4999);
        System.out.println(temp02);
        
        // Withdraw 42,000 and print the updated balance
        double temp1 = a2.withdraw(42000);
        System.out.println(temp1);
    }
}
