package lesson_7;

import java.util.Arrays;

public class Main {
    // Additional HW: In a 2D matrix of NxN (square)
    // Find the sum of all the numbers on the left (right) diagonal
    // 3 4 5
    // 4 5 1
    // 1 2 3
    public static void main(String[] args) {
        // find the index of the student with the highest average grade
        int[][] grades = {{10, 8, 9, 9}, {6, 6, 8}, {8, 9, 7, 6}, {9, 9, 10}};
        double max = -1;
        int index = -1;
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double avg = sum / grades[i].length;
            System.out.println("AVG " + i + " " + avg);
            if (max < avg) {
                max = avg;
                index = i;
            }
        }

        System.out.println("Max avg: " + max + " by student " + index);
    }
}
