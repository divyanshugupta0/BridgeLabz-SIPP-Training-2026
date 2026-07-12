import java.util.Scanner;

public class RecursiveNaturalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Invalid input");
            return;
        }
        int recursiveSum = sumNaturalNumbersRecursive(n);
        int formulaSum = sumNaturalNumbersFormula(n);
        System.out.println(recursiveSum);
        System.out.println(formulaSum);
        System.out.println(recursiveSum == formulaSum);
    }

    public static int sumNaturalNumbersRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNaturalNumbersRecursive(n - 1);
    }

    public static int sumNaturalNumbersFormula(int n) {
        return n * (n + 1) / 2;
    }
}
