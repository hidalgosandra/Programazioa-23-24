package implementazioa.exekutagarriak;

import java.time.LocalDateTime;
import java.util.Random;

import herentziamemberabstraktoekin.model.Hiztegia;
import implementazioa.model.WaterMonster;
import implementazioa.model.FireMonster;
import implementazioa.model.StoneMonster;
import implementazioa.model.Ejerzitoa;

public class Borroka {
    private static LocalDateTime noiz;
    private static Ejerzitoa lehenEjerzitoa;
    private static Ejerzitoa bigarrenEjerzitoa;

    public static void main(String[] args) {
        ejerztioaHasieratu();
    }

    public static void ejerztioaHasieratu() {
        lehenEjerzitoa = new Ejerzitoa("Doritos++");
        bigarrenEjerzitoa = new Ejerzitoa("Lays--");
        Random random = new Random();
        lehenEjerzitoa.Ejerzitoa(random.nextInt(5), random.nextInt(5), random.nextInt(5));
        bigarrenEjerzitoa.Ejerzitoa(random.nextInt(5), random.nextInt(5), random.nextInt(5));
        System.out.println(lehenEjerzitoa.toString());
        System.out.println(bigarrenEjerzitoa.toString());
        borrokatu();
        getIrabazlea();
    }

    public static void borrokatu() {
        int minSize = Math.min(lehenEjerzitoa.getMonstruoak().size(), bigarrenEjerzitoa.getMonstruoak().size());
        FireMonster f = new FireMonster(Hiztegia.getKonposatua());
        WaterMonster w = new WaterMonster(Hiztegia.getKonposatua());
        StoneMonster s = new StoneMonster(Hiztegia.getKonposatua());
        noiz = LocalDateTime.now();
        System.out.println("Hasi da borroka " + lehenEjerzitoa.toString() + "ren eta " + bigarrenEjerzitoa.toString()
                + "ren arte. Noiz: " + noiz);
        int l = 0;
        int b = 0;
        if (lehenEjerzitoa.getMonstruoak().get(l) instanceof FireMonster) {
            f.attack();
            l++;
        } else if (lehenEjerzitoa.getMonstruoak().get(l) instanceof WaterMonster) {
            w.attack();
            l++;
        } else if (lehenEjerzitoa.getMonstruoak().get(l) instanceof StoneMonster) {
            s.attack();
            l++;
        }

        if (bigarrenEjerzitoa.getMonstruoak().get(b) instanceof FireMonster) {
            f.attack();
            b++;
        } else if (bigarrenEjerzitoa.getMonstruoak().get(b) instanceof WaterMonster) {
            w.attack();
            b++;
        } else if (bigarrenEjerzitoa.getMonstruoak().get(b) instanceof StoneMonster) {
            s.attack();
            b++;
        }

        for (int i = 0; i < minSize; i++) {
            lehenEjerzitoa.getMonstruoak().get(i).attack();
            bigarrenEjerzitoa.getMonstruoak().get(i).attack();
        }
    }

    public static Ejerzitoa getIrabazlea() {
        int lehenEjerzitoaIndarra = lehenEjerzitoa.getIndarra();
        int bigarrenEjerzitoaIndarra = bigarrenEjerzitoa.getIndarra();
        if (lehenEjerzitoaIndarra > bigarrenEjerzitoaIndarra) {
            System.out.println("Irabazlea: " + lehenEjerzitoa.toString());
            return lehenEjerzitoa;
        } else if (bigarrenEjerzitoaIndarra > lehenEjerzitoaIndarra) {
            System.out.println("Irabazlea: " + bigarrenEjerzitoa.toString());
            return bigarrenEjerzitoa;
        } else {
            System.out.println("Bi ejerzitoak galdu dute.");
            return null;
        }
    }
}
