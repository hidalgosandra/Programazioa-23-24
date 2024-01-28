package model;

import java.time.LocalDate;
import java.util.ArrayList;
import model.*;

/*Erosketa kodea
 * E18-02
 * E= erosketa
 * 18= urtea
 * 02= bezero kod
 */
public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa eroslea;
    protected ArrayList<Produktua> produktuak = new ArrayList<Produktua>();
    protected ArrayList<Integer> unitateak = new ArrayList<Integer>();
    protected double guztira;

    public Erosketa(String kodea, Bezeroa eroslea, double guztira) {
        this.kodea = kodea.toCharArray();
        this.eroslea = eroslea;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.eroslea = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    public String toString() {
        return "\tEROSKETA  \n\tKodea: " + new String(kodea) + "\n\tData:" + data + "\n\teroslea: " + eroslea
                + "\n\tproduktuak: " + produktuak + "\n\tunitateak: " + unitateak + "\n\tguztira: " + guztira;
    }

    public String toStringLuzea() {
        System.out.println("EROSKETA");
        for (int i = 0; i < kodea.length; i++) {
        }
        System.out.println("Kodea: " + new String(kodea) + "Data: " + data);
        System.out.println("Bezeroa: " + new String(kodea));
        System.out.println("Izena: " + eroslea.getIzena());
        return "";
    }

    public boolean guztiraEgiaztatu() {
        double total = 0;
        for (int i = 0; i < unitateak.size(); i++) {
            total = total + unitateak.get(i);
        }
        if (total == guztira) {
            return true;
        } else {
            return false;
        }
    }
}
