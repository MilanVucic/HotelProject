package lesson_3;

import java.util.Scanner;

public class Main {
    /*
    Lazy evaluation
    1. When this code is executed, what are the values of a, b, c, d at the end?
        Does it print "1" to the console or not?

        int a = 100;
        int b = 101;
        boolean c = ++a >= b;
        int d = 102;
        if (d-- <= b || ++b > --a) {
            System.out.println("1");
        }

        a = ?
        b = ?
        c = ?
        d = ?
    2. Given the Strings below:

        String a1 = "abcd";
        String a2 = "ABCD";
        String a3 = "AB";
        String a4 = "cd";

        What are the following expressions going to evaluate to (true/false)?

        a1.toUpperCase() == a2
        a1.equals(a2)
        a1.equalsIgnoreCase(a2)
        a1 == a3.toLowerCase() + a4
        a1 == (a3 + a4).toLowerCase()
        a2 == a3.toUpperCase() + a4.toUpperCase()
        a2.equals(a3 + a4)
        a1.equalsIgnoreCase(a3 + a4)
        a1.equals((a3+a4).toLowerCase())
        a2.equals(a3.toUpperCase() + a4.toUpperCase())
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 50;
        double salary;
        if (age > 100) {
            salary = 500;
        } else {
            salary = 300;
        }
        double salary2 = (age > 100) ? 500 : 300;

//        String a = "abcd"; // a -> 1000 -> abcd
//        String b = "abcd"; // b -> 1000
//        String c = "ab"; // c -> 3000 -> abcd
//        c += "cd";
//        String d = "ABCD".toLowerCase(); // d -> 4000
//        System.out.println(a == b);
//        System.out.println(b == c);
//        System.out.println(c == d);
//        System.out.println(a == d);

//        System.out.println("Are you an EU citizen?");
//        String answer = scanner.next();
//
//        if (answer.equalsIgnoreCase("no")) {
//            System.out.println("What country are you from?");
//            String country = scanner.next();
//            if (country.equalsIgnoreCase("Switzerland")
//                    || country.equalsIgnoreCase("UK")) {
//                System.out.println("You can enter");
//            } else {
//                System.out.println("How much money do ya got?");
//                double money = scanner.nextDouble();
//                if (money > 500 && money < 100000) {
//                    System.out.println("You can enter.");
//                } else {
//                    System.out.println("We're gonna have to detain you here.");
//                }
//
////                if (money <= 500 || money >= 10000) {
////                    System.out.println("We're gonna have to detain you here.");
////                } else {
////                    System.out.println("You can enter.");
////                }
//            }
//        } else {
//            System.out.println("You can enter.");
//        }
//        System.out.println("Enter a number between 0-100");
//        int number = scanner.nextInt();
//        // I want a RED + CAR
//        //    T and T => T
//        //    F and T => F
//        //    T and F => F
//        //    F and F => F
//
//        // I can talk to you if you speak Serbian or English
//        //    T or T => T
//        //    T or F => T
//        //    F or T => T
//        //    F or F => F
//
//        //   !F => T
//        //   !T => F
//        if (number >= 0 && number <= 100) {
//            System.out.println("Number is between 0 and 100");
//        } else {
//            System.out.println("Number is out of range.");
//        }
//
//        boolean isValid = true;
//        boolean isInvalid = !isValid;
//        boolean notBetween0and100 = !(number >= 0 && number <= 100);
//        // number < 0 || number > 100

//        System.out.println("Enter your name:");
//        String name = scanner.nextLine();
//        System.out.println("Enter your age:");
//        int age = scanner.nextInt();
//        boolean isAKid = age < 20;
//        if (age < 0) {
//            System.out.println("Age cannot be negative.");
//        } else if (isAKid) {
//            System.out.println(name + " ,you should go to school.");
//        } else if (age < 65) {
//            System.out.println(name + " ,you should go to work.");
//        } else {
//            System.out.println(name + " ,you should be in retirement.");
//        }
    }
}
