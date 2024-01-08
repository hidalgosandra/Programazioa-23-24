package exekutagarriak;

import model.Futbolaria;
import model.enumerazioak.Demarkazioa;

public class TestKideak {
    public static void main(String[] args) {
        Futbolaria f1 = new Futbolaria(4, "Asier", "Bai", 30, 4, Demarkazioa.MED);
        System.out.println(f1);
    }
}