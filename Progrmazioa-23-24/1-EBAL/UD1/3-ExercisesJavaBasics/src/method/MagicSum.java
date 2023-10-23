package method;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        final int SENTINEL = -1; // Terminating input
        int number;
        int result = 0;
        Scanner in = new Scanner(System.in);
        // Read first input to "seed" the while loop
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) { // Repeat until input is -1
            if (hasEight(number)) {
                result = number + result;
            }

            // Read next input. Repeat if the input is not the SENTINEL
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        in.close();
        System.out.println(result);
    }

    public static boolean hasEight(int number) {
        boolean hasEight = false; // shall change to true if found a digit 8

        // Extract and check each digit
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            if (digit == 8) {
                hasEight = true;
                break; // only need to find one digit 8
            }
            number /= 10; // Drop the last digit and repeat
        }
        return hasEight;
    }
}