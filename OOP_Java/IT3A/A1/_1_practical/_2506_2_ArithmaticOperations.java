public class _2506_2_ArithmaticOperations {
    
    public static void main(String[] args) {
        
        // Arithmetic Operations
        /*
            addition: +
            subtraction: -
            multiplication: *
            division: /
            modulus: % 
            increment: ++
            decrement: --
         */

         
         int a = 4;
         int b = 6;

         // addition
         int sum = a + b; // output => 10
         System.out.println(sum);

         // substraction
        int substract = a - b; // output => -2
        System.out.println(substract);


        System.out.println("Addition: " + add(5, 3));
        System.out.println("Addition: " + add(10, 20));
        System.out.println("Addition: " + add(100, 200));
        System.out.println("Addition: " + add(1000, 2000));
    }

    // create addition method
    // Syntax
    // accessModifier staticKeyword returnType methodName(parameter_optional) {// body}

    public static int add(int a, int b) {
        // int sum = a + b;
        // return sum;

        return a + b;
    }
}
