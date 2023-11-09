import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        int n;
        int i = 0;
        System.out.println("Sartu zenbat aldiz nahi duzun imprimatzea: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();
        while (i < n) {
            System.out.println("Hola Mundo!");
            i++;
        }
    }
}
