import java.util.Scanner;

public class CheckPattern {
    public static void main(String[] args) {
        int size;
        boolean isValid;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter the size: ");
            size = in.nextInt();
            isValid = (size >= 1); // Check if size is valid
            if (!isValid) {
                System.out.println("Enter a valid size.");
            }
        } while (!isValid);

        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) { // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) { // col = 1, 2, 3, ..., size
                if ((row % 2) == 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# "); // Use print() without newline inside the inner loop
                }
            }
            // Print a newline after printing all the columns
            System.out.println("");
        }

        in.close();
    }
}
