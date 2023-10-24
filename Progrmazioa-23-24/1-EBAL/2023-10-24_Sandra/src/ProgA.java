import java.util.Scanner;

public class ProgA {
    public static void main(String[] args) throws Exception {
        int zen;
        Scanner in = new Scanner(System.in);
        System.out.print("Esan zenvaki bat (1-10): ");
        zen = in.nextInt();
        in.close();
        if (zen >= 1 && zen <= 10) {
            for (int i = 1; i <= zen; i++) {
                System.out.print(i);
                for (int x = 1; x < zen; x++) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        } else {
            System.out.print("Sartu zenbaki bat (1-10).");
        }

    }
}
