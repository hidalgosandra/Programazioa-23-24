package model;

public class Laukia {
    private int zabalera;
    private int altuera;

    public Laukia() {
        zabalera = 5;
        altuera = 5;
    }

    public Laukia(int zab, int alt) {
        this.zabalera = zab;
        this.altuera = alt;
    }

    public int getZabalera() {
        return zabalera;
    }

    public int getAltuera() {
        return altuera;
    }

    public int getAzalera() {
        int azalera;
        azalera = altuera * zabalera;
        return azalera;
    }

    public int getPerimetroa() {
        int perimetroa;
        perimetroa = ((altuera * 2) + (zabalera * 2));
        return perimetroa;
    }

    public void setZabalera(int zabaleraBerria) {
        this.zabalera = zabaleraBerria;
    }

    public void setAltuera(int altueraBerria) {
        this.altuera = altueraBerria;
    }

    public String toString() {
        return String.format("Laukia[" + zabalera + "x" + altuera + "]");
    }
}

Laukia L1 = new Laukia(7,1)