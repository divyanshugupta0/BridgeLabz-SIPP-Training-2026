public class AreaOfTriangle {
    public static void main(String[] args) {
        double baseInCm = 10.0;
        double heightInCm = 5.0;

        double areaInCm2 = 0.5 * baseInCm * heightInCm;
        double areaInInches2 = areaInCm2 / (2.54 * 2.54);

        System.out.println("The Area of the Triangle is " + String.format("%.2f", areaInCm2) + " square centimeters and " + String.format("%.2f", areaInInches2) + " square inches.");
    }
}