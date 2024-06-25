package lesson_13.shapes;

public class Point2D {
    private double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this(0, 0);
    }

    public double distanceTo(Point2D other) {
        return distanceBetween(this, other);
    }

    public static double distanceBetween(Point2D p1, Point2D p2) {
        double a = p1.x - p2.x;
        double b = p1.y - p2.y;
        return Math.sqrt(a * a + b * b);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
