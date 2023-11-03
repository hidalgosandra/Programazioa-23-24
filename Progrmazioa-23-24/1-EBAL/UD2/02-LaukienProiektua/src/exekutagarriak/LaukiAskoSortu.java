package exekutagarriak;

import java.util.Scanner;
import model.Laukia;

public class LaukiAskoSortu {
    public static void main(String[] args) {
        int kantitate;
        int zabalera;
        int altuera;
        Scanner in = new Scanner(System.in);
        System.out.print("Zenbat lauki sortu nahi dituzu? ");
        kantitate = in.nextInt();

        Laukia[] laukiak = new Laukia[kantitate];

        for (int i = 0; i < kantitate; i++) {
            System.out.println((i + 1) + ". Laukiaren datuak: ");
            System.out.print("Zabalera: ");
            zabalera = in.nextInt();
            System.out.print("Altuera: ");
            altuera = in.nextInt();
            laukiak[i] = new Laukia(zabalera, altuera);
        }
        in.close();

        System.out.printf("%10s %10s %10s %10s %10s %10s%n", "Laukia", "Zabalera", "Altuera", "Azalera", "Perimetroa",
                "Mota");
        System.out.println("======================================================================");
        for (int i = 0; i < kantitate; i++) {
            Laukia laukia = laukiak[i];
            int azalera = laukia.getAzalera();
            int perimetroa = laukia.getPerimetroa();
            String mota = laukia.getMota();

            System.out.printf("%10d %10d %10d %10d %10d %10s%n", i + 1, laukia.getZabalera(), laukia.getAltuera(),
                    azalera, perimetroa, mota);
        }
    }
}
