package besteariketak;

import java.util.Scanner;

public class AstekoEgunak {
    public static void main(String[] args) throws Exception {
        int eguna;
        String hitz;
        String eu[] = { "Astelehena", "Asteartea", "Asteazkena", "Osteguna", "Ostirala", "Larunbata", "Igandea" };
        String en[] = { "Monday", "Tuesday", "Wendsday", "Thursday", "Friday", "Saturday", "Sunday" };
        String es[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        Scanner in = new Scanner(System.in);
        System.out.print("Aukeratu eguna (1-7): ");
        eguna = in.nextInt();
        if (eguna > 0 && eguna <= 7) {
            System.out.print("Aukeratu hizkuntza (EU, ES, EN): ");
            hitz = in.next();
            String hiz = hitz.toUpperCase();
            if (hiz.equals("EN")) {
                System.out.print(en[eguna - 1]);
            } else if (hiz.equals("ES")) {
                System.out.print(es[eguna - 1]);
            } else if (hiz.equals("EU")) {
                System.out.print(eu[eguna - 1]);
            } else {
                System.out.print("Sartu hizkuntza bat hauen artean (EU, ES, EN).");
            }
        } else {
            System.out.println("Sartu asteko egun bat.");
        }
        in.close();
    }
}