package lesson_6;

public class ArrayContains {
    //Write a program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 9, 10, 12, 20, 9};
        int value = 9;

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
