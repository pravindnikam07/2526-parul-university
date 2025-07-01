public class _3006_2_InstanceVariable {
    // Instance Variable => is part of your object
    // Instance variable is declared in a class, but outside any method, constructor or block
    // Instance variable is created when the object is created and destroyed when the object is destroyed
    // Instance variable can be accessed by all methods, constructors and blocks in the class
    // Instance variable can be initialized when the object is created or at the time of declaration
    // Instance variable can be accessed by using the object reference

    int instanceVariable = 30; // instance or non-static Variable => is part of your object
  
    public static void main(String[] args) {
      
        _3006_2_InstanceVariable mainObj = new _3006_2_InstanceVariable();
      
        _3006_2_InstanceVariable mainObj2 = new _3006_2_InstanceVariable();
      
        mainObj.instanceVariable = 70;  // Changing the value of instance variable for mainObj
        
        System.out.println(mainObj);    // Printing the object reference    
        System.out.println(mainObj.instanceVariable);   // Accessing instance variable using object reference
        System.out.println(mainObj2.instanceVariable);  // Accessing instance variable using another object reference
      
      
        mainObj = null;   // Setting the reference to null does not destroy the object immediately
    }
}


