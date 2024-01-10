package exekutagarriak;

import model.Futbolaria;
import model.Selekzioa;
import model.enumerazioak.Demarkazioa;

public class TestSelekzioa {
    public static void main(String[] args) {

        // euskalSel sortu selekzio berri baten moduan eta bistaratu
        Selekzioa euskalSel = new Selekzioa("Euskadi");
        euskalSel.kideakBistaratu();

        // Kide berri bat sortu eta bistaratu selekzioa
        euskalSel.Kideberria(new Futbolaria(0, "Idoia", "Madariaga", 25, 9, Demarkazioa.DEF));
        euskalSel.kideakBistaratu();

        // Kide bat ezabatu eta bistaratu selekzioa
        euskalSel.kideaEzabatu(18);
        euskalSel.kideakBistaratu();

        // Kideak taldekatuta bistaratu
        euskalSel.kideakTaldekatutaBistaratu();
    }
}
