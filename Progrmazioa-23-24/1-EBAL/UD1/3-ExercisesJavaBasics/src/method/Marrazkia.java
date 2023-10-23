package method;

import java.util.Scanner;

public class Marrazkia {
    public static void main(String[] args) throws Exception {
        int alde1, alde2;
        char k;
        boolean tente;
        boolean betea;
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu lehen zenbakia: ");
        alde1 = in.nextInt();
        System.out.print("Sartu bigarren zenbakia: ");
        alde2 = in.nextInt();
        System.out.print("Sartu nahi duzu char: ");
        k = in.next().charAt(0);

        System.out.print("Tente nahi duzu (bai = true | ez = false): ");
        tente = in.nextBoolean();
        System.out.print("Betea nahi duzu (bai = true | ez = false): ");
        betea = in.nextBoolean();
        in.close();

        marraztu(alde1, alde2, k, tente, betea);
    }

    public static void marraztu(int alde1, int alde2, char k, boolean tente, boolean betea) {
        if (alde1 < alde2) {
            if (tente && betea) {
                for (int i = 0; i < alde2; i++) {
                    System.out.print(k);
                    for (int x = 1; x < alde1; x++) {
                        System.out.print(k);
                    }
                    System.out.println("");
                }
            }
            if (!tente && betea) {
                for (int i = 0; i < alde1; i++) {
                    System.out.print(k);
                    for (int x = 1; x < alde2; x++) {
                        System.out.print(k);
                    }
                    System.out.println("");
                }
            }
            if (tente && !betea) {
                for (int i = 0; i < alde2; i++) {
                    for (int x = 0; x < alde1; x++) {
                        if (i == 0 || x == 0 || i + 1 == alde2 || x + 1 == alde1) {
                            System.out.print(k);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }

            if (!tente && !betea) {
                for (int i = 0; i < alde1; i++) {
                    System.out.print(k);
                    for (int x = 0; x < alde2; x++) {
                        if (i == 0 || i + 1 == alde1 || x + 1 == alde2) {
                            System.out.print(k);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
            }
        }
    }
}