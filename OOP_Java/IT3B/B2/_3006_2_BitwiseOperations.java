public class _3006_2_BitwiseOperations {
    
    public static void main(String[] args) {
        // Bitwise operator
        /*
        & => and
        | => or 
        ^ => Xor 
        ~ => complement
        << => left shift
        >> => right shift
        */
        
        
        // int a = 5; // 101
        // int b = 4; // 100
        
        // // & and
        // System.out.println(a & b);  // output => 100 => 4
        // System.out.println(a | b);  // output => 101 => 5
        // System.out.println(a ^ b);  // output => 001 => 1
        // System.out.println(~a);  // output => -6 => ~00000101 => 11111010 => -6
        // System.out.println(a << 1);  // output => 1010 => 10
        // System.out.println(a >> 1);  // output => 10 => 2
        
        System.out.println(_3006_2_BitwiseOperations.bitwiseAnd(5, 4)); // output => 0101 & 0100 => 0100 => 4
        System.out.println(_3006_2_BitwiseOperations.bitwiseOr(5, 4)); // output => 0101 | 0100 => 0101 => 5
        System.out.println(_3006_2_BitwiseOperations.bitwiseXor(5, 4)); // output => 0101 ^ 0100 => 0001 => 1
        System.out.println(_3006_2_BitwiseOperations.bitwiseComplement(5)); // output => ~0101 => 1010 => -6
        System.out.println(_3006_2_BitwiseOperations.leftShift(5, 1)); // output => 0101 << 1 => 1010 => 10
        System.out.println(_3006_2_BitwiseOperations.rightShift(5, 1)); // output => 0101 >> 1 => 0010 => 2

        
    }
    
    // & => and
    public static int bitwiseAnd(int a, int b) {
    return a & b;
    }
    
    // implement following methods
    // | => or 
    public static int bitwiseOr(int a, int b) {
        return a | b;
    }

    // ^ => Xor 
    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }

    // ~ => complement
    public static int bitwiseComplement(int a) {
        return ~a;
    }

    // << => left shift
    public static int leftShift(int a, int positions) {
        return a << positions; // << => left shift 
    }

    // >> => right shift 
    public static int rightShift(int a, int positions) {
        return a >> positions; // >> => right shift 
    }
    
}
