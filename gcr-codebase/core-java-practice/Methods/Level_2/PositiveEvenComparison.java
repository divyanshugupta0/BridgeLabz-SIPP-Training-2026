import java.util.Scanner;

public class PositiveEvenComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            if (isPositive(number)) {
                if (isEven(number)) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparison > 0) {
            System.out.println("First is greater");
        } else if (comparison < 0) {
            System.out.println("First is less");
        } else {
            System.out.println("Equal");
        }
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        }
        if (number1 < number2) {
            return -1;
        }
        return 0;
    }
}
