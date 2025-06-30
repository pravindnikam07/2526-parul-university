public class _3006_1_ArithmaticOperationsNonStaticMethods {
    
    public static void main(String[] args) {
        
        // Creating an object of the class to access non-static methods
        _3006_1_ArithmaticOperationsNonStaticMethods calObj = new _3006_1_ArithmaticOperationsNonStaticMethods(); 
        
        // int sum = calObj.add(4, 5);
        // System.out.println("Addition: " + sum);
        
        
        System.out.println("Addition: " + calObj.add(4,5));             // Testing addition of 4 and 5 => 9
        System.out.println("Substraction: " + calObj.sub(23, 11));      // Testing substraction of 23 and 11 => 12
        System.out.println("Multiplication: " + calObj.mul(6, 7));      // Testing multiplication of 6 and 7 => 42
        System.out.println("Division: " + calObj.div(20, 4));           // Testing division of 20 by 4 => 5 
        System.out.println("Division by zero: " + calObj.div(20, 0));   // Testing division by zero
        System.out.println("Reminder: " + calObj.mod(20, 3));           // Testing reminder of 20 by 3 => 2

    }
    
    // Addition +
    public int add(int a, int b) {
        return a + b;
    }
    
    // Substraction
    public int sub(int a, int b) {
        return a - b;
    }
    
    // Multiplication
    public int mul(int a, int b) {
        return a * b;
    }

    // Division
    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    // Reminder
    public int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a % b;
    }
}