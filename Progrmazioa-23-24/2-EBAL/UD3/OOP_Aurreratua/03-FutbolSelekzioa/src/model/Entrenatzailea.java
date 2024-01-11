package model;

public class Entrenatzailea extends Kidea {
    private String idFederazioa;
    private int dortsala;

    public Entrenatzailea(int id, String izena, String abizena, int dortsala, String idFederazioa) {
        super(id, izena, abizena, dortsala);
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.dortsala = dortsala;
        this.idFederazioa = idFederazioa;
    }

    public String getIdFederazioa() {
        return idFederazioa;
    }

    public void setIdFederazioa(String idFederazioa) {
        this.idFederazioa = idFederazioa;
    }

    public void entrenamenduaZuzendu() {

    }

    public void partidaZuzendu() {

    }
}
