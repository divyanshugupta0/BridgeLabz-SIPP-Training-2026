package Queue;


import java.util.PriorityQueue;

public class Scenario3_HospitalTriage {
    static class Patient {
        int priority;
        String name;

        Patient(int p, String n) {
            priority = p;
            name = n;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> a.priority - b.priority);
        pq.offer(new Patient(3, "A"));
        pq.offer(new Patient(1, "B"));
        pq.offer(new Patient(2, "C"));
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " " + p.priority);
        }
    }
}
