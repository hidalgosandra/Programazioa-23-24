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
        izenArruntak.add("buru");
        izenArruntak.add("belarri");
        izenArruntak.add("zango");
        izenArruntak.add("gorputz");
        izenArruntak.add("aho");
        izenArruntak.add("esku");
        return izenArruntak;
    }

    public static ArrayList<String> adjetiboak() {
        adjetiboak.add("handi");
        adjetiboak.add("txiki");
        adjetiboak.add("luze");
        adjetiboak.add("labur");
        adjetiboak.add("zikin");
        adjetiboak.add("pozoitsu");
        adjetiboak.add("lirain");
        adjetiboak.add("eder");
        adjetiboak.add("indartsu");
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
