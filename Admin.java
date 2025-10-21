package day2;

import java.util.Scanner;

// Class to manage and display rental and insurance information for vehicles
public class Admin {

    // Displays the rental cost for a given vehicle and number of hours
    public void displayRent(rentable vehicle, int hours) {
        int cost = vehicle.rent(hours); // Calculate rental cost using the rentable interface
        System.out.println("Rental cost for " + hours + " hours: " + cost);
    }

    // Main method to demonstrate vehicle rental and insurance functionality
    public static void main(String[] args) {
        // Create a two-wheeler vehicle instance
        vehicle v1 = new twoWheeler(1, "lina", "suzuki", 50);
        // Create a four-wheeler vehicle instance
        vehicle v2 = new FourWheeler(2, "buggati", "suzuki", 5000);
        
        // Create a policy instance to display insurance information
        policy p = new policy();
        // Display insurance details for the two-wheeler
        p.displayInsurance(v1);
        // Display insurance details for the four-wheeler
        p.displayInsurance(v2);
        
        // Create an array to store vehicles for iteration
        vehicle[] vehicles = new vehicle[2];
        vehicles[0] = v1;
        vehicles[1] = v2;
        
        // Display insurance information for all vehicles in the array
        System.out.println("Displaying Insurance info:");
        for (vehicle ve : vehicles) {
            // Print vehicle details and calculated insurance amount
            System.out.println("Vehicle name is: " + ve.make + ". Price is: " + ve.getprice() + ". And Insurance amount is: " + ve.calculateInsurance());
        }
        
        // Create an Admin instance to manage rental operations
        Admin a = new Admin();
        // Create rentable instances for a bike and a car
        rentable bike = new twoWheeler(1, "lina", "suzuki", 50);
        rentable car = new FourWheeler(2, "buggati", "suzuki", 5000);
        
        // Display rental costs for specific hours
        a.displayRent(bike, 2); // Rent bike for 2 hours
        a.displayRent(car, 1);  // Rent car for 1 hour
        a.displayRent(car, 6);
