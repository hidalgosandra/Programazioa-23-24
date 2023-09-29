import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) throws Exception {
        // Declare constant
        final int NUM_STUDENTS = 3;
        // Declare variables
        int numberIn;
        boolean isValid; // boolean flag to control the input validation loop
        int sum = 0;
        double average;
        Scanner in = new Scanner(System.in);
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            isValid = false;
            do {
                // Prompt user for mark with input validation
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberIn = in.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true; // La entrada es válida, salimos del bucle
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            sum += numberIn;
        }
        in.close();
        average = sum / 3.0;
        System.out.println("The average is: " + average);
    }
}