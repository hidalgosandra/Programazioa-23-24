package model;

public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

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
        return izendatzailea + "/" + zenbakitzailea;
    }

    public Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        Zatikia bid = new Zatikia(izendatzailea, zenbakitzailea);

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

    public Zatikia(String zattIdatzia) {

    }

    public Zatikia() {

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
