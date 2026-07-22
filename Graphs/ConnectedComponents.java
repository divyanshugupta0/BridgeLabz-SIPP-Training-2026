package Graphs;

import java.util.*;

public class ConnectedComponents {
    public int countNetworkSegments(Map<Integer,List<Integer>> graph,int n){
        Set<Integer> vis=new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(!vis.contains(i)){
                count++;
                dfs(graph,i,vis);
            }
        }
        return count;
    }
    private void dfs(Map<Integer,List<Integer>> graph,int node,Set<Integer> vis){
        vis.add(node);
        for(int next:graph.getOrDefault(node,Collections.emptyList())){
            if(!vis.contains(next)) dfs(graph,next,vis);
        }
    }
}
