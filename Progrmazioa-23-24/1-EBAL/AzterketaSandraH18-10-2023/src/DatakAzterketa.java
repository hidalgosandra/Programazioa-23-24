import java.util.Scanner;

public class DatakAzterketa {
    public static void main(String[] args) {
        int urtea, hilabete, eguna;
        int i = 1;
        boolean bai = true;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print(i + ". DATA:\n   URTEA: ");
            urtea = in.nextInt();
            System.out.print("   Hilabetea: ");
            hilabete = in.nextInt();
            System.out.print("   Eguna: ");
            eguna = in.nextInt();
            System.out.println("Data formatu laburrean: " + dataLaburra(urtea, hilabete, eguna));
            System.out.println("Data formatu luzean: " + dataLuzea(urtea, hilabete, eguna));
            System.out.print("Beste data bat sartu nahi duzu? (bai/ez): ");
            String erantzuna = in.next();
            if (erantzuna.equals("bai")) {
                bai = true;
            } else {
                bai = false;
            }
            i++;
        } while (bai);

        in.close();
    }

    public static String dataLaburra(int urtea, int hilabete, int eguna) {
        return urtea + "-" + hilabete + "-" + eguna;
    }

    public static String dataLuzea(int urtea, int hilabete, int eguna) {
        String[] hilabeteak = { "Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina",
                "Uztaila", "Abuztua", "Iraila", "Urria", "Azaroa", "Abendua" };

        return urtea + "ko " + hilabeteak[hilabete - 1] + "ren " + eguna + "a";
    }
}
