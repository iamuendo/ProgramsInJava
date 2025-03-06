/*
Write a JAVA program that accept the dimensions of a rectangle and a rhombus. 
The program should then use an overloaded function named area to determine area of the respective figures. 
Output the dimensions and areas of the figures. Rectangle = l*w Rhombus = b × h.
 */
package shapeoverload;

import java.util.Scanner;

/**
 *
 * @author BSE-01-0024/2025
 */
public class ShapeOverload {

    void area(int length, int width) {
        int rectArea = length * width;
        System.out.printf("The area of a rectangle is = %d\n", rectArea);
    }

    // Overloaded by changing data type
    void area(int length, float height) {
        float rhombusArea = length * height;
        System.out.printf("The area of a rectangle is = %.2f\n", rhombusArea);
    }

    public static void main(String[] args) {
        int length, width;
        float height;

        Scanner dimension = new Scanner(System.in);

        System.out.println("Enter length of Rectangle");
        length = dimension.nextInt();

        System.out.println("Enter width of Rectangle");
        width = dimension.nextInt();

        System.out.println("Enter length of Rhombus");
        length = dimension.nextInt();

        System.out.println("Enter length of Rectangle");
        height = dimension.nextFloat();

        ShapeOverload shape = new ShapeOverload();

        shape.area(length, width);
        shape.area(length, height);

    }

}
