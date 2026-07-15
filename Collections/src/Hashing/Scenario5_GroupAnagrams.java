package Hashing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Scenario5_GroupAnagrams {
    static List<List<String>> group(String[] s) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : s) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(group(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
