package lesson_13;

public class StaticExample {
    public static int something = 50;

    public int somethingElse = 100;

    public void normalMethod() {
        this.somethingElse = 5000;
        something = 5012;
        staticMethod();
        anotherMethod();
    }

    public void anotherMethod() {

    }

    public static void staticMethod() {
        // Calling normal methods or using normal fields from static methods
        // Is not possible
//        normalMethod();
//        somethingElse = 50;
    }
}
