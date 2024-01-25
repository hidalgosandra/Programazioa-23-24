package exekutagarriak.niretestak;

import java.util.ArrayList;

import model.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author imadariaga
 */
public class PdfkoDatuakSortu {

        public static void main(String[] args) {

                Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ",
                                "kargi@zarautz.eus");
                Bezeroa martin = new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA",
                                "mbera@donostia.eus");

                String[] emailak = { "idazkaria@uni.eus", "zuzendaria@uni.eus" };
                Bezeroa uni = new Enpresa(3, "CIFP Uni LHII", "Uni Eibar-Ermua", "Otaola Hiribidea 29, Eibar", emailak);

                Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
                Produktua hp = new Produktua("C02", "HP Pavilion", 600);
                Produktua samsung = new Produktua("T01", "Samsung Galaxy", 210);
                Produktua aifon = new Produktua("T02", "iPhone XX", 1300);

                ArrayList<Produktua> lehenErosketaProduktuak = new ArrayList<>();
                lehenErosketaProduktuak.add(toshiba);
                lehenErosketaProduktuak.add(hp);
                lehenErosketaProduktuak.add(samsung);
                ArrayList<Integer> lehenErosketaUnitateak = new ArrayList<>();
                lehenErosketaUnitateak.add(4);
                lehenErosketaUnitateak.add(2);
                lehenErosketaUnitateak.add(3);
                Erosketa lehenErosketa = new Erosketa("E18-01", "2018-09-25", martin,
                                lehenErosketaProduktuak, lehenErosketaUnitateak, 3630);
                System.out.println(lehenErosketa.toStringLuzea());
                System.out.println("--------------------------------------------------");

                ArrayList<Produktua> bigarrenErosketaProduktuak = new ArrayList<>();
                bigarrenErosketaProduktuak.add(toshiba);
                ArrayList<Integer> bigarrenErosketaUnitateak = new ArrayList<>();
                bigarrenErosketaUnitateak.add(15);
                Erosketa bigarrenErosketa = new Erosketa("E18-02", "2018-10-24", karlos,
                                bigarrenErosketaProduktuak, bigarrenErosketaUnitateak, 6750);
                System.out.println(bigarrenErosketa.toStringLuzea());
                System.out.println("--------------------------------------------------");

                ArrayList<Produktua> hirugarrenErosketaProduktuak = new ArrayList<>();
                hirugarrenErosketaProduktuak.add(toshiba);
                hirugarrenErosketaProduktuak.add(samsung);
                ArrayList<Integer> hirugarrenErosketaUnitateak = new ArrayList<>();
                hirugarrenErosketaUnitateak.add(1);
                hirugarrenErosketaUnitateak.add(1);
                Erosketa hirugarrenErosketa = new Erosketa("E19-01", "2019-01-09", karlos,
                                hirugarrenErosketaProduktuak, hirugarrenErosketaUnitateak, 660);
                System.out.println(hirugarrenErosketa.toStringLuzea());
                System.out.println("--------------------------------------------------");

                ArrayList<Produktua> laugarrenErosketaProduktuak = new ArrayList<>();
                laugarrenErosketaProduktuak.add(toshiba);
                laugarrenErosketaProduktuak.add(hp);
                laugarrenErosketaProduktuak.add(aifon);
                ArrayList<Integer> laugarrenErosketaUnitateak = new ArrayList<>();
                laugarrenErosketaUnitateak.add(3);
                laugarrenErosketaUnitateak.add(1);
                laugarrenErosketaUnitateak.add(1);
                Erosketa laugarrenErosketa = new EpekakoErosketa("E19-02", "2019-02-09", karlos,
                                laugarrenErosketaProduktuak, laugarrenErosketaUnitateak, 3250, 300);
                System.out.println(laugarrenErosketa.toStringLuzea());
                System.out.println("Gainetik ordainduko dena: "
                                + ((EpekakoErosketa) laugarrenErosketa).gainetikOrdainduBeharrekoa());

                ArrayList<Produktua> bostgarrenErosketaProduktuak = new ArrayList<>();
                bostgarrenErosketaProduktuak.add(hp);
                ArrayList<Integer> bostgarrenErosketaUnitateak = new ArrayList<>();
                bostgarrenErosketaUnitateak.add(15);
                Erosketa bostgarrenErosketa = new Erosketa("E21-01", "2021-01-17", uni,
                                bostgarrenErosketaProduktuak, bostgarrenErosketaUnitateak, 15000);
                System.out.println(bostgarrenErosketa.toStringLuzea());

        }

}