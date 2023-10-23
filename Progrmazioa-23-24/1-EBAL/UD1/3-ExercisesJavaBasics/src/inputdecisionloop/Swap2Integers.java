package inputdecisionloop;

import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {
        int number1;
        int number2;
        int x = 0;
        int y = 0;
        Scanner in = new Scanner(System.in); // Scan the keyboard
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter the second integer: ");
        number2 = in.nextInt();
        in.close();
        x = number1;
        y = number2;
        number1 = y;
        number2 = x;
        System.out.print("After the swap, first integer is: " + number1 + ", second integer is: " + number2);
    }
}
