package lesson_9;

public class Example {
    int a;
    int b;

    void something(int param) {
        a = param;
        b = param;
        int sum = 0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(param);
    }

    void printAB(double anotherParam) {
        System.out.println(a);
        System.out.println(b);
    }

    void example(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(this.b);
    }
}
