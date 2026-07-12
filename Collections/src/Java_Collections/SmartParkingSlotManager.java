package Java_Collections;

import java.util.ArrayList;

public class SmartParkingSlotManager {
    public static void main(String[] a) {
        ArrayList<String> v = new ArrayList<>();
        v.add("UP81A");
        v.add("DL01B");
        v.remove("DL01B");
        System.out.println(v.contains("UP81A"));
        for (String s : v) System.out.println(s);
        System.out.println(v.size());
    }
}