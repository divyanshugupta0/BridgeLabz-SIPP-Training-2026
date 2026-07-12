import java.util.Scanner;
public class NaturalAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        if(n > 0){
            System.out.println("The Sum of " + n + " natural numbers is: " + sum);
        }
        else{
            System.out.println("The Number " + n + " is not a natural number.");
        }
        sc.close();
    }
}
