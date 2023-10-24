public class ProgD {
    public static void main(String[] args) {
        System.out.println("urdin hitza gazteleraz => " + itzuliGaztelerara("urdin"));
        System.out.println("beltz hitza gazteleraz => " + itzuliGaztelerara("beltz"));
    }

    public static String itzuliGaztelerara(String hitz) {
        String[][] hitzak = { { "gorri", "rojo" },
                { "urdin", "azul" },
                { "berde", "verde" },
                { "hori", "amarillo" },
                { "beltz", "negro" } };
        if (hitz == "gorri") {
            hitz = hitzak[0][1];
        } else if (hitz == "urdin") {
            hitz = hitzak[1][1];
        } else if (hitz == "berde") {
            hitz = hitzak[2][1];
        } else if (hitz == "hori") {
            hitz = hitzak[3][1];
        } else if (hitz == "beltz") {
            hitz = hitzak[4][1];
        }
        return hitz;

    }
}
