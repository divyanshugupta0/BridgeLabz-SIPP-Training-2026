import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            physics[i] = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("\nStudent Report");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-12s %-8s%n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-12.2f %-8c%n",
                    physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }

        sc.close();
    }
}