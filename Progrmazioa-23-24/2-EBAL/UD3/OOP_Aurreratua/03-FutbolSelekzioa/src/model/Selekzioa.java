package model;

import java.util.ArrayList;

import model.enumerazioak.Demarkazioa;
import model.enumerazioak.Herria;

public class Selekzioa {
    private static ArrayList<Kidea> kideak = new ArrayList<Kidea>();
    private int azkenId = 0;
    public Herria herria;

    public Selekzioa(String herrialdea) {
        if (herrialdea.equals("Euskadi")) { // https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi
            this.herria = Herria.eus;
            kideak.add(new Futbolaria(++azkenId, "Unai", "Bustinza", 28, 2, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Mikel", "Balenziaga", 32, 3, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Asier", "Illarramendi", 30, 4, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Iñigo", "Martínez", 29, 5, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Mikel", "San José", 31, 6, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Gaizka", "Larrazabal", 23, 7, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Manu", "García", 34, 8, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Aritz", "Aduriz", 39, 9, Demarkazioa.DEL));
            kideak.add(new Futbolaria(++azkenId, "Javier", "Eraso", 30, 10, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL));
            kideak.add(new Futbolaria(++azkenId, "Aihen", "Muñoz", 23, 12, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Iago", "Herrerín", 32, 13, Demarkazioa.POR));
            kideak.add(new Futbolaria(++azkenId, "Aritz", "Elustondo", 26, 14, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Jesús", "Areso", 21, 15, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Iñigo", "Vicente", 23, 16, Demarkazioa.DEL));
            kideak.add(new Futbolaria(++azkenId, "Daniel", "Vivian", 21, 17, Demarkazioa.MED));

            kideak.add(new Entrenatzailea(++azkenId, "Javier", "Clemente", 0, "F1"));
            kideak.add(new Entrenatzailea(++azkenId, "Joseba", "Núñez", 0, "F2"));
            kideak.add(new Entrenatzailea(++azkenId, "Markel", "Lautadahandi", 0, "F3"));
            kideak.add(new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 0, "Fisioterapeuta", 0));
            kideak.add(new Kidea(++azkenId, "Ander", "Etxeburu", 0));
            kideak.add(new Atezaina(++azkenId, "Aitor", "Fernández", 29, 1, 8));

        } else if (herrialdea.equals("Rumania")) { // https://en.wikipedia.org/wiki/Romania_national_football_team#Players
            herria = Herria.ro;
            kideak.add(new Futbolaria(++azkenId, "Horatiu", "Moldovan", 25, 1, Demarkazioa.POR));

        } else {
            System.out.println("Selekzio honen daturik ez daukagu momentuz. Kide gabe sortuko da.");
        }
    }

    public void kideakBistaratu() {
        System.out.printf("%-3s%-15s%-15s%-7s%-9s%-12s%s\n", "ID", "Izena", "Abizena", "Adina", "Dortsala",
                "Demarkazioa", "Herria");
        for (int i = 0; i < kideak.size(); i++) {
            Kidea k = kideak.get(i);
            System.out.printf("%-3d%-15s%-15s%-7d%-9d%-12s%s\n",
                    k.getId(), k.getIzena(), k.getAbizena(), k.getAdina(), ((Futbolaria) k).getDortsala(),
                    ((Futbolaria) k).getDemarkazioa(), herria);
        }
        System.out.println("\n");
    }

    // hemendik

    public void kideakTaldekatutaBistaratu() {
        System.out.println("SELEKZIOA: " + herria);
        System.out.println("==========================================");
        System.out.println("FUTBOLARIAK");
        System.out.println("-------------------");
        String dem = "";

        if (herria == Herria.eus) {
            for (Kidea k : kideak) {
                if (Demarkazioa.POR.equals(((Futbolaria) k).getDemarkazioa())) {
                    dem = "Atezaina";
                } else if (Demarkazioa.DEL.equals(((Futbolaria) k).getDemarkazioa())
                        || Demarkazioa.DEF.equals(((Futbolaria) k).getDemarkazioa())
                        || Demarkazioa.MED.equals(((Futbolaria) k).getDemarkazioa())) {
                    dem = "Futbolaria";
                } else {
                    System.out.println(".");
                }
                System.out.println(dem + "id= " + k.getId() + "izena: " + k.getIzena() + "abizena: " + k.getAbizena()
                        + "adina: " + k.getAdina() + "dortsala: " + ((Futbolaria) k).getDortsala() + "demarkazioa: "
                        + ((Futbolaria) k).getDemarkazioa());
            }
        }
    }

    private int getEntrenatzaileKopurua() {
        int entrenatzaileKopurua = 0;
        for (Kidea k : kideak) {
            if (k instanceof Entrenatzailea) {
                entrenatzaileKopurua++;
            }
        }
        return entrenatzaileKopurua;
    }

    // honarte

    public ArrayList<Kidea> getKideak() {
        return kideak;
    }

    public ArrayList<String> getKideenIzenak() {
        ArrayList<String> izenak = new ArrayList<>();
        for (int i = 0; i < kideak.size(); i++) {
            Kidea k = kideak.get(i);
            izenak.add("ID: " + k.getId() + "\t Izena: " + k.getIzena());
        }
        return izenak;
    }

    public int Kideberria(Kidea k) {
        kideak.add(k);
        azkenId++;
        return azkenId;
    }

    public int kideaEzabatu(int id) {
        for (int i = 0; i < kideak.size(); i++) {
            if (id == i) {
                kideak.remove(i);
            } else {
                System.out.println("Id hau ez dago!");
                return -1;
            }
        }
        return id;
    }

    public static void futbolariakBistaratu() {
        for (Kidea k : kideak) {
            if (k instanceof Futbolaria) {
                System.out.println(
                        "Futbolaria{id=" + k.getId() + ", izena=" + k.getIzena() + ", abizena=" + k.getAbizena()
                                + ", adina=" + k.getAdina() + ", dortsala=" + ((Futbolaria) k).getDortsala()
                                + ", demarkazioa="
                                + ((Futbolaria) k).getDemarkazioa() + "}");
            }
        }
    }
}
