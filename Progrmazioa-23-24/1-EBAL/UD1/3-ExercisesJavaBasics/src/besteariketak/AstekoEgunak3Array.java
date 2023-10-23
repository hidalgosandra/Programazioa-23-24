package besteariketak;

import java.util.Scanner;

public class AstekoEgunak3Array {
    public static void main(String[] args) throws Exception {
        int eguna;
        String hitz;
        String[][] astea = {
                { "Astelehena", "Asteartea", "Asteazkena", "Osteguna", "Ostirala", "Larunbata", "Igandea" },
                { "Monday", "Tuesday", "Wendsday", "Thursday", "Friday", "Saturday", "Sunday" },
                { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" } };
        Scanner in = new Scanner(System.in);
        System.out.print("Aukeratu eguna (1-7): ");
        eguna = in.nextInt();
        if (eguna > 0 && eguna <= 7) {
            System.out.print("Aukeratu hizkuntza (EU, ES, EN): ");
            hitz = in.next();
            String hiz = hitz.toUpperCase();
            switch (hiz) {
                case "EU":
                    System.out.println(astea[0][eguna - 1]);
                    break;
                case "EN":
                    System.out.println(astea[1][eguna - 1]);
                    break;
                case "ES":
                    System.out.println(astea[2][eguna - 1]);
                    break;
                default:
                    System.err.println("Sartu hizkuntza bat hauen artean (EU, ES, EN).");
            }
            /*
             * if (hiz.equals("EN")) {
             * System.out.print(astea[1][eguna - 1]);
             * } else if (hiz.equals("ES")) {
             * System.out.print(astea[2][eguna - 1]);
             * } else if (hiz.equals("EU")) {
             * System.out.print(astea[0][eguna - 1]);
             * } else {
             * System.out.print("Sartu hizkuntza bat hauen artean (EU, ES, EN).");
             * }
             */
        } else {
            System.out.println("Sartu asteko egun bat.");
        }
        in.close();
    }
}