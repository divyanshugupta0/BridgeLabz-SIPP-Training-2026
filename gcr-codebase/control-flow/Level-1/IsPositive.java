import java.util.Scanner;
public class IsPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if( n > 0){
            System.out.println("The number " + n + " is a positive number.");
        }else if(n == 0){
            System.out.println("The number " + n + " is zero.");
        }
        else{
            System.out.println("The number " + n + " is negative number.");
        }
        sc.close();
    }
}
