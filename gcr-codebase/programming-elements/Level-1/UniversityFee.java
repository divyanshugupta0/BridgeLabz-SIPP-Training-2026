public class UniversityFee {
    public static void main(String[] args) {
        double fee = 125000.0;
        double discountPercent = 10.0;

        double discountAmount = (discountPercent / 100) * fee;
        double discountedFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
    }
}