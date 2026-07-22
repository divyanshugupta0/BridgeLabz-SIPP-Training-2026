package Backtracking;

import java.util.*;
public class NQueens{
    public List<List<String>> placeSensors(int n){
        List<List<String>> ans=new ArrayList<>();
        int[] col=new int[n];
        solve(n,0,col,ans);
        return ans;
    }
    private void solve(int n,int row,int[] col,List<List<String>> ans){
        if(row==n){ans.add(build(n,col));return;}
        for(int c=0;c<n;c++){
            if(safe(row,c,col)){
                col[row]=c;
                solve(n,row+1,col,ans);
            }
        }
    }
    private boolean safe(int row,int c,int[] col){
        for(int r=0;r<row;r++){
            if(col[r]==c) return false;
            if(Math.abs(col[r]-c)==Math.abs(r-row)) return false;
        }
        return true;
    }
    private List<String> build(int n,int[] col){
        List<String> b=new ArrayList<>();
        for(int r=0;r<n;r++){
            char[] ch=new char[n];
            Arrays.fill(ch,'.');
            ch[col[r]]='Q';
            b.add(new String(ch));
        }
        return b;
    }
}