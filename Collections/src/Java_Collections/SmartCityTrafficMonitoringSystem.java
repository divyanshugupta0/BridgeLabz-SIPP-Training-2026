package Java_Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class SmartCityTrafficMonitoringSystem {
    public static void main(String[] a) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("A Road", 120);
        h.put("B Road", 250);
        h.put("C Road", 180);
        TreeMap<String, Integer> t = new TreeMap<>(h);
        String busy = "";
        int max = 0;
        for (String k : t.keySet()) {
            System.out.println(k + " " + t.get(k));
            if (t.get(k) > max) {
                max = t.get(k);
                busy = k;
            }
        }
        System.out.println("Busiest: " + busy);
        System.out.println("Roads: " + t.size());
    }
}