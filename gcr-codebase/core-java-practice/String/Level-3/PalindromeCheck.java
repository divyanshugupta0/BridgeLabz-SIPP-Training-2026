import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(checkPalindrome(text));
        System.out.println(checkPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println(checkPalindromeWithReverse(text));
    }

    public static boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean checkPalindromeWithReverse(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseArray(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseArray(String text) {
        int n = text.length();
        char[] reversed = new char[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = text.charAt(n - 1 - i);
        }
        return reversed;
    }
}
