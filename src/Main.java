import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class PalindromeUC6 {

    public static void main(String[] args) {

        // String to check
        String word = "level";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into Stack and Queue
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}