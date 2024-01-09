package model;

import java.time.LocalDate;
import java.util.Scanner;

public class Txapelketa {
    private Partida[] partidak;

    public static void main(String[] args) {

    }

    public void initialize() {

    }

    public Partida partidaBatenDatuakEskatu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Esan partidaren urtea: ");
        LocalDate dataEra = LocalDate.parse(in.next());
        for (int i = 0; i < partidak.length; i++) {
            if (dataEra == partidak[i].getData()) {
                return partidak[i];
            } else {
                System.out.println("Ez da aurkitu partidarik data horretan.");
            }
            in.close();
        }
        return null;
    }

    public void partidaBistaratu() {

    }

    public void estatistikak() {

    }
}
