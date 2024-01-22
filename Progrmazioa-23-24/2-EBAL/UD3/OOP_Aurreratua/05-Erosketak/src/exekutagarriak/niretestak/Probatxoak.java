package exekutagarriak.niretestak;

import model.*;

public class Probatxoak {
    public static void main(String[] args) {
        Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@uni.eus");
        System.out.println("karlos => " + karlos);

        Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
        System.out.println("toshiba => " + toshiba);

        ArrayList<Produktua> erosketaHonetakoproduktuak = new ArrayList<>();
        erosketaHonetakoproduktuak.add(toshiba);
        ArrayList<Integer> erosketaHonetakounitateak = new ArrayList<>();
        erosketaHonetakounitateak.add(15);
        Erosketa gaurkoErosketa = new Erosketa("E18-02", "2018-10-24", karlos,
                erosketaHonetakoproduktuak, erosketaHonetakounitateak, 6750);
        System.out.println("gaurkoErosketa =>" + gaurkoErosketa);
        System.out.println("Orain formato luzean:");
        System.out.println(gaurkoErosketa.toStringLuzea());

        if (gaurkoErosketa.guztiraEgiaztatu())
            System.out.println("Datu zuzenak.");
        else
            System.out.println("'guztira' atributua ez dator bat produktuen zerrendak dioenarekin.");
    }
}
