
public class _2306_1_DataTypes {
    public static void main(String[] args) {
      // Data Types
      
      /*
      1. Primitive data Types
        A. Numeric 
          1. Integer Types
            1. byte => default 0 => Examples 1,2,3,5,6,...., => size 1 byte (8 bit) => Range 127 to -128 => total 255 => 2^8/2 - 1
            2. short => 0 => Examples 1,2,3,5,6,...., => size 2 byte (16 bit) => Range 2^16/2 -1 to -2^16/2
            3. int  => 0  => Examples 1,2,3,5,6,.... => size 4 byte (32 bit) => Range 2^32/2 -1 to -2^32/2
            4. long => 0 => Examples 1,2,3,5,6,.... => size 8 byte (64 bit) => Range 2^64/2 -1 to -2^64/2
            
          2. Floating types
            1. float => 0.0f => Examples 1.1f, 4.5f, 234.1245f,..... => size 4 byte (32 bit)
            2. double => 0.0 => Examples 1.234, 435.234, 234.56,.... => size 8 byte (64 bit)
        
        B. Non Numeric
          1. char => '\000u' => Examples 'A', 'b', '2',.... => size 1 byte (8 bit) => more than 65500 char
          2. boolean => false => Examples true, false.      => size 1 byte (8 bit)
      
      2. Non primitive types/reference
        Array, String, object => default null
        1. Linear data types => Array, String, LinkedList, 
        2. Non linear types => Graph, tree, tries
      */
      
      
      
      // byte 
      System.out.println("======= byte =========");
      // data_type variable_name = value;  // initialization and declaration
      byte num = 25;      // declaration and initialization
      System.out.println(num);
      
      // data_type variable_name;         // declaration
      // variable_name = value;           // initialization
      byte b;     // declaration
      b = 23;     // initialization
      System.out.println(b);
      
      
      // short
      System.out.println("======= short =========");
      short s = 233;
      System.out.println(s);
      
      
      // int
      System.out.println("======= int =========");
      int i = 23345;
      System.out.println(i);
      
      
      // long
      System.out.println("======= long =========");
      long l = 23132456;
      System.out.println(l);
      
      
      // float
      System.out.println("======= float =========");
      float f = 12.3f;
      System.out.println(f);
      
      
      // double
      // float
      System.out.println("======= double =========");
      double d = 123.23;
      System.out.println(d);
      
      
      
      
  }
}