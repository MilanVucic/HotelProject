package lesson_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Additional HW: Write a method to find all elements in the array that are greater than the average.
    public static void main(String[] args) {
        // Write a method to test if an array has any repeating elements.
        // [1,2,3,4,5,3] -> has repeating elements
        // [1,2,3,4,5] -> nope

    }

    private static boolean hasRepeatingElements(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printArray(int[] array) {
        if (array.length == 0) {
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    /**
     * Returns the max value of a given array
     * @param array
     * @return
     */
    private static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    protected static void passByValueExample() {
        int a = 50; // 182371237
        change(a);
        System.out.println(a); // pass-by-value VS pass-by-reference
        // JAVA IS PASS BY VALUE
        int[] anArray = {1, 2, 3}; // 8000
        change(anArray);
        System.out.println(Arrays.toString(anArray));
    }

    private static void change(int[] anArray) {
        anArray[1] = 500; // 8001 -> 500
    }

    private static void change(int variable) {
        variable = 100;
        System.out.println("I changed A");
    }

    public static void printMultipleTimes(String input, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(input);
        }
    }
}
