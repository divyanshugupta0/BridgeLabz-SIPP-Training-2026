import java.util.Scanner;

public class NumberChecker1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = digitCount(number);
        int[] digits = digitsArray(number);
        System.out.println(count);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(isDuckNumber(digits));
        System.out.println(isArmstrong(number, digits));
        int[] largest = largestAndSecondLargest(digits);
        int[] smallest = smallestAndSecondSmallest(digits);
        System.out.println(largest[0] + " " + largest[1]);
        System.out.println(smallest[0] + " " + smallest[1]);
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

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == Math.abs(number);
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;
            }
        }
        return new int[]{largest, second};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                second = smallest;
                smallest = digit;
            } else if (digit < second && digit != smallest) {
                second = digit;
            }
        }
        return new int[]{smallest, second};
    }
}
