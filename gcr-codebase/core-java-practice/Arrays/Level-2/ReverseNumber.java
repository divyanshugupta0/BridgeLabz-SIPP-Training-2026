import java.util.Scanner;

public class ReverseNumber {
    public int countNums(long number){
        int count = 0;
        while(number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
    public void main(){
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int len = countNums(number);
        int[] nums = new int[len];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) (number % 10);
            number /= 10;
        }
        for(int i = 0; i < nums.length;  i++){
            System.out.print(nums[i]);
        }
        sc.close();
    }
}