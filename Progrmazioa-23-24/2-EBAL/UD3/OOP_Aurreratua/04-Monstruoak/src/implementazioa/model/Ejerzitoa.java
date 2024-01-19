package implementazioa.model;

import java.util.ArrayList;

import herentziamemberabstraktoekin.model.Hiztegia;
import java.util.Random;

public class Ejerzitoa {
    private String izena;
    private ArrayList<Monstruosoa> monstruoak = new ArrayList<Monstruosoa>();

    public Ejerzitoa(String izena) {
        this.izena = izena;
        Random random = new Random();
        Ejerzitoa(random.nextInt(10), random.nextInt(10), random.nextInt(10));
    }

    public void Ejerzitoa(int fireKop, int waterKop, int stoneKop) {
        for (int i = 0; i < fireKop; i++) {
            monstruoak.add(new FireMonster(Hiztegia.getKonposatua()));
        }
        for (int i = 0; i < waterKop; i++) {
            monstruoak.add(new WaterMonster(Hiztegia.getKonposatua()));
        }
        for (int i = 0; i < stoneKop; i++) {
            monstruoak.add(new StoneMonster(Hiztegia.getKonposatua()));
        }
    }

    /*
     * Fire: 1
     * Water: 2
     * Stone: 3
     * Water gana Fire
     * Stone gana Water
     * Fire gana Stone
     */
    public int getIndarra() {
        int indarra = 0;
        for (int i = 0; i < monstruoak.size(); i++) {
            if (monstruoak.get(i) instanceof FireMonster) {
                indarra = indarra + 1;
            } else if (monstruoak.get(i) instanceof WaterMonster) {
                indarra = indarra + 2;
            } else if (monstruoak.get(i) instanceof StoneMonster) {
                indarra = indarra + 3;
            }
        }
        return indarra;
    }

    public String toString() {
        return izena;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public ArrayList<Monstruosoa> getMonstruoak() {
        return monstruoak;
    }

    public void setMonstruoak(ArrayList<Monstruosoa> monstruoak) {
        this.monstruoak = monstruoak;
    }

}
