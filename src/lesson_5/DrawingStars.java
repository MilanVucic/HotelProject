package lesson_5;

import java.util.Scanner;

public class DrawingStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = scanner.nextInt();

        /*
         *XXXX - i = 0
         **XXX
         ***XX - i = 2
         ****X
         *****
         */
//        for (int i = 0; i < numberOfStars; i++) {
//            for (int j = 0; j < numberOfStars; j++) {
//                if (j <= i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print('X');
//                }
//            }
//            System.out.println();
//        }

        /*
           XXX*, i = 0
           XX**, i = 1
           X***, i = 2
           ****
         */
        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j < numberOfStars; j++) {
                if (j >= numberOfStars - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();

        }
        /*
         * *****
         * ****
         * ***
         * **
         * *
         *
         * *****
         *  ****
         *   ***
         *    **
         *     *
         *
         * XX*XX
         * X***X
         * *****
         * X***X
         * XX*XX
         */
    }
}
