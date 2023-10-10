package besteariketak;

public class UrtaroEleanitzak {
    public static void main(String[] args) throws Exception {
        String[][] urtaroakEuEn = { { "uda", "udazkena", "negua", "udaberria" },
                { "summer", "autumn", "winter", "spring" } };

        System.out.println("URTAROAK\n=======================");
        System.out.printf("%-10s %-10s\n", "EUSKARAZ", "INGELESEZ");

        for (int i = 0; i < urtaroakEuEn[0].length; i++) {
            System.out.printf("%-10s %-10s\n", urtaroakEuEn[0][i], urtaroakEuEn[1][i]);
        }
    }
}

/*
 * UrtaroEleanitzak.java
 * 
 * Galdetegiko urtaroen arraya erabiliz jakingo zenuke horrelako taula bat
 * inprimatzen?
 * 
 * URTAROAK
 * =========================
 * EUSKARAZ INGELESEZ
 * -------------------------
 * uda summer
 * udazkena autumm
 * negua winter
 * udaberria spring
 */