package lesson_13.shapes;

public class Triangle extends Shape {
    private Point2D aPoint, bPoint, cPoint;
    private double ab, bc, ca;

    public Triangle(Point2D aPoint, Point2D bPoint, Point2D cPoint) {
        this.aPoint = aPoint;
        this.bPoint = bPoint;
        this.cPoint = cPoint;
        ab = aPoint.distanceTo(bPoint);
        bc = bPoint.distanceTo(cPoint);
        ca = cPoint.distanceTo(aPoint);
    }

    @Override
    public double getArea() {
        double s = getCircumference() / 2;
        return Math.sqrt(s * (s-ab) * (s-bc) *(s-ca));
    }

    @Override
    public double getCircumference() {
        return ab + bc + ca;
    }
}
