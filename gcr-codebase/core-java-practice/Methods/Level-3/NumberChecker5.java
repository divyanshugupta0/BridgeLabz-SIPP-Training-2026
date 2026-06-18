import java.util.Scanner;

public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPerfect(number));
        System.out.println(isAbundant(number));
        System.out.println(isDeficient(number));
        System.out.println(isStrong(number));
    }

    public static int sumProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        if (number <= 1) {
            return false;
        }
        return sumProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return sumProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return sumProperDivisors(number) < number;
    }

    public static boolean isStrong(int number) {
        int n = Math.abs(number);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == Math.abs(number);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
