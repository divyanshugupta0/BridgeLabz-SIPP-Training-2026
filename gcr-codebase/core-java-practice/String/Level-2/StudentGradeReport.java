import java.util.Scanner;

public class StudentGradeReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int[][] scores = generateScores(students);
        String[][] report = buildReport(scores);
        System.out.println("Physics Chemistry Maths Total Average Percentage Grade");
        for (int i = 0; i < report.length; i++) {
            for (int j = 0; j < report[i].length; j++) {
                System.out.print(report[i][j]);
                if (j < report[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 100);
            scores[i][1] = (int) (Math.random() * 100);
            scores[i][2] = (int) (Math.random() * 100);
        }
        return scores;
    }

    public static String[][] buildReport(int[][] scores) {
        String[][] report = new String[scores.length][6];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            report[i][0] = String.valueOf(scores[i][0]);
            report[i][1] = String.valueOf(scores[i][1]);
            report[i][2] = String.valueOf(scores[i][2]);
            report[i][3] = String.valueOf(total);
            report[i][4] = String.valueOf(Math.round(average * 100.0) / 100.0);
            report[i][5] = grade(percentage);
        }
        return report;
    }

    public static String grade(double percentage) {
        if (percentage >= 90) {
            return "A";
        }
        if (percentage >= 80) {
            return "B";
        }
        if (percentage >= 70) {
            return "C";
        }
        if (percentage >= 60) {
            return "D";
        }
        return "F";
    }
}
