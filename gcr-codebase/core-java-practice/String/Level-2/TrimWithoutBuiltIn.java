import java.util.Scanner;

public class TrimWithoutBuiltIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int[] indices = trimIndices(text);
        String trimmed = substring(text, indices[0], indices[1]);
        String builtIn = text.trim();
        System.out.println(trimmed);
        System.out.println(builtIn);
        System.out.println(compareStrings(trimmed, builtIn));
    }

    public static int[] trimIndices(String s) {
        int n = findLength(s);
        int start = 0;
        int end = n;
        while (start < n && s.charAt(start) == ' ') {
            start++;
        }
        while (end > start && s.charAt(end - 1) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String substring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        int n = findLength(a);
        if (n != findLength(b)) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
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
