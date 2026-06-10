import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter the third integer: ");
        int c = sc.nextInt();
        int eq1 = a + b *c;
        int eq2 = a * b + c;
        int eq3 = c + a / b;
        int eq4 = a % b + c;
        System.out.println("The results of Int Operations are " + eq1 + ", " + eq2 + ", " + eq3 + ", and " + eq4);
        sc.close();
    }
}
