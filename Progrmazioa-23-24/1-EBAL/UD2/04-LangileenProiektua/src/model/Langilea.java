package model;

public class Langilea {
    private int id;
    private String izena;
    private String abizena;
    private double soldata;

    public Langilea(int id, String izena, String abizena) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getIzenOsoa() {
        String izenO;
        izenO = izena + abizena;
        return izenO;
    }

    public double getSoldata() {
        return soldata;
    }

    public double getUrtekoSoldata() {
        double urtSold;
        urtSold = soldata * 12;
        return urtSold;
    }

    public void setSoldata(double soldata) {
        this.soldata = soldata;
    }

    public double soldataIgo(int portzentaia) {
        double soldBerri;
        soldBerri = soldata + (soldata * (portzentaia / 100.0));
        this.soldata = soldBerri;
        return soldBerri;
    }

    public String toString() {
        String langDatuak;
        langDatuak = "Id: " + id + " Izena: " + izena + " Abizena: " + abizena + " Soldata: " + soldata
                + " Urteko soldata: " + getUrtekoSoldata();
        return langDatuak;
    }

    public Langilea[] nireHamarLagunLangile() {
        Langilea[] hamarLangile = new Langilea[10];
        String izenak[] = { "Aitor", "Sandra", "Oier", "Koldo", "Nerea", "Idoia", "Iker", "Sergio", "Asur", "Axel" };
        String abizenak[] = { "Iriondo", "Hidalgo", "Dominguez", "Lopez", "Gomez", "Palomares", "Lopez", "Mendi",
                "Letamendi", "Parachu" };
        for (int i = 0; i < 10; i++) {
            hamarLangile[i] = new Langilea(i + 1, izenak[i], abizenak[i]);
        }
        return hamarLangile;
    }

    public String bilatu(String izen, langileak[]){
        if (langileak[i] < 10) {
            for(int i = 0; i < 10; i++){
                if (langileak[i] == izen) {
                    return izen;
                }
            }
        }else{
            return "Null";
        }
        
    }
}
