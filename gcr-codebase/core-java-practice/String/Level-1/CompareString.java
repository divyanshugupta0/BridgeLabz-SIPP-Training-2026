import java.util.*;

public class CompareString {
    public static boolean charCheck(String s1, String s2) {
        boolean res = true;
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean equalsFunctionCheck(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }

    public void main() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(charCheck(s1, s2) && equalsFunctionCheck(s1, s2) ? "Strings are equal" : "Strings are identical");
    }
}
