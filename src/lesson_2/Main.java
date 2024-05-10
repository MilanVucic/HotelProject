package lesson_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String firstName = "Milan";
//        String lastName = "Vucic";
//
//        String numberAsString = "500";
//        System.out.println(numberAsString + 10);
//        int number = Integer.parseInt(numberAsString);
//        System.out.println(number + 10);
//        String name = "Milan";
//        int yearOfBirth = 1994;
//        int currentYear = 2024;
//        int age = currentYear - yearOfBirth;
//        System.out.println(name + " is " + age + " years old");
//
//        String fullName = "Milan Vucic";
//        fullName = fullName.toUpperCase();
//        int a = 50; // 1000 -> 50
//        a = 500; // 1000 -> 500
//        System.out.println(fullName);
//        byte a = 127; // 256 -> 2^8
//        // 1 bit -> 2 numbers: 0, 1
//        // 2 bits -> 4 -> 00, 01, 10, 11
//        // 3 bits -> 2 * 2 * 2 = 2 ^ 3 = 8 -> 000, 001, 010,...  111
//        // ...
//        // 1 byte = 8 bits -> 2 ^ 8 = 256
//        // short = 2B = 16bits -> 2^16 = 65,536 -> half -> 32,768
//        short aShort = 32767;
//        int mediumNumber = 2140000000;
//        long veryLargeNumber = 30081328187237812L;
//        float floatNumber = 5.4f;
//
//        boolean valid = true; // 0-1
//        char character = 'ž';

        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = consoleScanner.next();
        System.out.println("Enter your age:");
        int age = consoleScanner.nextInt();
        System.out.println("Enter your height:");
        double height = consoleScanner.nextDouble();
        System.out.println("Hello " + firstName);
        System.out.println("You are " + age);
        System.out.println("You are " + height + " cm tall.");

        Scanner stringScanner = new Scanner("10 Milan 50");
        int aNumber = stringScanner.nextInt();
        System.out.println(aNumber);
        String name = stringScanner.next();
        System.out.println(name);
    }
}
