import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int number1;

        //  SCANNER //
        Scanner in = new Scanner(System.in); // Scan the keyboard
        System.out.print("Enter 1st integer: ");
        number1 = in.nextInt();
        in.close();
        System.out.println(number1);


    }
}
