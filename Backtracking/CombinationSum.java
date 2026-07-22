package Backtracking;

import java.util.*;
public class CombinationSum{
    public List<List<Integer>> makeChange(int[] coins,int target){
        Arrays.sort(coins);
        List<List<Integer>> ans=new ArrayList<>();
        dfs(coins,target,0,0,new ArrayList<>(),ans);
        return ans;
    }
    private void dfs(int[] coins,int target,int start,int sum,List<Integer> path,List<List<Integer>> ans){
        if(sum==target){ans.add(new ArrayList<>(path));return;}
        for(int i=start;i<coins.length;i++){
            if(sum+coins[i]>target) break;
            path.add(coins[i]);
            dfs(coins,target,i,sum+coins[i],path,ans);
            path.remove(path.size()-1);
        }
    }
}