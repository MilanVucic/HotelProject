package lesson_5;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
//        Write a program to find the sum of the digits of a given number.

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            int sum = 0;
            // 5281 -> 5281 % 10 = 1
            // 5281  / 10 -> 528
            // 528 % 10 = 8, 528 / 10 = 52
            // 52 % 10 = 2, 52 / 10 = 5
            // 5 % 10 = 5, 5 / 10 = 0
            while (number > 0) {
                int lastDigit = number % 10;
                sum += lastDigit;
                number = number / 10;
            }

            System.out.println("Sum of digits: " + sum);
        }
    }
}
