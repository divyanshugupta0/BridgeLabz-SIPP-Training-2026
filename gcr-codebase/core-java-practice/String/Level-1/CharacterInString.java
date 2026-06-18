import java.util.*;

public class CharacterInString {
    public static char[] charArray(String str){
        char [] st = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            st[i] = str.charAt(i);
        }
        return st;
    }
    public void main(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char [] st = charArray(str);
        char [] charSt = str.toCharArray();
        if(st.length == charSt.length){
            System.out.println("Array of String is : "+ Arrays.toString(charSt));
        }else{
            System.out.println("Something went wrong");
        }
    }   
}