package herentziamemberabstraktoekin.exekutagarriak;

import java.util.ArrayList;

import herentziamemberabstraktoekin.model.*;

public class MonstruoAskokoPrograma {
    private static Monster[] mk;
    static int monsterKop = 0;
    static ArrayList<Monster> monstruoak = new ArrayList<Monster>();
    static int fkop = 0;
    static int wkop = 0;
    static int skop = 0;

    public static void main(String[] args) {

        mk = new Monster[50];
        monstruoakSortu(1, 2, 3);
        monstruakBistaratu();
        monstruoakSortu("fire", 2);
        monstruoakSortu("stone", 1);
        monstruoakSortu("water", 3);
        monstruakBistaratu();
    }

    public static void monstruoakSortu(int fireKop, int waterKop, int stoneKop) {

        for (int i = 0; i < fireKop; i++) {
            mk[monsterKop++] = new FireMonster(Hiztegia.getKonposatua());
            fkop++;
        }
        for (int i = 0; i < waterKop; i++) {
            mk[monsterKop++] = new WaterMonster(Hiztegia.getKonposatua());
            wkop++;
        }
        for (int i = 0; i < stoneKop; i++) {
            mk[monsterKop++] = new StoneMonster(Hiztegia.getKonposatua());
            skop++;
        }
    }

    public static void monstruoakSortu(String mota, int kop) {
        for (int i = 0; i < kop; i++) {
            switch (mota) {
                case "fire":
                    mk[monsterKop] = new FireMonster(Hiztegia.getKonposatua());
                    monsterKop++;
                    fkop++;
                    break;
                case "water":
                    mk[monsterKop] = new WaterMonster(Hiztegia.getKonposatua());
                    monsterKop++;
                    wkop++;
                    break;
                case "stone":
                    mk[monsterKop] = new StoneMonster(Hiztegia.getKonposatua());
                    monsterKop++;
                    skop++;
                    break;
                default:
                    System.out.println("This is not a valid monter type!");
                    break;
            }
        }
    }

    public static void monstruakBistaratu() {
        int i = 0;
        try {
            for (Monster m : mk) {
                System.out.println(i++ + "- " + m.toString());
            }
        } catch (NullPointerException ex) {
            if (mk == null) {
                System.out.println("Oraindik ez dago monstruorik!");
            } else
                System.out.println("Arrayaren elementuren batek ez dauka baliorik oraindik");
        }
        System.out.println("\n");
    }
}
