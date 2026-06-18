import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char result = firstNonRepeating(text);
        System.out.println(result == 0 ? "No non repeating character" : result);
    }

    public static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        int n = text.length();
        for (int i = 0; i < n; i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return 0;
    }
}
