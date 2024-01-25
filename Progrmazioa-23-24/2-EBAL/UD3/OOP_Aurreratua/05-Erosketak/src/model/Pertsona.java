package model;

public class Pertsona extends Bezeroa {
    private String izena;
    private String abizena;
    private String emaila;

    public Pertsona(int kodea, String izena, String abizena, String emaila, String helbidea) {
        super(kodea, helbidea);
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getEmaila() {
        return emaila;
    }

}
