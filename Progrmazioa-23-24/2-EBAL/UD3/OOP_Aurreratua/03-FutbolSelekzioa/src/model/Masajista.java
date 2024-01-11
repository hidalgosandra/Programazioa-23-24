package model;

public class Masajista extends Kidea {
    private String titulazioa;
    private int experientzia;

    public Masajista(int id, String izena, String abizena, int dortsala, String titulazioa, int idFederazioa) {
        super(id, izena, abizena, dortsala);
        this.titulazioa = titulazioa;
    }

    public Masajista(int id, String izena, String abizena, int dortsala, String titulazioa, String idFederazioa,
            int experientzia) {
        super(id, izena, abizena, experientzia);
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
