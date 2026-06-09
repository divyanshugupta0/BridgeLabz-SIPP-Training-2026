import java.util.Scanner;
public class SumOfNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = num * (num + 1) / 2;
        int sumWhile = 0;
        while(num > 0){
            sumWhile += num;
            num--;
        }
        System.out.println("Sum using formula: " + sum);
        System.out.println("Sum using while loop: " + sumWhile);
        sc.close();
    }
}
