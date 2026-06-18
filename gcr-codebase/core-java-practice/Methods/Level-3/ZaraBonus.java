import java.util.Random;

public class ZaraBonus {
    public static void main(String[] args) {
        double[][] employees = new double[10][2];
        fillEmployeeData(employees);
        double[][] updated = calculateBonuses(employees);
        double oldSum = 0;
        double newSum = 0;
        double bonusSum = 0;
        for (int i = 0; i < employees.length; i++) {
            oldSum += employees[i][0];
            newSum += updated[i][0];
            bonusSum += updated[i][1];
        }
        System.out.println(oldSum + " " + newSum + " " + bonusSum);
    }

    public static void fillEmployeeData(double[][] employees) {
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            employees[i][0] = 10000 + random.nextInt(90000);
            employees[i][1] = random.nextInt(11);
        }
    }

    public static double[][] calculateBonuses(double[][] employees) {
        double[][] result = new double[employees.length][2];
        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i][0];
            int years = (int) employees[i][1];
            double bonus = salary * (years > 5 ? 0.05 : 0.02);
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }
}
