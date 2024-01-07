package exekutagarriak;

import java.util.Scanner;

import model.NireTabla;

public class HiruSeguidan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        NireTabla partida1 = new NireTabla();

        int lerroa, zutabea;
        boolean posizioOna, libre;

        // Irten ez arte, bata irabazten edo aukera gehiago ez dagoenean
        while (!partida1.bukaera()) {

            do {

                // Jokalariari toka zaio erakutsi
                partida1.txandaErakutsi();
                // Taula erakutsi
                partida1.taulaErakutsi();
                libre = false;
                lerroa = eskatuZenbakiBat("Eman lerroa");
                zutabea = eskatuZenbakiBat("Eman zutabea");

                // Posizioa balioztatu
                posizioOna = partida1.balidatuPos(lerroa, zutabea);

                // Balioztatua denean, markarik ez badago
                if (posizioOna) {

                    // Markarik ez badago, libre da
                    if (!partida1.balioaPos(lerroa, zutabea)) {
                        libre = true;
                    } else {
                        System.out.println("Posizio hartan dago marka bat dagoela esan duzu");
                    }
                } else {
                    System.out.println("Posizioa ez da baliozkoa");
                }

                // Libre ez bada, irten ez
            } while (!libre);

            // Txandaren arabera, ikur bat edo bestea sartu
            partida1.betePos(lerroa, zutabea);

            partida1.txandaAldatu();
        }

        // Taula erakutsi
        partida1.taulaErakutsi();

        // Irabazlea erakutsi
        partida1.erakutsiIrabazlea();
    }

    /**
     * Zenbaki bat eskatu eta itzuli
     *
     * @param mezua
     * @return
     */
    public static int eskatuZenbakiBat(String mezua) {
        Scanner in = new Scanner(System.in);
        System.out.println(mezua);
        int zenbakia = in.nextInt();
        return zenbakia;

    }

}
