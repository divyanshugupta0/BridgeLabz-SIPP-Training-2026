
import java.util.Scanner;

public class IsPositiveOrIsNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if(num > 0){
                if(num % 2 == 0){
                    System.out.println(num + " is positive and even");
                }else{
                    System.out.println(num + " is positive and odd");
                }
            }else if(num < 0){
                System.out.println(num + " is negative");
            }else{
                System.out.println(num + " is neither positive nor negative its ZERO");
            }
        }
        if(arr[0] == arr[arr.length-1]){
            System.out.println("First and last values are equal");
        }else{
            System.err.println("First and last values are not equal");
        }
    }
}
