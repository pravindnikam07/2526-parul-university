import java.util.Scanner;

public class _0207_2_Experiment3 {
    // Write a Java program that uses loops to take multiple student’s marks,
    // determines grades using if-else, and provides remarks using switch-case.

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Enter marks for student " + i + ": ");
            int marks = input.nextInt();

            char grade;
            // here we are assigining the grade to the student marks
            if(marks > 100) {
                grade = 'X'; // Invalid marks
            }
            else if(marks >= 91) {
                grade = 'A';
            }
            else if(marks >= 81) {
                grade = 'B';
            }
            else if(marks >= 61) {
                grade = 'C';
            }
            else if(marks >=40) {
                grade= 'D';
            }
            else {
                grade = 'F';
            }


            switch (grade) {
                case 'A' : System.out.println("Student " + i + " has grade A. Excellent work!"); 
                    break;
                case 'B' : System.out.println("Student " + i + " has grade B. Very good work!"); 
                    break;  
                case 'C' : System.out.println("Student " + i + " has grade C. Good work!"); 
                    break; 
                case 'D' : System.out.println("Student " + i + " has grade D. Average work!"); 
                    break; 
                case 'F' : System.out.println("Student " + i + " has grade F. Needs improvement!");
                    break;
                default:
                    System.out.println("Enter the correct marks for student " + i + ".");
            }
        }
    }
}
