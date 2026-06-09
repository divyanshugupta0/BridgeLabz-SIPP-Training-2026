import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();//20 march to 20 june
        if(month >= 3 && month <= 6){
            if(day >= 20 && day <= 31){
                System.out.println("The date " + day + "/" + month + " is in Spring Season.");
            }
            else{
                System.out.println("The date " + day + "/" + month + " is not in Spring Season.");
            }
        }
        else{
            System.out.println("The date " + day + "/" + month + " is not in Spring Season.");
        }
    }
}
