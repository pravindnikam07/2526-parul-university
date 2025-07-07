
import java.util.Scanner;

public class _0707_1_Experiment3 {

    // Write a Java program that uses loops to take multiple student’s marks,
    // determines grades using if-else, and provides remarks using switch-case.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int noOfStudents = input.nextInt();

        for (int i = 0; i < noOfStudents; i++) {

            System.out.print("Enter marks for student " + i);
            int marks = input.nextInt();

            // determine the grade of the student using if-else
            char grade;

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

            // provide the remarks to the student using switch case base on the grade
            // switch case syntax
            // switch (varible) {
            //     case value1 : {code block}
            //         break;
            //     case value2 : {code block}
            //         break;
            //     default : {code block}
            // }
            switch (grade) {
                case 'O':
                    System.out.println("Outstanding! Keep up the great work!");
                    break;
                case 'A':
                    System.out.println("Excellent! you have done good job");
                    break;
                case 'B':
                    System.out.println("Good job! You can do even better");
                    break;
                case 'C':
                    System.out.println("Satisfactory! You need to work harder");
                    break;
                case 'D':
                    System.out.println("Pass! You need to improve your performance");
                    break;
                case 'F':
                    System.out.println("Fail! You need to retake the exam");
                    break;

                default:
                    System.out.println("Enter the valid marks between 0 to 100");
            }

        }
    }
}
