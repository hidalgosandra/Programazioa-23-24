package method;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size you want for the array: ");
        size = in.nextInt();
        array = new int[size];
        System.out.print("Enter the values of all items (separated by space): ");
        if (array.length > 0) {
            for (int x = 0; x < array.length; x++) {
                array[x] = in.nextInt();
            }
        }
        in.close();

        // Use the arrayToString method to print the array
        System.out.print(arrayToString(array));
    }

    public static String arrayToString(int[] array) {
        return Arrays.toString(array);
    }
}
