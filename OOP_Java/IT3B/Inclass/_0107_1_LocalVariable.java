public class _0107_1_LocalVariable {
    
    // Local Variable Example
    // Local variables are variables that are declared within a method, constructor, or block.
    // They are only accessible within that method, constructor, or block and are not visible outside of it.
    // Local variables must be initialized before use, and they do not have a default value.
    // Local variables are stored in the stack memory.
    // They are created when the method, constructor, or block is entered and destroyed when it is exited.
    // Local variables are not associated with any class or object.
    // They are typically used for temporary calculations or to hold values that are only needed within a specific scope.


    public static void main(String[] args) {
        // Local Variables: the  Variables which are created inside the method, constructor, block
        int a = 10;   // local variable
        
        System.out.println(a);
        
    }


    void sayHello() {
        String name = "Ravi"; // Local variable
    }


    {
        String name = "Ravi"; // Local variable
    }
}
