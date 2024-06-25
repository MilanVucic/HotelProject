package lesson_13;

import lesson_13.shapes.*;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(0, 0);
        Point2D p2 = new Point2D(4,4);
        Point2D p3 = new Point2D(4,0); // 8
        Point2D p4 = new Point2D(5,-5); // 8

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(20);
        shapes[1] = new Triangle(p1, p2, p3);
        shapes[2] = new Rectangle(p1, p4);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("-------------------");
            System.out.println(shapes[i]);
            System.out.println("Area:" + shapes[i].getArea());
            System.out.println("Circumference:" + shapes[i].getCircumference());
            System.out.println("-------------------");
        }
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
