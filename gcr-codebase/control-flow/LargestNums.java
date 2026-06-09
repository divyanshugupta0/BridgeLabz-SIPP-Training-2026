public class LargestNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Number 3: ");
        int num3 = sc.nextInt();
        boolean isLargest1 = true;
        boolean isLargest2 = true;
        boolean isLargest3 = true;
        if(num1 > num2){
            isLargest1 = true;
            isLargest2 = false;
            isLargest3 = false;
        }
        else if(num1 < num2){
            isLargest1 = false;
            isLargest2 = true;
            isLargest3 = false;
        }
        else{
            isLargest1 = false;
            isLargest2 = false;
            isLargest3 = true;
        }
        System.out.println("Is the first number the largest? " + isLargest1);
        System.out.println("Is the second number the largest? " + isLargest2);
        System.out.println("Is the third number the largest? " + isLargest3);
        sc.close();
    }
}
