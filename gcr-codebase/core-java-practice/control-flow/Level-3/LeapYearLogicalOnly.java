// determine Leap Year with single if condition using logical and && and or || operators
import java.util.Scanner;
public class LeapYearLogicalOnly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = false;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isLeap = true;
        }
        System.out.println(
            isLeap
                ? year + " is a leap year."
                : year + " is not a leap year."
        );
        sc.close();
    }
}
