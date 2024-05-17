package lesson_4;

import java.util.Scanner;

public class Main {
    // Additional HW: Write a program to check whether a number is prime or not.
    // Prime number: has no dividers other than 1 and itself
    public static void main(String[] args) {
//        int counter = 0;
//        boolean isEnough = false;
//        while (!isEnough || ++counter < 200) {
//            counter++;
//            System.out.println("counter = " + counter);
//            if (counter == 101) {
//                isEnough = true;
//            }
//        }

//        for (int i = 25; i < 600; i += 5) {
//            System.out.println(i);
//        }
//        int doWhileExample = 0;
//        do {
//            System.out.println("DO WHILE:" + doWhileExample);
//        } while (doWhileExample > 50);
//
//        int whileExample = 0;
//        while (whileExample > 50) {
//            System.out.println("WHILE:" + whileExample);
//        }

//        Scanner scanner = new Scanner(System.in);
//        String input;
//        do {
//            System.out.println("Welcome to our app. To exit, type 'quit'");
//            input = scanner.nextLine();
//        } while (!input.equals("quit"));
//
//        boolean keepGoing = true;
//        while (keepGoing) {
//            System.out.println("Welcome to our app. To exit, type 'quit'");
//            input = scanner.nextLine();
//            if (input.equals("quit")) {
//                keepGoing = false;
//            }
//        }

//         Write a program to calculate the sum of first N numbers
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter a positive number (negative to stop):");
//            int limit = scanner.nextInt();
//
//            if (limit < 0) {
//                break;
//            }
//            int number = 1;
//            int sum = 0;
//            while (number <= limit) {
//                sum += number;
//                number++;
//            }
//            System.out.println(sum);
//        }

//        int sumFor = 0;
//        for (int i = 1; i <= limit; i++) {
//            sumFor += i;
//        }
//        System.out.println(sumFor);

//        Scanner scanner = new Scanner(System.in);
//        int total = 0;
//        while (true) {
//            System.out.println("Enter a positive number to add it, or negative to stop");
//            int number = scanner.nextInt();
//            if (number <= 0) {
//                break;
//            }
//            total += number;
//        }
//        System.out.println("Total: " + total);
//
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            int b = 0;
//            while (b < 3) {
//                System.out.println("i = " + i);
//                System.out.println("b = " + b);
//                System.out.println("_________________");
//                b++;
//            }
//            System.out.println("+++++++++++++++++++++++++++++++++++++");
//        }
//        label: while (true) {
//            int count = 0;
//            while (true) {
//                count++;
//                if (count == 50) {
//                    break label;
//                }
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        // 6! = 6 * 5 * 4 * 3 * 2 * 1;

        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
