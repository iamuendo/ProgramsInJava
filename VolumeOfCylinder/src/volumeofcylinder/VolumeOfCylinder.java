package volumeofcylinder;

import java.util.Scanner;

/**
 *
 * @author Dev
 */
public class VolumeOfCylinder {
    
    private static final double PI = 3.142;
    
    static void volume(){
        double radius;
        int height;
        
        Scanner dimensions = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        radius = dimensions.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        height = dimensions.nextInt();
        
        double volume = PI * (radius * radius) * height;
        
        String formattedVolume = String.format("%.2f", volume);
        
        System.out.println("The volume of the cylinder is: " + formattedVolume);
        dimensions.close();
   
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         volume();
    }
    
}
