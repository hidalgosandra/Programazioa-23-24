package exekutagarriak;

import java.util.Scanner;

public class HandienariBuruzkoPrograma {
    public static void main(String[] args) {
        final int KOPURUA = 5;
        int[] zenbakiak;
        System.out.print("Idatzi " + KOPURUA + " zenbaki: ");
        zenbakiak = getNumbers(KOPURUA);
        System.out.println("Sartutako datuen artean handiena: " +
                getTheBiggest(zenbakiak));
    }

    public static int[] getNumbers(int quantity) {
        quantity = 5;
        int[] zenbakiak = new int[quantity];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < zenbakiak.length; i++) {
            zenbakiak[i] = in.nextInt();
        }
        in.close();
        return zenbakiak;
    }

    public static int getTheBiggest(int[] numbers) {
        int handiena = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                handiena = i;
            }
        }
        return numbers[handiena];
    }

    public static int getTheBiggestOpt(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
