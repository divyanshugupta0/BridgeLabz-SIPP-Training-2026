import java.util.Scanner;
public class FirstAndSecondLargestSizeIncrement {
    public static void copyEle(int[] arr, int[] temp ){
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
    }
    public void main(){
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int maxDigit = 10;
        int [] digits = new int[maxDigit];

        int index = 0;
        while(number != 0){
            if(index == maxDigit){
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                copyEle(digits,temp);
                digits = temp;
            }
            digits[index++] = (int) (number % 10);
            number /= 10;
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.print("Digits stored in array: ");
        for (int i = 0; i < maxDigit; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        sc.close();

    }
}
