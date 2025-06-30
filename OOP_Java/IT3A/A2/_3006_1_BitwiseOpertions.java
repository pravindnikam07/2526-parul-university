public class _3006_1_BitwiseOpertions {
    
    public static void main(String[] args) {
        // Bitwise operations
        /*
        & => and 
        | => or 
        ^ => Xor 
        ~ => complement
        >> => right shift operator
        << => left shift 
        >>> => unsigned operator
        */

        int a = 5; // 0101
        int b = 3; // 0011

        // Bitwise AND
        System.out.println("Bitwise AND: " + (a & b)); // 0001 -> 1

        // Bitwise OR
        System.out.println("Bitwise OR: " + (a | b)); // 0111 -> 7

        // Bitwise XOR
        System.out.println("Bitwise XOR: " + (a ^ b)); // 0110 -> 6

        // Bitwise NOT
        System.out.println("Bitwise NOT of a: " + (~a)); // 1010 -> -6

        // Left Shift
        System.out.println("Left Shift of a: " + (a << 1)); // 1010 -> 10

        // Right Shift
        System.out.println("Right Shift of a: " + (a >> 1)); // 0010 -> 2


        
        System.out.println("bitwise And: " + bitwiseAnd(3,2));  // 0011 & 0010 = 0010 -> 2
        System.out.println("bitwise Or: " + bitwiseOr(3,2));    // 0011 | 0010 = 0011 -> 3
        System.out.println("bitwise Xor: " + bitwiseXor(3,2));  // 0011 ^ 0010 = 0001 -> 1
        System.out.println("bitwise Complement: " + bitwiseComplement(3));  // ~0011 = 1100 -> -4 (in 2's complement representation)
        System.out.println("bitwise Left Shift: " + bitwiseLeftShift(3, 2));    // 0011 << 2 = 1100 -> 12
        System.out.println("bitwise Right Shift: " + bitwiseRightShift(3, 2));  // 0011 >> 2 = 0000 -> 0
        
    }

    // bitwise and &
    public static int bitwiseAnd(int a, int b) {
        return a & b;
    }
    
    // bitwise or |
    public static int bitwiseOr(int a, int b) {
        return a | b;
    }

    // bitwise xor ^
    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }

    // bitwise complement ~
    public static int bitwiseComplement(int a) {
        return ~a;
    }

    // bitwise left shift <<
    public static int bitwiseLeftShift(int a, int positions) {
        return a << positions; // bitwise left shift <<
    }

    // bitwise right shift >>
    public static int bitwiseRightShift(int a, int positions) {
        return a >> positions; // bitwise right shift >>
    }
}
