package model;

import model.*;

public abstract class Bezeroa {
    private int kodea;
    private String helbidea;

    public Bezeroa(int kodea, String izena){
        this.kodea = kodea;
        this.helbidea = helbidea;
    }
    public int getKodea() {
        return kodea;
    }

    public String getHelbidea() {
        return helbidea;
    }

    public String getIzena() {
        return null;
    }

    public String getEmaila() {
        return null;
    }

    public void setKodea(int kodea) {
        this.kodea = kodea;
    }

    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

}
