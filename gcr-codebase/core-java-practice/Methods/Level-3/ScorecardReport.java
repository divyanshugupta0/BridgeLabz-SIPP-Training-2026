import java.util.Random;

public class ScorecardReport {
    public static void main(String[] args) {
        int students = 5;
        int[][] scores = generateScores(students);
        String[][] report = calculateResults(scores);
        for (int i = 0; i < report.length; i++) {
            System.out.println(report[i][0] + "\t" + report[i][1] + "\t" + report[i][2] + "\t" + report[i][3] + "\t" + report[i][4]);
        }
    }

    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        Random random = new Random();
        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + random.nextInt(90);
            scores[i][1] = 10 + random.nextInt(90);
            scores[i][2] = 10 + random.nextInt(90);
        }
        return scores;
    }

    public static String[][] calculateResults(int[][] scores) {
        String[][] report = new String[scores.length][5];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0 * 100.0) * 100.0) / 100.0;
            report[i][0] = scores[i][0] + "," + scores[i][1] + "," + scores[i][2];
            report[i][1] = String.valueOf(total);
            report[i][2] = String.valueOf(average);
            report[i][3] = String.valueOf(percentage);
            report[i][4] = String.valueOf(percentage);
        }
        return report;
    }
}
