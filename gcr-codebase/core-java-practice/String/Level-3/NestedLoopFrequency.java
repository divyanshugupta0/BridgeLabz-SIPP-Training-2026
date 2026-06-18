import java.util.Scanner;

public class NestedLoopFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] result = frequencyUsingNestedLoops(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static String[] frequencyUsingNestedLoops(String text) {
        char[] arr = text.toCharArray();
        int n = arr.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                continue;
            }
            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = 0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i] + " " + freq[i];
            }
        }
        return result;
    }
}
