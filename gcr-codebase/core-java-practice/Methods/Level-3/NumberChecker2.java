import java.util.Scanner;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = digitCount(number);
        int[] digits = digitsArray(number);
        int sum = sumDigits(digits);
        int sumSquares = sumSquareDigits(digits);
        System.out.println(count);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(sumSquares);
        System.out.println(isHarshad(number, sum));
        String[][] freq = digitFrequency(number);
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + " " + freq[i][1]);
        }
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

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumSquareDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshad(int number, int sum) {
        return sum != 0 && number % sum == 0;
    }

    public static String[][] digitFrequency(int number) {
        int[] freq = new int[10];
        int[] digits = digitsArray(number);
        for (int digit : digits) {
            freq[digit]++;
        }
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf(i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }
}
