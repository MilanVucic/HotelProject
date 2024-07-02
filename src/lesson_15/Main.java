package lesson_15;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // 1,2,3,4,5,6,7,8,9,0,0,12,312,3,123,123,12,3
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3, 10);
        Integer a = 5;
        System.out.println(numbers.contains(5));
        numbers.remove(5);
        System.out.println(numbers.contains(5));
        System.out.println(numbers.get(4));
        System.out.println(numbers);
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(numbers);
        listOfLists.add(null);
    }

    private static void myArrayExample() {
        MyArray<String> myArray = new MyArray<>();
        myArray.add("Milan");
        myArray.add("is");
        myArray.add("our");
        System.out.println(myArray.size());
        myArray.add("teacher");
        myArray.add("and");
        System.out.println(myArray.size());
        System.out.println(myArray.get(0)); // data[0]
        System.out.println(myArray.get(3));
        MyArray<Integer> numbers = new MyArray<>();
        numbers.add(50);
        numbers.add(3);
    }
}
