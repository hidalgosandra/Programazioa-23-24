package exekutagarriak;

import java.util.Random;
import java.util.Scanner;

import model.Laukia;

public class Menua {
    private final static int LAUKI_KOP = 10;
    private static Laukia[] laukiak = new Laukia[LAUKI_KOP];
    public static int sortutakoak = 0;
    public static Scanner in = new Scanner(System.in);
    private static int altuera;
    private static int zabalera;

    public static void main(String[] args) {
        int cont = 1;
        int au;

        Scanner in = new Scanner(System.in);
        do {
            System.out.println("LAUKIAK");
            System.out.println("====================================");
            System.out.println("1- Lauki berri bat sortu");
            System.out.println("2- Laukien taula ikusi");
            System.out.println("3- Lauki bat marraztu");
            System.out.println("4- Lauki handiena bilatu");
            System.out.println("5- Laukiaren arraya bete");
            System.out.println("6- Handitu lauki bat");
            System.out.println("7- Irten");
            System.out.print("Aukeratu zenbaki bat: ");
            au = in.nextInt();
            switch (au) {
                case 1:
                    sortu();
                    sortutakoak = sortutakoak + 1;
                    break;
                case 2:
                    imprimatu();
                    break;
                case 3:
                    marraztu();
                    break;
                case 4:
                    handiena();
                    break;
                case 5:
                    arrayBete();
                    break;
                case 6:
                    handitu();
                    break;
                case 7:
                    System.out.println("Irtetzen...");
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.err.print("Beste operazio bat egin nahi duzu? 0= Ez / 1= Bai  ");
            cont = in.nextInt();
        } while (cont == 1);
        in.close();
    }

    public static void sortu() {
        System.out.println("");
        System.out.print("Sartu laukiaren zabalera: ");
        zabalera = in.nextInt();
        System.out.print("Sartu laukiaren altuera: ");
        altuera = in.nextInt();
        laukiak[sortutakoak] = new Laukia(zabalera, altuera);
    }

    public static void imprimatu() {
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
    }

    public static void marraztu() {
        char m;
        int laukZkia = 0;
        System.out.println("Zenbatgarren laukia nahi duzu imprimatzea? ");
        laukZkia = in.nextInt();
        System.out.println("Betea ala hutsik (B/H)? ");
        m = in.next().charAt(0);
        if (m == 'B' || m == 'b') {
            laukiak[laukZkia - 1].marraztuBeteta();
        } else if (m == 'H' || m == 'h') {
            laukiak[laukZkia - 1].marraztuHutsik();
        }
    }

    public static void handiena() {
        String handiena;
        handiena = (Laukia.getTheBiggest(laukiak)).toString();
        System.out.println("Laukirik handiena hau da: " + handiena);
    }

    public static void arrayBete() {
        Random random = new Random();
        int upperbound = 11;
        for (int i = sortutakoak; i < LAUKI_KOP; i++) {
            int zabalera = random.nextInt(upperbound);
            int altuera = random.nextInt(upperbound);
            laukiak[i] = new Laukia(zabalera, altuera);
            sortutakoak++;
        }
    }

    public static void handitu() {
        int l;
        int h;
        System.out.println("Zer lauki nahi duzu handitu? ");
        l = in.nextInt();
        System.out.println("Zenbat aldiz nahi duzu biderkatu? ");
        h = in.nextInt();
        Laukia laukiBerria = laukiak[l - 1].handitu(zabalera, altuera, h);
        System.out.println("Berria: " + laukiBerria.toString());
        System.out.println();
    }
}
