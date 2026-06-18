import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[][] result = frequencyTable(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }

    public static String[][] frequencyTable(String text) {
        int[] freq = new int[256];
        int n = text.length();
        for (int i = 0; i < n; i++) {
            freq[text.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (freq[text.charAt(i)] > 0) {
                count++;
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int code = text.charAt(i);
            if (freq[code] < 0) {
                result[index][0] = String.valueOf((char) code);
                result[index][1] = String.valueOf(-freq[code]);
                index++;
                freq[code] = 0;
            }
        }
        return result;
    }
}
