public class _0207_1_TypeCasting {

    public static void main(String[] args) {
        
        // Implicit type casting

        byte b = 30;
        int i  = b;  // implicit type casting from byte to int
        System.out.println(i);  // 30 of int type
        System.out.println(b); // 30 of byte type


        // Explicit type casting
        long l = 100000;
        int i1 = (int) l;   // explicit type casting from long to int
        System.out.println(i1);  // 100000 of int type
        System.out.println(l); // 100000 of long type



        // Example of explicit type casting with loss of data
        int num = 1000;
        byte b1 = (byte)num;  // explicit type casting from int to byte
        System.out.println(b1);  // byte type
    }
    
}
