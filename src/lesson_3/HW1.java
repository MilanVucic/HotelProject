package lesson_3;

public class HW1 {
    public static void main(String[] args) {
        int a = 100; // 100
        int b = 101; // 102
        boolean c = ++a >= b; // TRUE; if it was like this: a++ >= b -> false
        int d = 102; // 101
        // LAZY EVAL TRUE OR ANYTHING -> TRUE so the right side isn't even checked
        if (d-- <= b || ++b > --a) {
            System.out.println("1");
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
