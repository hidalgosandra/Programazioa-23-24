package implementazioa.exekutagarriak;

import java.time.LocalDateTime;
import java.util.Random;

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
    }

    public static void borrokatu() {
        noiz = LocalDateTime.now();
        System.out.println("Hasi da borroka " + lehenEjerzitoa.toString() + "ren eta " + bigarrenEjerzitoa.toString()
                + "ren arte. Noiz: " + noiz);
        for (int i = 0; i < lehenEjerzitoa.getMonstruoak().size()
                || i < bigarrenEjerzitoa.getMonstruoak().size(); i++) {
            lehenEjerzitoa.getMonstruoak().get(i).attack();
            bigarrenEjerzitoa.getMonstruoak().get(i).attack();
        }
    }

    public static Ejerzitoa getIrabazlea() {
        if (lehenEjerzitoa.getIndarra() > bigarrenEjerzitoa.getIndarra()) {
            return lehenEjerzitoa;
        } else if (bigarrenEjerzitoa.getIndarra() > lehenEjerzitoa.getIndarra()) {
            return bigarrenEjerzitoa;
        } else {
            System.out.println("Bi ejerzitoak galdu dute.");
            return null;
        }
    }
}
