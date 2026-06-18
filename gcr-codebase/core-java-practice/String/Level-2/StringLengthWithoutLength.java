import java.util.Scanner;

public class StringLengthWithoutLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int customLength = findLength(input);
        System.out.println(customLength);
        System.out.println(input.length());
    }

    public static int findLength(String s) {
        int count = 0;
        while (true) {
            try {
                s.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
}
