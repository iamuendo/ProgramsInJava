package employeewages;
import java.util.Scanner;

/**
 *
 * @author Dev
 */
public class EmployeeWages {
    
    private static final double RatePerHour = 100.00;
    private static final double LunchAllowance = 200.00;
    private static final double IncomeTaxRate = 0.30;
    
    static void processSalary(int workingHours) {
        double basicSalary = workingHours * RatePerHour;
        double grossSalary = basicSalary + LunchAllowance;
        double incomeTax = grossSalary * IncomeTaxRate;
        double netPay = grossSalary - incomeTax;
        
        System.out.println("Employee Salary Details");
        System.out.printf("Basic Salary = %.2f%n", basicSalary);
        System.out.printf("Lunch Allowance = %.2f%n", LunchAllowance);
        System.out.printf("Gross Salary = %.2f%n", incomeTax);
        System.out.printf("Net Pay = %.2f%n", netPay);
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of hours worked: ");
        int hoursWorked = scanner.nextInt();        
        processSalary(hoursWorked);
    }
    
}
