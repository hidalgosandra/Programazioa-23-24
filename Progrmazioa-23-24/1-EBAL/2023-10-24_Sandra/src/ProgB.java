import java.util.Scanner;

public class ProgB {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        final int max;
        String[] barazk;

        System.out.println("Sartu barazki kopuru nahi dituzun (Gehienez 300): ");
        max = in.nextInt();
        if (max <= 300) {
            barazk = new String[max];
            System.out.println("Sartu itzazu gogoko dituzun barazkiak.\r");
            for (int i = 0; i < barazk.length; i++) {
                barazk[i] = in.next();
            }

            in.close();

            for (int x = 0; x < barazk.length; x++) {
                System.out.print((x + 1) + ". " + barazk[x]);
                System.out.println();
            }
        } else {
            System.out.println("Sartu zenbaki bat eremuan.");
        }

    }
}