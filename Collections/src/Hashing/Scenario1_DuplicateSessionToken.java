package Hashing;


import java.util.HashSet;

public class Scenario1_DuplicateSessionToken {
    static boolean hasDuplicateToken(String[] tokens) {
        HashSet<String> set = new HashSet<>();
        for (String t : tokens) if (!set.add(t)) return true;
        return false;
    }

    public static void main(String[] args) {
        String[] tokens = {"A1", "B2", "C3", "A1"};
        System.out.println(hasDuplicateToken(tokens));
    }
}
