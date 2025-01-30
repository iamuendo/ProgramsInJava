package fruitvendor;

import java.util.Scanner;

/**
 *
 * @author Dev
 */
public class FruitVendor {
    
    Scanner scanner = new Scanner(System.in);
    
    void getFruit() {
        System.out.println("Select Your Favourite Fruit");
        System.out.println("O. Orange");
        System.out.println("A. Apple");
        System.out.println("B. Banana");
        System.out.println("Select a fruit: ");
        char choice = scanner.next().charAt(0);
        
        if(choice == 'O' || choice == 'o') {
            System.out.println("I love oranges");
        } 
        
        if (choice == 'A' || choice == 'a'){
                System.out.println("My best fruit is apple");
            }
        if (choice == 'B' || choice == 'b') {
                System.out.println("Bananas are sweet");
        }
        
        else {
            System.out.println("I don't know the taste");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FruitVendor fruitchoice = new FruitVendor();
        fruitchoice.getFruit();
    }
    
}
