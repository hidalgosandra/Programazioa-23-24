package model;

public class Masajista {
    private String titulazioa;
    private int experientzia;

    public Masajista(String titulazioa, int experientzia) {
        this.titulazioa = titulazioa;
        this.experientzia = experientzia;
    }

    public String getTitulazioa() {
        return titulazioa;
    }

    public void setTitulazioa(String titulazioa) {
        this.titulazioa = titulazioa;
    }

    public int getExperientzia() {
        return experientzia;
    }

    public void setExperientzia(int experientzia) {
        this.experientzia = experientzia;
    }

    public Masajista masajeaEman() {
        return null;
    }
}
