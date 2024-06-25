package lesson_13.shapes;

public class Circle extends Shape {
    private static double PI = 3.1415;

    private double radius;
    private Point2D center;

    public Circle(double radius, Point2D center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius) {
        this(radius, new Point2D());
    }

    public Circle(double radius, double x, double y) {
        this(radius, new Point2D(x, y));
    }

    public static boolean overlap(Circle c1, Circle c2) {
        return c1.overlaps(c2);
    }

    public boolean completelyContains(Circle other) {
        return this.center.distanceTo(other.center) + other.radius < this.radius;
    }

    public boolean overlaps(Circle other) {
        double distance = this.center.distanceTo(other.center);
        return (this.radius + other.radius) >= distance;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getCircumference() {
        return 2 * radius * PI;
    }

}
