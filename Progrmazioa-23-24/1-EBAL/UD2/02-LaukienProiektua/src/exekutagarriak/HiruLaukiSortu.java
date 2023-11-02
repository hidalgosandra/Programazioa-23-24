package exekutagarriak;

import model.Laukia;

public class HiruLaukiSortu {
    public static void main(String[] args) {
        Laukia L1 = new Laukia(7, 1);
        Laukia L2 = new Laukia(2, 2);
        Laukia L3 = new Laukia(2, 6);
        System.out.println("Hiru lauki sortu dituzu: ");
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        System.out.println(L3.toString());
    }
}
