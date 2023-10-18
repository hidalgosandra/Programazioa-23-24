import java.util.Scanner;

public class DatakAzterketa {
    public static void main(String[] args) throws Exception {
        int urtea, hilabete, eguna;
        int i = 1;
        boolean bai = true;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print(i + ". DATA:");
            System.out.println(" URTEA: ");
            urtea = in.nextInt();
            System.out.println( "Hilabetea");
            hilabete = in.nextInt();
            System.out.println(" Eguna: ");
            eguna = in.nextInt();
            System.out.print("Data fotmatu laburrean:" + dataLaburra(urtea, hilabete, eguna));
            System.out.print("Data formatu luzean:" + dataLuzea(urtea, hilabete, eguna));
            System.out.print("Beste data bat sartu nahi duzu?");

            }while (bai==true);
    }
    public static String dataLaburra(int urtea, int hilabete, int eguna) {
        return urtea + "-" + hilabete + "-" + eguna;
    }

    public static String dataLuzea(int urtea, int hilabete, int eguna) {
        String[] hilabeteak = { "Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina",
                "Uztaila", "Abuztuaren", "Iraila", "Urria", "Azaroa", "Abenduak" };

        return urtea + "ko" + hilabeteak[hilabete - 1] + "ren" + eguna + "a";
    }
}