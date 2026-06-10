public class EligibiltyToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        int isEligibleToVote = (age >= 18)? 1 : 0;
        if(isEligibleToVote == 1){
            System.out.println("The person's age is " + age + " and can vote.");
        }
        else{
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        sc.close();
    }
}
