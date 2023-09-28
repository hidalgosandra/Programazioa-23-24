import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) throws Exception {

        // Define variables
        String inStr; // input String
        int inStrLen; // length of the input String
        int countVowels = 0;
        int countDigits = 0;
        double digidtpercent = 0.00;
        double vowelpercent = 0.00;
        double totalInput = 0.00;

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
            if((inStr.charAt(charIdx) >= 'a' && inStr.charAt(charIdx) <= 'z')||(inStr.charAt(charIdx) >='A' && inStr.charAt(charIdx) <='Z')){
                ++countVowels;
            }else{
                ++countDigits;
            }
            ++totalInput;
        }
        vowelpercent = (countVowels / totalInput) * 100;
        digidtpercent = (countDigits / totalInput) * 100;
        System.out.println();
        System.out.printf("Number of vowels: (%d) %.2f%%", countVowels, vowelpercent);
        System.out.println();
        System.out.printf("Number of digits: (%d) %.2f%%", countDigits, digidtpercent);
    }
}