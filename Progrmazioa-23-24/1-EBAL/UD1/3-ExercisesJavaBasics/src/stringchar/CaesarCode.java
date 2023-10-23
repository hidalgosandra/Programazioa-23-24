package stringchar;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String plaintext, ciphertext;
        int shift = 3;

        System.out.print("Enter a plaintext string: ");
        plaintext = in.nextLine().toUpperCase(); // Convert to uppercase
        in.close();
        StringBuilder result = new StringBuilder();
        char ch;

        for (int i = 0; i < plaintext.length(); i++) {
            ch = plaintext.charAt(i);
            if (ch >= 'A' && ch <= 'W') {
                ch = (char) (ch + shift);
            } else if (ch >= 'X' && ch <= 'Z') {
                ch = (char) (ch - (26 - shift));
            }
            result.append(ch);
        }

        ciphertext = result.toString();

        System.out.println("The ciphertext string is: " + ciphertext);
    }
}
