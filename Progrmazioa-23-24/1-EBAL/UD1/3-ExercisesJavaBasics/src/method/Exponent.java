package method;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        // Declare variables
        int exp; // exponent (non-negative integer)
        int base; // base (integer)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for the exponent: ");
        exp = in.nextInt();
        System.out.print("Enter the value of the base: ");
        base = in.nextInt();
        in.close();

        // Print result
        System.out.println(base + " raised to the power of " + exp + " is: " + exponent(base, exp));
    }

    // Returns "base" raised to the power "exp"
    public static int exponent(int base, int exp) {
        int product = 1; // resulting product
        // Multiply product and base for exp number of times
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }
}
