package model;

import java.util.ArrayList;

public class EpekakoErosketa extends Erosketa {
    private int epeak = 12;
    private boolean ordainketaBukatu = false;
    private double kuota;

    public double gainetikOrdainduBeharrekoa() {

    }

    public EpekakoErosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktuak> produktuak,
            ArrayList<Integer> unitateak, double guztira, double kuota) {
        super(kodea, data, eroslea, produktuak, unitateak);
        this.guztira = guztira;
        this.kuota = kuota;
    }
}
