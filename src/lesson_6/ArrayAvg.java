package lesson_6;

public class ArrayAvg {
    public static void main(String[] args) {
//        Write a program to calculate the average value of array elements.

        int[] numbers = {1, 5, 6, 9, 10, 12, 20};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Avg: " + 1.0 * sum / numbers.length);
    }
}
