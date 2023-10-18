import java.util.Scanner;

public class Izartxoak {
    public static void main(String[] args) {
        int zen;
        Scanner in = new Scanner(System.in);

        System.out.print("Esan zenbaki bat (1-10): ");
        zen = in.nextInt();

        if (zen < 1 || zen > 10) {
            System.out.println("Zenbakia 1 eta 10 artekoa izan behar da.");
        } else {
            for (int i = 1; i <= 50; i++) {
                if (i == 1 && zen == 1) {
                    System.out.print("*");
                } else if (i == 1 && zen != 1) {
                    System.out.print("1");
                } else if (i % zen == 0) {
                    System.out.print(" - *");
                } else {
                    System.out.print(" - " + i);
                }
            }
            System.out.println();  // Salto de línea al final para que el resultado sea más legible.
        }

        in.close();
    }
}
