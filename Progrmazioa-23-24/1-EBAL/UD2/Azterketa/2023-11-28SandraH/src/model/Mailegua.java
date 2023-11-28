package model;

import java.time.LocalDate;

/**
 * EZ IKUTU KLASE HAU. ONDO DAGO.
 */
public class Mailegua {

    private String irakurle;
    private LocalDate maileguData;
    private LocalDate itzuleraData = null;

    public Mailegua(String irakurle) {
        this.irakurle = irakurle;
        this.maileguData = LocalDate.now();
    }

    /**
     * Metodo honek gaurko eguneko data ezartzen dio maileguaren itzuleraData
     * atributoari baldin eta
     * null bazen.
     * 
     * @return Itzulera ondo joan bada, true, bestela false.
     */
    public boolean itzuli() {
        if (this.itzuleraData == null) {
            this.itzuleraData = LocalDate.now();
            return true;
        }
        return false;
    }

}
