package lesson_10;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    // Additional HW:
    // 1. In a given array of Strings, find the longest common prefix.
    // e.g. [apple, application, ape] -> "ap"
    // e.g. [apple, anything] -> "a"
    // e.g. [apple, anything, banana] -> ""
    //
    // 2. Check if 2 strings are anagrams of each other (below - elbow)
    // aabcddd <-> dabacdd (must have exactly equal number of EACH letter)
    public static void main(String[] args) {
        String name = "Milan";
        double height = 188.4;
        String message = String.format("Hello there %s, you are %.2f cm tall", name, height);
        System.out.println(message);
    }

    private static void sbExample() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asd")
                .append(5)
                .append("asd")
                .append(5.4);
        System.out.println(stringBuilder.toString());
        String message = stringBuilder.toString();
    }

    private static void stringsAndStuff() {
        StringTokenizer tokenizer = new StringTokenizer("hello world hi", " ");
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextElement());
        }
        String a = "Hello"; // a = 1000 -> Hello
        a += "World"; // a = 2000 -> HelloWorld
        String example = "I am Vikram";
        String[] parts = example.split(" ");
        System.out.println(example);
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }

    // DECIMAL -> DECA -> base 10
    // 10 digits -> 0,1,2,...9
    // 3210
    // 5876 => 5 * 1000 + 8 * 100 + 7 * 10 + 6 * 1
    // = 5 * 10^3 + 8 * 10^2 + 7 * 10^1 + 6 * 10^0

    // BINARY -> BI -> base 2
    // 2 digits -> 0 1
    // 3210
    // 1110 -> 1 * 2^3 + 1 * 2^2 + 1 * 2^1 + 0 * 2^0 = 14
    // 16|8421
    //  1 1101 -> 16 + 8 + 4 + 1 = 29

    // 9 -> 1 * 8 + 0 * 4 + 0 * 2 + 1 * 1 -> 1001
    // 5 -> 1 * 4 + 0 * 2 + 1 * 1 = 101
    // 7 -> 4 + 2 + 1 = 111
    // 15 -> 1111 (8 + 4 + 2 + 1)

    // RGB Red Green Blue-> #ff 00 22
    // HEXA + DECIMAL = base 16
    // 0,1,2,3...9,A,B,C,D,E,F
    // 210
    // 1d5 -> 1 * 16^2 + 13 * 16^1 + 5 * 16^0 = 256 + 208 + 5 = 469
}
