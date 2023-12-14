package model;

import model.MyPoint;

public class MyCircle extends MyPoint {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;
}

    public MyCircle() {
        this.center = center;
        this.radius = 0;
    }

    public MyCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double distance(MyCircle another) {
        double dist = 0.0;
        MyCircle one = new MyCircle(0, 0, 0);
        return dist;
    }

    public boolean isInside(MyPoint puntua) {
        if (puntua == center) {
            return true;
        } else {
            return false;
        }
    }

    public double getArea() {
        double area = 0.0;

        return area;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getCenterX() {

    }

    public int getCenterY() {

    }

    public int[] getCenterXY() {

    }

    public double getCircumference() {

    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setCenterX(int x) {
        this.x = x;
    }

    public void setCenterY(int y) {
        this.y = y;
    }

    public void setCenterXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {

    }
}