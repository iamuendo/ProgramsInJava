/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seedlinggrowthprediction;
import java.util.Scanner;


/**
 *
 * @author Dev
 */
public class SeedlingGrowthPrediction {
    
    Scanner scanner = new Scanner(System.in);
    void predictHeight(){
        System.out.println("Enter the initial height: ");
        double initialHeight = scanner.nextDouble();
        
        System.out.println("Enter the growth rate: ");
        double growthRate = scanner.nextDouble();
        
        System.out.println("Enter the no. of days to simulate: ");
        int days = scanner.nextInt();
        
        double height = initialHeight;
        
        for (int day = 1; day <= days; day++){
            height += growthRate;
            System.out.printf("Day %d: Height= %.2f cm%n", day, height);
        }
        
    }
        
            
    public static void main(String[] args) {
        // TODO code application logic here
        SeedlingGrowthPrediction growth = new SeedlingGrowthPrediction();
        growth.predictHeight();
    }
    
}
