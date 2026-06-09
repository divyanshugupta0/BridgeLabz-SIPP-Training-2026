public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.0;
        int time = 3;
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The simple interest is: " + simpleInterest);
    }
}
