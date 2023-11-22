package exekutagarriak;

import model.Langilea;

public class NiLangile {
    public static void main(String[] args) {
        Langilea ni = new Langilea(1, "Sandra", "Hidalgo");

        ni.setSoldata(600);
        System.out.println(ni.toString());
        System.out.println();
        ni.soldataIgo(50);
        System.out.println(ni.toString());
    }
}
