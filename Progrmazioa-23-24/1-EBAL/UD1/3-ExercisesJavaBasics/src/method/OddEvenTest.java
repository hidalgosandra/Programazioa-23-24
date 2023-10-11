package method;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();
        in.close();
        
        if (isOdd(num)) {
            System.out.println(num + " is an odd number.");
        } else {
            System.out.println(num + " is an even number.");
        }
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
