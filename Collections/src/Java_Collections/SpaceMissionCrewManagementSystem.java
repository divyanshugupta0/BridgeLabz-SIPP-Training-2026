package Java_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Astronaut {
    String astronautId, name, specialization;

    Astronaut(String i, String n, String s) {
        astronautId = i;
        name = n;
        specialization = s;
    }

    public String toString() {
        return astronautId + " " + name + " " + specialization;
    }
}

public class SpaceMissionCrewManagementSystem {
    public static void main(String[] a) {
        HashMap<String, List<Astronaut>> m = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        m.put("Moon", new ArrayList<>());
        Astronaut x = new Astronaut("1", "Raj", "Pilot");
        if (set.add("Moon" + x.astronautId)) m.get("Moon").add(x);
        for (String k : m.keySet()) {
            System.out.println(k);
            for (Astronaut t : m.get(k)) System.out.println(t);
            System.out.println(m.get(k).size());
        }
    }
}