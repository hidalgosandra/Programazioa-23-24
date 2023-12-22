package model;

import java.util.Objects;

public class MyPoint {
    public int x;
    public int y;

    public MyPoint() {
        x = 5;
        y = 5;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyPoint other = (MyPoint) obj;
        return x == other.x && y == other.y;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        double d, dx, dy;
        dx = Math.pow(this.x - 0, 2);
        dy = Math.pow(this.y - 0, 2);
        d = Math.sqrt(dx + dy);
        return d;
    }

    public double distance(MyPoint another) {
        double d, dx, dy;
        dx = Math.pow(another.x - this.x, 2);
        dy = Math.pow(another.y - this.y, 2);
        d = Math.sqrt(dx + dy);
        return d;
    }

    public double distance(int x, int y) {
        double d, dx, dy;
        dx = Math.pow(x - 0, 2);
        dy = Math.pow(y - 0, 2);
        d = Math.sqrt(dx + dy);
        return d;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY() {
        int[] xy = { x, y };
        return xy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
