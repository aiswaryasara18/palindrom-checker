class PalindromeUC10 {

    public static void main(String[] args) {

        // Original string
        String text = "A man a plan a canal Panama";

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // Convert to char array
        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        // Compare characters
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + text + "\"" + " is a Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("\"" + text + "\"" + " is not a Palindrome");
        }
    }
}