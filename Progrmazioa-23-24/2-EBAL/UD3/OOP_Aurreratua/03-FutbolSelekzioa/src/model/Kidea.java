package model;

public class Kidea {
    protected int id;
    protected String izena;
    private String abizena;
    private int adina;

    public Kidea(int id, String izena, String abizena, int adina) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.adina = adina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

    public int getAdina() {
        return adina;
    }

    public void setAdina(int adina) {
        this.adina = adina;
    }

    public void elkartu() {
        System.out.println(id + "elkartu da");
    }

    public void bidaiatu() {
        System.out.println(id + "bidai batera joan da");
    }
}