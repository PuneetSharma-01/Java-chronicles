public class BitwiseOperator {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Bitwise AND
        System.out.println("a & b = " + (a & b));

        // Bitwise OR
        System.out.println("a | b = " + (a | b));

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));

        // Bitwise NOT
        System.out.println("~a = " + (~a));

        // Left Shift
        System.out.println("a << 1 = " + (a << 1));

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1));
    }
}