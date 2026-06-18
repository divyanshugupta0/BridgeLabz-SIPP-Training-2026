import java.util.*;
class InnerArrayIndexOutOfBound extends Exception{

    public InnerArrayIndexOutOfBound(String message){
        super(message);
    }
}
public class ArrayIndexOutOfBoundDemo {
    public static void ArrayOut(int[] arr) throws InnerArrayIndexOutOfBound{
        try {
            for (int i = 0; i < arr.length + 2; i++) {
            int a = arr[i];
            }   
        } catch (Exception e) {
            throw new InnerArrayIndexOutOfBound("Index Out of Bound correct it");
        }
    }
    public void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            ArrayOut(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
