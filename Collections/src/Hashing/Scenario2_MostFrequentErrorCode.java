package Hashing;


import java.util.HashMap;

public class Scenario2_MostFrequentErrorCode {
    static int mostFrequent(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = a[0], best = 0;
        for (int x : a) {
            int c = map.getOrDefault(x, 0) + 1;
            map.put(x, c);
            if (c > best) {
                best = c;
                ans = x;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent(new int[]{404, 500, 404, 200, 404, 500}));
    }
}
