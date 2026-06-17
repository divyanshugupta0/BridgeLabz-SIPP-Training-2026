import java.util.Scanner;
public class FactorOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxFactors = 10;
        int[] factors = new int[maxFactors];
        int factorIndex = 0;
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[factorIndex++] = i;
            }
        }
        for (int i = 0; i < factorIndex; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}