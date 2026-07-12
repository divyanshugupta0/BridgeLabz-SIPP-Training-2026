import java.util.Scanner;
public class CountDigitInIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            number = Math.abs(number);
            while (number > 0) {
                number /= 10;
                count++;
            }
        }
        System.out.println("The number of digits in " + sc.nextInt() + " is: " + count);
        sc.close();
    }
}
