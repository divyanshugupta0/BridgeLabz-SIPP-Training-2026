package Heaps;

import java.util.*;

public class MergeKSortedLogs {

    static class LogEntry {
        int timestamp;

        LogEntry(int timestamp) {
            this.timestamp = timestamp;
        }
    }

    public List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(
                (a, b) -> sources.get(a[0]).get(a[1]).timestamp - sources.get(b[0]).get(b[1]).timestamp
        );

        for (int i = 0; i < sources.size(); i++) {
            if (!sources.get(i).isEmpty()) {
                heap.offer(new int[]{i, 0});
            }
        }

        List<LogEntry> result = new ArrayList<>();

        while (!heap.isEmpty()) {
            int[] cur = heap.poll();
            int s = cur[0];
            int idx = cur[1];

            result.add(sources.get(s).get(idx));

            if (idx + 1 < sources.get(s).size()) {
                heap.offer(new int[]{s, idx + 1});
            }
        }

        return result;
    }
}
