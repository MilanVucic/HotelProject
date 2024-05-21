package lesson_5;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {
    public static void main(String[] args) {
        // Write a program that generates a random number and asks the user to guess what the number is.
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = 1 + rand.nextInt(100);
        int lives = 10;
        int lowerLimit = 1;
        int upperLimit = number;

        while (lives > 0) {
            int guess = 1 + lowerLimit + (upperLimit - lowerLimit) / 2;
            System.out.println("Guessing : " + guess);

            if (guess == number) {
                System.out.println("You won.");
                break;
            } else {
                if (guess > number) {
                    System.out.println("Guess too high.");
                    upperLimit = guess;
                } else {
                    System.out.println("Guess too low.");
                    lowerLimit = guess;
                }
                System.out.println("Lives left:" + --lives);
            }
        }

        // 0 - 100 -> 50, too high
        // 0 - 50 -> 25, too low
        // 25 - 50 -> 37, too low
        // 37 - 50 -> 43, too high
        // 37 - 43 -> 40, too low
        // 40 - 43 -> 41, correct!
    }
}
