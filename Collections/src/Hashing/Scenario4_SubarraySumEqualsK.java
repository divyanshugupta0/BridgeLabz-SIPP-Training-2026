package Hashing;


import java.util.HashMap;

public class Scenario4_SubarraySumEqualsK {
    static int count(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, ans = 0;
        for (int x : a) {
            sum += x;
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 2, 3, -3, 3}, 3));
    }
}
