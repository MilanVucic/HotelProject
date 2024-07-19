package lesson_18;

import java.util.*;

public class Main {

    // Additional HW:

    /*
        1. Check whether an array is subset of another array.
        [1,2,3,4] arr1, M
        [1,2,3,4,5,6,7,8,9] arr2
        is arr1 subset of arr2? yes
        O(N^2) -> time complexity
        O(1) -> space complexity

        Bubble sort => O(N^2)
        Selection sort => O(N^2)
        merge sort => O(N logN)
        SORT and then do stuff

        using a Set we can get time to O(N)
        Space complexity will be O(N)

        O(N*N) -> O(N logN)
        10^6 * 10^6 = 10^12
        10^6 * log2(10^6)= 10^6 * 20ish
        logx Y = V
        x^v = Y
        2^10 = 1024 ~1000

        2. Check if a pair of elements exists with given sum in given array.
        Input: arr[] = {2, 0, -1, 6, -3, 1, 3}, sum = 5
        Output: Yes
        Explanation:  If we calculate the sum of the output:1 + (-3) = -2

        3. Maximum distance between two occurrences of same element in array
        Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
        Output: 10
        // maximum distance for 2 is 11-1 = 10
        // maximum distance for 1 is 4-2 = 2
        // maximum distance for 4 is 10-5 = 5

        4. Check if the brackets are properly paired ([{}])
        ()[[{}()]] -> true
        (())[) -> false
        (]]))[[ -> false
        ((([[[ -> false

        5. Find the n-th largest element in an array. Same numbers only count once (i.e. arr = [10, 10, 5], n = 2, output is 5, not 10)
     */
    // Queue = FIFO - First In First Out
    // Stack = LIFO - Last In First Out
    public static void main(String[] args) {
        // hello -> there friend Milan
        // going -> to from at
        // word -> top1 top2 top3
        // i'm going to school. then i'm again going to the supermarket
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
    }

    private static void stackQueueExample() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Milan");
        queue.add("Luca");
        queue.add("Vasily");

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Stack<String> stack = new Stack<>();
        stack.push("Farouq");
        stack.push("Marco");
        stack.push("Emily");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
