package exekutagarriak.niretestak;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DataOkerraExcep {
    public static void main(String[] args) {
        String udata = "";
        LocalDate dataBat = LocalDate.now();
        System.out.println("Sartu data bat formatu honetan (uuuu-mm-dd): ");
        Scanner in = new Scanner(System.in);
        udata = in.nextLine();
        in.close();
        try {
            dataBat = LocalDate.parse(udata);
        } catch (DateTimeParseException exception) {
            System.out.println("Data ez da egokia!");
        }
        System.out.println("Data egokia: " + dataBat);
    }
}
