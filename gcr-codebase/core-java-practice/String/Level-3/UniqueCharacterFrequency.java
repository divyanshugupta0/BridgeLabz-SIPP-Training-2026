import java.util.Scanner;

public class UniqueCharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[][] result = frequencyUsingUnique(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }

    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] unique = new char[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                unique[count++] = c;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static String[][] frequencyUsingUnique(String text) {
        int[] freq = new int[256];
        int n = text.length();
        for (int i = 0; i < n; i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }
}
