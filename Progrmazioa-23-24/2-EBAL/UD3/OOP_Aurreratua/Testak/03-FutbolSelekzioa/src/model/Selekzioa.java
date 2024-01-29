package model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

import model.enumerazioak.Demarkazioa;
import model.enumerazioak.Herria;

public class Selekzioa {
    private ArrayList<Kidea> kideak = new ArrayList<>();
    private int azkenId = 0;
    public Herria herria;

    public Selekzioa(String Herrialdea) {
        if (Herrialdea.equals("Euskadi")) {
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
            kideak.add(new Atezaina(++azkenId, "Aitor", "Fernández", 29, 1, Demarkazioa.POR, 8));
        } else if (Herrialdea.equals("Rumania")) { // https://en.wikipedia.org/wiki/Romania_national_football_team#Players
            herria = Herria.ro;
            kideak.add(new Futbolaria(++azkenId, "Horatiu", "Moldovan", 25, 1, Demarkazioa.POR));
        } else
            System.out.println("Selekzio honen daturik ez daukagu momentuz. Kide gabe sortuko da.");
    }

    public void kideakBistaratu() {
        for (Kidea e : kideak) {
            System.out.println("ID: " + e.getId() + " Izena: " + e.getIzena() + " Abizena: " + e.getAbizena()
                    + " Adina: " + e.getAdina() /**
                                                 * + ", Dortsala: " + ((Futbolaria) e).getDortsala() + ", Demarkazioa: "
                                                 * + ((Futbolaria) e).getDemarkazioa()
                                                 */
            );
        }
    }

    public void kideakTaldekatutaBistaratu() {
        if (herria == Herria.eus) {
            int idKide = 1;

            System.out.println("EUSKADIKO SELEKZIOA " + LocalDateTime.now() + azkenId);
            System.out.println("----------------------------------------------------------------");
            for (Kidea e : kideak) {
                if (e instanceof Futbolaria) {
                    Futbolaria futbolaria = (Futbolaria) e;
                    if (Demarkazioa.POR.equals(((Futbolaria) e).getDemarkazioa()) || e instanceof Atezaina) {
                        System.out.println(
                                "Atezaina{id= " + idKide + ", izena= " + e.getIzena() + ", abizena= " + e.getAbizena()
                                        + ", adina= " + e.getAdina() + ", dortsala= " + ((Futbolaria) e).getDortsala()
                                        + ", geratutakoGolak= " + ((Atezaina) e).getGeratutakoGolak());
                        idKide++;
                    } else if (Demarkazioa.DEF.equals(((Futbolaria) e).getDemarkazioa())
                            || Demarkazioa.MED.equals(((Futbolaria) e).getDemarkazioa())
                            || Demarkazioa.DEL.equals(((Futbolaria) e).getDemarkazioa())) {
                        System.out.println(
                                "Futbolaria{id= " + idKide + ", izena= " + e.getIzena() + ", abizena= " + e.getAbizena()
                                        + ", adina= " + e.getAdina() + ", dortsala= " + ((Futbolaria) e).getDortsala()
                                        + ", demarkazioa= " + ((Futbolaria) e).getDemarkazioa());
                        idKide++;
                    }
                } else if (e instanceof Entrenatzailea) {
                    System.out.println(
                            "Entrenatzailea{id= " + idKide + ", izena= " + e.getIzena() + ", abizena= " + e.getAbizena()
                                    + ", adina= " + e.getAdina() + ", idFederazioa= "
                                    + ((Entrenatzailea) e).getIdFederazioa());
                    idKide++;
                } else if (e instanceof Masajista) {
                    System.out.println(
                            "Masajista{id= " + idKide + ", izena= " + e.getIzena() + ", abizena= " + e.getAbizena()
                                    + ", adina= " + e.getAdina() + ", titulazioa= "
                                    + ((Masajista) e).getTitulazioa() + ", experientzia= "
                                    + ((Masajista) e).getExperienztia());
                    azkenId++;
                } else if (e instanceof Kidea) {
                    System.out.println("Kidea{id= " + azkenId + ", izena= " + e.getIzena() + ", abizena= "
                            + e.getAbizena() + ", adina= " + e.getAdina());
                }
            }
        }
    }

    /* Gepeto done */
    public void kideakTaldekatutaBistaratuBi() {
        if (herria == Herria.eus) {
            int idKide = 1;

            System.out.println("EUSKADIKO SELEKZIOA " + LocalDateTime.now() + azkenId);
            System.out.println("----------------------------------------------------------------");
            for (Kidea e : kideak) {
                System.out.print("ID: " + idKide + ", izena= " + e.getIzena() + ", abizena= " + e.getAbizena()
                        + ", adina= " + e.getAdina());

                if (e instanceof Futbolaria) {
                    Futbolaria futbolaria = (Futbolaria) e;
                    System.out.print(", dortsala= " + futbolaria.getDortsala());

                    if (e instanceof Atezaina) {
                        System.out.println(", geratutakoGolak= " + ((Atezaina) e).getGeratutakoGolak());
                    } else {
                        System.out.println(", demarkazioa= " + futbolaria.getDemarkazioa());
                    }
                } else if (e instanceof Entrenatzailea) {
                    System.out.println(", idFederazioa= " + ((Entrenatzailea) e).getIdFederazioa());
                } else if (e instanceof Masajista) {
                    System.out.println(", titulazioa= " + ((Masajista) e).getTitulazioa()
                            + ", experientzia= " + ((Masajista) e).getExperienztia());
                } else if (e instanceof Kidea) {
                    System.out.println();
                }

                idKide++;
            }
        }
    }

    public ArrayList<Kidea> getKideak() {
        return kideak;
    }

    public ArrayList<String> getKideenAbizenak() {
        ArrayList<String> abizenak = new ArrayList<String>();
        for (Kidea e : kideak) {
            abizenak.add(e.getAbizena());
        }
        return abizenak;
    }

    /**
     * Selekzioan kide berri bat gehitzeko balio du metodo honek.
     *
     * @param k Kide berriari dagokion objektua. Objektu honek dakarren id-ari ez
     *          zaio jaramonik egingo. Metodo honek id berria esleituko dio.
     * @return Kide berriari esleitutako identifikazio zenbakia.
     */

    public int kideBerria(Kidea k) {
        kideak.add(k);
        azkenId++;
        return azkenId;
    }

    /**
     * Selekzioko kideetako bat ezabatzen du.
     *
     * @param id
     * @return Ezabatutako kide kopurua itzuliko du metodo honek (0 edo 1).
     *         Gertatu daitekeelako id hori ez daukan kiderik egotea.
     */

    public int kideaEzabatu(int id) {
        id = id - 1;
        kideak.remove(id);
        azkenId--;
        return azkenId;
    }
}
