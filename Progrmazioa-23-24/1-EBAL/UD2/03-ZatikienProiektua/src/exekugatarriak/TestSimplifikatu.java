package exekugatarriak;

import model.Zatikia;

public class TestSimplifikatu {
    public static void main(String[] args) {
        Zatikia zat1 = new Zatikia(1, 2);
        Zatikia zat2 = new Zatikia(3, 4);

        System.out.println("Resultado de la suma simplificado: " + Zatikia.batu(zat1, zat2));
        System.out.println("Resultado de la multiplicación simplificado: " + Zatikia.biderkatu(zat1, zat2));
    }
}