package exekutagarriak;

import java.util.Scanner;

import model.Laukia;

public class Menua {
    public static void main(String[] args) {
        int LAUKI_KOP = 10;
        int sortutakoak;
        Laukia[] laukiak;
        int au;
        Scanner in = new Scanner(System.in);
        System.out.println("LAUKIAK");
        System.out.println("====================================");
        System.out.println("1- Lauki berri bat sortu");
        System.out.println("2- Laukien taula ikusi");
        System.out.println("3- Lauki bat marraztu");
        System.out.println("4- Lauki handiena bilatu");
        System.out.println("5- Irten");
        System.out.print("Aukeratu zenbaki bat: ");
        au = in.nextInt();
        switch (au) {
            case 1:
            
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Irtetzen...");
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
