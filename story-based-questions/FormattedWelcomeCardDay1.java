// Ques:  Ravi just joined a coding guild. Store his name, age, rank, salary, and
// membership fee (float) using correct data types. Compute his
// annual bonus (12% of salary), cast it to int, and print a formatted
// welcome card.
import java.util.Scanner;
public class FormattedWelcomeCardDay1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your rank: ");
        String rank = scanner.next();
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter your membership fee: ");
        float membershipFee = scanner.nextFloat();

        double annualBonus = 0.12 * salary;
        int bonus = (int) annualBonus;

        System.out.println("Welcome to the coding guild, " + name + "!");
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: $" + salary);
        System.out.println("Membership Fee: $" + membershipFee);
        System.out.println("Annual Bonus: $" + bonus);
    }
}
