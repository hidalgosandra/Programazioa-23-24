import java.util.Scanner;

public class TriangularPatternA {
    public static void main(String[] args) throws Exception {
        int size;
        boolean isValid;
        isValid = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter a valid number (non-negative) for the size: ");
            size = in.nextInt();
            if (size > 0) {
                isValid = true;
                // Outer loop to print each of the rows
                for (int row = 1; row <= size; row++) { // row = 1, 2, 3, ..., size
                    // Inner loop to print each of the columns of a particular row
                    for (int col = 1; col <= size; col++) { // col = 1, 2, 3, ..., size
                        if (row >= col) {
                            System.out.print("# ");
                        } else {
                            System.out.print("  "); // Need to print the "leading" blanks
                        }
                    }
                    // Print a newline after printing all the columns
                    System.out.println();
                }
                System.out.println("(a)");
                System.out.println();
                
            } else {
                System.out.print("Enter a valid number!");
            }
            System.out.println(); // print newline after all columns
        } while (!isValid);
        in.close();
    }
}
