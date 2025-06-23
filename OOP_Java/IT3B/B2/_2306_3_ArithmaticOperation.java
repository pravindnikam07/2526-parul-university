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
        System.out.println(add(input.nextInt(), input.nextInt()));
        
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
    
}
