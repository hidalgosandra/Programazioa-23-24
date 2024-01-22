public class Enpresa extends Bezeroa {
    /*Izen komertziala bidali */
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;
    public Enpresa(String izenJuridikoa, String izenKomertziala, String[] kontaktoenEmailak, int kodea, String helbidea){
        this.kodea = kodea;
        this.helbidea = helbidea;
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
