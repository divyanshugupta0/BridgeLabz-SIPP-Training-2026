import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FizzBuzzFor {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }

        return res;
    }
    public static void main(String[] args) {
        FizzBuzzFor fb = new FizzBuzzFor();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        List<String> result = fb.fizzBuzz(n);
        System.out.println(result);
    }
}