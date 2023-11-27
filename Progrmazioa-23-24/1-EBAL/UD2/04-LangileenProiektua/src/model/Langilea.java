package model;

import java.util.Scanner;

public class Langilea {
    private int id;
    private String izena;
    private String abizena;
    private double soldata;

    public Langilea(int id, String izena, String abizena, double soldata) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;
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
        return soldata;
    }

    public String toString() {
        String langDatuak;
        langDatuak = "Id: " + id + " Izena: " + izena + " Abizena: " + abizena + " Soldata: " + soldata
                + " Urteko soldata: " + getUrtekoSoldata();
        return langDatuak;
    }

    public static Langilea bilatu(String izen, Langilea langileak[]) {
        for (int i = 0; i < langileak.length; i++) {
            if (langileak[i].getIzena().equals(izen)) {
                return langileak[i];
            }
        }
        return null;
    }

    public static Langilea[] nireHamarLagunLangile() {
        Langilea[] hamarLangile = new Langilea[10];
        String izenak[] = { "Aitor", "Sandra", "Oier", "Koldo", "Nerea", "Idoia", "Iker", "Sergio", "Asur", "Axel" };
        String abizenak[] = { "Iriondo", "Hidalgo", "Dominguez", "Lopez", "Gomez", "Lopez", "Palomares", "Letamentia",
                "Mendi", "Parachu" };
        for (int i = 0; i < hamarLangile.length; i++) {
            hamarLangile[i] = new Langilea(i + 1, izenak[i], abizenak[i], ((i * 200.0) + 100.0));
        }
        return hamarLangile;
    }

    public static void langileakKontratatu(Langilea[] ehunLangileak, Scanner in) {
        int id = bilatuLehenPosizioLibrea();

        System.out.print("Zein da langile berriaren izena: ");
        String izena = in.next();

        System.out.print("Zein da langile berriaren abizena: ");
        String abizena = in.next();

        System.out.print("Zein da langilearen soldata: ");
        double soldata = in.nextDouble();

        for (int i = 0; i < ehunLangileak.length; i++) {
            if (ehunLangileak[i] == null) {
                ehunLangileak[i] = new Langilea(id, izena, abizena, soldata);
                break;
            }
        }
    }

    public static int bilatuLehenPosizioLibrea() {
        Langilea langileak[] = new Langilea[100];
        Langilea langilea[] = Langilea.nireHamarLagunLangile();
        for (int i = 0; i < langileak.length && i < langilea.length; i++) {
            langileak[i] = langilea[i];
        }
        for (int i = 0; i < langileak.length; i++) {
            if (langileak[i] == null) {
                return i + 1;
            }
        }
        return -1;
    }

}
