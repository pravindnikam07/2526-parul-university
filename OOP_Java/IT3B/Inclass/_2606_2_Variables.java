public class _2606_2_Variables {

     
  int instanceVariable = 10; // instanceVariable non static variable
  static int staticVariable = 100; // staticVariable
  
  
  public static void main(String[] args) {
      
      int localVariable = 4; // localVariable
      
      System.out.println("localVariable : " + localVariable );
      
      // System.out.println(instanceVariable); // you can't access instanceVariable without creating object inside static area
      
      _2606_2_Variables main = new _2606_2_Variables();
      System.out.println("instanceVariable " + main.instanceVariable); // you can assess instanceVariable
  
      System.out.println("staticVariable" + staticVariable);
    
  }
  
  void fun1() {
    System.out.println(instanceVariable); // you can access instanceVariable in non static area
  }
}
