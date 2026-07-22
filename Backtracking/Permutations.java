package Backtracking;

import java.util.*;
public class Permutations{
    public List<List<String>> generateSchedules(String[] arr){
        List<List<String>> ans=new ArrayList<>();
        backtrack(arr,new boolean[arr.length],new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(String[] arr,boolean[] used,List<String> path,List<List<String>> ans){
        if(path.size()==arr.length){ans.add(new ArrayList<>(path));return;}
        for(int i=0;i<arr.length;i++){
            if(used[i]) continue;
            used[i]=true;
            path.add(arr[i]);
            backtrack(arr,used,path,ans);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}