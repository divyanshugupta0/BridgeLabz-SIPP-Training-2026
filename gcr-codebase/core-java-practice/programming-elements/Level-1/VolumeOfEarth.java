public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double pi = Math.PI;

        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " + String.format("%.2f", volumeKm3) +
                " and cubic miles is " + String.format("%.2f", volumeMiles3));
    }
}