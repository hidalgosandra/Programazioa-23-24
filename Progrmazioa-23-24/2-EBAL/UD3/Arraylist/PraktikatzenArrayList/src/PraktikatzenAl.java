import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PraktikatzenAl {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al = new ArrayList<String>();
        Iterator<String> alIt = al.iterator();
        int kop;
        String datua;
        Scanner in = new Scanner(System.in);
        System.out.println("Zenbat kopuru gorde nahi dituzu: ");
        kop = in.nextInt();
        for (int i = 0; i < kop; i++) {
            System.out.println("Zer sartu nahi duzu? ");
            datua = in.nextLine();
            al.add(datua);
        }
        System.out.println("Zer bilatu nahi duzu? ");
        datua = in.nextLine();
        for (int i = 0; i < kop; i++) {
            if (al.contains(datua)) {
                System.out.println(al.indexOf(datua));
                break;
            } else {
                System.out.println("Ez dago zerrenda honetan datu hori.");
            }
        }
        System.out.println("Zer datu nahi duzu komprobatu bat baino gehiago badagoen? ");
        datua = in.nextLine();
        while (kop < al.size()) {
            if (al.indexOf(datua) == al.lastIndexOf(datua)) {
                System.out.println("Aldi bakarra dago.");
            } else {
                System.out.println("Bat baino gehiagotan dago datua.");
            }
        }
        in.close();
    }
}
