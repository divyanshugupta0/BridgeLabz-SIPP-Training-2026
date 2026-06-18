import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int[] result = countVowelsAndConsonants(text);
        System.out.println("Vowels " + result[0]);
        System.out.println("Consonants " + result[1]);
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

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        int n = findLength(text);
        for (int i = 0; i < n; i++) {
            String type = charType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
}
