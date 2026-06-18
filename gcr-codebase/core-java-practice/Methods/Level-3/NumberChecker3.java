import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] digits = digitsArray(number);
        int[] reversed = reverseDigits(digits);
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(reversed));
        System.out.println(arraysEqual(digits, reversed));
        System.out.println(isPalindrome(number));
        System.out.println(isDuckNumber(digits));
    }

    public static int digitCount(int number) {
        int count = 0;
        int n = Math.abs(number);
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] digitsArray(int number) {
        int count = digitCount(number);
        int[] digits = new int[count];
        int n = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = digitsArray(number);
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
}
