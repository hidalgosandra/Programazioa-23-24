package model;

public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia() {
        zenbakitzailea = (int) (Math.random() * 10) + 1;
        izendatzailea = (int) (Math.random() * 10) + 1;
    }

    public Zatikia(int zenbakitzailea, int izendatzailea) {
        this.izendatzailea = izendatzailea;
    }

    public Zatikia(String zattIdatzia) {
        int marra = zattIdatzia.indexOf("/");
        int strLen = zattIdatzia.length();

        String goikoa = zattIdatzia.substring(0, marra);
        String behekoa = zattIdatzia.substring(marra + 1, strLen);

        int zenbakitzailea = Integer.parseInt(goikoa);
        int izendatzailea = Integer.parseInt(behekoa);

        this.zenbakitzailea = zenbakitzailea;
        this.izendatzailea = izendatzailea;
    }

    public int getZenbakitzailea() {
        return zenbakitzailea;
    }

    public int getIzendatzailea() {
        return izendatzailea;
    }

    public void setZenbakitzailea(int zenba) {
        this.zenbakitzailea = zenba;
    }

    public void setIzendatzailea(int izenda) {
        this.izendatzailea = izenda;
    }

    public String toString() {
        String zat;
        zat = zenbakitzailea + "/" + izendatzailea;
        return zat;
    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        Zatikia bid = new Zatikia();
        bid.setZenbakitzailea(zat1.getZenbakitzailea() * zat2.getZenbakitzailea());
        bid.setIzendatzailea(zat1.getIzendatzailea() * zat2.getIzendatzailea());
        bid.sinplifikatu();
        return bid;
    }

    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {
        Zatikia bat = new Zatikia();
        bat.setZenbakitzailea((zat1.getZenbakitzailea() * zat2.getIzendatzailea())
                + zat2.getZenbakitzailea() * zat1.getIzendatzailea());
        bat.setIzendatzailea((zat1.getIzendatzailea() * zat2.getIzendatzailea()));
        bat.sinplifikatu();
        return bat;
    }

    public void batu(Zatikia besteZatBat) {

    }

    public double hamartarBaliokidea() {
        double hamartarra;
        hamartarra = (double) this.getZenbakitzailea() / (double) this.getIzendatzailea();
        return hamartarra;
    }

    public boolean isBaliokidea(Zatikia besteZatikiBat) {
        if (this.hamartarBaliokidea() == besteZatikiBat.hamartarBaliokidea()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBiggerThan(Zatikia besteZatikiBat) {
        if (this.hamartarBaliokidea() > besteZatikiBat.hamartarBaliokidea()) {
            return true;
        } else {
            return false;
        }
    }

    public void sinplifikatu() {
        int[] faktGoi = Zatikia.faktorizatu(this.getZenbakitzailea());
        int[] faktBehe = Zatikia.faktorizatu(this.getIzendatzailea());
        for (int i = 0; i < faktGoi.length; i++) {
            for (int a = 0; a < faktBehe.length; a++) {
                if (faktGoi[i] == faktBehe[a]) {
                    faktBehe[a] = 1;
                    faktGoi[i] = 1;
                    break;
                }
            }
        }
        int totalaZenbakitzailea = 1;
        int totalaIzendatzailea = 1;
        for (int i = 0; i < faktGoi.length; i++) {
            totalaZenbakitzailea = totalaZenbakitzailea * faktGoi[i];
        }
        for (int i = 0; i < faktBehe.length; i++) {
            totalaIzendatzailea = totalaIzendatzailea * faktBehe[i];
        }
        this.zenbakitzailea = totalaZenbakitzailea;
        this.izendatzailea = totalaIzendatzailea;
    }

    public int mkt(int n1, int n2) {
        return n1;

    }

    public int zkh(int n1, int n2) {
        return n1;

    }

    public static int[] faktorizatu(int n) {
        int cont = 0;
        int temp = n;
        while (temp > 1) {
            for (int i = 2; i <= temp; i++) {
                if (temp % i == 0) {
                    temp = temp / i;
                    cont++;
                    break;
                }
            }
        }
        int[] emaitza = new int[cont];
        for (int a = 0; n > 1; a++) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n = n / i;
                    emaitza[a] = i;
                    break;
                }
            }
        }
        return emaitza;
    }

    public void zatikiakOrdenatu(Zatikia[] zatikiak) {

    }

}
