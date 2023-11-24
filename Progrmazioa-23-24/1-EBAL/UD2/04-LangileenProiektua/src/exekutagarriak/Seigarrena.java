package exekutagarriak;

import java.util.Scanner;

import model.Langilea;

public class Seigarrena {
    public static void main(String[] args) {
        Langilea langileName;
        String izena;
        int sold;
        double nominaUrte = 0.0;
        double soldHandiena = 0.0;
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
        langileName = Langilea.bilatu(izena, langileak);
        if (langileName != null) {
            System.out.println("Langilearen datuak: " + langileName.toString());
            /*
             * e.- Erabiltzaileari, soldata zenbat igo nahi diogun galdetu eta soldata igo.
             */
            System.out.println("Zenbat igo nahi diozu soldata? ");
            sold = in.nextInt();
            langileName.soldataIgo(sold);
            System.out.println("Langilearen eguneratutako soldata: " + langileName.getSoldata());

            /* f.- Arraya berriz inprimatu (aldaketa egiaztatu ahal izateko). */
            System.out.printf("%-5s%-15s%-15s%-10s%-20s\n", "ID", "IZENA", "ABIZENA", "SOLDATA", "URTEKO SOLDATA");
            for (int i = 0; i < langileak.length; i++) {
                System.out.printf("%-5d%-15s%-15s%-10.2f%-20.2f\n", langileak[i].getId(), langileak[i].getIzena(),
                        langileak[i].getAbizena(), langileak[i].getSoldata(), langileak[i].getUrtekoSoldata());
            }

        } else {
            System.out.println("Langile hau ez da existitzen!");
        }
        /*
         * g.- Enpresa berdineko langileak direla suposatuz, kalkulatu eta inprimatu,
         * enpresak urte baten zenbat diru ordaindu beharko duen nominetan
         */
        for (int i = 1; i < langileak.length; i++) {
            nominaUrte = langileak[i - 1].getSoldata() + langileak[i].getSoldata();
        }
        System.out.println("Empresak urte baten zenbat ordainduko du nominetan: " + nominaUrte);

        /* h.- Soldata handiena daukan langilearen datuak inprimatu. */
        for (int i = 1; i < langileak.length; i++) {
            if (langileak[i - 1].getSoldata() < langileak[i].getSoldata()) {
                soldHandiena = langileak[i].getSoldata();
            }
        }
        System.out.println("Soldata handiena: " + soldHandiena);

        in.close();
    }
}
