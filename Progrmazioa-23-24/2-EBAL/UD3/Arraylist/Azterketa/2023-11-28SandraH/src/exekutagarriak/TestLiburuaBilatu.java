package exekutagarriak;

import model.Liburua;

class TestLiburuaBilatu {
    public static void main(String[] args) {
        Liburua[] lk = Liburua.getKatalogoa();
        System.out.println(Liburua.liburuaBilatu("ATXA.OBAB", lk));
    }

}