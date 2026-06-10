import java.util.Scanner;
public class UniversityFeeDiscont {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student fee: ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the university discount percent: ");
        double discountPercent = scanner.nextDouble();

        double discountAmount = (discountPercent / 100) * fee;
        double discountedFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
    }
}