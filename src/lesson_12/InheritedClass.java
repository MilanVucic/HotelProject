package lesson_12;

public class InheritedClass extends SomeClass {
    private int d;

    public InheritedClass(int a, int d) {
        super(a);
        this.d = d;
        System.out.println("Calling InheritedClass constructor");
    }
}
