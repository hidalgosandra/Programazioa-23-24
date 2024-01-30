package model;

import java.time.LocalDateTime;

public class FutbolPartida extends Partida {
    protected int t1Golak;
    protected int t2Golak;

    public FutbolPartida(LocalDateTime noiz, String t1, String t2, int t1Golak, int t2Golak) {
        noiz = LocalDateTime.now();
        this.t1 = t1;
        this.t2 = t2;
        this.t1Golak = t1Golak;
        this.t2Golak = t2Golak;
    }

    public String getIrabazlea() {
        int maxGolak = Math.max(t1Golak, t2Golak);
        if (maxGolak == t1Golak) {
            return t1;
        } else {
            return t2;
        }
    }

    public String toString() {
        return t1Golak + "-" + t2Golak;
    }
}
