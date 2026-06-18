import java.util.Scanner;

public class VotingAgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = generateRandomAges(10);
        String[][] table = prepareVotingTable(ages);
        System.out.println("Age CanVote");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " " + table[i][1]);
        }
    }

    public static int findLength(int[] arr) {
        int count = 0;
        try {
            while (true) {
                int dummy = arr[count];
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    public static String[][] prepareVotingTable(int[] ages) {
        int n = findLength(ages);
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = String.valueOf(ages[i]);
            boolean canVote = ages[i] >= 18;
            result[i][1] = String.valueOf(canVote);
        }
        return result;
    }
}
