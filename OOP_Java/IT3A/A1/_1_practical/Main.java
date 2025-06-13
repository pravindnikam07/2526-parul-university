// import java.util.*;
import java.util.Scanner;


public class Main {
  
  public static void main(String[] args) {
    // System.out.println("Hello Java");
    // System.out.print(1234);
    // System.out.println(345);
    // System.out.print(567);
    
    
    
    // scanner class
    // class_name variable_name = new class_name(parameter_optional);
    
    // Main mainObj = new Main();
    
    Scanner input = new Scanner(System.in);
    
    /*
    next() => for taking the String input with space seperation
    nextLine() => for taking the String input of entire line
    nextInt() => for taking the integer input
    nextBoolean() => for taking boolean input
    nextDouble()
    nextFloat()
    
    */
    
    
    // next()
    // String greeting = input.next();
    // String subjectName = input.next();
    // System.out.println(greeting + " " + subjectName);
    // System.out.println(subjectName);
    // System.out.println(subjectName);
    
    
    // String firstName = input.next();
    // String lastName = input.next();
    // System.out.println(firstName);
    // System.out.println(lastName);
    
    // String name = input.nextLine();
    // String name1 = input.nextLine();
    // System.out.println(name + name1);
    
    
    
    int num = input.nextInt();
    System.out.println(num);
    
    
    
    input.close(); 
    
    
    
    
    
    
    
    
    
    
  }
}