import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        System.out.println(isSpringSeason(month, day) ? "Its a Spring Season" : "Not a Spring Season");
    }

    public static boolean isSpringSeason(int month, int day) {
        if (month == 3) {
            return day >= 20 && day <= 31;
        }
        if (month > 3 && month < 6) {
            return true;
        }
        if (month == 6) {
            return day <= 20 && day >= 1;
        }
        return false;
    }
}
