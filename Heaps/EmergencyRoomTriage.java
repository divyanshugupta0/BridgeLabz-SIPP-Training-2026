package Heaps;

import java.util.PriorityQueue;

public class EmergencyRoomTriage {

    static class Patient {
        int severity;

        Patient(int severity) {
            this.severity = severity;
        }
    }

    private final PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public void addPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    public Patient treatNext() {
        return triageQueue.poll();
    }
}
