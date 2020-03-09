import java.util.Scanner;

class Point {

    private double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Point translate(double a, double b) {
        return new Point(x + a, y + b);
    }

    Point scale(double s) {
        return new Point(x * s, y * s);
    }

    String show() {
        double x = Math.round(this.x * 10.0) / 10.0;
        double y = Math.round(this.y * 10.0) / 10.0;
        return  x + " " + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }
}