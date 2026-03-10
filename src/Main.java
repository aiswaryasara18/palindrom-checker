// PalindromeChecker class encapsulates the palindrome logic
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String text) {

        char[] arr = text.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// Main class
public class PalindromeUC11 {

    public static void main(String[] args) {

        String word = "level";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}