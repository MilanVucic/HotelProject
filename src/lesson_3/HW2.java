package lesson_3;

public class HW2 {
    public static void main(String[] args) {
        String a1 = "abcd";
        String a2 = "ABCD";
        String a3 = "AB";
        String a4 = "cd";

        System.out.println(a1.toUpperCase() == a2); // false
        System.out.println(a1.equals(a2)); // false
        System.out.println(a1.equalsIgnoreCase(a2)); // true
        System.out.println(a1 == a3.toLowerCase() + a4); // false
        System.out.println(a1 == (a3 + a4).toLowerCase()); // false
        System.out.println(a2 == a3.toUpperCase() + a4.toUpperCase()); // false
        System.out.println(a2.equals(a3 + a4)); // false
        System.out.println(a1.equalsIgnoreCase(a3 + a4)); // true
        System.out.println(a1.equals((a3+a4).toLowerCase())); // true
        System.out.println(a2.equals(a3.toUpperCase() + a4.toUpperCase())); // true
    }
}
