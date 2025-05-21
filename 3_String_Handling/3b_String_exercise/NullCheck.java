//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
import java.util.Scanner;

public class NullCheck {

    // User-defined function to check if a string is null or empty (only whitespace)
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using the user-defined function
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }

        scanner.close();
    }
}
