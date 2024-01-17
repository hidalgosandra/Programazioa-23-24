package herentziamemberabstraktoekin.model;

import java.util.Random;
import java.util.ArrayList;

public class Hiztegia {
    static ArrayList<String> izenArruntak = new ArrayList<String>();
    static ArrayList<String> adjetiboak = new ArrayList<String>();

    static {
        izenArruntak();
        adjetiboak();
    }

    public static ArrayList<String> izenArruntak() {
        izenArruntak.add("Buru");
        izenArruntak.add("Belarri");
        izenArruntak.add("Zango");
        izenArruntak.add("Gorputz");
        izenArruntak.add("Aho");
        izenArruntak.add("Esku");
        return izenArruntak;
    }

    public static ArrayList<String> adjetiboak() {
        adjetiboak.add("Handi");
        adjetiboak.add("Txiki");
        adjetiboak.add("Luze");
        adjetiboak.add("Labur");
        adjetiboak.add("Zikin");
        adjetiboak.add("Pozoitsu");
        adjetiboak.add("Lirain");
        adjetiboak.add("Eder");
        adjetiboak.add("Indartsu");
        return adjetiboak;
    }

    public static String getKonposatua() {
        Random random = new Random();
        int i = random.nextInt(izenArruntak.size());
        int a = random.nextInt(adjetiboak.size());
        return izenArruntak.get(i) + adjetiboak.get(a);
    }

    public ArrayList<String> getIzenArruntak() {
        return izenArruntak;
    }

    public void setIzenArruntak(ArrayList<String> izenArruntak) {
        this.izenArruntak = izenArruntak;
    }

    public ArrayList<String> getAdjetiboak() {
        return adjetiboak;
    }

    public void setAdjetiboak(ArrayList<String> adjetiboak) {
        this.adjetiboak = adjetiboak;
    }
}
