import java.util.Scanner;
public class SumOfNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = num * (num + 1) / 2;
        int sumFor = 0;
        for (int i = 1; i <= num; i++) {
            sumFor += i;
        }
        System.out.println("Sum using formula: " + sum);
        System.out.println("Sum using for loop: " + sumFor);
        sc.close();
    }
}
