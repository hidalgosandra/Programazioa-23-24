import java.util.Scanner;

public class Casea {
    public static void main(String[] args) {
        String parrafoa;
        char kodigoa;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu hitz edo esaldi bat: ");
        parrafoa = in.nextLine();
        System.out.println(
                "Kodigoak:\n\tM: hitz/esaldia maiuskulaz idatziko du.\n\tm: hitz/esaldia minuskulaz idatziko du.\n\tG: hitz/esaldia minuskulak eta maiuskulak inbertituko ditu.\n\tBeste edozein letra: ez du hitza/esaldia aldatuko.");
        System.out.print("Sartu kodigoa(M,m,G): ");
        kodigoa = in.next().charAt(0);
        in.close();

        caseaAldatu(parrafoa, kodigoa);
    }

    public static void caseaAldatu(String parrafoa, char kodigoa) {
        char lastChar;

        if (kodigoa == 'M') {
            for (int index = 0; index < parrafoa.length(); ++index) {
                lastChar = parrafoa.charAt(index);
                if (lastChar >= 65 && lastChar <= 90) {
                    System.out.printf("%c", lastChar);
                } else if (lastChar >= 97 && lastChar <= 122) {
                    System.out.printf("%c", lastChar - 32);
                } else if (lastChar == 255) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        } else if (kodigoa == 'm') {
            for (int index = 0; index < parrafoa.length(); ++index) {
                lastChar = parrafoa.charAt(index);
                if (lastChar >= 97 && lastChar <= 122) {
                    System.out.printf("%c", lastChar);
                } else if (lastChar >= 65 && lastChar <= 90) {
                    System.out.printf("%c", lastChar + 32);
                } else if (lastChar == 255) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        } else if (kodigoa == 'G') {
            for (int index = 0; index < parrafoa.length(); ++index) {
                lastChar = parrafoa.charAt(index);
                if (lastChar >= 65 && lastChar <= 90) {
                    System.out.printf("%c", lastChar + 32);
                } else if (lastChar >= 97 && lastChar <= 122) {
                    System.out.printf("%c", lastChar - 32);
                } else if (lastChar == 255) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        } else {
            System.out.println("Baligabeko kodigoa. Saiatu berriz...");
        }
    }
}