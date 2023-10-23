package besteariketak;

import java.util.Scanner;

public class AstekoEgunak {
    public static void main(String[] args) throws Exception {
        int eguna;
        String hiz;
        String eu[] = { "Astelehena", "Asteartea", "Asteazkena", "Osteguna", "Ostirala", "Larunbata", "Igandea" };
        String en[] = { "Monday", "Tuesday", "Wendsday", "Thursday", "Friday", "Saturday", "Sunday" };
        String es[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        Scanner in = new Scanner(System.in);
        System.out.print("Aukeratu eguna (1-7): ");
        eguna = in.nextInt();
        if (eguna > 0 && eguna <= 7) {
            System.out.print("Aukeratu hizkuntza (EU, ES, EN): ");
            hiz = in.next();
            
        }else{
            System.out.println("Sartu asteko egun bat.");
        }
    }
}