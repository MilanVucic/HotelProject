package lesson_5;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Write a program to check whether a number is prime or not.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number (negative to stop)");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }
            boolean isPrime = true;
            for (int divider = 2; divider <= Math.sqrt(number); divider++) {
                System.out.print("Checking if it's divisble by " + divider);
                if (number % divider == 0) {
                    isPrime = false;
                    System.out.println(" YES");
                    break;
                } else {
                    System.out.println(" NO");
                }
                System.out.println();
            }
            System.out.println(isPrime);
        }
    }
}
