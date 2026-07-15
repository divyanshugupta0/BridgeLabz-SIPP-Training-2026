package Queue;


import java.util.ArrayDeque;
import java.util.Deque;

public class Scenario2_PrintQueueDeque {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.addLast(101);
        q.addLast(102);
        q.addFirst(999);
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
    }
}
