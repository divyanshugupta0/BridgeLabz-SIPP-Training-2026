import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FizzBuzzWhile {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
            i++;
        }

        return res;
    }
    public static void main(String[] args) {
        FizzBuzzWhile fb = new FizzBuzzWhile();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        List<String> result = fb.fizzBuzz(n);
        System.out.println(result);
    }
}