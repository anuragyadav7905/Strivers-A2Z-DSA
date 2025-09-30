class Solution {
    private int timer = 1; // Global timer for discovery times

    private void dfs(int node, int parent, int[] vis, 
                     ArrayList<ArrayList<Integer>> adj, 
                     int[] tin, int[] low, 
                     List<List<Integer>> bridges) {

        vis[node] = 1;
        tin[node] = low[node] = timer++;
        
        for (Integer it : adj.get(node)) {
            if (it == parent) continue;  // Skip the edge to parent

            if (vis[it] == 0) {  // If neighbor not visited
                dfs(it, node, vis, adj, tin, low, bridges);
                low[node] = Math.min(low[node], low[it]);

                // Bridge condition
                if (low[it] > tin[node]) {
                    bridges.add(Arrays.asList(it, node));
                }
            } else {
                // Back edge case
                low[node] = Math.min(low[node], tin[it]);
            }
        }
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph (undirected)
        for (List<Integer> it : connections) {
            int u = it.get(0), v = it.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] vis = new int[n];
        int[] tin = new int[n];
        int[] low = new int[n];
        
        List<List<Integer>> bridges = new ArrayList<>();

        // DFS traversal from node 0
        dfs(0, -1, vis, adj, tin, low, bridges);

        return bridges;
    }
}
