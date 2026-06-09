import java.util.Scanner;
public class UnitPrice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price: ");
        int unitPrice = sc.nextInt();
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();
        int totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and the unit price is INR " + unitPrice);
        sc.close();
    }
}
