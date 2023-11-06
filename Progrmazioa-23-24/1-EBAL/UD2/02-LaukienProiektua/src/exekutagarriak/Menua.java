package exekutagarriak;

import java.util.Scanner;

import model.Laukia;

public class Menua {
    public static void main(String[] args) {
        int cont = 1;
        int LAUKI_KOP = 10;
        int sortutakoak = 0;
        Laukia[] laukiak = new Laukia[LAUKI_KOP];
        int au;
        int altuera, zabalera;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("LAUKIAK");
            System.out.println("====================================");
            System.out.println("1- Lauki berri bat sortu");
            System.out.println("2- Laukien taula ikusi");
            System.out.println("3- Lauki bat marraztu");
            System.out.println("4- Lauki handiena bilatu");
            System.out.println("5- Irten");
            System.out.print("Aukeratu zenbaki bat: ");
            au = in.nextInt();
            switch (au) {
                case 1:
                    System.out.println("");
                    System.out.print("Sartu laukiaren zabalera: ");
                    zabalera = in.nextInt();
                    System.out.print("Sartu laukiaren altuera: ");
                    altuera = in.nextInt();
                    laukiak[0] = new Laukia(zabalera, altuera);
                    sortutakoak = sortutakoak + 1;
                    break;
                case 2:
                    System.out.println("---------------------------Laukien taula---------------------------------");
                    System.out.println();
                    System.out.printf("%10s %10s %10s %10s %15s %10s%n", "Laukia", "Zabalera", "Altuera", "Azalera",
                            "Perimetroa",
                            "Mota");
                    System.out.println("=========================================================================");
                    for (int i = 0; i < sortutakoak; i++) {
                        Laukia laukia = laukiak[i];
                        int azalera = laukia.getAzalera();
                        int perimetroa = laukia.getPerimetroa();
                        String mota = laukia.getMota();

                        System.out.printf("%10d %10d %10d %10d %15d %10s%n", i + 1, laukia.getZabalera(),
                                laukia.getAltuera(),
                                azalera, perimetroa, mota);
                    }
                    break;
                case 3:
                    System.out.println("-------------------------Lauki bat marraztu--------------------------------");
                    System.out.println();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Irtetzen...");
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.err.print("Beste operazio bat egin nahi duzu? 0= Ez / 1= Bai  ");
            cont = in.nextInt();
        } while (cont == 1);
    }
}