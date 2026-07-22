package Graphs;

import java.util.*;

public class DirectedCycleDetection {
    public boolean hasCircularDependency(Map<Integer,List<Integer>> graph,int n){
        int[] state=new int[n];
        for(int i=0;i<n;i++){
            if(state[i]==0 && dfs(graph,i,state)) return true;
        }
        return false;
    }
    private boolean dfs(Map<Integer,List<Integer>> graph,int node,int[] state){
        state[node]=1;
        for(int next:graph.getOrDefault(node,Collections.emptyList())){
            if(state[next]==1) return true;
            if(state[next]==0 && dfs(graph,next,state)) return true;
        }
        state[node]=2;
        return false;
    }
}
