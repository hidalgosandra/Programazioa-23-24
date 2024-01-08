package model;

import java.util.ArrayList;

import model.enumerazioak.Herria;

public class Selekzioa {
    private ArrayList<Kidea> kideak = new ArrayList<Kidea>();
    private int azkenId = 0;
    public Herria herria;

    public Selekzioa(String herrialdea) {

    }

    public void kideakBistaratu() {

    }

    public void kideakTaldekatutaBistaratu() {

    }

    public ArrayList<Kidea> getKideak() {
        return kideak;
    }

    public ArrayList<String> getKideenIzenak() {
        return null;
    }

    public int Kideberria(ArrayList<Kidea> Kidea) {
        return azkenId;
    }

    public int kideaEzabatu(int id) {
        return id;
    }
}
