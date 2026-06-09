import java.util.Scanner;
public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first double: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second double: ");
        double b = sc.nextDouble();
        System.out.print("Enter the third double: ");
        double c = sc.nextDouble();
        double eq1 = a + b * c;
        double eq2 = a * b + c;
        double eq3 = c + a / b;
        double eq4 = a % b + c;
        System.out.println("The results of Double Operations are " + eq1 + ", " + eq2 + ", " + eq3 + ", and " + eq4);
        sc.close();
    }
}
