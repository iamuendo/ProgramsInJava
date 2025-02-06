/**
 * 
 * @author: Muendo Isaac Maingi
 * Admission Number: BSE-01-0084/2025
 * 
 */

package loginprogram;
import java.io.Console;

public class LoginProgram {
    public static void main(String[] args) {
        // Predefined username and password for demonstration
        String correctUsername = "user123";
        String correctPassword = "pass123";

        // Create a Console object to read user input securely
        Console console = System.console();
        
        // Check if console is available (it may not be in some IDEs)
        if (console == null) {
            System.out.println("No console available. Please run this program in a terminal.");
            return;
        }

        int attempts = 0; // Number of attempts made

        while (attempts < 3) { // Allow up to 3 attempts
            // Prompt for username
            String username = console.readLine("Enter your username: ");
            
            // Prompt for password and mask input with *
            char[] passwordArray = console.readPassword("Enter your password: ");
            String password = new String(passwordArray); // Convert char array to String
            
            // Check if the entered credentials are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!"); // Successful login message
                return; // Exit the program on successful login
            } else {
                System.out.println("Incorrect username or password. Please try again."); // Error message
                attempts++; // Increment the attempt counter
            }
        }

        System.out.println("Too many failed attempts. Access denied."); // Deny access after 3 failed attempts
    }
}
