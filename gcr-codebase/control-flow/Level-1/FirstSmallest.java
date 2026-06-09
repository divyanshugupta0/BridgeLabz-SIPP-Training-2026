public class FirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Number 3: ");
        int num3 = sc.nextInt();
        boolean isSmallest = true;
        if(num1 < num2 && num1 < num3){
            isSmallest = true;
        }
        else{
            isSmallest = false;
        }
        System.out.println("Is the first number the smallest? " + isSmallest);
        sc.close();
    }
}
