package lesson_6;

public class ArrayElementIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 9, 10, 12, 20, 9};
        int value = 9;

        int index = -1; // Convention to return -1 if not found
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
