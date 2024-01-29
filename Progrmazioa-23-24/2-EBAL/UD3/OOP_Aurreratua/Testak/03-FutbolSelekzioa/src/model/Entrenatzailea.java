package model;

public class Entrenatzailea extends Kidea {
    private String idFederazioa;

    public Entrenatzailea(int id, String izena, String abizena, int adina, String idFederazioa) {
        super(id, izena, abizena, adina);
        this.idFederazioa = idFederazioa;
    }

    public String getIdFederazioa() {
        return idFederazioa;
    }

    public void setIdFederazioa(String idFederazioa) {
        this.idFederazioa = idFederazioa;
    }

    public void entrenamenduaZuzendu() {
        System.out.println(this.idFederazioa + " zuzendu du entrenamendua");
    }

    public void partidaZuzendu() {
        System.out.println(this.idFederazioa + " zuzendu du partida");
    }
}
