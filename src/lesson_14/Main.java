package lesson_14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sentence = "Hello world my name is Milan";
        String[] longerWords = getWordsLongerThan(sentence, 3);
        System.out.println(Arrays.toString(longerWords));

    }

    // Find all the words longer than X in a given string.
    public static String[] getWordsLongerThan(String sentence, int minWordLength) {
        String[] words = sentence.split(" ");

        // Hello, world, null, name, null
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.length() > minWordLength) {
                counter++;
            }
        }
        String[] result = new String[counter];
        int availableIndex = 0;
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.length() > minWordLength) {
                result[availableIndex] = currentWord;
                availableIndex++;
            }
        }

        return result;
    }
}
