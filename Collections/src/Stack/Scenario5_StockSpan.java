package Stack;


import java.util.Arrays;
import java.util.Stack;

public class Scenario5_StockSpan {
    static int[] stockSpan(int[] a) {
        int[] span = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && a[st.peek()] <= a[i]) st.pop();
            span[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] s = stockSpan(new int[]{100, 80, 60, 70, 60, 75, 85});
        System.out.println(Arrays.toString(s));
    }
}
