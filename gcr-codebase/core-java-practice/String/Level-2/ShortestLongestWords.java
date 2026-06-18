import java.util.Scanner;

public class ShortestLongestWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = splitText(text);
        String[][] details = wordsWithLength(words);
        int[] indexes = findShortestLongest(details);
        System.out.println("Shortest " + details[indexes[0]][0]);
        System.out.println("Longest " + details[indexes[1]][0]);
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

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] details) {
        int shortest = 0;
        int longest = 0;
        for (int i = 1; i < details.length; i++) {
            int length = Integer.parseInt(details[i][1]);
            if (length < Integer.parseInt(details[shortest][1])) {
                shortest = i;
            }
            if (length > Integer.parseInt(details[longest][1])) {
                longest = i;
            }
        }
        return new int[]{shortest, longest};
    }
}
