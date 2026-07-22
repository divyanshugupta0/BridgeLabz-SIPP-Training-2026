package Graphs;

import java.util.*;

public class BFSShortestPath {
    public List<Integer> fewestFlights(Map<Integer,List<Integer>> routes,int origin,int destination){
        Queue<Integer> q=new LinkedList<>();
        Map<Integer,Integer> parent=new HashMap<>();
        Set<Integer> vis=new HashSet<>();
        q.offer(origin);
        vis.add(origin);
        parent.put(origin,null);
        while(!q.isEmpty()){
            int city=q.poll();
            if(city==destination) break;
            for(int next:routes.getOrDefault(city,Collections.emptyList())){
                if(vis.add(next)){
                    parent.put(next,city);
                    q.offer(next);
                }
            }
        }
        if(!vis.contains(destination)) return Collections.emptyList();
        LinkedList<Integer> path=new LinkedList<>();
        Integer cur=destination;
        while(cur!=null){
            path.addFirst(cur);
            cur=parent.get(cur);
        }
        return path;
    }
}
