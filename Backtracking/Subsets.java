package Backtracking;

import java.util.*;
public class Subsets{
    public List<List<String>> generateFlagCombinations(String[] flags){
        List<List<String>> ans=new ArrayList<>();
        backtrack(flags,0,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(String[] flags,int index,List<String> cur,List<List<String>> ans){
        if(index==flags.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(flags[index]);
        backtrack(flags,index+1,cur,ans);
        cur.remove(cur.size()-1);
        backtrack(flags,index+1,cur,ans);
    }
}