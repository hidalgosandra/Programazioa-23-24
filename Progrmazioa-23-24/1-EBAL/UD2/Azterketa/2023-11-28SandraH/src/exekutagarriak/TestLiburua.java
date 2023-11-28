package exekutagarriak;

import model.Liburua;


/** 
 * EZ IKUTU KLASE HAU. ONDO DAGO.
 */
public class TestLiburua {
    public static void main(String[] args) throws Exception {
        Liburua lib1 = new Liburua("East Wind:West Wind", "Pearl S.Buck", 'I', 1930);
        System.out.println(lib1.getKodea()+" liburua "+lib1.getMendea()+ ". mendekoa da.");
    }
}
