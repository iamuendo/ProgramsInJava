/**
 *
 * @author: Muendo Isaac Maingi
 * Admission Number: BSE-01-0024/2025
 *
 */

package carrentalsystem;

import java.util.ArrayList; // Import the ArrayList class from the java.util package
import java.util.List; // Import the List interface from the java.util package
import java.util.Scanner; // Import the Scanner class from the java.util package

// Car class representing a car object
class Car {

    private String licensePlate; // Private instance variable to store the license plate of the car
    private String model; // Private instance variable to store the model of the car
    private boolean isRented; // Private instance variable to store the rental status of the car

    // Constructor to initialize the Car object with license plate and model
    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate; // Assign the provided licensePlate to the instance variable
        this.model = model; // Assign the provided model to the instance variable
        this.isRented = false; // Set the initial rental status to false (not rented)
    }

    // Getter method to retrieve the license plate of the car
    public String getLicensePlate() {
        return licensePlate; // Return the value of the licensePlate instance variable
    }

    // Getter method to retrieve the model of the car
    public String getModel() {
        return model; // Return the value of the model instance variable
    }

    // Getter method to check if the car is currently rented
    public boolean isRented() {
        return isRented; // Return the value of the isRented instance variable
    }

    // Setter method to update the rental status of the car
    public void setRented(boolean rented) {
        isRented = rented; // Assign the provided rented value to the isRented instance variable
    }

    // Override the toString method to provide a custom string representation of the Car object
    @Override
    public String toString() {
        if (!isRented) { // Check if the car is not rented
            return model + " (License Plate-> " + licensePlate + ") - Available for Rent!"; // Return a string indicating the car is available for rent
        } else { // If the car is rented
            return model + " (License Plate-> " + licensePlate + ") - Currently Rented"; // Return a string indicating the car is currently rented
        }
    }

}

// Customer class representing a customer object
class Customer {

    private String customerId; // Private instance variable to store the customer ID
    private String name; // Private instance variable to store the customer name

    // Constructor to initialize the Customer object with customer ID and name
    public Customer(String customerId, String name) {
        this.customerId = customerId; // Assign the provided customerId to the instance variable
        this.name = name; // Assign the provided name to the instance variable
    }

    // Getter method to retrieve the customer ID
    public String getCustomerId() {
        return customerId; // Return the value of the customerId instance variable
    }

    // Getter method to retrieve the customer name
    public String getName() {
        return name; // Return the value of the name instance variable
    }

    // Override the toString method to provide a custom string representation of the Customer object
    @Override
    public String toString() {
        // Return a string containing the customer ID and name
        return "Customer -> customerId='" + customerId + '\'' + ", name='" + name + '\'' + '}';
    }

}

// RentalAgency class representing the rental agency
class RentalAgency {

    private List<Car> cars; // Private instance variable to store a list of cars in the agency's inventory
    private List<Customer> customers; // Private instance variable to store a list of customers

    // Constructor to initialize the RentalAgency object with empty lists of cars and customers
    public RentalAgency() {
        this.cars = new ArrayList<>(); // Initialize the cars list as an empty ArrayList
        this.customers = new ArrayList<>(); // Initialize the customers list as an empty ArrayList
    }

    // Method to add a car to the agency's inventory
    public void addCar(Car car) {
        this.cars.add(car); // Add the provided car object to the cars list
    }

    // Method to add a customer to the agency's customer list
    public void addCustomer(Customer customer) {
        this.customers.add(customer); // Add the provided customer object to the customers list
    }

    // Method to rent a car by license plate
    public void rentCar(String licensePlate) {
        for (Car car : cars) { // Iterate over each car in the cars list
            if (car.getLicensePlate().equals(licensePlate)) { // Check if the car's license plate matches the provided license plate
                if (!car.isRented()) { // Check if the car is not currently rented
                    car.setRented(true); // Set the car's rental status to true (rented)
                    System.out.println("Car rented: " + car); // Print a message indicating the car has been rented
                    return; // Exit the method
                } else { // If the car is already rented
                    System.out.println("Car is already rented: " + car); // Print a message indicating the car is already rented
                    return; // Exit the method
                }
            }
        }
        System.out.println("Car not found with license plate: " + licensePlate); // Print a message indicating that no car was found with the given license plate
    }

    // Method to return a car by license plate
    public void returnCar(String licensePlate) {
        for (Car car : cars) { // Iterate over each car in the cars list
            if (car.getLicensePlate().equals(licensePlate)) { // Check if the car's license plate matches the provided license plate
                if (car.isRented()) { // Check if the car is currently rented
                    car.setRented(false); // Set the car's rental status to false (not rented)
                    System.out.println("Car returned: " + car); // Print a message indicating the car has been returned
                    return; // Exit the method
                } else { // If the car is not rented
                    System.out.println("Car is not rented: " + car); // Print a message indicating the car is not rented
                    return; // Exit the method
                }
            }
        }
        System.out.println("Car not found with license plate: " + licensePlate); // Print a message indicating that no car was found with the given license plate
    }

    // Method to display available cars
    public void displayAvailableCars() {
        System.out.println("Vehicles Available For Rent:"); // Print a header indicating available cars
        for (Car car : cars) { // Iterate over each car in the cars list
            if (!car.isRented()) { // Check if the car is not currently rented
                System.out.println(car); // Print the car object (calls the toString method)
            }
        }
    }
}

// Main class for the Car Rental System
public class CarRentalSystem {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

        // Create car objects
        Car car1 = new Car("KCA110Y", "Mitsubishi Lancer"); // Create a Car object with license plate "KCA110Y" and model "Mitsubishi Lancer"
        Car car2 = new Car("KBZ345E", "Toyota Probox"); // Create a Car object with license plate "KBZ345E" and model "Toyota Probox"
        Car car3 = new Car("KDL789P", "Nissan Note"); // Create a Car object with license plate "KDL789P" and model "Nissan Note"
        Car car4 = new Car("KAA456Q", "Subaru Impreza"); // Added car
        Car car5 = new Car("KBC789A", "Honda Fit");      // Added car

        // Create customer objects
        Customer customer1 = new Customer("C001", "John Doe"); // Create a Customer object with customer ID "C001" and name "John Doe"
        Customer customer2 = new Customer("C002", "Jane Smith"); // Create a Customer object with customer ID "C002" and name "Jane Smith"
        Customer customer3 = new Customer("C003", "Peter Kim");   // Added customer
        Customer customer4 = new Customer("C004", "Alice Johnson"); // Added customer

        // Create rental agency
        RentalAgency agency = new RentalAgency(); // Create a RentalAgency object

        // Add cars to the agency
        agency.addCar(car1); // Add car1 to the agency's inventory
        agency.addCar(car2); // Add car2 to the agency's inventory
        agency.addCar(car3); // Add car3 to the agency's inventory
        agency.addCar(car4);
        agency.addCar(car5);

        // Add customers to the agency
        agency.addCustomer(customer1); // Add customer1 to the agency's customer list
        agency.addCustomer(customer2); // Add customer2 to the agency's customer list
        agency.addCustomer(customer3);
        agency.addCustomer(customer4);

        // Display available cars
        agency.displayAvailableCars(); // Call the method to display the available cars

        // User input for renting a car
        System.out.print("Enter the license plate of the car to rent: "); // Prompt user to enter the license plate of the car to rent
        String rentLicensePlate = scanner.nextLine(); // Read the license plate entered by the user
        agency.rentCar(rentLicensePlate); // Call the rentCar method with the provided license plate

        // Display available cars after renting
        agency.displayAvailableCars(); // Call the method to display the available cars

        // User input for returning a car
        System.out.print("Enter the license plate of the car to return: "); // Prompt user to enter the license plate of the car to return
        String returnLicensePlate = scanner.nextLine(); // Read the license plate entered by the user
        agency.returnCar(returnLicensePlate); // Call the returnCar method with the provided license plate

        // Display available cars after returning
        agency.displayAvailableCars(); // Call the method to display the available cars

    }
}

