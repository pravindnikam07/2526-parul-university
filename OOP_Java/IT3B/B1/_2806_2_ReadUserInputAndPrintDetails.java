import java.util.Scanner;

public class _2806_2_ReadUserInputAndPrintDetails {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your roll number: ");
        int roll = scanner.nextInt();
        
        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();
        
        System.out.println("Name: " + name);  // Print the name
        System.out.println("Roll: " + roll);  // Print the roll number
        System.out.println("Marks: " + marks);// Print the marks
        
        scanner.close(); // Close the scanner to avoid resource leak
    }
}
