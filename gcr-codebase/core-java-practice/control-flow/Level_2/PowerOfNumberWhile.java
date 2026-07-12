import java.util.Scanner;
public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        if (power < 0 || number < 0) {
            System.out.println("Please enter a non-negative integer for power.");
            return;
        }
        if (number == 0 && power == 0) {
            System.out.println("0 to the power of 0 is undefined.");
            return;
        }
        int i = 1;
        while(i < power) {
            number *= number;
            i++;
        }
        System.out.println("The result is: " + number);
    }
}
