
import java.util.Scanner;

public class _0707_1_ConditionalStatments {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Conditional Statements

        /*
            1. if statement
            2. if else statement
            3. if else if statement (if else ladder)
            4. switch statement
            5. ternary operator (conditional operator)
         */
        // 1. if statement
        int age = 17;
        if (age >= 18) {
            System.out.println("You are eligible to cast a vote.");
        }
        // 2. if else statement
        age = 15;
        if (age >= 18) {
            System.out.println("You are eligible to cast a vote.");
        } else {
            System.out.println("You are not eligible to cast a vote.");
        }
        // 3. if else if statement (if else ladder)
        System.out.println("Enter your age in integer: ");
        age = input.nextInt();
        if (age > 18) {
            System.out.println("You are eligible to cast a vote.");
        } else if (age == 18) {
            System.out.println("You are just eligible to cast a vote.");
        } else {
            System.out.println("You are not eligible to cast a vote.");
        }

    }
}
