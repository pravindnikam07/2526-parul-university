import java.util.Scanner;

public class _2306_2_ScannerClass {
    
    public static void main(String[] args) {
        // Scanner 
        
        // syntax
        // class_name object_name = new class_name(parametes);
        
        Scanner input = new Scanner(System.in);
        
        // next() => Space seperated user input in String format 
        // nextLine() => Line seperated user input in String format
        // nextInt() => Space seperated integer type input
        // nextBooelan => boolean type input
        // nextDouble() => for taking floating point input
        // nextFloat() => for taking floating point input
        // nextByte() => for taking integer input in byte range
        // nextShort() => for short type
        // nextLong() => for long type
        

        // next()
        // String name = input.next();
        // String lastName = input.next();
        // System.out.print(name + " ");
        // System.out.print(lastName);
        
        // nextLine()
        String fullName = input.nextLine();
        System.out.println(fullName);
        
        // nextInt();
        int age = input.nextInt();
        System.out.println(age);
        
        input.close();
    }
}