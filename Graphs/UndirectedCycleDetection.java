package Graphs;

import java.util.*;

public class UndirectedCycleDetection {
    public boolean hasWiringLoop(Map<Integer,List<Integer>> graph,int n){
        Set<Integer> vis=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!vis.contains(i) && dfs(graph,i,-1,vis)) return true;
        }
        return false;
    }
    private boolean dfs(Map<Integer,List<Integer>> graph,int node,int parent,Set<Integer> vis){
        vis.add(node);
        for(int next:graph.getOrDefault(node,Collections.emptyList())){
            if(!vis.contains(next)){
                if(dfs(graph,next,node,vis)) return true;
            }else if(next!=parent){
                return true;
            }
        }
        return false;
    }
}
