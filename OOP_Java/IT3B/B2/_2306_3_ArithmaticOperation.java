import java.util.Scanner;

public class _2306_3_ArithmaticOperation {
    public static void main(String[] args) {
        
        // Arithmatic Operators
        /*
        +
        -
        /
        *
        %
        */
        
        int a = 20;
        int b = 10;
        // addition
        int sum = a + b;
        System.out.println("Addition of " + a + " and " + b + " => " + sum);
        
        int sub = a - b;
        System.out.println(sub);
        
        System.out.println(add(22, 12));
        System.out.println(subStract(30, 10));
        
        
        // Exrtra
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers for addition:");
        System.out.println(add(input.nextInt(), input.nextInt()));

        System.out.println("Enter two numbers for subtraction:");
        System.out.println(subStract(input.nextInt(), input.nextInt()));

        System.out.println("Enter two numbers for multiplication:");
        System.out.println(multiply(input.nextInt(), input.nextInt()));

        System.out.println("Enter two numbers for division:");
        System.out.println(divide(input.nextInt(), input.nextInt()));

        System.out.println("Enter two numbers for modulus:");
        System.out.println(mod(input.nextInt(), input.nextInt()));
        
        input.close();
    }
    
    public static int add(int a, int b) {
        // int sum = a + b;
        // return sum;
        return a + b;
    }
    
    public static int subStract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0; // or throw an exception
        }
        return a / b;
    }
    
    public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0; // or throw an exception
        }
        return a % b;
    }
}
