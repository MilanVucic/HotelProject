package lesson_21;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative." + radius);
        }
        this.radius = radius;
    }
}
