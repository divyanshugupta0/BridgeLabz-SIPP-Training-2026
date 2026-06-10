import java.util.Scanner;
public class AreaOfTriangleInSquareInch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle(in cm):");
        int base = sc.nextInt();
        System.out.print("Enter the height of the triangle(in cm):");
        int height = sc.nextInt();
        double area = 0.5 * base * height;
        double areainSquareInches = area * 2.54 * 2.54 / 100;
        System.out.println("The area of the triangle in sq inches is: " + areainSquareInches +" and in sq cm is: " + area);
    }
}