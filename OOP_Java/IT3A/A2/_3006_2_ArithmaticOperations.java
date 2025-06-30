public class _3006_2_ArithmaticOperations {
    public static void main(String[] args) {
        
        _3006_2_ArithmaticOperations calObj = new _3006_2_ArithmaticOperations();
        
        // int ans = add(4,5);
        // System.out.println("Addition: " + ans);
        System.out.println("Addition: " + calObj.add(4,5));
        System.out.println("Substract " + calObj.sub(23, 11));
    }
    
    // Addition
    public int add(int a, int b) {
        return a + b;
    }
    
    // Substract 
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
        return 0; // or throw an exception
        }
        return a / b;
    }

    // Reminder
    public int mod(int a, int b) {
        if (b == 0) {
        System.out.println("Division by zero is not allowed.");
        return 0; // or throw an exception
        }
        return a % b;
    }
}