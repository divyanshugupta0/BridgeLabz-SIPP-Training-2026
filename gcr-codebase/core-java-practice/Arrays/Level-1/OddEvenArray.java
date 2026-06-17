import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] oddArr = new int[size / 2 + 1];
        int[] evenArr = new int[size / 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex++] = arr[i];
            } else {
                oddArr[oddIndex++] = arr[i];
            }
        }
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArr[i] + " ");
        }   

    }
}
