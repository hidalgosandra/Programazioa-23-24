import java.util.Scanner;

public class Datak {
    public static void main(String[] args) throws Exception {
        int urtea, hilabetea, eguna;
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu dataren urtea: ");
        urtea = in.nextInt();
        System.out.print("Sartu dataren hilabetea: ");
        hilabetea = in.nextInt();
        System.out.print("Sartu dataren eguna: ");
        eguna = in.nextInt();
        in.close();
        System.out.print("Data formatu laburrean: " + dataLaburra(urtea, hilabetea, eguna));

    }

    public static String dataLaburra(int urtea, int hilabete, int eguna) {
        String urt=String.valueOf(urtea);
        String hila=String.valueOf(hilabete);
        String egu=String.valueOf(eguna);
        String[] data = {urt, hila, egu};
        return data[];

        
    }

    public static String dataLuzea(int urtea, int hilabete, int eguna) {
        String hila;
        switch(hilabete){
            case 1:
            hila = "Enero";
            case 2:
            hila = "Febrero";
            case 3:
            hila = "Martxoaren";
            case 4:
            hila = "Apirilaren";
            case 5:
            hila = "Maiatzaren";
            case 6:
            hila = "Ekainaren";
            case 7:
            hila = "Julio";
            case 8:
            hila = "Abustuaren";
            case 9:
            hila = "Iraiaren";
            case 10:
            hila = "Urriaren";
            case 11:
            hila = "Azaroaewn";
            case 12:
            hila = "Abenduaewn";
        }

        return null;

    }
}
