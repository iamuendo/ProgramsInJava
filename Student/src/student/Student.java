package student;
import java.util.Scanner;
/**
 *
 * @author: Muendo Isaac Maingi
 * Admission no: BSE-01-0084/2025
 * Using Reference Variables
 */
class Student {
    
    private int admno;
    private String sname;
    private float eng, math, science, total;
    
    public Student(int admno, String sname, float eng, float math, float science, float total ){
        this.admno = admno;
        this.sname = sname;
        this.eng = eng;
        this.math = math;
        this.science = science;
        this.total = total;
    }
    
    public void Takedata() {
        Scanner data = new Scanner(System.in);
        
        System.out.println("Enter your admission number: ");
        int admno = data.nextInt();
        
        System.out.println("Enter the student's name: ");
        String sname = data.next();
        
        System.out.println("Enter the marks for english: ");
        float eng = data.nextFloat();
        
        System.out.println("Enter the marks for math: ");
        float math = data.nextFloat();
        
        System.out.println("Enter the marks for science: ");
        float science = data.nextFloat();
        
    }
    
    public void ctotal() {
        
       
    }
    
   
    public static void main(String[] args) {
        
    }
    
}
