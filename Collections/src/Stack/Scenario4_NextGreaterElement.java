package Stack;


import java.util.Arrays;
import java.util.Stack;

public class Scenario4_NextGreaterElement {
    static int[] nextGreater(int[] a) {
        int[] ans = new int[a.length];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && a[i] > a[st.peek()]) ans[st.pop()] = a[i];
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] r = nextGreater(new int[]{4, 5, 2, 25});
        System.out.println(Arrays.toString(r));
    }
}
