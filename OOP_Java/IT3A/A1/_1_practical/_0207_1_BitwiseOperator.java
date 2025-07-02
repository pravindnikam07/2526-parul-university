
public class _0207_1_BitwiseOperator {
    
    public static void main(String[] args) {
        
        // Bitwise operators
        /*
            & -> and
            | -> or
            ^ -> Xor
            ~ -> complementory
            << -> left shift
            >> -> right shift
         */


        int a = 5;
        int b = 4;

        // Bitwise AND
        int andResult = a & b; // output => 4 (0101 & 0100 = 0100)
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b; // output => 5 (0101 | 0100 = 0101)
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // output => 1 (0101 ^ 0100 = 0001)
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise Complement
        int complementResult = ~a; // output => -6 (inverts all bits)
        System.out.println("Bitwise Complement: " + complementResult);

        // Left Shift
        int leftShiftResult = a << 1; // output => 10 (0101 << 1 = 1010)
        System.out.println("Left Shift: " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 1; // output => 2 (0101 >> 1 = 0010)
        System.out.println("Right Shift: " + rightShiftResult);
        
    }
}
