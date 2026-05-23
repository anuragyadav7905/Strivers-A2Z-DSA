class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V=adj.size();
        
        boolean[] vis=new boolean[V];
        ArrayList<Integer> res=new ArrayList<>();
        
        dfsHelper(0,adj,vis,res);
        
        return res;
        
    }
    
    private void dfsHelper(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis, ArrayList<Integer> res){
        vis[node]=true;
        res.add(node);
        
        for(int n:adj.get(node)){
            if(!vis[n]){
                dfsHelper(n,adj,vis,res);
            }
        }
    }
}