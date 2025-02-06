/**
 * 
 * @author: Muendo Isaac Maingi
 * Admission Number: BSE-01-0084/2025
 * 
 */

import java.io.Console;  // Import the Console to display input dialog in the terminal
import java.util.Scanner;  // Import the Scanner class for reading user input

public class LoginProgram {

    private String username = "isaac";  // Define the default username
    private String password = "BSE-01-0084/2025";  // Define the default password
    private int loginAttempts = 0;  // Initialize the number of login attempts
    private final int MAX_ATTEMPTS = 3;  // Define the maximum number of login attempts

    public void login() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for reading input

        while (loginAttempts < MAX_ATTEMPTS) {  // Loop until the maximum number of attempts is reached
            System.out.print("Enter username: ");  // Prompt the user to enter their username
            String myUsername = scanner.nextLine();  // Read the username entered by the user
            System.out.print("Enter password: ");  // Prompt the user to enter their password
            String myPassword = getPassword(scanner);  // Call the getPassword method to read the password securely

            if (myUsername.equals(username) && myPassword.equals(password)) {  // Check if the entered username and password match the default values
                System.out.println("Login successful!");  // Print a success message if the login is successful
                scanner.close();  // Close the scanner
                return;  // Exit the login method
            } else {
                System.out.println("Login failed.");  // Print a failure message if the login fails
                loginAttempts++;  // Increment the number of login attempts
            }
        }

        System.out.println("Maximum login attempts reached.");  // Print a message if the maximum number of attempts is reached
        scanner.close();  // Close the scanner
    }

    private String getPassword(Scanner scanner) {
        Console console = System.console();  // Get the system console
        if (console != null) {  // Check if the console is available (e.g., running in a terminal)
            char[] passwordArray = console.readPassword();  // Read the password from the console without echoing it
            if (passwordArray != null) {  // Check if the password array is not null
                return new String(passwordArray);  // Convert the password array to a String and return it
            } else {
                return "";  // Handle potential null case by returning an empty string
            }
        } else {  // If the console is not available (e.g., running in an IDE)
            StringBuilder passwordBuilder = new StringBuilder();  // Create a StringBuilder to build the password
            Scanner lineScanner = new Scanner(System.in);  // Use a separate scanner for reading lines

            String input = lineScanner.nextLine();  // Read the whole line at once

            for (int i = 0; i < input.length(); i++) {  // Loop through each character in the input
                passwordBuilder.append(input.charAt(i));  // Append the character to the password builder
                System.out.print("*");  // Print an asterisk for each character
            }
            System.out.println();  // Move to the next line after password entry
            return passwordBuilder.toString();  // Convert the password builder to a String and return it
        }
    }


    public static void main(String[] args) {
        new LoginProgram().login();  // Create a new LoginProgram object and call the login method
    }
}


