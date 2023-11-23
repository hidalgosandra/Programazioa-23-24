package exekutagarriak;

import java.util.Scanner;

import model.Langilea;

public class Seigarrena {
    public static void main(String[] args) {
        String langile;
        String izena;
        int sold;
        /* a.- Langileen array bat sortu nireHamarLagunLangile metodoari deituta. */
        Langilea[] langileak = Langilea.nireHamarLagunLangile();

        /*
         * b.- Arrayaren informazio osoa inprimatu taula formatuan, printf erabilita,
         * lerrokapenak zainduz.
         */
        System.out.printf("%-5s%-15s%-15s%-10s%-20s\n", "ID", "IZENA", "ABIZENA", "SOLDATA", "URTEKO SOLDATA");
        for (int i = 0; i < langileak.length; i++) {
            System.out.printf("%-5d%-15s%-15s%-10.2f%-20.2f\n", langileak[i].getId(), langileak[i].getIzena(),
                    langileak[i].getAbizena(), langileak[i].getSoldata(), langileak[i].getUrtekoSoldata());
        }
        /* c.- Erabiltzaileari, langile baten izena eskatu. */
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu langilearen izena: ");
        izena = in.nextLine();
        /*
         * d.- Langile hori bilatu eta bere datuak pantailan inprimatu. Izen hori daukan
         * langilerik aurkitzen ez badu, abisua eman
         */
        langile = Langilea.bilatu(izena, langileak);
        if (langile != null) {
            System.out.println("Langilearen datuak: " + langile.toString());
            /*
             * e.- Erabiltzaileari, soldata zenbat igo nahi diogun galdetu eta soldata igo.
             */
            System.out.println("Zenbat igo nahi diozu soldata? ");
            sold = in.nextInt();
            langile.soldataIgo(sold);
            System.out.println("Langilearen eguneratutako soldata: " + langile.getSoldata());
        } else {
            System.out.println("Langile hau ez da existitzen!");
        }

        in.close();
    }
}
