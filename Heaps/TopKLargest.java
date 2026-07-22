package Heaps;

import java.util.*;

public class TopKLargest {

    public List<Integer> topKLargest(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int x : arr) {
            if (heap.size() < k) {
                heap.offer(x);
            } else if (x > heap.peek()) {
                heap.poll();
                heap.offer(x);
            }
        }

        return new ArrayList<>(heap);
    }
}
