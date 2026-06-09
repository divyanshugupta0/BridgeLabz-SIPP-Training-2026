public class HeightConvertIntoFeet {
    public static void main(String[] args) {
        double heightInCm = 170.0;

        double heightInInches = heightInCm / 2.54;
        double heightInFeet = heightInInches / 12;

        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + String.format("%.2f", heightInFeet) + " and inches is " + String.format("%.2f", heightInInches));
    }
}