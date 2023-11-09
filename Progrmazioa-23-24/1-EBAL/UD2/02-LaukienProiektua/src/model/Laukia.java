package model;

import exekutagarriak.Menua;

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
        return "Laukia [" + zabalera + "x" + altuera + "]";
    }

    public String getMota() {
        if (altuera < zabalera) {
            return "Horizontala";
        } else if (zabalera < altuera) {
            return "Bertikala";
        } else if (altuera == zabalera) {
            return "Karratua";
        } else {
            return "Mota ez da zehaztu edo baliogabea da.";
        }
    }

    public void marraztuBeteta() {
        for (int i = 0; i < altuera; i++) {
            System.out.print("* ");
            for (int x = 1; x < zabalera; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void marraztuBetetaC(char ikurra) {
        for (int i = 0; i < altuera; i++) {
            System.out.print(ikurra + " ");
            for (int x = 1; x < zabalera; x++) {
                System.out.print(ikurra + " ");
            }
            System.out.println();
        }
    }

    public void marraztuHutsik() {
        if (altuera < zabalera) {
            for (int i = 0; i < altuera; i++) {
                for (int x = 0; x < zabalera; x++) {
                    if (i == 0 || i == altuera - 1 || x == 0 || x == zabalera - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else if (zabalera < altuera) {
            for (int i = 0; i < altuera; i++) {
                for (int x = 0; x < zabalera; x++) {
                    if (x == 0 || x == zabalera - 1 || i == 0 || i == altuera - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public boolean isBiggerThan(Laukia otherLaukia) {
        int azaleraThis = getAzalera();
        int azaleraOther = otherLaukia.getAzalera();

        return azaleraThis > azaleraOther;
    }

    public static Laukia getTheBiggest(Laukia[] laukiak) {

        int handiena = 0;
        for (int i = 1; i < Menua.sortutakoak; i++) {
            if (laukiak[i].getAzalera() > laukiak[handiena].getAzalera()) {
                handiena = i;
            }
        }
        return laukiak[handiena];
    }

    public static Laukia handitu(int zenbat) {
        int altu = 0;
        int zaba = 0;
        if (zenbat > 0) {
            altu = altu * zenbat;
            zaba = zaba * zenbat;
        }
        .setAltuera(altu);
        Laukia.setZabalera(zaba);
        return altu + zaba;
    }
}