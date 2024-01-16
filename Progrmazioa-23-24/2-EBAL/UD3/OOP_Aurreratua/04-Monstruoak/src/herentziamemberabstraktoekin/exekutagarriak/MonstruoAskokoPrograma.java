package herentziamemberabstraktoekin.exekutagarriak;

import java.util.ArrayList;

import herentziamemberabstraktoekin.model.*;

public class MonstruoAskokoPrograma {
    private static Monster[] mk;
    static int monsterKop = 0;
    static ArrayList<Monster> monstruoak = new ArrayList<Monster>();

    public static void main(String[] args) {
        
        mk = new Monster[50];
        monstruoakSortu(1, 2, 3);
        monstruakBistaratu();
        monstruoakSortu("water", 2);
        monstruoakSortu("fire", 1);
        monstruoakSortu("stone", 3);
        monstruakBistaratu();
    }

    public static void monstruoakSortu(int fireKop, int waterKop, int stoneKop) {
        for (int i = 0; i < fireKop; i++) {
            mk[monsterKop++] = new FireMonster("F" + (i+1));
        }
        for (int i = 0; i < waterKop; i++) {
            mk[monsterKop++] = new WaterMonster("W" + (i+1));
        }
        for (int i = 0; i < stoneKop; i++) {
            mk[monsterKop++] = new StoneMonster("S" + (i+1));
        }
    }

    public static void monstruoakSortu(String mota, int kop) {
        for (int i = 0; i < kop; i++) {
            switch (mota) {
                case "fire":
                    mk[monsterKop] = new FireMonster("F" + (monsterKop + 1));
                    monsterKop++;
                    break;
                case "water":
                    mk[monsterKop] = new WaterMonster("W" + (monsterKop + 1));
                    monsterKop++;
                    break;
                case "stone":
                    mk[monsterKop] = new StoneMonster("S" + (monsterKop + 1));
                    monsterKop++;
                    break;
                default:
                    System.out.println("This is not a valid monter type!");
                    break;
            }
        }
    }

    public static void monstruakBistaratu() {
        int i = 0;
        for (Monster m : mk) {
            i++;
            if (m != null) {
                System.out.println(i + "- " + m.toString());
            }
        }
        System.out.println("\n");
    }
}