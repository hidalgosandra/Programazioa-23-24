package model;

public class MyCircle extends MyPoint {
    private double radius;
    private String color;

    public MyCircle() {

    }

    public MyCircle(int i, int j, double radius2) {
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        super(center.getX(), center.getY());
        this.radius = radius;
    }

    public MyCircle(double radius2, String color) {
    }

    public double distance(MyCircle another) {
        // You need to implement the distance calculation
        return 0.0;
    }

    public boolean isInside(MyPoint point) {
        // You need to implement the isInside method
        return false;
    }

    public double getArea() {
        // You need to implement the getArea method
        return 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Other getter and setter methods go here

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }
}
