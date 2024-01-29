package model;

import model.enumerazioak.Demarkazioa;

public class Futbolaria extends Kidea {
    private int dortsala;
    private Demarkazioa demarkazioa;
    public Futbolaria(int id, String izena, String abizena, int adina, int dortsala, Demarkazioa demarkazioa) {
        super(id, izena, abizena, adina);
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
    public void entrenatu(){
        System.out.println(this.id + " entrenatu du " + this.dortsala + "-rekin");
    }
    public void partidaJolastu(){
        System.out.println(this.id + " jolastu du " + this.dortsala + "-rekin");
    }
}
