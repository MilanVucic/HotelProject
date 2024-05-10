package lesson_1;

public class Main {
    public static void main(String[] args) {
        double height = 185.4, weight = 50.5;
        int c;
        int a = 987, b = 12;
        c = a + b;
        c = c + 5;
        int a1 = 1500000000;
        int a2 = 1500000000;
        int a3 = a1 + a2;
        int maxNumber = Integer.MAX_VALUE;

        int expression = 2 + 2 * 2;
        maxNumber = maxNumber + 1;

        int b1 = 50;
        int b2 = 20;
        System.out.println(b1 / b2 * 1.0);
        System.out.println(1.0 * b1 / b2);

        int remainder = b1 % 51;
        System.out.println(remainder);
        // Going to be counting stuff with this variable
        // 50 % 12
        /*
            Multi line
            comment
            here
         */
        int counter = 0;
        counter = counter + 5;
        counter += 5;
        counter++;
        counter += 1;
        counter--;
        System.out.println(counter);

        int aaa = 50;
        aaa++;
        System.out.println(aaa);
        System.out.println(aaa++);
        System.out.println(aaa);
        System.out.println(++aaa);
    }
}
