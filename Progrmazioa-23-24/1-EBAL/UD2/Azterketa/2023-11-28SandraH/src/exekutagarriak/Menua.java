package exekutagarriak;

import model.Liburua;
import model.Mailegua;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Menua {

    private static Scanner in = new Scanner(System.in);

    private static Liburua[] kat; // Liburua.getKatalogoa() metodoari deituta beteko dugu array hau.
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
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 4);
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
        for (int i = 0; i < kat.length; i++) {
            boolean baiez = kat[i].isMailegatuta();
            String mai;
            if (baiez = true) {
                mai = "Mailegatuta";
            } else {
                mai = "Erabilgarria";
            }
            System.out.printf("%3s %-10s %-25s %-24s %-12s %6s\n", kat[i].getKodea(), kat[i].getIzenburua(),
                    kat[i].getEgilea(), kat[i].getHizkuntzaOsoa(), kat[i].getUrtea(), mai);
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
        String kodLiburu = "0";
        System.out.println("Zein da liburuaren kodea? ");
        kodLiburu = in.nextLine();
        libZenb = Liburua.liburuaBilatu(kodLiburu, kat);
        if (libZenb != null) {
            System.out.println("Zure izena: ");
            izena = in.nextLine();
            System.out.println("Mailegua behar bezala erregistratu da.");
            liburuaMailegatu();
        } else {
            System.out.println("Ez daukagu katalogoan kode hori daukan libururik");
        }
    }

    /**
     * Azken maileguaren itzuleraData bete eta liburua erabilgarri dagoela markatzen
     * du.
     */
    public static void liburuaItzuli() {
        // OSATU EZAZU METODO HAU
        System.out.println("Itzuli nahi duzun liburuaren kodea: ");
        String libItzulString = "a";
        libItzulString = in.nextLine();
        for (int i = 0; i < kat.length; i++) {
            if (kat[i].equals(libItzulString)) {
                System.out.println("Liburua ondo itzuli da.");
            }
        }
    }
}
