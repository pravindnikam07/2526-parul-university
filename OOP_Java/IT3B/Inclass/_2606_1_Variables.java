public class _2606_1_Variables {
      
      int a = 30; // Non static Instance Variable
      
      int b = 40; // Non static Instance Variable
      
      static int c = 50; // static Variable
      
      static int d = 60; // static Variable
      
      public static void main(String[] args) {
          
          int e = 80;   // Local Variable
          
          int f = 100;  // Local Variable
          
          
          _2606_1_Variables mainObj = new _2606_1_Variables();  // Local Variable
          
          _2606_1_Variables mainObj2 = new _2606_1_Variables(); // Local Variable
          
          mainObj.a = 1000;         // accessing instance Variable
          
          System.out.println(mainObj.a);
          
          System.out.println(mainObj2.a);
          
          // mainObj.c = 400;     // accessing static Variable
          c = 400;                // accessing static Variable
          
          System.out.println(mainObj.c);    //  accessing static Variable
          System.out.println(mainObj2.c);   // accessing static Variable
          System.out.println(c);        // accessing static Variable
          
      }
    }
