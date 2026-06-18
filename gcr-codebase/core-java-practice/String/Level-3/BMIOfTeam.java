import java.util.Scanner;

public class BMIOfTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = scanner.nextDouble();
            data[i][1] = scanner.nextDouble();
        }
        String[][] result = buildBMIReport(data);
        System.out.println("Height Weight BMI Status");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1] + " " + result[i][2] + " " + result[i][3]);
        }
    }

    public static String[][] buildBMIReport(double[][] data) {
        String[][] report = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = heightM == 0 ? 0 : weight / (heightM * heightM);
            report[i][0] = String.valueOf((int) data[i][1]);
            report[i][1] = String.valueOf((int) data[i][0]);
            report[i][2] = String.valueOf(Math.round(bmi * 100.0) / 100.0);
            report[i][3] = status(bmi);
        }
        return report;
    }

    public static String status(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        }
        if (bmi < 25) {
            return "Normal";
        }
        if (bmi < 30) {
            return "Overweight";
        }
        return "Obese";
    }
}
