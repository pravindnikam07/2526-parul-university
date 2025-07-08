
public class _0707_2_ConditionalStatments {

    public static void main(String[] args) {

        // nested if else statement
        /* 
        if (condition1) {
            if (condition2) {

            } else {

            }
        } else {

            if (condition3) {
            } else {

            }
        }
         */
        // print even if your number is even and print even and 
        // divisible by 3 if it is even and divisible by 3
        // else print odd
        // nested if else statement
        int number = 12;
        if (number % 2 == 0) {
            if (number % 3 == 0) {
                System.out.println("The number is even and divisible by 3.");
            } else {
                System.out.println("The number is even.");
            }
        } else {
            System.out.println("The number is odd.");
        }

        // using if else if ladder
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("The number is even and divisible by 3");
        } else if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
