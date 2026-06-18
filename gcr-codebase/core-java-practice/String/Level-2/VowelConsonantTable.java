import java.util.Scanner;

public class VowelConsonantTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[][] table = buildCharTypeTable(text);
        System.out.println("Char Type");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " " + table[i][1]);
        }
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

    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] buildCharTypeTable(String text) {
        int n = findLength(text);
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = charType(text.charAt(i));
        }
        return result;
    }
}
