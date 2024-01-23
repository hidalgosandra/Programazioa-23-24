package model;

public class Produktua {
    private char[] kodea;
    private String izena;
    private double prezioa;
    String kodeaS = new String(kodea);

    public Produktua(String kodea, String izena, double prezioa) {
        this.kodeaS = kodea;
        this.izena = izena;
        this.prezioa = prezioa;
    }
}
