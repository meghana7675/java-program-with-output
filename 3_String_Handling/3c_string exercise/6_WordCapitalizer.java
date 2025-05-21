//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
import java.util.Scanner;

public class WordCapitalizer {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s+"); // Split by whitespace
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize first letter and add to result
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call user-defined function
        String capitalized = capitalizeWords(input);
        System.out.println("Capitalized String: " + capitalized);

        scanner.close();
    }
}
