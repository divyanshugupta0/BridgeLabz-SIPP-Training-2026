import java.util.Scanner;

public class ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chocolates = scanner.nextInt();
        int children = scanner.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}
