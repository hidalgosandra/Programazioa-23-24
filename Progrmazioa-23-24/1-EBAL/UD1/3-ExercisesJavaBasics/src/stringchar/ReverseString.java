import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws Exception {

        // Define variables
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        // Prompt and read input as "String"
        System.out.print("Enter a String: ");
        inStr = in.next(); 
        in.close();
        inStrLen = inStr.length();
        // Use inStr.charAt(index) in a loop to extract each character
        // The String's index begins at 0 from the left.
        // Process the String from the right
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            // charIdx = inStrLen-1, inStrLen-2, ... ,0
            System.out.print(inStr.charAt(charIdx));
        }
        System.out.println();
    }
}