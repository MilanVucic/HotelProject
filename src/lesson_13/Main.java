package lesson_13;

import lesson_13.shapes.Point2D;
import lesson_13.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(-1, 0);
        Point2D p2 = new Point2D(4,12);
        System.out.println(p1.distanceTo(p2));
        System.out.println(Point2D.distanceBetween(p1, p2));
    }

    private static void basicStaticExamples() {
        StaticExample d = new StaticExample();
        d.somethingElse = 500;
        StaticExample staticExample2 = new StaticExample();
        staticExample2.somethingElse = 300;

        StaticExample.something = 500;
        String name = "asd";
        name.length();

        System.out.println(staticExample2.something);
    }
}
