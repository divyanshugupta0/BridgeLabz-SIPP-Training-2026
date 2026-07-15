package Hashing;


import java.util.HashSet;

public class Scenario6_LongestConsecutiveRun {
    static int longest(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : a) set.add(x);
        int ans = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int cur = x, len = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    len++;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longest(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
