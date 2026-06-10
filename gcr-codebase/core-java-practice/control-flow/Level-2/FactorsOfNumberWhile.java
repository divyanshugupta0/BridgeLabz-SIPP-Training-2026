public class FactorsOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Factors of " + number + " are: ");
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
