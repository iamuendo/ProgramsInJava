/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

import java.util.Scanner;
/**
 *
 * @author Dev
 */
public class TemperatureConverter {

    static void computeTempInDegrees() {
        double fahrenheit;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        
        System.out.println(fahrenheit + " degrees Fahrenheit is " + String.format("%.2f", celsius) + " degrees Celsius");
        
        scanner.close();
    }
    
    static void computeTempInFahrenheit() {
        double celsius;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celsius: ");
        celsius = scanner.nextDouble();
        
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        
        System.out.println(celsius + " degrees Celsius is " + String.format("%.2f", fahrenheit) + " degrees Fahrenheit");
        
        scanner.close();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Conversion Menu:");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                computeTempInDegrees();
                break;
            case 2:
                computeTempInFahrenheit();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
        
        scanner.close();
    }
    
}
