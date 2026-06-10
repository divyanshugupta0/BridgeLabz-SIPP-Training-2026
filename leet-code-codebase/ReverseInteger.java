import java.util.Scanner;
public class ReverseInteger {
    public int reverse(int x) {
        int res = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (res > Integer.MAX_VALUE / 10 ||
                (res == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            if (res < Integer.MIN_VALUE / 10 ||
                (res == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            res = res * 10 + digit;
        }

        return res;
    }
    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        int result = ri.reverse(x);
        System.out.println("Reversed integer: " + result);
    }
}
