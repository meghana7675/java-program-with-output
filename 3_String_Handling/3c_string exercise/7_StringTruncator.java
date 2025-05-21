//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()
import java.util.Scanner;

public class StringTruncator {

    // User-defined function to truncate a string and add ellipsis
    public static String truncate(String str, int maxLength) {
        if (str == null) {
            return null;
        }

        if (maxLength < 3) {
            return "...".substring(0, maxLength); // Handle very short lengths
        }

        if (str.length() <= maxLength) {
            return str;
        }

        // Truncate and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the maximum length: ");
        int maxLength = scanner.nextInt();

        // Use user-defined function
        String result = truncate(input, maxLength);
        System.out.println("Truncated String: " + result);

        scanner.close();
    }
}
