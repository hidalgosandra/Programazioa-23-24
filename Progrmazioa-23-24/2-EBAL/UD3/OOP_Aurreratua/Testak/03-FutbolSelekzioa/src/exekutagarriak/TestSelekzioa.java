package exekutagarriak;

import model.Futbolaria;
import model.Selekzioa;
import model.enumerazioak.Demarkazioa;

public class TestSelekzioa {
    public static void main(String[] args) throws Exception {
        Selekzioa euskalSel = new Selekzioa("Euskadi");
        euskalSel.kideakBistaratu();
        euskalSel.kideakTaldekatutaBistaratuBi(); /* Gepeto done */
        euskalSel.kideBerria(new Futbolaria(0, "Idoia", "Madariaga", 25, 9, Demarkazioa.DEF));
        euskalSel.kideakBistaratu();
        System.out.println("\n \n ");
        euskalSel.kideaEzabatu(18);
        euskalSel.kideakBistaratu();
    }
}
