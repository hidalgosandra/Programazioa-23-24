package exekutagarriak;

import java.util.ArrayList;

import model.*;

public class DatuakAztertu {
        private static ArrayList<Bezeroa> kontaktuak = new ArrayList<Bezeroa>();
        private static ArrayList<Produktua> produktuKatalogoa = new ArrayList<Produktua>();
        private static ArrayList<Erosketa> erosketenZerrenda = new ArrayList<Erosketa>();

        public static void main(String[] args) {
                initialize();
                erosketakBezeroka();
        }

        /**
         * 
         * Metodo honek kontaktuak, produktuKatalogoa eta erosketenZerrenda
         * 
         * arraylistak hasieratzen ditu... pdf-ko datuekin... eta gehiagorekin
         * 
         */
        public static void initialize() {

                kontaktuak = new ArrayList<>();

                kontaktuak.add(new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ",
                                "kargi@zarautz.eus"));

                kontaktuak.add(new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA",
                                "mbera@donostia.eus"));

                String imeilak[] = { "idazkaria@uni.eus", "zuzendaria@uni.eus" };

                kontaktuak.add(new Enpresa(3, "CIFP Uni Eibar-Ermua LHII", "Uni Eibar-Ermua", "Otaola Hiribidea 29",
                                imeilak));

                produktuKatalogoa = new ArrayList<>();

                produktuKatalogoa.add(new Produktua("C01", "Toshiba Satellite Pro", 450));

                produktuKatalogoa.add(new Produktua("C02", "HP Pavilion", 600));

                produktuKatalogoa.add(new Produktua("T01", "Samsung Galaxy", 210));

                produktuKatalogoa.add(new Produktua("T02", "iPhone XX", 1300));

                erosketenZerrenda = new ArrayList<>();

                /*********** EROSKETA *************/

                ArrayList<Produktua> lehenErosketaProduktuak = new ArrayList<>();

                lehenErosketaProduktuak.add(produktuKatalogoa.get(0));

                lehenErosketaProduktuak.add(produktuKatalogoa.get(1));

                lehenErosketaProduktuak.add(produktuKatalogoa.get(2));

                ArrayList<Integer> lehenErosketaUnitateak = new ArrayList<>();

                lehenErosketaUnitateak.add(4);

                lehenErosketaUnitateak.add(2);

                lehenErosketaUnitateak.add(3);

                erosketenZerrenda.add(new Erosketa("E18-01", "2018-09-25", kontaktuak.get(1), lehenErosketaProduktuak,

                                lehenErosketaUnitateak, 3630));

                /*********** EROSKETA *************/

                ArrayList<Produktua> bigarrenErosketaProduktuak = new ArrayList<>();

                bigarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

                ArrayList<Integer> bigarrenErosketaUnitateak = new ArrayList<>();

                bigarrenErosketaUnitateak.add(15);

                erosketenZerrenda.add(new Erosketa("E18-02", "2018-10-24", kontaktuak.get(0),

                                bigarrenErosketaProduktuak, bigarrenErosketaUnitateak, 6750));

                /*********** EROSKETA *************/

                ArrayList<Produktua> hirugarrenErosketaProduktuak = new ArrayList<>();

                hirugarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

                hirugarrenErosketaProduktuak.add(produktuKatalogoa.get(3));

                ArrayList<Integer> hirugarrenErosketaUnitateak = new ArrayList<>();

                hirugarrenErosketaUnitateak.add(1);

                hirugarrenErosketaUnitateak.add(1);

                erosketenZerrenda.add(new Erosketa("E19-01", "2019-01-09", kontaktuak.get(0),

                                hirugarrenErosketaProduktuak, hirugarrenErosketaUnitateak, 660));

                /*********** EROSKETA: 4 *************/

                ArrayList<Produktua> laugarrenErosketaProduktuak = new ArrayList<>();

                laugarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

                laugarrenErosketaProduktuak.add(produktuKatalogoa.get(1));

                laugarrenErosketaProduktuak.add(produktuKatalogoa.get(3));

                ArrayList<Integer> laugarrenErosketaUnitateak = new ArrayList<>();

                laugarrenErosketaUnitateak.add(3);

                laugarrenErosketaUnitateak.add(1);

                laugarrenErosketaUnitateak.add(1);

                erosketenZerrenda.add(new EpekakoErosketa("E19-02", "2019-02-09",

                                kontaktuak.get(1), laugarrenErosketaProduktuak, laugarrenErosketaUnitateak, 3250, 300));

                /*********** EROSKETA: 5 *************/

                erosketenZerrenda.add(new Erosketa("E21-01", "2021-01-17",

                                kontaktuak.get(2), null, null, 15000));

                /*********** EROSKETA 6 *************/

                erosketenZerrenda.add(new Erosketa("E22-01", "2022-01-18",

                                kontaktuak.get(2), null, null, 6600));

                /*********** EROSKETA 7 *************/

                erosketenZerrenda.add(new EpekakoErosketa("E22-02", "2022-02-20",

                                kontaktuak.get(0), null, null, 135000, 8000));

                /*********** EROSKETA 8 *************/

                erosketenZerrenda.add(new Erosketa("E22-03", "2022-02-21",

                                kontaktuak.get(2), null, null, 7550));

                /*********** EROSKETA 9 *************/

                erosketenZerrenda.add(new EpekakoErosketa("E22-04", "2022-02-27",

                                kontaktuak.get(1), null, null, 32500, 3000));

                /*********** EROSKETA 10 *************/

                erosketenZerrenda.add(new Erosketa("E23-01", "2023-01-02",

                                kontaktuak.get(2), null, null, 2560));

                /*********** EROSKETA 11 *************/

                erosketenZerrenda.add(new Erosketa("E23-02", "2023-02-02",

                                kontaktuak.get(0), null, null, 1300));

                /*********** EROSKETA 12 *************/

                erosketenZerrenda.add(new Erosketa("E23-03", "2023-02-02",

                                kontaktuak.get(1), null, null, 1050));

                /*********** EROSKETA 13 *************/

                erosketenZerrenda.add(new EpekakoErosketa("E23-04", "2023-02-12",

                                kontaktuak.get(2), null, null, 33800, 3000));

        }

        public static void erosketenZerrenda() {
                for (int i = 0; i < erosketenZerrenda.size(); i++) {
                        System.out.println(erosketenZerrenda.get(i));
                }
        }

        public double fakturazioOsoa() {
                for (int i = 0; i < erosketenZerrenda.size(); i++) {
                        erosketenZerrenda.get(i);
                }
                return 0.0;
        }

        public Bezeroa bezerorikOnena() {
                for (int i = 0; i < kontaktuak.size(); i++) {
                        kontaktuak.get(i);
                }
                return null;
        }

        public static void helbideaBilatu() {
                for (int i = 0; i < kontaktuak.size(); i++) {
                        System.out.println(kontaktuak.get(i).getHelbidea());
                }
        }

        public static void erosketakBezeroka() {
                for (int i = 0; i < kontaktuak.size(); i++) {
                        System.out.printf("Kodea: %s, Izena: %s, Abizena: %s, Helbidea: %s", kontaktuak.get(i).getKodea(), kontaktuak.get(i).getIzena(),
                                        ((Pertsona) kontaktuak.get(i)).getAbizena(),
                                        ((Pertsona) kontaktuak.get(i)).getHelbidea());
                        for (int b = 0; b < kontaktuak.size() && b < erosketenZerrenda.size(); b++) {
                                System.out.println(erosketenZerrenda.get(b));
                        }
                }
                System.out.println("BEZEROAREN LABURPENA: ");
        }

        public void erosketaKopuruUrteEtaHilabeteko() {

        }

}