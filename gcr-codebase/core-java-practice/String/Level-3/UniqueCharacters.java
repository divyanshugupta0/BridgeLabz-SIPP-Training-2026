import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] unique = uniqueCharacters(text);
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i]);
            if (i < unique.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static char[] uniqueCharacters(String text) {
        int n = findLength(text);
        char[] unique = new char[n];
        int uniqueCount = 0;
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
                unique[uniqueCount++] = c;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }
}
