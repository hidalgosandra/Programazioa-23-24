package exekugatarriak;

import model.Zatikia;

public class Test1 {
    public static void main(String[] args) {
        Zatikia zat1;
        zat1 = new Zatikia(3, 4);
        System.out.println(zat1);

        Zatikia zat2;
        zat2 = new Zatikia(7, 15);
        System.out.println(zat2);

        System.out.println(zat1 + " * " + zat2 + " biderketaren emaitza= " + Zatikia.biderkatu(zat1, zat2));
        System.out.println(zat1 + " + " + zat2 + " batuketaren emaitza= " + Zatikia.batu(zat1, zat2));
    }

}