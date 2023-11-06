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

}