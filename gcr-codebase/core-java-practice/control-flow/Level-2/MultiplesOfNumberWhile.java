import java.util.Scanner;

public class MultiplesOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        System.out.println("Multiples of " + number + ":");
        int i = 100;
        while (i >= number) {
            if (i % number == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}
