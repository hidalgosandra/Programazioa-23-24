package exekutagarriak;

import java.util.Scanner;

import model.Langilea;

public class Menua {
    public static void main(String[] args) {
        int sel;
        boolean segui = true;
        Langilea langilea[] = Langilea.nireHamarLagunLangile();
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
                    for (int i = 0; i < langilea.length; i++) {
                        System.out.printf("%-5d%-15s%-15s%-10.2f%-20.2f\n", langilea[i].getId(),
                                langilea[i].getIzena(), langilea[i].getAbizena(), langilea[i].getSoldata(),
                                langilea[i].getUrtekoSoldata());
                    }
                    break;
                case 2:
                    System.out.println("Langilea kontratatu, sartu langilearen datuak: ");
                    String izena;
                    String abizena;
                    double soldata;
                    System.out.println("Sartu langilearen izena: ");
                    izena = in.nextLine();
                    System.out.println("Sartu langilearen abizena: ");
                    abizena = in.nextLine();
                    System.out.println("Sartu langilearen soldata: ");
                    soldata = in.nextDouble();
                    Langilea langileBerria = new Langilea(langilea.length + 1, izena, abizena, soldata);
                    break;
                case 3:
                System.out.println("Langilea jubilatu: ");
                break;
                case 4:
                System.out.println("Soldata igo: ");
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
