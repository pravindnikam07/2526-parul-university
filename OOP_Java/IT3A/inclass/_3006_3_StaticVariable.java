public class _3006_3_StaticVariable {
    // Static variable is a variable that is shared among all instances of a class.
    // It is associated with the class itself rather than any specific instance.
    // Static variables are initialized only once, at the start of the execution of the program.
    // They are stored in the static memory area and can be accessed without creating an instance of the class.
    // Static variables are declared using the static keyword and can be accessed using the class name or through an instance of the class.
    // Static variables are often used for constants or shared data that should be the same across all instances of a class.
    // Static variables can be accessed directly using the class name, or through an instance of the class.
    // Static variables can be modified, but changes will affect all instances of the class.
    // Static variables are not tied to any specific object, but rather to the class itself.
    // Static variables are shared among all instances of a class, meaning that if one instance changes the value of a static variable, it will affect all other instances.
  
    static int staticVariable = 50; // static varible => this are the part of class members
    
    public static void main(String[] args) {
        
        // you can access the static in following way
        // 1st way
        System.out.println(staticVariable);
        
        // 2nd way
        System.out.println(_3006_3_StaticVariable.staticVariable);
        
        // 3rd way
        _3006_3_StaticVariable mainObj = new _3006_3_StaticVariable();
        
        _3006_3_StaticVariable mainObj2 = new _3006_3_StaticVariable();
        
        // mainObj.staticVariable = 100;
        
        System.out.println(mainObj.staticVariable);
        System.out.println(mainObj2.staticVariable);
    }
}