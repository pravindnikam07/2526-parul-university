// import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      // to create a variable
      // data_type variable_name = value;
      
      // String name = "Ravi Kumar";
      
      // System.out.println("Name:- " + name);
      
      
      // difference between print and println method
      // System.out.print(1);
      // System.out.println(2);
      // System.out.print(3);
      // System.out.print(4);
      
      
      //WAP to print your details
      // String name = "you name";
      // int age = 23;
      // String collegeName = "your college name";
      
      // System.out.println("Name: " + name);
      // System.out.println("Age: " + age);
      // System.out.println("College Name: " + collegeName);
      
      
      // to create a object 
      // class_name object_name = new class_name(parameter_optional);
      // Main mainObj = new Main();
      
      
      
      // Scanner class
      // Scanner input = new Scanner(System.in);
      
      // next() => to take space seperated String input
      // nextLine() => to take entire line String input
      // nextInt() => to take integet input
      
      
      /* 
      String => next() or NextLine()
      byte  => nextByte()
      short => nextShort()
      int   => nextInt()
      long  => nextLong()
      float => nextFloat()
      double => nextDouble()
      boolean => nextBoolean()
      char => don't have method to take user input
      */
      
      // WAP to print your details by taking user 
      // input from console 
      
      Scanner input = new Scanner(System.in);
      String fName = input.next();
      String lName = input.next();
      int age = input.nextInt();
      
      System.out.println(fName);
      System.out.println(lName);
      System.out.println(age);
      
      input.close();
      
  }
}