import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.4) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You are normal weight.");
        } else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        sc.close();
    }
}
