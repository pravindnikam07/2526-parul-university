
public class _1007_1_IterativeStatments {

    public static void main(String[] args) {

        // Iterative statments in Java
        // 1. for loop
        // 2. while loop
        // 3. do-while loop
        // 4. enhanced for loop (for-each loop)
        // example of for loop
        // WAP to print 1 to 10 numbers 
        /*
            syntax of for loop:
            
            for(initialization; conditions; increment/decrement){
                // code to be executed
                // may have 1000 line of code
            }
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while loop example
        // WAP to print the numbers from 1 to 10 using while loop

        /*
         syntax of while loop:
            initialization;
            while(condition) {
                // code to be executed}
                // increment/decrement
            }
         */
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // do-while loop example
        // WAP to print the numbers from 1 to 10 using do-while loop
        /*
         
        syntax of do-while loop:

        initialization;
        do{
            // code to be executed
            // increment/decrement
        } while(condition);

         */
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

    }
}
