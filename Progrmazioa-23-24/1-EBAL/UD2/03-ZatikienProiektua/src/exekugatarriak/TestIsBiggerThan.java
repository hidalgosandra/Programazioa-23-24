package exekugatarriak;

import java.util.Scanner;

import model.Zatikia;

public class TestIsBiggerThan {
    public static void main(String[] args) {
        int kop = 2;
        Zatikia[] zatikiak;
        int izenda;
        int zenba;
        zatikiak = new Zatikia[kop];
        Scanner in = new Scanner(System.in);
        System.out.println("Sartu zatiki bi espazio batez bananduta eta nik handiena zein den esango dizut: ");
        for(int i = 0; i < zatikiak.length; i++){
            izenda = in.nextInt();
            zenba = in.nextInt();
            zatikiak[i] = new Zatikia();
        }
        
    }
}
