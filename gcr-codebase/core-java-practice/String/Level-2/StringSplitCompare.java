import java.util.Arrays;
import java.util.Scanner;

public class StringSplitCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] customWords = splitText(text);
        String[] builtInWords = text.split(" ");
        System.out.println(Arrays.toString(customWords));
        System.out.println(Arrays.toString(builtInWords));
        System.out.println(compareArrays(customWords, builtInWords));
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

    public static String[] splitText(String text) {
        int n = findLength(text);
        int wordCount = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) != ' ' && (i == 0 || text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int index = 0;
        int start = 0;
        while (start < n && text.charAt(start) == ' ') {
            start++;
        }
        for (int i = start; i < n; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = substring(text, start, i);
                while (i < n && text.charAt(i) == ' ') {
                    i++;
                }
                start = i;
                i--;
            }
        }
        if (start < n) {
            words[index] = substring(text, start, n);
        }
        return words;
    }

    public static String substring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }
}
