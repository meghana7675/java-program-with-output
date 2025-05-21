//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():
import java.util.Scanner;

public class PalindromeChecker {

    // User-defined function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        // Check characters from both ends
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using user-defined function
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome (ignoring case and punctuation).");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
