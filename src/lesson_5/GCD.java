package lesson_5;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        // Write a program to find greatest common divisor (GCD) of given two numbers.
        // GCD of 25 and 30 -> 5 (biggest number that divides them both)
        // 25, 3 -> 1
        // 10, 32 -> 2

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number 1: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter number 2: ");
            int number2 = scanner.nextInt();

            int min = number1 > number2 ? number2 : number1;
            int gcd = 1;
            for (int divider = min; divider >= 2; divider--) {
                if (number1 % divider == 0 && number2 % divider == 0) {
                    gcd = divider;
                    break;
                }
            }
            System.out.println("GCD for " + number1 + " and "
                    + number2 + " is: " + gcd);
        }
    }
}
