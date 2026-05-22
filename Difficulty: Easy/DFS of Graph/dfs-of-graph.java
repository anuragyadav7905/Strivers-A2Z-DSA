class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V=adj.size();
        boolean[] vis=new boolean[V];
        ArrayList<Integer> dfs=new ArrayList<>();
        
        dfsHelper(0,adj,vis,dfs);
        return dfs;
    }
    
    
    
    
    
    private void dfsHelper(int node,ArrayList<ArrayList<Integer>> adj,boolean[]vis,ArrayList<Integer>dfs){
    vis[node]=true;
    dfs.add(node);
    
    for(int nb:adj.get(node)){
        if(!vis[nb]){
            dfsHelper(nb,adj,vis,dfs);
        }
    }
    }
}