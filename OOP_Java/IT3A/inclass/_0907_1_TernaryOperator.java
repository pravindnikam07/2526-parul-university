
public class _0907_1_TernaryOperator {

    public static void main(String[] args) {
        // ternary operator ?

        int age = 13;

        // syntax: 
        // variable = (condition) ? value if condition is true : value if condition is false;
        // first way
        String msg = age >= 18 ? "You are eligible to cast a vote." : "You are not eligible to cast a vote.";
        System.out.println(msg);

        // sencond way
        System.out.println(age >= 18 ? "You are eligible to cast a vote." : "You are not eligible to cast a vote.");
    }
}
