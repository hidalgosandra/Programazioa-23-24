import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) throws Exception {
        // Declare variables
        final int NUM_ITEMS;
        int[] items; // Declare array name, to be allocated after NUM_ITEMS is known
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        // Prompt for for the number of items and read the input as "int"
        NUM_ITEMS = in.nextInt();
        
        // Allocate the array
        items = new int[NUM_ITEMS];
        System.out.print("Enter  the value of all items (separated by space): ");
        // Prompt and read the items into the "int" array, if array length > 0
        if (items.length > 0) {
            for (int i = 0; i < items.length; ++i) { // Read all items
                items[i] = in.nextInt();
            }
        }
        in.close();
        // Print array contents, need to handle first item and subsequent items
        // differently
        for (int i = 0; i < items.length; ++i) {
            System.out.print((i + 1) + ": ");
            for (int x = 0; x < items[i]; x++) {
                System.out.print("*");
            }
            System.out.print(" (" + items[i] + ")");
            System.out.println();
        }
            // or, using a one liner
            // System.out.print((i == 0) ? ...... : ......);
        }
    }