package Java_Collections;

import java.util.HashSet;

public class EventEntryVerificationSystem {
    public static void main(String[] a) {
        HashSet<String> s = new HashSet<>();
        s.add("a@g");
        s.add("b@g");
        s.add("a@g");
        for (String x : s) System.out.println(x);
        System.out.println(s.size());
    }
}