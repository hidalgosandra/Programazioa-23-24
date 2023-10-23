
import java.util.Scanner;

public class Izenak {
    public static void main(String[] args) {

        String[] hitzak;
        final String R = "R";
        String izkia;

        hitzak = new String[8];

        Scanner in = new Scanner(System.in);
        System.out.print("Idatzi 8 izen: ");

        for (int i = 0; i < hitzak.length; i++) {
            hitzak[i] = in.next();
        }
        System.out.print("Sakatu R(everse) izenak atzezko aurrera ikusteko: ");
        izkia = in.next();

        if (izkia.equals(R)) {
            for (int l = hitzak.length - 1; l >= 0; --l) {
                System.out.print(hitzak[l] + " ");
            }
        }
        in.close();
    }

}
