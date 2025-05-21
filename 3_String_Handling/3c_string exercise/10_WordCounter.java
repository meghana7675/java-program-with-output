//Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()
import java.util.Scanner;

public class WordCounter {

    // User-defined function to count the number of words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string based on whitespace
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count words using user-defined function
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
