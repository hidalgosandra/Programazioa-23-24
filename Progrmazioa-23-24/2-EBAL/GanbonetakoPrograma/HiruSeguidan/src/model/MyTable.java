package model;

public class MyTable {
    // System.out.println("\u007C"); // Imprimatzen du "|"
    // System.out.println("\u2015"); // Imprimatze du "―"
    private int bertKant;
    private int horKant;

    public MyTable(int bertKant, int horKant) {
        this.bertKant = bertKant;
        this.horKant = horKant;
    }

    public void printTable() {
        for (int i = 0; i < bertKant; i++) {
            System.out.println("\u007C");
            for (int x = 1; x < horKant; x++) {
                System.out.println("\u2015");
            }
        }
    }
}
