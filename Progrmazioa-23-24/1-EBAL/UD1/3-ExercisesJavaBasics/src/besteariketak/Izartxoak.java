package besteariketak;

import java.util.Scanner;

public class Izartxoak {
    public static void main(String[] args) throws Exception {
        int zen;
        System.out.print("Esan zenbaki bat (1-10): ");
        Scanner in = new Scanner(System.in);
        zen = in.nextInt();
        in.close();
        for(int i = 1; i <= 50; i++){
            if (i == 1){
                System.out.print(i);
            }
            else if(i > 50){
                System.out.print(" - "+i);
            }
            else if (i % zen==0) {
                System.out.print(" - *" );
            } else {
                System.out.print(" - "+i);
            }
        }
    }
}