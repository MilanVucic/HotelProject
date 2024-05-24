package lesson_6;

public class ArrayMax {
    public static void main(String[] args) {
//        Write a program to find the maximum and minimum value of an array.
        int[] numbers = {-5, -10, -3};
        // Ticket -> valid for 15 days -> 15 * 24 * 60 * 60 * 1000

        if (numbers.length > 0) {
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println(max);
        } else {
            System.out.println("No max.");
        }
    }
}
