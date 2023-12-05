import java.util.ArrayList;

public class ArrayListProbak {
    public static void main(String[] args) {
        ArrayList<String> alIzenak = new ArrayList<String>();
        alIzenak.add("Ibai");
        alIzenak.add("IkerF");
        alIzenak.add("AnerR");
        String izena = alIzenak.remove(1);

        izena = alIzenak.remove(156);

        alIzenak.remove("IkerF");
    }
}