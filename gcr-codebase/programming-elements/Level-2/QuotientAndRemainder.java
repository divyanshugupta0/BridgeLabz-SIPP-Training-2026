import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter the first number: ");   
        number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        number2 = sc.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The quotient is " + quotient + " and the remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
        sc.close();
    }
}
