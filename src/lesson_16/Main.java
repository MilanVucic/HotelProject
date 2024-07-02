package lesson_16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.size());
    }

    private static void arrayUnion() {
        // Find the union of 2 arrays
        int[] array1 = {1, 2, 3, 4, 5, 6, 7}; // N
        int[] array2 = {5, 6, 7, 8, 9, 10}; // N
        Set<Integer> union = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            union.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            union.add(array2[i]);
        }
        System.out.println(union);
    }

    private static void removingInForEach() {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(set.size());
//        Produces an exception
//        for (Integer a: set) {
//            set.remove(a);
//        }
    }

    private static void foreachExample() {
        int[] ints = {1, 2, 3, 4};
        for (int num : ints) {
            System.out.println(num);
        }
    }

    private static void setExample() {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2); // 532
        System.out.println(set.size());
        System.out.println(set.contains(4));
        System.out.println(set.contains(1));
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer element : set) {
            System.out.println(element);
        }
    }
}
