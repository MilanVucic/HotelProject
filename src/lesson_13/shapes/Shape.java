package lesson_13.shapes;

public class Shape {
    public static int NEXT_ID = 1;
    private int id;

    public Shape() {
        this.id = NEXT_ID;
        NEXT_ID++;
    }

    public double getArea() {
        return 0;
    }

    public double getCircumference() {
        return 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
