package lesson_13.shapes;

public class Rectangle extends Shape {
    private Point2D topLeft, bottomRight;
    private double a, b;

    public Rectangle(Point2D topLeft, Point2D bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.a = Math.abs(topLeft.getX() - bottomRight.getX());
        this.b = Math.abs(topLeft.getY() - bottomRight.getY());
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getCircumference() {
        return 2 * (a + b);
    }

}
