class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        
        //build adjacency list
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e: edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        
        //visited 
        boolean[] vis=new boolean[V];
        
        //answer
        ArrayList<ArrayList<Integer>> result =new ArrayList<>();
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                ArrayList<Integer> component=new ArrayList<>();
                bfs(i,adj,vis,component);
                Collections.sort(component);
                result.add(component);
            }
        }
        return result;
    }
    
    
 private void bfs(int src, List<List<Integer>> adj,
                     boolean[] vis, ArrayList<Integer> component) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        vis[src] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            component.add(node);
            for (int nb : adj.get(node)) {
                if (!vis[nb]) {
                    vis[nb] = true;
                    q.offer(nb);
                }
            }
        }
    }
}