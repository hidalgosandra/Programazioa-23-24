package model;

public class Masajista extends Kidea {
    private String titulazioa;
    private int experienztia;
    public Masajista(int id, String izena, String abizena, int adina, String titulazioa, int experienztia) {
        super(id, izena, abizena, adina);
        this.titulazioa = titulazioa;
        this.experienztia = experienztia;
    }
    public String getTitulazioa() {
        return titulazioa;
    }
    public void setTitulazioa(String titulazioa) {
        this.titulazioa = titulazioa;
    }
    public int getExperienztia() {
        return experienztia;
    }
    public void setExperienztia(int experienztia) {
        this.experienztia = experienztia;
    }
    
    public void masajeaEman(){
        System.out.println(this.id + " masajea eman du");
    }
}
