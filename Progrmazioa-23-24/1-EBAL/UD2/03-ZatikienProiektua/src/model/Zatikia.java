package model;

public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia(String zattIdatzia) {
        zattIdatzia = izendatzailea + "/" + zenbakitzailea;
    }

    public Zatikia() {
        izendatzailea = 5;
        zenbakitzailea = 5;
    }

    public Zatikia(int zenbakitzailea, int izendatzailea) {
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
        zat = izendatzailea + "/" + zenbakitzailea;
        return zat;
    }

    public Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        Zatikia bid = new Zatikia(izendatzailea, zenbakitzailea);
        bid.setIzendatzailea(zat1.getIzendatzailea() * zat2.getIzendatzailea());
        bid.setZenbakitzailea(zat1.getZenbakitzailea() * zat2.getZenbakitzailea());
        return bid;
    }

    public Zatikia batu(Zatikia za1, Zatikia zat1) {
        Zatikia bat = new Zatikia(zenbakitzailea, izendatzailea);
        return bat;
    }

    public void batu(Zatikia besteZatBat) {

    }

    public double hamartarBaliokidea() {
        return izendatzailea;

    }

    public boolean isBaliokidea(Zatikia besteZatikiBat) {
        return false;

    }

    public boolean isBiggerThan(Zatikia besteZatikiBat) {
        return false;

    }

    public void sinprifikatu() {

    }

    public int mkt(int n1, int n2) {
        return n1;

    }

    public int zkh(int n1, int n2) {
        return n1;

    }

    public int[] faktorizatu(int n) {
        return null;

    }

    public void zatikiakOrdenatu(Zatikia[] zatikiak) {

    }

}
