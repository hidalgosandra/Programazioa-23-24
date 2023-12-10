package exekutagarriak;

import model.Liburua;
import model.Mailegua;

import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Menua {

    private static Scanner in = new Scanner(System.in);

    private static ArrayList<Liburua> kat = new ArrayList<>(); // Liburua.getKatalogoa() metodoari deituta beteko dugu
                                                               // array hau.
    // Beraz, 1000 elementuko arraya izango da.
    static Liburua libZenb;
    static private String izena;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // kat ALDAGAIA HASIERATU HEMEN
        kat = Liburua.getKatalogoa();
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("1.- Katalogoa ikusi");
            System.out.println("2.- Liburua mailegatu");
            System.out.println("3.- Liburua itzuli");
            System.out.println("4.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");
            switch (aukera) {
                case 1:
                    katalogoaIkusi();
                    break;
                case 2:
                    liburuaMailegatu();
                    break;
                case 3:
                    liburuaItzuli();
                    break;
                case 4:
                    liburuaGehitu(libZenb);
                    break;
                case 5:
                    liburuaEzabatu(izena, kat);
                    break;
                case 6:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 7);
    }

    /**
     * Liburuen katalogoa inprimatzen du kontsolan metodo honek.
     * Formateo string hau erabili ezazu: "%3s %-10s %-25s %-24s %-12s %6s %-3s\n"
     */
    public static void katalogoaIkusi() {
        // OSATU EZAZU METODO HAU
        System.out.println("LIBURUEN KATALOGOA");
        System.out.println("===============================");
        System.out.printf("%3s %-10s %-25s %-24s %-12s %6s %-3s\n", "Z.", "Kodea", "Izenburua", "Egilea", "Hizkuntza",
                "M.", "-");
        int i = 0;
        while (i < kat.size()) {
                System.out.printf("%3s %-10s %-25s %-24s %-12s %6s %-3s\n", (i + 1), kat.get(i).getKodea(),
                        kat.get(i).getIzenburua(), kat.get(i).getEgilea(), kat.get(i).getHizkuntzaOsoa(), kat.get(i).getUrtea(),
                        kat.get(i).isMailegatuta() ? "M" : "E");
                i++;
            }

        if (i == 0) {
            System.out.println("Ez daude liburu gehiago.");
        }

    }

    /**
     * Ikusi exekuzio adibidea. Bestalde,
     * - Sartutako kodea existitzen ez bada: "Ez daukagu katalogoan kode hori daukan
     * libururik."
     * - Liburua dagoeneko mailegatuta badago: "Sentitzen dugu baina momentu honetan
     * liburu hori mailegatuta dago."
     * - Mailegu topera heldu bagara: "Liburu honen mailegu kopuru maximora
     * heltzeagatik ezin izan da mailegatu. Hitz egin ezazu liburuzainarekin."
     */
    public static void liburuaMailegatu() {
        // OSATU EZAZU METODO HAU
        System.out.println("LIBRUA MAILEGATZE: ");
        System.out.println("Hartu nahi duzun liburuaren kodea: ");
        String kodea = in.nextLine();
        Liburua lib = Liburua.liburuaBilatu(kodea, kat);
        if (lib == null) {
            System.out.println("Ez daukagu katalogoan kode hori daukan librururik.");
        } else if (lib.isMailegatuta()) {
            System.out.println("Sentitzen dugu baina momentu honetan liburu hori mailegatuta dago.");
        } else {
            System.out.println("Sartu zure izena: ");
            String irakurleIzena = in.nextLine();
            if (lib.maileguaGehitu(new Mailegua(irakurleIzena))) {
                lib.setMailegatuta(true);
            } else {
                lib.setMailegatuta(false);
            }
        }
    }

    /**
     * Azken maileguaren itzuleraData bete eta liburua erabilgarri dagoela markatzen
     * du.
     */
    public static void liburuaItzuli() {
        // OSATU EZAZU METODO HAU
        System.out.println("Itzuli nahi duzun liburuaren kodea: ");
        String kodea = in.nextLine();
        Liburua lib = Liburua.liburuaBilatu(kodea, kat);
        if (lib == null) {
            System.out.println("Ez daukagu katalogoan kode hori daukan libururik.");
        } else {
            lib.liburuaItzuli();
        }
    }

    public static void liburuaGehitu(Liburua liburua) {
        kat.add(liburua);
    }

    public static void liburuaEzabatu(String kode, ArrayList<Liburua> kat2) {
        for (Liburua liburua : kat) {
            if (kode == liburua.getKodea()) {
                kat.remove(kode);
            }
        }
    }
}
