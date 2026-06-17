import java.util.Scanner;
public class CanVote{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of Students: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the age of Students: ");
        for(int i = 0; i < n; i++){
            System.out.print("Enter age of student- " + (i + 1)+": ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println((arr[i] >= 18) ? ("Student of age " + arr[i] + " can vote") : ("Student of age " + arr[i] + " cannot vote"));
        }
    }
}