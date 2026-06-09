import java.util.Scanner;
public class FactorialOfNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        while(num > 0){
            factorial *= num;
            num--;
        }
        System.out.println(factorial);
        sc.close();
    }
}
