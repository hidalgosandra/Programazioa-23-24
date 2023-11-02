
package exekutagarriak;

import java.util.Scanner;

import model.Laukia;

public class LaukiBatSortu {
    public static void main(String[] args) {
        int zabalera;
        int altuera;
        Scanner in = new Scanner(System.in);
        System.out.println("Sartu laukiaren zabalera: ");
        zabalera = in.nextInt();
        System.out.println("Sartu laukiaren altuera: ");
        altuera = in.nextInt();
        Laukia L1 = new Laukia(zabalera, altuera);
        String laukiaMota = L1.getMota();
        System.out.println("Lauki " + laukiaMota + " sortu duzu: => " + L1.toString());
        System.out.println("Hona marrazkia beteta: ");
        L1.marraztuBeteta();
        System.out.println("Hona marrazkia hutsik: ");
        L1.marraztuHutsik();
        System.out.print("Zein ikurrekin nahi duzu laukia bete? ");
        char ikur = in.next().charAt(0);
        L1.marraztuBetetaC(ikur);
    }
}
