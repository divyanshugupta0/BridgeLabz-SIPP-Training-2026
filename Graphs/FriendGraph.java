package Graphs;

import java.util.*;

public class FriendGraph {
    private final Map<Integer, Set<Integer>> graph = new HashMap<>();

    public void addFriendship(int u, int v) {
        graph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        graph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    public boolean isFriend(int u, int v) {
        return graph.getOrDefault(u, Collections.emptySet()).contains(v);
    }
}
