void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("Enter the unit price: ");
    int unitPrice = sc.nextInt();
    IO.print("Enter the quantity: ");
    int quantity = sc.nextInt();
    int totalPrice = unitPrice * quantity;
    IO.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and the unit price is INR " + unitPrice);
    sc.close();
}
