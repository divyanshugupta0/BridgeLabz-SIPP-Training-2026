import java.util.Scanner;
public class MeanHeight{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 11;
        double[] heights = new double[n];
        System.out.println("Enter the heights of " + n + " people:");
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextDouble();
        }
        double meanHeight = calculateMeanHeight(heights);
        System.out.println("Mean Height: " + meanHeight);
    }

    public static double calculateMeanHeight(double[] heights) {
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        return (double) sum / heights.length;
    }
}