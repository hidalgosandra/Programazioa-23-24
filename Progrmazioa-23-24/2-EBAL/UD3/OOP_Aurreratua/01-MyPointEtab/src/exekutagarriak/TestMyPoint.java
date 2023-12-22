package exekutagarriak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.activation.MimeType;

import model.MyPoint;

public class TestMyPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* a) Hiru puntu sortu: */
        MyPoint p0 = new MyPoint(0, 0);
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4, 0);
        /*
         * b) Distantziak koordenatu-jatorriarekiko:
         */
        System.out.println("p0 => " + p0.distance());
        System.out.println("p1 => " + p1.distance());
        System.out.println("p02=> " + p2.distance());
        /*
         * c) Distantziak euren artean:
         */
        System.out.println("p0tik p1ra => " + p0.distance(p1));
        System.out.println("p0tik p2ra => " + p0.distance(p2));
        System.out.println("p1tik p2ra => " + p1.distance(p2));
        /* c.2) p1 puntuaren datuak getXY() metodoa erabilita: */
        System.out.println("Arrays.toString p1.(XY)=> " + Arrays.toString(p1.getXY()));

        /*
         * d) Sortu 10 puntuko array bat. Eta automatikoki bete:
         */
        MyPoint[] myPointsArray = new MyPoint[10];
        for (int i = 0; i < myPointsArray.length; i++) {
            myPointsArray[i] = new MyPoint(i + 1, i + 1);
        }
        for (int i = 0; i < myPointsArray.length; i++) {
            MyPoint point = myPointsArray[i];
            if (i != 9) {
                System.out.print("(" + point.getX() + ", " + point.getY() + "), ");
            } else {
                System.out.println("(" + point.getX() + ", " + point.getY() + ") ");
            }
        }

        /*
         * e) Sortu 100 puntuko arrayLista:
         */
        ArrayList<MyPoint> myPointsArrayLista = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            MyPoint pointList = new MyPoint(i, i);
            myPointsArrayLista.add(pointList);
        }

        for (int i = 0; i < myPointsArrayLista.size(); i++) {
            if (i != 100) {
                System.out.print(myPointsArrayLista.get(i) + ", ");
            } else {
                System.out.print(myPointsArrayLista.get(i));
            }

        }
        /*
         * f) Sortu ausazko 5 puntuko sorta (0-9 tartean). java.util.Random klasearen
         * .nextInt() metodoa erabili dezakezu.
         */
        MyPoint[] myPointsArray5 = new MyPoint[5];
        for (int i = 0; i < myPointsArray5.length; i++) {
            Random random = new Random();
            int numx = random.nextInt(10);
            int numy = random.nextInt(10);
            myPointsArray5[i] = new MyPoint(numx, numy);
        }
        for (int i = 0; i < myPointsArray5.length; i++) {
            MyPoint point = myPointsArray5[i];
            if (i != 4) {
                System.out.print("(" + point.getX() + ", " + point.getY() + "), ");
            } else {
                System.out.print("(" + point.getX() + ", " + point.getY() + ")");
            }
        }

        

    }
}
