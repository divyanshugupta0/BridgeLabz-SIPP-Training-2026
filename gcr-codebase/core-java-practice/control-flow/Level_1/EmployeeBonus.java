import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int yearsOfService = sc.nextInt();
        if (yearsOfService > 5) {
            System.out.println("Bonus: " + (salary * 0.05));
        } else {
            System.out.println("No bonus");
        }
        sc.close();
    }
}
