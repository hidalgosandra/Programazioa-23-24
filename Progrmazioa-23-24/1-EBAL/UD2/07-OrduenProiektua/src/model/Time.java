package model;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(String time) {

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour > 0 && hour <= 24) && (minute > 0 && minute <= 60) && (second > 0 && second <= 60)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public String toString() {
        String data = "";

        if (hour <= 9 && minute <= 9 && second <= 9) {
            data = "0" + hour + ":0" + minute + ":0" + second;
        } else if (hour <= 9 && minute <= 9) {
            data = "0" + hour + ":0" + minute + ":" + second;
        } else if (hour <= 9 && second <= 9) {
            data = "0" + hour + ":" + minute + ":0" + second;
        } else if (minute <= 9 && second <= 9) {
            data = hour + ":0" + minute + ":0" + second;
        } else if (hour <= 9) {
            data = "0" + hour + ":" + minute + ":" + second;
        } else if (minute <= 9) {
            data = hour + ":0" + minute + ":" + second;
        } else if (second <= 9) {
            data = hour + ":" + minute + ":0" + second;
        } else {
            data = hour + ":" + minute + ":" + second;
        }

        return data;
    }

    public Time nextSecond() {
        return null;
    }

    public Time previousSecond() {
        return null;
    }
}
