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

    // Todo: Implement me
    public boolean completelyContains(Circle other) {
        return false;
    }

    public static boolean intersect(Circle c1, Circle c2) {
        return c1.intersects(c2);
    }

    // Todo: Implement me
    public boolean intersects(Circle other) {
        return false;
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
