package exekutagarriak;

import model.MyCircle;
import model.MyCylinder;
import java.util.Scanner;

public class ZirkuluaSortu {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean aurrera;
        char opt;
        double radius, area;
        String color;
        do {
            aurrera = false;
            System.out.print("Zer nahi duzu Zirkulu bat (c) edo Zilindro bat (z)? ");
            opt = in.next().toLowerCase().charAt(0);

            if (opt == 'c') {
                System.out.print("Erradioaren tamaina eman: ");
                radius = in.nextDouble();
                System.out.print("Kolorea eman: ");
                color = in.next();
                MyCircle c1 = new MyCircle(0, 0, radius);
                c1.setColor(color);
                area = c1.getArea();

                System.out.println("Hauek dira sortutako ZIRKULUAren ezaugarriak:");
                System.out.println("\tErradioa: " + radius);
                System.out.println("\tKolorea: " + color);
                System.out.println("\tAzalera: " + area);
                System.out.println();

            } else if (opt == 'z') {
                System.out.print("Erradioaren tamaina eman: ");
                radius = in.nextDouble();
                System.out.print("Kolorea eman: ");
                color = in.next();
                System.out.print("Zilindroaren altuera eman: ");
                double height = in.nextDouble();
                MyCylinder cy1 = new MyCylinder(height, radius, color);
                area = cy1.getArea();
                double volume = cy1.getVolume();

                System.out.println("Hauek dira sortutako ZILINDROAren ezaugarriak:");
                System.out.printf("\tErradioa: " + radius);
                System.out.printf("\tKolorea: " + color);
                System.out.printf("\tAltuera: " + height);
                System.out.printf("\tBolumena: " + volume);
                System.out.printf("\tAzalera: " + area);
                System.out.println();
            } else {
                System.out.println("Ez dago opzio hori, Zirkulua (c) edo Zilindroa (z) aukeratu!");
            }
        } while (!aurrera);
    }
}
