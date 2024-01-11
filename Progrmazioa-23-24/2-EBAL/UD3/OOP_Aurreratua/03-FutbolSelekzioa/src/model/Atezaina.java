package model;

import model.enumerazioak.Demarkazioa;

public class Atezaina extends Futbolaria {
    private int geratutakoGolak = 0;

    public Atezaina(int id, String izena, String abizena, int adina, int dortsala, int geratutakoGolak) {
        super(dortsala, izena, abizena, adina, id, Demarkazioa.POR);
        this.geratutakoGolak = geratutakoGolak;
    }

    public void golaGeratu() {
        geratutakoGolak = geratutakoGolak + 1;
    }
}