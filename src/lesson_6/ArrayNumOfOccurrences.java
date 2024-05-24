package lesson_6;

public class ArrayNumOfOccurrences {
    public static void main(String[] args) {
        int[] numbers = {9, 5, 6, 9, 10, 12, 20, 9};
        int value = 9;

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                count++;
            }
        }
        System.out.println(count);
    }
}
