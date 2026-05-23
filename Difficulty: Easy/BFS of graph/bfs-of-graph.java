class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V=adj.size();
        boolean[] vis=new boolean[V];
        ArrayList<Integer> bfs=new ArrayList<>();
        
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