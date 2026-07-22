package Backtracking;

public class WordSearch{
    public boolean exists(char[][] grid,String word){
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(dfs(grid,word,0,i,j,vis)) return true;
        return false;
    }
    private boolean dfs(char[][] g,String w,int idx,int r,int c,boolean[][] vis){
        if(idx==w.length()) return true;
        if(r<0||c<0||r>=g.length||c>=g[0].length) return false;
        if(vis[r][c]||g[r][c]!=w.charAt(idx)) return false;
        vis[r][c]=true;
        boolean f=dfs(g,w,idx+1,r+1,c,vis)||dfs(g,w,idx+1,r-1,c,vis)||dfs(g,w,idx+1,r,c+1,vis)||dfs(g,w,idx+1,r,c-1,vis);
        vis[r][c]=false;
        return f;
    }
}