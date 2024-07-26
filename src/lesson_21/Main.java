package lesson_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (MyCloseableClass myCloseableClass = new MyCloseableClass()) {
            myCloseableClass.doStuff();

        } catch (Exception e) {
            System.out.println("...");
        }
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3();
        method4();
    }

    private static void method4() {
        String name = "Milan";
        System.out.println(name.charAt(10));
    }

    private static void method3() {
        method5();
    }

    private static void method5() {
        System.out.println("M5");
    }

    private static void customException() {
        try {
            Triangle triangle = new Triangle(4, 2.232345, 5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("....");
            System.out.println(e.getMessage());
        }
    }

    private static void binaryAndOr() {
        int a = 5; // 101
        int b = 6; // 110
        // 101 & 110 -> 100
        // 101 | 110 -> 111
        System.out.println(a & b); // 4
        System.out.println(a | b); // 7
    }

    private static void checkedExceptionExample() {
        File file = new File("filename.txt");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist.");
        }
    }

    private static void tryCatchFinally() {
        try {
            Circle c1 = new Circle(50);
            Circle c2 = new Circle(-50);
            Circle c3 = new Circle(50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Releasing system resources.");
        }
    }

    private static void exceptionExample() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter your age:");
                int age = Integer.parseInt(scanner.next());
                System.out.println("You are " + age + " years old.");
                System.out.println("Enter 0,1 or 2");
                int[] array = {5, 10, 20};
                int choice = Integer.parseInt(scanner.next());
                System.out.println("You won " + array[choice] + " points.");
                break;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException exception) {
                System.out.println("Wrong input. Please try again");
            }
        }
        System.out.println("The end...");
    }

    private static void doStuff() {
        int[] array = {1, 2, 3};
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[1]);
    }
}
