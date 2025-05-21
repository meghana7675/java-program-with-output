//Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().
import java.util.Scanner;

public class StringReverser {

    // User-defined function to reverse a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse using user-defined function
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
