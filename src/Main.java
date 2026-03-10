// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String text);
}

// Stack Strategy Implementation
import java.util.Stack;

class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque Strategy Implementation
import java.util.Deque;
import java.util.ArrayDeque;

class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String text) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String text) {
        return strategy.checkPalindrome(text);
    }
}

// Main Class
public class PalindromeUC12 {

    public static void main(String[] args) {

        String word = "madam";

        // Choose strategy dynamically
        PalindromeContext context = new PalindromeContext(new StackStrategy());
        // PalindromeContext context = new PalindromeContext(new DequeStrategy());

        if (context.execute(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}