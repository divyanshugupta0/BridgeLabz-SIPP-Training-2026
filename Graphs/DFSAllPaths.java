package Graphs;

import java.util.*;

public class DFSAllPaths {
    public void allRoutes(Map<Integer,List<Integer>> roads,int current,int target,List<Integer> path,Set<Integer> visited,List<List<Integer>> ans){
        path.add(current);
        visited.add(current);
        if(current==target){
            ans.add(new ArrayList<>(path));
        }else{
            for(int next:roads.getOrDefault(current,Collections.emptyList())){
                if(!visited.contains(next)){
                    allRoutes(roads,next,target,path,visited,ans);
                }
            }
        }
        path.remove(path.size()-1);
        visited.remove(current);
    }
}
