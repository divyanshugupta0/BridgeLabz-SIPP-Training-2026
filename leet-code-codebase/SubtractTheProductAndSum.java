public class SubtractTheProductAndSum {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        int length = String.valueOf(n).length();
        for(int i = 0; n >0 ; i++){
            int lastnum = n % 10;
            sum += lastnum;
            prod *= lastnum;
            n /= 10;
        }
        return prod - sum;
    }

    public static void main(String[] args) {
        SubtractTheProductAndSum solution = new SubtractTheProductAndSum();
        int number = 234;
        int result = solution.subtractProductAndSum(number);
        System.out.println("The result of subtracting the product and sum of digits in " + number + " is: " + result);
    }
}
