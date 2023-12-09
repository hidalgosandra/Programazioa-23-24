package model;

import java.util.*;
import java.time.LocalDate;

public class Liburua {

    private String kodea;
    private String izenburua;
    private String egilea;
    private char hizkuntza; // E:Euskara, I:Ingelesa, G:Gaztelera, -:BesteBat
    private int urtea; // Argitaratze urtea
    private boolean mailegatuta; // mailegatuta edo erabilgarri
    private Mailegua[] maileguak;// Liburu bakoitza 100 aldiz mailegatu ahal izango da
    private ArrayList<Mailegua> Maileguak = new ArrayList<Mailegua>();

    /**
     * Kontutan izan:
     * - kodea atributoaren balioa kalkulatu behar da: Egilearen lehen lau
     * karaktereei puntu bat eta izenburuaren lehen lau karaktereak gehituz. Dena
     * maiuskulaz.
     * - hizkuntza atributoak balio egokia izango duela ziurtatzeko setterrareni
     * deitu
     * behar zaio
     * - Liburu berriak ez daude mailegatuta, erabilgarri baizik.
     * - Maileguen arraya sortu behar da.
     */
    public Liburua(String izenburua, String egilea, char hizkuntza, int urtea) {
        // OSATU EZAZU KONSTRUKTORE HAU
        this.kodea = egilea.substring(0, 4).toUpperCase() + "." + izenburua.substring(0, 4).toUpperCase();
        this.izenburua = izenburua;
        this.egilea = egilea;
        this.setHizkuntza(hizkuntza);
        this.urtea = urtea;
        this.mailegatuta = false;
        this.maileguak = maileguak;
    }

    /**
     * Getter arrunta
     */
    public String getKodea() {
        return kodea;
    }

    /**
     * Setter arrunta
     */
    public void setKodea(String kodea) {
        this.kodea = kodea;
    }

    /**
     * Getter arrunta
     */
    public String getIzenburua() {
        return izenburua;
    }

    /**
     * Setter arrunta
     */
    public void setIzenburua(String izenburua) {
        this.izenburua = izenburua;
    }

    /**
     * Getter arrunta
     */
    public String getEgilea() {
        return egilea;
    }

    /**
     * Setter arrunta
     */
    public void setEgilea(String egilea) {
        this.egilea = egilea;
    }

    /**
     * Getter arrunta
     */
    public char getHizkuntza() {
        return hizkuntza;
    }

    /**
     * Hizkuntza atributua char motakoa da. Metodo honek atributu hori aztertu eta
     * formatu luzeago baten bueltatzen du.
     * 
     * @return Hitz hauetako bat: "Euskara", "Ingelesa", "Gaztelera", "BesteBat"
     */
    public String getHizkuntzaOsoa() {
        // OSATU EZAZU METODO HAU
        String hizkLuzea[] = { "Euskera", "Ingelesa", "Gaztelera", "BesteBat" };
        switch (hizkuntza) {
            case 'E':
                return hizkLuzea[0];
            case 'I':
                return hizkLuzea[1];
            case 'G':
                return hizkLuzea[2];
            default:
                return hizkLuzea[3];
        }
    }

    /**
     * Hizkuntza atributuak onartutako lau balioetako bat eta besterik ez duela
     * izango ziurtatu behar da setter honen bidez.
     * 
     * @param hizkuntza
     */
    public void setHizkuntza(char hizkuntza) {
        // OSATU EZAZU METODO HAU
        if (hizkuntza == 'E' || hizkuntza == 'I' || hizkuntza == 'G') {
            this.hizkuntza = hizkuntza;
        }

        /*
         * switch (hizkuntza) {
         * case 'e':
         * this.hizkuntza = 'E';
         * break;
         * case 'E':
         * this.hizkuntza = 'E';
         * break;
         * case 'g':
         * this.hizkuntza = 'G';
         * break;
         * case 'G':
         * this.hizkuntza = 'G';
         * break;
         * case 'i':
         * this.hizkuntza = 'I';
         * break;
         * case 'I':
         * this.hizkuntza = 'I';
         * break;
         * default:
         * this.hizkuntza = '-';
         * break;
         * }
         * if (hizkuntza == 'e' || hizkuntza == 'E') {
         * hizkuntza = 'E';
         * } else if (hizkuntza == 'g' || hizkuntza == 'G') {
         * hizkuntza = 'G';
         * } else if (hizkuntza == 'i' || hizkuntza == 'I') {
         * hizkuntza = 'I';
         * } else {
         * hizkuntza = '-';
         * }
         */

    }

    /**
     * Getter arrunta
     */
    public int getUrtea() {
        return urtea;
    }

    /**
     * Setter arrunta
     */
    public void setUrtea(int urtea) {
        this.urtea = urtea;
    }

    /**
     * Getter arrunta
     */
    public boolean isMailegatuta() {
        return mailegatuta;
    }

    public void setMailegatuta(boolean mailegatuta) {
        this.mailegatuta = mailegatuta;
    }

    /**
     * Liburuen informazioa String formatuan bueltatuko du hainbat lerrotan
     * (Gogoratu "\n" lerro jausia dala eta "\t" tabuladorea)
     * Adi "hizkuntza" eta "mailegatuta" atributuen formatuari. Adibidez,
     * 
     * LIBURUA: ATXA.OBAB
     * Izenburua: Obabakoak
     * Egilea: Atxaga
     * Hizkuntza: Euskara
     * Urtea: 1988
     * Egoera: Erabilgarri//edo Mailegatuta
     * 
     */
    @Override
    public String toString() {
        // OSATU EZAZU METODO HAU
        String infor;
        String mai;
        if (mailegatuta = false) {
            mai = "Erabilgarri";
        } else {
            mai = "Mailegatuta";
        }
        infor = "\t Liburua: " + kodea + "\n \t Izenburua: " + izenburua
                + "\n \t Egilea: " + egilea + "\n\t Hizkuntza: " + getHizkuntzaOsoa() + "\n \t Urtea: " + urtea
                + "\n \t Egoera: " + mai;
        return infor;
    }

    /**
     * Liburua zein mendetan argitaratu den itzultzen du. Adibidez,
     * 1918 => 20
     * 2023 => 21 *
     * Kristo osteko edozein urtetarako funtzionatu beharko zuen.
     */
    public int getMendea() {
        // OSATU EZAZU METODO HAU
        return urtea / 100 + 1;
    }

    /**
     * Biltegi persistente baten gordeta dauden datuak irakurtzen ez dakigun
     * bitartean, programatzaileak berak idatzitako datuak bueltatzen ditu metodo
     * honek.
     * 
     * @return Mila liburu gorde ditzakeen arraya bueltatzen du. Hutsuneak izan
     *         ditzake.
     */
    public static Liburua[] getKatalogoa() {
        Liburua[] katalogoa = new Liburua[1000];

        katalogoa[0] = new Liburua("East Wind:West Wind", "Pearl S.Buck", 'I', 1930);
        katalogoa[1] = new Liburua("Dragon Seed", "Pearl S.Buck", 'I', 1944);
        katalogoa[2] = new Liburua("Imperial Woman", "Pearl S.Buck", 'I', 1956);
        katalogoa[3] = new Liburua("Letter from Peking", "Pearl S.Buck", 'I', 1957);
        katalogoa[4] = new Liburua("Death in the Castle", "Pearl S.Buck", 'I', 1964);

        katalogoa[10] = new Liburua("Obabakoak", "Atxaga", 'E', 1988);
        katalogoa[11] = new Liburua("Behi eus. baten memoriak", "Atxaga", 'E', 1991);
        katalogoa[12] = new Liburua("Sara izeneko gizona", "Atxaga", 'E', 1996);
        katalogoa[13] = new Liburua("Soinujolearen semea", "Atxaga", 'E', 2003);
        katalogoa[14] = new Liburua("Zazpi etxe Frantzian", "Atxaga", 'E', 2009);
        katalogoa[15] = new Liburua("Nevadako Egunak", "Atxaga", 'E', 2013);

        katalogoa[20] = new Liburua("Aulki bat elurretan", "Uxue Alberdi", 'E', 2007);
        katalogoa[21] = new Liburua("Euli giro", "Uxue Alberdi", 'E', 2013);

        katalogoa[31] = new Liburua("Basilika", "Itxaro Borda", 'E', 1985);
        katalogoa[32] = new Liburua("Zeruetako Erresuma", "Itxaro Borda", 'E', 2005);
        katalogoa[33] = new Liburua("Boga boga", "Itxaro Borda", 'E', 2012);

        katalogoa[40] = new Liburua("Brujas", "Toti M.Lezea", 'G', 2006);
        katalogoa[41] = new Liburua("Muerte en el priorato", "Toti M.Lezea", 'G', 2008);

        katalogoa[50] = new Liburua("Pride and Prejudice", "Jane Austen", 'I', 1813);
        katalogoa[51] = new Liburua("Petit Prince", "Antoine Saint-Exupéry", 'F', 1943);

        return katalogoa;
    }

    /**
     * Kode jakin bat duen liburua bilatzen du liburuen array baten. Datu biak
     * parametro moduan jasoko dira.
     * 
     * @param kodea
     * @param liburuak Liburu objektuen array bat. Arrayak hutsuneak izan ditzake.
     *                 Liburu guztiek kode desberdina dutela ziurtatuta dago.
     * @return Bilatzen gabiltzan liburu objektua edo null aurkitu ez bada
     */
    public static Liburua liburuaBilatu(String kodea, Liburua[] liburuak) {
        // OSATU EZAZU METODO HAU
        for (int i = 0; i < liburuak.length; i++) {
            if (liburuak[i] != null && liburuak[i].getKodea().equals(kodea)) {
                return liburuak[i];
            }
        }
        return null;
    }

    /**
     * Getter arrunta
     */
    public Mailegua[] getMaileguak() {
        return maileguak;
    }

    /**
     * Setter arrunta
     */
    public void setMaileguak(Mailegua[] maileguak) {
        this.maileguak = maileguak;
    }

    /**
     * Liburu hau momentu honetararte zenbat aldiz mailegatu den bueltatzen du,
     * maileguen arraya aztertuta.
     * 
     * @return Mailegu kopurua
     */
    public int getMaileguKopurua() {
        return Maileguak.size();
    }

    /**
     * Mailegu bat gehitzen du arrayko lehen posizio librean.
     * Lekurik geratzen ez bada false bueltatuko du.
     */
    public boolean maileguaGehitu(Mailegua m) {
        // OSATU EZAZU METODO HAU
        Maileguak.add(m);
        return true;
    }

    /**
     * Azken maileguaren itzulera data erregistratzen du
     */
    public void liburuaItzuli() {
        // OSATU EZAZU METODO HAU
        this.maileguak[this.getMaileguKopurua() - 1].itzuli();
        this.mailegatuta = false;
    }
}
