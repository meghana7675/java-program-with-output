//Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
import java.util.Scanner;

public class SubstringCounter {

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop to find all occurrences
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index forward to continue searching
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get main string from user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Get substring to count
        System.out.print("Enter the substring to search for: ");
        String subString = scanner.nextLine();

        // Call user-defined function and display result
        int occurrences = countOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" appears " + occurrences + " times in the main string.");

        scanner.close();
    }
}
