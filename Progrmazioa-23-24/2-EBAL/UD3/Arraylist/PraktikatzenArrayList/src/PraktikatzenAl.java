import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PraktikatzenAl {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Iterator<String> alit = al.iterator();
        int zenbat;
        String datua;

        // Ask how many data the user wants to enter
        Scanner in = new Scanner(System.in);
        System.out.println("Zenbat datu sartu nahi dituzu:");
        zenbat = in.nextInt();

        // Get data and add to ArrayList
        for (int i = 0; i < zenbat; i++) {
            System.out.println("Tell me the String:");
            al.add(in.next());
        }

        // Ask what variable to search for
        System.out.println("Zer aldagai aurkitu nahi duzu:");
        datua = in.next();

        // Search for the variable in the ArrayList
        if (al.contains(datua)) {
            System.out.println("Aldagaia aurkitu da posizioan: " + al.indexOf(datua));
        } else {
            System.out.println("Ez da aurkitu");
        }

        // Display all entered data (using iterator)
        System.out.println("Datuak:");
        while (alit.hasNext()) {
            System.out.println(alit.next());
        }
        in.close();
    }
}