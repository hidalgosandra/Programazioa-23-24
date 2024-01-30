package model;

import java.time.LocalDateTime;

public class Prorrogadura extends FutbolPartida {
    protected int t1ProrrogakoGolak;
    protected int t2ProrrogakoGolak;

    public Prorrogadura(LocalDateTime noiz, String t1, String t2, int t1Golak, int t2Golak, int t1ProrrogakoGolak,
            int t2ProrrogakoGolak) {
        super(noiz, t1, t2, t1Golak, t2Golak);
        this.t1ProrrogakoGolak = t1ProrrogakoGolak;
        this.t2ProrrogakoGolak = t2ProrrogakoGolak;
    }

    public String getIrabazlea() {
        int maxGolPro = Math.max(t1ProrrogakoGolak, t2ProrrogakoGolak);
        if (maxGolPro == t1ProrrogakoGolak) {
            return t1;
        } else {
            return t2;
        }
    }

    public String toString() {
        return t1ProrrogakoGolak + "-" + t2ProrrogakoGolak;
    }
}
