package model;

import model.enumerazioak.Demarkazioa;

public class Futbolaria {
    private int dortsala;
    private Demarkazioa demarkazioa;
    String izena;
    String abizena;
    int adina;
    int id;

    public Futbolaria(int dortsala, String izena, String abizena, int adina, int id, Demarkazioa demarkazioa) {
        this.dortsala = dortsala;
        this.demarkazioa = demarkazioa;
        this.izena = izena;
        this.abizena = abizena;
        this.adina = adina;
        this.id = id;
    }

    public int getDortsala() {
        return dortsala;
    }

    public void setDortsala(int dortsala) {
        this.dortsala = dortsala;
    }

    public Demarkazioa getDemarkazioa() {
        return demarkazioa;
    }

    public void setDemarkazioa(Demarkazioa demarkazioa) {
        this.demarkazioa = demarkazioa;
    }

    public Futbolaria entrenatu() {
        return null;
    }

    public Futbolaria partidaJolastu() {
        return null;
    }

    public String toString() {
        return "Izena: " + izena + "\t Abizena: " + abizena + "\t Adina:" + adina + "\t Id: " + id + "\t Demarkazioa: "
                + demarkazioa;
    }
}
