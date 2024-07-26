package lesson_21;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws BadTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new BadTriangleException(a, b, c);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
