public class _0307_1_TypeCasting {
    public static void main(String[] args) {
        // Type casting

        // 1. Implicit Casting (Widening)
        // Automatically converts a smaller data type to a larger data type.

        byte b = 20;
        int i = b; // byte to int || Implicit casting
        // i => int
        // b => byte


        int i1 = 1000;
        long l = i1; // int to long || Implicit casting



        // 2. Explicit Casting (Narrowing)
        // Manually converts a larger data type to a smaller data type.

        // Syntax:
        // dataType variableName = (dataType) value;

        int num1 = 130;
        byte num3 = (byte) num1; // int to byte || Explicit casting
        System.out.println(num3);   // Output: 50

        double d = 9.78;;
        float f = (float) d;    // double to float || Explicit casting
    }
}
