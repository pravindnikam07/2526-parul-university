public class _0107_2_InstanceVariable {
    
  
    // Instance Variable: 
    // 1. Instance variables are created inside the class and outside the method or constructor or block
    // 2. instance Variables are the part of object and 
    // are getting created when the object of that class is getting created
    // 2. destroy when the object is destroy.
    // 3. Instance variables are used to store the state of an object.
    // 4. Instance variables are non-static variables.
    // 5. Instance variables are accessible only through the object of the class.
    // 6. Instance variables can be accessed by all the methods, constructors, and blocks in the class.
    // 7. Instance variables can be accessed by the object of the class.

    String name = "Pranit";  // Instance Variable
    int age = 40;             // Instance Variable

    public static void main(String[] args) {
        
        _0107_2_InstanceVariable obj = new _0107_2_InstanceVariable();  // Main@47db50c5
        _0107_2_InstanceVariable obj2 = new _0107_2_InstanceVariable(); // Main@5c072e3f
        
        obj.name = "Ravi";
        
        
        System.out.println(obj.name); // Ravi
        System.out.println(obj2.name);// Pranit
    }
}
