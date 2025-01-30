
package gradebook;
import java.util.Scanner;


/**
 *
 * @author BSE-01-0084/2025
 */
class GradeBook {
    Scanner scanner = new Scanner(System.in);
    
    void grading(){
        System.out.println("Enter the students score:");
        int score = scanner.nextInt();
        
        if (score >=70)
            System.out.println("Student scored an A");
        if (score < 70 && score >=60)
            System.out.println("Student scored an B");
        if (score < 60 && score >=50)
            System.out.println("Student scored an C");
        if (score < 50 && score >=40)
            System.out.println("Student scored an D");
        if (score < 39)
            System.out.println("Student scored an E (fail)");
    }


    public static void main(String[] args) {
        GradeBook student = new GradeBook();
        student.grading();
    }
    
}