package lesson_8.lesson_7_hw;

import lesson_8.Main;

public class MatrixDiagonals {
    // Additional HW: Edit the code below to display numbers ABOVE (below) both of these diagonals
    public static void main(String[] args) {
        //   0 1 2
        //   _____
        // 0|3 4 5
        // 1|6 7 8
        // 2|3 4 5
        int[][] array = {{1, 10, 8, 5, 4}, {10, 8, 2, 5, 0},
                {10, 2, 6, 12, 4}, {10, 3, 4, 7, 5}, {1, 1, 4, 7, 5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == array.length - 1) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}
