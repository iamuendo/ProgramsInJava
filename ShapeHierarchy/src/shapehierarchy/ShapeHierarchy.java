package shapehierarchy;

/**
 *
 * @author: Muendo Isaac Maingi
 * Admission no: BSE-01-0024/2025
 * Using Reference Variables
 */


public class ShapeHierarchy {  
   
    public class Shape{
        int a, b;

        void initialize(){
                a = 14;
                b = 8;

        }
    }


        public class Triangle extends Shape{
             void area(){
                initialize();
                System.out.printf("Area = %.2f\n", (0.5*a*b));
             }      
        }

        public class Rectangle extends Shape{
            void area(){
                initialize();
                System.out.printf("Area = %.2f\n", (a*b));
            } 
        
        }      

        public static void main(String[] args) {
            Triangle shape1 = new Triangle();
            Rectangle shape2 = new Rectangle();
        
            shape1.area();
            shape2.area();
                    
        }
}
     


