package payroll;

import java.util.Scanner;

class Person {

    Scanner payroll = new Scanner(System.in);

    String name, new_address;
    int Age;

    void personal_info() {
        System.out.println("Enter name: ");
        name = payroll.next();

        System.out.println("Enter age: ");
        Age = payroll.nextInt();
        
        Scanner change = new Scanner(System.in);
        System.out.println("Would you like to change your address? (Y/N)");
        char address = change.next().charAt(0);

        if (address == 'Y' || address == 'y') {
            System.out.println("Enter your new address: ");
            new_address = payroll.next();
        } else if(address == 'N' || address == 'n'){
            System.out.println("Continue......");
        } else {
            System.out.println("Invalid Input");
        }
    }
}


public class Persons {

    public static void main(String[] args) {
        Teacher person1 = new Teacher();
        person1.personal_info();
        person1.compute_netsal();
    }
}
