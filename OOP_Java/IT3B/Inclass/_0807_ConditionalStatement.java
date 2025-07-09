
public class _0807_ConditionalStatement {

    public static void main(String[] args) {

        // if
        //syntax 
        // if(conditon) {
        //     // code block if condition is true
        // }
        // if else
        // syntax
        // if(condition) {
        //     // code block if condtion is true
        // }
        // else {
        //     // code block if condition is false
        // }
        // Write a program that takes an integer input 
        // from the user and prints whether the number is even or odd.
        int number = 5;

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // if else ladder
        // if(condition1) {
        //     // code block if condtion is true
        // } else if (condition2) {
        //     // code bloc if condition2  is true
        // }
        // else if (condition3) {
        //     // code bloc if condition3 is true
        // }
        // else {
        //     // code bloc if all conditions are false
        // }
        // ternary operator ?
        int num = 6;
        System.out.println(num % 2 == 0 ? "The number is even" : "The number is odd");
    }
}
