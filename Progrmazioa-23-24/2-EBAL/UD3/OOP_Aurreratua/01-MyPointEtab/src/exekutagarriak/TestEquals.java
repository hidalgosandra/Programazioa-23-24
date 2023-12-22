package exekutagarriak;

import model.MyPoint;

public class TestEquals {
    public static void main(String[] args) {
        /*
         * 3. Sortu TestEquals izeneko klasea. Bere main metodoan kode hau txertatu eta
         * aztertu gertatutakoa:
         */
        MyPoint p1 = new MyPoint(7, 8);
        MyPoint p2 = new MyPoint(7, 8);

        if (p1.equals(p2)) {
            System.out.println("Espazioko puntu berdina adierazten dute.");
        }
        /*
         * Gertatutakoarekin konforme ez bazaude, kontestu menuaren "Source Action"
         * aginduak erabili ditzakezu equals() (eta hashcode()) metodoak automatikoki
         * berridazteko.
         * toString( ) metodoarekin egiten dugun gauza bera egiteko, alegia. Klaseen
         * arteko herentziarekin dauka honek zerikusia,
         * Ez dugu ahaztu behar klase guztiek Object klasearen deribatuak direla. beraz,
         * bere atributu eta metodo guztiak heredatzen dituztela.
         */
    }
}
