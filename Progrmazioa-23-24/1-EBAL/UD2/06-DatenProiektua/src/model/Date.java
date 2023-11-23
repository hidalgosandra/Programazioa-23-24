package model;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day <= 31) {
            this.day = day;
        } else {
            System.out.println("Sartu duzun eguna okerra da!");
        }

    }

    public void setMonth(int month) {
        if (month <= 12) {
            this.month = month;
        } else {
            System.out.println("Sartu duzun hilabetea okerra da!");
        }

    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int year, int month, int day) {
        if (day <= 31 && month <= 12) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Sartu duzun data okerra da!");
        }

    }

    public String toString() {
        String data;
        data = day + "/" + month + "/" + year;
        return data;
    }

    public String getHilabeteaLetretan() {
        String hilabetea[] = { "Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uzatila", "Abuztua",
                "Iraila", "Urria", "Azaroa", "Abendua" };
        return hilabetea[month - 1];
    }

    public String getHilabeteaLetretan(String hizkuntza) {
        String hilabetea[][] = {
                { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                        "November", "December" },
                { "Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uzatila", "Abuztua", "Iraila",
                        "Urria", "Azaroa", "Abendua" },
                { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre",
                        "Noviembre", "Diciembre" } };
        switch (hizkuntza) {
            case "EN":
                return hilabetea[0][month - 1];
            case "EU":
                return hilabetea[1][month - 1];
            case "ES":
                return hilabetea[2][month - 1];
            default:
                return "Hizkuntza balido bat sartu (EU, EN edo ES)!";
        }
    }
}