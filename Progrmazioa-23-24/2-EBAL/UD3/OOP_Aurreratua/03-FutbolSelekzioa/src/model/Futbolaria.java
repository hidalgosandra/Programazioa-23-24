package model;

import model.enumerazioak.Demarkazioa;

public class Futbolaria {
    private int dortsala;
    private Demarkazioa demarkazioa;

    public Futbolaria(int dortsala, String izena, String abizena, int adina, int id, Demarkazioa demarkazioa) {
        this.dortsala = dortsala;
        this.demarkazioa = demarkazioa;
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
}
