package besteariketak;
import java.util.Arrays;

public class Probak {
    public static void main(String[] args) throws Exception {
        /* Char array */
        char[] letrak = { 'A', 'E', 'I', 'O', 'U' };
        System.out.println(letrak[2]);

        /* String bidimensional array */
        String[][] urtaroakEuEn = { { "uda", "udazkena", "negua", "udaberria" },
                { "summer", "autumn", "winter", "spring" } };

        // Print "We are in autumn."
        System.out.println("We are in " + urtaroakEuEn[1][1] + ".");

        /* String kodeak */
        String[] kodeak = new String[10];
        for (int i = 0; i < kodeak.length; i++) {
            if (i % 2 == 0) {
                kodeak[i] = "A" + i;
            } else {
                kodeak[i] = "B" + i;
            }
        }
        System.out.println(kodeak[2]);

        /* String asteko egunak */
        String[] astekoEgunak = { "Astelehena", "Asteartea", "Asteazkena", "Osteguna", "Ostirala", "Larunbata",
                "Igandea" };
        for (String eguna : astekoEgunak) {
            System.out.println(eguna);
        }
        /* Int[] zenbakiak */
        int[] zenbakiak = new int[10];
        zenbakiak[0] = 1;
        for (int i = 1; i < zenbakiak.length; i++) {
            zenbakiak[i] = 2 * zenbakiak[i - 1];
        }
        System.out.println(Arrays.toString(zenbakiak));

        /* String[] urtaroak */
        String[] urtaroak = { "uda", "udazkena", "negua", "udaberria" };
        System.out.print(Arrays.toString(urtaroak));
    }
}
