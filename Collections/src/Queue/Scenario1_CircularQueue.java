package Queue;


public class Scenario1_CircularQueue {
    static class PacketBuffer {
        int[] data;
        int front, count;

        PacketBuffer(int c) {
            data = new int[c];
        }

        boolean enqueue(int x) {
            if (count == data.length) return false;
            data[(front + count) % data.length] = x;
            count++;
            return true;
        }

        int dequeue() {
            if (count == 0) throw new RuntimeException("Empty");
            int v = data[front];
            front = (front + 1) % data.length;
            count--;
            return v;
        }
    }

    public static void main(String[] args) {
        PacketBuffer q = new PacketBuffer(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        q.enqueue(40);
        System.out.println(q.dequeue());
    }
}
