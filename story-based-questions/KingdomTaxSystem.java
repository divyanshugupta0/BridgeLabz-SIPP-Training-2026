// Ques:  A kingdom's tax system charges 5% for income <10K, 15% for 10K–
// 50K, 30% above 50K. Read a citizen's income, print tax bracket and
// amount. Extend: loop over an array of 10 citizens and tally total tax
// collected.
import java.util.Scanner;
public class KingdomTaxSystem {
    public static int calculateTax(double income) {
        if (income < 10000) {
            return (int) (0.05 * income);
        } else if (income <= 50000) {
            return (int) (0.15 * income);
        } else {
            return (int) (0.30 * income);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] incomes = new double[10];
        double totalTax = 0;

        for (int i = 0; i < incomes.length; i++) {
            System.out.print("Enter income for citizen " + (i + 1) + ": ");
            incomes[i] = scanner.nextDouble();
        }

        for (int i = 0; i < incomes.length; i++) {
            double tax = calculateTax(incomes[i]);
            totalTax += tax;
            System.out.println("Citizen " + (i + 1) + " - Income: $" + incomes[i] + ", Tax: $" + tax);
        }
        System.out.println("Total tax collected: $" + totalTax);
    }
}