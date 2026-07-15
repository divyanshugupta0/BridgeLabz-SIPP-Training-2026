package Hashing;


import java.util.Arrays;
import java.util.HashMap;

public class Scenario3_FraudPairDetection {
    static int[] twoSum(int[] a, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int c = target - a[i];
            if (map.containsKey(c)) return new int[]{map.get(c), i};
            map.put(a[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
