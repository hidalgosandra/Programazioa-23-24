package exekutagarriak;

import model.Liburua;

/** 
 * EZ IKUTU KLASE HAU. ONDO DAGO.
 */
public class TestLiburuaOinarrizkoak {
    public static void main(String[] args) throws Exception {
        Liburua lib1 = new Liburua("Obabakoak", "Atxaga", 'E', 1988);
        System.out.println(lib1);

        Liburua lib2 = new Liburua("Petit Prince", "Antoine de Saint-Exupéry ", 'F', 1943);
        System.out.println(lib2);
    }
}
