import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        // Declare variables
        int numberIn; // to be input
        boolean isValid; // boolean flag to control the loop

        // Use a do-while loop controlled by a boolean flag
        // to repeatably read the input until a valid input is entered
        isValid = false; // default assuming input is not valid
        do {
            // Prompt and read input
            Scanner in = new Scanner(System.in);
            System.out.print("Enter an integer between 0-10 or 90-100: ");
            numberIn = in.nextInt();
            // Validate input by setting the boolean flag accordingly
            if ((numberIn >= 0 && numberIn <= 10) || (numberIn <= 100 && numberIn >= 90)) {
                isValid = true; // exit the loop
                in.close();
            } else {
                System.out.println("Invalid input, try again..."); // Print error message and repeat
            }
        } while (!isValid);
        System.out.println("You have entered: " + numberIn);
    }
}