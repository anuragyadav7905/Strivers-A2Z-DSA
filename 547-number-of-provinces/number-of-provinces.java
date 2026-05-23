class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                vis[i]=true;
                dfs(i,isConnected,vis);
                count++;
            }
        }
        return count;
        
    }
    public void dfs(int node,int[][] isConnected,boolean[] vis ){
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[node][j]==1 && !vis[j]){
                vis[j] = true;
                dfs(j,isConnected,vis);

            }
        }
    }
}