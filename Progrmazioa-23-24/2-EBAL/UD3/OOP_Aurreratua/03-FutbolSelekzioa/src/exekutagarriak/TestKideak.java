package exekutagarriak;

import model.Atezaina;
import model.Futbolaria;
import model.Selekzioa;
import model.enumerazioak.Demarkazioa;

public class TestKideak {
    public static void main(String[] args) {
        Futbolaria f1 = new Futbolaria(4, "Asier", "Bai", 30, 4, Demarkazioa.MED);
        Atezaina a1 = new Atezaina(6, "Aitor", "Fernandez", 29, 1, 8);
        System.out.println(f1);
        if (f1 instanceof Futbolaria) {
            System.out.println(f1);
        }
        if (a1 instanceof Atezaina) {
            System.out.println(a1);
        }
        Selekzioa.futbolariakBistaratu();
    }
}