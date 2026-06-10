import java.util.Scanner;
public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
    public static void main(String[] args) {
        NumberOfStepsToReduceANumberToZero solution = new NumberOfStepsToReduceANumberToZero();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = solution.numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + result);
    }
}
