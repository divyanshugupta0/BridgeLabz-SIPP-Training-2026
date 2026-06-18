import java.util.Scanner;

public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPrime(number));
        System.out.println(isNeon(number));
        System.out.println(isSpy(number));
        System.out.println(isAutomorphic(number));
        System.out.println(isBuzz(number));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int product = 1;
        int sum = 0;
        int n = Math.abs(number);
        if (n == 0) {
            product = 0;
        }
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product == sum;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String s1 = String.valueOf(square);
        String s2 = String.valueOf(number);
        return s1.endsWith(s2);
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || Math.abs(number) % 10 == 7;
    }
}
