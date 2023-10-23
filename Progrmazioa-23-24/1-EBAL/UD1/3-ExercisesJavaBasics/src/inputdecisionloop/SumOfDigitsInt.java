package inputdecisionloop;

import java.util.Scanner;

public class SumOfDigitsInt {
    public static void main(String[] args) {
        int inNumber;
        int inDigit;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        inNumber = in.nextInt();
        in.close();
        while (inNumber > 0) {
            inDigit = inNumber % 10; // Extract the least-significant digit
            // Print this digit
            sum += inDigit;
            System.out.print(inDigit + " ");
            inNumber = inNumber / 10; // Drop the least-significant digit and repeat the loop
        }
        System.out.println("Sum of digits: " + sum);
    }
}