
public class _2306_2_ArithmaticOperation {
    
    public static void main(String[] args) {
        // Arrithmatic operation 
        /*
        +
        -
        /
        *
        %
        */
        
        
        // Addition +
        // Approach 1: creating variables and add it (Procedural programming)
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
        
        // Approad 2: Creating a add method
        int c = add(11, 13); // 24
        System.out.println(c);
        System.out.println(add(11, 13)); // 24
        System.out.println(add(3, 35));
        System.out.println(add(19048, 1234));
        
        
        System.out.println(add(123.23f, 2.25f));
        
        
    }
    
    // Syntax for creating Method 
    // access_modifier static return_type methodName(parameters) {// body} // Static method
    // access_modifier return_type methodName(parameters) {// body} // non static method
    
    public static int add(int a, int b) {
    // int sum = a + b;
    // return sum;
    
    return a + b;
    }
    
    public static float add(float a, float b) {
    return a + b;
    }
    
}
