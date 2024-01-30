package model;

import java.time.LocalDateTime;

public class Penaltiduna extends Prorrogadura {
    private int t1Penaltiak;
    private int t2Penaltiak;

    public Penaltiduna(LocalDateTime noiz, String t1, String t2, int t1Golak, int t2Golak, int t1ProrrogakoGolak,
            int t2ProrrogakoGolak, int t1Penaltiak, int t2Penaltiak) {
        super(noiz, t1, t2, t1Golak, t2Golak, t1ProrrogakoGolak, t2ProrrogakoGolak);
        noiz = LocalDateTime.now();
        this.t1Penaltiak = t1Penaltiak;
        this.t2Penaltiak = t2Penaltiak;
    }

    public String getIrabazlea() {
        int getMaxGolak = Math.max(t1Golak, t2Golak);
        if (getMaxGolak == t1Golak) {
            return t1;
        } else {
            return t2;
        }
    }

    public String toString() {
        return t1Penaltiak + "-" + t2Penaltiak;
    }
}
