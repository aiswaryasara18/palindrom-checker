class PalindromeUC13 {

    // Method 1: String Reverse
    static boolean reverseMethod(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }

    // Method 2: Two Pointer (char array)
    static boolean twoPointerMethod(String str) {
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 3: Recursion
    static boolean recursiveMethod(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursiveMethod(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "racecar";

        // Reverse Method
        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(word);
        long end1 = System.nanoTime();

        // Two Pointer Method
        long start2 = System.nanoTime();
        boolean r2 = twoPointerMethod(word);
        long end2 = System.nanoTime();

        // Recursive Method
        long start3 = System.nanoTime();
        boolean r3 = recursiveMethod(word, 0, word.length() - 1);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("Reverse Method Result: " + r1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Two Pointer Method Result: " + r2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Recursive Method Result: " + r3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}