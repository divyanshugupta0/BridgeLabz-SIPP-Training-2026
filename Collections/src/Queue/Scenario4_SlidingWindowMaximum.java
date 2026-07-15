package Queue;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Scenario4_SlidingWindowMaximum {
    static int[] maxWindow(int[] a, int k) {
        int[] ans = new int[a.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) ans[i - k + 1] = a[dq.peekFirst()];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] r = maxWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(r));
    }
}
