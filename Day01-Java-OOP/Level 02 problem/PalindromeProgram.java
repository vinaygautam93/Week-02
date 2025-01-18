import java.util.Scanner;

class PalindromeChecker {
    private String text; // Attribute to store the input text

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; // Not a palindrome if mismatch occurs
            }
            left++;
            right--;
        }
        return true; // Palindrome if all characters match
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Create a PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(inputText);

        // Display the result
        checker.displayResult();

        scanner.close();
    }
}
