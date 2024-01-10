package model;

import java.util.ArrayList;

import model.enumerazioak.Demarkazioa;
import model.enumerazioak.Herria;

public class Selekzioa {
    private ArrayList<Kidea> kideak = new ArrayList<Kidea>();
    private int azkenId = 0;
    public Herria herria;

    public Selekzioa(String herrialdea) {
        if (herrialdea.equals("Euskadi")) { // https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi
            this.herria = Herria.eus;
            kideak.add(new Futbolaria(++azkenId, "Aitor", "Fernandez", 32, 1, Demarkazioa.POR));
            kideak.add(new Futbolaria(++azkenId, "Unai", "Bustinza", 31, 2, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Mikel", "Balenziaga", 35, 3, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Asier", "Illarramendi", 33, 4, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Inigo", "Martinez", 32, 5, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Mikel", "San Jose", 34, 6, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Gaizka", "Larrazabal", 26, 7, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Manu", "Garcia", 37, 8, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Aritz", "Arduriz", 42, 9, Demarkazioa.DEL));
            kideak.add(new Futbolaria(++azkenId, "Javier", "Eraso", 33, 10, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Asier", "Villalibre", 26, 11, Demarkazioa.MED));
            kideak.add(new Futbolaria(++azkenId, "Aihen", "Munoz", 26, 12, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Iago", "Herrerin", 35, 13, Demarkazioa.POR));
            kideak.add(new Futbolaria(++azkenId, "Aritz", "Elustondo", 29, 14, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Jesus", "Areso", 24, 15, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Inigo", "Vicente", 26, 16, Demarkazioa.DEL));
            kideak.add(new Futbolaria(++azkenId, "Daniel", "Vivian", 24, 17, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Inigo", "Johnson", 28, 18, Demarkazioa.DEF));
            kideak.add(new Futbolaria(++azkenId, "Francisco", "Domino", 29, 19, Demarkazioa.DEF));

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

    public void kideakTaldekatutaBistaratu() {
        System.out.println("SELEKZIOA: " + herria);
        System.out.println("==========================================");
        System.out.println("FUTBOLARIAK");
        System.out.println("-------------------");
        String dem;
        if (herria == Herria.eus) {
            for (Kidea k : kideak) {
                if (Demarkazioa.POR.equals(((Futbolaria) k).getDemarkazioa())) {
                    dem = "Atezaina";
                } else if (Demarkazioa.DEL.equals(((Futbolaria) k).getDemarkazioa())
                        || Demarkazioa.DEF.equals(((Futbolaria) k).getDemarkazioa())
                        || Demarkazioa.MED.equals(((Futbolaria) k).getDemarkazioa())) {
                    dem = "Futbolaria";
                } else {

                }
            }
            
            System.out.println("-------------------");
            System.out.println("Guztira: " + kideak.size() + " futbolari");
        }
    }

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
            }

        }
        return id;
    }
}
