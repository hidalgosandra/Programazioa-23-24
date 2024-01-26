package model;

public class Enpresa extends Bezeroa {
    /* Izen komertziala bidali */
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;

    public Enpresa(int kodea, String izenJuridikoa, String izenKomertziala, String helbidea,
            String[] kontaktoenEmailak) {
        super(kodea, izenJuridikoa, helbidea);
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }

    public String getIzenKomertziala() {
        return izenKomertziala;
    }

    public String[] getKontaktoenEmailak() {
        return kontaktoenEmailak;
    }

}
