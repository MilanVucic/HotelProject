package lesson_9;

public class WorkingWithStrings {
    /* Additional HW:
        Check if a string is a palindrome.

        Reverse the words in a given string.

        Count the number of uppercase letters in a given string ignoring non alphabetical characters.
     */
    public static void main(String[] args) {

        String text = "Hello world iasd asjd asdjoh asidh asgds great world";

        String input = "     Hello there  \n   ";
        System.out.println(input);
        System.out.println(input.trim());
    }

    private static void indexOfSubString(String text) {
        String firstToInclude = "world";
        String lastWordToInclude = "great";
        int start = text.indexOf(firstToInclude);
        int end = text.lastIndexOf(lastWordToInclude);
        if (start > 0 && end > 0 && end > start) {
            String part = text.substring(start + firstToInclude.length(), end);
            System.out.println(part);
        }
        System.out.println(text.replaceAll("world", "YO"));
    }

    private static void splitExample(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    private static void charAT(String text) {
        char letter = text.charAt(4);
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
        System.out.println(letter);
    }

    private static void escapingCharacters() {
        System.out.println("Alexander “The Great“");
        System.out.println("A\blexander\n \"The Great\"");
        System.out.println("\\\\");
        System.out.println("1.\tList \rstuff\n2.Delete\n3.Exit");
    }

}
