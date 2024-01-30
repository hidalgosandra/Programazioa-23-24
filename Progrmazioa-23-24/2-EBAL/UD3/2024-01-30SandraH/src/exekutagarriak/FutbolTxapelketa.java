package exekutagarriak;

import java.time.LocalDateTime;
import java.util.ArrayList;
import model.*;

public class FutbolTxapelketa {
    private static String[] taldeak;
    private static ArrayList<Partida> partidak = new ArrayList<Partida>();

    public static void main(String[] args) {
        datuakKargatu();
        System.out.println("FUTBOL TXAPELKETAREN EMAITZAK. TXAPELDUNA => " + txapelduna());
        partidakBistaratu();

    }

    public static void datuakKargatu() {
        int azkenP = 0;
        int azkenT = 0;
        /* 6 talde eta 7 partida */
        /* Taldeak */
        taldeak = new String[7];
        taldeak[azkenT] = new String("t1");
        azkenT++;
        taldeak[azkenT] = new String("t2");
        azkenT++;
        taldeak[azkenT] = new String("t3");
        azkenT++;
        taldeak[azkenT] = new String("t4");
        azkenT++;
        taldeak[azkenT] = new String("t5");
        azkenT++;
        taldeak[azkenT] = new String("t6");
        azkenT++;
        /* Partidak */
        partidak.add(azkenP, new FutbolPartida(LocalDateTime.now().plusDays(azkenP), taldeak[0], taldeak[2], 3, 4));
        azkenP++;
        partidak.add(azkenP, new FutbolPartida(LocalDateTime.now().plusDays(azkenP), taldeak[1], taldeak[3], 0, 0));
        azkenP++;
        partidak.add(azkenP, new FutbolPartida(LocalDateTime.now().plusDays(azkenP), taldeak[2], taldeak[4], 2, 2));
        azkenP++;
        partidak.add(azkenP, new FutbolPartida(LocalDateTime.now().plusDays(azkenP), taldeak[3], taldeak[5], 0, 4));
        azkenP++;
        partidak.add(azkenP, new FutbolPartida(LocalDateTime.now().plusDays(azkenP), taldeak[4], taldeak[0], 2, 0));
        azkenP++;
        partidak.add(azkenP, new FutbolPartida(LocalDateTime.now().plusDays(azkenP), taldeak[5], taldeak[1], 1, 2));
        azkenP++;
        partidak.add(azkenP, new FutbolPartida(LocalDateTime.now().plusDays(azkenP), taldeak[1], taldeak[4], 1, 0));
        azkenP++;
        /* Partidak v2 */
        /*
         * partidak.add(azkenP, new FutbolPartida(LocalDateTime.now(), "t1", "t3", 3,
         * 4));
         * azkenP++;
         * partidak.add(azkenP, new FutbolPartida(LocalDateTime.now(), "t2", "t4", 0,
         * 0));
         * azkenP++;
         * partidak.add(azkenP, new FutbolPartida(LocalDateTime.now(), "t3", "t5", 2,
         * 2));
         * azkenP++;
         * partidak.add(azkenP, new FutbolPartida(LocalDateTime.now(), "t4", "t6", 0,
         * 4));
         * azkenP++;
         * partidak.add(azkenP, new FutbolPartida(LocalDateTime.now(), "t5", "t1", 2,
         * 0));
         * azkenP++;
         * partidak.add(azkenP, new FutbolPartida(LocalDateTime.now(), "t6", "t2", 1,
         * 2));
         * azkenP++;
         * partidak.add(azkenP, new FutbolPartida(LocalDateTime.now(), "t2", "t5", 1,
         * 0));
         * azkenP++;
         */
    }

    public static void partidakBistaratu() {
        for (int i = 0; i < partidak.size(); i++) {
            System.out.printf("%-20s %7s-%s %7s-%s %7s-%s %7s-%s %15s", LocalDateTime.now(), taldeak,
                    ((FutbolPartida) partidak.get(i)).toString(), ((Prorrogadura) partidak.get(i)).toString(),
                    ((Penaltiduna) partidak.get(i)).toString(),
                    partidak.get(i).getIrabazlea());
        }
        for (Partida p : partidak) {
            System.out.printf("%-20s %7s-%s %7s-%s %7s-%s %7s-%s %15s", LocalDateTime.now(), taldeak,
                    ((FutbolPartida) p).toString(), ((Prorrogadura) p).toString(), ((Penaltiduna) p).toString(),
                    p.getIrabazlea());
        }
    }

    public static String txapelduna() {
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        int t4 = 0;
        int t5 = 0;
        int t6 = 0;
        for (Partida p : partidak) {
            if (p.getIrabazlea().equals(taldeak[0])) {
                t1++;
            } else if (p.getIrabazlea().equals(taldeak[1])) {
                t2++;
            } else if (p.getIrabazlea().equals(taldeak[2])) {
                t3++;
            } else if (p.getIrabazlea().equals(taldeak[3])) {
                t4++;
            } else if (p.getIrabazlea().equals(taldeak[4])) {
                t5++;
            } else if (p.getIrabazlea().equals(taldeak[5])) {
                t6++;
            }
        }
        if (t1 > t2) {
            return taldeak[0];
        } else if (t2 > t3) {
            return taldeak[1];
        } else if (t3 > t4) {
            return taldeak[2];
        } else if (t4 > t5) {
            return taldeak[3];
        } else if (t5 > t6) {
            return taldeak[4];
        }
        return taldeak[1];
    }
}
