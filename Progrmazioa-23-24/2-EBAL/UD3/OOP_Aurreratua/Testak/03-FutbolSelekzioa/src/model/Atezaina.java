package model;

import model.enumerazioak.Demarkazioa;

public class Atezaina extends Futbolaria {
    private int geratutakoGolak = 0;
    
    public Atezaina(int id, String izena, String abizena, int adina, int dortsala, Demarkazioa demarkazioa,
            int geratutakoGolak) {
        super(id, izena, abizena, adina, dortsala, demarkazioa);
        this.geratutakoGolak = geratutakoGolak;
    }

    public int getGeratutakoGolak() {
        return geratutakoGolak;
    }

    public void setGeratutakoGolak(int geratutakoGolak) {
        this.geratutakoGolak = geratutakoGolak;
    }

    public void golaGeratu() {
        System.out.println(this.id + " gola geratu du!");
        geratutakoGolak++;
    }

}
