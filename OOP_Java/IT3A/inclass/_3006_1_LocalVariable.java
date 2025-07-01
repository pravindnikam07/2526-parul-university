public class _3006_1_LocalVariable {
    // Local Variable => is part of your method
    // Local variable is declared inside a method, constructor or block
    // Local variable is created when the method, constructor or block is entered and destroyed when exited
    // Local variable must be initialized before use   

    public static void main(String[] args) {
        int localVariable = 20;   // Local Variable => you are allow to access inside the same block of code
        System.out.println("Local variable: " + localVariable);
    
        
    }
    
    public int add(int a, int b) { // a and b are also a local variables
        // System.out.println(localVariable); // you are not allow to access 
        
        return a + b;
    }
}
    
    