public class _0107_3_StaticVariable {
    
// Static variable
// 1. static variables are created inside the class and outside the method with static keyword
// 2. static variable are part of class and equally shared with all the objects.
// 3. only one instance of static variable is getting created
// 4. static variable can be accessed using class name or object reference

static int staticVariable = 30;   // Static variable

    public static void main(String[] args) {
    System.out.println(staticVariable); // if you are accessing inside the same class where it is declared
    
    System.out.println(_0107_3_StaticVariable.staticVariable); // if you want to access outside the class it is declared
    
    _0107_3_StaticVariable obj = new _0107_3_StaticVariable();
    _0107_3_StaticVariable obj2 = new _0107_3_StaticVariable();
    
    obj.staticVariable = 50;
    
    System.out.println(obj.staticVariable); // 50
    System.out.println(obj2.staticVariable);// 50
    
    }
}
