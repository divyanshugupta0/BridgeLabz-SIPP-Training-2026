import java.util.Scanner;

public class SubStringCrossValidation {
    public static String charSubString(String s,int start, int end){
        StringBuilder sb = new StringBuilder();
        if(s.length() < end ){
            return s;
        }
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public void main(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = 0;
        int end = 3;
        String res = charSubString(s, start, end);
        String reString = s.substring(start, end);
        if(res.equals(reString)){
            System.out.println("Substring is : "+ res);
            return;
        }
        System.out.println(res);
        System.out.println(reString);
        System.out.println("Result of methods not Match substring is : " + reString);
    }
    
}
