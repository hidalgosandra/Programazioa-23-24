package method;

import java.util.Scanner;

public class PrintMethodsVoid {
    public static void main(String[] args) {
        int[] myArray;
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size you want to the array: ");
        size = in.nextInt();
        myArray = new int[size];
        System.out.print("Enter the value of all items (separated by space): ");
        if (myArray.length > 0) {
            for (int x = 0; x < myArray.length; x++) {
                myArray[x] = in.nextInt();
            }
        }
        in.close();
        print(myArray);
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("a" + array[i]);
            } else {
                System.out.print(", a" + array[i]);
            }
        }
        System.out.print("]");
    }
}
