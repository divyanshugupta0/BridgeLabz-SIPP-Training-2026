public class DistanceInYardsToMiles {
    public static void main(String[] args) {
        double distanceInFeet = 5280.0;

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in feet is " + distanceInFeet + " while in yards is " + String.format("%.2f", distanceInYards) + " and miles is " + String.format("%.2f", distanceInMiles));
    }
}