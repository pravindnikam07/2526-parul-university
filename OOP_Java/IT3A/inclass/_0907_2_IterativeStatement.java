
public class _0907_2_IterativeStatement {

    public static void main(String[] args) {

        // for loop
        // WAP to print number from 1 to 10 
        // syntax:
        /*
         
            for(initialization; condition; increment/decrement) {
                // body of loop
            }

         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while loop
        // WAP to print number from 1 to 10

        /*
         
        initialization;
        while(condition) {
            // body of loop
            increment/decrement;
        }
         */
        // increment in while loop body
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // increment in condition
        while (i++ <= 10) {
            System.out.println(i);
        }

        // do-while loop
        // syntax:
        /*
        initialization;
        do {
         // body
        } while(condition);
         */
        // WAP to print number from 1 to 10
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        // for-each loop
        int[] arr = {1, 2, 3, 4, 5, 6};

        // syntax:
        /*
         for(dataType variableName: arrayofElements) {
            // body of loop
         }
         */
        for (int nums : arr) {
            System.out.println(nums);
        }
    }
}
