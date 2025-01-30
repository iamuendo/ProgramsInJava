package restaurantmenu;

import java.util.Scanner;

/**
 *
 * @author BSE-01-0084/2025
 */
class RestaurantMenu {
    
    Scanner scanner = new Scanner(System.in);
    void items(){        
        System.out.println("What would you like to order? Enter an option (1-5): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You have ordered Pilau plain");
                break;
            case 2:
                System.out.println("You have ordered Githeri beef");
                break;
            case 3:
                System.out.println("You have ordered Chapati Chicken");
                break;
            case 4:
                System.out.println("You have ordered Chips liver");
                break;
            case 5:
                System.out.println("You have ordered Rice bean");
                break;
            default:
                System.out.println("No selection made");
                break;
            
        }
            
                
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();
        menu.items();
    }
    
}