package Java_Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class SmartClassroomAttendanceTracker {
    public static void main(String[] a) {
        HashMap<String, ArrayList<String>> m = new HashMap<>();
        m.put("Java", new ArrayList<>());
        if (!m.get("Java").contains("Riya")) m.get("Java").add("Riya");
        if (!m.get("Java").contains("Riya")) m.get("Java").add("Riya");
        for (String k : m.keySet()) System.out.println(k + " " + m.get(k) + " " + m.get(k).size());
    }
}