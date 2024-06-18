package lesson_12;

public class SomeClass {
    private int a = 300;
    private double b = a + 500;
    private String c;

    public SomeClass(int a, double b) {
        System.out.println("Calling SomeClass constructor");
        this.a = a;
        this.b = b;
    }

    public SomeClass(int a) {
        this(a, 0);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a < 0) {
            // validation logic etc...
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return "a = " + a + " b = " + b + " c = " + c;
    }
}
