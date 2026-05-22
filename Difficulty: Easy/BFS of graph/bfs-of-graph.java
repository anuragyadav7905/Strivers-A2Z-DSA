class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V=adj.size();
        
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] vis=new boolean[V];
        
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        vis[0]=true;
        
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            
            for(int n:adj.get(node)){
                if(!vis[n]){
                    vis[n]=true;
                    q.offer(n);
                }
                
            }
        }
        return bfs;
        
        
        
    }
}