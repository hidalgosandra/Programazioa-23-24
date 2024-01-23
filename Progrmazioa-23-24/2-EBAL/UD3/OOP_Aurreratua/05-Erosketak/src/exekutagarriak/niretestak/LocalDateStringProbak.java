package exekutagarriak.niretestak;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class LocalDateStringProbak {
    public static void main(String[] args) {
        String strDataBat = "2024-01-23";
        LocalDate ldDataBat = LocalDate.now();
        LocalDate ldDataBi = LocalDate.parse("2024-01-23");
        LocalDate ldDataHiru = LocalDate.of(2014, 01, 23);
       // LocalDate ldDataLau = (LocalDate)strDataBat; Ez da zuzena, ezin da casteatu from String to LocalDate
        try{
        LocalDate ldDataTryCath = LocalDate.parse("2024-01-32");
        }catch(DateTimeParseException exception){
            System.out.println("Data ez egokia da!");
        }

        
    }
}
