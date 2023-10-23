package array;

public class ArrayenProg2 {
    public static void main(String[] args) {
        // Arrayaren tamaina definitu (100 zenbaki bikoiti gordeko ditugu)
        int tamaina = 100;
        int[] bikoitiak = new int[tamaina];

        int zenbakia = 2; // Array-en lehenengo zenbakia
        for (int i = 0; i < tamaina; i++) {
            bikoitiak[i] = zenbakia;
            zenbakia += 2; // Zenbaki bikoiti berria lortu (aurreko zenbaki bikoitia + 2)
        }

        // Array-aren edukia pantailatik erakutsi
        for (int i = 0; i < tamaina; i++) {
            System.out.print(bikoitiak[i]);
            if (i < tamaina - 1) {
                System.out.print(", "); // Zenbakiak arteko komakoa gehitu
            }
        }
    }
}
