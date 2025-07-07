
import java.util.Scanner;

public class _0707_1_Experiment3 {

    // Write a Java program that uses loops to take multiple student’s marks,
    // determines grades using if-else, and provides remarks using switch-case.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int noOfStudents = input.nextInt();

        for (int i = 0; i < noOfStudents; i++) {

            System.out.println("Enter the marks obtained (0-100) for student " + (i + 15));
            int marks = input.nextInt();

            char grade;

            // Assigning the grade
            if (marks > 100 || marks < 0) {
                grade = 'X';
            } else if (marks > 90) {
                grade = 'O';
            } else if (marks > 80) {
                grade = 'A';
            } else if (marks > 70) {
                grade = 'B';
            } else if (marks > 50) {
                grade = 'C';
            } else if (marks >= 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Providing the remarks
            // Switch 
            // syntax
            // switch(variable) {
            //     case value1: {// code block}
            //         break;
            //     case value2: {// code block}
            //         break;
            //     default: {// code block}
            // }
            // switch (grade) {
            //     case 'O':
            //         System.out.println("Outstanding");
            //         break;
            //     case 'A':
            //         System.out.println("Excellent");
            //         break;
            //     case 'B':
            //         System.out.println("Very Good");
            //         break;
            //     case 'C':
            //         System.out.println("Good");
            //         break;
            //     case 'D':
            //         System.out.println("Average");
            //         break;
            //     case 'F':
            //         System.out.println("Fail");
            //         break;
            //     default:
            //         System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
            // }
            // swtich case with lambda expression (after java)
            switch (grade) {
                case 'O' ->
                    System.out.println("Outstanding");
                case 'A' ->
                    System.out.println("Excellent");
                case 'B' ->
                    System.out.println("Very Good");
                case 'C' ->
                    System.out.println("Good");
                case 'D' ->
                    System.out.println("Average");
                case 'F' ->
                    System.out.println("Fail");
                default ->
                    System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
            }
        }

        input.close();
    }
}
