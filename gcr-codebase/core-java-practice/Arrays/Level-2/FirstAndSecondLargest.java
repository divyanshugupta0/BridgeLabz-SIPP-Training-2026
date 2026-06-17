import java.util.Scanner;
public class FirstAndSecondLargest {
    public void main(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxDigit = 10;
        int [] digits = new int[maxDigit];
        int index = 0;
        while(number != 0){
            digits[index++] = number % 10;
            number = number / 10;

            if(index == maxDigit){
                break;
            }
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
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        sc.close();

    }
}