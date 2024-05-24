package lesson_6;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    //    Write a program to play the Hangman game - guessing a hidden word.
    // Additional HW: add more words, add the counter for guesses,
    // add number of lives which are used when you make a mistake
    public static void main(String[] args) {
        // Hidden word : _ _ _ _ _ _ _ ; A
        // A _ _ _ A _ _
        String[] words = {"apple", "application", "banana"};

        // A P P L E
        // F F F F F (booleans)
        // 0 0 0 1 1
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        char[] hiddenWord = words[randomIndex].toCharArray(); // a, p, p, l, e
        Scanner scanner = new Scanner(System.in);

        boolean[] guessed = new boolean[hiddenWord.length];
        while (true) {
            System.out.println("Enter your guess:");
            String input = scanner.nextLine();
            char letter = input.toLowerCase().charAt(0);

            // Check if the letter is contained and update indexes where it was found
            for (int i = 0; i < hiddenWord.length; i++) {
                if (letter == hiddenWord[i]) {
                    guessed[i] = true;
                }
            }

            // Check whether all the letters were guessed
            boolean guessedAll = true;
            for (int i = 0; i < guessed.length; i++) {
                if (!guessed[i]) {
                    guessedAll = false;
                    break;
                }
            }

            // Go out if so, if not, print the current state of the word
            if (guessedAll) {
                System.out.println("Congratz, you won!");
                break;
            } else {
                for (int i = 0; i < hiddenWord.length; i++) {
                    if (guessed[i]) {
                        System.out.print(hiddenWord[i]);
                    } else {
                        System.out.print("_");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
