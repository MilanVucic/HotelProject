package lesson_21;

public class BadTriangleException extends Exception {
    private double a, b, c;

    public BadTriangleException(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getMessage() {
        return String.format("Triangle with sides %.2f %.2f %.2f cannot exist.", a, b, c);
    }
}
