import java.util.Scanner;

public class SumUntilZeroOrNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while (true) {
            double enter = sc.nextDouble();
            if (enter == 0 || enter < 0) {
                break;
            }
            sum += enter;
        }
        System.out.println(sum);
        sc.close();
    }
}
