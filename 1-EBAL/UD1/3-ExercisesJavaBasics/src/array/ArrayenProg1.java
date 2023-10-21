import java.util.Scanner;

public class ArrayenProg1 {
    public static void main(String[] args) throws Exception {
        String[] ik = { "Iker", "Oier", "Sandra", "Koldo", "Yeray" };
        String[] ik2 = { "idoia", "iker", "oier", "sandra", "koldo", "yeray" };
        int u;
        Scanner in = new Scanner(System.in);
        System.out.print("Zenbatgarren ikaslea ikusi nahi duzu? ");
        u = in.nextInt();
        in.close();
        if (u >= 0 && u <= 5) {
            System.out.println(u + "-garren ikaslea: " + ik[u - 1]);
        }
        System.out.println();
        System.out.print("Ikasle guztiak: ");
        for (int i = 0; i < ik.length; i++) {
            System.out.print(ik[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("Ikasle guztiak maiuskulaz: ");
        for (int i = 0; i < ik2.length; i++) {
            String maius = ik2[i].toUpperCase();
            System.out.print(maius + " ");
        }
    }
}