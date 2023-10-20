package stringchar;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        String chars;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence (with only letters a-z): ");
        chars = in.next().toLowerCase();
        in.close();

        for (int i = 0; i < chars.length(); i++) {
            char inChar = chars.charAt(i); // Get the current character from the string.
            switch (inChar) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                    System.out.print(7);
                    break;
                case 's':
                case 't':
                case 'u':
                    System.out.print(8);
                    break;
                case 'v':
                case 'w':
                case 'x':
                    System.out.print(9);
                    break;
                default:
                    System.out.print("Enter only letters.");
            }
        }
    }
}
