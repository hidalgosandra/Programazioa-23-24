package exekutagarriak;

import java.util.Scanner;

import model.Langilea;

public class Menua {
    static Langilea langileak[] = new Langilea[100];

    public static int bilatuLehenPosizioLibrea() {
        for (int i = 0; i < langileak.length; i++) {
            if (langileak[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int sel;
        boolean segui = true;
        Langilea langilea[] = Langilea.nireHamarLagunLangile();
        Langilea langileak[] = new Langilea[100];
        Langilea langileName;
        String izena;
        int sold;
        for (int i = 0; i < langileak.length && i < langilea.length; i++) {
            langileak[i] = langilea[i];
        }
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("LANGILEAK");
            System.out.println("=======================");
            System.out.println("1- Langile guztiak ikusi");
            System.out.println("2- Langilea kontratatu");
            System.out.println("3- Langilea jubilatu");
            System.out.println("4- Soldata igo");
            System.out.println("Aukeratu zenbaki bat: ");
            sel = in.nextInt();

            switch (sel) {
                case 1:
                    System.out.println("Langile guztiak");
                    System.out.println("==================================================================");
                    System.out.printf("%-5s%-15s%-15s%-10s%-20s\n", "ID", "IZENA", "ABIZENA", "SOLDATA",
                            "URTEKO SOLDATA");
                    for (int i = 0; i < langileak.length; i++) {
                        if (langileak[i] != null) {
                            System.out.printf("%-5d%-15s%-15s%-10.2f%-20.2f\n", langileak[i].getId(),
                                    langileak[i].getIzena(), langileak[i].getAbizena(), langileak[i].getSoldata(),
                                    langileak[i].getUrtekoSoldata());
                        } else {
                            System.out.println("Ez daude langile gehiagorik");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Langilea kontratatu: ");
                    int lehenLekua = bilatuLehenPosizioLibrea();

                    if (lehenLekua != -1) {
                        Langilea.langileakKontratatu(langileak, in);
                        System.out.println("Langilea kontratatua: " + langileak[lehenLekua].toString());
                    } else {
                        System.out.println("Ezin da langilea gehitu, arraya beteta dago.");
                    }
                    break;
                case 3:
                    System.out.println("Langilea jubilatu: ");
                    break;
                case 4:
                    System.out.println("Soldata igo: ");
                    System.out.print("Sartu langilearen izena: ");
                    izena = in.nextLine();
                    langileName = Langilea.bilatu(izena, langileak);
                    if (langileName != null) {
                        System.out.println("Zenbat igo nahi diozu soldata? ");
                        sold = in.nextInt();
                        langileName.soldataIgo(sold);
                        System.out.println("Langilearen eguneratutako soldata: " + langileName.getSoldata());
                    } else {
                        System.out.println("Langile hau ez da existitzen!");
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Beste operazio bat egin nahi duzu? (true = bai / false = ez): ");
            segui = in.nextBoolean();
        } while (segui == true);
        in.close();

    }
}
