import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int inNumber;
        int inDigit;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        inNumber = in.nextInt();
        in.close();
        while (inNumber > 0) {
            inDigit = inNumber % 10; // Extract the least-significant digit
            // Print this digit
            System.out.print(inDigit + " ");
            inNumber = inNumber / 10; // Drop the least-significant digit and repeat the loop
        }
    }
}