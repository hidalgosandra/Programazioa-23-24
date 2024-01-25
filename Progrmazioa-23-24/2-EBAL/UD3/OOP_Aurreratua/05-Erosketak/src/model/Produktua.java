package model;

public class Produktua {
    private char[] kodea;
    private String izena;
    private double prezioa;

    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea = kodea.toCharArray();
        this.izena = izena;
        this.prezioa = prezioa;
    }
}
