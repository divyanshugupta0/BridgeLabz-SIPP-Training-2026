import java.util.Scanner;

public class BMIForTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            data[i][0] = scanner.nextDouble();
            data[i][1] = scanner.nextDouble();
        }
        calculateBMI(data);
        String[] status = bmiStatus(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println((int) data[i][1] + " " + (int) data[i][0] + " " + data[i][2] + " " + status[i]);
        }
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;
            data[i][2] = heightM == 0 ? 0 : weight / (heightM * heightM);
        }
    }

    public static String[] bmiStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            status[i] = statusForBMI(data[i][2]);
        }
        return status;
    }

    public static String statusForBMI(double bmi) {
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
