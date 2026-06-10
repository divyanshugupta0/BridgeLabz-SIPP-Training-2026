import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int physicsMarks = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistryMarks = sc.nextInt();
        System.out.print("Enter Mathematics marks: ");
        int mathematicsMarks = sc.nextInt();
        int totalMarks = physicsMarks + chemistryMarks + mathematicsMarks;
        double percentage = (totalMarks / 300.0) * 100;
        int averageMarks = totalMarks / 3;
        if (percentage >= 80) {
            System.out.println("Grade A" + "Level 4, above agency-normalized standard" + " Average Marks: " + averageMarks);
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Grade B" + "Level 3, at agency-normalized standard" + " Average Marks: " + averageMarks);
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Grade C" + "Level 2, below but approaching agency-normalized standard" + " Average Marks: " + averageMarks);
        } else if(percentage >= 50 && percentage < 60) {
            System.out.println("Grade D" + "Level 1, well below agency-normalized standard" + " Average Marks: " + averageMarks);

        }else if (percentage >= 40 && percentage < 50) {
            System.out.println("Grade D" + "Level 1, too below agency-normalized standard" + " Average Marks: " + averageMarks);
        } else {
            System.out.println("Grade E" + "Remedial standards" + " Average Marks: " + averageMarks);
        }
        sc.close();
    }
}
