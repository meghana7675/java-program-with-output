//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
import java.util.Scanner;

public class NumericChecker {

    // User-defined function to check if the string is numeric
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Check each character
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using user-defined function
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does not contain only numeric characters.");
        }

        scanner.close();
    }
}
