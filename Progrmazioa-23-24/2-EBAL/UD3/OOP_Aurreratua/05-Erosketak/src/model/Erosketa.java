package model;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Produktua;
import model.Bezeroa;

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
        return "";
    }

    public String toStringLuzea() {
        return "";
    }

    public boolean guztiraEgiaztatu() {
        return false;
    }
}
